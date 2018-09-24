package com.breeze.health.service;

import com.breeze.health.beans.vo.Result;
import com.breeze.health.entity.UserLivingHabit;
import com.breeze.health.entity.UserLivingMeal;
import com.breeze.health.entity.UserLivingMovement;
import com.breeze.health.entity.UserPhysiological;

/**
 * @author created by <a href="mailto:chenboning@gomeholdings.com">陈波宁</a>
 * @date 2018/9/24
 */

public interface LivingService {

    Result<String> addLivingHabit(UserLivingHabit habit);
    Result<UserLivingHabit> getLivingHabit(UserLivingHabit habit);
    Result<String> addLivingMovement(UserLivingMovement movement);
    Result<UserLivingMovement> getUserLivingMovement(UserLivingMovement movement);
    Result<String> addUserLivingMeal(UserLivingMeal meal);
    Result<UserLivingMeal> getUserLivingMeal(UserLivingMeal meal);
    Result<String> addUserPhysiological(UserPhysiological physiological);
    Result<UserPhysiological> getUserPhysiological(UserPhysiological physiological);
}
