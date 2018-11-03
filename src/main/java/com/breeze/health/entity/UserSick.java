package com.breeze.health.entity;

import java.util.Date;

public class UserSick {
    private Long id;

    private Long userId;

    private Integer highBloodPressure;

    private Integer highBloodPressureYears;

    private Integer coronaryHeartDisease;

    private Integer coronaryHeartDiseaseYears;

    private Integer hyperlipidemia;

    private Integer hyperlipidemiaYears;

    private Integer diabetes;

    private Integer diabetesYears;

    private Integer cerebrovascularDisease;

    private Integer cerebrovascularDiseaseYears;

    private Integer chronicGastritis;

    private Integer chronicGastritisYears;

    private Integer stomachUlcer;

    private Integer stomachUlcerYears;

    private Integer bronchialAsthma;

    private Integer bronchialAsthmaYears;

    private Integer copd;

    private Integer copdYears;

    private Integer osteoporosis;

    private Integer osteoporosisYears;

    private Integer glaucoma;

    private Integer glaucomaYears;

    private Integer cataract;

    private Integer cataractYears;

    private String others;

    private Integer antihypertensiveDrug;

    private String antihypertensiveDrugName;

    private Integer lipidLoweringDrug;

    private String lipidLoweringDrugName;

    private Integer hypoglycemicAgents;

    private String hypoglycemicAgentsName;

    private Integer antiplateletDrug;

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

    public Integer getHighBloodPressure() {
        return highBloodPressure;
    }

    public void setHighBloodPressure(Integer highBloodPressure) {
        this.highBloodPressure = highBloodPressure;
    }

    public Integer getHighBloodPressureYears() {
        return highBloodPressureYears;
    }

    public void setHighBloodPressureYears(Integer highBloodPressureYears) {
        this.highBloodPressureYears = highBloodPressureYears;
    }

    public Integer getCoronaryHeartDisease() {
        return coronaryHeartDisease;
    }

    public void setCoronaryHeartDisease(Integer coronaryHeartDisease) {
        this.coronaryHeartDisease = coronaryHeartDisease;
    }

    public Integer getCoronaryHeartDiseaseYears() {
        return coronaryHeartDiseaseYears;
    }

    public void setCoronaryHeartDiseaseYears(Integer coronaryHeartDiseaseYears) {
        this.coronaryHeartDiseaseYears = coronaryHeartDiseaseYears;
    }

    public Integer getHyperlipidemia() {
        return hyperlipidemia;
    }

    public void setHyperlipidemia(Integer hyperlipidemia) {
        this.hyperlipidemia = hyperlipidemia;
    }

    public Integer getHyperlipidemiaYears() {
        return hyperlipidemiaYears;
    }

    public void setHyperlipidemiaYears(Integer hyperlipidemiaYears) {
        this.hyperlipidemiaYears = hyperlipidemiaYears;
    }

    public Integer getDiabetes() {
        return diabetes;
    }

    public void setDiabetes(Integer diabetes) {
        this.diabetes = diabetes;
    }

    public Integer getDiabetesYears() {
        return diabetesYears;
    }

    public void setDiabetesYears(Integer diabetesYears) {
        this.diabetesYears = diabetesYears;
    }

    public Integer getCerebrovascularDisease() {
        return cerebrovascularDisease;
    }

    public void setCerebrovascularDisease(Integer cerebrovascularDisease) {
        this.cerebrovascularDisease = cerebrovascularDisease;
    }

    public Integer getCerebrovascularDiseaseYears() {
        return cerebrovascularDiseaseYears;
    }

    public void setCerebrovascularDiseaseYears(Integer cerebrovascularDiseaseYears) {
        this.cerebrovascularDiseaseYears = cerebrovascularDiseaseYears;
    }

    public Integer getChronicGastritis() {
        return chronicGastritis;
    }

    public void setChronicGastritis(Integer chronicGastritis) {
        this.chronicGastritis = chronicGastritis;
    }

    public Integer getChronicGastritisYears() {
        return chronicGastritisYears;
    }

