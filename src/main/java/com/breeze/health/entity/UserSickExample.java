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

        public Criteria andHighBloodPressureIsNull() {
            addCriterion("high_blood_pressure is null");
            return (Criteria) this;
        }

        public Criteria andHighBloodPressureIsNotNull() {
            addCriterion("high_blood_pressure is not null");
            return (Criteria) this;
        }

        public Criteria andHighBloodPressureEqualTo(Integer value) {
            addCriterion("high_blood_pressure =", value, "highBloodPressure");
            return (Criteria) this;
        }

        public Criteria andHighBloodPressureNotEqualTo(Integer value) {
            addCriterion("high_blood_pressure <>", value, "highBloodPressure");
            return (Criteria) this;
        }

        public Criteria andHighBloodPressureGreaterThan(Integer value) {
            addCriterion("high_blood_pressure >", value, "highBloodPressure");
            return (Criteria) this;
        }

        public Criteria andHighBloodPressureGreaterThanOrEqualTo(Integer value) {
            addCriterion("high_blood_pressure >=", value, "highBloodPressure");
            return (Criteria) this;
        }

        public Criteria andHighBloodPressureLessThan(Integer value) {
            addCriterion("high_blood_pressure <", value, "highBloodPressure");
            return (Criteria) this;
        }

        public Criteria andHighBloodPressureLessThanOrEqualTo(Integer value) {
            addCriterion("high_blood_pressure <=", value, "highBloodPressure");
            return (Criteria) this;
        }

        public Criteria andHighBloodPressureIn(List<Integer> values) {
            addCriterion("high_blood_pressure in", values, "highBloodPressure");
            return (Criteria) this;
        }

        public Criteria andHighBloodPressureNotIn(List<Integer> values) {
            addCriterion("high_blood_pressure not in", values, "highBloodPressure");
            return (Criteria) this;
        }

        public Criteria andHighBloodPressureBetween(Integer value1, Integer value2) {
            addCriterion("high_blood_pressure between", value1, value2, "highBloodPressure");
            return (Criteria) this;
        }

        public Criteria andHighBloodPressureNotBetween(Integer value1, Integer value2) {
            addCriterion("high_blood_pressure not between", value1, value2, "highBloodPressure");
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

        public Criteria andCoronaryHeartDiseaseIsNull() {
            addCriterion("coronary_heart_disease is null");
            return (Criteria) this;
        }

        public Criteria andCoronaryHeartDiseaseIsNotNull() {
            addCriterion("coronary_heart_disease is not null");
            return (Criteria) this;
        }

        public Criteria andCoronaryHeartDiseaseEqualTo(Integer value) {
            addCriterion("coronary_heart_disease =", value, "coronaryHeartDisease");
            return (Criteria) this;
        }

        public Criteria andCoronaryHeartDiseaseNotEqualTo(Integer value) {
            addCriterion("coronary_heart_disease <>", value, "coronaryHeartDisease");
            return (Criteria) this;
        }

        public Criteria andCoronaryHeartDiseaseGreaterThan(Integer value) {
            addCriterion("coronary_heart_disease >", value, "coronaryHeartDisease");
            return (Criteria) this;
        }

        public Criteria andCoronaryHeartDiseaseGreaterThanOrEqualTo(Integer value) {
            addCriterion("coronary_heart_disease >=", value, "coronaryHeartDisease");
            return (Criteria) this;
        }

        public Criteria andCoronaryHeartDiseaseLessThan(Integer value) {
            addCriterion("coronary_heart_disease <", value, "coronaryHeartDisease");
            return (Criteria) this;
        }

        public Criteria andCoronaryHeartDiseaseLessThanOrEqualTo(Integer value) {
            addCriterion("coronary_heart_disease <=", value, "coronaryHeartDisease");
            return (Criteria) this;
        }

        public Criteria andCoronaryHeartDiseaseIn(List<Integer> values) {
            addCriterion("coronary_heart_disease in", values, "coronaryHeartDisease");
            return (Criteria) this;
        }

        public Criteria andCoronaryHeartDiseaseNotIn(List<Integer> values) {
            addCriterion("coronary_heart_disease not in", values, "coronaryHeartDisease");
            return (Criteria) this;
        }

        public Criteria andCoronaryHeartDiseaseBetween(Integer value1, Integer value2) {
            addCriterion("coronary_heart_disease between", value1, value2, "coronaryHeartDisease");
            return (Criteria) this;
        }

        public Criteria andCoronaryHeartDiseaseNotBetween(Integer value1, Integer value2) {
            addCriterion("coronary_heart_disease not between", value1, value2, "coronaryHeartDisease");
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

        public Criteria andHyperlipidemiaIsNull() {
            addCriterion("hyperlipidemia is null");
            return (Criteria) this;
        }

        public Criteria andHyperlipidemiaIsNotNull() {
            addCriterion("hyperlipidemia is not null");
            return (Criteria) this;
        }

        public Criteria andHyperlipidemiaEqualTo(Integer value) {
            addCriterion("hyperlipidemia =", value, "hyperlipidemia");
            return (Criteria) this;
        }

        public Criteria andHyperlipidemiaNotEqualTo(Integer value) {
            addCriterion("hyperlipidemia <>", value, "hyperlipidemia");
            return (Criteria) this;
        }

        public Criteria andHyperlipidemiaGreaterThan(Integer value) {
            addCriterion("hyperlipidemia >", value, "hyperlipidemia");
            return (Criteria) this;
        }

        public Criteria andHyperlipidemiaGreaterThanOrEqualTo(Integer value) {
            addCriterion("hyperlipidemia >=", value, "hyperlipidemia");
            return (Criteria) this;
        }

        public Criteria andHyperlipidemiaLessThan(Integer value) {
            addCriterion("hyperlipidemia <", value, "hyperlipidemia");
            return (Criteria) this;
        }

        public Criteria andHyperlipidemiaLessThanOrEqualTo(Integer value) {
            addCriterion("hyperlipidemia <=", value, "hyperlipidemia");
            return (Criteria) this;
        }

        public Criteria andHyperlipidemiaIn(List<Integer> values) {
            addCriterion("hyperlipidemia in", values, "hyperlipidemia");
            return (Criteria) this;
        }

        public Criteria andHyperlipidemiaNotIn(List<Integer> values) {
            addCriterion("hyperlipidemia not in", values, "hyperlipidemia");
            return (Criteria) this;
        }

        public Criteria andHyperlipidemiaBetween(Integer value1, Integer value2) {
            addCriterion("hyperlipidemia between", value1, value2, "hyperlipidemia");
            return (Criteria) this;
        }

        public Criteria andHyperlipidemiaNotBetween(Integer value1, Integer value2) {
            addCriterion("hyperlipidemia not between", value1, value2, "hyperlipidemia");
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

        public Criteria andDiabetesIsNull() {
            addCriterion("diabetes is null");
            return (Criteria) this;
        }

        public Criteria andDiabetesIsNotNull() {
            addCriterion("diabetes is not null");
            return (Criteria) this;
        }

        public Criteria andDiabetesEqualTo(Integer value) {
            addCriterion("diabetes =", value, "diabetes");
            return (Criteria) this;
        }

        public Criteria andDiabetesNotEqualTo(Integer value) {
            addCriterion("diabetes <>", value, "diabetes");
            return (Criteria) this;
        }

        public Criteria andDiabetesGreaterThan(Integer value) {
            addCriterion("diabetes >", value, "diabetes");
            return (Criteria) this;
        }

        public Criteria andDiabetesGreaterThanOrEqualTo(Integer value) {
            addCriterion("diabetes >=", value, "diabetes");
            return (Criteria) this;
        }

        public Criteria andDiabetesLessThan(Integer value) {
            addCriterion("diabetes <", value, "diabetes");
            return (Criteria) this;
        }

        public Criteria andDiabetesLessThanOrEqualTo(Integer value) {
            addCriterion("diabetes <=", value, "diabetes");
            return (Criteria) this;
        }

        public Criteria andDiabetesIn(List<Integer> values) {
            addCriterion("diabetes in", values, "diabetes");
            return (Criteria) this;
        }

        public Criteria andDiabetesNotIn(List<Integer> values) {
            addCriterion("diabetes not in", values, "diabetes");
            return (Criteria) this;
        }

        public Criteria andDiabetesBetween(Integer value1, Integer value2) {
            addCriterion("diabetes between", value1, value2, "diabetes");
            return (Criteria) this;
        }

        public Criteria andDiabetesNotBetween(Integer value1, Integer value2) {
            addCriterion("diabetes not between", value1, value2, "diabetes");
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

        public Criteria andCerebrovascularDiseaseIsNull() {
            addCriterion("cerebrovascular_disease is null");
            return (Criteria) this;
        }

        public Criteria andCerebrovascularDiseaseIsNotNull() {
            addCriterion("cerebrovascular_disease is not null");
            return (Criteria) this;
        }

        public Criteria andCerebrovascularDiseaseEqualTo(Integer value) {
            addCriterion("cerebrovascular_disease =", value, "cerebrovascularDisease");
            return (Criteria) this;
        }

        public Criteria andCerebrovascularDiseaseNotEqualTo(Integer value) {
            addCriterion("cerebrovascular_disease <>", value, "cerebrovascularDisease");
            return (Criteria) this;
        }

        public Criteria andCerebrovascularDiseaseGreaterThan(Integer value) {
            addCriterion("cerebrovascular_disease >", value, "cerebrovascularDisease");
            return (Criteria) this;
        }

        public Criteria andCerebrovascularDiseaseGreaterThanOrEqualTo(Integer value) {
            addCriterion("cerebrovascular_disease >=", value, "cerebrovascularDisease");
            return (Criteria) this;
        }

        public Criteria andCerebrovascularDiseaseLessThan(Integer value) {
            addCriterion("cerebrovascular_disease <", value, "cerebrovascularDisease");
            return (Criteria) this;
        }

        public Criteria andCerebrovascularDiseaseLessThanOrEqualTo(Integer value) {
            addCriterion("cerebrovascular_disease <=", value, "cerebrovascularDisease");
            return (Criteria) this;
        }

        public Criteria andCerebrovascularDiseaseIn(List<Integer> values) {
            addCriterion("cerebrovascular_disease in", values, "cerebrovascularDisease");
            return (Criteria) this;
        }

        public Criteria andCerebrovascularDiseaseNotIn(List<Integer> values) {
            addCriterion("cerebrovascular_disease not in", values, "cerebrovascularDisease");
            return (Criteria) this;
        }

        public Criteria andCerebrovascularDiseaseBetween(Integer value1, Integer value2) {
            addCriterion("cerebrovascular_disease between", value1, value2, "cerebrovascularDisease");
            return (Criteria) this;
        }

        public Criteria andCerebrovascularDiseaseNotBetween(Integer value1, Integer value2) {
            addCriterion("cerebrovascular_disease not between", value1, value2, "cerebrovascularDisease");
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

        public Criteria andChronicGastritisIsNull() {
            addCriterion("chronic_gastritis is null");
            return (Criteria) this;
        }

        public Criteria andChronicGastritisIsNotNull() {
            addCriterion("chronic_gastritis is not null");
            return (Criteria) this;
        }

        public Criteria andChronicGastritisEqualTo(Integer value) {
            addCriterion("chronic_gastritis =", value, "chronicGastritis");
            return (Criteria) this;
        }

        public Criteria andChronicGastritisNotEqualTo(Integer value) {
            addCriterion("chronic_gastritis <>", value, "chronicGastritis");
            return (Criteria) this;
        }

        public Criteria andChronicGastritisGreaterThan(Integer value) {
            addCriterion("chronic_gastritis >", value, "chronicGastritis");
            return (Criteria) this;
        }

        public Criteria andChronicGastritisGreaterThanOrEqualTo(Integer value) {
            addCriterion("chronic_gastritis >=", value, "chronicGastritis");
            return (Criteria) this;
        }

        public Criteria andChronicGastritisLessThan(Integer value) {
            addCriterion("chronic_gastritis <", value, "chronicGastritis");
            return (Criteria) this;
        }

        public Criteria andChronicGastritisLessThanOrEqualTo(Integer value) {
            addCriterion("chronic_gastritis <=", value, "chronicGastritis");
            return (Criteria) this;
        }

        public Criteria andChronicGastritisIn(List<Integer> values) {
            addCriterion("chronic_gastritis in", values, "chronicGastritis");
            return (Criteria) this;
        }

        public Criteria andChronicGastritisNotIn(List<Integer> values) {
            addCriterion("chronic_gastritis not in", values, "chronicGastritis");
            return (Criteria) this;
        }

        public Criteria andChronicGastritisBetween(Integer value1, Integer value2) {
            addCriterion("chronic_gastritis between", value1, value2, "chronicGastritis");
            return (Criteria) this;
        }

        public Criteria andChronicGastritisNotBetween(Integer value1, Integer value2) {
            addCriterion("chronic_gastritis not between", value1, value2, "chronicGastritis");
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

        public Criteria andStomachUlcerIsNull() {
            addCriterion("stomach_ulcer is null");
            return (Criteria) this;
        }

        public Criteria andStomachUlcerIsNotNull() {
            addCriterion("stomach_ulcer is not null");
            return (Criteria) this;
        }

        public Criteria andStomachUlcerEqualTo(Integer value) {
            addCriterion("stomach_ulcer =", value, "stomachUlcer");
            return (Criteria) this;
        }

        public Criteria andStomachUlcerNotEqualTo(Integer value) {
            addCriterion("stomach_ulcer <>", value, "stomachUlcer");
            return (Criteria) this;
        }

        public Criteria andStomachUlcerGreaterThan(Integer value) {
            addCriterion("stomach_ulcer >", value, "stomachUlcer");
            return (Criteria) this;
        }

        public Criteria andStomachUlcerGreaterThanOrEqualTo(Integer value) {
            addCriterion("stomach_ulcer >=", value, "stomachUlcer");
            return (Criteria) this;
        }

        public Criteria andStomachUlcerLessThan(Integer value) {
            addCriterion("stomach_ulcer <", value, "stomachUlcer");
            return (Criteria) this;
        }

        public Criteria andStomachUlcerLessThanOrEqualTo(Integer value) {
            addCriterion("stomach_ulcer <=", value, "stomachUlcer");
            return (Criteria) this;
        }

        public Criteria andStomachUlcerIn(List<Integer> values) {
            addCriterion("stomach_ulcer in", values, "stomachUlcer");
            return (Criteria) this;
        }

        public Criteria andStomachUlcerNotIn(List<Integer> values) {
            addCriterion("stomach_ulcer not in", values, "stomachUlcer");
            return (Criteria) this;
        }

        public Criteria andStomachUlcerBetween(Integer value1, Integer value2) {
            addCriterion("stomach_ulcer between", value1, value2, "stomachUlcer");
            return (Criteria) this;
        }

        public Criteria andStomachUlcerNotBetween(Integer value1, Integer value2) {
            addCriterion("stomach_ulcer not between", value1, value2, "stomachUlcer");
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

        public Criteria andBronchialAsthmaIsNull() {
            addCriterion("bronchial_asthma is null");
            return (Criteria) this;
        }

        public Criteria andBronchialAsthmaIsNotNull() {
            addCriterion("bronchial_asthma is not null");
            return (Criteria) this;
        }

        public Criteria andBronchialAsthmaEqualTo(Integer value) {
            addCriterion("bronchial_asthma =", value, "bronchialAsthma");
            return (Criteria) this;
        }

        public Criteria andBronchialAsthmaNotEqualTo(Integer value) {
            addCriterion("bronchial_asthma <>", value, "bronchialAsthma");
            return (Criteria) this;
        }

        public Criteria andBronchialAsthmaGreaterThan(Integer value) {
            addCriterion("bronchial_asthma >", value, "bronchialAsthma");
            return (Criteria) this;
        }

        public Criteria andBronchialAsthmaGreaterThanOrEqualTo(Integer value) {
            addCriterion("bronchial_asthma >=", value, "bronchialAsthma");
            return (Criteria) this;
        }

        public Criteria andBronchialAsthmaLessThan(Integer value) {
            addCriterion("bronchial_asthma <", value, "bronchialAsthma");
            return (Criteria) this;
        }

        public Criteria andBronchialAsthmaLessThanOrEqualTo(Integer value) {
            addCriterion("bronchial_asthma <=", value, "bronchialAsthma");
            return (Criteria) this;
        }

        public Criteria andBronchialAsthmaIn(List<Integer> values) {
            addCriterion("bronchial_asthma in", values, "bronchialAsthma");
            return (Criteria) this;
        }

        public Criteria andBronchialAsthmaNotIn(List<Integer> values) {
            addCriterion("bronchial_asthma not in", values, "bronchialAsthma");
            return (Criteria) this;
        }

        public Criteria andBronchialAsthmaBetween(Integer value1, Integer value2) {
            addCriterion("bronchial_asthma between", value1, value2, "bronchialAsthma");
            return (Criteria) this;
        }

        public Criteria andBronchialAsthmaNotBetween(Integer value1, Integer value2) {
            addCriterion("bronchial_asthma not between", value1, value2, "bronchialAsthma");
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

        public Criteria andCopdIsNull() {
            addCriterion("copd is null");
            return (Criteria) this;
        }

        public Criteria andCopdIsNotNull() {
            addCriterion("copd is not null");
            return (Criteria) this;
        }

        public Criteria andCopdEqualTo(Integer value) {
            addCriterion("copd =", value, "copd");
            return (Criteria) this;
        }

        public Criteria andCopdNotEqualTo(Integer value) {
            addCriterion("copd <>", value, "copd");
            return (Criteria) this;
        }

        public Criteria andCopdGreaterThan(Integer value) {
            addCriterion("copd >", value, "copd");
            return (Criteria) this;
        }

        public Criteria andCopdGreaterThanOrEqualTo(Integer value) {
            addCriterion("copd >=", value, "copd");
            return (Criteria) this;
        }

        public Criteria andCopdLessThan(Integer value) {
            addCriterion("copd <", value, "copd");
            return (Criteria) this;
        }

        public Criteria andCopdLessThanOrEqualTo(Integer value) {
            addCriterion("copd <=", value, "copd");
            return (Criteria) this;
        }

        public Criteria andCopdIn(List<Integer> values) {
            addCriterion("copd in", values, "copd");
            return (Criteria) this;
        }

        public Criteria andCopdNotIn(List<Integer> values) {
            addCriterion("copd not in", values, "copd");
            return (Criteria) this;
        }

        public Criteria andCopdBetween(Integer value1, Integer value2) {
            addCriterion("copd between", value1, value2, "copd");
            return (Criteria) this;
        }

        public Criteria andCopdNotBetween(Integer value1, Integer value2) {
            addCriterion("copd not between", value1, value2, "copd");
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

        public Criteria andOsteoporosisIsNull() {
            addCriterion("osteoporosis is null");
            return (Criteria) this;
        }

        public Criteria andOsteoporosisIsNotNull() {
            addCriterion("osteoporosis is not null");
            return (Criteria) this;
        }

        public Criteria andOsteoporosisEqualTo(Integer value) {
            addCriterion("osteoporosis =", value, "osteoporosis");
            return (Criteria) this;
        }

        public Criteria andOsteoporosisNotEqualTo(Integer value) {
            addCriterion("osteoporosis <>", value, "osteoporosis");
            return (Criteria) this;
        }

        public Criteria andOsteoporosisGreaterThan(Integer value) {
            addCriterion("osteoporosis >", value, "osteoporosis");
            return (Criteria) this;
        }

        public Criteria andOsteoporosisGreaterThanOrEqualTo(Integer value) {
            addCriterion("osteoporosis >=", value, "osteoporosis");
            return (Criteria) this;
        }

        public Criteria andOsteoporosisLessThan(Integer value) {
            addCriterion("osteoporosis <", value, "osteoporosis");
            return (Criteria) this;
        }

        public Criteria andOsteoporosisLessThanOrEqualTo(Integer value) {
            addCriterion("osteoporosis <=", value, "osteoporosis");
            return (Criteria) this;
        }

        public Criteria andOsteoporosisIn(List<Integer> values) {
            addCriterion("osteoporosis in", values, "osteoporosis");
            return (Criteria) this;
        }

        public Criteria andOsteoporosisNotIn(List<Integer> values) {
            addCriterion("osteoporosis not in", values, "osteoporosis");
            return (Criteria) this;
        }

        public Criteria andOsteoporosisBetween(Integer value1, Integer value2) {
            addCriterion("osteoporosis between", value1, value2, "osteoporosis");
            return (Criteria) this;
        }

        public Criteria andOsteoporosisNotBetween(Integer value1, Integer value2) {
            addCriterion("osteoporosis not between", value1, value2, "osteoporosis");
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

        public Criteria andGlaucomaIsNull() {
            addCriterion("glaucoma is null");
            return (Criteria) this;
        }

        public Criteria andGlaucomaIsNotNull() {
            addCriterion("glaucoma is not null");
            return (Criteria) this;
        }

        public Criteria andGlaucomaEqualTo(Integer value) {
            addCriterion("glaucoma =", value, "glaucoma");
            return (Criteria) this;
        }

        public Criteria andGlaucomaNotEqualTo(Integer value) {
            addCriterion("glaucoma <>", value, "glaucoma");
            return (Criteria) this;
        }

        public Criteria andGlaucomaGreaterThan(Integer value) {
            addCriterion("glaucoma >", value, "glaucoma");
            return (Criteria) this;
        }

        public Criteria andGlaucomaGreaterThanOrEqualTo(Integer value) {
            addCriterion("glaucoma >=", value, "glaucoma");
            return (Criteria) this;
        }

        public Criteria andGlaucomaLessThan(Integer value) {
            addCriterion("glaucoma <", value, "glaucoma");
            return (Criteria) this;
        }

        public Criteria andGlaucomaLessThanOrEqualTo(Integer value) {
            addCriterion("glaucoma <=", value, "glaucoma");
            return (Criteria) this;
        }

        public Criteria andGlaucomaIn(List<Integer> values) {
            addCriterion("glaucoma in", values, "glaucoma");
            return (Criteria) this;
        }

        public Criteria andGlaucomaNotIn(List<Integer> values) {
            addCriterion("glaucoma not in", values, "glaucoma");
            return (Criteria) this;
        }

        public Criteria andGlaucomaBetween(Integer value1, Integer value2) {
            addCriterion("glaucoma between", value1, value2, "glaucoma");
            return (Criteria) this;
        }

        public Criteria andGlaucomaNotBetween(Integer value1, Integer value2) {
            addCriterion("glaucoma not between", value1, value2, "glaucoma");
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

        public Criteria andCataractIsNull() {
            addCriterion("cataract is null");
            return (Criteria) this;
        }

        public Criteria andCataractIsNotNull() {
            addCriterion("cataract is not null");
            return (Criteria) this;
        }

        public Criteria andCataractEqualTo(Integer value) {
            addCriterion("cataract =", value, "cataract");
            return (Criteria) this;
        }

        public Criteria andCataractNotEqualTo(Integer value) {
            addCriterion("cataract <>", value, "cataract");
            return (Criteria) this;
        }

        public Criteria andCataractGreaterThan(Integer value) {
            addCriterion("cataract >", value, "cataract");
            return (Criteria) this;
        }

        public Criteria andCataractGreaterThanOrEqualTo(Integer value) {
            addCriterion("cataract >=", value, "cataract");
            return (Criteria) this;
        }

        public Criteria andCataractLessThan(Integer value) {
            addCriterion("cataract <", value, "cataract");
            return (Criteria) this;
        }

        public Criteria andCataractLessThanOrEqualTo(Integer value) {
            addCriterion("cataract <=", value, "cataract");
            return (Criteria) this;
        }

        public Criteria andCataractIn(List<Integer> values) {
            addCriterion("cataract in", values, "cataract");
            return (Criteria) this;
        }

        public Criteria andCataractNotIn(List<Integer> values) {
            addCriterion("cataract not in", values, "cataract");
            return (Criteria) this;
        }

        public Criteria andCataractBetween(Integer value1, Integer value2) {
            addCriterion("cataract between", value1, value2, "cataract");
            return (Criteria) this;
        }

        public Criteria andCataractNotBetween(Integer value1, Integer value2) {
            addCriterion("cataract not between", value1, value2, "cataract");
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

        public Criteria andAntihypertensiveDrugIsNull() {
            addCriterion("antihypertensive_drug is null");
            return (Criteria) this;
        }

        public Criteria andAntihypertensiveDrugIsNotNull() {
            addCriterion("antihypertensive_drug is not null");
            return (Criteria) this;
        }

        public Criteria andAntihypertensiveDrugEqualTo(String value) {
            addCriterion("antihypertensive_drug =", value, "antihypertensiveDrug");
            return (Criteria) this;
        }

        public Criteria andAntihypertensiveDrugNotEqualTo(String value) {
            addCriterion("antihypertensive_drug <>", value, "antihypertensiveDrug");
            return (Criteria) this;
        }

        public Criteria andAntihypertensiveDrugGreaterThan(String value) {
            addCriterion("antihypertensive_drug >", value, "antihypertensiveDrug");
            return (Criteria) this;
        }

        public Criteria andAntihypertensiveDrugGreaterThanOrEqualTo(String value) {
            addCriterion("antihypertensive_drug >=", value, "antihypertensiveDrug");
            return (Criteria) this;
        }

        public Criteria andAntihypertensiveDrugLessThan(String value) {
            addCriterion("antihypertensive_drug <", value, "antihypertensiveDrug");
            return (Criteria) this;
        }

        public Criteria andAntihypertensiveDrugLessThanOrEqualTo(String value) {
            addCriterion("antihypertensive_drug <=", value, "antihypertensiveDrug");
            return (Criteria) this;
        }

        public Criteria andAntihypertensiveDrugLike(String value) {
            addCriterion("antihypertensive_drug like", value, "antihypertensiveDrug");
            return (Criteria) this;
        }

        public Criteria andAntihypertensiveDrugNotLike(String value) {
            addCriterion("antihypertensive_drug not like", value, "antihypertensiveDrug");
            return (Criteria) this;
        }

        public Criteria andAntihypertensiveDrugIn(List<String> values) {
            addCriterion("antihypertensive_drug in", values, "antihypertensiveDrug");
            return (Criteria) this;
        }

        public Criteria andAntihypertensiveDrugNotIn(List<String> values) {
            addCriterion("antihypertensive_drug not in", values, "antihypertensiveDrug");
            return (Criteria) this;
        }

        public Criteria andAntihypertensiveDrugBetween(String value1, String value2) {
            addCriterion("antihypertensive_drug between", value1, value2, "antihypertensiveDrug");
            return (Criteria) this;
        }

        public Criteria andAntihypertensiveDrugNotBetween(String value1, String value2) {
            addCriterion("antihypertensive_drug not between", value1, value2, "antihypertensiveDrug");
            return (Criteria) this;
        }

        public Criteria andLipidLoweringDrugIsNull() {
            addCriterion("lipid_lowering_drug is null");
            return (Criteria) this;
        }

        public Criteria andLipidLoweringDrugIsNotNull() {
            addCriterion("lipid_lowering_drug is not null");
            return (Criteria) this;
        }

        public Criteria andLipidLoweringDrugEqualTo(String value) {
            addCriterion("lipid_lowering_drug =", value, "lipidLoweringDrug");
            return (Criteria) this;
        }

        public Criteria andLipidLoweringDrugNotEqualTo(String value) {
            addCriterion("lipid_lowering_drug <>", value, "lipidLoweringDrug");
            return (Criteria) this;
        }

        public Criteria andLipidLoweringDrugGreaterThan(String value) {
            addCriterion("lipid_lowering_drug >", value, "lipidLoweringDrug");
            return (Criteria) this;
        }

        public Criteria andLipidLoweringDrugGreaterThanOrEqualTo(String value) {
            addCriterion("lipid_lowering_drug >=", value, "lipidLoweringDrug");
            return (Criteria) this;
        }

        public Criteria andLipidLoweringDrugLessThan(String value) {
            addCriterion("lipid_lowering_drug <", value, "lipidLoweringDrug");
            return (Criteria) this;
        }

        public Criteria andLipidLoweringDrugLessThanOrEqualTo(String value) {
            addCriterion("lipid_lowering_drug <=", value, "lipidLoweringDrug");
            return (Criteria) this;
        }

        public Criteria andLipidLoweringDrugLike(String value) {
            addCriterion("lipid_lowering_drug like", value, "lipidLoweringDrug");
            return (Criteria) this;
        }

        public Criteria andLipidLoweringDrugNotLike(String value) {
            addCriterion("lipid_lowering_drug not like", value, "lipidLoweringDrug");
            return (Criteria) this;
        }

        public Criteria andLipidLoweringDrugIn(List<String> values) {
            addCriterion("lipid_lowering_drug in", values, "lipidLoweringDrug");
            return (Criteria) this;
        }

        public Criteria andLipidLoweringDrugNotIn(List<String> values) {
            addCriterion("lipid_lowering_drug not in", values, "lipidLoweringDrug");
            return (Criteria) this;
        }

        public Criteria andLipidLoweringDrugBetween(String value1, String value2) {
            addCriterion("lipid_lowering_drug between", value1, value2, "lipidLoweringDrug");
            return (Criteria) this;
        }

        public Criteria andLipidLoweringDrugNotBetween(String value1, String value2) {
            addCriterion("lipid_lowering_drug not between", value1, value2, "lipidLoweringDrug");
            return (Criteria) this;
        }

        public Criteria andHypoglycemicAgentsIsNull() {
            addCriterion("hypoglycemic_agents is null");
            return (Criteria) this;
        }

        public Criteria andHypoglycemicAgentsIsNotNull() {
            addCriterion("hypoglycemic_agents is not null");
            return (Criteria) this;
        }

        public Criteria andHypoglycemicAgentsEqualTo(String value) {
            addCriterion("hypoglycemic_agents =", value, "hypoglycemicAgents");
            return (Criteria) this;
        }

        public Criteria andHypoglycemicAgentsNotEqualTo(String value) {
            addCriterion("hypoglycemic_agents <>", value, "hypoglycemicAgents");
            return (Criteria) this;
        }

        public Criteria andHypoglycemicAgentsGreaterThan(String value) {
            addCriterion("hypoglycemic_agents >", value, "hypoglycemicAgents");
            return (Criteria) this;
        }

        public Criteria andHypoglycemicAgentsGreaterThanOrEqualTo(String value) {
            addCriterion("hypoglycemic_agents >=", value, "hypoglycemicAgents");
            return (Criteria) this;
        }

        public Criteria andHypoglycemicAgentsLessThan(String value) {
            addCriterion("hypoglycemic_agents <", value, "hypoglycemicAgents");
            return (Criteria) this;
        }

        public Criteria andHypoglycemicAgentsLessThanOrEqualTo(String value) {
            addCriterion("hypoglycemic_agents <=", value, "hypoglycemicAgents");
            return (Criteria) this;
        }

        public Criteria andHypoglycemicAgentsLike(String value) {
            addCriterion("hypoglycemic_agents like", value, "hypoglycemicAgents");
            return (Criteria) this;
        }

        public Criteria andHypoglycemicAgentsNotLike(String value) {
            addCriterion("hypoglycemic_agents not like", value, "hypoglycemicAgents");
            return (Criteria) this;
        }

        public Criteria andHypoglycemicAgentsIn(List<String> values) {
            addCriterion("hypoglycemic_agents in", values, "hypoglycemicAgents");
            return (Criteria) this;
        }

        public Criteria andHypoglycemicAgentsNotIn(List<String> values) {
            addCriterion("hypoglycemic_agents not in", values, "hypoglycemicAgents");
            return (Criteria) this;
        }

        public Criteria andHypoglycemicAgentsBetween(String value1, String value2) {
            addCriterion("hypoglycemic_agents between", value1, value2, "hypoglycemicAgents");
            return (Criteria) this;
        }

        public Criteria andHypoglycemicAgentsNotBetween(String value1, String value2) {
            addCriterion("hypoglycemic_agents not between", value1, value2, "hypoglycemicAgents");
            return (Criteria) this;
        }

        public Criteria andAntiplateletDrugIsNull() {
            addCriterion("antiplatelet_drug is null");
            return (Criteria) this;
        }

        public Criteria andAntiplateletDrugIsNotNull() {
            addCriterion("antiplatelet_drug is not null");
            return (Criteria) this;
        }

        public Criteria andAntiplateletDrugEqualTo(String value) {
            addCriterion("antiplatelet_drug =", value, "antiplateletDrug");
            return (Criteria) this;
        }

        public Criteria andAntiplateletDrugNotEqualTo(String value) {
            addCriterion("antiplatelet_drug <>", value, "antiplateletDrug");
            return (Criteria) this;
        }

        public Criteria andAntiplateletDrugGreaterThan(String value) {
            addCriterion("antiplatelet_drug >", value, "antiplateletDrug");
            return (Criteria) this;
        }

        public Criteria andAntiplateletDrugGreaterThanOrEqualTo(String value) {
            addCriterion("antiplatelet_drug >=", value, "antiplateletDrug");
            return (Criteria) this;
        }

        public Criteria andAntiplateletDrugLessThan(String value) {
            addCriterion("antiplatelet_drug <", value, "antiplateletDrug");
            return (Criteria) this;
        }

        public Criteria andAntiplateletDrugLessThanOrEqualTo(String value) {
            addCriterion("antiplatelet_drug <=", value, "antiplateletDrug");
            return (Criteria) this;
        }

        public Criteria andAntiplateletDrugLike(String value) {
            addCriterion("antiplatelet_drug like", value, "antiplateletDrug");
            return (Criteria) this;
        }

        public Criteria andAntiplateletDrugNotLike(String value) {
            addCriterion("antiplatelet_drug not like", value, "antiplateletDrug");
            return (Criteria) this;
        }

        public Criteria andAntiplateletDrugIn(List<String> values) {
            addCriterion("antiplatelet_drug in", values, "antiplateletDrug");
            return (Criteria) this;
        }

        public Criteria andAntiplateletDrugNotIn(List<String> values) {
            addCriterion("antiplatelet_drug not in", values, "antiplateletDrug");
            return (Criteria) this;
        }

        public Criteria andAntiplateletDrugBetween(String value1, String value2) {
            addCriterion("antiplatelet_drug between", value1, value2, "antiplateletDrug");
            return (Criteria) this;
        }

        public Criteria andAntiplateletDrugNotBetween(String value1, String value2) {
            addCriterion("antiplatelet_drug not between", value1, value2, "antiplateletDrug");
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