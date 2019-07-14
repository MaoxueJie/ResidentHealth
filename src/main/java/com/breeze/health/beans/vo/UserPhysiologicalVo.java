package com.breeze.health.beans.vo;

import java.text.DecimalFormat;
import java.util.Date;

public class UserPhysiologicalVo {
	private Long id;

    private Long userId;

    private Float height;

    private Float weight;

    private Float abdominalCircumference;

    private Float hipCircumference;

    private Integer heartRate;

    private Integer breatheRate;

    private Float temperature;

    private Integer bloodPressure;

    private Integer bloodPressureSituation;

    private Float bloodPressureVal1;

    private Float bloodPressureVal2;

    private Float bloodPressureVal3;

    private Float bloodPressureVal4;

    private Float bloodPressureVal5;

    private Float bloodPressureVal6;

    private Integer bloodSugar;

    private Integer bloodSugarSituation;

    private Float bloodSugarVal1;

    private Float bloodSugarVal2;
    
    private Float bloodSugarVal3;

    private Float bloodSugarVal4;

    private Integer bloodLipid;

    private Integer bloodLipidSituation;

    private Float bloodLipidVal1;

    private Float bloodLipidVal2;

    private Float bloodLipidVal3;

    private Float bloodLipidVal4;

    private Integer uricAcid;

    private Integer uricAcidSituation;

    private Float uricAcidVal;

    private Integer bloodOxygen;

    private Integer bloodOxygenSituation;

    private Float bloodOxygenVal;
    
    private String resultTitle;
    
    private String resultMsg;

    private Date createTime;

    private Date updateTime;
    
    private String dateStr;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getHeightStr() {
		if (height==null)
			return "未填写";
		return formatInteger(height) +"cm";
	}
	
	public Float getHeight() {
		return height;
	}

	public void setHeight(Float height) {
		this.height = height;
	}

	public String getWeightStr() {
		if (weight==null)
			return "未填写";
		return formatInteger(weight) +"kg";
	}
	
	public Float getWeight() {
		return weight;
	}

	public void setWeight(Float weight) {
		this.weight = weight;
	}
	
	public String getBMIStr() {
		if (this.height!=null && this.weight!=null)
		{
			if (height!=0f)
			{
				Float bmi = weight/((height/100)*(height/100));
				return formatFloat(bmi)+"kg/㎡";
			}else
			{
				return "无法计算";
			}
		}else
			return "无法计算";
	}
	
	
	public String getAbdominalCircumferenceStr() {
		if (abdominalCircumference==null)
			return "未填写";
		return formatInteger(abdominalCircumference) +"cm";
	}


	public Float getAbdominalCircumference() {
		return abdominalCircumference;
	}

	public void setAbdominalCircumference(Float abdominalCircumference) {
		this.abdominalCircumference = abdominalCircumference;
	}
	
	public String getHipCircumferenceStr() {
		if (hipCircumference==null)
			return "未填写";
		return formatInteger(hipCircumference) +"cm";
	}
	
	public String getWHRStr() {
		if (this.abdominalCircumference!=null && this.hipCircumference!=null)
		{
			if (hipCircumference!=0f)
			{
				Float whr = abdominalCircumference/(hipCircumference);
				return formatFloat(whr);
			}else
			{
				return "无法计算";
			}
		}else
			return "无法计算";
	}

	public Float getHipCircumference() {
		return hipCircumference;
	}

	public void setHipCircumference(Float hipCircumference) {
		this.hipCircumference = hipCircumference;
	}

	public String getHeartRateStr() {
		if (heartRate==null)
			return "未填写";
		return heartRate +"次/分钟";
	}
	
	public Integer getHeartRate() {
		return this.heartRate;
	}

	public void setHeartRate(Integer heartRate) {
		this.heartRate = heartRate;
	}

	public String getBreatheRateStr() {
		if (breatheRate==null)
			return "未填写";
		return breatheRate +"次/分钟";
	}
	
	public Integer getBreatheRate() {
		return breatheRate;
	}

	public void setBreatheRate(Integer breatheRate) {
		this.breatheRate = breatheRate;
	}

	
	
	public String getTemperatureStr() {
		if (temperature==null)
			return "未填写";
		return formatInteger(temperature) +"℃ ";
	}
	
