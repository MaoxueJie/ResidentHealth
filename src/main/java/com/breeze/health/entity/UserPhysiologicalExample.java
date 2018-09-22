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

        public Criteria andBloodPressureEqualTo(Float value) {
            addCriterion("blood_pressure =", value, "bloodPressure");
            return (Criteria) this;
        }

        public Criteria andBloodPressureNotEqualTo(Float value) {
            addCriterion("blood_pressure <>", value, "bloodPressure");
            return (Criteria) this;
        }

        public Criteria andBloodPressureGreaterThan(Float value) {
            addCriterion("blood_pressure >", value, "bloodPressure");
            return (Criteria) this;
        }

        public Criteria andBloodPressureGreaterThanOrEqualTo(Float value) {
            addCriterion("blood_pressure >=", value, "bloodPressure");
            return (Criteria) this;
        }

        public Criteria andBloodPressureLessThan(Float value) {
            addCriterion("blood_pressure <", value, "bloodPressure");
            return (Criteria) this;
        }

        public Criteria andBloodPressureLessThanOrEqualTo(Float value) {
            addCriterion("blood_pressure <=", value, "bloodPressure");
            return (Criteria) this;
        }

        public Criteria andBloodPressureIn(List<Float> values) {
            addCriterion("blood_pressure in", values, "bloodPressure");
            return (Criteria) this;
        }

        public Criteria andBloodPressureNotIn(List<Float> values) {
            addCriterion("blood_pressure not in", values, "bloodPressure");
            return (Criteria) this;
        }

        public Criteria andBloodPressureBetween(Float value1, Float value2) {
            addCriterion("blood_pressure between", value1, value2, "bloodPressure");
            return (Criteria) this;
        }

        public Criteria andBloodPressureNotBetween(Float value1, Float value2) {
            addCriterion("blood_pressure not between", value1, value2, "bloodPressure");
            return (Criteria) this;
        }

        public Criteria andMeasuringFrequencyIsNull() {
            addCriterion("measuring_frequency is null");
            return (Criteria) this;
        }

        public Criteria andMeasuringFrequencyIsNotNull() {
            addCriterion("measuring_frequency is not null");
            return (Criteria) this;
        }

        public Criteria andMeasuringFrequencyEqualTo(Integer value) {
            addCriterion("measuring_frequency =", value, "measuringFrequency");
            return (Criteria) this;
        }

        public Criteria andMeasuringFrequencyNotEqualTo(Integer value) {
            addCriterion("measuring_frequency <>", value, "measuringFrequency");
            return (Criteria) this;
        }

        public Criteria andMeasuringFrequencyGreaterThan(Integer value) {
            addCriterion("measuring_frequency >", value, "measuringFrequency");
            return (Criteria) this;
        }

        public Criteria andMeasuringFrequencyGreaterThanOrEqualTo(Integer value) {
            addCriterion("measuring_frequency >=", value, "measuringFrequency");
            return (Criteria) this;
        }

        public Criteria andMeasuringFrequencyLessThan(Integer value) {
            addCriterion("measuring_frequency <", value, "measuringFrequency");
            return (Criteria) this;
        }

        public Criteria andMeasuringFrequencyLessThanOrEqualTo(Integer value) {
            addCriterion("measuring_frequency <=", value, "measuringFrequency");
            return (Criteria) this;
        }

        public Criteria andMeasuringFrequencyIn(List<Integer> values) {
            addCriterion("measuring_frequency in", values, "measuringFrequency");
            return (Criteria) this;
        }

        public Criteria andMeasuringFrequencyNotIn(List<Integer> values) {
            addCriterion("measuring_frequency not in", values, "measuringFrequency");
            return (Criteria) this;
        }

        public Criteria andMeasuringFrequencyBetween(Integer value1, Integer value2) {
            addCriterion("measuring_frequency between", value1, value2, "measuringFrequency");
            return (Criteria) this;
        }

        public Criteria andMeasuringFrequencyNotBetween(Integer value1, Integer value2) {
            addCriterion("measuring_frequency not between", value1, value2, "measuringFrequency");
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

        public Criteria andBloodSugarMinValueIsNull() {
            addCriterion("blood_sugar_min_value is null");
            return (Criteria) this;
        }

        public Criteria andBloodSugarMinValueIsNotNull() {
            addCriterion("blood_sugar_min_value is not null");
            return (Criteria) this;
        }

        public Criteria andBloodSugarMinValueEqualTo(Float value) {
            addCriterion("blood_sugar_min_value =", value, "bloodSugarMinValue");
            return (Criteria) this;
        }

        public Criteria andBloodSugarMinValueNotEqualTo(Float value) {
            addCriterion("blood_sugar_min_value <>", value, "bloodSugarMinValue");
            return (Criteria) this;
        }

        public Criteria andBloodSugarMinValueGreaterThan(Float value) {
            addCriterion("blood_sugar_min_value >", value, "bloodSugarMinValue");
            return (Criteria) this;
        }

        public Criteria andBloodSugarMinValueGreaterThanOrEqualTo(Float value) {
            addCriterion("blood_sugar_min_value >=", value, "bloodSugarMinValue");
            return (Criteria) this;
        }

        public Criteria andBloodSugarMinValueLessThan(Float value) {
            addCriterion("blood_sugar_min_value <", value, "bloodSugarMinValue");
            return (Criteria) this;
        }

        public Criteria andBloodSugarMinValueLessThanOrEqualTo(Float value) {
            addCriterion("blood_sugar_min_value <=", value, "bloodSugarMinValue");
            return (Criteria) this;
        }

        public Criteria andBloodSugarMinValueIn(List<Float> values) {
            addCriterion("blood_sugar_min_value in", values, "bloodSugarMinValue");
            return (Criteria) this;
        }

        public Criteria andBloodSugarMinValueNotIn(List<Float> values) {
            addCriterion("blood_sugar_min_value not in", values, "bloodSugarMinValue");
            return (Criteria) this;
        }

        public Criteria andBloodSugarMinValueBetween(Float value1, Float value2) {
            addCriterion("blood_sugar_min_value between", value1, value2, "bloodSugarMinValue");
            return (Criteria) this;
        }

        public Criteria andBloodSugarMinValueNotBetween(Float value1, Float value2) {
            addCriterion("blood_sugar_min_value not between", value1, value2, "bloodSugarMinValue");
            return (Criteria) this;
        }

        public Criteria andBloodSugarMaxValueIsNull() {
            addCriterion("blood_sugar_max_value is null");
            return (Criteria) this;
        }

        public Criteria andBloodSugarMaxValueIsNotNull() {
            addCriterion("blood_sugar_max_value is not null");
            return (Criteria) this;
        }

        public Criteria andBloodSugarMaxValueEqualTo(Float value) {
            addCriterion("blood_sugar_max_value =", value, "bloodSugarMaxValue");
            return (Criteria) this;
        }

        public Criteria andBloodSugarMaxValueNotEqualTo(Float value) {
            addCriterion("blood_sugar_max_value <>", value, "bloodSugarMaxValue");
            return (Criteria) this;
        }

        public Criteria andBloodSugarMaxValueGreaterThan(Float value) {
            addCriterion("blood_sugar_max_value >", value, "bloodSugarMaxValue");
            return (Criteria) this;
        }

        public Criteria andBloodSugarMaxValueGreaterThanOrEqualTo(Float value) {
            addCriterion("blood_sugar_max_value >=", value, "bloodSugarMaxValue");
            return (Criteria) this;
        }

        public Criteria andBloodSugarMaxValueLessThan(Float value) {
            addCriterion("blood_sugar_max_value <", value, "bloodSugarMaxValue");
            return (Criteria) this;
        }

        public Criteria andBloodSugarMaxValueLessThanOrEqualTo(Float value) {
            addCriterion("blood_sugar_max_value <=", value, "bloodSugarMaxValue");
            return (Criteria) this;
        }

        public Criteria andBloodSugarMaxValueIn(List<Float> values) {
            addCriterion("blood_sugar_max_value in", values, "bloodSugarMaxValue");
            return (Criteria) this;
        }

        public Criteria andBloodSugarMaxValueNotIn(List<Float> values) {
            addCriterion("blood_sugar_max_value not in", values, "bloodSugarMaxValue");
            return (Criteria) this;
        }

        public Criteria andBloodSugarMaxValueBetween(Float value1, Float value2) {
            addCriterion("blood_sugar_max_value between", value1, value2, "bloodSugarMaxValue");
            return (Criteria) this;
        }

        public Criteria andBloodSugarMaxValueNotBetween(Float value1, Float value2) {
            addCriterion("blood_sugar_max_value not between", value1, value2, "bloodSugarMaxValue");
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

        public Criteria andBloodLipidValueIsNull() {
            addCriterion("blood_lipid_value is null");
            return (Criteria) this;
        }

        public Criteria andBloodLipidValueIsNotNull() {
            addCriterion("blood_lipid_value is not null");
            return (Criteria) this;
        }

        public Criteria andBloodLipidValueEqualTo(Float value) {
            addCriterion("blood_lipid_value =", value, "bloodLipidValue");
            return (Criteria) this;
        }

        public Criteria andBloodLipidValueNotEqualTo(Float value) {
            addCriterion("blood_lipid_value <>", value, "bloodLipidValue");
            return (Criteria) this;
        }

        public Criteria andBloodLipidValueGreaterThan(Float value) {
            addCriterion("blood_lipid_value >", value, "bloodLipidValue");
            return (Criteria) this;
        }

        public Criteria andBloodLipidValueGreaterThanOrEqualTo(Float value) {
            addCriterion("blood_lipid_value >=", value, "bloodLipidValue");
            return (Criteria) this;
        }

        public Criteria andBloodLipidValueLessThan(Float value) {
            addCriterion("blood_lipid_value <", value, "bloodLipidValue");
            return (Criteria) this;
        }

        public Criteria andBloodLipidValueLessThanOrEqualTo(Float value) {
            addCriterion("blood_lipid_value <=", value, "bloodLipidValue");
            return (Criteria) this;
        }

        public Criteria andBloodLipidValueIn(List<Float> values) {
            addCriterion("blood_lipid_value in", values, "bloodLipidValue");
            return (Criteria) this;
        }

        public Criteria andBloodLipidValueNotIn(List<Float> values) {
            addCriterion("blood_lipid_value not in", values, "bloodLipidValue");
            return (Criteria) this;
        }

        public Criteria andBloodLipidValueBetween(Float value1, Float value2) {
            addCriterion("blood_lipid_value between", value1, value2, "bloodLipidValue");
            return (Criteria) this;
        }

        public Criteria andBloodLipidValueNotBetween(Float value1, Float value2) {
            addCriterion("blood_lipid_value not between", value1, value2, "bloodLipidValue");
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

        public Criteria andUricAcidEqualTo(Float value) {
            addCriterion("uric_acid =", value, "uricAcid");
            return (Criteria) this;
        }

        public Criteria andUricAcidNotEqualTo(Float value) {
            addCriterion("uric_acid <>", value, "uricAcid");
            return (Criteria) this;
        }

        public Criteria andUricAcidGreaterThan(Float value) {
            addCriterion("uric_acid >", value, "uricAcid");
            return (Criteria) this;
        }

        public Criteria andUricAcidGreaterThanOrEqualTo(Float value) {
            addCriterion("uric_acid >=", value, "uricAcid");
            return (Criteria) this;
        }

        public Criteria andUricAcidLessThan(Float value) {
            addCriterion("uric_acid <", value, "uricAcid");
            return (Criteria) this;
        }

        public Criteria andUricAcidLessThanOrEqualTo(Float value) {
            addCriterion("uric_acid <=", value, "uricAcid");
            return (Criteria) this;
        }

        public Criteria andUricAcidIn(List<Float> values) {
            addCriterion("uric_acid in", values, "uricAcid");
            return (Criteria) this;
        }

        public Criteria andUricAcidNotIn(List<Float> values) {
            addCriterion("uric_acid not in", values, "uricAcid");
            return (Criteria) this;
        }

        public Criteria andUricAcidBetween(Float value1, Float value2) {
            addCriterion("uric_acid between", value1, value2, "uricAcid");
            return (Criteria) this;
        }

        public Criteria andUricAcidNotBetween(Float value1, Float value2) {
            addCriterion("uric_acid not between", value1, value2, "uricAcid");
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

        public Criteria andBloodOxygenEqualTo(Float value) {
            addCriterion("blood_oxygen =", value, "bloodOxygen");
            return (Criteria) this;
        }

        public Criteria andBloodOxygenNotEqualTo(Float value) {
            addCriterion("blood_oxygen <>", value, "bloodOxygen");
            return (Criteria) this;
        }

        public Criteria andBloodOxygenGreaterThan(Float value) {
            addCriterion("blood_oxygen >", value, "bloodOxygen");
            return (Criteria) this;
        }

        public Criteria andBloodOxygenGreaterThanOrEqualTo(Float value) {
            addCriterion("blood_oxygen >=", value, "bloodOxygen");
            return (Criteria) this;
        }

        public Criteria andBloodOxygenLessThan(Float value) {
            addCriterion("blood_oxygen <", value, "bloodOxygen");
            return (Criteria) this;
        }

        public Criteria andBloodOxygenLessThanOrEqualTo(Float value) {
            addCriterion("blood_oxygen <=", value, "bloodOxygen");
            return (Criteria) this;
        }

        public Criteria andBloodOxygenIn(List<Float> values) {
            addCriterion("blood_oxygen in", values, "bloodOxygen");
            return (Criteria) this;
        }

        public Criteria andBloodOxygenNotIn(List<Float> values) {
            addCriterion("blood_oxygen not in", values, "bloodOxygen");
            return (Criteria) this;
        }

        public Criteria andBloodOxygenBetween(Float value1, Float value2) {
            addCriterion("blood_oxygen between", value1, value2, "bloodOxygen");
            return (Criteria) this;
        }

        public Criteria andBloodOxygenNotBetween(Float value1, Float value2) {
            addCriterion("blood_oxygen not between", value1, value2, "bloodOxygen");
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