package com.breeze.health.beans.vo;

import java.text.DecimalFormat;
import java.util.Date;

import org.apache.commons.lang.StringUtils;

public class UserSickVo {
	private Long id;

    private Long userId;

    private String[] sicks;

    private Integer highBloodPressureYears;

    private Integer coronaryHeartDiseaseYears;

    private Integer hyperlipidemiaYears;

    private Integer diabetesYears;

    private Integer cerebrovascularDiseaseYears;

    private Integer chronicGastritisYears;

    private Integer stomachUlcerYears;

    private Integer bronchialAsthmaYears;

    private Integer copdYears;

    private Integer osteoporosisYears;

    private Integer glaucomaYears;

    private Integer cataractYears;

    private String others;
    
    private Integer othersYears;

    private String[] drugs;

    private String antihypertensiveDrugName;

    private String lipidLoweringDrugName;

    private String hypoglycemicAgentsName;

    private String antiplateletDrugName;
    
    private String othersDrugName;

    private String highBloodPressureHistory;

    private String diabetesHistory;

    private String coronaryHeartDiseaseHistory;

    private String cerebralApoplexyHistory;

    private Date createTime;

    private Date updateTime;
    
    private String resultTitle;
    
    private String resultMsg;


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
	
	public String getSicksStr() {
		if (sicks==null || sicks.length==0) {
			return "未填写";
		}
		String sicksStr = "";
		for(String sick:sicks) {
			if (!"".equals(sicksStr))
				sicksStr += ",";
			if ("1".equals(sick))
				sicksStr+="高血压" + (highBloodPressureYears==null?"":("("+highBloodPressureYears+"年)"));
			if ("2".equals(sick))
				sicksStr+="冠心病" + (coronaryHeartDiseaseYears==null?"":("("+coronaryHeartDiseaseYears+"年)"));
			if ("3".equals(sick))
				sicksStr+="高脂血症" + (hyperlipidemiaYears==null?"":("("+hyperlipidemiaYears+"年)"));
			if ("4".equals(sick))
				sicksStr+="糖尿病" + (diabetesYears==null?"":("("+diabetesYears+"年)"));
			if ("5".equals(sick))
				sicksStr+="脑血管疾病" + (cerebrovascularDiseaseYears==null?"":("("+cerebrovascularDiseaseYears+"年)"));
			if ("6".equals(sick))
				sicksStr+="慢性胃炎" + (chronicGastritisYears==null?"":("("+chronicGastritisYears+"年)"));
			if ("7".equals(sick))
				sicksStr+="胃溃疡" + (stomachUlcerYears==null?"":("("+stomachUlcerYears+"年)"));
			if ("8".equals(sick))
				sicksStr+="支气管哮喘" + (bronchialAsthmaYears==null?"":("("+bronchialAsthmaYears+"年)"));
			if ("9".equals(sick))
				sicksStr+="慢性阻塞性肺疾病（COPD）"+ (copdYears==null?"":("("+copdYears+"年)"));
			if ("10".equals(sick))
				sicksStr+="骨质疏松症"+ (osteoporosisYears==null?"":("("+osteoporosisYears+"年)"));
			if ("11".equals(sick))
				sicksStr+="青光眼" + (glaucomaYears==null?"":("("+glaucomaYears+"年)"));
			if ("12".equals(sick))
				sicksStr+="白内障"+ (cataractYears==null?"":("("+cataractYears+"年)"));
			if ("13".equals(sick))
				sicksStr+="其他:" + (others==null?"":others) + (othersYears==null?"":("("+othersYears+"年)"));
			if ("14".equals(sick))
				sicksStr+="无";
		}
		return sicksStr;
	}

	public String[] getSicks() {
		return sicks;
	}

	public void setSicks(String[] sicks) {
		this.sicks = sicks;
	}

	public Integer getHighBloodPressureYears() {
		return highBloodPressureYears;
	}

	public void setHighBloodPressureYears(Integer highBloodPressureYears) {
		this.highBloodPressureYears = highBloodPressureYears;
	}

	public Integer getCoronaryHeartDiseaseYears() {
		return coronaryHeartDiseaseYears;
	}

	public void setCoronaryHeartDiseaseYears(Integer coronaryHeartDiseaseYears) {
		this.coronaryHeartDiseaseYears = coronaryHeartDiseaseYears;
	}

	public Integer getHyperlipidemiaYears() {
		return hyperlipidemiaYears;
	}

	public void setHyperlipidemiaYears(Integer hyperlipidemiaYears) {
		this.hyperlipidemiaYears = hyperlipidemiaYears;
	}