	public Float getTemperature() {
		return temperature;
	}

	public void setTemperature(Float temperature) {
		this.temperature = temperature;
	}
	
	public String getBloodPressureStr() {
		if (bloodPressure==null)
			return "未填写";
		if (bloodPressure==1)
			return "从未测过";
		if (bloodPressure==2)
			return "曾经测过";
		if (bloodPressure==3)
			return "经常监测";
		return "未知";
	}

	public Integer getBloodPressure() {
		return bloodPressure;
	}

	public void setBloodPressure(Integer bloodPressure) {
		this.bloodPressure = bloodPressure;
	}
	
	public String getBloodPressureSituationStr() {
		if (bloodPressureSituation==null)
			return "未填写";
		if (bloodPressureSituation==1)
			return "正常";
		if (bloodPressureSituation==2)
			return "过高";
		if (bloodPressureSituation==3)
			return "过低";
		if (bloodPressureSituation==4)
			return "不清楚";
		return "未知";
	}

	public Integer getBloodPressureSituation() {
		return bloodPressureSituation;
	}

	public void setBloodPressureSituation(Integer bloodPressureSituation) {
		this.bloodPressureSituation = bloodPressureSituation;
	}
	
	public String getBloodPressureValStr() {
		if (bloodPressureVal5!=null && bloodPressureVal6!=null)
		{
			return "最近一次血压为"+formatInteger(bloodPressureVal5) + "/" + formatInteger(bloodPressureVal5) +"mmHg";
		}
		return "";
	}

	public Float getBloodPressureVal1() {
		return bloodPressureVal1;
	}

	public void setBloodPressureVal1(Float bloodPressureVal1) {
		this.bloodPressureVal1 = bloodPressureVal1;
	}

	public Float getBloodPressureVal2() {
		return bloodPressureVal2;
	}

	public void setBloodPressureVal2(Float bloodPressureVal2) {
		this.bloodPressureVal2 = bloodPressureVal2;
	}

	public Float getBloodPressureVal3() {
		return bloodPressureVal3;
	}

	public void setBloodPressureVal3(Float bloodPressureVal3) {
		this.bloodPressureVal3 = bloodPressureVal3;
	}

	public Float getBloodPressureVal4() {
		return bloodPressureVal4;
	}

	public void setBloodPressureVal4(Float bloodPressureVal4) {
		this.bloodPressureVal4 = bloodPressureVal4;
	}

	public Float getBloodPressureVal5() {
		return bloodPressureVal5;
	}

	public void setBloodPressureVal5(Float bloodPressureVal5) {
		this.bloodPressureVal5 = bloodPressureVal5;
	}

	public Float getBloodPressureVal6() {
		return bloodPressureVal6;
	}

	public void setBloodPressureVal6(Float bloodPressureVal6) {
		this.bloodPressureVal6 = bloodPressureVal6;
	}
	
	public String getBloodSugarStr() {
		if (bloodSugar==null)
			return "未填写";
		if (bloodSugar==1)
			return "从未测过";
		if (bloodSugar==2)
			return "曾经测过";
		if (bloodSugar==3)
			return "经常监测";
		return "未知";
	}

	public Integer getBloodSugar() {
		return bloodSugar;
	}

	public void setBloodSugar(Integer bloodSugar) {
		this.bloodSugar = bloodSugar;
	}
	
	public String getBloodSugarSituationStr() {
		if (bloodSugarSituation==null)
			return "未填写";
		if (bloodSugarSituation==1)
			return "正常";
		if (bloodSugarSituation==2)
			return "过高";
		if (bloodSugarSituation==3)
			return "过低";
		if (bloodSugarSituation==4)
			return "不清楚";
		return "未知";
	}
	
	public Integer getBloodSugarSituation() {
		return bloodSugarSituation;
	}

	public void setBloodSugarSituation(Integer bloodSugarSituation) {
		this.bloodSugarSituation = bloodSugarSituation;
	}
	
