package com.breeze.health.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserSickExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserSickExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andSicksIsNull() {
            addCriterion("sicks is null");
            return (Criteria) this;
        }

        public Criteria andSicksIsNotNull() {
            addCriterion("sicks is not null");
            return (Criteria) this;
        }

        public Criteria andSicksEqualTo(String value) {
            addCriterion("sicks =", value, "sicks");
            return (Criteria) this;
        }

        public Criteria andSicksNotEqualTo(String value) {
            addCriterion("sicks <>", value, "sicks");
            return (Criteria) this;
        }

        public Criteria andSicksGreaterThan(String value) {
            addCriterion("sicks >", value, "sicks");
            return (Criteria) this;
        }

        public Criteria andSicksGreaterThanOrEqualTo(String value) {
            addCriterion("sicks >=", value, "sicks");
            return (Criteria) this;
        }

        public Criteria andSicksLessThan(String value) {
            addCriterion("sicks <", value, "sicks");
            return (Criteria) this;
        }

        public Criteria andSicksLessThanOrEqualTo(String value) {
            addCriterion("sicks <=", value, "sicks");
            return (Criteria) this;
        }

        public Criteria andSicksLike(String value) {
            addCriterion("sicks like", value, "sicks");
            return (Criteria) this;
        }

        public Criteria andSicksNotLike(String value) {
            addCriterion("sicks not like", value, "sicks");
            return (Criteria) this;
        }

        public Criteria andSicksIn(List<String> values) {
            addCriterion("sicks in", values, "sicks");
            return (Criteria) this;
        }

        public Criteria andSicksNotIn(List<String> values) {
            addCriterion("sicks not in", values, "sicks");
            return (Criteria) this;
        }

        public Criteria andSicksBetween(String value1, String value2) {
            addCriterion("sicks between", value1, value2, "sicks");
            return (Criteria) this;
        }

        public Criteria andSicksNotBetween(String value1, String value2) {
            addCriterion("sicks not between", value1, value2, "sicks");
            return (Criteria) this;
        }

        public Criteria andHighBloodPressureYearsIsNull() {
            addCriterion("high_blood_pressure_years is null");
            return (Criteria) this;
        }

        public Criteria andHighBloodPressureYearsIsNotNull() {
            addCriterion("high_blood_pressure_years is not null");
            return (Criteria) this;
        }

        public Criteria andHighBloodPressureYearsEqualTo(Integer value) {
            addCriterion("high_blood_pressure_years =", value, "highBloodPressureYears");
            return (Criteria) this;
        }

        public Criteria andHighBloodPressureYearsNotEqualTo(Integer value) {
            addCriterion("high_blood_pressure_years <>", value, "highBloodPressureYears");
            return (Criteria) this;
        }

        public Criteria andHighBloodPressureYearsGreaterThan(Integer value) {
            addCriterion("high_blood_pressure_years >", value, "highBloodPressureYears");
            return (Criteria) this;
        }

        public Criteria andHighBloodPressureYearsGreaterThanOrEqualTo(Integer value) {
            addCriterion("high_blood_pressure_years >=", value, "highBloodPressureYears");
            return (Criteria) this;
        }

        public Criteria andHighBloodPressureYearsLessThan(Integer value) {
            addCriterion("high_blood_pressure_years <", value, "highBloodPressureYears");
            return (Criteria) this;
        }

        public Criteria andHighBloodPressureYearsLessThanOrEqualTo(Integer value) {
            addCriterion("high_blood_pressure_years <=", value, "highBloodPressureYears");
            return (Criteria) this;
        }

        public Criteria andHighBloodPressureYearsIn(List<Integer> values) {
            addCriterion("high_blood_pressure_years in", values, "highBloodPressureYears");
            return (Criteria) this;
        }

        public Criteria andHighBloodPressureYearsNotIn(List<Integer> values) {
            addCriterion("high_blood_pressure_years not in", values, "highBloodPressureYears");
            return (Criteria) this;
        }

        public Criteria andHighBloodPressureYearsBetween(Integer value1, Integer value2) {
            addCriterion("high_blood_pressure_years between", value1, value2, "highBloodPressureYears");
            return (Criteria) this;
        }

        public Criteria andHighBloodPressureYearsNotBetween(Integer value1, Integer value2) {
            addCriterion("high_blood_pressure_years not between", value1, value2, "highBloodPressureYears");
            return (Criteria) this;
        }

        public Criteria andCoronaryHeartDiseaseYearsIsNull() {
            addCriterion("coronary_heart_disease_years is null");
            return (Criteria) this;
        }

        public Criteria andCoronaryHeartDiseaseYearsIsNotNull() {
            addCriterion("coronary_heart_disease_years is not null");
            return (Criteria) this;
        }

        public Criteria andCoronaryHeartDiseaseYearsEqualTo(Integer value) {
            addCriterion("coronary_heart_disease_years =", value, "coronaryHeartDiseaseYears");
            return (Criteria) this;
        }

        public Criteria andCoronaryHeartDiseaseYearsNotEqualTo(Integer value) {
            addCriterion("coronary_heart_disease_years <>", value, "coronaryHeartDiseaseYears");
            return (Criteria) this;
        }

        public Criteria andCoronaryHeartDiseaseYearsGreaterThan(Integer value) {
            addCriterion("coronary_heart_disease_years >", value, "coronaryHeartDiseaseYears");
            return (Criteria) this;
        }

        public Criteria andCoronaryHeartDiseaseYearsGreaterThanOrEqualTo(Integer value) {
            addCriterion("coronary_heart_disease_years >=", value, "coronaryHeartDiseaseYears");
            return (Criteria) this;
        }

        public Criteria andCoronaryHeartDiseaseYearsLessThan(Integer value) {
            addCriterion("coronary_heart_disease_years <", value, "coronaryHeartDiseaseYears");
            return (Criteria) this;
        }

        public Criteria andCoronaryHeartDiseaseYearsLessThanOrEqualTo(Integer value) {
            addCriterion("coronary_heart_disease_years <=", value, "coronaryHeartDiseaseYears");
            return (Criteria) this;
        }

        public Criteria andCoronaryHeartDiseaseYearsIn(List<Integer> values) {
            addCriterion("coronary_heart_disease_years in", values, "coronaryHeartDiseaseYears");
            return (Criteria) this;
        }

        public Criteria andCoronaryHeartDiseaseYearsNotIn(List<Integer> values) {
            addCriterion("coronary_heart_disease_years not in", values, "coronaryHeartDiseaseYears");
            return (Criteria) this;
        }

        public Criteria andCoronaryHeartDiseaseYearsBetween(Integer value1, Integer value2) {
            addCriterion("coronary_heart_disease_years between", value1, value2, "coronaryHeartDiseaseYears");
            return (Criteria) this;
        }

        public Criteria andCoronaryHeartDiseaseYearsNotBetween(Integer value1, Integer value2) {
            addCriterion("coronary_heart_disease_years not between", value1, value2, "coronaryHeartDiseaseYears");
            return (Criteria) this;
        }

        public Criteria andHyperlipidemiaYearsIsNull() {
            addCriterion("hyperlipidemia_years is null");
            return (Criteria) this;
        }

        public Criteria andHyperlipidemiaYearsIsNotNull() {
            addCriterion("hyperlipidemia_years is not null");
            return (Criteria) this;
        }

        public Criteria andHyperlipidemiaYearsEqualTo(Integer value) {
            addCriterion("hyperlipidemia_years =", value, "hyperlipidemiaYears");
            return (Criteria) this;
        }

        public Criteria andHyperlipidemiaYearsNotEqualTo(Integer value) {
            addCriterion("hyperlipidemia_years <>", value, "hyperlipidemiaYears");
            return (Criteria) this;
        }

        public Criteria andHyperlipidemiaYearsGreaterThan(Integer value) {
            addCriterion("hyperlipidemia_years >", value, "hyperlipidemiaYears");
            return (Criteria) this;
        }

        public Criteria andHyperlipidemiaYearsGreaterThanOrEqualTo(Integer value) {
            addCriterion("hyperlipidemia_years >=", value, "hyperlipidemiaYears");
            return (Criteria) this;
        }

        public Criteria andHyperlipidemiaYearsLessThan(Integer value) {
            addCriterion("hyperlipidemia_years <", value, "hyperlipidemiaYears");
            return (Criteria) this;
        }

        public Criteria andHyperlipidemiaYearsLessThanOrEqualTo(Integer value) {
            addCriterion("hyperlipidemia_years <=", value, "hyperlipidemiaYears");
            return (Criteria) this;
        }

        public Criteria andHyperlipidemiaYearsIn(List<Integer> values) {
            addCriterion("hyperlipidemia_years in", values, "hyperlipidemiaYears");
            return (Criteria) this;
        }

        public Criteria andHyperlipidemiaYearsNotIn(List<Integer> values) {
            addCriterion("hyperlipidemia_years not in", values, "hyperlipidemiaYears");
            return (Criteria) this;
        }

        public Criteria andHyperlipidemiaYearsBetween(Integer value1, Integer value2) {
            addCriterion("hyperlipidemia_years between", value1, value2, "hyperlipidemiaYears");
            return (Criteria) this;
        }

        public Criteria andHyperlipidemiaYearsNotBetween(Integer value1, Integer value2) {
            addCriterion("hyperlipidemia_years not between", value1, value2, "hyperlipidemiaYears");
            return (Criteria) this;
        }

        public Criteria andDiabetesYearsIsNull() {
            addCriterion("diabetes_years is null");
            return (Criteria) this;
        }

        public Criteria andDiabetesYearsIsNotNull() {
            addCriterion("diabetes_years is not null");
            return (Criteria) this;
        }

        public Criteria andDiabetesYearsEqualTo(Integer value) {
            addCriterion("diabetes_years =", value, "diabetesYears");
            return (Criteria) this;
        }

        public Criteria andDiabetesYearsNotEqualTo(Integer value) {
            addCriterion("diabetes_years <>", value, "diabetesYears");
            return (Criteria) this;
        }

        public Criteria andDiabetesYearsGreaterThan(Integer value) {
            addCriterion("diabetes_years >", value, "diabetesYears");
            return (Criteria) this;
        }

        public Criteria andDiabetesYearsGreaterThanOrEqualTo(Integer value) {
            addCriterion("diabetes_years >=", value, "diabetesYears");
            return (Criteria) this;
        }

        public Criteria andDiabetesYearsLessThan(Integer value) {
            addCriterion("diabetes_years <", value, "diabetesYears");
            return (Criteria) this;
        }

        public Criteria andDiabetesYearsLessThanOrEqualTo(Integer value) {
            addCriterion("diabetes_years <=", value, "diabetesYears");
            return (Criteria) this;
        }

        public Criteria andDiabetesYearsIn(List<Integer> values) {
            addCriterion("diabetes_years in", values, "diabetesYears");
            return (Criteria) this;
        }

        public Criteria andDiabetesYearsNotIn(List<Integer> values) {
            addCriterion("diabetes_years not in", values, "diabetesYears");
            return (Criteria) this;
        }

        public Criteria andDiabetesYearsBetween(Integer value1, Integer value2) {
            addCriterion("diabetes_years between", value1, value2, "diabetesYears");
            return (Criteria) this;
        }

        public Criteria andDiabetesYearsNotBetween(Integer value1, Integer value2) {
            addCriterion("diabetes_years not between", value1, value2, "diabetesYears");
            return (Criteria) this;
        }

        public Criteria andCerebrovascularDiseaseYearsIsNull() {
            addCriterion("cerebrovascular_disease_years is null");
            return (Criteria) this;
        }

        public Criteria andCerebrovascularDiseaseYearsIsNotNull() {
            addCriterion("cerebrovascular_disease_years is not null");
            return (Criteria) this;
        }

        public Criteria andCerebrovascularDiseaseYearsEqualTo(Integer value) {
            addCriterion("cerebrovascular_disease_years =", value, "cerebrovascularDiseaseYears");
            return (Criteria) this;
        }

        public Criteria andCerebrovascularDiseaseYearsNotEqualTo(Integer value) {
            addCriterion("cerebrovascular_disease_years <>", value, "cerebrovascularDiseaseYears");
            return (Criteria) this;
        }

        public Criteria andCerebrovascularDiseaseYearsGreaterThan(Integer value) {
            addCriterion("cerebrovascular_disease_years >", value, "cerebrovascularDiseaseYears");
            return (Criteria) this;
        }

        public Criteria andCerebrovascularDiseaseYearsGreaterThanOrEqualTo(Integer value) {
            addCriterion("cerebrovascular_disease_years >=", value, "cerebrovascularDiseaseYears");
            return (Criteria) this;
        }

        public Criteria andCerebrovascularDiseaseYearsLessThan(Integer value) {
            addCriterion("cerebrovascular_disease_years <", value, "cerebrovascularDiseaseYears");
            return (Criteria) this;
        }

        public Criteria andCerebrovascularDiseaseYearsLessThanOrEqualTo(Integer value) {
            addCriterion("cerebrovascular_disease_years <=", value, "cerebrovascularDiseaseYears");
            return (Criteria) this;
        }

        public Criteria andCerebrovascularDiseaseYearsIn(List<Integer> values) {
            addCriterion("cerebrovascular_disease_years in", values, "cerebrovascularDiseaseYears");
            return (Criteria) this;
        }

        public Criteria andCerebrovascularDiseaseYearsNotIn(List<Integer> values) {
            addCriterion("cerebrovascular_disease_years not in", values, "cerebrovascularDiseaseYears");
            return (Criteria) this;
        }

        public Criteria andCerebrovascularDiseaseYearsBetween(Integer value1, Integer value2) {
            addCriterion("cerebrovascular_disease_years between", value1, value2, "cerebrovascularDiseaseYears");
            return (Criteria) this;
        }

        public Criteria andCerebrovascularDiseaseYearsNotBetween(Integer value1, Integer value2) {
            addCriterion("cerebrovascular_disease_years not between", value1, value2, "cerebrovascularDiseaseYears");
            return (Criteria) this;
        }

        public Criteria andChronicGastritisYearsIsNull() {
            addCriterion("chronic_gastritis_years is null");
            return (Criteria) this;
        }

        public Criteria andChronicGastritisYearsIsNotNull() {
            addCriterion("chronic_gastritis_years is not null");
            return (Criteria) this;
        }

        public Criteria andChronicGastritisYearsEqualTo(Integer value) {
            addCriterion("chronic_gastritis_years =", value, "chronicGastritisYears");
            return (Criteria) this;
        }

        public Criteria andChronicGastritisYearsNotEqualTo(Integer value) {
            addCriterion("chronic_gastritis_years <>", value, "chronicGastritisYears");
            return (Criteria) this;
        }

        public Criteria andChronicGastritisYearsGreaterThan(Integer value) {
            addCriterion("chronic_gastritis_years >", value, "chronicGastritisYears");
            return (Criteria) this;
        }

        public Criteria andChronicGastritisYearsGreaterThanOrEqualTo(Integer value) {
            addCriterion("chronic_gastritis_years >=", value, "chronicGastritisYears");
            return (Criteria) this;
        }

        public Criteria andChronicGastritisYearsLessThan(Integer value) {
            addCriterion("chronic_gastritis_years <", value, "chronicGastritisYears");
            return (Criteria) this;
        }

        public Criteria andChronicGastritisYearsLessThanOrEqualTo(Integer value) {
            addCriterion("chronic_gastritis_years <=", value, "chronicGastritisYears");
            return (Criteria) this;
        }

        public Criteria andChronicGastritisYearsIn(List<Integer> values) {
            addCriterion("chronic_gastritis_years in", values, "chronicGastritisYears");
            return (Criteria) this;
        }

        public Criteria andChronicGastritisYearsNotIn(List<Integer> values) {
            addCriterion("chronic_gastritis_years not in", values, "chronicGastritisYears");
            return (Criteria) this;
        }

        public Criteria andChronicGastritisYearsBetween(Integer value1, Integer value2) {
            addCriterion("chronic_gastritis_years between", value1, value2, "chronicGastritisYears");
            return (Criteria) this;
        }

        public Criteria andChronicGastritisYearsNotBetween(Integer value1, Integer value2) {
            addCriterion("chronic_gastritis_years not between", value1, value2, "chronicGastritisYears");
            return (Criteria) this;
        }

        public Criteria andStomachUlcerYearsIsNull() {
            addCriterion("stomach_ulcer_years is null");
            return (Criteria) this;
        }

        public Criteria andStomachUlcerYearsIsNotNull() {
            addCriterion("stomach_ulcer_years is not null");
            return (Criteria) this;
        }

        public Criteria andStomachUlcerYearsEqualTo(Integer value) {
            addCriterion("stomach_ulcer_years =", value, "stomachUlcerYears");
            return (Criteria) this;
        }

        public Criteria andStomachUlcerYearsNotEqualTo(Integer value) {
            addCriterion("stomach_ulcer_years <>", value, "stomachUlcerYears");
            return (Criteria) this;
        }

        public Criteria andStomachUlcerYearsGreaterThan(Integer value) {
            addCriterion("stomach_ulcer_years >", value, "stomachUlcerYears");
            return (Criteria) this;
        }

        public Criteria andStomachUlcerYearsGreaterThanOrEqualTo(Integer value) {
            addCriterion("stomach_ulcer_years >=", value, "stomachUlcerYears");
            return (Criteria) this;
        }

        public Criteria andStomachUlcerYearsLessThan(Integer value) {
            addCriterion("stomach_ulcer_years <", value, "stomachUlcerYears");
            return (Criteria) this;
        }

        public Criteria andStomachUlcerYearsLessThanOrEqualTo(Integer value) {
            addCriterion("stomach_ulcer_years <=", value, "stomachUlcerYears");
            return (Criteria) this;
        }

        public Criteria andStomachUlcerYearsIn(List<Integer> values) {
            addCriterion("stomach_ulcer_years in", values, "stomachUlcerYears");
            return (Criteria) this;
        }

        public Criteria andStomachUlcerYearsNotIn(List<Integer> values) {
            addCriterion("stomach_ulcer_years not in", values, "stomachUlcerYears");
            return (Criteria) this;
        }

        public Criteria andStomachUlcerYearsBetween(Integer value1, Integer value2) {
            addCriterion("stomach_ulcer_years between", value1, value2, "stomachUlcerYears");
            return (Criteria) this;
        }

        public Criteria andStomachUlcerYearsNotBetween(Integer value1, Integer value2) {
            addCriterion("stomach_ulcer_years not between", value1, value2, "stomachUlcerYears");
            return (Criteria) this;
        }

        public Criteria andBronchialAsthmaYearsIsNull() {
            addCriterion("bronchial_asthma_years is null");
            return (Criteria) this;
        }

        public Criteria andBronchialAsthmaYearsIsNotNull() {
            addCriterion("bronchial_asthma_years is not null");
            return (Criteria) this;
        }

        public Criteria andBronchialAsthmaYearsEqualTo(Integer value) {
            addCriterion("bronchial_asthma_years =", value, "bronchialAsthmaYears");
            return (Criteria) this;
        }

        public Criteria andBronchialAsthmaYearsNotEqualTo(Integer value) {
            addCriterion("bronchial_asthma_years <>", value, "bronchialAsthmaYears");
            return (Criteria) this;
        }

        public Criteria andBronchialAsthmaYearsGreaterThan(Integer value) {
            addCriterion("bronchial_asthma_years >", value, "bronchialAsthmaYears");
            return (Criteria) this;
        }

        public Criteria andBronchialAsthmaYearsGreaterThanOrEqualTo(Integer value) {
            addCriterion("bronchial_asthma_years >=", value, "bronchialAsthmaYears");
            return (Criteria) this;
        }

        public Criteria andBronchialAsthmaYearsLessThan(Integer value) {
            addCriterion("bronchial_asthma_years <", value, "bronchialAsthmaYears");
            return (Criteria) this;
        }

        public Criteria andBronchialAsthmaYearsLessThanOrEqualTo(Integer value) {
            addCriterion("bronchial_asthma_years <=", value, "bronchialAsthmaYears");
            return (Criteria) this;
        }

        public Criteria andBronchialAsthmaYearsIn(List<Integer> values) {
            addCriterion("bronchial_asthma_years in", values, "bronchialAsthmaYears");
            return (Criteria) this;
        }

        public Criteria andBronchialAsthmaYearsNotIn(List<Integer> values) {
            addCriterion("bronchial_asthma_years not in", values, "bronchialAsthmaYears");
            return (Criteria) this;
        }

        public Criteria andBronchialAsthmaYearsBetween(Integer value1, Integer value2) {
            addCriterion("bronchial_asthma_years between", value1, value2, "bronchialAsthmaYears");
            return (Criteria) this;
        }

        public Criteria andBronchialAsthmaYearsNotBetween(Integer value1, Integer value2) {
            addCriterion("bronchial_asthma_years not between", value1, value2, "bronchialAsthmaYears");
            return (Criteria) this;
        }

        public Criteria andCopdYearsIsNull() {
            addCriterion("copd_years is null");
            return (Criteria) this;
        }

        public Criteria andCopdYearsIsNotNull() {
            addCriterion("copd_years is not null");
            return (Criteria) this;
        }

        public Criteria andCopdYearsEqualTo(Integer value) {
            addCriterion("copd_years =", value, "copdYears");
            return (Criteria) this;
        }

        public Criteria andCopdYearsNotEqualTo(Integer value) {
            addCriterion("copd_years <>", value, "copdYears");
            return (Criteria) this;
        }

        public Criteria andCopdYearsGreaterThan(Integer value) {
            addCriterion("copd_years >", value, "copdYears");
            return (Criteria) this;
        }

        public Criteria andCopdYearsGreaterThanOrEqualTo(Integer value) {
            addCriterion("copd_years >=", value, "copdYears");
            return (Criteria) this;
        }

        public Criteria andCopdYearsLessThan(Integer value) {
            addCriterion("copd_years <", value, "copdYears");
            return (Criteria) this;
        }

        public Criteria andCopdYearsLessThanOrEqualTo(Integer value) {
            addCriterion("copd_years <=", value, "copdYears");
            return (Criteria) this;
        }

        public Criteria andCopdYearsIn(List<Integer> values) {
            addCriterion("copd_years in", values, "copdYears");
            return (Criteria) this;
        }

        public Criteria andCopdYearsNotIn(List<Integer> values) {
            addCriterion("copd_years not in", values, "copdYears");
            return (Criteria) this;
        }

        public Criteria andCopdYearsBetween(Integer value1, Integer value2) {
            addCriterion("copd_years between", value1, value2, "copdYears");
            return (Criteria) this;
        }

        public Criteria andCopdYearsNotBetween(Integer value1, Integer value2) {
            addCriterion("copd_years not between", value1, value2, "copdYears");
            return (Criteria) this;
        }

        public Criteria andOsteoporosisYearsIsNull() {
            addCriterion("osteoporosis_years is null");
            return (Criteria) this;
        }

        public Criteria andOsteoporosisYearsIsNotNull() {
            addCriterion("osteoporosis_years is not null");
            return (Criteria) this;
        }

        public Criteria andOsteoporosisYearsEqualTo(Integer value) {
            addCriterion("osteoporosis_years =", value, "osteoporosisYears");
            return (Criteria) this;
        }

        public Criteria andOsteoporosisYearsNotEqualTo(Integer value) {
            addCriterion("osteoporosis_years <>", value, "osteoporosisYears");
            return (Criteria) this;
        }

        public Criteria andOsteoporosisYearsGreaterThan(Integer value) {
            addCriterion("osteoporosis_years >", value, "osteoporosisYears");
            return (Criteria) this;
        }

        public Criteria andOsteoporosisYearsGreaterThanOrEqualTo(Integer value) {
            addCriterion("osteoporosis_years >=", value, "osteoporosisYears");
            return (Criteria) this;
        }

        public Criteria andOsteoporosisYearsLessThan(Integer value) {
            addCriterion("osteoporosis_years <", value, "osteoporosisYears");
            return (Criteria) this;
        }

        public Criteria andOsteoporosisYearsLessThanOrEqualTo(Integer value) {
            addCriterion("osteoporosis_years <=", value, "osteoporosisYears");
            return (Criteria) this;
        }

        public Criteria andOsteoporosisYearsIn(List<Integer> values) {
            addCriterion("osteoporosis_years in", values, "osteoporosisYears");
            return (Criteria) this;
        }

        public Criteria andOsteoporosisYearsNotIn(List<Integer> values) {
            addCriterion("osteoporosis_years not in", values, "osteoporosisYears");
            return (Criteria) this;
        }

        public Criteria andOsteoporosisYearsBetween(Integer value1, Integer value2) {
            addCriterion("osteoporosis_years between", value1, value2, "osteoporosisYears");
            return (Criteria) this;
        }

        public Criteria andOsteoporosisYearsNotBetween(Integer value1, Integer value2) {
            addCriterion("osteoporosis_years not between", value1, value2, "osteoporosisYears");
            return (Criteria) this;
        }

        public Criteria andGlaucomaYearsIsNull() {
            addCriterion("glaucoma_years is null");
            return (Criteria) this;
        }

        public Criteria andGlaucomaYearsIsNotNull() {
            addCriterion("glaucoma_years is not null");
            return (Criteria) this;
        }

        public Criteria andGlaucomaYearsEqualTo(Integer value) {
            addCriterion("glaucoma_years =", value, "glaucomaYears");
            return (Criteria) this;
        }

        public Criteria andGlaucomaYearsNotEqualTo(Integer value) {
            addCriterion("glaucoma_years <>", value, "glaucomaYears");
            return (Criteria) this;
        }

        public Criteria andGlaucomaYearsGreaterThan(Integer value) {
            addCriterion("glaucoma_years >", value, "glaucomaYears");
            return (Criteria) this;
        }

        public Criteria andGlaucomaYearsGreaterThanOrEqualTo(Integer value) {
            addCriterion("glaucoma_years >=", value, "glaucomaYears");
            return (Criteria) this;
        }

        public Criteria andGlaucomaYearsLessThan(Integer value) {
            addCriterion("glaucoma_years <", value, "glaucomaYears");
            return (Criteria) this;
        }

        public Criteria andGlaucomaYearsLessThanOrEqualTo(Integer value) {
            addCriterion("glaucoma_years <=", value, "glaucomaYears");
            return (Criteria) this;
        }

        public Criteria andGlaucomaYearsIn(List<Integer> values) {
            addCriterion("glaucoma_years in", values, "glaucomaYears");
            return (Criteria) this;
        }

        public Criteria andGlaucomaYearsNotIn(List<Integer> values) {
            addCriterion("glaucoma_years not in", values, "glaucomaYears");
            return (Criteria) this;
        }

        public Criteria andGlaucomaYearsBetween(Integer value1, Integer value2) {
            addCriterion("glaucoma_years between", value1, value2, "glaucomaYears");
            return (Criteria) this;
        }

        public Criteria andGlaucomaYearsNotBetween(Integer value1, Integer value2) {
            addCriterion("glaucoma_years not between", value1, value2, "glaucomaYears");
            return (Criteria) this;
        }

        public Criteria andCataractYearsIsNull() {
            addCriterion("cataract_years is null");
            return (Criteria) this;
        }

        public Criteria andCataractYearsIsNotNull() {
            addCriterion("cataract_years is not null");
            return (Criteria) this;
        }

        public Criteria andCataractYearsEqualTo(Integer value) {
            addCriterion("cataract_years =", value, "cataractYears");
            return (Criteria) this;
        }

        public Criteria andCataractYearsNotEqualTo(Integer value) {
            addCriterion("cataract_years <>", value, "cataractYears");
            return (Criteria) this;
        }

        public Criteria andCataractYearsGreaterThan(Integer value) {
            addCriterion("cataract_years >", value, "cataractYears");
            return (Criteria) this;
        }

        public Criteria andCataractYearsGreaterThanOrEqualTo(Integer value) {
            addCriterion("cataract_years >=", value, "cataractYears");
            return (Criteria) this;
        }

        public Criteria andCataractYearsLessThan(Integer value) {
            addCriterion("cataract_years <", value, "cataractYears");
            return (Criteria) this;
        }

        public Criteria andCataractYearsLessThanOrEqualTo(Integer value) {
            addCriterion("cataract_years <=", value, "cataractYears");
            return (Criteria) this;
        }

        public Criteria andCataractYearsIn(List<Integer> values) {
            addCriterion("cataract_years in", values, "cataractYears");
            return (Criteria) this;
        }

        public Criteria andCataractYearsNotIn(List<Integer> values) {
            addCriterion("cataract_years not in", values, "cataractYears");
            return (Criteria) this;
        }

        public Criteria andCataractYearsBetween(Integer value1, Integer value2) {
            addCriterion("cataract_years between", value1, value2, "cataractYears");
            return (Criteria) this;
        }

        public Criteria andCataractYearsNotBetween(Integer value1, Integer value2) {
            addCriterion("cataract_years not between", value1, value2, "cataractYears");
            return (Criteria) this;
        }

        public Criteria andOthersIsNull() {
            addCriterion("others is null");
            return (Criteria) this;
        }

        public Criteria andOthersIsNotNull() {
            addCriterion("others is not null");
            return (Criteria) this;
        }

        public Criteria andOthersEqualTo(String value) {
            addCriterion("others =", value, "others");
            return (Criteria) this;
        }

        public Criteria andOthersNotEqualTo(String value) {
            addCriterion("others <>", value, "others");
            return (Criteria) this;
        }

        public Criteria andOthersGreaterThan(String value) {
            addCriterion("others >", value, "others");
            return (Criteria) this;
        }

        public Criteria andOthersGreaterThanOrEqualTo(String value) {
            addCriterion("others >=", value, "others");
            return (Criteria) this;
        }

        public Criteria andOthersLessThan(String value) {
            addCriterion("others <", value, "others");
            return (Criteria) this;
        }

        public Criteria andOthersLessThanOrEqualTo(String value) {
            addCriterion("others <=", value, "others");
            return (Criteria) this;
        }

        public Criteria andOthersLike(String value) {
            addCriterion("others like", value, "others");
            return (Criteria) this;
        }

        public Criteria andOthersNotLike(String value) {
            addCriterion("others not like", value, "others");
            return (Criteria) this;
        }

        public Criteria andOthersIn(List<String> values) {
            addCriterion("others in", values, "others");
            return (Criteria) this;
        }

        public Criteria andOthersNotIn(List<String> values) {
            addCriterion("others not in", values, "others");
            return (Criteria) this;
        }

        public Criteria andOthersBetween(String value1, String value2) {
            addCriterion("others between", value1, value2, "others");
            return (Criteria) this;
        }

        public Criteria andOthersNotBetween(String value1, String value2) {
            addCriterion("others not between", value1, value2, "others");
            return (Criteria) this;
        }

        public Criteria andDrugsIsNull() {
            addCriterion("drugs is null");
            return (Criteria) this;
        }

        public Criteria andDrugsIsNotNull() {
            addCriterion("drugs is not null");
            return (Criteria) this;
        }

        public Criteria andDrugsEqualTo(String value) {
            addCriterion("drugs =", value, "drugs");
            return (Criteria) this;
        }

        public Criteria andDrugsNotEqualTo(String value) {
            addCriterion("drugs <>", value, "drugs");
            return (Criteria) this;
        }

        public Criteria andDrugsGreaterThan(String value) {
            addCriterion("drugs >", value, "drugs");
            return (Criteria) this;
        }

        public Criteria andDrugsGreaterThanOrEqualTo(String value) {
            addCriterion("drugs >=", value, "drugs");
            return (Criteria) this;
        }

        public Criteria andDrugsLessThan(String value) {
            addCriterion("drugs <", value, "drugs");
            return (Criteria) this;
        }

        public Criteria andDrugsLessThanOrEqualTo(String value) {
            addCriterion("drugs <=", value, "drugs");
            return (Criteria) this;
        }

        public Criteria andDrugsLike(String value) {
            addCriterion("drugs like", value, "drugs");
            return (Criteria) this;
        }

        public Criteria andDrugsNotLike(String value) {
            addCriterion("drugs not like", value, "drugs");
            return (Criteria) this;
        }

        public Criteria andDrugsIn(List<String> values) {
            addCriterion("drugs in", values, "drugs");
            return (Criteria) this;
        }

        public Criteria andDrugsNotIn(List<String> values) {
            addCriterion("drugs not in", values, "drugs");
            return (Criteria) this;
        }

        public Criteria andDrugsBetween(String value1, String value2) {
            addCriterion("drugs between", value1, value2, "drugs");
            return (Criteria) this;
        }

        public Criteria andDrugsNotBetween(String value1, String value2) {
            addCriterion("drugs not between", value1, value2, "drugs");
            return (Criteria) this;
        }

        public Criteria andAntihypertensiveDrugNameIsNull() {
            addCriterion("antihypertensive_drug_name is null");
            return (Criteria) this;
        }

        public Criteria andAntihypertensiveDrugNameIsNotNull() {
            addCriterion("antihypertensive_drug_name is not null");
            return (Criteria) this;
        }

        public Criteria andAntihypertensiveDrugNameEqualTo(String value) {
            addCriterion("antihypertensive_drug_name =", value, "antihypertensiveDrugName");
            return (Criteria) this;
        }

        public Criteria andAntihypertensiveDrugNameNotEqualTo(String value) {
            addCriterion("antihypertensive_drug_name <>", value, "antihypertensiveDrugName");
            return (Criteria) this;
        }

        public Criteria andAntihypertensiveDrugNameGreaterThan(String value) {
            addCriterion("antihypertensive_drug_name >", value, "antihypertensiveDrugName");
            return (Criteria) this;
        }

        public Criteria andAntihypertensiveDrugNameGreaterThanOrEqualTo(String value) {
            addCriterion("antihypertensive_drug_name >=", value, "antihypertensiveDrugName");
            return (Criteria) this;
        }

        public Criteria andAntihypertensiveDrugNameLessThan(String value) {
            addCriterion("antihypertensive_drug_name <", value, "antihypertensiveDrugName");
            return (Criteria) this;
        }

        public Criteria andAntihypertensiveDrugNameLessThanOrEqualTo(String value) {
            addCriterion("antihypertensive_drug_name <=", value, "antihypertensiveDrugName");
            return (Criteria) this;
        }

        public Criteria andAntihypertensiveDrugNameLike(String value) {
            addCriterion("antihypertensive_drug_name like", value, "antihypertensiveDrugName");
            return (Criteria) this;
        }

        public Criteria andAntihypertensiveDrugNameNotLike(String value) {
            addCriterion("antihypertensive_drug_name not like", value, "antihypertensiveDrugName");
            return (Criteria) this;
        }

        public Criteria andAntihypertensiveDrugNameIn(List<String> values) {
            addCriterion("antihypertensive_drug_name in", values, "antihypertensiveDrugName");
            return (Criteria) this;
        }

        public Criteria andAntihypertensiveDrugNameNotIn(List<String> values) {
            addCriterion("antihypertensive_drug_name not in", values, "antihypertensiveDrugName");
            return (Criteria) this;
        }

        public Criteria andAntihypertensiveDrugNameBetween(String value1, String value2) {
            addCriterion("antihypertensive_drug_name between", value1, value2, "antihypertensiveDrugName");
            return (Criteria) this;
        }

        public Criteria andAntihypertensiveDrugNameNotBetween(String value1, String value2) {
            addCriterion("antihypertensive_drug_name not between", value1, value2, "antihypertensiveDrugName");
            return (Criteria) this;
        }

        public Criteria andLipidLoweringDrugNameIsNull() {
            addCriterion("lipid_lowering_drug_name is null");
            return (Criteria) this;
        }

        public Criteria andLipidLoweringDrugNameIsNotNull() {
            addCriterion("lipid_lowering_drug_name is not null");
            return (Criteria) this;
        }

        public Criteria andLipidLoweringDrugNameEqualTo(String value) {
            addCriterion("lipid_lowering_drug_name =", value, "lipidLoweringDrugName");
            return (Criteria) this;
        }

        public Criteria andLipidLoweringDrugNameNotEqualTo(String value) {
            addCriterion("lipid_lowering_drug_name <>", value, "lipidLoweringDrugName");
            return (Criteria) this;
        }

        public Criteria andLipidLoweringDrugNameGreaterThan(String value) {
            addCriterion("lipid_lowering_drug_name >", value, "lipidLoweringDrugName");
            return (Criteria) this;
        }

        public Criteria andLipidLoweringDrugNameGreaterThanOrEqualTo(String value) {
            addCriterion("lipid_lowering_drug_name >=", value, "lipidLoweringDrugName");
            return (Criteria) this;
        }

        public Criteria andLipidLoweringDrugNameLessThan(String value) {
            addCriterion("lipid_lowering_drug_name <", value, "lipidLoweringDrugName");
            return (Criteria) this;
        }

        public Criteria andLipidLoweringDrugNameLessThanOrEqualTo(String value) {
            addCriterion("lipid_lowering_drug_name <=", value, "lipidLoweringDrugName");
            return (Criteria) this;
        }

        public Criteria andLipidLoweringDrugNameLike(String value) {
            addCriterion("lipid_lowering_drug_name like", value, "lipidLoweringDrugName");
            return (Criteria) this;
        }

        public Criteria andLipidLoweringDrugNameNotLike(String value) {
            addCriterion("lipid_lowering_drug_name not like", value, "lipidLoweringDrugName");
            return (Criteria) this;
        }

        public Criteria andLipidLoweringDrugNameIn(List<String> values) {
            addCriterion("lipid_lowering_drug_name in", values, "lipidLoweringDrugName");
            return (Criteria) this;
        }

        public Criteria andLipidLoweringDrugNameNotIn(List<String> values) {
            addCriterion("lipid_lowering_drug_name not in", values, "lipidLoweringDrugName");
            return (Criteria) this;
        }

        public Criteria andLipidLoweringDrugNameBetween(String value1, String value2) {
            addCriterion("lipid_lowering_drug_name between", value1, value2, "lipidLoweringDrugName");
            return (Criteria) this;
        }

        public Criteria andLipidLoweringDrugNameNotBetween(String value1, String value2) {
            addCriterion("lipid_lowering_drug_name not between", value1, value2, "lipidLoweringDrugName");
            return (Criteria) this;
        }

        public Criteria andHypoglycemicAgentsNameIsNull() {
            addCriterion("hypoglycemic_agents_name is null");
            return (Criteria) this;
        }

        public Criteria andHypoglycemicAgentsNameIsNotNull() {
            addCriterion("hypoglycemic_agents_name is not null");
            return (Criteria) this;
        }

        public Criteria andHypoglycemicAgentsNameEqualTo(String value) {
            addCriterion("hypoglycemic_agents_name =", value, "hypoglycemicAgentsName");
            return (Criteria) this;
        }

        public Criteria andHypoglycemicAgentsNameNotEqualTo(String value) {
            addCriterion("hypoglycemic_agents_name <>", value, "hypoglycemicAgentsName");
            return (Criteria) this;
        }

        public Criteria andHypoglycemicAgentsNameGreaterThan(String value) {
            addCriterion("hypoglycemic_agents_name >", value, "hypoglycemicAgentsName");
            return (Criteria) this;
        }

        public Criteria andHypoglycemicAgentsNameGreaterThanOrEqualTo(String value) {
            addCriterion("hypoglycemic_agents_name >=", value, "hypoglycemicAgentsName");
            return (Criteria) this;
        }

        public Criteria andHypoglycemicAgentsNameLessThan(String value) {
            addCriterion("hypoglycemic_agents_name <", value, "hypoglycemicAgentsName");
            return (Criteria) this;
        }

        public Criteria andHypoglycemicAgentsNameLessThanOrEqualTo(String value) {
            addCriterion("hypoglycemic_agents_name <=", value, "hypoglycemicAgentsName");
            return (Criteria) this;
        }

        public Criteria andHypoglycemicAgentsNameLike(String value) {
            addCriterion("hypoglycemic_agents_name like", value, "hypoglycemicAgentsName");
            return (Criteria) this;
        }

        public Criteria andHypoglycemicAgentsNameNotLike(String value) {
            addCriterion("hypoglycemic_agents_name not like", value, "hypoglycemicAgentsName");
            return (Criteria) this;
        }

        public Criteria andHypoglycemicAgentsNameIn(List<String> values) {
            addCriterion("hypoglycemic_agents_name in", values, "hypoglycemicAgentsName");
            return (Criteria) this;
        }

        public Criteria andHypoglycemicAgentsNameNotIn(List<String> values) {
            addCriterion("hypoglycemic_agents_name not in", values, "hypoglycemicAgentsName");
            return (Criteria) this;
        }

        public Criteria andHypoglycemicAgentsNameBetween(String value1, String value2) {
            addCriterion("hypoglycemic_agents_name between", value1, value2, "hypoglycemicAgentsName");
            return (Criteria) this;
        }

        public Criteria andHypoglycemicAgentsNameNotBetween(String value1, String value2) {
            addCriterion("hypoglycemic_agents_name not between", value1, value2, "hypoglycemicAgentsName");
            return (Criteria) this;
        }

        public Criteria andAntiplateletDrugNameIsNull() {
            addCriterion("antiplatelet_drug_name is null");
            return (Criteria) this;
        }

        public Criteria andAntiplateletDrugNameIsNotNull() {
            addCriterion("antiplatelet_drug_name is not null");
            return (Criteria) this;
        }

        public Criteria andAntiplateletDrugNameEqualTo(String value) {
            addCriterion("antiplatelet_drug_name =", value, "antiplateletDrugName");
            return (Criteria) this;
        }

        public Criteria andAntiplateletDrugNameNotEqualTo(String value) {
            addCriterion("antiplatelet_drug_name <>", value, "antiplateletDrugName");
            return (Criteria) this;
        }

        public Criteria andAntiplateletDrugNameGreaterThan(String value) {
            addCriterion("antiplatelet_drug_name >", value, "antiplateletDrugName");
            return (Criteria) this;
        }

        public Criteria andAntiplateletDrugNameGreaterThanOrEqualTo(String value) {
            addCriterion("antiplatelet_drug_name >=", value, "antiplateletDrugName");
            return (Criteria) this;
        }

        public Criteria andAntiplateletDrugNameLessThan(String value) {
            addCriterion("antiplatelet_drug_name <", value, "antiplateletDrugName");
            return (Criteria) this;
        }

        public Criteria andAntiplateletDrugNameLessThanOrEqualTo(String value) {
            addCriterion("antiplatelet_drug_name <=", value, "antiplateletDrugName");
            return (Criteria) this;
        }

        public Criteria andAntiplateletDrugNameLike(String value) {
            addCriterion("antiplatelet_drug_name like", value, "antiplateletDrugName");
            return (Criteria) this;
        }

        public Criteria andAntiplateletDrugNameNotLike(String value) {
            addCriterion("antiplatelet_drug_name not like", value, "antiplateletDrugName");
            return (Criteria) this;
        }

        public Criteria andAntiplateletDrugNameIn(List<String> values) {
            addCriterion("antiplatelet_drug_name in", values, "antiplateletDrugName");
            return (Criteria) this;
        }

        public Criteria andAntiplateletDrugNameNotIn(List<String> values) {
            addCriterion("antiplatelet_drug_name not in", values, "antiplateletDrugName");
            return (Criteria) this;
        }

        public Criteria andAntiplateletDrugNameBetween(String value1, String value2) {
            addCriterion("antiplatelet_drug_name between", value1, value2, "antiplateletDrugName");
            return (Criteria) this;
        }

        public Criteria andAntiplateletDrugNameNotBetween(String value1, String value2) {
            addCriterion("antiplatelet_drug_name not between", value1, value2, "antiplateletDrugName");
            return (Criteria) this;
        }

        public Criteria andHighBloodPressureHistoryIsNull() {
            addCriterion("high_blood_pressure_history is null");
            return (Criteria) this;
        }

        public Criteria andHighBloodPressureHistoryIsNotNull() {
            addCriterion("high_blood_pressure_history is not null");
            return (Criteria) this;
        }

        public Criteria andHighBloodPressureHistoryEqualTo(String value) {
            addCriterion("high_blood_pressure_history =", value, "highBloodPressureHistory");
            return (Criteria) this;
        }

        public Criteria andHighBloodPressureHistoryNotEqualTo(String value) {
            addCriterion("high_blood_pressure_history <>", value, "highBloodPressureHistory");
            return (Criteria) this;
        }

        public Criteria andHighBloodPressureHistoryGreaterThan(String value) {
            addCriterion("high_blood_pressure_history >", value, "highBloodPressureHistory");
            return (Criteria) this;
        }

        public Criteria andHighBloodPressureHistoryGreaterThanOrEqualTo(String value) {
            addCriterion("high_blood_pressure_history >=", value, "highBloodPressureHistory");
            return (Criteria) this;
        }

        public Criteria andHighBloodPressureHistoryLessThan(String value) {
            addCriterion("high_blood_pressure_history <", value, "highBloodPressureHistory");
            return (Criteria) this;
        }

        public Criteria andHighBloodPressureHistoryLessThanOrEqualTo(String value) {
            addCriterion("high_blood_pressure_history <=", value, "highBloodPressureHistory");
            return (Criteria) this;
        }

        public Criteria andHighBloodPressureHistoryLike(String value) {
            addCriterion("high_blood_pressure_history like", value, "highBloodPressureHistory");
            return (Criteria) this;
        }

        public Criteria andHighBloodPressureHistoryNotLike(String value) {
            addCriterion("high_blood_pressure_history not like", value, "highBloodPressureHistory");
            return (Criteria) this;
        }

        public Criteria andHighBloodPressureHistoryIn(List<String> values) {
            addCriterion("high_blood_pressure_history in", values, "highBloodPressureHistory");
            return (Criteria) this;
        }

        public Criteria andHighBloodPressureHistoryNotIn(List<String> values) {
            addCriterion("high_blood_pressure_history not in", values, "highBloodPressureHistory");
            return (Criteria) this;
        }

        public Criteria andHighBloodPressureHistoryBetween(String value1, String value2) {
            addCriterion("high_blood_pressure_history between", value1, value2, "highBloodPressureHistory");
            return (Criteria) this;
        }

        public Criteria andHighBloodPressureHistoryNotBetween(String value1, String value2) {
            addCriterion("high_blood_pressure_history not between", value1, value2, "highBloodPressureHistory");
            return (Criteria) this;
        }

        public Criteria andDiabetesHistoryIsNull() {
            addCriterion("diabetes_history is null");
            return (Criteria) this;
        }

        public Criteria andDiabetesHistoryIsNotNull() {
            addCriterion("diabetes_history is not null");
            return (Criteria) this;
        }

        public Criteria andDiabetesHistoryEqualTo(String value) {
            addCriterion("diabetes_history =", value, "diabetesHistory");
            return (Criteria) this;
        }

        public Criteria andDiabetesHistoryNotEqualTo(String value) {
            addCriterion("diabetes_history <>", value, "diabetesHistory");
            return (Criteria) this;
        }

        public Criteria andDiabetesHistoryGreaterThan(String value) {
            addCriterion("diabetes_history >", value, "diabetesHistory");
            return (Criteria) this;
        }

        public Criteria andDiabetesHistoryGreaterThanOrEqualTo(String value) {
            addCriterion("diabetes_history >=", value, "diabetesHistory");
            return (Criteria) this;
        }

        public Criteria andDiabetesHistoryLessThan(String value) {
            addCriterion("diabetes_history <", value, "diabetesHistory");
            return (Criteria) this;
        }

        public Criteria andDiabetesHistoryLessThanOrEqualTo(String value) {
            addCriterion("diabetes_history <=", value, "diabetesHistory");
            return (Criteria) this;
        }

        public Criteria andDiabetesHistoryLike(String value) {
            addCriterion("diabetes_history like", value, "diabetesHistory");
            return (Criteria) this;
        }

        public Criteria andDiabetesHistoryNotLike(String value) {
            addCriterion("diabetes_history not like", value, "diabetesHistory");
            return (Criteria) this;
        }

        public Criteria andDiabetesHistoryIn(List<String> values) {
            addCriterion("diabetes_history in", values, "diabetesHistory");
            return (Criteria) this;
        }

        public Criteria andDiabetesHistoryNotIn(List<String> values) {
            addCriterion("diabetes_history not in", values, "diabetesHistory");
            return (Criteria) this;
        }

        public Criteria andDiabetesHistoryBetween(String value1, String value2) {
            addCriterion("diabetes_history between", value1, value2, "diabetesHistory");
            return (Criteria) this;
        }

        public Criteria andDiabetesHistoryNotBetween(String value1, String value2) {
            addCriterion("diabetes_history not between", value1, value2, "diabetesHistory");
            return (Criteria) this;
        }

        public Criteria andCoronaryHeartDiseaseHistoryIsNull() {
            addCriterion("coronary_heart_disease_history is null");
            return (Criteria) this;
        }

        public Criteria andCoronaryHeartDiseaseHistoryIsNotNull() {
            addCriterion("coronary_heart_disease_history is not null");
            return (Criteria) this;
        }

        public Criteria andCoronaryHeartDiseaseHistoryEqualTo(String value) {
            addCriterion("coronary_heart_disease_history =", value, "coronaryHeartDiseaseHistory");
            return (Criteria) this;
        }

        public Criteria andCoronaryHeartDiseaseHistoryNotEqualTo(String value) {
            addCriterion("coronary_heart_disease_history <>", value, "coronaryHeartDiseaseHistory");
            return (Criteria) this;
        }

        public Criteria andCoronaryHeartDiseaseHistoryGreaterThan(String value) {
            addCriterion("coronary_heart_disease_history >", value, "coronaryHeartDiseaseHistory");
            return (Criteria) this;
        }

        public Criteria andCoronaryHeartDiseaseHistoryGreaterThanOrEqualTo(String value) {
            addCriterion("coronary_heart_disease_history >=", value, "coronaryHeartDiseaseHistory");
            return (Criteria) this;
        }

        public Criteria andCoronaryHeartDiseaseHistoryLessThan(String value) {
            addCriterion("coronary_heart_disease_history <", value, "coronaryHeartDiseaseHistory");
            return (Criteria) this;
        }

        public Criteria andCoronaryHeartDiseaseHistoryLessThanOrEqualTo(String value) {
            addCriterion("coronary_heart_disease_history <=", value, "coronaryHeartDiseaseHistory");
            return (Criteria) this;
        }

        public Criteria andCoronaryHeartDiseaseHistoryLike(String value) {
            addCriterion("coronary_heart_disease_history like", value, "coronaryHeartDiseaseHistory");
            return (Criteria) this;
        }

        public Criteria andCoronaryHeartDiseaseHistoryNotLike(String value) {
            addCriterion("coronary_heart_disease_history not like", value, "coronaryHeartDiseaseHistory");
            return (Criteria) this;
        }

        public Criteria andCoronaryHeartDiseaseHistoryIn(List<String> values) {
            addCriterion("coronary_heart_disease_history in", values, "coronaryHeartDiseaseHistory");
            return (Criteria) this;
        }

        public Criteria andCoronaryHeartDiseaseHistoryNotIn(List<String> values) {
            addCriterion("coronary_heart_disease_history not in", values, "coronaryHeartDiseaseHistory");
            return (Criteria) this;
        }

        public Criteria andCoronaryHeartDiseaseHistoryBetween(String value1, String value2) {
            addCriterion("coronary_heart_disease_history between", value1, value2, "coronaryHeartDiseaseHistory");
            return (Criteria) this;
        }

        public Criteria andCoronaryHeartDiseaseHistoryNotBetween(String value1, String value2) {
            addCriterion("coronary_heart_disease_history not between", value1, value2, "coronaryHeartDiseaseHistory");
            return (Criteria) this;
        }

        public Criteria andCerebralApoplexyHistoryIsNull() {
            addCriterion("cerebral_apoplexy_history is null");
            return (Criteria) this;
        }

        public Criteria andCerebralApoplexyHistoryIsNotNull() {
            addCriterion("cerebral_apoplexy_history is not null");
            return (Criteria) this;
        }

        public Criteria andCerebralApoplexyHistoryEqualTo(String value) {
            addCriterion("cerebral_apoplexy_history =", value, "cerebralApoplexyHistory");
            return (Criteria) this;
        }

        public Criteria andCerebralApoplexyHistoryNotEqualTo(String value) {
            addCriterion("cerebral_apoplexy_history <>", value, "cerebralApoplexyHistory");
            return (Criteria) this;
        }

        public Criteria andCerebralApoplexyHistoryGreaterThan(String value) {
            addCriterion("cerebral_apoplexy_history >", value, "cerebralApoplexyHistory");
            return (Criteria) this;
        }

        public Criteria andCerebralApoplexyHistoryGreaterThanOrEqualTo(String value) {
            addCriterion("cerebral_apoplexy_history >=", value, "cerebralApoplexyHistory");
            return (Criteria) this;
        }

        public Criteria andCerebralApoplexyHistoryLessThan(String value) {
            addCriterion("cerebral_apoplexy_history <", value, "cerebralApoplexyHistory");
            return (Criteria) this;
        }

        public Criteria andCerebralApoplexyHistoryLessThanOrEqualTo(String value) {
            addCriterion("cerebral_apoplexy_history <=", value, "cerebralApoplexyHistory");
            return (Criteria) this;
        }

        public Criteria andCerebralApoplexyHistoryLike(String value) {
            addCriterion("cerebral_apoplexy_history like", value, "cerebralApoplexyHistory");
            return (Criteria) this;
        }

        public Criteria andCerebralApoplexyHistoryNotLike(String value) {
            addCriterion("cerebral_apoplexy_history not like", value, "cerebralApoplexyHistory");
            return (Criteria) this;
        }

        public Criteria andCerebralApoplexyHistoryIn(List<String> values) {
            addCriterion("cerebral_apoplexy_history in", values, "cerebralApoplexyHistory");
            return (Criteria) this;
        }

        public Criteria andCerebralApoplexyHistoryNotIn(List<String> values) {
            addCriterion("cerebral_apoplexy_history not in", values, "cerebralApoplexyHistory");
            return (Criteria) this;
        }

        public Criteria andCerebralApoplexyHistoryBetween(String value1, String value2) {
            addCriterion("cerebral_apoplexy_history between", value1, value2, "cerebralApoplexyHistory");
            return (Criteria) this;
        }

        public Criteria andCerebralApoplexyHistoryNotBetween(String value1, String value2) {
            addCriterion("cerebral_apoplexy_history not between", value1, value2, "cerebralApoplexyHistory");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}