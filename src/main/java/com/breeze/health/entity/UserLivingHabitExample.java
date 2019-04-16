package com.breeze.health.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserLivingHabitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserLivingHabitExample() {
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

        public Criteria andLivingIdIsNull() {
            addCriterion("living_id is null");
            return (Criteria) this;
        }

        public Criteria andLivingIdIsNotNull() {
            addCriterion("living_id is not null");
            return (Criteria) this;
        }

        public Criteria andLivingIdEqualTo(Long value) {
            addCriterion("living_id =", value, "livingId");
            return (Criteria) this;
        }

        public Criteria andLivingIdNotEqualTo(Long value) {
            addCriterion("living_id <>", value, "livingId");
            return (Criteria) this;
        }

        public Criteria andLivingIdGreaterThan(Long value) {
            addCriterion("living_id >", value, "livingId");
            return (Criteria) this;
        }

        public Criteria andLivingIdGreaterThanOrEqualTo(Long value) {
            addCriterion("living_id >=", value, "livingId");
            return (Criteria) this;
        }

        public Criteria andLivingIdLessThan(Long value) {
            addCriterion("living_id <", value, "livingId");
            return (Criteria) this;
        }

        public Criteria andLivingIdLessThanOrEqualTo(Long value) {
            addCriterion("living_id <=", value, "livingId");
            return (Criteria) this;
        }

        public Criteria andLivingIdIn(List<Long> values) {
            addCriterion("living_id in", values, "livingId");
            return (Criteria) this;
        }

        public Criteria andLivingIdNotIn(List<Long> values) {
            addCriterion("living_id not in", values, "livingId");
            return (Criteria) this;
        }

        public Criteria andLivingIdBetween(Long value1, Long value2) {
            addCriterion("living_id between", value1, value2, "livingId");
            return (Criteria) this;
        }

        public Criteria andLivingIdNotBetween(Long value1, Long value2) {
            addCriterion("living_id not between", value1, value2, "livingId");
            return (Criteria) this;
        }

        public Criteria andSmokingIsNull() {
            addCriterion("smoking is null");
            return (Criteria) this;
        }

        public Criteria andSmokingIsNotNull() {
            addCriterion("smoking is not null");
            return (Criteria) this;
        }

        public Criteria andSmokingEqualTo(Integer value) {
            addCriterion("smoking =", value, "smoking");
            return (Criteria) this;
        }

        public Criteria andSmokingNotEqualTo(Integer value) {
            addCriterion("smoking <>", value, "smoking");
            return (Criteria) this;
        }

        public Criteria andSmokingGreaterThan(Integer value) {
            addCriterion("smoking >", value, "smoking");
            return (Criteria) this;
        }

        public Criteria andSmokingGreaterThanOrEqualTo(Integer value) {
            addCriterion("smoking >=", value, "smoking");
            return (Criteria) this;
        }

        public Criteria andSmokingLessThan(Integer value) {
            addCriterion("smoking <", value, "smoking");
            return (Criteria) this;
        }

        public Criteria andSmokingLessThanOrEqualTo(Integer value) {
            addCriterion("smoking <=", value, "smoking");
            return (Criteria) this;
        }

        public Criteria andSmokingIn(List<Integer> values) {
            addCriterion("smoking in", values, "smoking");
            return (Criteria) this;
        }

        public Criteria andSmokingNotIn(List<Integer> values) {
            addCriterion("smoking not in", values, "smoking");
            return (Criteria) this;
        }

        public Criteria andSmokingBetween(Integer value1, Integer value2) {
            addCriterion("smoking between", value1, value2, "smoking");
            return (Criteria) this;
        }

        public Criteria andSmokingNotBetween(Integer value1, Integer value2) {
            addCriterion("smoking not between", value1, value2, "smoking");
            return (Criteria) this;
        }

        public Criteria andSmokingVal1IsNull() {
            addCriterion("smoking_val1 is null");
            return (Criteria) this;
        }

        public Criteria andSmokingVal1IsNotNull() {
            addCriterion("smoking_val1 is not null");
            return (Criteria) this;
        }

        public Criteria andSmokingVal1EqualTo(Float value) {
            addCriterion("smoking_val1 =", value, "smokingVal1");
            return (Criteria) this;
        }

        public Criteria andSmokingVal1NotEqualTo(Float value) {
            addCriterion("smoking_val1 <>", value, "smokingVal1");
            return (Criteria) this;
        }

        public Criteria andSmokingVal1GreaterThan(Float value) {
            addCriterion("smoking_val1 >", value, "smokingVal1");
            return (Criteria) this;
        }

        public Criteria andSmokingVal1GreaterThanOrEqualTo(Float value) {
            addCriterion("smoking_val1 >=", value, "smokingVal1");
            return (Criteria) this;
        }

        public Criteria andSmokingVal1LessThan(Float value) {
            addCriterion("smoking_val1 <", value, "smokingVal1");
            return (Criteria) this;
        }

        public Criteria andSmokingVal1LessThanOrEqualTo(Float value) {
            addCriterion("smoking_val1 <=", value, "smokingVal1");
            return (Criteria) this;
        }

        public Criteria andSmokingVal1In(List<Float> values) {
            addCriterion("smoking_val1 in", values, "smokingVal1");
            return (Criteria) this;
        }

        public Criteria andSmokingVal1NotIn(List<Float> values) {
            addCriterion("smoking_val1 not in", values, "smokingVal1");
            return (Criteria) this;
        }

        public Criteria andSmokingVal1Between(Float value1, Float value2) {
            addCriterion("smoking_val1 between", value1, value2, "smokingVal1");
            return (Criteria) this;
        }

        public Criteria andSmokingVal1NotBetween(Float value1, Float value2) {
            addCriterion("smoking_val1 not between", value1, value2, "smokingVal1");
            return (Criteria) this;
        }

        public Criteria andSmokingVal2IsNull() {
            addCriterion("smoking_val2 is null");
            return (Criteria) this;
        }

        public Criteria andSmokingVal2IsNotNull() {
            addCriterion("smoking_val2 is not null");
            return (Criteria) this;
        }

        public Criteria andSmokingVal2EqualTo(Float value) {
            addCriterion("smoking_val2 =", value, "smokingVal2");
            return (Criteria) this;
        }

        public Criteria andSmokingVal2NotEqualTo(Float value) {
            addCriterion("smoking_val2 <>", value, "smokingVal2");
            return (Criteria) this;
        }

        public Criteria andSmokingVal2GreaterThan(Float value) {
            addCriterion("smoking_val2 >", value, "smokingVal2");
            return (Criteria) this;
        }

        public Criteria andSmokingVal2GreaterThanOrEqualTo(Float value) {
            addCriterion("smoking_val2 >=", value, "smokingVal2");
            return (Criteria) this;
        }

        public Criteria andSmokingVal2LessThan(Float value) {
            addCriterion("smoking_val2 <", value, "smokingVal2");
            return (Criteria) this;
        }

        public Criteria andSmokingVal2LessThanOrEqualTo(Float value) {
            addCriterion("smoking_val2 <=", value, "smokingVal2");
            return (Criteria) this;
        }

        public Criteria andSmokingVal2In(List<Float> values) {
            addCriterion("smoking_val2 in", values, "smokingVal2");
            return (Criteria) this;
        }

        public Criteria andSmokingVal2NotIn(List<Float> values) {
            addCriterion("smoking_val2 not in", values, "smokingVal2");
            return (Criteria) this;
        }

        public Criteria andSmokingVal2Between(Float value1, Float value2) {
            addCriterion("smoking_val2 between", value1, value2, "smokingVal2");
            return (Criteria) this;
        }

        public Criteria andSmokingVal2NotBetween(Float value1, Float value2) {
            addCriterion("smoking_val2 not between", value1, value2, "smokingVal2");
            return (Criteria) this;
        }

        public Criteria andSmokingVal3IsNull() {
            addCriterion("smoking_val3 is null");
            return (Criteria) this;
        }

        public Criteria andSmokingVal3IsNotNull() {
            addCriterion("smoking_val3 is not null");
            return (Criteria) this;
        }

        public Criteria andSmokingVal3EqualTo(Float value) {
            addCriterion("smoking_val3 =", value, "smokingVal3");
            return (Criteria) this;
        }

        public Criteria andSmokingVal3NotEqualTo(Float value) {
            addCriterion("smoking_val3 <>", value, "smokingVal3");
            return (Criteria) this;
        }

        public Criteria andSmokingVal3GreaterThan(Float value) {
            addCriterion("smoking_val3 >", value, "smokingVal3");
            return (Criteria) this;
        }

        public Criteria andSmokingVal3GreaterThanOrEqualTo(Float value) {
            addCriterion("smoking_val3 >=", value, "smokingVal3");
            return (Criteria) this;
        }

        public Criteria andSmokingVal3LessThan(Float value) {
            addCriterion("smoking_val3 <", value, "smokingVal3");
            return (Criteria) this;
        }

        public Criteria andSmokingVal3LessThanOrEqualTo(Float value) {
            addCriterion("smoking_val3 <=", value, "smokingVal3");
            return (Criteria) this;
        }

        public Criteria andSmokingVal3In(List<Float> values) {
            addCriterion("smoking_val3 in", values, "smokingVal3");
            return (Criteria) this;
        }

        public Criteria andSmokingVal3NotIn(List<Float> values) {
            addCriterion("smoking_val3 not in", values, "smokingVal3");
            return (Criteria) this;
        }

        public Criteria andSmokingVal3Between(Float value1, Float value2) {
            addCriterion("smoking_val3 between", value1, value2, "smokingVal3");
            return (Criteria) this;
        }

        public Criteria andSmokingVal3NotBetween(Float value1, Float value2) {
            addCriterion("smoking_val3 not between", value1, value2, "smokingVal3");
            return (Criteria) this;
        }

        public Criteria andSmokingVal4IsNull() {
            addCriterion("smoking_val4 is null");
            return (Criteria) this;
        }

        public Criteria andSmokingVal4IsNotNull() {
            addCriterion("smoking_val4 is not null");
            return (Criteria) this;
        }

        public Criteria andSmokingVal4EqualTo(Float value) {
            addCriterion("smoking_val4 =", value, "smokingVal4");
            return (Criteria) this;
        }

        public Criteria andSmokingVal4NotEqualTo(Float value) {
            addCriterion("smoking_val4 <>", value, "smokingVal4");
            return (Criteria) this;
        }

        public Criteria andSmokingVal4GreaterThan(Float value) {
            addCriterion("smoking_val4 >", value, "smokingVal4");
            return (Criteria) this;
        }

        public Criteria andSmokingVal4GreaterThanOrEqualTo(Float value) {
            addCriterion("smoking_val4 >=", value, "smokingVal4");
            return (Criteria) this;
        }

        public Criteria andSmokingVal4LessThan(Float value) {
            addCriterion("smoking_val4 <", value, "smokingVal4");
            return (Criteria) this;
        }

        public Criteria andSmokingVal4LessThanOrEqualTo(Float value) {
            addCriterion("smoking_val4 <=", value, "smokingVal4");
            return (Criteria) this;
        }

        public Criteria andSmokingVal4In(List<Float> values) {
            addCriterion("smoking_val4 in", values, "smokingVal4");
            return (Criteria) this;
        }

        public Criteria andSmokingVal4NotIn(List<Float> values) {
            addCriterion("smoking_val4 not in", values, "smokingVal4");
            return (Criteria) this;
        }

        public Criteria andSmokingVal4Between(Float value1, Float value2) {
            addCriterion("smoking_val4 between", value1, value2, "smokingVal4");
            return (Criteria) this;
        }

        public Criteria andSmokingVal4NotBetween(Float value1, Float value2) {
            addCriterion("smoking_val4 not between", value1, value2, "smokingVal4");
            return (Criteria) this;
        }

        public Criteria andSmokingAgeIsNull() {
            addCriterion("smoking_age is null");
            return (Criteria) this;
        }

        public Criteria andSmokingAgeIsNotNull() {
            addCriterion("smoking_age is not null");
            return (Criteria) this;
        }

        public Criteria andSmokingAgeEqualTo(Float value) {
            addCriterion("smoking_age =", value, "smokingAge");
            return (Criteria) this;
        }

        public Criteria andSmokingAgeNotEqualTo(Float value) {
            addCriterion("smoking_age <>", value, "smokingAge");
            return (Criteria) this;
        }

        public Criteria andSmokingAgeGreaterThan(Float value) {
            addCriterion("smoking_age >", value, "smokingAge");
            return (Criteria) this;
        }

        public Criteria andSmokingAgeGreaterThanOrEqualTo(Float value) {
            addCriterion("smoking_age >=", value, "smokingAge");
            return (Criteria) this;
        }

        public Criteria andSmokingAgeLessThan(Float value) {
            addCriterion("smoking_age <", value, "smokingAge");
            return (Criteria) this;
        }

        public Criteria andSmokingAgeLessThanOrEqualTo(Float value) {
            addCriterion("smoking_age <=", value, "smokingAge");
            return (Criteria) this;
        }

        public Criteria andSmokingAgeIn(List<Float> values) {
            addCriterion("smoking_age in", values, "smokingAge");
            return (Criteria) this;
        }

        public Criteria andSmokingAgeNotIn(List<Float> values) {
            addCriterion("smoking_age not in", values, "smokingAge");
            return (Criteria) this;
        }

        public Criteria andSmokingAgeBetween(Float value1, Float value2) {
            addCriterion("smoking_age between", value1, value2, "smokingAge");
            return (Criteria) this;
        }

        public Criteria andSmokingAgeNotBetween(Float value1, Float value2) {
            addCriterion("smoking_age not between", value1, value2, "smokingAge");
            return (Criteria) this;
        }

        public Criteria andPartnerSmokingIsNull() {
            addCriterion("partner_smoking is null");
            return (Criteria) this;
        }

        public Criteria andPartnerSmokingIsNotNull() {
            addCriterion("partner_smoking is not null");
            return (Criteria) this;
        }

        public Criteria andPartnerSmokingEqualTo(Integer value) {
            addCriterion("partner_smoking =", value, "partnerSmoking");
            return (Criteria) this;
        }

        public Criteria andPartnerSmokingNotEqualTo(Integer value) {
            addCriterion("partner_smoking <>", value, "partnerSmoking");
            return (Criteria) this;
        }

        public Criteria andPartnerSmokingGreaterThan(Integer value) {
            addCriterion("partner_smoking >", value, "partnerSmoking");
            return (Criteria) this;
        }

        public Criteria andPartnerSmokingGreaterThanOrEqualTo(Integer value) {
            addCriterion("partner_smoking >=", value, "partnerSmoking");
            return (Criteria) this;
        }

        public Criteria andPartnerSmokingLessThan(Integer value) {
            addCriterion("partner_smoking <", value, "partnerSmoking");
            return (Criteria) this;
        }

        public Criteria andPartnerSmokingLessThanOrEqualTo(Integer value) {
            addCriterion("partner_smoking <=", value, "partnerSmoking");
            return (Criteria) this;
        }

        public Criteria andPartnerSmokingIn(List<Integer> values) {
            addCriterion("partner_smoking in", values, "partnerSmoking");
            return (Criteria) this;
        }

        public Criteria andPartnerSmokingNotIn(List<Integer> values) {
            addCriterion("partner_smoking not in", values, "partnerSmoking");
            return (Criteria) this;
        }

        public Criteria andPartnerSmokingBetween(Integer value1, Integer value2) {
            addCriterion("partner_smoking between", value1, value2, "partnerSmoking");
            return (Criteria) this;
        }

        public Criteria andPartnerSmokingNotBetween(Integer value1, Integer value2) {
            addCriterion("partner_smoking not between", value1, value2, "partnerSmoking");
            return (Criteria) this;
        }

        public Criteria andPassiveSmokingIsNull() {
            addCriterion("passive_smoking is null");
            return (Criteria) this;
        }

        public Criteria andPassiveSmokingIsNotNull() {
            addCriterion("passive_smoking is not null");
            return (Criteria) this;
        }

        public Criteria andPassiveSmokingEqualTo(Integer value) {
            addCriterion("passive_smoking =", value, "passiveSmoking");
            return (Criteria) this;
        }

        public Criteria andPassiveSmokingNotEqualTo(Integer value) {
            addCriterion("passive_smoking <>", value, "passiveSmoking");
            return (Criteria) this;
        }

        public Criteria andPassiveSmokingGreaterThan(Integer value) {
            addCriterion("passive_smoking >", value, "passiveSmoking");
            return (Criteria) this;
        }

        public Criteria andPassiveSmokingGreaterThanOrEqualTo(Integer value) {
            addCriterion("passive_smoking >=", value, "passiveSmoking");
            return (Criteria) this;
        }

        public Criteria andPassiveSmokingLessThan(Integer value) {
            addCriterion("passive_smoking <", value, "passiveSmoking");
            return (Criteria) this;
        }

        public Criteria andPassiveSmokingLessThanOrEqualTo(Integer value) {
            addCriterion("passive_smoking <=", value, "passiveSmoking");
            return (Criteria) this;
        }

        public Criteria andPassiveSmokingIn(List<Integer> values) {
            addCriterion("passive_smoking in", values, "passiveSmoking");
            return (Criteria) this;
        }

        public Criteria andPassiveSmokingNotIn(List<Integer> values) {
            addCriterion("passive_smoking not in", values, "passiveSmoking");
            return (Criteria) this;
        }

        public Criteria andPassiveSmokingBetween(Integer value1, Integer value2) {
            addCriterion("passive_smoking between", value1, value2, "passiveSmoking");
            return (Criteria) this;
        }

        public Criteria andPassiveSmokingNotBetween(Integer value1, Integer value2) {
            addCriterion("passive_smoking not between", value1, value2, "passiveSmoking");
            return (Criteria) this;
        }

        public Criteria andDrinkingIsNull() {
            addCriterion("drinking is null");
            return (Criteria) this;
        }

        public Criteria andDrinkingIsNotNull() {
            addCriterion("drinking is not null");
            return (Criteria) this;
        }

        public Criteria andDrinkingEqualTo(Integer value) {
            addCriterion("drinking =", value, "drinking");
            return (Criteria) this;
        }

        public Criteria andDrinkingNotEqualTo(Integer value) {
            addCriterion("drinking <>", value, "drinking");
            return (Criteria) this;
        }

        public Criteria andDrinkingGreaterThan(Integer value) {
            addCriterion("drinking >", value, "drinking");
            return (Criteria) this;
        }

        public Criteria andDrinkingGreaterThanOrEqualTo(Integer value) {
            addCriterion("drinking >=", value, "drinking");
            return (Criteria) this;
        }

        public Criteria andDrinkingLessThan(Integer value) {
            addCriterion("drinking <", value, "drinking");
            return (Criteria) this;
        }

        public Criteria andDrinkingLessThanOrEqualTo(Integer value) {
            addCriterion("drinking <=", value, "drinking");
            return (Criteria) this;
        }

        public Criteria andDrinkingIn(List<Integer> values) {
            addCriterion("drinking in", values, "drinking");
            return (Criteria) this;
        }

        public Criteria andDrinkingNotIn(List<Integer> values) {
            addCriterion("drinking not in", values, "drinking");
            return (Criteria) this;
        }

        public Criteria andDrinkingBetween(Integer value1, Integer value2) {
            addCriterion("drinking between", value1, value2, "drinking");
            return (Criteria) this;
        }

        public Criteria andDrinkingNotBetween(Integer value1, Integer value2) {
            addCriterion("drinking not between", value1, value2, "drinking");
            return (Criteria) this;
        }

        public Criteria andDrinkingTypesIsNull() {
            addCriterion("drinking_types is null");
            return (Criteria) this;
        }

        public Criteria andDrinkingTypesIsNotNull() {
            addCriterion("drinking_types is not null");
            return (Criteria) this;
        }

        public Criteria andDrinkingTypesEqualTo(String value) {
            addCriterion("drinking_types =", value, "drinkingTypes");
            return (Criteria) this;
        }

        public Criteria andDrinkingTypesNotEqualTo(String value) {
            addCriterion("drinking_types <>", value, "drinkingTypes");
            return (Criteria) this;
        }

        public Criteria andDrinkingTypesGreaterThan(String value) {
            addCriterion("drinking_types >", value, "drinkingTypes");
            return (Criteria) this;
        }

        public Criteria andDrinkingTypesGreaterThanOrEqualTo(String value) {
            addCriterion("drinking_types >=", value, "drinkingTypes");
            return (Criteria) this;
        }

        public Criteria andDrinkingTypesLessThan(String value) {
            addCriterion("drinking_types <", value, "drinkingTypes");
            return (Criteria) this;
        }

        public Criteria andDrinkingTypesLessThanOrEqualTo(String value) {
            addCriterion("drinking_types <=", value, "drinkingTypes");
            return (Criteria) this;
        }

        public Criteria andDrinkingTypesLike(String value) {
            addCriterion("drinking_types like", value, "drinkingTypes");
            return (Criteria) this;
        }

        public Criteria andDrinkingTypesNotLike(String value) {
            addCriterion("drinking_types not like", value, "drinkingTypes");
            return (Criteria) this;
        }

        public Criteria andDrinkingTypesIn(List<String> values) {
            addCriterion("drinking_types in", values, "drinkingTypes");
            return (Criteria) this;
        }

        public Criteria andDrinkingTypesNotIn(List<String> values) {
            addCriterion("drinking_types not in", values, "drinkingTypes");
            return (Criteria) this;
        }

        public Criteria andDrinkingTypesBetween(String value1, String value2) {
            addCriterion("drinking_types between", value1, value2, "drinkingTypes");
            return (Criteria) this;
        }

        public Criteria andDrinkingTypesNotBetween(String value1, String value2) {
            addCriterion("drinking_types not between", value1, value2, "drinkingTypes");
            return (Criteria) this;
        }

        public Criteria andDrinkingValIsNull() {
            addCriterion("drinking_val is null");
            return (Criteria) this;
        }

        public Criteria andDrinkingValIsNotNull() {
            addCriterion("drinking_val is not null");
            return (Criteria) this;
        }

        public Criteria andDrinkingValEqualTo(Float value) {
            addCriterion("drinking_val =", value, "drinkingVal");
            return (Criteria) this;
        }

        public Criteria andDrinkingValNotEqualTo(Float value) {
            addCriterion("drinking_val <>", value, "drinkingVal");
            return (Criteria) this;
        }

        public Criteria andDrinkingValGreaterThan(Float value) {
            addCriterion("drinking_val >", value, "drinkingVal");
            return (Criteria) this;
        }

        public Criteria andDrinkingValGreaterThanOrEqualTo(Float value) {
            addCriterion("drinking_val >=", value, "drinkingVal");
            return (Criteria) this;
        }

        public Criteria andDrinkingValLessThan(Float value) {
            addCriterion("drinking_val <", value, "drinkingVal");
            return (Criteria) this;
        }

        public Criteria andDrinkingValLessThanOrEqualTo(Float value) {
            addCriterion("drinking_val <=", value, "drinkingVal");
            return (Criteria) this;
        }

        public Criteria andDrinkingValIn(List<Float> values) {
            addCriterion("drinking_val in", values, "drinkingVal");
            return (Criteria) this;
        }

        public Criteria andDrinkingValNotIn(List<Float> values) {
            addCriterion("drinking_val not in", values, "drinkingVal");
            return (Criteria) this;
        }

        public Criteria andDrinkingValBetween(Float value1, Float value2) {
            addCriterion("drinking_val between", value1, value2, "drinkingVal");
            return (Criteria) this;
        }

        public Criteria andDrinkingValNotBetween(Float value1, Float value2) {
            addCriterion("drinking_val not between", value1, value2, "drinkingVal");
            return (Criteria) this;
        }

        public Criteria andDrinkingYearsIsNull() {
            addCriterion("drinking_years is null");
            return (Criteria) this;
        }

        public Criteria andDrinkingYearsIsNotNull() {
            addCriterion("drinking_years is not null");
            return (Criteria) this;
        }

        public Criteria andDrinkingYearsEqualTo(Float value) {
            addCriterion("drinking_years =", value, "drinkingYears");
            return (Criteria) this;
        }

        public Criteria andDrinkingYearsNotEqualTo(Float value) {
            addCriterion("drinking_years <>", value, "drinkingYears");
            return (Criteria) this;
        }

        public Criteria andDrinkingYearsGreaterThan(Float value) {
            addCriterion("drinking_years >", value, "drinkingYears");
            return (Criteria) this;
        }

        public Criteria andDrinkingYearsGreaterThanOrEqualTo(Float value) {
            addCriterion("drinking_years >=", value, "drinkingYears");
            return (Criteria) this;
        }

        public Criteria andDrinkingYearsLessThan(Float value) {
            addCriterion("drinking_years <", value, "drinkingYears");
            return (Criteria) this;
        }

        public Criteria andDrinkingYearsLessThanOrEqualTo(Float value) {
            addCriterion("drinking_years <=", value, "drinkingYears");
            return (Criteria) this;
        }

        public Criteria andDrinkingYearsIn(List<Float> values) {
            addCriterion("drinking_years in", values, "drinkingYears");
            return (Criteria) this;
        }

        public Criteria andDrinkingYearsNotIn(List<Float> values) {
            addCriterion("drinking_years not in", values, "drinkingYears");
            return (Criteria) this;
        }

        public Criteria andDrinkingYearsBetween(Float value1, Float value2) {
            addCriterion("drinking_years between", value1, value2, "drinkingYears");
            return (Criteria) this;
        }

        public Criteria andDrinkingYearsNotBetween(Float value1, Float value2) {
            addCriterion("drinking_years not between", value1, value2, "drinkingYears");
            return (Criteria) this;
        }

        public Criteria andNoDrinkingYearsIsNull() {
            addCriterion("no_drinking_years is null");
            return (Criteria) this;
        }

        public Criteria andNoDrinkingYearsIsNotNull() {
            addCriterion("no_drinking_years is not null");
            return (Criteria) this;
        }

        public Criteria andNoDrinkingYearsEqualTo(Float value) {
            addCriterion("no_drinking_years =", value, "noDrinkingYears");
            return (Criteria) this;
        }

        public Criteria andNoDrinkingYearsNotEqualTo(Float value) {
            addCriterion("no_drinking_years <>", value, "noDrinkingYears");
            return (Criteria) this;
        }

        public Criteria andNoDrinkingYearsGreaterThan(Float value) {
            addCriterion("no_drinking_years >", value, "noDrinkingYears");
            return (Criteria) this;
        }

        public Criteria andNoDrinkingYearsGreaterThanOrEqualTo(Float value) {
            addCriterion("no_drinking_years >=", value, "noDrinkingYears");
            return (Criteria) this;
        }

        public Criteria andNoDrinkingYearsLessThan(Float value) {
            addCriterion("no_drinking_years <", value, "noDrinkingYears");
            return (Criteria) this;
        }

        public Criteria andNoDrinkingYearsLessThanOrEqualTo(Float value) {
            addCriterion("no_drinking_years <=", value, "noDrinkingYears");
            return (Criteria) this;
        }

        public Criteria andNoDrinkingYearsIn(List<Float> values) {
            addCriterion("no_drinking_years in", values, "noDrinkingYears");
            return (Criteria) this;
        }

        public Criteria andNoDrinkingYearsNotIn(List<Float> values) {
            addCriterion("no_drinking_years not in", values, "noDrinkingYears");
            return (Criteria) this;
        }

        public Criteria andNoDrinkingYearsBetween(Float value1, Float value2) {
            addCriterion("no_drinking_years between", value1, value2, "noDrinkingYears");
            return (Criteria) this;
        }

        public Criteria andNoDrinkingYearsNotBetween(Float value1, Float value2) {
            addCriterion("no_drinking_years not between", value1, value2, "noDrinkingYears");
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