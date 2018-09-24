package com.breeze.health.service.impl;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.breeze.health.beans.vo.Result;
import com.breeze.health.beans.vo.UserBaseInfoVo;
import com.breeze.health.beans.vo.UserVo;
import com.breeze.health.entity.User;
import com.breeze.health.entity.UserBaseInfo;
import com.breeze.health.entity.UserBaseInfoExample;
import com.breeze.health.entity.WexinAccount;
import com.breeze.health.entity.WexinAccountExample;
import com.breeze.health.mapper.UserBaseInfoMapper;
import com.breeze.health.mapper.UserMapper;
import com.breeze.health.mapper.WexinAccountMapper;
import com.breeze.health.service.UserService;
import com.breeze.health.util.BeanUtils;

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
				account.setStatus(1);
				account.setUpdateTime(now);
				wexinAccountMapper.updateByPrimaryKeySelective(account);
			}else
			{
				User user = new User();
				user.setCreateTime(now);
				user.setUpdateTime(now);
				userMapper.insert(user);
				WexinAccount account = new WexinAccount();
				account.setUserId(user.getId());
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
			List<WexinAccount> accounts = wexinAccountMapper.selectByExample(example);
			if (accounts!=null && accounts.size()>0)
			{
				WexinAccount account = accounts.get(0);
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
			List<UserBaseInfo> bases = userBaseInfoMapper.selectByExample(example);
			if (bases!= null && bases.size()>0)
			{
				UserBaseInfoVo vo = new UserBaseInfoVo();
				BeanUtils.copyProperties(bases.get(0), vo);
				ret.setSuccess(true);
				ret.setData(vo);
			}else
			{
				ret.setMessage("无用户信息");
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
			example.createCriteria().andOpenIdEqualTo(openId);
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

}
