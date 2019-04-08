package com.breeze.health.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.breeze.health.beans.vo.Result;
import com.breeze.health.beans.vo.UserBaseInfoVo;
import com.breeze.health.beans.vo.UserVo;
import com.breeze.health.cache.SmsCache;
import com.breeze.health.config.SMSConfig;
import com.breeze.health.entity.User;
import com.breeze.health.entity.UserBaseInfo;
import com.breeze.health.entity.UserBaseInfoExample;
import com.breeze.health.entity.UserExample;
import com.breeze.health.entity.WexinAccount;
import com.breeze.health.entity.WexinAccountExample;
import com.breeze.health.mapper.UserBaseInfoMapper;
import com.breeze.health.mapper.UserMapper;
import com.breeze.health.mapper.WexinAccountMapper;
import com.breeze.health.service.UserService;
import com.breeze.health.util.BeanUtils;
import com.github.pagehelper.PageHelper;
import com.github.qcloudsms.SmsSingleSender;
import com.github.qcloudsms.SmsSingleSenderResult;

@Service("userService")
public class UserServiceImpl implements UserService{
	private static Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
	@Autowired
	UserMapper userMapper;
	
	@Autowired
	UserBaseInfoMapper userBaseInfoMapper;
	
	@Autowired
	WexinAccountMapper wexinAccountMapper;
	
	
	@Override
	public Result<Void> bindWexin(String openId) {
		Result<Void> ret = new Result<Void>();
		try{
			Date now = new Date();
			WexinAccountExample example = new WexinAccountExample();
			example.createCriteria().andOpenIdEqualTo(openId);
			List<WexinAccount> accounts = wexinAccountMapper.selectByExample(example);
			if (accounts!=null && accounts.size()>0)
			{
				WexinAccount account = accounts.get(0);
				if (account.getStatus()==0)
				{
					account.setStatus(1);
					account.setUpdateTime(now);
					wexinAccountMapper.updateByPrimaryKeySelective(account);
				}
			}else
			{
				//User user = new User();
				//user.setCreateTime(now);
				//user.setUpdateTime(now);
				//userMapper.insert(user);
				WexinAccount account = new WexinAccount();
				//account.setUserId(user.getId());
				account.setStatus(1);
				account.setOpenId(openId);
				account.setCreateTime(now);
				account.setUpdateTime(now);
				wexinAccountMapper.insert(account);
			}
			ret.setSuccess(true);
		}catch(Exception e)
		{
			logger.error("绑定微信异常", e);
			ret.setMessage("绑定微信失败");
		}
		return ret;
	}

	@Override
	public Result<Void> unbindWexin(String openId) {
		Result<Void> ret = new Result<Void>();
		try{
			Date now = new Date();
			WexinAccountExample example = new WexinAccountExample();
			example.createCriteria().andOpenIdEqualTo(openId);
			example.setOrderByClause(" id desc");
			PageHelper.startPage(1, 1);
			List accounts = wexinAccountMapper.selectByExample(example);
			if (accounts!=null && accounts.size()>0)
			{
				WexinAccount account = (WexinAccount)accounts.get(0);
				account.setStatus(0);
				account.setUpdateTime(now);
				wexinAccountMapper.updateByPrimaryKeySelective(account);
			}
			ret.setSuccess(true);
		}catch(Exception e)
		{
			logger.error("解绑微信异常", e);
			ret.setMessage("解绑微信失败");
		}
		return ret;
	}

	@Override
	public Result<Void> addOrUpdateBaseInfo(UserBaseInfoVo vo) {
		Result<Void> ret = new Result<Void>();
		try{
			Date now = new Date();
			UserBaseInfo baseInfo = new UserBaseInfo();
			BeanUtils.copyProperties(vo, baseInfo);
			if (vo.getFamilyDesc()!=null)
				baseInfo.setFamilyDesc(StringUtils.join(vo.getFamilyDesc(),","));
			if (vo.getMedicalPayWay()!=null)
				baseInfo.setMedicalPayWay(StringUtils.join(vo.getMedicalPayWay(),","));
			if (baseInfo.getId()!=null)
			{
				baseInfo.setUpdateTime(now);
				userBaseInfoMapper.updateByPrimaryKeySelective(baseInfo);
			}else
			{
				baseInfo.setCreateTime(now);
				baseInfo.setUpdateTime(now);
				userBaseInfoMapper.insert(baseInfo);
			}
			ret.setSuccess(true);
			ret.setMessage("提交成功");
		}catch(Exception e)
		{
			logger.error("添加或更新基本信息异常", e);
			ret.setMessage("更新基本信息失败");
		}
		return ret;
	}

	@Override
	public Result<UserBaseInfoVo> getBaseInfo(Long userId) {
		Result<UserBaseInfoVo> ret = new Result<UserBaseInfoVo>();
		try{
			UserBaseInfoExample example = new UserBaseInfoExample();
			example.createCriteria().andUserIdEqualTo(userId);
			example.setOrderByClause(" id desc");
			PageHelper.startPage(1, 1);
			List bases = userBaseInfoMapper.selectByExample(example);
			if (bases!= null && bases.size()>0)
			{
				UserBaseInfoVo vo = new UserBaseInfoVo();
				BeanUtils.copyProperties(bases.get(0), vo);
				if (((UserBaseInfo)bases.get(0)).getFamilyDesc()!=null)
				{
					vo.setFamilyDesc(((UserBaseInfo)bases.get(0)).getFamilyDesc().split(","));
				}
				if (((UserBaseInfo)bases.get(0)).getMedicalPayWay()!=null)
				{
					vo.setMedicalPayWay(((UserBaseInfo)bases.get(0)).getMedicalPayWay().split(","));
				}
				ret.setSuccess(true);
				ret.setData(vo);
			}else
			{
				ret.setSuccess(true);
			}
		}catch(Exception e)
		{
			logger.error("添加或更新基本信息异常", e);
			ret.setMessage("获取基本信息失败");
		}
		return ret;
	}

