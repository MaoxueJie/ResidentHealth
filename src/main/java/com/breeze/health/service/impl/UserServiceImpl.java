package com.breeze.health.service.impl;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.breeze.health.beans.vo.Result;
import com.breeze.health.entity.User;
import com.breeze.health.entity.WexinAccount;
import com.breeze.health.entity.WexinAccountExample;
import com.breeze.health.mapper.UserMapper;
import com.breeze.health.mapper.WexinAccountMapper;
import com.breeze.health.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{
	private static Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
	@Autowired
	UserMapper userMapper;
	
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

}
