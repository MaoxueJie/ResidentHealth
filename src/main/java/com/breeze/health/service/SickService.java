package com.breeze.health.service;

import com.breeze.health.beans.vo.Result;
import com.breeze.health.beans.vo.UserSickVo;

public interface SickService {
	public static String HIGHBLOODPRESSURE ="1";//高血压

	public static String CORONARYHEARTDISEASE = "2";//冠心病

	public static String HYPERLIPIDEMIA = "3";//高血脂

	public static String DIABETES = "4";//糖尿病

	public static String CEREBROVASCULARDISEASE = "5";//脑血管疾病

	public static String CHRONICGASTRITIS  = "6";//慢性胃炎

	public static String STOMACHULCER  = "7";//胃溃疡

	public static String BRONCHIALASTHMA  = "8";//支气管哮喘

	public static String COPD  = "9";//copd

	public static String OSTEOPOROSIS  = "10";//骨质疏松症

	public static String GLAUCOMA = "11";//青光眼

	public static String CATARACT = "12";//白内障

	public static String OTHERS = "13";//其他
	
	public Result<Void> addOrUpdateSick(UserSickVo vo);
	
	public Result<UserSickVo> getSick(Long userId);
}