	public Integer getDiabetesYears() {
		return diabetesYears;
	}

	public void setDiabetesYears(Integer diabetesYears) {
		this.diabetesYears = diabetesYears;
	}

	public Integer getCerebrovascularDiseaseYears() {
		return cerebrovascularDiseaseYears;
	}

	public void setCerebrovascularDiseaseYears(Integer cerebrovascularDiseaseYears) {
		this.cerebrovascularDiseaseYears = cerebrovascularDiseaseYears;
	}

	public Integer getChronicGastritisYears() {
		return chronicGastritisYears;
	}

	public void setChronicGastritisYears(Integer chronicGastritisYears) {
		this.chronicGastritisYears = chronicGastritisYears;
	}

	public Integer getStomachUlcerYears() {
		return stomachUlcerYears;
	}

	public void setStomachUlcerYears(Integer stomachUlcerYears) {
		this.stomachUlcerYears = stomachUlcerYears;
	}

	public Integer getBronchialAsthmaYears() {
		return bronchialAsthmaYears;
	}

	public void setBronchialAsthmaYears(Integer bronchialAsthmaYears) {
		this.bronchialAsthmaYears = bronchialAsthmaYears;
	}

	public Integer getCopdYears() {
		return copdYears;
	}

	public void setCopdYears(Integer copdYears) {
		this.copdYears = copdYears;
	}

	public Integer getOsteoporosisYears() {
		return osteoporosisYears;
	}

	public void setOsteoporosisYears(Integer osteoporosisYears) {
		this.osteoporosisYears = osteoporosisYears;
	}

	public Integer getGlaucomaYears() {
		return glaucomaYears;
	}

	public void setGlaucomaYears(Integer glaucomaYears) {
		this.glaucomaYears = glaucomaYears;
	}

	public Integer getCataractYears() {
		return cataractYears;
	}

	public void setCataractYears(Integer cataractYears) {
		this.cataractYears = cataractYears;
	}

	public String getOthers() {
		return others;
	}

	public void setOthers(String others) {
		this.others = others;
	}

	public String getDrugsStr() {
		if (drugs==null || drugs.length==0) {
			return "未填写";
		}
		String drugsStr = "";
		for(String durg:drugs) {
			if (!"".equals(drugsStr))
				drugsStr += ",";
			if ("1".equals(durg))
				drugsStr+="抗高血压药" + (StringUtils.isBlank(antihypertensiveDrugName)?"":("("+antihypertensiveDrugName+")"));
			if ("2".equals(durg))
				drugsStr+="降脂药" + (StringUtils.isBlank(lipidLoweringDrugName)?"":("("+lipidLoweringDrugName+")"));
			if ("3".equals(durg))
				drugsStr+="降糖药" + (StringUtils.isBlank(hypoglycemicAgentsName)?"":("("+hypoglycemicAgentsName+")"));
			if ("4".equals(durg))
				drugsStr+="抗血小板药" + (StringUtils.isBlank(antiplateletDrugName)?"":("("+antiplateletDrugName+")"));
			if ("5".equals(durg))
				drugsStr+="其它" + (StringUtils.isBlank(othersDrugName)?"":("("+othersDrugName+")"));
			if ("6".equals(durg))
				drugsStr+="无";
		}
		return drugsStr;
	}
	public String[] getDrugs() {
		return drugs;
	}

	public void setDrugs(String[] drugs) {
		this.drugs = drugs;
	}

	public String getAntihypertensiveDrugName() {
		return antihypertensiveDrugName;
	}

	public void setAntihypertensiveDrugName(String antihypertensiveDrugName) {
		this.antihypertensiveDrugName = antihypertensiveDrugName;
	}

	public String getLipidLoweringDrugName() {
		return lipidLoweringDrugName;
	}

	public void setLipidLoweringDrugName(String lipidLoweringDrugName) {
		this.lipidLoweringDrugName = lipidLoweringDrugName;
	}

	public String getHypoglycemicAgentsName() {
		return hypoglycemicAgentsName;
	}

	public void setHypoglycemicAgentsName(String hypoglycemicAgentsName) {
		this.hypoglycemicAgentsName = hypoglycemicAgentsName;
	}

	public String getAntiplateletDrugName() {
		return antiplateletDrugName;
	}

	public void setAntiplateletDrugName(String antiplateletDrugName) {
		this.antiplateletDrugName = antiplateletDrugName;
	}
	
