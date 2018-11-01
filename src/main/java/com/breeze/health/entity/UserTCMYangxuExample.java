package com.breeze.health.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserTCMYangxuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserTCMYangxuExample() {
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

        public Criteria andTcmIdIsNull() {
            addCriterion("tcm_id is null");
            return (Criteria) this;
        }

        public Criteria andTcmIdIsNotNull() {
            addCriterion("tcm_id is not null");
            return (Criteria) this;
        }

        public Criteria andTcmIdEqualTo(Long value) {
            addCriterion("tcm_id =", value, "tcmId");
            return (Criteria) this;
        }

        public Criteria andTcmIdNotEqualTo(Long value) {
            addCriterion("tcm_id <>", value, "tcmId");
            return (Criteria) this;
        }

        public Criteria andTcmIdGreaterThan(Long value) {
            addCriterion("tcm_id >", value, "tcmId");
            return (Criteria) this;
        }

        public Criteria andTcmIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tcm_id >=", value, "tcmId");
            return (Criteria) this;
        }

        public Criteria andTcmIdLessThan(Long value) {
            addCriterion("tcm_id <", value, "tcmId");
            return (Criteria) this;
        }

        public Criteria andTcmIdLessThanOrEqualTo(Long value) {
            addCriterion("tcm_id <=", value, "tcmId");
            return (Criteria) this;
        }

        public Criteria andTcmIdIn(List<Long> values) {
            addCriterion("tcm_id in", values, "tcmId");
            return (Criteria) this;
        }

        public Criteria andTcmIdNotIn(List<Long> values) {
            addCriterion("tcm_id not in", values, "tcmId");
            return (Criteria) this;
        }

        public Criteria andTcmIdBetween(Long value1, Long value2) {
            addCriterion("tcm_id between", value1, value2, "tcmId");
            return (Criteria) this;
        }

        public Criteria andTcmIdNotBetween(Long value1, Long value2) {
            addCriterion("tcm_id not between", value1, value2, "tcmId");
            return (Criteria) this;
        }

        public Criteria andYangxuQ1IsNull() {
            addCriterion("yangxu_q1 is null");
            return (Criteria) this;
        }

        public Criteria andYangxuQ1IsNotNull() {
            addCriterion("yangxu_q1 is not null");
            return (Criteria) this;
        }

        public Criteria andYangxuQ1EqualTo(Integer value) {
            addCriterion("yangxu_q1 =", value, "yangxuQ1");
            return (Criteria) this;
        }

        public Criteria andYangxuQ1NotEqualTo(Integer value) {
            addCriterion("yangxu_q1 <>", value, "yangxuQ1");
            return (Criteria) this;
        }

        public Criteria andYangxuQ1GreaterThan(Integer value) {
            addCriterion("yangxu_q1 >", value, "yangxuQ1");
            return (Criteria) this;
        }

        public Criteria andYangxuQ1GreaterThanOrEqualTo(Integer value) {
            addCriterion("yangxu_q1 >=", value, "yangxuQ1");
            return (Criteria) this;
        }

        public Criteria andYangxuQ1LessThan(Integer value) {
            addCriterion("yangxu_q1 <", value, "yangxuQ1");
            return (Criteria) this;
        }

        public Criteria andYangxuQ1LessThanOrEqualTo(Integer value) {
            addCriterion("yangxu_q1 <=", value, "yangxuQ1");
            return (Criteria) this;
        }

        public Criteria andYangxuQ1In(List<Integer> values) {
            addCriterion("yangxu_q1 in", values, "yangxuQ1");
            return (Criteria) this;
        }

        public Criteria andYangxuQ1NotIn(List<Integer> values) {
            addCriterion("yangxu_q1 not in", values, "yangxuQ1");
            return (Criteria) this;
        }

        public Criteria andYangxuQ1Between(Integer value1, Integer value2) {
            addCriterion("yangxu_q1 between", value1, value2, "yangxuQ1");
            return (Criteria) this;
        }

        public Criteria andYangxuQ1NotBetween(Integer value1, Integer value2) {
            addCriterion("yangxu_q1 not between", value1, value2, "yangxuQ1");
            return (Criteria) this;
        }

        public Criteria andYangxuQ2IsNull() {
            addCriterion("yangxu_q2 is null");
            return (Criteria) this;
        }

        public Criteria andYangxuQ2IsNotNull() {
            addCriterion("yangxu_q2 is not null");
            return (Criteria) this;
        }

        public Criteria andYangxuQ2EqualTo(Integer value) {
            addCriterion("yangxu_q2 =", value, "yangxuQ2");
            return (Criteria) this;
        }

        public Criteria andYangxuQ2NotEqualTo(Integer value) {
            addCriterion("yangxu_q2 <>", value, "yangxuQ2");
            return (Criteria) this;
        }

        public Criteria andYangxuQ2GreaterThan(Integer value) {
            addCriterion("yangxu_q2 >", value, "yangxuQ2");
            return (Criteria) this;
        }

        public Criteria andYangxuQ2GreaterThanOrEqualTo(Integer value) {
            addCriterion("yangxu_q2 >=", value, "yangxuQ2");
            return (Criteria) this;
        }

        public Criteria andYangxuQ2LessThan(Integer value) {
            addCriterion("yangxu_q2 <", value, "yangxuQ2");
            return (Criteria) this;
        }

        public Criteria andYangxuQ2LessThanOrEqualTo(Integer value) {
            addCriterion("yangxu_q2 <=", value, "yangxuQ2");
            return (Criteria) this;
        }

        public Criteria andYangxuQ2In(List<Integer> values) {
            addCriterion("yangxu_q2 in", values, "yangxuQ2");
            return (Criteria) this;
        }

        public Criteria andYangxuQ2NotIn(List<Integer> values) {
            addCriterion("yangxu_q2 not in", values, "yangxuQ2");
            return (Criteria) this;
        }

        public Criteria andYangxuQ2Between(Integer value1, Integer value2) {
            addCriterion("yangxu_q2 between", value1, value2, "yangxuQ2");
            return (Criteria) this;
        }

        public Criteria andYangxuQ2NotBetween(Integer value1, Integer value2) {
            addCriterion("yangxu_q2 not between", value1, value2, "yangxuQ2");
            return (Criteria) this;
        }

        public Criteria andYangxuQ3IsNull() {
            addCriterion("yangxu_q3 is null");
            return (Criteria) this;
        }

        public Criteria andYangxuQ3IsNotNull() {
            addCriterion("yangxu_q3 is not null");
            return (Criteria) this;
        }

        public Criteria andYangxuQ3EqualTo(Integer value) {
            addCriterion("yangxu_q3 =", value, "yangxuQ3");
            return (Criteria) this;
        }

        public Criteria andYangxuQ3NotEqualTo(Integer value) {
            addCriterion("yangxu_q3 <>", value, "yangxuQ3");
            return (Criteria) this;
        }

        public Criteria andYangxuQ3GreaterThan(Integer value) {
            addCriterion("yangxu_q3 >", value, "yangxuQ3");
            return (Criteria) this;
        }

        public Criteria andYangxuQ3GreaterThanOrEqualTo(Integer value) {
            addCriterion("yangxu_q3 >=", value, "yangxuQ3");
            return (Criteria) this;
        }

        public Criteria andYangxuQ3LessThan(Integer value) {
            addCriterion("yangxu_q3 <", value, "yangxuQ3");
            return (Criteria) this;
        }

        public Criteria andYangxuQ3LessThanOrEqualTo(Integer value) {
            addCriterion("yangxu_q3 <=", value, "yangxuQ3");
            return (Criteria) this;
        }

        public Criteria andYangxuQ3In(List<Integer> values) {
            addCriterion("yangxu_q3 in", values, "yangxuQ3");
            return (Criteria) this;
        }

        public Criteria andYangxuQ3NotIn(List<Integer> values) {
            addCriterion("yangxu_q3 not in", values, "yangxuQ3");
            return (Criteria) this;
        }

        public Criteria andYangxuQ3Between(Integer value1, Integer value2) {
            addCriterion("yangxu_q3 between", value1, value2, "yangxuQ3");
            return (Criteria) this;
        }

        public Criteria andYangxuQ3NotBetween(Integer value1, Integer value2) {
            addCriterion("yangxu_q3 not between", value1, value2, "yangxuQ3");
            return (Criteria) this;
        }

        public Criteria andYangxuQ4IsNull() {
            addCriterion("yangxu_q4 is null");
            return (Criteria) this;
        }

        public Criteria andYangxuQ4IsNotNull() {
            addCriterion("yangxu_q4 is not null");
            return (Criteria) this;
        }

        public Criteria andYangxuQ4EqualTo(Integer value) {
            addCriterion("yangxu_q4 =", value, "yangxuQ4");
            return (Criteria) this;
        }

        public Criteria andYangxuQ4NotEqualTo(Integer value) {
            addCriterion("yangxu_q4 <>", value, "yangxuQ4");
            return (Criteria) this;
        }

        public Criteria andYangxuQ4GreaterThan(Integer value) {
            addCriterion("yangxu_q4 >", value, "yangxuQ4");
            return (Criteria) this;
        }

        public Criteria andYangxuQ4GreaterThanOrEqualTo(Integer value) {
            addCriterion("yangxu_q4 >=", value, "yangxuQ4");
            return (Criteria) this;
        }

        public Criteria andYangxuQ4LessThan(Integer value) {
            addCriterion("yangxu_q4 <", value, "yangxuQ4");
            return (Criteria) this;
        }

        public Criteria andYangxuQ4LessThanOrEqualTo(Integer value) {
            addCriterion("yangxu_q4 <=", value, "yangxuQ4");
            return (Criteria) this;
        }

        public Criteria andYangxuQ4In(List<Integer> values) {
            addCriterion("yangxu_q4 in", values, "yangxuQ4");
            return (Criteria) this;
        }

        public Criteria andYangxuQ4NotIn(List<Integer> values) {
            addCriterion("yangxu_q4 not in", values, "yangxuQ4");
            return (Criteria) this;
        }

        public Criteria andYangxuQ4Between(Integer value1, Integer value2) {
            addCriterion("yangxu_q4 between", value1, value2, "yangxuQ4");
            return (Criteria) this;
        }

        public Criteria andYangxuQ4NotBetween(Integer value1, Integer value2) {
            addCriterion("yangxu_q4 not between", value1, value2, "yangxuQ4");
            return (Criteria) this;
        }

        public Criteria andYangxuQ5IsNull() {
            addCriterion("yangxu_q5 is null");
            return (Criteria) this;
        }

        public Criteria andYangxuQ5IsNotNull() {
            addCriterion("yangxu_q5 is not null");
            return (Criteria) this;
        }

        public Criteria andYangxuQ5EqualTo(Integer value) {
            addCriterion("yangxu_q5 =", value, "yangxuQ5");
            return (Criteria) this;
        }

        public Criteria andYangxuQ5NotEqualTo(Integer value) {
            addCriterion("yangxu_q5 <>", value, "yangxuQ5");
            return (Criteria) this;
        }

        public Criteria andYangxuQ5GreaterThan(Integer value) {
            addCriterion("yangxu_q5 >", value, "yangxuQ5");
            return (Criteria) this;
        }

        public Criteria andYangxuQ5GreaterThanOrEqualTo(Integer value) {
            addCriterion("yangxu_q5 >=", value, "yangxuQ5");
            return (Criteria) this;
        }

        public Criteria andYangxuQ5LessThan(Integer value) {
            addCriterion("yangxu_q5 <", value, "yangxuQ5");
            return (Criteria) this;
        }

        public Criteria andYangxuQ5LessThanOrEqualTo(Integer value) {
            addCriterion("yangxu_q5 <=", value, "yangxuQ5");
            return (Criteria) this;
        }

        public Criteria andYangxuQ5In(List<Integer> values) {
            addCriterion("yangxu_q5 in", values, "yangxuQ5");
            return (Criteria) this;
        }

        public Criteria andYangxuQ5NotIn(List<Integer> values) {
            addCriterion("yangxu_q5 not in", values, "yangxuQ5");
            return (Criteria) this;
        }

        public Criteria andYangxuQ5Between(Integer value1, Integer value2) {
            addCriterion("yangxu_q5 between", value1, value2, "yangxuQ5");
            return (Criteria) this;
        }

        public Criteria andYangxuQ5NotBetween(Integer value1, Integer value2) {
            addCriterion("yangxu_q5 not between", value1, value2, "yangxuQ5");
            return (Criteria) this;
        }

        public Criteria andYangxuQ6IsNull() {
            addCriterion("yangxu_q6 is null");
            return (Criteria) this;
        }

        public Criteria andYangxuQ6IsNotNull() {
            addCriterion("yangxu_q6 is not null");
            return (Criteria) this;
        }

        public Criteria andYangxuQ6EqualTo(Integer value) {
            addCriterion("yangxu_q6 =", value, "yangxuQ6");
            return (Criteria) this;
        }

        public Criteria andYangxuQ6NotEqualTo(Integer value) {
            addCriterion("yangxu_q6 <>", value, "yangxuQ6");
            return (Criteria) this;
        }

        public Criteria andYangxuQ6GreaterThan(Integer value) {
            addCriterion("yangxu_q6 >", value, "yangxuQ6");
            return (Criteria) this;
        }

        public Criteria andYangxuQ6GreaterThanOrEqualTo(Integer value) {
            addCriterion("yangxu_q6 >=", value, "yangxuQ6");
            return (Criteria) this;
        }

        public Criteria andYangxuQ6LessThan(Integer value) {
            addCriterion("yangxu_q6 <", value, "yangxuQ6");
            return (Criteria) this;
        }

        public Criteria andYangxuQ6LessThanOrEqualTo(Integer value) {
            addCriterion("yangxu_q6 <=", value, "yangxuQ6");
            return (Criteria) this;
        }

        public Criteria andYangxuQ6In(List<Integer> values) {
            addCriterion("yangxu_q6 in", values, "yangxuQ6");
            return (Criteria) this;
        }

        public Criteria andYangxuQ6NotIn(List<Integer> values) {
            addCriterion("yangxu_q6 not in", values, "yangxuQ6");
            return (Criteria) this;
        }

        public Criteria andYangxuQ6Between(Integer value1, Integer value2) {
            addCriterion("yangxu_q6 between", value1, value2, "yangxuQ6");
            return (Criteria) this;
        }

        public Criteria andYangxuQ6NotBetween(Integer value1, Integer value2) {
            addCriterion("yangxu_q6 not between", value1, value2, "yangxuQ6");
            return (Criteria) this;
        }

        public Criteria andYangxuQ7IsNull() {
            addCriterion("yangxu_q7 is null");
            return (Criteria) this;
        }

        public Criteria andYangxuQ7IsNotNull() {
            addCriterion("yangxu_q7 is not null");
            return (Criteria) this;
        }

        public Criteria andYangxuQ7EqualTo(Integer value) {
            addCriterion("yangxu_q7 =", value, "yangxuQ7");
            return (Criteria) this;
        }

        public Criteria andYangxuQ7NotEqualTo(Integer value) {
            addCriterion("yangxu_q7 <>", value, "yangxuQ7");
            return (Criteria) this;
        }

        public Criteria andYangxuQ7GreaterThan(Integer value) {
            addCriterion("yangxu_q7 >", value, "yangxuQ7");
            return (Criteria) this;
        }

        public Criteria andYangxuQ7GreaterThanOrEqualTo(Integer value) {
            addCriterion("yangxu_q7 >=", value, "yangxuQ7");
            return (Criteria) this;
        }

        public Criteria andYangxuQ7LessThan(Integer value) {
            addCriterion("yangxu_q7 <", value, "yangxuQ7");
            return (Criteria) this;
        }

        public Criteria andYangxuQ7LessThanOrEqualTo(Integer value) {
            addCriterion("yangxu_q7 <=", value, "yangxuQ7");
            return (Criteria) this;
        }

        public Criteria andYangxuQ7In(List<Integer> values) {
            addCriterion("yangxu_q7 in", values, "yangxuQ7");
            return (Criteria) this;
        }

        public Criteria andYangxuQ7NotIn(List<Integer> values) {
            addCriterion("yangxu_q7 not in", values, "yangxuQ7");
            return (Criteria) this;
        }

        public Criteria andYangxuQ7Between(Integer value1, Integer value2) {
            addCriterion("yangxu_q7 between", value1, value2, "yangxuQ7");
            return (Criteria) this;
        }

        public Criteria andYangxuQ7NotBetween(Integer value1, Integer value2) {
            addCriterion("yangxu_q7 not between", value1, value2, "yangxuQ7");
            return (Criteria) this;
        }

        public Criteria andYangxuScoreIsNull() {
            addCriterion("yangxu_score is null");
            return (Criteria) this;
        }

        public Criteria andYangxuScoreIsNotNull() {
            addCriterion("yangxu_score is not null");
            return (Criteria) this;
        }

        public Criteria andYangxuScoreEqualTo(Integer value) {
            addCriterion("yangxu_score =", value, "yangxuScore");
            return (Criteria) this;
        }

        public Criteria andYangxuScoreNotEqualTo(Integer value) {
            addCriterion("yangxu_score <>", value, "yangxuScore");
            return (Criteria) this;
        }

        public Criteria andYangxuScoreGreaterThan(Integer value) {
            addCriterion("yangxu_score >", value, "yangxuScore");
            return (Criteria) this;
        }

        public Criteria andYangxuScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("yangxu_score >=", value, "yangxuScore");
            return (Criteria) this;
        }

        public Criteria andYangxuScoreLessThan(Integer value) {
            addCriterion("yangxu_score <", value, "yangxuScore");
            return (Criteria) this;
        }

        public Criteria andYangxuScoreLessThanOrEqualTo(Integer value) {
            addCriterion("yangxu_score <=", value, "yangxuScore");
            return (Criteria) this;
        }

        public Criteria andYangxuScoreIn(List<Integer> values) {
            addCriterion("yangxu_score in", values, "yangxuScore");
            return (Criteria) this;
        }

        public Criteria andYangxuScoreNotIn(List<Integer> values) {
            addCriterion("yangxu_score not in", values, "yangxuScore");
            return (Criteria) this;
        }

        public Criteria andYangxuScoreBetween(Integer value1, Integer value2) {
            addCriterion("yangxu_score between", value1, value2, "yangxuScore");
            return (Criteria) this;
        }

        public Criteria andYangxuScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("yangxu_score not between", value1, value2, "yangxuScore");
            return (Criteria) this;
        }

        public Criteria andYangxuResultIsNull() {
            addCriterion("yangxu_result is null");
            return (Criteria) this;
        }

        public Criteria andYangxuResultIsNotNull() {
            addCriterion("yangxu_result is not null");
            return (Criteria) this;
        }

        public Criteria andYangxuResultEqualTo(String value) {
            addCriterion("yangxu_result =", value, "yangxuResult");
            return (Criteria) this;
        }

        public Criteria andYangxuResultNotEqualTo(String value) {
            addCriterion("yangxu_result <>", value, "yangxuResult");
            return (Criteria) this;
        }

        public Criteria andYangxuResultGreaterThan(String value) {
            addCriterion("yangxu_result >", value, "yangxuResult");
            return (Criteria) this;
        }

        public Criteria andYangxuResultGreaterThanOrEqualTo(String value) {
            addCriterion("yangxu_result >=", value, "yangxuResult");
            return (Criteria) this;
        }

        public Criteria andYangxuResultLessThan(String value) {
            addCriterion("yangxu_result <", value, "yangxuResult");
            return (Criteria) this;
        }

        public Criteria andYangxuResultLessThanOrEqualTo(String value) {
            addCriterion("yangxu_result <=", value, "yangxuResult");
            return (Criteria) this;
        }

        public Criteria andYangxuResultLike(String value) {
            addCriterion("yangxu_result like", value, "yangxuResult");
            return (Criteria) this;
        }

        public Criteria andYangxuResultNotLike(String value) {
            addCriterion("yangxu_result not like", value, "yangxuResult");
            return (Criteria) this;
        }

        public Criteria andYangxuResultIn(List<String> values) {
            addCriterion("yangxu_result in", values, "yangxuResult");
            return (Criteria) this;
        }

        public Criteria andYangxuResultNotIn(List<String> values) {
            addCriterion("yangxu_result not in", values, "yangxuResult");
            return (Criteria) this;
        }

        public Criteria andYangxuResultBetween(String value1, String value2) {
            addCriterion("yangxu_result between", value1, value2, "yangxuResult");
            return (Criteria) this;
        }

        public Criteria andYangxuResultNotBetween(String value1, String value2) {
            addCriterion("yangxu_result not between", value1, value2, "yangxuResult");
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