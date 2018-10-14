package com.breeze.health.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserTCMPingheExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserTCMPingheExample() {
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

        public Criteria andPingheQ1IsNull() {
            addCriterion("pinghe_q1 is null");
            return (Criteria) this;
        }

        public Criteria andPingheQ1IsNotNull() {
            addCriterion("pinghe_q1 is not null");
            return (Criteria) this;
        }

        public Criteria andPingheQ1EqualTo(Integer value) {
            addCriterion("pinghe_q1 =", value, "pingheQ1");
            return (Criteria) this;
        }

        public Criteria andPingheQ1NotEqualTo(Integer value) {
            addCriterion("pinghe_q1 <>", value, "pingheQ1");
            return (Criteria) this;
        }

        public Criteria andPingheQ1GreaterThan(Integer value) {
            addCriterion("pinghe_q1 >", value, "pingheQ1");
            return (Criteria) this;
        }

        public Criteria andPingheQ1GreaterThanOrEqualTo(Integer value) {
            addCriterion("pinghe_q1 >=", value, "pingheQ1");
            return (Criteria) this;
        }

        public Criteria andPingheQ1LessThan(Integer value) {
            addCriterion("pinghe_q1 <", value, "pingheQ1");
            return (Criteria) this;
        }

        public Criteria andPingheQ1LessThanOrEqualTo(Integer value) {
            addCriterion("pinghe_q1 <=", value, "pingheQ1");
            return (Criteria) this;
        }

        public Criteria andPingheQ1In(List<Integer> values) {
            addCriterion("pinghe_q1 in", values, "pingheQ1");
            return (Criteria) this;
        }

        public Criteria andPingheQ1NotIn(List<Integer> values) {
            addCriterion("pinghe_q1 not in", values, "pingheQ1");
            return (Criteria) this;
        }

        public Criteria andPingheQ1Between(Integer value1, Integer value2) {
            addCriterion("pinghe_q1 between", value1, value2, "pingheQ1");
            return (Criteria) this;
        }

        public Criteria andPingheQ1NotBetween(Integer value1, Integer value2) {
            addCriterion("pinghe_q1 not between", value1, value2, "pingheQ1");
            return (Criteria) this;
        }

        public Criteria andPingheQ2IsNull() {
            addCriterion("pinghe_q2 is null");
            return (Criteria) this;
        }

        public Criteria andPingheQ2IsNotNull() {
            addCriterion("pinghe_q2 is not null");
            return (Criteria) this;
        }

        public Criteria andPingheQ2EqualTo(Integer value) {
            addCriterion("pinghe_q2 =", value, "pingheQ2");
            return (Criteria) this;
        }

        public Criteria andPingheQ2NotEqualTo(Integer value) {
            addCriterion("pinghe_q2 <>", value, "pingheQ2");
            return (Criteria) this;
        }

        public Criteria andPingheQ2GreaterThan(Integer value) {
            addCriterion("pinghe_q2 >", value, "pingheQ2");
            return (Criteria) this;
        }

        public Criteria andPingheQ2GreaterThanOrEqualTo(Integer value) {
            addCriterion("pinghe_q2 >=", value, "pingheQ2");
            return (Criteria) this;
        }

        public Criteria andPingheQ2LessThan(Integer value) {
            addCriterion("pinghe_q2 <", value, "pingheQ2");
            return (Criteria) this;
        }

        public Criteria andPingheQ2LessThanOrEqualTo(Integer value) {
            addCriterion("pinghe_q2 <=", value, "pingheQ2");
            return (Criteria) this;
        }

        public Criteria andPingheQ2In(List<Integer> values) {
            addCriterion("pinghe_q2 in", values, "pingheQ2");
            return (Criteria) this;
        }

        public Criteria andPingheQ2NotIn(List<Integer> values) {
            addCriterion("pinghe_q2 not in", values, "pingheQ2");
            return (Criteria) this;
        }

        public Criteria andPingheQ2Between(Integer value1, Integer value2) {
            addCriterion("pinghe_q2 between", value1, value2, "pingheQ2");
            return (Criteria) this;
        }

        public Criteria andPingheQ2NotBetween(Integer value1, Integer value2) {
            addCriterion("pinghe_q2 not between", value1, value2, "pingheQ2");
            return (Criteria) this;
        }

        public Criteria andPingheQ3IsNull() {
            addCriterion("pinghe_q3 is null");
            return (Criteria) this;
        }

        public Criteria andPingheQ3IsNotNull() {
            addCriterion("pinghe_q3 is not null");
            return (Criteria) this;
        }

        public Criteria andPingheQ3EqualTo(Integer value) {
            addCriterion("pinghe_q3 =", value, "pingheQ3");
            return (Criteria) this;
        }

        public Criteria andPingheQ3NotEqualTo(Integer value) {
            addCriterion("pinghe_q3 <>", value, "pingheQ3");
            return (Criteria) this;
        }

        public Criteria andPingheQ3GreaterThan(Integer value) {
            addCriterion("pinghe_q3 >", value, "pingheQ3");
            return (Criteria) this;
        }

        public Criteria andPingheQ3GreaterThanOrEqualTo(Integer value) {
            addCriterion("pinghe_q3 >=", value, "pingheQ3");
            return (Criteria) this;
        }

        public Criteria andPingheQ3LessThan(Integer value) {
            addCriterion("pinghe_q3 <", value, "pingheQ3");
            return (Criteria) this;
        }

        public Criteria andPingheQ3LessThanOrEqualTo(Integer value) {
            addCriterion("pinghe_q3 <=", value, "pingheQ3");
            return (Criteria) this;
        }

        public Criteria andPingheQ3In(List<Integer> values) {
            addCriterion("pinghe_q3 in", values, "pingheQ3");
            return (Criteria) this;
        }

        public Criteria andPingheQ3NotIn(List<Integer> values) {
            addCriterion("pinghe_q3 not in", values, "pingheQ3");
            return (Criteria) this;
        }

        public Criteria andPingheQ3Between(Integer value1, Integer value2) {
            addCriterion("pinghe_q3 between", value1, value2, "pingheQ3");
            return (Criteria) this;
        }

        public Criteria andPingheQ3NotBetween(Integer value1, Integer value2) {
            addCriterion("pinghe_q3 not between", value1, value2, "pingheQ3");
            return (Criteria) this;
        }

        public Criteria andPingheQ4IsNull() {
            addCriterion("pinghe_q4 is null");
            return (Criteria) this;
        }

        public Criteria andPingheQ4IsNotNull() {
            addCriterion("pinghe_q4 is not null");
            return (Criteria) this;
        }

        public Criteria andPingheQ4EqualTo(Integer value) {
            addCriterion("pinghe_q4 =", value, "pingheQ4");
            return (Criteria) this;
        }

        public Criteria andPingheQ4NotEqualTo(Integer value) {
            addCriterion("pinghe_q4 <>", value, "pingheQ4");
            return (Criteria) this;
        }

        public Criteria andPingheQ4GreaterThan(Integer value) {
            addCriterion("pinghe_q4 >", value, "pingheQ4");
            return (Criteria) this;
        }

        public Criteria andPingheQ4GreaterThanOrEqualTo(Integer value) {
            addCriterion("pinghe_q4 >=", value, "pingheQ4");
            return (Criteria) this;
        }

        public Criteria andPingheQ4LessThan(Integer value) {
            addCriterion("pinghe_q4 <", value, "pingheQ4");
            return (Criteria) this;
        }

        public Criteria andPingheQ4LessThanOrEqualTo(Integer value) {
            addCriterion("pinghe_q4 <=", value, "pingheQ4");
            return (Criteria) this;
        }

        public Criteria andPingheQ4In(List<Integer> values) {
            addCriterion("pinghe_q4 in", values, "pingheQ4");
            return (Criteria) this;
        }

        public Criteria andPingheQ4NotIn(List<Integer> values) {
            addCriterion("pinghe_q4 not in", values, "pingheQ4");
            return (Criteria) this;
        }

        public Criteria andPingheQ4Between(Integer value1, Integer value2) {
            addCriterion("pinghe_q4 between", value1, value2, "pingheQ4");
            return (Criteria) this;
        }

        public Criteria andPingheQ4NotBetween(Integer value1, Integer value2) {
            addCriterion("pinghe_q4 not between", value1, value2, "pingheQ4");
            return (Criteria) this;
        }

        public Criteria andPingheQ5IsNull() {
            addCriterion("pinghe_q5 is null");
            return (Criteria) this;
        }

        public Criteria andPingheQ5IsNotNull() {
            addCriterion("pinghe_q5 is not null");
            return (Criteria) this;
        }

        public Criteria andPingheQ5EqualTo(Integer value) {
            addCriterion("pinghe_q5 =", value, "pingheQ5");
            return (Criteria) this;
        }

        public Criteria andPingheQ5NotEqualTo(Integer value) {
            addCriterion("pinghe_q5 <>", value, "pingheQ5");
            return (Criteria) this;
        }

        public Criteria andPingheQ5GreaterThan(Integer value) {
            addCriterion("pinghe_q5 >", value, "pingheQ5");
            return (Criteria) this;
        }

        public Criteria andPingheQ5GreaterThanOrEqualTo(Integer value) {
            addCriterion("pinghe_q5 >=", value, "pingheQ5");
            return (Criteria) this;
        }

        public Criteria andPingheQ5LessThan(Integer value) {
            addCriterion("pinghe_q5 <", value, "pingheQ5");
            return (Criteria) this;
        }

        public Criteria andPingheQ5LessThanOrEqualTo(Integer value) {
            addCriterion("pinghe_q5 <=", value, "pingheQ5");
            return (Criteria) this;
        }

        public Criteria andPingheQ5In(List<Integer> values) {
            addCriterion("pinghe_q5 in", values, "pingheQ5");
            return (Criteria) this;
        }

        public Criteria andPingheQ5NotIn(List<Integer> values) {
            addCriterion("pinghe_q5 not in", values, "pingheQ5");
            return (Criteria) this;
        }

        public Criteria andPingheQ5Between(Integer value1, Integer value2) {
            addCriterion("pinghe_q5 between", value1, value2, "pingheQ5");
            return (Criteria) this;
        }

        public Criteria andPingheQ5NotBetween(Integer value1, Integer value2) {
            addCriterion("pinghe_q5 not between", value1, value2, "pingheQ5");
            return (Criteria) this;
        }

        public Criteria andPingheQ6IsNull() {
            addCriterion("pinghe_q6 is null");
            return (Criteria) this;
        }

        public Criteria andPingheQ6IsNotNull() {
            addCriterion("pinghe_q6 is not null");
            return (Criteria) this;
        }

        public Criteria andPingheQ6EqualTo(Integer value) {
            addCriterion("pinghe_q6 =", value, "pingheQ6");
            return (Criteria) this;
        }

        public Criteria andPingheQ6NotEqualTo(Integer value) {
            addCriterion("pinghe_q6 <>", value, "pingheQ6");
            return (Criteria) this;
        }

        public Criteria andPingheQ6GreaterThan(Integer value) {
            addCriterion("pinghe_q6 >", value, "pingheQ6");
            return (Criteria) this;
        }

        public Criteria andPingheQ6GreaterThanOrEqualTo(Integer value) {
            addCriterion("pinghe_q6 >=", value, "pingheQ6");
            return (Criteria) this;
        }

        public Criteria andPingheQ6LessThan(Integer value) {
            addCriterion("pinghe_q6 <", value, "pingheQ6");
            return (Criteria) this;
        }

        public Criteria andPingheQ6LessThanOrEqualTo(Integer value) {
            addCriterion("pinghe_q6 <=", value, "pingheQ6");
            return (Criteria) this;
        }

        public Criteria andPingheQ6In(List<Integer> values) {
            addCriterion("pinghe_q6 in", values, "pingheQ6");
            return (Criteria) this;
        }

        public Criteria andPingheQ6NotIn(List<Integer> values) {
            addCriterion("pinghe_q6 not in", values, "pingheQ6");
            return (Criteria) this;
        }

        public Criteria andPingheQ6Between(Integer value1, Integer value2) {
            addCriterion("pinghe_q6 between", value1, value2, "pingheQ6");
            return (Criteria) this;
        }

        public Criteria andPingheQ6NotBetween(Integer value1, Integer value2) {
            addCriterion("pinghe_q6 not between", value1, value2, "pingheQ6");
            return (Criteria) this;
        }

        public Criteria andPingheQ7IsNull() {
            addCriterion("pinghe_q7 is null");
            return (Criteria) this;
        }

        public Criteria andPingheQ7IsNotNull() {
            addCriterion("pinghe_q7 is not null");
            return (Criteria) this;
        }

        public Criteria andPingheQ7EqualTo(Integer value) {
            addCriterion("pinghe_q7 =", value, "pingheQ7");
            return (Criteria) this;
        }

        public Criteria andPingheQ7NotEqualTo(Integer value) {
            addCriterion("pinghe_q7 <>", value, "pingheQ7");
            return (Criteria) this;
        }

        public Criteria andPingheQ7GreaterThan(Integer value) {
            addCriterion("pinghe_q7 >", value, "pingheQ7");
            return (Criteria) this;
        }

        public Criteria andPingheQ7GreaterThanOrEqualTo(Integer value) {
            addCriterion("pinghe_q7 >=", value, "pingheQ7");
            return (Criteria) this;
        }

        public Criteria andPingheQ7LessThan(Integer value) {
            addCriterion("pinghe_q7 <", value, "pingheQ7");
            return (Criteria) this;
        }

        public Criteria andPingheQ7LessThanOrEqualTo(Integer value) {
            addCriterion("pinghe_q7 <=", value, "pingheQ7");
            return (Criteria) this;
        }

        public Criteria andPingheQ7In(List<Integer> values) {
            addCriterion("pinghe_q7 in", values, "pingheQ7");
            return (Criteria) this;
        }

        public Criteria andPingheQ7NotIn(List<Integer> values) {
            addCriterion("pinghe_q7 not in", values, "pingheQ7");
            return (Criteria) this;
        }

        public Criteria andPingheQ7Between(Integer value1, Integer value2) {
            addCriterion("pinghe_q7 between", value1, value2, "pingheQ7");
            return (Criteria) this;
        }

        public Criteria andPingheQ7NotBetween(Integer value1, Integer value2) {
            addCriterion("pinghe_q7 not between", value1, value2, "pingheQ7");
            return (Criteria) this;
        }

        public Criteria andPingheQ8IsNull() {
            addCriterion("pinghe_q8 is null");
            return (Criteria) this;
        }

        public Criteria andPingheQ8IsNotNull() {
            addCriterion("pinghe_q8 is not null");
            return (Criteria) this;
        }

        public Criteria andPingheQ8EqualTo(Integer value) {
            addCriterion("pinghe_q8 =", value, "pingheQ8");
            return (Criteria) this;
        }

        public Criteria andPingheQ8NotEqualTo(Integer value) {
            addCriterion("pinghe_q8 <>", value, "pingheQ8");
            return (Criteria) this;
        }

        public Criteria andPingheQ8GreaterThan(Integer value) {
            addCriterion("pinghe_q8 >", value, "pingheQ8");
            return (Criteria) this;
        }

        public Criteria andPingheQ8GreaterThanOrEqualTo(Integer value) {
            addCriterion("pinghe_q8 >=", value, "pingheQ8");
            return (Criteria) this;
        }

        public Criteria andPingheQ8LessThan(Integer value) {
            addCriterion("pinghe_q8 <", value, "pingheQ8");
            return (Criteria) this;
        }

        public Criteria andPingheQ8LessThanOrEqualTo(Integer value) {
            addCriterion("pinghe_q8 <=", value, "pingheQ8");
            return (Criteria) this;
        }

        public Criteria andPingheQ8In(List<Integer> values) {
            addCriterion("pinghe_q8 in", values, "pingheQ8");
            return (Criteria) this;
        }

        public Criteria andPingheQ8NotIn(List<Integer> values) {
            addCriterion("pinghe_q8 not in", values, "pingheQ8");
            return (Criteria) this;
        }

        public Criteria andPingheQ8Between(Integer value1, Integer value2) {
            addCriterion("pinghe_q8 between", value1, value2, "pingheQ8");
            return (Criteria) this;
        }

        public Criteria andPingheQ8NotBetween(Integer value1, Integer value2) {
            addCriterion("pinghe_q8 not between", value1, value2, "pingheQ8");
            return (Criteria) this;
        }

        public Criteria andPingheScoreIsNull() {
            addCriterion("pinghe_score is null");
            return (Criteria) this;
        }

        public Criteria andPingheScoreIsNotNull() {
            addCriterion("pinghe_score is not null");
            return (Criteria) this;
        }

        public Criteria andPingheScoreEqualTo(Integer value) {
            addCriterion("pinghe_score =", value, "pingheScore");
            return (Criteria) this;
        }

        public Criteria andPingheScoreNotEqualTo(Integer value) {
            addCriterion("pinghe_score <>", value, "pingheScore");
            return (Criteria) this;
        }

        public Criteria andPingheScoreGreaterThan(Integer value) {
            addCriterion("pinghe_score >", value, "pingheScore");
            return (Criteria) this;
        }

        public Criteria andPingheScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("pinghe_score >=", value, "pingheScore");
            return (Criteria) this;
        }

        public Criteria andPingheScoreLessThan(Integer value) {
            addCriterion("pinghe_score <", value, "pingheScore");
            return (Criteria) this;
        }

        public Criteria andPingheScoreLessThanOrEqualTo(Integer value) {
            addCriterion("pinghe_score <=", value, "pingheScore");
            return (Criteria) this;
        }

        public Criteria andPingheScoreIn(List<Integer> values) {
            addCriterion("pinghe_score in", values, "pingheScore");
            return (Criteria) this;
        }

        public Criteria andPingheScoreNotIn(List<Integer> values) {
            addCriterion("pinghe_score not in", values, "pingheScore");
            return (Criteria) this;
        }

        public Criteria andPingheScoreBetween(Integer value1, Integer value2) {
            addCriterion("pinghe_score between", value1, value2, "pingheScore");
            return (Criteria) this;
        }

        public Criteria andPingheScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("pinghe_score not between", value1, value2, "pingheScore");
            return (Criteria) this;
        }

        public Criteria andPingheResultIsNull() {
            addCriterion("pinghe_result is null");
            return (Criteria) this;
        }

        public Criteria andPingheResultIsNotNull() {
            addCriterion("pinghe_result is not null");
            return (Criteria) this;
        }

        public Criteria andPingheResultEqualTo(Integer value) {
            addCriterion("pinghe_result =", value, "pingheResult");
            return (Criteria) this;
        }

        public Criteria andPingheResultNotEqualTo(Integer value) {
            addCriterion("pinghe_result <>", value, "pingheResult");
            return (Criteria) this;
        }

        public Criteria andPingheResultGreaterThan(Integer value) {
            addCriterion("pinghe_result >", value, "pingheResult");
            return (Criteria) this;
        }

        public Criteria andPingheResultGreaterThanOrEqualTo(Integer value) {
            addCriterion("pinghe_result >=", value, "pingheResult");
            return (Criteria) this;
        }

        public Criteria andPingheResultLessThan(Integer value) {
            addCriterion("pinghe_result <", value, "pingheResult");
            return (Criteria) this;
        }

        public Criteria andPingheResultLessThanOrEqualTo(Integer value) {
            addCriterion("pinghe_result <=", value, "pingheResult");
            return (Criteria) this;
        }

        public Criteria andPingheResultIn(List<Integer> values) {
            addCriterion("pinghe_result in", values, "pingheResult");
            return (Criteria) this;
        }

        public Criteria andPingheResultNotIn(List<Integer> values) {
            addCriterion("pinghe_result not in", values, "pingheResult");
            return (Criteria) this;
        }

        public Criteria andPingheResultBetween(Integer value1, Integer value2) {
            addCriterion("pinghe_result between", value1, value2, "pingheResult");
            return (Criteria) this;
        }

        public Criteria andPingheResultNotBetween(Integer value1, Integer value2) {
            addCriterion("pinghe_result not between", value1, value2, "pingheResult");
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