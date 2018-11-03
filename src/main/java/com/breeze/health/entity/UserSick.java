package com.breeze.health.entity;

import java.util.Date;

public class UserSick {
    private Long id;

    private Long userId;

    private String sicks;

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

    private String drugs;

    private String antihypertensiveDrugName;

    private String lipidLoweringDrugName;

    private String hypoglycemicAgentsName;

    private String antiplateletDrugName;

    private String highBloodPressureHistory;

    private String diabetesHistory;

    private String coronaryHeartDiseaseHistory;

    private String cerebralApoplexyHistory;

    private Date createTime;

    private Date updateTime;

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

    public String getSicks() {
        return sicks;
    }

    public void setSicks(String sicks) {
        this.sicks = sicks == null ? null : sicks.trim();
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
        this.others = others == null ? null : others.trim();
    }

    public String getDrugs() {
        return drugs;
    }

    public void setDrugs(String drugs) {
        this.drugs = drugs == null ? null : drugs.trim();
    }

    public String getAntihypertensiveDrugName() {
        return antihypertensiveDrugName;
    }

    public void setAntihypertensiveDrugName(String antihypertensiveDrugName) {
        this.antihypertensiveDrugName = antihypertensiveDrugName == null ? null : antihypertensiveDrugName.trim();
    }

    public String getLipidLoweringDrugName() {
        return lipidLoweringDrugName;
    }

    public void setLipidLoweringDrugName(String lipidLoweringDrugName) {
        this.lipidLoweringDrugName = lipidLoweringDrugName == null ? null : lipidLoweringDrugName.trim();
    }

    public String getHypoglycemicAgentsName() {
        return hypoglycemicAgentsName;
    }

    public void setHypoglycemicAgentsName(String hypoglycemicAgentsName) {
        this.hypoglycemicAgentsName = hypoglycemicAgentsName == null ? null : hypoglycemicAgentsName.trim();
    }

    public String getAntiplateletDrugName() {
        return antiplateletDrugName;
    }

    public void setAntiplateletDrugName(String antiplateletDrugName) {
        this.antiplateletDrugName = antiplateletDrugName == null ? null : antiplateletDrugName.trim();
    }

    public String getHighBloodPressureHistory() {
        return highBloodPressureHistory;
    }

    public void setHighBloodPressureHistory(String highBloodPressureHistory) {
        this.highBloodPressureHistory = highBloodPressureHistory == null ? null : highBloodPressureHistory.trim();
    }

    public String getDiabetesHistory() {
        return diabetesHistory;
    }

    public void setDiabetesHistory(String diabetesHistory) {
        this.diabetesHistory = diabetesHistory == null ? null : diabetesHistory.trim();
    }

    public String getCoronaryHeartDiseaseHistory() {
        return coronaryHeartDiseaseHistory;
    }

    public void setCoronaryHeartDiseaseHistory(String coronaryHeartDiseaseHistory) {
        this.coronaryHeartDiseaseHistory = coronaryHeartDiseaseHistory == null ? null : coronaryHeartDiseaseHistory.trim();
    }

    public String getCerebralApoplexyHistory() {
        return cerebralApoplexyHistory;
    }

    public void setCerebralApoplexyHistory(String cerebralApoplexyHistory) {
        this.cerebralApoplexyHistory = cerebralApoplexyHistory == null ? null : cerebralApoplexyHistory.trim();
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
}