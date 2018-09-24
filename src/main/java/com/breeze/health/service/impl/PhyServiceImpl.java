package com.breeze.health.service.impl;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.breeze.health.beans.vo.Result;
import com.breeze.health.beans.vo.UserPhysiologicalVo;
import com.breeze.health.entity.UserPhysiological;
import com.breeze.health.entity.UserPhysiologicalExample;
import com.breeze.health.mapper.UserPhysiologicalMapper;
import com.breeze.health.service.PhyService;
import com.breeze.health.util.BeanUtils;

@Service("phyService")
public class PhyServiceImpl implements PhyService{
	private static Logger logger = LoggerFactory.getLogger(PhyServiceImpl.class);
	@Autowired
	UserPhysiologicalMapper userPhysiologicalMapper;
	
	@Override
	public Result<Void> addOrUpdatePhy(UserPhysiologicalVo vo) {
		Result<Void> ret = new Result<Void>();
		try{
			Date now = new Date();
			UserPhysiological phy = new UserPhysiological();
			BeanUtils.copyProperties(vo, phy);
			if (phy.getId()!=null)
			{
				phy.setUpdateTime(now);
				userPhysiologicalMapper.updateByPrimaryKeySelective(phy);
			}else
			{
				phy.setCreateTime(now);
				phy.setUpdateTime(now);
				userPhysiologicalMapper.insert(phy);
			}
			ret.setSuccess(true);
		}catch(Exception e)
		{
			logger.error("添加或更生理指标异常", e);
			ret.setMessage("更新生理指标失败");
		}
		return ret;
	}

	@Override
	public Result<UserPhysiologicalVo> getPhy(Long userId) {
		Result<UserPhysiologicalVo> ret = new Result<UserPhysiologicalVo>();
		try{
			UserPhysiologicalExample example = new UserPhysiologicalExample();
			example.createCriteria().andUserIdEqualTo(userId);
			List<UserPhysiological> phys = userPhysiologicalMapper.selectByExample(example);
			if (phys!= null && phys.size()>0)
			{
				UserPhysiologicalVo vo = new UserPhysiologicalVo();
				BeanUtils.copyProperties(phys.get(0), vo);
				ret.setSuccess(true);
				ret.setData(vo);
			}else
			{
				ret.setMessage("无生理指标");
			}
		}catch(Exception e)
		{
			logger.error("获取生理指标异常", e);
			ret.setMessage("获取生理指标失败");
		}
		return ret;
	}

}
