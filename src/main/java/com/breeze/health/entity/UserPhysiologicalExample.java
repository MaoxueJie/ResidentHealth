package com.breeze.health.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserPhysiologicalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserPhysiologicalExample() {
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

        public Criteria andHeightIsNull() {
            addCriterion("height is null");
            return (Criteria) this;
        }

        public Criteria andHeightIsNotNull() {
            addCriterion("height is not null");
            return (Criteria) this;
        }

        public Criteria andHeightEqualTo(Float value) {
            addCriterion("height =", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotEqualTo(Float value) {
            addCriterion("height <>", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThan(Float value) {
            addCriterion("height >", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThanOrEqualTo(Float value) {
            addCriterion("height >=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThan(Float value) {
            addCriterion("height <", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThanOrEqualTo(Float value) {
            addCriterion("height <=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightIn(List<Float> values) {
            addCriterion("height in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotIn(List<Float> values) {
            addCriterion("height not in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightBetween(Float value1, Float value2) {
            addCriterion("height between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotBetween(Float value1, Float value2) {
            addCriterion("height not between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(Float value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(Float value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(Float value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(Float value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(Float value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(Float value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<Float> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<Float> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(Float value1, Float value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(Float value1, Float value2) {
            addCriterion("weight not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andAbdominalCircumferenceIsNull() {
            addCriterion("abdominal_circumference is null");
            return (Criteria) this;
        }

        public Criteria andAbdominalCircumferenceIsNotNull() {
            addCriterion("abdominal_circumference is not null");
            return (Criteria) this;
        }

        public Criteria andAbdominalCircumferenceEqualTo(Float value) {
            addCriterion("abdominal_circumference =", value, "abdominalCircumference");
            return (Criteria) this;
        }

        public Criteria andAbdominalCircumferenceNotEqualTo(Float value) {
            addCriterion("abdominal_circumference <>", value, "abdominalCircumference");
            return (Criteria) this;
        }

        public Criteria andAbdominalCircumferenceGreaterThan(Float value) {
            addCriterion("abdominal_circumference >", value, "abdominalCircumference");
            return (Criteria) this;
        }

        public Criteria andAbdominalCircumferenceGreaterThanOrEqualTo(Float value) {
            addCriterion("abdominal_circumference >=", value, "abdominalCircumference");
            return (Criteria) this;
        }

        public Criteria andAbdominalCircumferenceLessThan(Float value) {
            addCriterion("abdominal_circumference <", value, "abdominalCircumference");
            return (Criteria) this;
        }

        public Criteria andAbdominalCircumferenceLessThanOrEqualTo(Float value) {
            addCriterion("abdominal_circumference <=", value, "abdominalCircumference");
            return (Criteria) this;
        }

        public Criteria andAbdominalCircumferenceIn(List<Float> values) {
            addCriterion("abdominal_circumference in", values, "abdominalCircumference");
            return (Criteria) this;
        }

        public Criteria andAbdominalCircumferenceNotIn(List<Float> values) {
            addCriterion("abdominal_circumference not in", values, "abdominalCircumference");
            return (Criteria) this;
        }

        public Criteria andAbdominalCircumferenceBetween(Float value1, Float value2) {
            addCriterion("abdominal_circumference between", value1, value2, "abdominalCircumference");
            return (Criteria) this;
        }

        public Criteria andAbdominalCircumferenceNotBetween(Float value1, Float value2) {
            addCriterion("abdominal_circumference not between", value1, value2, "abdominalCircumference");
            return (Criteria) this;
        }

        public Criteria andHipCircumferenceIsNull() {
            addCriterion("hip_circumference is null");
            return (Criteria) this;
        }

        public Criteria andHipCircumferenceIsNotNull() {
            addCriterion("hip_circumference is not null");
            return (Criteria) this;
        }

        public Criteria andHipCircumferenceEqualTo(Float value) {
            addCriterion("hip_circumference =", value, "hipCircumference");
            return (Criteria) this;
        }

        public Criteria andHipCircumferenceNotEqualTo(Float value) {
            addCriterion("hip_circumference <>", value, "hipCircumference");
            return (Criteria) this;
        }

        public Criteria andHipCircumferenceGreaterThan(Float value) {
            addCriterion("hip_circumference >", value, "hipCircumference");
            return (Criteria) this;
        }

        public Criteria andHipCircumferenceGreaterThanOrEqualTo(Float value) {
            addCriterion("hip_circumference >=", value, "hipCircumference");
            return (Criteria) this;
        }

        public Criteria andHipCircumferenceLessThan(Float value) {
            addCriterion("hip_circumference <", value, "hipCircumference");
            return (Criteria) this;
        }

        public Criteria andHipCircumferenceLessThanOrEqualTo(Float value) {
            addCriterion("hip_circumference <=", value, "hipCircumference");
            return (Criteria) this;
        }

        public Criteria andHipCircumferenceIn(List<Float> values) {
            addCriterion("hip_circumference in", values, "hipCircumference");
            return (Criteria) this;
        }

        public Criteria andHipCircumferenceNotIn(List<Float> values) {
            addCriterion("hip_circumference not in", values, "hipCircumference");
            return (Criteria) this;
        }

        public Criteria andHipCircumferenceBetween(Float value1, Float value2) {
            addCriterion("hip_circumference between", value1, value2, "hipCircumference");
            return (Criteria) this;
        }

        public Criteria andHipCircumferenceNotBetween(Float value1, Float value2) {
            addCriterion("hip_circumference not between", value1, value2, "hipCircumference");
            return (Criteria) this;
        }

        public Criteria andHeartRateIsNull() {
            addCriterion("heart_rate is null");
            return (Criteria) this;
        }

        public Criteria andHeartRateIsNotNull() {
            addCriterion("heart_rate is not null");
            return (Criteria) this;
        }

        public Criteria andHeartRateEqualTo(Integer value) {
            addCriterion("heart_rate =", value, "heartRate");
            return (Criteria) this;
        }

        public Criteria andHeartRateNotEqualTo(Integer value) {
            addCriterion("heart_rate <>", value, "heartRate");
            return (Criteria) this;
        }

        public Criteria andHeartRateGreaterThan(Integer value) {
            addCriterion("heart_rate >", value, "heartRate");
            return (Criteria) this;
        }

        public Criteria andHeartRateGreaterThanOrEqualTo(Integer value) {
            addCriterion("heart_rate >=", value, "heartRate");
            return (Criteria) this;
        }

        public Criteria andHeartRateLessThan(Integer value) {
            addCriterion("heart_rate <", value, "heartRate");
            return (Criteria) this;
        }

        public Criteria andHeartRateLessThanOrEqualTo(Integer value) {
            addCriterion("heart_rate <=", value, "heartRate");
            return (Criteria) this;
        }

        public Criteria andHeartRateIn(List<Integer> values) {
            addCriterion("heart_rate in", values, "heartRate");
            return (Criteria) this;
        }

        public Criteria andHeartRateNotIn(List<Integer> values) {
            addCriterion("heart_rate not in", values, "heartRate");
            return (Criteria) this;
        }

        public Criteria andHeartRateBetween(Integer value1, Integer value2) {
            addCriterion("heart_rate between", value1, value2, "heartRate");
            return (Criteria) this;
        }

        public Criteria andHeartRateNotBetween(Integer value1, Integer value2) {
            addCriterion("heart_rate not between", value1, value2, "heartRate");
            return (Criteria) this;
        }

        public Criteria andBreatheRateIsNull() {
            addCriterion("breathe_rate is null");
            return (Criteria) this;
        }

        public Criteria andBreatheRateIsNotNull() {
            addCriterion("breathe_rate is not null");
            return (Criteria) this;
        }

        public Criteria andBreatheRateEqualTo(Integer value) {
            addCriterion("breathe_rate =", value, "breatheRate");
            return (Criteria) this;
        }

        public Criteria andBreatheRateNotEqualTo(Integer value) {
            addCriterion("breathe_rate <>", value, "breatheRate");
            return (Criteria) this;
        }

        public Criteria andBreatheRateGreaterThan(Integer value) {
            addCriterion("breathe_rate >", value, "breatheRate");
            return (Criteria) this;
        }

        public Criteria andBreatheRateGreaterThanOrEqualTo(Integer value) {
            addCriterion("breathe_rate >=", value, "breatheRate");
            return (Criteria) this;
        }

        public Criteria andBreatheRateLessThan(Integer value) {
            addCriterion("breathe_rate <", value, "breatheRate");
            return (Criteria) this;
        }

        public Criteria andBreatheRateLessThanOrEqualTo(Integer value) {
            addCriterion("breathe_rate <=", value, "breatheRate");
            return (Criteria) this;
        }

        public Criteria andBreatheRateIn(List<Integer> values) {
            addCriterion("breathe_rate in", values, "breatheRate");
            return (Criteria) this;
        }

        public Criteria andBreatheRateNotIn(List<Integer> values) {
            addCriterion("breathe_rate not in", values, "breatheRate");
            return (Criteria) this;
        }

        public Criteria andBreatheRateBetween(Integer value1, Integer value2) {
            addCriterion("breathe_rate between", value1, value2, "breatheRate");
            return (Criteria) this;
        }

        public Criteria andBreatheRateNotBetween(Integer value1, Integer value2) {
            addCriterion("breathe_rate not between", value1, value2, "breatheRate");
            return (Criteria) this;
        }

        public Criteria andTemperatureIsNull() {
            addCriterion("temperature is null");
            return (Criteria) this;
        }

        public Criteria andTemperatureIsNotNull() {
            addCriterion("temperature is not null");
            return (Criteria) this;
        }

        public Criteria andTemperatureEqualTo(Float value) {
            addCriterion("temperature =", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotEqualTo(Float value) {
            addCriterion("temperature <>", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureGreaterThan(Float value) {
            addCriterion("temperature >", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureGreaterThanOrEqualTo(Float value) {
            addCriterion("temperature >=", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureLessThan(Float value) {
            addCriterion("temperature <", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureLessThanOrEqualTo(Float value) {
            addCriterion("temperature <=", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureIn(List<Float> values) {
            addCriterion("temperature in", values, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotIn(List<Float> values) {
            addCriterion("temperature not in", values, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureBetween(Float value1, Float value2) {
            addCriterion("temperature between", value1, value2, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotBetween(Float value1, Float value2) {
            addCriterion("temperature not between", value1, value2, "temperature");
            return (Criteria) this;
        }

        public Criteria andBloodPressureIsNull() {
            addCriterion("blood_pressure is null");
            return (Criteria) this;
        }

        public Criteria andBloodPressureIsNotNull() {
            addCriterion("blood_pressure is not null");
            return (Criteria) this;
        }

        public Criteria andBloodPressureEqualTo(Integer value) {
            addCriterion("blood_pressure =", value, "bloodPressure");
            return (Criteria) this;
        }

        public Criteria andBloodPressureNotEqualTo(Integer value) {
            addCriterion("blood_pressure <>", value, "bloodPressure");
            return (Criteria) this;
        }

        public Criteria andBloodPressureGreaterThan(Integer value) {
            addCriterion("blood_pressure >", value, "bloodPressure");
            return (Criteria) this;
        }

        public Criteria andBloodPressureGreaterThanOrEqualTo(Integer value) {
            addCriterion("blood_pressure >=", value, "bloodPressure");
            return (Criteria) this;
        }

        public Criteria andBloodPressureLessThan(Integer value) {
            addCriterion("blood_pressure <", value, "bloodPressure");
            return (Criteria) this;
        }

        public Criteria andBloodPressureLessThanOrEqualTo(Integer value) {
            addCriterion("blood_pressure <=", value, "bloodPressure");
            return (Criteria) this;
        }

        public Criteria andBloodPressureIn(List<Integer> values) {
            addCriterion("blood_pressure in", values, "bloodPressure");
            return (Criteria) this;
        }

        public Criteria andBloodPressureNotIn(List<Integer> values) {
            addCriterion("blood_pressure not in", values, "bloodPressure");
            return (Criteria) this;
        }

        public Criteria andBloodPressureBetween(Integer value1, Integer value2) {
            addCriterion("blood_pressure between", value1, value2, "bloodPressure");
            return (Criteria) this;
        }

        public Criteria andBloodPressureNotBetween(Integer value1, Integer value2) {
            addCriterion("blood_pressure not between", value1, value2, "bloodPressure");
            return (Criteria) this;
        }

        public Criteria andBloodPressureSituationIsNull() {
            addCriterion("blood_pressure_situation is null");
            return (Criteria) this;
        }

        public Criteria andBloodPressureSituationIsNotNull() {
            addCriterion("blood_pressure_situation is not null");
            return (Criteria) this;
        }

        public Criteria andBloodPressureSituationEqualTo(Integer value) {
            addCriterion("blood_pressure_situation =", value, "bloodPressureSituation");
            return (Criteria) this;
        }

        public Criteria andBloodPressureSituationNotEqualTo(Integer value) {
            addCriterion("blood_pressure_situation <>", value, "bloodPressureSituation");
            return (Criteria) this;
        }

        public Criteria andBloodPressureSituationGreaterThan(Integer value) {
            addCriterion("blood_pressure_situation >", value, "bloodPressureSituation");
            return (Criteria) this;
        }

        public Criteria andBloodPressureSituationGreaterThanOrEqualTo(Integer value) {
            addCriterion("blood_pressure_situation >=", value, "bloodPressureSituation");
            return (Criteria) this;
        }

        public Criteria andBloodPressureSituationLessThan(Integer value) {
            addCriterion("blood_pressure_situation <", value, "bloodPressureSituation");
            return (Criteria) this;
        }

        public Criteria andBloodPressureSituationLessThanOrEqualTo(Integer value) {
            addCriterion("blood_pressure_situation <=", value, "bloodPressureSituation");
            return (Criteria) this;
        }

        public Criteria andBloodPressureSituationIn(List<Integer> values) {
            addCriterion("blood_pressure_situation in", values, "bloodPressureSituation");
            return (Criteria) this;
        }

        public Criteria andBloodPressureSituationNotIn(List<Integer> values) {
            addCriterion("blood_pressure_situation not in", values, "bloodPressureSituation");
            return (Criteria) this;
        }

        public Criteria andBloodPressureSituationBetween(Integer value1, Integer value2) {
            addCriterion("blood_pressure_situation between", value1, value2, "bloodPressureSituation");
            return (Criteria) this;
        }

        public Criteria andBloodPressureSituationNotBetween(Integer value1, Integer value2) {
            addCriterion("blood_pressure_situation not between", value1, value2, "bloodPressureSituation");
            return (Criteria) this;
        }

        public Criteria andBloodPressureVal1IsNull() {
            addCriterion("blood_pressure_val1 is null");
            return (Criteria) this;
        }

        public Criteria andBloodPressureVal1IsNotNull() {
            addCriterion("blood_pressure_val1 is not null");
            return (Criteria) this;
        }

        public Criteria andBloodPressureVal1EqualTo(Float value) {
            addCriterion("blood_pressure_val1 =", value, "bloodPressureVal1");
            return (Criteria) this;
        }

        public Criteria andBloodPressureVal1NotEqualTo(Float value) {
            addCriterion("blood_pressure_val1 <>", value, "bloodPressureVal1");
            return (Criteria) this;
        }

        public Criteria andBloodPressureVal1GreaterThan(Float value) {
            addCriterion("blood_pressure_val1 >", value, "bloodPressureVal1");
            return (Criteria) this;
        }

        public Criteria andBloodPressureVal1GreaterThanOrEqualTo(Float value) {
            addCriterion("blood_pressure_val1 >=", value, "bloodPressureVal1");
            return (Criteria) this;
        }

        public Criteria andBloodPressureVal1LessThan(Float value) {
            addCriterion("blood_pressure_val1 <", value, "bloodPressureVal1");
            return (Criteria) this;
        }

        public Criteria andBloodPressureVal1LessThanOrEqualTo(Float value) {
            addCriterion("blood_pressure_val1 <=", value, "bloodPressureVal1");
            return (Criteria) this;
        }

        public Criteria andBloodPressureVal1In(List<Float> values) {
            addCriterion("blood_pressure_val1 in", values, "bloodPressureVal1");
            return (Criteria) this;
        }

        public Criteria andBloodPressureVal1NotIn(List<Float> values) {
            addCriterion("blood_pressure_val1 not in", values, "bloodPressureVal1");
            return (Criteria) this;
        }

        public Criteria andBloodPressureVal1Between(Float value1, Float value2) {
            addCriterion("blood_pressure_val1 between", value1, value2, "bloodPressureVal1");
            return (Criteria) this;
        }

        public Criteria andBloodPressureVal1NotBetween(Float value1, Float value2) {
            addCriterion("blood_pressure_val1 not between", value1, value2, "bloodPressureVal1");
            return (Criteria) this;
        }

        public Criteria andBloodPressureVal2IsNull() {
            addCriterion("blood_pressure_val2 is null");
            return (Criteria) this;
        }

        public Criteria andBloodPressureVal2IsNotNull() {
            addCriterion("blood_pressure_val2 is not null");
            return (Criteria) this;
        }

        public Criteria andBloodPressureVal2EqualTo(Float value) {
            addCriterion("blood_pressure_val2 =", value, "bloodPressureVal2");
            return (Criteria) this;
        }

        public Criteria andBloodPressureVal2NotEqualTo(Float value) {
            addCriterion("blood_pressure_val2 <>", value, "bloodPressureVal2");
            return (Criteria) this;
        }

        public Criteria andBloodPressureVal2GreaterThan(Float value) {
            addCriterion("blood_pressure_val2 >", value, "bloodPressureVal2");
            return (Criteria) this;
        }

        public Criteria andBloodPressureVal2GreaterThanOrEqualTo(Float value) {
            addCriterion("blood_pressure_val2 >=", value, "bloodPressureVal2");
            return (Criteria) this;
        }

        public Criteria andBloodPressureVal2LessThan(Float value) {
            addCriterion("blood_pressure_val2 <", value, "bloodPressureVal2");
            return (Criteria) this;
        }

        public Criteria andBloodPressureVal2LessThanOrEqualTo(Float value) {
            addCriterion("blood_pressure_val2 <=", value, "bloodPressureVal2");
            return (Criteria) this;
        }

        public Criteria andBloodPressureVal2In(List<Float> values) {
            addCriterion("blood_pressure_val2 in", values, "bloodPressureVal2");
            return (Criteria) this;
        }

        public Criteria andBloodPressureVal2NotIn(List<Float> values) {
            addCriterion("blood_pressure_val2 not in", values, "bloodPressureVal2");
            return (Criteria) this;
        }

        public Criteria andBloodPressureVal2Between(Float value1, Float value2) {
            addCriterion("blood_pressure_val2 between", value1, value2, "bloodPressureVal2");
            return (Criteria) this;
        }

        public Criteria andBloodPressureVal2NotBetween(Float value1, Float value2) {
            addCriterion("blood_pressure_val2 not between", value1, value2, "bloodPressureVal2");
            return (Criteria) this;
        }

        public Criteria andBloodPressureVal3IsNull() {
            addCriterion("blood_pressure_val3 is null");
            return (Criteria) this;
        }

        public Criteria andBloodPressureVal3IsNotNull() {
            addCriterion("blood_pressure_val3 is not null");
            return (Criteria) this;
        }

        public Criteria andBloodPressureVal3EqualTo(Float value) {
            addCriterion("blood_pressure_val3 =", value, "bloodPressureVal3");
            return (Criteria) this;
        }

        public Criteria andBloodPressureVal3NotEqualTo(Float value) {
            addCriterion("blood_pressure_val3 <>", value, "bloodPressureVal3");
            return (Criteria) this;
        }

        public Criteria andBloodPressureVal3GreaterThan(Float value) {
            addCriterion("blood_pressure_val3 >", value, "bloodPressureVal3");
            return (Criteria) this;
        }

        public Criteria andBloodPressureVal3GreaterThanOrEqualTo(Float value) {
            addCriterion("blood_pressure_val3 >=", value, "bloodPressureVal3");
            return (Criteria) this;
        }

        public Criteria andBloodPressureVal3LessThan(Float value) {
            addCriterion("blood_pressure_val3 <", value, "bloodPressureVal3");
            return (Criteria) this;
        }

        public Criteria andBloodPressureVal3LessThanOrEqualTo(Float value) {
            addCriterion("blood_pressure_val3 <=", value, "bloodPressureVal3");
            return (Criteria) this;
        }

        public Criteria andBloodPressureVal3In(List<Float> values) {
            addCriterion("blood_pressure_val3 in", values, "bloodPressureVal3");
            return (Criteria) this;
        }

        public Criteria andBloodPressureVal3NotIn(List<Float> values) {
            addCriterion("blood_pressure_val3 not in", values, "bloodPressureVal3");
            return (Criteria) this;
        }

        public Criteria andBloodPressureVal3Between(Float value1, Float value2) {
            addCriterion("blood_pressure_val3 between", value1, value2, "bloodPressureVal3");
            return (Criteria) this;
        }

        public Criteria andBloodPressureVal3NotBetween(Float value1, Float value2) {
            addCriterion("blood_pressure_val3 not between", value1, value2, "bloodPressureVal3");
            return (Criteria) this;
        }

        public Criteria andBloodPressureVal4IsNull() {
            addCriterion("blood_pressure_val4 is null");
            return (Criteria) this;
        }

        public Criteria andBloodPressureVal4IsNotNull() {
            addCriterion("blood_pressure_val4 is not null");
            return (Criteria) this;
        }

        public Criteria andBloodPressureVal4EqualTo(Float value) {
            addCriterion("blood_pressure_val4 =", value, "bloodPressureVal4");
            return (Criteria) this;
        }

        public Criteria andBloodPressureVal4NotEqualTo(Float value) {
            addCriterion("blood_pressure_val4 <>", value, "bloodPressureVal4");
            return (Criteria) this;
        }

        public Criteria andBloodPressureVal4GreaterThan(Float value) {
            addCriterion("blood_pressure_val4 >", value, "bloodPressureVal4");
            return (Criteria) this;
        }

        public Criteria andBloodPressureVal4GreaterThanOrEqualTo(Float value) {
            addCriterion("blood_pressure_val4 >=", value, "bloodPressureVal4");
            return (Criteria) this;
        }

        public Criteria andBloodPressureVal4LessThan(Float value) {
            addCriterion("blood_pressure_val4 <", value, "bloodPressureVal4");
            return (Criteria) this;
        }

        public Criteria andBloodPressureVal4LessThanOrEqualTo(Float value) {
            addCriterion("blood_pressure_val4 <=", value, "bloodPressureVal4");
            return (Criteria) this;
        }

        public Criteria andBloodPressureVal4In(List<Float> values) {
            addCriterion("blood_pressure_val4 in", values, "bloodPressureVal4");
            return (Criteria) this;
        }

        public Criteria andBloodPressureVal4NotIn(List<Float> values) {
            addCriterion("blood_pressure_val4 not in", values, "bloodPressureVal4");
            return (Criteria) this;
        }

        public Criteria andBloodPressureVal4Between(Float value1, Float value2) {
            addCriterion("blood_pressure_val4 between", value1, value2, "bloodPressureVal4");
            return (Criteria) this;
        }

        public Criteria andBloodPressureVal4NotBetween(Float value1, Float value2) {
            addCriterion("blood_pressure_val4 not between", value1, value2, "bloodPressureVal4");
            return (Criteria) this;
        }

        public Criteria andBloodPressureVal5IsNull() {
            addCriterion("blood_pressure_val5 is null");
            return (Criteria) this;
        }

        public Criteria andBloodPressureVal5IsNotNull() {
            addCriterion("blood_pressure_val5 is not null");
            return (Criteria) this;
        }

        public Criteria andBloodPressureVal5EqualTo(Float value) {
            addCriterion("blood_pressure_val5 =", value, "bloodPressureVal5");
            return (Criteria) this;
        }

        public Criteria andBloodPressureVal5NotEqualTo(Float value) {
            addCriterion("blood_pressure_val5 <>", value, "bloodPressureVal5");
            return (Criteria) this;
        }

        public Criteria andBloodPressureVal5GreaterThan(Float value) {
            addCriterion("blood_pressure_val5 >", value, "bloodPressureVal5");
            return (Criteria) this;
        }

        public Criteria andBloodPressureVal5GreaterThanOrEqualTo(Float value) {
            addCriterion("blood_pressure_val5 >=", value, "bloodPressureVal5");
            return (Criteria) this;
        }

        public Criteria andBloodPressureVal5LessThan(Float value) {
            addCriterion("blood_pressure_val5 <", value, "bloodPressureVal5");
            return (Criteria) this;
        }

        public Criteria andBloodPressureVal5LessThanOrEqualTo(Float value) {
            addCriterion("blood_pressure_val5 <=", value, "bloodPressureVal5");
            return (Criteria) this;
        }

        public Criteria andBloodPressureVal5In(List<Float> values) {
            addCriterion("blood_pressure_val5 in", values, "bloodPressureVal5");
            return (Criteria) this;
        }

        public Criteria andBloodPressureVal5NotIn(List<Float> values) {
            addCriterion("blood_pressure_val5 not in", values, "bloodPressureVal5");
            return (Criteria) this;
        }

        public Criteria andBloodPressureVal5Between(Float value1, Float value2) {
            addCriterion("blood_pressure_val5 between", value1, value2, "bloodPressureVal5");
            return (Criteria) this;
        }

        public Criteria andBloodPressureVal5NotBetween(Float value1, Float value2) {
            addCriterion("blood_pressure_val5 not between", value1, value2, "bloodPressureVal5");
            return (Criteria) this;
        }

        public Criteria andBloodPressureVal6IsNull() {
            addCriterion("blood_pressure_val6 is null");
            return (Criteria) this;
        }

        public Criteria andBloodPressureVal6IsNotNull() {
            addCriterion("blood_pressure_val6 is not null");
            return (Criteria) this;
        }

        public Criteria andBloodPressureVal6EqualTo(Float value) {
            addCriterion("blood_pressure_val6 =", value, "bloodPressureVal6");
            return (Criteria) this;
        }

        public Criteria andBloodPressureVal6NotEqualTo(Float value) {
            addCriterion("blood_pressure_val6 <>", value, "bloodPressureVal6");
            return (Criteria) this;
        }

        public Criteria andBloodPressureVal6GreaterThan(Float value) {
            addCriterion("blood_pressure_val6 >", value, "bloodPressureVal6");
            return (Criteria) this;
        }

        public Criteria andBloodPressureVal6GreaterThanOrEqualTo(Float value) {
            addCriterion("blood_pressure_val6 >=", value, "bloodPressureVal6");
            return (Criteria) this;
        }

        public Criteria andBloodPressureVal6LessThan(Float value) {
            addCriterion("blood_pressure_val6 <", value, "bloodPressureVal6");
            return (Criteria) this;
        }

        public Criteria andBloodPressureVal6LessThanOrEqualTo(Float value) {
            addCriterion("blood_pressure_val6 <=", value, "bloodPressureVal6");
            return (Criteria) this;
        }

        public Criteria andBloodPressureVal6In(List<Float> values) {
            addCriterion("blood_pressure_val6 in", values, "bloodPressureVal6");
            return (Criteria) this;
        }

        public Criteria andBloodPressureVal6NotIn(List<Float> values) {
            addCriterion("blood_pressure_val6 not in", values, "bloodPressureVal6");
            return (Criteria) this;
        }

        public Criteria andBloodPressureVal6Between(Float value1, Float value2) {
            addCriterion("blood_pressure_val6 between", value1, value2, "bloodPressureVal6");
            return (Criteria) this;
        }

        public Criteria andBloodPressureVal6NotBetween(Float value1, Float value2) {
            addCriterion("blood_pressure_val6 not between", value1, value2, "bloodPressureVal6");
            return (Criteria) this;
        }

        public Criteria andBloodSugarIsNull() {
            addCriterion("blood_sugar is null");
            return (Criteria) this;
        }

        public Criteria andBloodSugarIsNotNull() {
            addCriterion("blood_sugar is not null");
            return (Criteria) this;
        }

        public Criteria andBloodSugarEqualTo(Integer value) {
            addCriterion("blood_sugar =", value, "bloodSugar");
            return (Criteria) this;
        }

        public Criteria andBloodSugarNotEqualTo(Integer value) {
            addCriterion("blood_sugar <>", value, "bloodSugar");
            return (Criteria) this;
        }

        public Criteria andBloodSugarGreaterThan(Integer value) {
            addCriterion("blood_sugar >", value, "bloodSugar");
            return (Criteria) this;
        }

        public Criteria andBloodSugarGreaterThanOrEqualTo(Integer value) {
            addCriterion("blood_sugar >=", value, "bloodSugar");
            return (Criteria) this;
        }

        public Criteria andBloodSugarLessThan(Integer value) {
            addCriterion("blood_sugar <", value, "bloodSugar");
            return (Criteria) this;
        }

        public Criteria andBloodSugarLessThanOrEqualTo(Integer value) {
            addCriterion("blood_sugar <=", value, "bloodSugar");
            return (Criteria) this;
        }

        public Criteria andBloodSugarIn(List<Integer> values) {
            addCriterion("blood_sugar in", values, "bloodSugar");
            return (Criteria) this;
        }

        public Criteria andBloodSugarNotIn(List<Integer> values) {
            addCriterion("blood_sugar not in", values, "bloodSugar");
            return (Criteria) this;
        }

        public Criteria andBloodSugarBetween(Integer value1, Integer value2) {
            addCriterion("blood_sugar between", value1, value2, "bloodSugar");
            return (Criteria) this;
        }

        public Criteria andBloodSugarNotBetween(Integer value1, Integer value2) {
            addCriterion("blood_sugar not between", value1, value2, "bloodSugar");
            return (Criteria) this;
        }

        public Criteria andBloodSugarSituationIsNull() {
            addCriterion("blood_sugar_situation is null");
            return (Criteria) this;
        }

        public Criteria andBloodSugarSituationIsNotNull() {
            addCriterion("blood_sugar_situation is not null");
            return (Criteria) this;
        }

        public Criteria andBloodSugarSituationEqualTo(Integer value) {
            addCriterion("blood_sugar_situation =", value, "bloodSugarSituation");
            return (Criteria) this;
        }

        public Criteria andBloodSugarSituationNotEqualTo(Integer value) {
            addCriterion("blood_sugar_situation <>", value, "bloodSugarSituation");
            return (Criteria) this;
        }

        public Criteria andBloodSugarSituationGreaterThan(Integer value) {
            addCriterion("blood_sugar_situation >", value, "bloodSugarSituation");
            return (Criteria) this;
        }

        public Criteria andBloodSugarSituationGreaterThanOrEqualTo(Integer value) {
            addCriterion("blood_sugar_situation >=", value, "bloodSugarSituation");
            return (Criteria) this;
        }

        public Criteria andBloodSugarSituationLessThan(Integer value) {
            addCriterion("blood_sugar_situation <", value, "bloodSugarSituation");
            return (Criteria) this;
        }

        public Criteria andBloodSugarSituationLessThanOrEqualTo(Integer value) {
            addCriterion("blood_sugar_situation <=", value, "bloodSugarSituation");
            return (Criteria) this;
        }

        public Criteria andBloodSugarSituationIn(List<Integer> values) {
            addCriterion("blood_sugar_situation in", values, "bloodSugarSituation");
            return (Criteria) this;
        }

        public Criteria andBloodSugarSituationNotIn(List<Integer> values) {
            addCriterion("blood_sugar_situation not in", values, "bloodSugarSituation");
            return (Criteria) this;
        }

        public Criteria andBloodSugarSituationBetween(Integer value1, Integer value2) {
            addCriterion("blood_sugar_situation between", value1, value2, "bloodSugarSituation");
            return (Criteria) this;
        }

        public Criteria andBloodSugarSituationNotBetween(Integer value1, Integer value2) {
            addCriterion("blood_sugar_situation not between", value1, value2, "bloodSugarSituation");
            return (Criteria) this;
        }

        public Criteria andBloodSugarVal1IsNull() {
            addCriterion("blood_sugar_val1 is null");
            return (Criteria) this;
        }

        public Criteria andBloodSugarVal1IsNotNull() {
            addCriterion("blood_sugar_val1 is not null");
            return (Criteria) this;
        }

        public Criteria andBloodSugarVal1EqualTo(Float value) {
            addCriterion("blood_sugar_val1 =", value, "bloodSugarVal1");
            return (Criteria) this;
        }

        public Criteria andBloodSugarVal1NotEqualTo(Float value) {
            addCriterion("blood_sugar_val1 <>", value, "bloodSugarVal1");
            return (Criteria) this;
        }

        public Criteria andBloodSugarVal1GreaterThan(Float value) {
            addCriterion("blood_sugar_val1 >", value, "bloodSugarVal1");
            return (Criteria) this;
        }

        public Criteria andBloodSugarVal1GreaterThanOrEqualTo(Float value) {
            addCriterion("blood_sugar_val1 >=", value, "bloodSugarVal1");
            return (Criteria) this;
        }

        public Criteria andBloodSugarVal1LessThan(Float value) {
            addCriterion("blood_sugar_val1 <", value, "bloodSugarVal1");
            return (Criteria) this;
        }

        public Criteria andBloodSugarVal1LessThanOrEqualTo(Float value) {
            addCriterion("blood_sugar_val1 <=", value, "bloodSugarVal1");
            return (Criteria) this;
        }

        public Criteria andBloodSugarVal1In(List<Float> values) {
            addCriterion("blood_sugar_val1 in", values, "bloodSugarVal1");
            return (Criteria) this;
        }

        public Criteria andBloodSugarVal1NotIn(List<Float> values) {
            addCriterion("blood_sugar_val1 not in", values, "bloodSugarVal1");
            return (Criteria) this;
        }

        public Criteria andBloodSugarVal1Between(Float value1, Float value2) {
            addCriterion("blood_sugar_val1 between", value1, value2, "bloodSugarVal1");
            return (Criteria) this;
        }

        public Criteria andBloodSugarVal1NotBetween(Float value1, Float value2) {
            addCriterion("blood_sugar_val1 not between", value1, value2, "bloodSugarVal1");
            return (Criteria) this;
        }

        public Criteria andBloodSugarVal2IsNull() {
            addCriterion("blood_sugar_val2 is null");
            return (Criteria) this;
        }

        public Criteria andBloodSugarVal2IsNotNull() {
            addCriterion("blood_sugar_val2 is not null");
            return (Criteria) this;
        }

        public Criteria andBloodSugarVal2EqualTo(Float value) {
            addCriterion("blood_sugar_val2 =", value, "bloodSugarVal2");
            return (Criteria) this;
        }

        public Criteria andBloodSugarVal2NotEqualTo(Float value) {
            addCriterion("blood_sugar_val2 <>", value, "bloodSugarVal2");
            return (Criteria) this;
        }

        public Criteria andBloodSugarVal2GreaterThan(Float value) {
            addCriterion("blood_sugar_val2 >", value, "bloodSugarVal2");
            return (Criteria) this;
        }

        public Criteria andBloodSugarVal2GreaterThanOrEqualTo(Float value) {
            addCriterion("blood_sugar_val2 >=", value, "bloodSugarVal2");
            return (Criteria) this;
        }

        public Criteria andBloodSugarVal2LessThan(Float value) {
            addCriterion("blood_sugar_val2 <", value, "bloodSugarVal2");
            return (Criteria) this;
        }

        public Criteria andBloodSugarVal2LessThanOrEqualTo(Float value) {
            addCriterion("blood_sugar_val2 <=", value, "bloodSugarVal2");
            return (Criteria) this;
        }

        public Criteria andBloodSugarVal2In(List<Float> values) {
            addCriterion("blood_sugar_val2 in", values, "bloodSugarVal2");
            return (Criteria) this;
        }

        public Criteria andBloodSugarVal2NotIn(List<Float> values) {
            addCriterion("blood_sugar_val2 not in", values, "bloodSugarVal2");
            return (Criteria) this;
        }

        public Criteria andBloodSugarVal2Between(Float value1, Float value2) {
            addCriterion("blood_sugar_val2 between", value1, value2, "bloodSugarVal2");
            return (Criteria) this;
        }

        public Criteria andBloodSugarVal2NotBetween(Float value1, Float value2) {
            addCriterion("blood_sugar_val2 not between", value1, value2, "bloodSugarVal2");
            return (Criteria) this;
        }

        public Criteria andBloodSugarVal3IsNull() {
            addCriterion("blood_sugar_val3 is null");
            return (Criteria) this;
        }

        public Criteria andBloodSugarVal3IsNotNull() {
            addCriterion("blood_sugar_val3 is not null");
            return (Criteria) this;
        }

        public Criteria andBloodSugarVal3EqualTo(Float value) {
            addCriterion("blood_sugar_val3 =", value, "bloodSugarVal3");
            return (Criteria) this;
        }

        public Criteria andBloodSugarVal3NotEqualTo(Float value) {
            addCriterion("blood_sugar_val3 <>", value, "bloodSugarVal3");
            return (Criteria) this;
        }

        public Criteria andBloodSugarVal3GreaterThan(Float value) {
            addCriterion("blood_sugar_val3 >", value, "bloodSugarVal3");
            return (Criteria) this;
        }

        public Criteria andBloodSugarVal3GreaterThanOrEqualTo(Float value) {
            addCriterion("blood_sugar_val3 >=", value, "bloodSugarVal3");
            return (Criteria) this;
        }

        public Criteria andBloodSugarVal3LessThan(Float value) {
            addCriterion("blood_sugar_val3 <", value, "bloodSugarVal3");
            return (Criteria) this;
        }

        public Criteria andBloodSugarVal3LessThanOrEqualTo(Float value) {
            addCriterion("blood_sugar_val3 <=", value, "bloodSugarVal3");
            return (Criteria) this;
        }

        public Criteria andBloodSugarVal3In(List<Float> values) {
            addCriterion("blood_sugar_val3 in", values, "bloodSugarVal3");
            return (Criteria) this;
        }

        public Criteria andBloodSugarVal3NotIn(List<Float> values) {
            addCriterion("blood_sugar_val3 not in", values, "bloodSugarVal3");
            return (Criteria) this;
        }

        public Criteria andBloodSugarVal3Between(Float value1, Float value2) {
            addCriterion("blood_sugar_val3 between", value1, value2, "bloodSugarVal3");
            return (Criteria) this;
        }

        public Criteria andBloodSugarVal3NotBetween(Float value1, Float value2) {
            addCriterion("blood_sugar_val3 not between", value1, value2, "bloodSugarVal3");
            return (Criteria) this;
        }

        public Criteria andBloodSugarVal4IsNull() {
            addCriterion("blood_sugar_val4 is null");
            return (Criteria) this;
        }

        public Criteria andBloodSugarVal4IsNotNull() {
            addCriterion("blood_sugar_val4 is not null");
            return (Criteria) this;
        }

        public Criteria andBloodSugarVal4EqualTo(Float value) {
            addCriterion("blood_sugar_val4 =", value, "bloodSugarVal4");
            return (Criteria) this;
        }

        public Criteria andBloodSugarVal4NotEqualTo(Float value) {
            addCriterion("blood_sugar_val4 <>", value, "bloodSugarVal4");
            return (Criteria) this;
        }

        public Criteria andBloodSugarVal4GreaterThan(Float value) {
            addCriterion("blood_sugar_val4 >", value, "bloodSugarVal4");
            return (Criteria) this;
        }

        public Criteria andBloodSugarVal4GreaterThanOrEqualTo(Float value) {
            addCriterion("blood_sugar_val4 >=", value, "bloodSugarVal4");
            return (Criteria) this;
        }

        public Criteria andBloodSugarVal4LessThan(Float value) {
            addCriterion("blood_sugar_val4 <", value, "bloodSugarVal4");
            return (Criteria) this;
        }

        public Criteria andBloodSugarVal4LessThanOrEqualTo(Float value) {
            addCriterion("blood_sugar_val4 <=", value, "bloodSugarVal4");
            return (Criteria) this;
        }

        public Criteria andBloodSugarVal4In(List<Float> values) {
            addCriterion("blood_sugar_val4 in", values, "bloodSugarVal4");
            return (Criteria) this;
        }

        public Criteria andBloodSugarVal4NotIn(List<Float> values) {
            addCriterion("blood_sugar_val4 not in", values, "bloodSugarVal4");
            return (Criteria) this;
        }

        public Criteria andBloodSugarVal4Between(Float value1, Float value2) {
            addCriterion("blood_sugar_val4 between", value1, value2, "bloodSugarVal4");
            return (Criteria) this;
        }

        public Criteria andBloodSugarVal4NotBetween(Float value1, Float value2) {
            addCriterion("blood_sugar_val4 not between", value1, value2, "bloodSugarVal4");
            return (Criteria) this;
        }

        public Criteria andBloodLipidIsNull() {
            addCriterion("blood_lipid is null");
            return (Criteria) this;
        }

        public Criteria andBloodLipidIsNotNull() {
            addCriterion("blood_lipid is not null");
            return (Criteria) this;
        }

        public Criteria andBloodLipidEqualTo(Integer value) {
            addCriterion("blood_lipid =", value, "bloodLipid");
            return (Criteria) this;
        }

        public Criteria andBloodLipidNotEqualTo(Integer value) {
            addCriterion("blood_lipid <>", value, "bloodLipid");
            return (Criteria) this;
        }

        public Criteria andBloodLipidGreaterThan(Integer value) {
            addCriterion("blood_lipid >", value, "bloodLipid");
            return (Criteria) this;
        }

        public Criteria andBloodLipidGreaterThanOrEqualTo(Integer value) {
            addCriterion("blood_lipid >=", value, "bloodLipid");
            return (Criteria) this;
        }

        public Criteria andBloodLipidLessThan(Integer value) {
            addCriterion("blood_lipid <", value, "bloodLipid");
            return (Criteria) this;
        }

        public Criteria andBloodLipidLessThanOrEqualTo(Integer value) {
            addCriterion("blood_lipid <=", value, "bloodLipid");
            return (Criteria) this;
        }

        public Criteria andBloodLipidIn(List<Integer> values) {
            addCriterion("blood_lipid in", values, "bloodLipid");
            return (Criteria) this;
        }

        public Criteria andBloodLipidNotIn(List<Integer> values) {
            addCriterion("blood_lipid not in", values, "bloodLipid");
            return (Criteria) this;
        }

        public Criteria andBloodLipidBetween(Integer value1, Integer value2) {
            addCriterion("blood_lipid between", value1, value2, "bloodLipid");
            return (Criteria) this;
        }

        public Criteria andBloodLipidNotBetween(Integer value1, Integer value2) {
            addCriterion("blood_lipid not between", value1, value2, "bloodLipid");
            return (Criteria) this;
        }

        public Criteria andBloodLipidSituationIsNull() {
            addCriterion("blood_lipid_situation is null");
            return (Criteria) this;
        }

        public Criteria andBloodLipidSituationIsNotNull() {
            addCriterion("blood_lipid_situation is not null");
            return (Criteria) this;
        }

        public Criteria andBloodLipidSituationEqualTo(Integer value) {
            addCriterion("blood_lipid_situation =", value, "bloodLipidSituation");
            return (Criteria) this;
        }

        public Criteria andBloodLipidSituationNotEqualTo(Integer value) {
            addCriterion("blood_lipid_situation <>", value, "bloodLipidSituation");
            return (Criteria) this;
        }

        public Criteria andBloodLipidSituationGreaterThan(Integer value) {
            addCriterion("blood_lipid_situation >", value, "bloodLipidSituation");
            return (Criteria) this;
        }

        public Criteria andBloodLipidSituationGreaterThanOrEqualTo(Integer value) {
            addCriterion("blood_lipid_situation >=", value, "bloodLipidSituation");
            return (Criteria) this;
        }

        public Criteria andBloodLipidSituationLessThan(Integer value) {
            addCriterion("blood_lipid_situation <", value, "bloodLipidSituation");
            return (Criteria) this;
        }

        public Criteria andBloodLipidSituationLessThanOrEqualTo(Integer value) {
            addCriterion("blood_lipid_situation <=", value, "bloodLipidSituation");
            return (Criteria) this;
        }

        public Criteria andBloodLipidSituationIn(List<Integer> values) {
            addCriterion("blood_lipid_situation in", values, "bloodLipidSituation");
            return (Criteria) this;
        }

        public Criteria andBloodLipidSituationNotIn(List<Integer> values) {
            addCriterion("blood_lipid_situation not in", values, "bloodLipidSituation");
            return (Criteria) this;
        }

        public Criteria andBloodLipidSituationBetween(Integer value1, Integer value2) {
            addCriterion("blood_lipid_situation between", value1, value2, "bloodLipidSituation");
            return (Criteria) this;
        }

        public Criteria andBloodLipidSituationNotBetween(Integer value1, Integer value2) {
            addCriterion("blood_lipid_situation not between", value1, value2, "bloodLipidSituation");
            return (Criteria) this;
        }

        public Criteria andBloodLipidVal1IsNull() {
            addCriterion("blood_lipid_val1 is null");
            return (Criteria) this;
        }

        public Criteria andBloodLipidVal1IsNotNull() {
            addCriterion("blood_lipid_val1 is not null");
            return (Criteria) this;
        }

        public Criteria andBloodLipidVal1EqualTo(Float value) {
            addCriterion("blood_lipid_val1 =", value, "bloodLipidVal1");
            return (Criteria) this;
        }

        public Criteria andBloodLipidVal1NotEqualTo(Float value) {
            addCriterion("blood_lipid_val1 <>", value, "bloodLipidVal1");
            return (Criteria) this;
        }

        public Criteria andBloodLipidVal1GreaterThan(Float value) {
            addCriterion("blood_lipid_val1 >", value, "bloodLipidVal1");
            return (Criteria) this;
        }

        public Criteria andBloodLipidVal1GreaterThanOrEqualTo(Float value) {
            addCriterion("blood_lipid_val1 >=", value, "bloodLipidVal1");
            return (Criteria) this;
        }

        public Criteria andBloodLipidVal1LessThan(Float value) {
            addCriterion("blood_lipid_val1 <", value, "bloodLipidVal1");
            return (Criteria) this;
        }

        public Criteria andBloodLipidVal1LessThanOrEqualTo(Float value) {
            addCriterion("blood_lipid_val1 <=", value, "bloodLipidVal1");
            return (Criteria) this;
        }

        public Criteria andBloodLipidVal1In(List<Float> values) {
            addCriterion("blood_lipid_val1 in", values, "bloodLipidVal1");
            return (Criteria) this;
        }

        public Criteria andBloodLipidVal1NotIn(List<Float> values) {
            addCriterion("blood_lipid_val1 not in", values, "bloodLipidVal1");
            return (Criteria) this;
        }

        public Criteria andBloodLipidVal1Between(Float value1, Float value2) {
            addCriterion("blood_lipid_val1 between", value1, value2, "bloodLipidVal1");
            return (Criteria) this;
        }

        public Criteria andBloodLipidVal1NotBetween(Float value1, Float value2) {
            addCriterion("blood_lipid_val1 not between", value1, value2, "bloodLipidVal1");
            return (Criteria) this;
        }

        public Criteria andBloodLipidVal2IsNull() {
            addCriterion("blood_lipid_val2 is null");
            return (Criteria) this;
        }

        public Criteria andBloodLipidVal2IsNotNull() {
            addCriterion("blood_lipid_val2 is not null");
            return (Criteria) this;
        }

        public Criteria andBloodLipidVal2EqualTo(Float value) {
            addCriterion("blood_lipid_val2 =", value, "bloodLipidVal2");
            return (Criteria) this;
        }

        public Criteria andBloodLipidVal2NotEqualTo(Float value) {
            addCriterion("blood_lipid_val2 <>", value, "bloodLipidVal2");
            return (Criteria) this;
        }

        public Criteria andBloodLipidVal2GreaterThan(Float value) {
            addCriterion("blood_lipid_val2 >", value, "bloodLipidVal2");
            return (Criteria) this;
        }

        public Criteria andBloodLipidVal2GreaterThanOrEqualTo(Float value) {
            addCriterion("blood_lipid_val2 >=", value, "bloodLipidVal2");
            return (Criteria) this;
        }

        public Criteria andBloodLipidVal2LessThan(Float value) {
            addCriterion("blood_lipid_val2 <", value, "bloodLipidVal2");
            return (Criteria) this;
        }

        public Criteria andBloodLipidVal2LessThanOrEqualTo(Float value) {
            addCriterion("blood_lipid_val2 <=", value, "bloodLipidVal2");
            return (Criteria) this;
        }

        public Criteria andBloodLipidVal2In(List<Float> values) {
            addCriterion("blood_lipid_val2 in", values, "bloodLipidVal2");
            return (Criteria) this;
        }

        public Criteria andBloodLipidVal2NotIn(List<Float> values) {
            addCriterion("blood_lipid_val2 not in", values, "bloodLipidVal2");
            return (Criteria) this;
        }

        public Criteria andBloodLipidVal2Between(Float value1, Float value2) {
            addCriterion("blood_lipid_val2 between", value1, value2, "bloodLipidVal2");
            return (Criteria) this;
        }

        public Criteria andBloodLipidVal2NotBetween(Float value1, Float value2) {
            addCriterion("blood_lipid_val2 not between", value1, value2, "bloodLipidVal2");
            return (Criteria) this;
        }

        public Criteria andBloodLipidVal3IsNull() {
            addCriterion("blood_lipid_val3 is null");
            return (Criteria) this;
        }

        public Criteria andBloodLipidVal3IsNotNull() {
            addCriterion("blood_lipid_val3 is not null");
            return (Criteria) this;
        }

        public Criteria andBloodLipidVal3EqualTo(Float value) {
            addCriterion("blood_lipid_val3 =", value, "bloodLipidVal3");
            return (Criteria) this;
        }

        public Criteria andBloodLipidVal3NotEqualTo(Float value) {
            addCriterion("blood_lipid_val3 <>", value, "bloodLipidVal3");
            return (Criteria) this;
        }

        public Criteria andBloodLipidVal3GreaterThan(Float value) {
            addCriterion("blood_lipid_val3 >", value, "bloodLipidVal3");
            return (Criteria) this;
        }

        public Criteria andBloodLipidVal3GreaterThanOrEqualTo(Float value) {
            addCriterion("blood_lipid_val3 >=", value, "bloodLipidVal3");
            return (Criteria) this;
        }

        public Criteria andBloodLipidVal3LessThan(Float value) {
            addCriterion("blood_lipid_val3 <", value, "bloodLipidVal3");
            return (Criteria) this;
        }

        public Criteria andBloodLipidVal3LessThanOrEqualTo(Float value) {
            addCriterion("blood_lipid_val3 <=", value, "bloodLipidVal3");
            return (Criteria) this;
        }

        public Criteria andBloodLipidVal3In(List<Float> values) {
            addCriterion("blood_lipid_val3 in", values, "bloodLipidVal3");
            return (Criteria) this;
        }

        public Criteria andBloodLipidVal3NotIn(List<Float> values) {
            addCriterion("blood_lipid_val3 not in", values, "bloodLipidVal3");
            return (Criteria) this;
        }

        public Criteria andBloodLipidVal3Between(Float value1, Float value2) {
            addCriterion("blood_lipid_val3 between", value1, value2, "bloodLipidVal3");
            return (Criteria) this;
        }

        public Criteria andBloodLipidVal3NotBetween(Float value1, Float value2) {
            addCriterion("blood_lipid_val3 not between", value1, value2, "bloodLipidVal3");
            return (Criteria) this;
        }

        public Criteria andBloodLipidVal4IsNull() {
            addCriterion("blood_lipid_val4 is null");
            return (Criteria) this;
        }

        public Criteria andBloodLipidVal4IsNotNull() {
            addCriterion("blood_lipid_val4 is not null");
            return (Criteria) this;
        }

        public Criteria andBloodLipidVal4EqualTo(Float value) {
            addCriterion("blood_lipid_val4 =", value, "bloodLipidVal4");
            return (Criteria) this;
        }

        public Criteria andBloodLipidVal4NotEqualTo(Float value) {
            addCriterion("blood_lipid_val4 <>", value, "bloodLipidVal4");
            return (Criteria) this;
        }

        public Criteria andBloodLipidVal4GreaterThan(Float value) {
            addCriterion("blood_lipid_val4 >", value, "bloodLipidVal4");
            return (Criteria) this;
        }

        public Criteria andBloodLipidVal4GreaterThanOrEqualTo(Float value) {
            addCriterion("blood_lipid_val4 >=", value, "bloodLipidVal4");
            return (Criteria) this;
        }

        public Criteria andBloodLipidVal4LessThan(Float value) {
            addCriterion("blood_lipid_val4 <", value, "bloodLipidVal4");
            return (Criteria) this;
        }

        public Criteria andBloodLipidVal4LessThanOrEqualTo(Float value) {
            addCriterion("blood_lipid_val4 <=", value, "bloodLipidVal4");
            return (Criteria) this;
        }

        public Criteria andBloodLipidVal4In(List<Float> values) {
            addCriterion("blood_lipid_val4 in", values, "bloodLipidVal4");
            return (Criteria) this;
        }

        public Criteria andBloodLipidVal4NotIn(List<Float> values) {
            addCriterion("blood_lipid_val4 not in", values, "bloodLipidVal4");
            return (Criteria) this;
        }

        public Criteria andBloodLipidVal4Between(Float value1, Float value2) {
            addCriterion("blood_lipid_val4 between", value1, value2, "bloodLipidVal4");
            return (Criteria) this;
        }

        public Criteria andBloodLipidVal4NotBetween(Float value1, Float value2) {
            addCriterion("blood_lipid_val4 not between", value1, value2, "bloodLipidVal4");
            return (Criteria) this;
        }

        public Criteria andUricAcidIsNull() {
            addCriterion("uric_acid is null");
            return (Criteria) this;
        }

        public Criteria andUricAcidIsNotNull() {
            addCriterion("uric_acid is not null");
            return (Criteria) this;
        }

        public Criteria andUricAcidEqualTo(Integer value) {
            addCriterion("uric_acid =", value, "uricAcid");
            return (Criteria) this;
        }

        public Criteria andUricAcidNotEqualTo(Integer value) {
            addCriterion("uric_acid <>", value, "uricAcid");
            return (Criteria) this;
        }

        public Criteria andUricAcidGreaterThan(Integer value) {
            addCriterion("uric_acid >", value, "uricAcid");
            return (Criteria) this;
        }

        public Criteria andUricAcidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uric_acid >=", value, "uricAcid");
            return (Criteria) this;
        }

        public Criteria andUricAcidLessThan(Integer value) {
            addCriterion("uric_acid <", value, "uricAcid");
            return (Criteria) this;
        }

        public Criteria andUricAcidLessThanOrEqualTo(Integer value) {
            addCriterion("uric_acid <=", value, "uricAcid");
            return (Criteria) this;
        }

        public Criteria andUricAcidIn(List<Integer> values) {
            addCriterion("uric_acid in", values, "uricAcid");
            return (Criteria) this;
        }

        public Criteria andUricAcidNotIn(List<Integer> values) {
            addCriterion("uric_acid not in", values, "uricAcid");
            return (Criteria) this;
        }

        public Criteria andUricAcidBetween(Integer value1, Integer value2) {
            addCriterion("uric_acid between", value1, value2, "uricAcid");
            return (Criteria) this;
        }

        public Criteria andUricAcidNotBetween(Integer value1, Integer value2) {
            addCriterion("uric_acid not between", value1, value2, "uricAcid");
            return (Criteria) this;
        }

        public Criteria andUricAcidSituationIsNull() {
            addCriterion("uric_acid_situation is null");
            return (Criteria) this;
        }

        public Criteria andUricAcidSituationIsNotNull() {
            addCriterion("uric_acid_situation is not null");
            return (Criteria) this;
        }

        public Criteria andUricAcidSituationEqualTo(Integer value) {
            addCriterion("uric_acid_situation =", value, "uricAcidSituation");
            return (Criteria) this;
        }

        public Criteria andUricAcidSituationNotEqualTo(Integer value) {
            addCriterion("uric_acid_situation <>", value, "uricAcidSituation");
            return (Criteria) this;
        }

        public Criteria andUricAcidSituationGreaterThan(Integer value) {
            addCriterion("uric_acid_situation >", value, "uricAcidSituation");
            return (Criteria) this;
        }

        public Criteria andUricAcidSituationGreaterThanOrEqualTo(Integer value) {
            addCriterion("uric_acid_situation >=", value, "uricAcidSituation");
            return (Criteria) this;
        }

        public Criteria andUricAcidSituationLessThan(Integer value) {
            addCriterion("uric_acid_situation <", value, "uricAcidSituation");
            return (Criteria) this;
        }

        public Criteria andUricAcidSituationLessThanOrEqualTo(Integer value) {
            addCriterion("uric_acid_situation <=", value, "uricAcidSituation");
            return (Criteria) this;
        }

        public Criteria andUricAcidSituationIn(List<Integer> values) {
            addCriterion("uric_acid_situation in", values, "uricAcidSituation");
            return (Criteria) this;
        }

        public Criteria andUricAcidSituationNotIn(List<Integer> values) {
            addCriterion("uric_acid_situation not in", values, "uricAcidSituation");
            return (Criteria) this;
        }

        public Criteria andUricAcidSituationBetween(Integer value1, Integer value2) {
            addCriterion("uric_acid_situation between", value1, value2, "uricAcidSituation");
            return (Criteria) this;
        }

        public Criteria andUricAcidSituationNotBetween(Integer value1, Integer value2) {
            addCriterion("uric_acid_situation not between", value1, value2, "uricAcidSituation");
            return (Criteria) this;
        }

        public Criteria andUricAcidValIsNull() {
            addCriterion("uric_acid_val is null");
            return (Criteria) this;
        }

        public Criteria andUricAcidValIsNotNull() {
            addCriterion("uric_acid_val is not null");
            return (Criteria) this;
        }

        public Criteria andUricAcidValEqualTo(Float value) {
            addCriterion("uric_acid_val =", value, "uricAcidVal");
            return (Criteria) this;
        }

        public Criteria andUricAcidValNotEqualTo(Float value) {
            addCriterion("uric_acid_val <>", value, "uricAcidVal");
            return (Criteria) this;
        }

        public Criteria andUricAcidValGreaterThan(Float value) {
            addCriterion("uric_acid_val >", value, "uricAcidVal");
            return (Criteria) this;
        }

        public Criteria andUricAcidValGreaterThanOrEqualTo(Float value) {
            addCriterion("uric_acid_val >=", value, "uricAcidVal");
            return (Criteria) this;
        }

        public Criteria andUricAcidValLessThan(Float value) {
            addCriterion("uric_acid_val <", value, "uricAcidVal");
            return (Criteria) this;
        }

        public Criteria andUricAcidValLessThanOrEqualTo(Float value) {
            addCriterion("uric_acid_val <=", value, "uricAcidVal");
            return (Criteria) this;
        }

        public Criteria andUricAcidValIn(List<Float> values) {
            addCriterion("uric_acid_val in", values, "uricAcidVal");
            return (Criteria) this;
        }

        public Criteria andUricAcidValNotIn(List<Float> values) {
            addCriterion("uric_acid_val not in", values, "uricAcidVal");
            return (Criteria) this;
        }

        public Criteria andUricAcidValBetween(Float value1, Float value2) {
            addCriterion("uric_acid_val between", value1, value2, "uricAcidVal");
            return (Criteria) this;
        }

        public Criteria andUricAcidValNotBetween(Float value1, Float value2) {
            addCriterion("uric_acid_val not between", value1, value2, "uricAcidVal");
            return (Criteria) this;
        }

        public Criteria andBloodOxygenIsNull() {
            addCriterion("blood_oxygen is null");
            return (Criteria) this;
        }

        public Criteria andBloodOxygenIsNotNull() {
            addCriterion("blood_oxygen is not null");
            return (Criteria) this;
        }

        public Criteria andBloodOxygenEqualTo(Integer value) {
            addCriterion("blood_oxygen =", value, "bloodOxygen");
            return (Criteria) this;
        }

        public Criteria andBloodOxygenNotEqualTo(Integer value) {
            addCriterion("blood_oxygen <>", value, "bloodOxygen");
            return (Criteria) this;
        }

        public Criteria andBloodOxygenGreaterThan(Integer value) {
            addCriterion("blood_oxygen >", value, "bloodOxygen");
            return (Criteria) this;
        }

        public Criteria andBloodOxygenGreaterThanOrEqualTo(Integer value) {
            addCriterion("blood_oxygen >=", value, "bloodOxygen");
            return (Criteria) this;
        }

        public Criteria andBloodOxygenLessThan(Integer value) {
            addCriterion("blood_oxygen <", value, "bloodOxygen");
            return (Criteria) this;
        }

        public Criteria andBloodOxygenLessThanOrEqualTo(Integer value) {
            addCriterion("blood_oxygen <=", value, "bloodOxygen");
            return (Criteria) this;
        }

        public Criteria andBloodOxygenIn(List<Integer> values) {
            addCriterion("blood_oxygen in", values, "bloodOxygen");
            return (Criteria) this;
        }

        public Criteria andBloodOxygenNotIn(List<Integer> values) {
            addCriterion("blood_oxygen not in", values, "bloodOxygen");
            return (Criteria) this;
        }

        public Criteria andBloodOxygenBetween(Integer value1, Integer value2) {
            addCriterion("blood_oxygen between", value1, value2, "bloodOxygen");
            return (Criteria) this;
        }

        public Criteria andBloodOxygenNotBetween(Integer value1, Integer value2) {
            addCriterion("blood_oxygen not between", value1, value2, "bloodOxygen");
            return (Criteria) this;
        }

        public Criteria andBloodOxygenSituationIsNull() {
            addCriterion("blood_oxygen_situation is null");
            return (Criteria) this;
        }

        public Criteria andBloodOxygenSituationIsNotNull() {
            addCriterion("blood_oxygen_situation is not null");
            return (Criteria) this;
        }

        public Criteria andBloodOxygenSituationEqualTo(Integer value) {
            addCriterion("blood_oxygen_situation =", value, "bloodOxygenSituation");
            return (Criteria) this;
        }

        public Criteria andBloodOxygenSituationNotEqualTo(Integer value) {
            addCriterion("blood_oxygen_situation <>", value, "bloodOxygenSituation");
            return (Criteria) this;
        }

        public Criteria andBloodOxygenSituationGreaterThan(Integer value) {
            addCriterion("blood_oxygen_situation >", value, "bloodOxygenSituation");
            return (Criteria) this;
        }

        public Criteria andBloodOxygenSituationGreaterThanOrEqualTo(Integer value) {
            addCriterion("blood_oxygen_situation >=", value, "bloodOxygenSituation");
            return (Criteria) this;
        }

        public Criteria andBloodOxygenSituationLessThan(Integer value) {
            addCriterion("blood_oxygen_situation <", value, "bloodOxygenSituation");
            return (Criteria) this;
        }

        public Criteria andBloodOxygenSituationLessThanOrEqualTo(Integer value) {
            addCriterion("blood_oxygen_situation <=", value, "bloodOxygenSituation");
            return (Criteria) this;
        }

        public Criteria andBloodOxygenSituationIn(List<Integer> values) {
            addCriterion("blood_oxygen_situation in", values, "bloodOxygenSituation");
            return (Criteria) this;
        }

        public Criteria andBloodOxygenSituationNotIn(List<Integer> values) {
            addCriterion("blood_oxygen_situation not in", values, "bloodOxygenSituation");
            return (Criteria) this;
        }

        public Criteria andBloodOxygenSituationBetween(Integer value1, Integer value2) {
            addCriterion("blood_oxygen_situation between", value1, value2, "bloodOxygenSituation");
            return (Criteria) this;
        }

        public Criteria andBloodOxygenSituationNotBetween(Integer value1, Integer value2) {
            addCriterion("blood_oxygen_situation not between", value1, value2, "bloodOxygenSituation");
            return (Criteria) this;
        }

        public Criteria andBloodOxygenValIsNull() {
            addCriterion("blood_oxygen_val is null");
            return (Criteria) this;
        }

        public Criteria andBloodOxygenValIsNotNull() {
            addCriterion("blood_oxygen_val is not null");
            return (Criteria) this;
        }

        public Criteria andBloodOxygenValEqualTo(Float value) {
            addCriterion("blood_oxygen_val =", value, "bloodOxygenVal");
            return (Criteria) this;
        }

        public Criteria andBloodOxygenValNotEqualTo(Float value) {
            addCriterion("blood_oxygen_val <>", value, "bloodOxygenVal");
            return (Criteria) this;
        }

        public Criteria andBloodOxygenValGreaterThan(Float value) {
            addCriterion("blood_oxygen_val >", value, "bloodOxygenVal");
            return (Criteria) this;
        }

        public Criteria andBloodOxygenValGreaterThanOrEqualTo(Float value) {
            addCriterion("blood_oxygen_val >=", value, "bloodOxygenVal");
            return (Criteria) this;
        }

        public Criteria andBloodOxygenValLessThan(Float value) {
            addCriterion("blood_oxygen_val <", value, "bloodOxygenVal");
            return (Criteria) this;
        }

        public Criteria andBloodOxygenValLessThanOrEqualTo(Float value) {
            addCriterion("blood_oxygen_val <=", value, "bloodOxygenVal");
            return (Criteria) this;
        }

        public Criteria andBloodOxygenValIn(List<Float> values) {
            addCriterion("blood_oxygen_val in", values, "bloodOxygenVal");
            return (Criteria) this;
        }

        public Criteria andBloodOxygenValNotIn(List<Float> values) {
            addCriterion("blood_oxygen_val not in", values, "bloodOxygenVal");
            return (Criteria) this;
        }

        public Criteria andBloodOxygenValBetween(Float value1, Float value2) {
            addCriterion("blood_oxygen_val between", value1, value2, "bloodOxygenVal");
            return (Criteria) this;
        }

        public Criteria andBloodOxygenValNotBetween(Float value1, Float value2) {
            addCriterion("blood_oxygen_val not between", value1, value2, "bloodOxygenVal");
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