	public String getBloodSugarValStr() {
		String bloodSugarValStr = "";
		if (bloodSugarVal1!=null) {
			bloodSugarValStr += "空腹血糖:" + formatFloat(bloodSugarVal1) + "mmol/L";
		}
		if (bloodSugarVal3!=null) {
			if (!"".equals(bloodSugarValStr))
				bloodSugarValStr+=",\r\n";
			bloodSugarValStr += "餐后2小时血糖:" + formatFloat(bloodSugarVal3) + "mmol/L";
		}
		if (bloodSugarVal4!=null) {
			if (!"".equals(bloodSugarValStr))
				bloodSugarValStr+=",\r\n";
			bloodSugarValStr += "随机血糖:" + formatFloat(bloodSugarVal4) + "mmol/L";
		}
		if (bloodSugarVal2!=null) {
			if (!"".equals(bloodSugarValStr))
				bloodSugarValStr+=",\r\n";
			bloodSugarValStr += "糖化血红蛋白:" + formatFloat(bloodSugarVal2) + "%";
		}
		return bloodSugarValStr;
	}

	public Float getBloodSugarVal1() {
		return bloodSugarVal1;
	}

	public void setBloodSugarVal1(Float bloodSugarVal1) {
		this.bloodSugarVal1 = bloodSugarVal1;
	}

	public Float getBloodSugarVal2() {
		return bloodSugarVal2;
	}

	public void setBloodSugarVal2(Float bloodSugarVal2) {
		this.bloodSugarVal2 = bloodSugarVal2;
	}
	
	public String getBloodLipidStr() {
		if (bloodLipid==null)
			return "未填写";
		if (bloodLipid==1)
			return "从未测过";
		if (bloodLipid==2)
			return "曾经测过";
		if (bloodLipid==3)
			return "经常监测";
		return "未知";
	}

	public Integer getBloodLipid() {
		return bloodLipid;
	}

	public void setBloodLipid(Integer bloodLipid) {
		this.bloodLipid = bloodLipid;
	}
	
	public String getBloodLipidSituationStr() {
		if (bloodLipidSituation==null)
			return "未填写";
		if (bloodLipidSituation==1)
			return "正常";
		if (bloodLipidSituation==2)
			return "过高";
		if (bloodLipidSituation==3)
			return "过低";
		if (bloodLipidSituation==4)
			return "不清楚";
		return "未知";
	}

	public Integer getBloodLipidSituation() {
		return bloodLipidSituation;
	}

	public void setBloodLipidSituation(Integer bloodLipidSituation) {
		this.bloodLipidSituation = bloodLipidSituation;
	}
	public String getBloodLipidValStr() {
		String bloodLipidValStr = "";
		if (bloodLipidVal1!=null) {
			bloodLipidValStr += "总胆固醇(TC):" + formatFloat(bloodLipidVal1) + "mmol/L";
		}
		if (bloodLipidVal2!=null) {
			if (!"".equals(bloodLipidValStr))
				bloodLipidValStr+=",\r\n";
			bloodLipidValStr += "甘油三酯(TG):" + formatFloat(bloodLipidVal2) + "mmol/L";
		}
		if (bloodLipidVal3!=null) {
			if (!"".equals(bloodLipidValStr))
				bloodLipidValStr+=",\r\n";
			bloodLipidValStr += "高密度脂蛋白胆固醇(HDL-C):" + formatFloat(bloodLipidVal3) + "mmol/L";
		}
		if (bloodLipidVal4!=null) {
			if (!"".equals(bloodLipidValStr))
				bloodLipidValStr+=",\r\n";
			bloodLipidValStr += "低密度脂蛋白胆固醇(LDL-C):" + formatFloat(bloodLipidVal4) + "mmol/L";
		}
		return bloodLipidValStr;
	}

	public Float getBloodLipidVal1() {
		return bloodLipidVal1;
	}

	public void setBloodLipidVal1(Float bloodLipidVal1) {
		this.bloodLipidVal1 = bloodLipidVal1;
	}

	public Float getBloodLipidVal2() {
		return bloodLipidVal2;
	}

	public void setBloodLipidVal2(Float bloodLipidVal2) {
		this.bloodLipidVal2 = bloodLipidVal2;
	}

	public Float getBloodLipidVal3() {
		return bloodLipidVal3;
	}

	public void setBloodLipidVal3(Float bloodLipidVal3) {
		this.bloodLipidVal3 = bloodLipidVal3;
	}

	public Float getBloodLipidVal4() {
		return bloodLipidVal4;
	}