	@Override
	public Result<UserVo> getUserByOpenId(String openId) {
		Result<UserVo> ret = new Result<UserVo>();
		try{
			WexinAccountExample example = new WexinAccountExample();
			example.createCriteria().andOpenIdEqualTo(openId).andStatusEqualTo(1);
			List<WexinAccount> accounts = wexinAccountMapper.selectByExample(example);
			if (accounts!=null && accounts.size()>0)
			{
				WexinAccount account = accounts.get(0);
				User user = userMapper.selectByPrimaryKey(account.getUserId());
				if (user!=null)
				{
					UserVo vo = new UserVo();
					BeanUtils.copyProperties(user, vo);
					ret.setSuccess(true);
					ret.setData(vo);
				}else
				{
					ret.setMessage("用户不存在");
				}
			}else
			{
				ret.setMessage("用户不存在");
			}
		}catch(Exception e)
		{
			logger.error("获取用户异常", e);
			ret.setMessage("获取用户异常");
		}
		return ret;
	}

	@Override
	public Result<UserVo> loginOrRegister(String mobile, String verificationCode,String openid) {
		Result<UserVo> ret = new Result<UserVo>();
		try{
			if (StringUtils.isBlank(mobile))
			{
				ret.setSuccess(false);
				ret.setMessage("请输入手机号码");
				return ret;
			}
			mobile = mobile.trim();
			String code = SmsCache.get(mobile);
			if (code==null || verificationCode==null || !code.equals(verificationCode))
			{
				ret.setSuccess(false);
				ret.setMessage("验证码不通过");
				return ret;
			}
			
			Date now = new Date();
			
			UserExample example = new UserExample();
			example.createCriteria().andMobileEqualTo(mobile);
			List<User> users = userMapper.selectByExample(example);
			if (users!=null && users.size()>0)
			{
				UserVo vo = new UserVo();
				BeanUtils.copyProperties(users.get(0), vo);
				ret.setSuccess(true);
				ret.setData(vo);
			}else
			{
				
				User user = new User();
				user.setMobile(mobile);
				user.setCreateTime(now);
				user.setUpdateTime(now);
				userMapper.insertSelective(user);
				
				UserVo vo = new UserVo();
				BeanUtils.copyProperties(user, vo);
				ret.setSuccess(true);
				ret.setData(vo);
			}
			if (ret.isSuccess())
			{
				try{
					if (openid!=null)
					{
						WexinAccountExample wxaexample = new WexinAccountExample();
						wxaexample.createCriteria().andOpenIdEqualTo(openid);
						List<WexinAccount> accounts = wexinAccountMapper.selectByExample(wxaexample);
						if (accounts!=null && accounts.size()>0)
						{
							WexinAccount account = accounts.get(0);
							account.setStatus(1);
							account.setUpdateTime(now);
							account.setUserId(ret.getData().getId());
							wexinAccountMapper.updateByPrimaryKeySelective(account);
						}
					}
				}catch(Exception e)
				{
					
				}
			}
			
		}catch(Exception e)
		{
			logger.error("登陆或注册异常", e);
			ret.setMessage("登陆或注册失败");
		}
		return ret;
	}

	@Override
	public Result<String> sendVertificationCode(String mobile) {
		Result<String> ret = new Result<String>();
		try{
			if (StringUtils.isBlank(mobile))
			{
				ret.setSuccess(false);
				ret.setMessage("请输入手机号码");
				return ret;
			}
			mobile = mobile.trim();
			
			String code = generateSmsCode();
			//发送验证码
			String[] params = {code};//数组具体的元素个数和模板中变量个数必须一致，例如事例中templateId:5678对应一个变量，参数数组中元素个数也必须是一个
		    SmsSingleSender ssender = new SmsSingleSender(SMSConfig.getAppid(), SMSConfig.getAppkey());
		    SmsSingleSenderResult result = ssender.sendWithParam("86", mobile,
		    		215054, params, "居民e健康", "", "");
		    if (result.result==0)
		    {
				SmsCache.put(mobile, code);
				//ret.setData(code);
				ret.setSuccess(true);
		    }else
		    {
		    	ret.setSuccess(false);
		    	ret.setMessage("验证码发送失败");
		    }	
		}catch(Exception e)
		{
			logger.error("发送验证码异常", e);
			ret.setMessage("发送验证码失败");
		}
		return ret;
	}

	@Override
	public Result<UserVo> getUserById(Long userId) {
		Result<UserVo> ret = new Result<UserVo>();
		try{
			User user = userMapper.selectByPrimaryKey(userId);
			if (user!=null)
			{
				UserVo vo = new UserVo();
				BeanUtils.copyProperties(user, vo);
				ret.setSuccess(true);
				ret.setData(vo);
			}else
			{
				ret.setSuccess(false);
				ret.setMessage("没有此用户");
			}
		}catch(Exception e)
		{
			logger.error("获取用户异常", e);
			ret.setMessage("获取用户失败");
		}
		return ret;
	}
	
	private String generateSmsCode()
	{
		return (int)((Math.random()*9+1)*100000) + "";	
	}

}
