package com.breeze.health.service;

import com.breeze.health.beans.vo.Result;
import com.breeze.health.beans.vo.UserLivingVo;

/**
 * @author created by <a href="mailto:chenboning@gomeholdings.com">陈波宁</a>
 * @date 2018/9/24
 */

public interface LivingService {

    Result<Void> addOrUpdateLiving(UserLivingVo vo);
    Result<UserLivingVo> getLiving(Long userId);
}
