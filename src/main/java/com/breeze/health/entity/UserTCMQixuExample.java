package com.breeze.health.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserTCMQixuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserTCMQixuExample() {
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

        public Criteria andQixuQ1IsNull() {
            addCriterion("qixu_q1 is null");
            return (Criteria) this;
        }

        public Criteria andQixuQ1IsNotNull() {
            addCriterion("qixu_q1 is not null");
            return (Criteria) this;
        }

        public Criteria andQixuQ1EqualTo(Integer value) {
            addCriterion("qixu_q1 =", value, "qixuQ1");
            return (Criteria) this;
        }

        public Criteria andQixuQ1NotEqualTo(Integer value) {
            addCriterion("qixu_q1 <>", value, "qixuQ1");
            return (Criteria) this;
        }

        public Criteria andQixuQ1GreaterThan(Integer value) {
            addCriterion("qixu_q1 >", value, "qixuQ1");
            return (Criteria) this;
        }

        public Criteria andQixuQ1GreaterThanOrEqualTo(Integer value) {
            addCriterion("qixu_q1 >=", value, "qixuQ1");
            return (Criteria) this;
        }

        public Criteria andQixuQ1LessThan(Integer value) {
            addCriterion("qixu_q1 <", value, "qixuQ1");
            return (Criteria) this;
        }

        public Criteria andQixuQ1LessThanOrEqualTo(Integer value) {
            addCriterion("qixu_q1 <=", value, "qixuQ1");
            return (Criteria) this;
        }

        public Criteria andQixuQ1In(List<Integer> values) {
            addCriterion("qixu_q1 in", values, "qixuQ1");
            return (Criteria) this;
        }

        public Criteria andQixuQ1NotIn(List<Integer> values) {
            addCriterion("qixu_q1 not in", values, "qixuQ1");
            return (Criteria) this;
        }

        public Criteria andQixuQ1Between(Integer value1, Integer value2) {
            addCriterion("qixu_q1 between", value1, value2, "qixuQ1");
            return (Criteria) this;
        }

        public Criteria andQixuQ1NotBetween(Integer value1, Integer value2) {
            addCriterion("qixu_q1 not between", value1, value2, "qixuQ1");
            return (Criteria) this;
        }

        public Criteria andQixuQ2IsNull() {
            addCriterion("qixu_q2 is null");
            return (Criteria) this;
        }

        public Criteria andQixuQ2IsNotNull() {
            addCriterion("qixu_q2 is not null");
            return (Criteria) this;
        }

        public Criteria andQixuQ2EqualTo(Integer value) {
            addCriterion("qixu_q2 =", value, "qixuQ2");
            return (Criteria) this;
        }

        public Criteria andQixuQ2NotEqualTo(Integer value) {
            addCriterion("qixu_q2 <>", value, "qixuQ2");
            return (Criteria) this;
        }

        public Criteria andQixuQ2GreaterThan(Integer value) {
            addCriterion("qixu_q2 >", value, "qixuQ2");
            return (Criteria) this;
        }

        public Criteria andQixuQ2GreaterThanOrEqualTo(Integer value) {
            addCriterion("qixu_q2 >=", value, "qixuQ2");
            return (Criteria) this;
        }

        public Criteria andQixuQ2LessThan(Integer value) {
            addCriterion("qixu_q2 <", value, "qixuQ2");
            return (Criteria) this;
        }

        public Criteria andQixuQ2LessThanOrEqualTo(Integer value) {
            addCriterion("qixu_q2 <=", value, "qixuQ2");
            return (Criteria) this;
        }

        public Criteria andQixuQ2In(List<Integer> values) {
            addCriterion("qixu_q2 in", values, "qixuQ2");
            return (Criteria) this;
        }

        public Criteria andQixuQ2NotIn(List<Integer> values) {
            addCriterion("qixu_q2 not in", values, "qixuQ2");
            return (Criteria) this;
        }

        public Criteria andQixuQ2Between(Integer value1, Integer value2) {
            addCriterion("qixu_q2 between", value1, value2, "qixuQ2");
            return (Criteria) this;
        }

        public Criteria andQixuQ2NotBetween(Integer value1, Integer value2) {
            addCriterion("qixu_q2 not between", value1, value2, "qixuQ2");
            return (Criteria) this;
        }

        public Criteria andQixuQ3IsNull() {
            addCriterion("qixu_q3 is null");
            return (Criteria) this;
        }

        public Criteria andQixuQ3IsNotNull() {
            addCriterion("qixu_q3 is not null");
            return (Criteria) this;
        }

        public Criteria andQixuQ3EqualTo(Integer value) {
            addCriterion("qixu_q3 =", value, "qixuQ3");
            return (Criteria) this;
        }

        public Criteria andQixuQ3NotEqualTo(Integer value) {
            addCriterion("qixu_q3 <>", value, "qixuQ3");
            return (Criteria) this;
        }

        public Criteria andQixuQ3GreaterThan(Integer value) {
            addCriterion("qixu_q3 >", value, "qixuQ3");
            return (Criteria) this;
        }

        public Criteria andQixuQ3GreaterThanOrEqualTo(Integer value) {
            addCriterion("qixu_q3 >=", value, "qixuQ3");
            return (Criteria) this;
        }

        public Criteria andQixuQ3LessThan(Integer value) {
            addCriterion("qixu_q3 <", value, "qixuQ3");
            return (Criteria) this;
        }

        public Criteria andQixuQ3LessThanOrEqualTo(Integer value) {
            addCriterion("qixu_q3 <=", value, "qixuQ3");
            return (Criteria) this;
        }

        public Criteria andQixuQ3In(List<Integer> values) {
            addCriterion("qixu_q3 in", values, "qixuQ3");
            return (Criteria) this;
        }

        public Criteria andQixuQ3NotIn(List<Integer> values) {
            addCriterion("qixu_q3 not in", values, "qixuQ3");
            return (Criteria) this;
        }

        public Criteria andQixuQ3Between(Integer value1, Integer value2) {
            addCriterion("qixu_q3 between", value1, value2, "qixuQ3");
            return (Criteria) this;
        }

        public Criteria andQixuQ3NotBetween(Integer value1, Integer value2) {
            addCriterion("qixu_q3 not between", value1, value2, "qixuQ3");
            return (Criteria) this;
        }

        public Criteria andQixuQ4IsNull() {
            addCriterion("qixu_q4 is null");
            return (Criteria) this;
        }

        public Criteria andQixuQ4IsNotNull() {
            addCriterion("qixu_q4 is not null");
            return (Criteria) this;
        }

        public Criteria andQixuQ4EqualTo(Integer value) {
            addCriterion("qixu_q4 =", value, "qixuQ4");
            return (Criteria) this;
        }

        public Criteria andQixuQ4NotEqualTo(Integer value) {
            addCriterion("qixu_q4 <>", value, "qixuQ4");
            return (Criteria) this;
        }

        public Criteria andQixuQ4GreaterThan(Integer value) {
            addCriterion("qixu_q4 >", value, "qixuQ4");
            return (Criteria) this;
        }

        public Criteria andQixuQ4GreaterThanOrEqualTo(Integer value) {
            addCriterion("qixu_q4 >=", value, "qixuQ4");
            return (Criteria) this;
        }

        public Criteria andQixuQ4LessThan(Integer value) {
            addCriterion("qixu_q4 <", value, "qixuQ4");
            return (Criteria) this;
        }

        public Criteria andQixuQ4LessThanOrEqualTo(Integer value) {
            addCriterion("qixu_q4 <=", value, "qixuQ4");
            return (Criteria) this;
        }

        public Criteria andQixuQ4In(List<Integer> values) {
            addCriterion("qixu_q4 in", values, "qixuQ4");
            return (Criteria) this;
        }

        public Criteria andQixuQ4NotIn(List<Integer> values) {
            addCriterion("qixu_q4 not in", values, "qixuQ4");
            return (Criteria) this;
        }

        public Criteria andQixuQ4Between(Integer value1, Integer value2) {
            addCriterion("qixu_q4 between", value1, value2, "qixuQ4");
            return (Criteria) this;
        }

        public Criteria andQixuQ4NotBetween(Integer value1, Integer value2) {
            addCriterion("qixu_q4 not between", value1, value2, "qixuQ4");
            return (Criteria) this;
        }

        public Criteria andQixuQ5IsNull() {
            addCriterion("qixu_q5 is null");
            return (Criteria) this;
        }

        public Criteria andQixuQ5IsNotNull() {
            addCriterion("qixu_q5 is not null");
            return (Criteria) this;
        }

        public Criteria andQixuQ5EqualTo(Integer value) {
            addCriterion("qixu_q5 =", value, "qixuQ5");
            return (Criteria) this;
        }

        public Criteria andQixuQ5NotEqualTo(Integer value) {
            addCriterion("qixu_q5 <>", value, "qixuQ5");
            return (Criteria) this;
        }

        public Criteria andQixuQ5GreaterThan(Integer value) {
            addCriterion("qixu_q5 >", value, "qixuQ5");
            return (Criteria) this;
        }

        public Criteria andQixuQ5GreaterThanOrEqualTo(Integer value) {
            addCriterion("qixu_q5 >=", value, "qixuQ5");
            return (Criteria) this;
        }

        public Criteria andQixuQ5LessThan(Integer value) {
            addCriterion("qixu_q5 <", value, "qixuQ5");
            return (Criteria) this;
        }

        public Criteria andQixuQ5LessThanOrEqualTo(Integer value) {
            addCriterion("qixu_q5 <=", value, "qixuQ5");
            return (Criteria) this;
        }

        public Criteria andQixuQ5In(List<Integer> values) {
            addCriterion("qixu_q5 in", values, "qixuQ5");
            return (Criteria) this;
        }

        public Criteria andQixuQ5NotIn(List<Integer> values) {
            addCriterion("qixu_q5 not in", values, "qixuQ5");
            return (Criteria) this;
        }

        public Criteria andQixuQ5Between(Integer value1, Integer value2) {
            addCriterion("qixu_q5 between", value1, value2, "qixuQ5");
            return (Criteria) this;
        }

        public Criteria andQixuQ5NotBetween(Integer value1, Integer value2) {
            addCriterion("qixu_q5 not between", value1, value2, "qixuQ5");
            return (Criteria) this;
        }

        public Criteria andQixuQ6IsNull() {
            addCriterion("qixu_q6 is null");
            return (Criteria) this;
        }

        public Criteria andQixuQ6IsNotNull() {
            addCriterion("qixu_q6 is not null");
            return (Criteria) this;
        }

        public Criteria andQixuQ6EqualTo(Integer value) {
            addCriterion("qixu_q6 =", value, "qixuQ6");
            return (Criteria) this;
        }

        public Criteria andQixuQ6NotEqualTo(Integer value) {
            addCriterion("qixu_q6 <>", value, "qixuQ6");
            return (Criteria) this;
        }

        public Criteria andQixuQ6GreaterThan(Integer value) {
            addCriterion("qixu_q6 >", value, "qixuQ6");
            return (Criteria) this;
        }

        public Criteria andQixuQ6GreaterThanOrEqualTo(Integer value) {
            addCriterion("qixu_q6 >=", value, "qixuQ6");
            return (Criteria) this;
        }

        public Criteria andQixuQ6LessThan(Integer value) {
            addCriterion("qixu_q6 <", value, "qixuQ6");
            return (Criteria) this;
        }

        public Criteria andQixuQ6LessThanOrEqualTo(Integer value) {
            addCriterion("qixu_q6 <=", value, "qixuQ6");
            return (Criteria) this;
        }

        public Criteria andQixuQ6In(List<Integer> values) {
            addCriterion("qixu_q6 in", values, "qixuQ6");
            return (Criteria) this;
        }

        public Criteria andQixuQ6NotIn(List<Integer> values) {
            addCriterion("qixu_q6 not in", values, "qixuQ6");
            return (Criteria) this;
        }

        public Criteria andQixuQ6Between(Integer value1, Integer value2) {
            addCriterion("qixu_q6 between", value1, value2, "qixuQ6");
            return (Criteria) this;
        }

        public Criteria andQixuQ6NotBetween(Integer value1, Integer value2) {
            addCriterion("qixu_q6 not between", value1, value2, "qixuQ6");
            return (Criteria) this;
        }

        public Criteria andQixuQ7IsNull() {
            addCriterion("qixu_q7 is null");
            return (Criteria) this;
        }

        public Criteria andQixuQ7IsNotNull() {
            addCriterion("qixu_q7 is not null");
            return (Criteria) this;
        }

        public Criteria andQixuQ7EqualTo(Integer value) {
            addCriterion("qixu_q7 =", value, "qixuQ7");
            return (Criteria) this;
        }

        public Criteria andQixuQ7NotEqualTo(Integer value) {
            addCriterion("qixu_q7 <>", value, "qixuQ7");
            return (Criteria) this;
        }

        public Criteria andQixuQ7GreaterThan(Integer value) {
            addCriterion("qixu_q7 >", value, "qixuQ7");
            return (Criteria) this;
        }

        public Criteria andQixuQ7GreaterThanOrEqualTo(Integer value) {
            addCriterion("qixu_q7 >=", value, "qixuQ7");
            return (Criteria) this;
        }

        public Criteria andQixuQ7LessThan(Integer value) {
            addCriterion("qixu_q7 <", value, "qixuQ7");
            return (Criteria) this;
        }

        public Criteria andQixuQ7LessThanOrEqualTo(Integer value) {
            addCriterion("qixu_q7 <=", value, "qixuQ7");
            return (Criteria) this;
        }

        public Criteria andQixuQ7In(List<Integer> values) {
            addCriterion("qixu_q7 in", values, "qixuQ7");
            return (Criteria) this;
        }

        public Criteria andQixuQ7NotIn(List<Integer> values) {
            addCriterion("qixu_q7 not in", values, "qixuQ7");
            return (Criteria) this;
        }

        public Criteria andQixuQ7Between(Integer value1, Integer value2) {
            addCriterion("qixu_q7 between", value1, value2, "qixuQ7");
            return (Criteria) this;
        }

        public Criteria andQixuQ7NotBetween(Integer value1, Integer value2) {
            addCriterion("qixu_q7 not between", value1, value2, "qixuQ7");
            return (Criteria) this;
        }

        public Criteria andQixuQ8IsNull() {
            addCriterion("qixu_q8 is null");
            return (Criteria) this;
        }

        public Criteria andQixuQ8IsNotNull() {
            addCriterion("qixu_q8 is not null");
            return (Criteria) this;
        }

        public Criteria andQixuQ8EqualTo(Integer value) {
            addCriterion("qixu_q8 =", value, "qixuQ8");
            return (Criteria) this;
        }

        public Criteria andQixuQ8NotEqualTo(Integer value) {
            addCriterion("qixu_q8 <>", value, "qixuQ8");
            return (Criteria) this;
        }

        public Criteria andQixuQ8GreaterThan(Integer value) {
            addCriterion("qixu_q8 >", value, "qixuQ8");
            return (Criteria) this;
        }

        public Criteria andQixuQ8GreaterThanOrEqualTo(Integer value) {
            addCriterion("qixu_q8 >=", value, "qixuQ8");
            return (Criteria) this;
        }

        public Criteria andQixuQ8LessThan(Integer value) {
            addCriterion("qixu_q8 <", value, "qixuQ8");
            return (Criteria) this;
        }

        public Criteria andQixuQ8LessThanOrEqualTo(Integer value) {
            addCriterion("qixu_q8 <=", value, "qixuQ8");
            return (Criteria) this;
        }

        public Criteria andQixuQ8In(List<Integer> values) {
            addCriterion("qixu_q8 in", values, "qixuQ8");
            return (Criteria) this;
        }

        public Criteria andQixuQ8NotIn(List<Integer> values) {
            addCriterion("qixu_q8 not in", values, "qixuQ8");
            return (Criteria) this;
        }

        public Criteria andQixuQ8Between(Integer value1, Integer value2) {
            addCriterion("qixu_q8 between", value1, value2, "qixuQ8");
            return (Criteria) this;
        }

        public Criteria andQixuQ8NotBetween(Integer value1, Integer value2) {
            addCriterion("qixu_q8 not between", value1, value2, "qixuQ8");
            return (Criteria) this;
        }

        public Criteria andQixuScoreIsNull() {
            addCriterion("qixu_score is null");
            return (Criteria) this;
        }

        public Criteria andQixuScoreIsNotNull() {
            addCriterion("qixu_score is not null");
            return (Criteria) this;
        }

        public Criteria andQixuScoreEqualTo(String value) {
            addCriterion("qixu_score =", value, "qixuScore");
            return (Criteria) this;
        }

        public Criteria andQixuScoreNotEqualTo(String value) {
            addCriterion("qixu_score <>", value, "qixuScore");
            return (Criteria) this;
        }

        public Criteria andQixuScoreGreaterThan(String value) {
            addCriterion("qixu_score >", value, "qixuScore");
            return (Criteria) this;
        }

        public Criteria andQixuScoreGreaterThanOrEqualTo(String value) {
            addCriterion("qixu_score >=", value, "qixuScore");
            return (Criteria) this;
        }

        public Criteria andQixuScoreLessThan(String value) {
            addCriterion("qixu_score <", value, "qixuScore");
            return (Criteria) this;
        }

        public Criteria andQixuScoreLessThanOrEqualTo(String value) {
            addCriterion("qixu_score <=", value, "qixuScore");
            return (Criteria) this;
        }

        public Criteria andQixuScoreLike(String value) {
            addCriterion("qixu_score like", value, "qixuScore");
            return (Criteria) this;
        }

        public Criteria andQixuScoreNotLike(String value) {
            addCriterion("qixu_score not like", value, "qixuScore");
            return (Criteria) this;
        }

        public Criteria andQixuScoreIn(List<String> values) {
            addCriterion("qixu_score in", values, "qixuScore");
            return (Criteria) this;
        }

        public Criteria andQixuScoreNotIn(List<String> values) {
            addCriterion("qixu_score not in", values, "qixuScore");
            return (Criteria) this;
        }

        public Criteria andQixuScoreBetween(String value1, String value2) {
            addCriterion("qixu_score between", value1, value2, "qixuScore");
            return (Criteria) this;
        }

        public Criteria andQixuScoreNotBetween(String value1, String value2) {
            addCriterion("qixu_score not between", value1, value2, "qixuScore");
            return (Criteria) this;
        }

        public Criteria andQixuResultIsNull() {
            addCriterion("qixu_result is null");
            return (Criteria) this;
        }

        public Criteria andQixuResultIsNotNull() {
            addCriterion("qixu_result is not null");
            return (Criteria) this;
        }

        public Criteria andQixuResultEqualTo(Integer value) {
            addCriterion("qixu_result =", value, "qixuResult");
            return (Criteria) this;
        }

        public Criteria andQixuResultNotEqualTo(Integer value) {
            addCriterion("qixu_result <>", value, "qixuResult");
            return (Criteria) this;
        }

        public Criteria andQixuResultGreaterThan(Integer value) {
            addCriterion("qixu_result >", value, "qixuResult");
            return (Criteria) this;
        }

        public Criteria andQixuResultGreaterThanOrEqualTo(Integer value) {
            addCriterion("qixu_result >=", value, "qixuResult");
            return (Criteria) this;
        }

        public Criteria andQixuResultLessThan(Integer value) {
            addCriterion("qixu_result <", value, "qixuResult");
            return (Criteria) this;
        }

        public Criteria andQixuResultLessThanOrEqualTo(Integer value) {
            addCriterion("qixu_result <=", value, "qixuResult");
            return (Criteria) this;
        }

        public Criteria andQixuResultIn(List<Integer> values) {
            addCriterion("qixu_result in", values, "qixuResult");
            return (Criteria) this;
        }

        public Criteria andQixuResultNotIn(List<Integer> values) {
            addCriterion("qixu_result not in", values, "qixuResult");
            return (Criteria) this;
        }

        public Criteria andQixuResultBetween(Integer value1, Integer value2) {
            addCriterion("qixu_result between", value1, value2, "qixuResult");
            return (Criteria) this;
        }

        public Criteria andQixuResultNotBetween(Integer value1, Integer value2) {
            addCriterion("qixu_result not between", value1, value2, "qixuResult");
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