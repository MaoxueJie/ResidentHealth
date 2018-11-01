package com.breeze.health.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserTCMTanshiExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserTCMTanshiExample() {
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

        public Criteria andTanshiQ1IsNull() {
            addCriterion("tanshi_q1 is null");
            return (Criteria) this;
        }

        public Criteria andTanshiQ1IsNotNull() {
            addCriterion("tanshi_q1 is not null");
            return (Criteria) this;
        }

        public Criteria andTanshiQ1EqualTo(Integer value) {
            addCriterion("tanshi_q1 =", value, "tanshiQ1");
            return (Criteria) this;
        }

        public Criteria andTanshiQ1NotEqualTo(Integer value) {
            addCriterion("tanshi_q1 <>", value, "tanshiQ1");
            return (Criteria) this;
        }

        public Criteria andTanshiQ1GreaterThan(Integer value) {
            addCriterion("tanshi_q1 >", value, "tanshiQ1");
            return (Criteria) this;
        }

        public Criteria andTanshiQ1GreaterThanOrEqualTo(Integer value) {
            addCriterion("tanshi_q1 >=", value, "tanshiQ1");
            return (Criteria) this;
        }

        public Criteria andTanshiQ1LessThan(Integer value) {
            addCriterion("tanshi_q1 <", value, "tanshiQ1");
            return (Criteria) this;
        }

        public Criteria andTanshiQ1LessThanOrEqualTo(Integer value) {
            addCriterion("tanshi_q1 <=", value, "tanshiQ1");
            return (Criteria) this;
        }

        public Criteria andTanshiQ1In(List<Integer> values) {
            addCriterion("tanshi_q1 in", values, "tanshiQ1");
            return (Criteria) this;
        }

        public Criteria andTanshiQ1NotIn(List<Integer> values) {
            addCriterion("tanshi_q1 not in", values, "tanshiQ1");
            return (Criteria) this;
        }

        public Criteria andTanshiQ1Between(Integer value1, Integer value2) {
            addCriterion("tanshi_q1 between", value1, value2, "tanshiQ1");
            return (Criteria) this;
        }

        public Criteria andTanshiQ1NotBetween(Integer value1, Integer value2) {
            addCriterion("tanshi_q1 not between", value1, value2, "tanshiQ1");
            return (Criteria) this;
        }

        public Criteria andTanshiQ2IsNull() {
            addCriterion("tanshi_q2 is null");
            return (Criteria) this;
        }

        public Criteria andTanshiQ2IsNotNull() {
            addCriterion("tanshi_q2 is not null");
            return (Criteria) this;
        }

        public Criteria andTanshiQ2EqualTo(Integer value) {
            addCriterion("tanshi_q2 =", value, "tanshiQ2");
            return (Criteria) this;
        }

        public Criteria andTanshiQ2NotEqualTo(Integer value) {
            addCriterion("tanshi_q2 <>", value, "tanshiQ2");
            return (Criteria) this;
        }

        public Criteria andTanshiQ2GreaterThan(Integer value) {
            addCriterion("tanshi_q2 >", value, "tanshiQ2");
            return (Criteria) this;
        }

        public Criteria andTanshiQ2GreaterThanOrEqualTo(Integer value) {
            addCriterion("tanshi_q2 >=", value, "tanshiQ2");
            return (Criteria) this;
        }

        public Criteria andTanshiQ2LessThan(Integer value) {
            addCriterion("tanshi_q2 <", value, "tanshiQ2");
            return (Criteria) this;
        }

        public Criteria andTanshiQ2LessThanOrEqualTo(Integer value) {
            addCriterion("tanshi_q2 <=", value, "tanshiQ2");
            return (Criteria) this;
        }

        public Criteria andTanshiQ2In(List<Integer> values) {
            addCriterion("tanshi_q2 in", values, "tanshiQ2");
            return (Criteria) this;
        }

        public Criteria andTanshiQ2NotIn(List<Integer> values) {
            addCriterion("tanshi_q2 not in", values, "tanshiQ2");
            return (Criteria) this;
        }

        public Criteria andTanshiQ2Between(Integer value1, Integer value2) {
            addCriterion("tanshi_q2 between", value1, value2, "tanshiQ2");
            return (Criteria) this;
        }

        public Criteria andTanshiQ2NotBetween(Integer value1, Integer value2) {
            addCriterion("tanshi_q2 not between", value1, value2, "tanshiQ2");
            return (Criteria) this;
        }

        public Criteria andTanshiQ3IsNull() {
            addCriterion("tanshi_q3 is null");
            return (Criteria) this;
        }

        public Criteria andTanshiQ3IsNotNull() {
            addCriterion("tanshi_q3 is not null");
            return (Criteria) this;
        }

        public Criteria andTanshiQ3EqualTo(Integer value) {
            addCriterion("tanshi_q3 =", value, "tanshiQ3");
            return (Criteria) this;
        }

        public Criteria andTanshiQ3NotEqualTo(Integer value) {
            addCriterion("tanshi_q3 <>", value, "tanshiQ3");
            return (Criteria) this;
        }

        public Criteria andTanshiQ3GreaterThan(Integer value) {
            addCriterion("tanshi_q3 >", value, "tanshiQ3");
            return (Criteria) this;
        }

        public Criteria andTanshiQ3GreaterThanOrEqualTo(Integer value) {
            addCriterion("tanshi_q3 >=", value, "tanshiQ3");
            return (Criteria) this;
        }

        public Criteria andTanshiQ3LessThan(Integer value) {
            addCriterion("tanshi_q3 <", value, "tanshiQ3");
            return (Criteria) this;
        }

        public Criteria andTanshiQ3LessThanOrEqualTo(Integer value) {
            addCriterion("tanshi_q3 <=", value, "tanshiQ3");
            return (Criteria) this;
        }

        public Criteria andTanshiQ3In(List<Integer> values) {
            addCriterion("tanshi_q3 in", values, "tanshiQ3");
            return (Criteria) this;
        }

        public Criteria andTanshiQ3NotIn(List<Integer> values) {
            addCriterion("tanshi_q3 not in", values, "tanshiQ3");
            return (Criteria) this;
        }

        public Criteria andTanshiQ3Between(Integer value1, Integer value2) {
            addCriterion("tanshi_q3 between", value1, value2, "tanshiQ3");
            return (Criteria) this;
        }

        public Criteria andTanshiQ3NotBetween(Integer value1, Integer value2) {
            addCriterion("tanshi_q3 not between", value1, value2, "tanshiQ3");
            return (Criteria) this;
        }

        public Criteria andTanshiQ4IsNull() {
            addCriterion("tanshi_q4 is null");
            return (Criteria) this;
        }

        public Criteria andTanshiQ4IsNotNull() {
            addCriterion("tanshi_q4 is not null");
            return (Criteria) this;
        }

        public Criteria andTanshiQ4EqualTo(Integer value) {
            addCriterion("tanshi_q4 =", value, "tanshiQ4");
            return (Criteria) this;
        }

        public Criteria andTanshiQ4NotEqualTo(Integer value) {
            addCriterion("tanshi_q4 <>", value, "tanshiQ4");
            return (Criteria) this;
        }

        public Criteria andTanshiQ4GreaterThan(Integer value) {
            addCriterion("tanshi_q4 >", value, "tanshiQ4");
            return (Criteria) this;
        }

        public Criteria andTanshiQ4GreaterThanOrEqualTo(Integer value) {
            addCriterion("tanshi_q4 >=", value, "tanshiQ4");
            return (Criteria) this;
        }

        public Criteria andTanshiQ4LessThan(Integer value) {
            addCriterion("tanshi_q4 <", value, "tanshiQ4");
            return (Criteria) this;
        }

        public Criteria andTanshiQ4LessThanOrEqualTo(Integer value) {
            addCriterion("tanshi_q4 <=", value, "tanshiQ4");
            return (Criteria) this;
        }

        public Criteria andTanshiQ4In(List<Integer> values) {
            addCriterion("tanshi_q4 in", values, "tanshiQ4");
            return (Criteria) this;
        }

        public Criteria andTanshiQ4NotIn(List<Integer> values) {
            addCriterion("tanshi_q4 not in", values, "tanshiQ4");
            return (Criteria) this;
        }

        public Criteria andTanshiQ4Between(Integer value1, Integer value2) {
            addCriterion("tanshi_q4 between", value1, value2, "tanshiQ4");
            return (Criteria) this;
        }

        public Criteria andTanshiQ4NotBetween(Integer value1, Integer value2) {
            addCriterion("tanshi_q4 not between", value1, value2, "tanshiQ4");
            return (Criteria) this;
        }

        public Criteria andTanshiQ5IsNull() {
            addCriterion("tanshi_q5 is null");
            return (Criteria) this;
        }

        public Criteria andTanshiQ5IsNotNull() {
            addCriterion("tanshi_q5 is not null");
            return (Criteria) this;
        }

        public Criteria andTanshiQ5EqualTo(Integer value) {
            addCriterion("tanshi_q5 =", value, "tanshiQ5");
            return (Criteria) this;
        }

        public Criteria andTanshiQ5NotEqualTo(Integer value) {
            addCriterion("tanshi_q5 <>", value, "tanshiQ5");
            return (Criteria) this;
        }

        public Criteria andTanshiQ5GreaterThan(Integer value) {
            addCriterion("tanshi_q5 >", value, "tanshiQ5");
            return (Criteria) this;
        }

        public Criteria andTanshiQ5GreaterThanOrEqualTo(Integer value) {
            addCriterion("tanshi_q5 >=", value, "tanshiQ5");
            return (Criteria) this;
        }

        public Criteria andTanshiQ5LessThan(Integer value) {
            addCriterion("tanshi_q5 <", value, "tanshiQ5");
            return (Criteria) this;
        }

        public Criteria andTanshiQ5LessThanOrEqualTo(Integer value) {
            addCriterion("tanshi_q5 <=", value, "tanshiQ5");
            return (Criteria) this;
        }

        public Criteria andTanshiQ5In(List<Integer> values) {
            addCriterion("tanshi_q5 in", values, "tanshiQ5");
            return (Criteria) this;
        }

        public Criteria andTanshiQ5NotIn(List<Integer> values) {
            addCriterion("tanshi_q5 not in", values, "tanshiQ5");
            return (Criteria) this;
        }

        public Criteria andTanshiQ5Between(Integer value1, Integer value2) {
            addCriterion("tanshi_q5 between", value1, value2, "tanshiQ5");
            return (Criteria) this;
        }

        public Criteria andTanshiQ5NotBetween(Integer value1, Integer value2) {
            addCriterion("tanshi_q5 not between", value1, value2, "tanshiQ5");
            return (Criteria) this;
        }

        public Criteria andTanshiQ6IsNull() {
            addCriterion("tanshi_q6 is null");
            return (Criteria) this;
        }

        public Criteria andTanshiQ6IsNotNull() {
            addCriterion("tanshi_q6 is not null");
            return (Criteria) this;
        }

        public Criteria andTanshiQ6EqualTo(Integer value) {
            addCriterion("tanshi_q6 =", value, "tanshiQ6");
            return (Criteria) this;
        }

        public Criteria andTanshiQ6NotEqualTo(Integer value) {
            addCriterion("tanshi_q6 <>", value, "tanshiQ6");
            return (Criteria) this;
        }

        public Criteria andTanshiQ6GreaterThan(Integer value) {
            addCriterion("tanshi_q6 >", value, "tanshiQ6");
            return (Criteria) this;
        }

        public Criteria andTanshiQ6GreaterThanOrEqualTo(Integer value) {
            addCriterion("tanshi_q6 >=", value, "tanshiQ6");
            return (Criteria) this;
        }

        public Criteria andTanshiQ6LessThan(Integer value) {
            addCriterion("tanshi_q6 <", value, "tanshiQ6");
            return (Criteria) this;
        }

        public Criteria andTanshiQ6LessThanOrEqualTo(Integer value) {
            addCriterion("tanshi_q6 <=", value, "tanshiQ6");
            return (Criteria) this;
        }

        public Criteria andTanshiQ6In(List<Integer> values) {
            addCriterion("tanshi_q6 in", values, "tanshiQ6");
            return (Criteria) this;
        }

        public Criteria andTanshiQ6NotIn(List<Integer> values) {
            addCriterion("tanshi_q6 not in", values, "tanshiQ6");
            return (Criteria) this;
        }

        public Criteria andTanshiQ6Between(Integer value1, Integer value2) {
            addCriterion("tanshi_q6 between", value1, value2, "tanshiQ6");
            return (Criteria) this;
        }

        public Criteria andTanshiQ6NotBetween(Integer value1, Integer value2) {
            addCriterion("tanshi_q6 not between", value1, value2, "tanshiQ6");
            return (Criteria) this;
        }

        public Criteria andTanshiQ7IsNull() {
            addCriterion("tanshi_q7 is null");
            return (Criteria) this;
        }

        public Criteria andTanshiQ7IsNotNull() {
            addCriterion("tanshi_q7 is not null");
            return (Criteria) this;
        }

        public Criteria andTanshiQ7EqualTo(Integer value) {
            addCriterion("tanshi_q7 =", value, "tanshiQ7");
            return (Criteria) this;
        }

        public Criteria andTanshiQ7NotEqualTo(Integer value) {
            addCriterion("tanshi_q7 <>", value, "tanshiQ7");
            return (Criteria) this;
        }

        public Criteria andTanshiQ7GreaterThan(Integer value) {
            addCriterion("tanshi_q7 >", value, "tanshiQ7");
            return (Criteria) this;
        }

        public Criteria andTanshiQ7GreaterThanOrEqualTo(Integer value) {
            addCriterion("tanshi_q7 >=", value, "tanshiQ7");
            return (Criteria) this;
        }

        public Criteria andTanshiQ7LessThan(Integer value) {
            addCriterion("tanshi_q7 <", value, "tanshiQ7");
            return (Criteria) this;
        }

        public Criteria andTanshiQ7LessThanOrEqualTo(Integer value) {
            addCriterion("tanshi_q7 <=", value, "tanshiQ7");
            return (Criteria) this;
        }

        public Criteria andTanshiQ7In(List<Integer> values) {
            addCriterion("tanshi_q7 in", values, "tanshiQ7");
            return (Criteria) this;
        }

        public Criteria andTanshiQ7NotIn(List<Integer> values) {
            addCriterion("tanshi_q7 not in", values, "tanshiQ7");
            return (Criteria) this;
        }

        public Criteria andTanshiQ7Between(Integer value1, Integer value2) {
            addCriterion("tanshi_q7 between", value1, value2, "tanshiQ7");
            return (Criteria) this;
        }

        public Criteria andTanshiQ7NotBetween(Integer value1, Integer value2) {
            addCriterion("tanshi_q7 not between", value1, value2, "tanshiQ7");
            return (Criteria) this;
        }

        public Criteria andTanshiQ8IsNull() {
            addCriterion("tanshi_q8 is null");
            return (Criteria) this;
        }

        public Criteria andTanshiQ8IsNotNull() {
            addCriterion("tanshi_q8 is not null");
            return (Criteria) this;
        }

        public Criteria andTanshiQ8EqualTo(Integer value) {
            addCriterion("tanshi_q8 =", value, "tanshiQ8");
            return (Criteria) this;
        }

        public Criteria andTanshiQ8NotEqualTo(Integer value) {
            addCriterion("tanshi_q8 <>", value, "tanshiQ8");
            return (Criteria) this;
        }

        public Criteria andTanshiQ8GreaterThan(Integer value) {
            addCriterion("tanshi_q8 >", value, "tanshiQ8");
            return (Criteria) this;
        }

        public Criteria andTanshiQ8GreaterThanOrEqualTo(Integer value) {
            addCriterion("tanshi_q8 >=", value, "tanshiQ8");
            return (Criteria) this;
        }

        public Criteria andTanshiQ8LessThan(Integer value) {
            addCriterion("tanshi_q8 <", value, "tanshiQ8");
            return (Criteria) this;
        }

        public Criteria andTanshiQ8LessThanOrEqualTo(Integer value) {
            addCriterion("tanshi_q8 <=", value, "tanshiQ8");
            return (Criteria) this;
        }

        public Criteria andTanshiQ8In(List<Integer> values) {
            addCriterion("tanshi_q8 in", values, "tanshiQ8");
            return (Criteria) this;
        }

        public Criteria andTanshiQ8NotIn(List<Integer> values) {
            addCriterion("tanshi_q8 not in", values, "tanshiQ8");
            return (Criteria) this;
        }

        public Criteria andTanshiQ8Between(Integer value1, Integer value2) {
            addCriterion("tanshi_q8 between", value1, value2, "tanshiQ8");
            return (Criteria) this;
        }

        public Criteria andTanshiQ8NotBetween(Integer value1, Integer value2) {
            addCriterion("tanshi_q8 not between", value1, value2, "tanshiQ8");
            return (Criteria) this;
        }

        public Criteria andTanshiScoreIsNull() {
            addCriterion("tanshi_score is null");
            return (Criteria) this;
        }

        public Criteria andTanshiScoreIsNotNull() {
            addCriterion("tanshi_score is not null");
            return (Criteria) this;
        }

        public Criteria andTanshiScoreEqualTo(Integer value) {
            addCriterion("tanshi_score =", value, "tanshiScore");
            return (Criteria) this;
        }

        public Criteria andTanshiScoreNotEqualTo(Integer value) {
            addCriterion("tanshi_score <>", value, "tanshiScore");
            return (Criteria) this;
        }

        public Criteria andTanshiScoreGreaterThan(Integer value) {
            addCriterion("tanshi_score >", value, "tanshiScore");
            return (Criteria) this;
        }

        public Criteria andTanshiScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("tanshi_score >=", value, "tanshiScore");
            return (Criteria) this;
        }

        public Criteria andTanshiScoreLessThan(Integer value) {
            addCriterion("tanshi_score <", value, "tanshiScore");
            return (Criteria) this;
        }

        public Criteria andTanshiScoreLessThanOrEqualTo(Integer value) {
            addCriterion("tanshi_score <=", value, "tanshiScore");
            return (Criteria) this;
        }

        public Criteria andTanshiScoreIn(List<Integer> values) {
            addCriterion("tanshi_score in", values, "tanshiScore");
            return (Criteria) this;
        }

        public Criteria andTanshiScoreNotIn(List<Integer> values) {
            addCriterion("tanshi_score not in", values, "tanshiScore");
            return (Criteria) this;
        }

        public Criteria andTanshiScoreBetween(Integer value1, Integer value2) {
            addCriterion("tanshi_score between", value1, value2, "tanshiScore");
            return (Criteria) this;
        }

        public Criteria andTanshiScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("tanshi_score not between", value1, value2, "tanshiScore");
            return (Criteria) this;
        }

        public Criteria andTanshiResultIsNull() {
            addCriterion("tanshi_result is null");
            return (Criteria) this;
        }

        public Criteria andTanshiResultIsNotNull() {
            addCriterion("tanshi_result is not null");
            return (Criteria) this;
        }

        public Criteria andTanshiResultEqualTo(String value) {
            addCriterion("tanshi_result =", value, "tanshiResult");
            return (Criteria) this;
        }

        public Criteria andTanshiResultNotEqualTo(String value) {
            addCriterion("tanshi_result <>", value, "tanshiResult");
            return (Criteria) this;
        }

        public Criteria andTanshiResultGreaterThan(String value) {
            addCriterion("tanshi_result >", value, "tanshiResult");
            return (Criteria) this;
        }

        public Criteria andTanshiResultGreaterThanOrEqualTo(String value) {
            addCriterion("tanshi_result >=", value, "tanshiResult");
            return (Criteria) this;
        }

        public Criteria andTanshiResultLessThan(String value) {
            addCriterion("tanshi_result <", value, "tanshiResult");
            return (Criteria) this;
        }

        public Criteria andTanshiResultLessThanOrEqualTo(String value) {
            addCriterion("tanshi_result <=", value, "tanshiResult");
            return (Criteria) this;
        }

        public Criteria andTanshiResultLike(String value) {
            addCriterion("tanshi_result like", value, "tanshiResult");
            return (Criteria) this;
        }

        public Criteria andTanshiResultNotLike(String value) {
            addCriterion("tanshi_result not like", value, "tanshiResult");
            return (Criteria) this;
        }

        public Criteria andTanshiResultIn(List<String> values) {
            addCriterion("tanshi_result in", values, "tanshiResult");
            return (Criteria) this;
        }

        public Criteria andTanshiResultNotIn(List<String> values) {
            addCriterion("tanshi_result not in", values, "tanshiResult");
            return (Criteria) this;
        }

        public Criteria andTanshiResultBetween(String value1, String value2) {
            addCriterion("tanshi_result between", value1, value2, "tanshiResult");
            return (Criteria) this;
        }

        public Criteria andTanshiResultNotBetween(String value1, String value2) {
            addCriterion("tanshi_result not between", value1, value2, "tanshiResult");
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