	public String getHighBloodPressureHistoryStr() {
		if (highBloodPressureHistory==null) {
			return "未填写";
		}
		String[] tempStr = highBloodPressureHistory.split(",");
		String ret = "";
		for(String str:tempStr) {
			if (!"".equals(ret))
			{
				ret += ",";
			}
			if ("1".equals(str))
				ret += "祖父";
			if ("2".equals(str))
				ret += "祖母";
			if ("3".equals(str))
				ret += "外祖父";
			if ("4".equals(str))
				ret += "外祖母";
			if ("5".equals(str))
				ret += "父亲";
			if ("6".equals(str))
				ret += "母亲";
			if ("7".equals(str))
				ret += "兄弟/姐妹";
			if ("8".equals(str))
				ret += "无";
		}
		return ret;
	}

	public String getHighBloodPressureHistory() {
		return highBloodPressureHistory;
	}

	public void setHighBloodPressureHistory(String highBloodPressureHistory) {
		this.highBloodPressureHistory = highBloodPressureHistory;
	}
	
	public String getDiabetesHistoryStr() {
		if (diabetesHistory==null) {
			return "未填写";
		}
		String[] tempStr = diabetesHistory.split(",");
		String ret = "";
		for(String str:tempStr) {
			if (!"".equals(ret))
			{
				ret += ",";
			}
			if ("1".equals(str))
				ret += "祖父";
			if ("2".equals(str))
				ret += "祖母";
			if ("3".equals(str))
				ret += "外祖父";
			if ("4".equals(str))
				ret += "外祖母";
			if ("5".equals(str))
				ret += "父亲";
			if ("6".equals(str))
				ret += "母亲";
			if ("7".equals(str))
				ret += "兄弟/姐妹";
			if ("8".equals(str))
				ret += "无";
		}
		return ret;
	}

	public String getDiabetesHistory() {
		return diabetesHistory;
	}

	public void setDiabetesHistory(String diabetesHistory) {
		this.diabetesHistory = diabetesHistory;
	}

	public String getCoronaryHeartDiseaseHistoryStr() {
		if (coronaryHeartDiseaseHistory==null) {
			return "未填写";
		}
		String[] tempStr = coronaryHeartDiseaseHistory.split(",");
		String ret = "";
		for(String str:tempStr) {
			if (!"".equals(ret))
			{
				ret += ",";
			}
			if ("1".equals(str))
				ret += "祖父";
			if ("2".equals(str))
				ret += "祖母";
			if ("3".equals(str))
				ret += "外祖父";
			if ("4".equals(str))
				ret += "外祖母";
			if ("5".equals(str))
				ret += "父亲";
			if ("6".equals(str))
				ret += "母亲";
			if ("7".equals(str))
				ret += "兄弟/姐妹";
			if ("8".equals(str))
				ret += "无";
		}
		return ret;
	}
	
	public String getCoronaryHeartDiseaseHistory() {
		return coronaryHeartDiseaseHistory;
	}

	public void setCoronaryHeartDiseaseHistory(String coronaryHeartDiseaseHistory) {
		this.coronaryHeartDiseaseHistory = coronaryHeartDiseaseHistory;
	}
	
	public String getCerebralApoplexyHistoryStr() {
		if (cerebralApoplexyHistory==null) {
			return "未填写";
		}
		String[] tempStr = cerebralApoplexyHistory.split(",");
		String ret = "";
		for(String str:tempStr) {
			if (!"".equals(ret))
			{
				ret += ",";
			}
			if ("1".equals(str))
				ret += "祖父";
			if ("2".equals(str))
				ret += "祖母";
			if ("3".equals(str))
				ret += "外祖父";
			if ("4".equals(str))
				ret += "外祖母";
			if ("5".equals(str))
				ret += "父亲";
			if ("6".equals(str))
				ret += "母亲";
			if ("7".equals(str))
				ret += "兄弟/姐妹";
			if ("8".equals(str))
				ret += "无";
		}
		return ret;
	}

	public String getCerebralApoplexyHistory() {
		return cerebralApoplexyHistory;
	}

	public void setCerebralApoplexyHistory(String cerebralApoplexyHistory) {
		this.cerebralApoplexyHistory = cerebralApoplexyHistory;
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

	public Integer getOthersYears() {
		return othersYears;
	}

	public void setOthersYears(Integer othersYears) {
		this.othersYears = othersYears;
	}

	public String getOthersDrugName() {
		return othersDrugName;
	}

	public void setOthersDrugName(String othersDrugName) {
		this.othersDrugName = othersDrugName;
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
}