    public void setChronicGastritisYears(Integer chronicGastritisYears) {
        this.chronicGastritisYears = chronicGastritisYears;
    }

    public Integer getStomachUlcer() {
        return stomachUlcer;
    }

    public void setStomachUlcer(Integer stomachUlcer) {
        this.stomachUlcer = stomachUlcer;
    }

    public Integer getStomachUlcerYears() {
        return stomachUlcerYears;
    }

    public void setStomachUlcerYears(Integer stomachUlcerYears) {
        this.stomachUlcerYears = stomachUlcerYears;
    }

    public Integer getBronchialAsthma() {
        return bronchialAsthma;
    }

    public void setBronchialAsthma(Integer bronchialAsthma) {
        this.bronchialAsthma = bronchialAsthma;
    }

    public Integer getBronchialAsthmaYears() {
        return bronchialAsthmaYears;
    }

    public void setBronchialAsthmaYears(Integer bronchialAsthmaYears) {
        this.bronchialAsthmaYears = bronchialAsthmaYears;
    }

    public Integer getCopd() {
        return copd;
    }

    public void setCopd(Integer copd) {
        this.copd = copd;
    }

    public Integer getCopdYears() {
        return copdYears;
    }

    public void setCopdYears(Integer copdYears) {
        this.copdYears = copdYears;
    }

    public Integer getOsteoporosis() {
        return osteoporosis;
    }

    public void setOsteoporosis(Integer osteoporosis) {
        this.osteoporosis = osteoporosis;
    }

    public Integer getOsteoporosisYears() {
        return osteoporosisYears;
    }

    public void setOsteoporosisYears(Integer osteoporosisYears) {
        this.osteoporosisYears = osteoporosisYears;
    }

    public Integer getGlaucoma() {
        return glaucoma;
    }

    public void setGlaucoma(Integer glaucoma) {
        this.glaucoma = glaucoma;
    }

    public Integer getGlaucomaYears() {
        return glaucomaYears;
    }

    public void setGlaucomaYears(Integer glaucomaYears) {
        this.glaucomaYears = glaucomaYears;
    }

    public Integer getCataract() {
        return cataract;
    }

    public void setCataract(Integer cataract) {
        this.cataract = cataract;
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

    public Integer getAntihypertensiveDrug() {
        return antihypertensiveDrug;
    }

    public void setAntihypertensiveDrug(Integer antihypertensiveDrug) {
        this.antihypertensiveDrug = antihypertensiveDrug;
    }

    public String getAntihypertensiveDrugName() {
        return antihypertensiveDrugName;
    }

    public void setAntihypertensiveDrugName(String antihypertensiveDrugName) {
        this.antihypertensiveDrugName = antihypertensiveDrugName == null ? null : antihypertensiveDrugName.trim();
    }

    public Integer getLipidLoweringDrug() {
        return lipidLoweringDrug;
    }

    public void setLipidLoweringDrug(Integer lipidLoweringDrug) {
        this.lipidLoweringDrug = lipidLoweringDrug;
    }

    public String getLipidLoweringDrugName() {
        return lipidLoweringDrugName;
    }

    public void setLipidLoweringDrugName(String lipidLoweringDrugName) {
        this.lipidLoweringDrugName = lipidLoweringDrugName == null ? null : lipidLoweringDrugName.trim();
    }

    public Integer getHypoglycemicAgents() {
        return hypoglycemicAgents;
    }

    public void setHypoglycemicAgents(Integer hypoglycemicAgents) {
        this.hypoglycemicAgents = hypoglycemicAgents;
    }

    public String getHypoglycemicAgentsName() {
        return hypoglycemicAgentsName;
    }

    public void setHypoglycemicAgentsName(String hypoglycemicAgentsName) {
        this.hypoglycemicAgentsName = hypoglycemicAgentsName == null ? null : hypoglycemicAgentsName.trim();
    }

    public Integer getAntiplateletDrug() {
        return antiplateletDrug;
    }

    public void setAntiplateletDrug(Integer antiplateletDrug) {
        this.antiplateletDrug = antiplateletDrug;
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