	public void setBloodLipidVal4(Float bloodLipidVal4) {
		this.bloodLipidVal4 = bloodLipidVal4;
	}

	public String getUricAcidStr() {
		if (uricAcid==null)
			return "未填写";
		if (uricAcid==1)
			return "从未测过";
		if (uricAcid==2)
			return "曾经测过";
		if (uricAcid==3)
			return "经常监测";
		return "未知";
	}
	
	public Integer getUricAcid() {
		return uricAcid;
	}

	public void setUricAcid(Integer uricAcid) {
		this.uricAcid = uricAcid;
	}
	
	public String getUricAcidSituationStr() {
		if (uricAcidSituation==null)
			return "未填写";
		if (uricAcidSituation==1)
			return "正常";
		if (uricAcidSituation==2)
			return "过高";
		if (uricAcidSituation==3)
			return "过低";
		if (uricAcidSituation==4)
			return "不清楚";
		return "未知";
	}

	public Integer getUricAcidSituation() {
		return uricAcidSituation;
	}

	public void setUricAcidSituation(Integer uricAcidSituation) {
		this.uricAcidSituation = uricAcidSituation;
	}
	
	public String getUricAcidValStr() {
		if (uricAcidVal==null)
			return "未填写";
		return formatFloat(uricAcidVal)+"μmol/L";
	}

	public Float getUricAcidVal() {
		return uricAcidVal;
	}

	public void setUricAcidVal(Float uricAcidVal) {
		this.uricAcidVal = uricAcidVal;
	}
	
	public String getBloodOxygenStr() {
		if (bloodOxygen==null)
			return "未填写";
		if (bloodOxygen==1)
			return "从未测过";
		if (bloodOxygen==2)
			return "曾经测过";
		if (bloodOxygen==3)
			return "经常监测";
		return "未知";
	}

	public Integer getBloodOxygen() {
		return bloodOxygen;
	}

	public void setBloodOxygen(Integer bloodOxygen) {
		this.bloodOxygen = bloodOxygen;
	}
	
	public String getBloodOxygenSituationStr() {
		if (bloodOxygenSituation==null)
			return "未填写";
		if (bloodOxygenSituation==1)
			return "正常";
		if (bloodOxygenSituation==2)
			return "过高";
		if (bloodOxygenSituation==3)
			return "过低";
		if (bloodOxygenSituation==4)
			return "不清楚";
		return "未知";
	}

	public Integer getBloodOxygenSituation() {
		return bloodOxygenSituation;
	}

	public void setBloodOxygenSituation(Integer bloodOxygenSituation) {
		this.bloodOxygenSituation = bloodOxygenSituation;
	}
	
	public String getBloodOxygenValStr() {
		if (bloodOxygenVal==null)
			return "未填写";
		return formatFloat(bloodOxygenVal)+"%";
	}

	public Float getBloodOxygenVal() {
		return bloodOxygenVal;
	}

	public void setBloodOxygenVal(Float bloodOxygenVal) {
		this.bloodOxygenVal = bloodOxygenVal;
	}

	public String getResultTitle() {
		return resultTitle;
	}

	public void setResultTitle(String resultTitle) {
		this.resultTitle = resultTitle;
	}

	public String getResultMsg() {
		return resultMsg;
	}

	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Float getBloodSugarVal3() {
		return bloodSugarVal3;
	}

	public void setBloodSugarVal3(Float bloodSugarVal3) {
		this.bloodSugarVal3 = bloodSugarVal3;
	}

	public Float getBloodSugarVal4() {
		return bloodSugarVal4;
	}

	public void setBloodSugarVal4(Float bloodSugarVal4) {
		this.bloodSugarVal4 = bloodSugarVal4;
	}

	private static DecimalFormat float_formatter = new DecimalFormat("###.#");
	private static String formatFloat(Float year) {
		if (year == null)
			return "";
		return float_formatter.format(year);
	}
	private static DecimalFormat integer_formatter = new DecimalFormat("####");
	private static String formatInteger(Float zhi) {
		if (zhi == null)
			return "";
		return integer_formatter.format(zhi);
	}

	public String getDateStr() {
		return dateStr;
	}

	public void setDateStr(String dateStr) {
		this.dateStr = dateStr;
	}
	
}
