package com.breeze.health.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserTCMTebingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserTCMTebingExample() {
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

        public Criteria andTebingQ1IsNull() {
            addCriterion("tebing_q1 is null");
            return (Criteria) this;
        }

        public Criteria andTebingQ1IsNotNull() {
            addCriterion("tebing_q1 is not null");
            return (Criteria) this;
        }

        public Criteria andTebingQ1EqualTo(Integer value) {
            addCriterion("tebing_q1 =", value, "tebingQ1");
            return (Criteria) this;
        }

        public Criteria andTebingQ1NotEqualTo(Integer value) {
            addCriterion("tebing_q1 <>", value, "tebingQ1");
            return (Criteria) this;
        }

        public Criteria andTebingQ1GreaterThan(Integer value) {
            addCriterion("tebing_q1 >", value, "tebingQ1");
            return (Criteria) this;
        }

        public Criteria andTebingQ1GreaterThanOrEqualTo(Integer value) {
            addCriterion("tebing_q1 >=", value, "tebingQ1");
            return (Criteria) this;
        }

        public Criteria andTebingQ1LessThan(Integer value) {
            addCriterion("tebing_q1 <", value, "tebingQ1");
            return (Criteria) this;
        }

        public Criteria andTebingQ1LessThanOrEqualTo(Integer value) {
            addCriterion("tebing_q1 <=", value, "tebingQ1");
            return (Criteria) this;
        }

        public Criteria andTebingQ1In(List<Integer> values) {
            addCriterion("tebing_q1 in", values, "tebingQ1");
            return (Criteria) this;
        }

        public Criteria andTebingQ1NotIn(List<Integer> values) {
            addCriterion("tebing_q1 not in", values, "tebingQ1");
            return (Criteria) this;
        }

        public Criteria andTebingQ1Between(Integer value1, Integer value2) {
            addCriterion("tebing_q1 between", value1, value2, "tebingQ1");
            return (Criteria) this;
        }

        public Criteria andTebingQ1NotBetween(Integer value1, Integer value2) {
            addCriterion("tebing_q1 not between", value1, value2, "tebingQ1");
            return (Criteria) this;
        }

        public Criteria andTebingQ2IsNull() {
            addCriterion("tebing_q2 is null");
            return (Criteria) this;
        }

        public Criteria andTebingQ2IsNotNull() {
            addCriterion("tebing_q2 is not null");
            return (Criteria) this;
        }

        public Criteria andTebingQ2EqualTo(Integer value) {
            addCriterion("tebing_q2 =", value, "tebingQ2");
            return (Criteria) this;
        }

        public Criteria andTebingQ2NotEqualTo(Integer value) {
            addCriterion("tebing_q2 <>", value, "tebingQ2");
            return (Criteria) this;
        }

        public Criteria andTebingQ2GreaterThan(Integer value) {
            addCriterion("tebing_q2 >", value, "tebingQ2");
            return (Criteria) this;
        }

        public Criteria andTebingQ2GreaterThanOrEqualTo(Integer value) {
            addCriterion("tebing_q2 >=", value, "tebingQ2");
            return (Criteria) this;
        }

        public Criteria andTebingQ2LessThan(Integer value) {
            addCriterion("tebing_q2 <", value, "tebingQ2");
            return (Criteria) this;
        }

        public Criteria andTebingQ2LessThanOrEqualTo(Integer value) {
            addCriterion("tebing_q2 <=", value, "tebingQ2");
            return (Criteria) this;
        }

        public Criteria andTebingQ2In(List<Integer> values) {
            addCriterion("tebing_q2 in", values, "tebingQ2");
            return (Criteria) this;
        }

        public Criteria andTebingQ2NotIn(List<Integer> values) {
            addCriterion("tebing_q2 not in", values, "tebingQ2");
            return (Criteria) this;
        }

        public Criteria andTebingQ2Between(Integer value1, Integer value2) {
            addCriterion("tebing_q2 between", value1, value2, "tebingQ2");
            return (Criteria) this;
        }

        public Criteria andTebingQ2NotBetween(Integer value1, Integer value2) {
            addCriterion("tebing_q2 not between", value1, value2, "tebingQ2");
            return (Criteria) this;
        }

        public Criteria andTebingQ3IsNull() {
            addCriterion("tebing_q3 is null");
            return (Criteria) this;
        }

        public Criteria andTebingQ3IsNotNull() {
            addCriterion("tebing_q3 is not null");
            return (Criteria) this;
        }

        public Criteria andTebingQ3EqualTo(Integer value) {
            addCriterion("tebing_q3 =", value, "tebingQ3");
            return (Criteria) this;
        }

        public Criteria andTebingQ3NotEqualTo(Integer value) {
            addCriterion("tebing_q3 <>", value, "tebingQ3");
            return (Criteria) this;
        }

        public Criteria andTebingQ3GreaterThan(Integer value) {
            addCriterion("tebing_q3 >", value, "tebingQ3");
            return (Criteria) this;
        }

        public Criteria andTebingQ3GreaterThanOrEqualTo(Integer value) {
            addCriterion("tebing_q3 >=", value, "tebingQ3");
            return (Criteria) this;
        }

        public Criteria andTebingQ3LessThan(Integer value) {
            addCriterion("tebing_q3 <", value, "tebingQ3");
            return (Criteria) this;
        }

        public Criteria andTebingQ3LessThanOrEqualTo(Integer value) {
            addCriterion("tebing_q3 <=", value, "tebingQ3");
            return (Criteria) this;
        }

        public Criteria andTebingQ3In(List<Integer> values) {
            addCriterion("tebing_q3 in", values, "tebingQ3");
            return (Criteria) this;
        }

        public Criteria andTebingQ3NotIn(List<Integer> values) {
            addCriterion("tebing_q3 not in", values, "tebingQ3");
            return (Criteria) this;
        }

        public Criteria andTebingQ3Between(Integer value1, Integer value2) {
            addCriterion("tebing_q3 between", value1, value2, "tebingQ3");
            return (Criteria) this;
        }

        public Criteria andTebingQ3NotBetween(Integer value1, Integer value2) {
            addCriterion("tebing_q3 not between", value1, value2, "tebingQ3");
            return (Criteria) this;
        }

        public Criteria andTebingQ4IsNull() {
            addCriterion("tebing_q4 is null");
            return (Criteria) this;
        }

        public Criteria andTebingQ4IsNotNull() {
            addCriterion("tebing_q4 is not null");
            return (Criteria) this;
        }

        public Criteria andTebingQ4EqualTo(Integer value) {
            addCriterion("tebing_q4 =", value, "tebingQ4");
            return (Criteria) this;
        }

        public Criteria andTebingQ4NotEqualTo(Integer value) {
            addCriterion("tebing_q4 <>", value, "tebingQ4");
            return (Criteria) this;
        }

        public Criteria andTebingQ4GreaterThan(Integer value) {
            addCriterion("tebing_q4 >", value, "tebingQ4");
            return (Criteria) this;
        }

        public Criteria andTebingQ4GreaterThanOrEqualTo(Integer value) {
            addCriterion("tebing_q4 >=", value, "tebingQ4");
            return (Criteria) this;
        }

        public Criteria andTebingQ4LessThan(Integer value) {
            addCriterion("tebing_q4 <", value, "tebingQ4");
            return (Criteria) this;
        }

        public Criteria andTebingQ4LessThanOrEqualTo(Integer value) {
            addCriterion("tebing_q4 <=", value, "tebingQ4");
            return (Criteria) this;
        }

        public Criteria andTebingQ4In(List<Integer> values) {
            addCriterion("tebing_q4 in", values, "tebingQ4");
            return (Criteria) this;
        }

        public Criteria andTebingQ4NotIn(List<Integer> values) {
            addCriterion("tebing_q4 not in", values, "tebingQ4");
            return (Criteria) this;
        }

        public Criteria andTebingQ4Between(Integer value1, Integer value2) {
            addCriterion("tebing_q4 between", value1, value2, "tebingQ4");
            return (Criteria) this;
        }

        public Criteria andTebingQ4NotBetween(Integer value1, Integer value2) {
            addCriterion("tebing_q4 not between", value1, value2, "tebingQ4");
            return (Criteria) this;
        }

        public Criteria andTebingQ5IsNull() {
            addCriterion("tebing_q5 is null");
            return (Criteria) this;
        }

        public Criteria andTebingQ5IsNotNull() {
            addCriterion("tebing_q5 is not null");
            return (Criteria) this;
        }

        public Criteria andTebingQ5EqualTo(Integer value) {
            addCriterion("tebing_q5 =", value, "tebingQ5");
            return (Criteria) this;
        }

        public Criteria andTebingQ5NotEqualTo(Integer value) {
            addCriterion("tebing_q5 <>", value, "tebingQ5");
            return (Criteria) this;
        }

        public Criteria andTebingQ5GreaterThan(Integer value) {
            addCriterion("tebing_q5 >", value, "tebingQ5");
            return (Criteria) this;
        }

        public Criteria andTebingQ5GreaterThanOrEqualTo(Integer value) {
            addCriterion("tebing_q5 >=", value, "tebingQ5");
            return (Criteria) this;
        }

        public Criteria andTebingQ5LessThan(Integer value) {
            addCriterion("tebing_q5 <", value, "tebingQ5");
            return (Criteria) this;
        }

        public Criteria andTebingQ5LessThanOrEqualTo(Integer value) {
            addCriterion("tebing_q5 <=", value, "tebingQ5");
            return (Criteria) this;
        }

        public Criteria andTebingQ5In(List<Integer> values) {
            addCriterion("tebing_q5 in", values, "tebingQ5");
            return (Criteria) this;
        }

        public Criteria andTebingQ5NotIn(List<Integer> values) {
            addCriterion("tebing_q5 not in", values, "tebingQ5");
            return (Criteria) this;
        }

        public Criteria andTebingQ5Between(Integer value1, Integer value2) {
            addCriterion("tebing_q5 between", value1, value2, "tebingQ5");
            return (Criteria) this;
        }

        public Criteria andTebingQ5NotBetween(Integer value1, Integer value2) {
            addCriterion("tebing_q5 not between", value1, value2, "tebingQ5");
            return (Criteria) this;
        }

        public Criteria andTebingQ6IsNull() {
            addCriterion("tebing_q6 is null");
            return (Criteria) this;
        }

        public Criteria andTebingQ6IsNotNull() {
            addCriterion("tebing_q6 is not null");
            return (Criteria) this;
        }

        public Criteria andTebingQ6EqualTo(Integer value) {
            addCriterion("tebing_q6 =", value, "tebingQ6");
            return (Criteria) this;
        }

        public Criteria andTebingQ6NotEqualTo(Integer value) {
            addCriterion("tebing_q6 <>", value, "tebingQ6");
            return (Criteria) this;
        }

        public Criteria andTebingQ6GreaterThan(Integer value) {
            addCriterion("tebing_q6 >", value, "tebingQ6");
            return (Criteria) this;
        }

        public Criteria andTebingQ6GreaterThanOrEqualTo(Integer value) {
            addCriterion("tebing_q6 >=", value, "tebingQ6");
            return (Criteria) this;
        }

        public Criteria andTebingQ6LessThan(Integer value) {
            addCriterion("tebing_q6 <", value, "tebingQ6");
            return (Criteria) this;
        }

        public Criteria andTebingQ6LessThanOrEqualTo(Integer value) {
            addCriterion("tebing_q6 <=", value, "tebingQ6");
            return (Criteria) this;
        }

        public Criteria andTebingQ6In(List<Integer> values) {
            addCriterion("tebing_q6 in", values, "tebingQ6");
            return (Criteria) this;
        }

        public Criteria andTebingQ6NotIn(List<Integer> values) {
            addCriterion("tebing_q6 not in", values, "tebingQ6");
            return (Criteria) this;
        }

        public Criteria andTebingQ6Between(Integer value1, Integer value2) {
            addCriterion("tebing_q6 between", value1, value2, "tebingQ6");
            return (Criteria) this;
        }

        public Criteria andTebingQ6NotBetween(Integer value1, Integer value2) {
            addCriterion("tebing_q6 not between", value1, value2, "tebingQ6");
            return (Criteria) this;
        }

        public Criteria andTebingQ7IsNull() {
            addCriterion("tebing_q7 is null");
            return (Criteria) this;
        }

        public Criteria andTebingQ7IsNotNull() {
            addCriterion("tebing_q7 is not null");
            return (Criteria) this;
        }

        public Criteria andTebingQ7EqualTo(Integer value) {
            addCriterion("tebing_q7 =", value, "tebingQ7");
            return (Criteria) this;
        }

        public Criteria andTebingQ7NotEqualTo(Integer value) {
            addCriterion("tebing_q7 <>", value, "tebingQ7");
            return (Criteria) this;
        }

        public Criteria andTebingQ7GreaterThan(Integer value) {
            addCriterion("tebing_q7 >", value, "tebingQ7");
            return (Criteria) this;
        }

        public Criteria andTebingQ7GreaterThanOrEqualTo(Integer value) {
            addCriterion("tebing_q7 >=", value, "tebingQ7");
            return (Criteria) this;
        }

        public Criteria andTebingQ7LessThan(Integer value) {
            addCriterion("tebing_q7 <", value, "tebingQ7");
            return (Criteria) this;
        }

        public Criteria andTebingQ7LessThanOrEqualTo(Integer value) {
            addCriterion("tebing_q7 <=", value, "tebingQ7");
            return (Criteria) this;
        }

        public Criteria andTebingQ7In(List<Integer> values) {
            addCriterion("tebing_q7 in", values, "tebingQ7");
            return (Criteria) this;
        }

        public Criteria andTebingQ7NotIn(List<Integer> values) {
            addCriterion("tebing_q7 not in", values, "tebingQ7");
            return (Criteria) this;
        }

        public Criteria andTebingQ7Between(Integer value1, Integer value2) {
            addCriterion("tebing_q7 between", value1, value2, "tebingQ7");
            return (Criteria) this;
        }

        public Criteria andTebingQ7NotBetween(Integer value1, Integer value2) {
            addCriterion("tebing_q7 not between", value1, value2, "tebingQ7");
            return (Criteria) this;
        }

        public Criteria andTebingScoreIsNull() {
            addCriterion("tebing_score is null");
            return (Criteria) this;
        }

        public Criteria andTebingScoreIsNotNull() {
            addCriterion("tebing_score is not null");
            return (Criteria) this;
        }

        public Criteria andTebingScoreEqualTo(Integer value) {
            addCriterion("tebing_score =", value, "tebingScore");
            return (Criteria) this;
        }

        public Criteria andTebingScoreNotEqualTo(Integer value) {
            addCriterion("tebing_score <>", value, "tebingScore");
            return (Criteria) this;
        }

        public Criteria andTebingScoreGreaterThan(Integer value) {
            addCriterion("tebing_score >", value, "tebingScore");
            return (Criteria) this;
        }

        public Criteria andTebingScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("tebing_score >=", value, "tebingScore");
            return (Criteria) this;
        }

        public Criteria andTebingScoreLessThan(Integer value) {
            addCriterion("tebing_score <", value, "tebingScore");
            return (Criteria) this;
        }

        public Criteria andTebingScoreLessThanOrEqualTo(Integer value) {
            addCriterion("tebing_score <=", value, "tebingScore");
            return (Criteria) this;
        }

        public Criteria andTebingScoreIn(List<Integer> values) {
            addCriterion("tebing_score in", values, "tebingScore");
            return (Criteria) this;
        }

        public Criteria andTebingScoreNotIn(List<Integer> values) {
            addCriterion("tebing_score not in", values, "tebingScore");
            return (Criteria) this;
        }

        public Criteria andTebingScoreBetween(Integer value1, Integer value2) {
            addCriterion("tebing_score between", value1, value2, "tebingScore");
            return (Criteria) this;
        }

        public Criteria andTebingScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("tebing_score not between", value1, value2, "tebingScore");
            return (Criteria) this;
        }

        public Criteria andTebingResultIsNull() {
            addCriterion("tebing_result is null");
            return (Criteria) this;
        }

        public Criteria andTebingResultIsNotNull() {
            addCriterion("tebing_result is not null");
            return (Criteria) this;
        }

        public Criteria andTebingResultEqualTo(Integer value) {
            addCriterion("tebing_result =", value, "tebingResult");
            return (Criteria) this;
        }

        public Criteria andTebingResultNotEqualTo(Integer value) {
            addCriterion("tebing_result <>", value, "tebingResult");
            return (Criteria) this;
        }

        public Criteria andTebingResultGreaterThan(Integer value) {
            addCriterion("tebing_result >", value, "tebingResult");
            return (Criteria) this;
        }

        public Criteria andTebingResultGreaterThanOrEqualTo(Integer value) {
            addCriterion("tebing_result >=", value, "tebingResult");
            return (Criteria) this;
        }

        public Criteria andTebingResultLessThan(Integer value) {
            addCriterion("tebing_result <", value, "tebingResult");
            return (Criteria) this;
        }

        public Criteria andTebingResultLessThanOrEqualTo(Integer value) {
            addCriterion("tebing_result <=", value, "tebingResult");
            return (Criteria) this;
        }

        public Criteria andTebingResultIn(List<Integer> values) {
            addCriterion("tebing_result in", values, "tebingResult");
            return (Criteria) this;
        }

        public Criteria andTebingResultNotIn(List<Integer> values) {
            addCriterion("tebing_result not in", values, "tebingResult");
            return (Criteria) this;
        }

        public Criteria andTebingResultBetween(Integer value1, Integer value2) {
            addCriterion("tebing_result between", value1, value2, "tebingResult");
            return (Criteria) this;
        }

        public Criteria andTebingResultNotBetween(Integer value1, Integer value2) {
            addCriterion("tebing_result not between", value1, value2, "tebingResult");
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