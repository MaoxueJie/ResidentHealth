package com.breeze.health.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserTCMYinxuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserTCMYinxuExample() {
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

        public Criteria andYinxuQ1IsNull() {
            addCriterion("yinxu_q1 is null");
            return (Criteria) this;
        }

        public Criteria andYinxuQ1IsNotNull() {
            addCriterion("yinxu_q1 is not null");
            return (Criteria) this;
        }

        public Criteria andYinxuQ1EqualTo(Integer value) {
            addCriterion("yinxu_q1 =", value, "yinxuQ1");
            return (Criteria) this;
        }

        public Criteria andYinxuQ1NotEqualTo(Integer value) {
            addCriterion("yinxu_q1 <>", value, "yinxuQ1");
            return (Criteria) this;
        }

        public Criteria andYinxuQ1GreaterThan(Integer value) {
            addCriterion("yinxu_q1 >", value, "yinxuQ1");
            return (Criteria) this;
        }

        public Criteria andYinxuQ1GreaterThanOrEqualTo(Integer value) {
            addCriterion("yinxu_q1 >=", value, "yinxuQ1");
            return (Criteria) this;
        }

        public Criteria andYinxuQ1LessThan(Integer value) {
            addCriterion("yinxu_q1 <", value, "yinxuQ1");
            return (Criteria) this;
        }

        public Criteria andYinxuQ1LessThanOrEqualTo(Integer value) {
            addCriterion("yinxu_q1 <=", value, "yinxuQ1");
            return (Criteria) this;
        }

        public Criteria andYinxuQ1In(List<Integer> values) {
            addCriterion("yinxu_q1 in", values, "yinxuQ1");
            return (Criteria) this;
        }

        public Criteria andYinxuQ1NotIn(List<Integer> values) {
            addCriterion("yinxu_q1 not in", values, "yinxuQ1");
            return (Criteria) this;
        }

        public Criteria andYinxuQ1Between(Integer value1, Integer value2) {
            addCriterion("yinxu_q1 between", value1, value2, "yinxuQ1");
            return (Criteria) this;
        }

        public Criteria andYinxuQ1NotBetween(Integer value1, Integer value2) {
            addCriterion("yinxu_q1 not between", value1, value2, "yinxuQ1");
            return (Criteria) this;
        }

        public Criteria andYinxuQ2IsNull() {
            addCriterion("yinxu_q2 is null");
            return (Criteria) this;
        }

        public Criteria andYinxuQ2IsNotNull() {
            addCriterion("yinxu_q2 is not null");
            return (Criteria) this;
        }

        public Criteria andYinxuQ2EqualTo(Integer value) {
            addCriterion("yinxu_q2 =", value, "yinxuQ2");
            return (Criteria) this;
        }

        public Criteria andYinxuQ2NotEqualTo(Integer value) {
            addCriterion("yinxu_q2 <>", value, "yinxuQ2");
            return (Criteria) this;
        }

        public Criteria andYinxuQ2GreaterThan(Integer value) {
            addCriterion("yinxu_q2 >", value, "yinxuQ2");
            return (Criteria) this;
        }

        public Criteria andYinxuQ2GreaterThanOrEqualTo(Integer value) {
            addCriterion("yinxu_q2 >=", value, "yinxuQ2");
            return (Criteria) this;
        }

        public Criteria andYinxuQ2LessThan(Integer value) {
            addCriterion("yinxu_q2 <", value, "yinxuQ2");
            return (Criteria) this;
        }

        public Criteria andYinxuQ2LessThanOrEqualTo(Integer value) {
            addCriterion("yinxu_q2 <=", value, "yinxuQ2");
            return (Criteria) this;
        }

        public Criteria andYinxuQ2In(List<Integer> values) {
            addCriterion("yinxu_q2 in", values, "yinxuQ2");
            return (Criteria) this;
        }

        public Criteria andYinxuQ2NotIn(List<Integer> values) {
            addCriterion("yinxu_q2 not in", values, "yinxuQ2");
            return (Criteria) this;
        }

        public Criteria andYinxuQ2Between(Integer value1, Integer value2) {
            addCriterion("yinxu_q2 between", value1, value2, "yinxuQ2");
            return (Criteria) this;
        }

        public Criteria andYinxuQ2NotBetween(Integer value1, Integer value2) {
            addCriterion("yinxu_q2 not between", value1, value2, "yinxuQ2");
            return (Criteria) this;
        }

        public Criteria andYinxuQ3IsNull() {
            addCriterion("yinxu_q3 is null");
            return (Criteria) this;
        }

        public Criteria andYinxuQ3IsNotNull() {
            addCriterion("yinxu_q3 is not null");
            return (Criteria) this;
        }

        public Criteria andYinxuQ3EqualTo(Integer value) {
            addCriterion("yinxu_q3 =", value, "yinxuQ3");
            return (Criteria) this;
        }

        public Criteria andYinxuQ3NotEqualTo(Integer value) {
            addCriterion("yinxu_q3 <>", value, "yinxuQ3");
            return (Criteria) this;
        }

        public Criteria andYinxuQ3GreaterThan(Integer value) {
            addCriterion("yinxu_q3 >", value, "yinxuQ3");
            return (Criteria) this;
        }

        public Criteria andYinxuQ3GreaterThanOrEqualTo(Integer value) {
            addCriterion("yinxu_q3 >=", value, "yinxuQ3");
            return (Criteria) this;
        }

        public Criteria andYinxuQ3LessThan(Integer value) {
            addCriterion("yinxu_q3 <", value, "yinxuQ3");
            return (Criteria) this;
        }

        public Criteria andYinxuQ3LessThanOrEqualTo(Integer value) {
            addCriterion("yinxu_q3 <=", value, "yinxuQ3");
            return (Criteria) this;
        }

        public Criteria andYinxuQ3In(List<Integer> values) {
            addCriterion("yinxu_q3 in", values, "yinxuQ3");
            return (Criteria) this;
        }

        public Criteria andYinxuQ3NotIn(List<Integer> values) {
            addCriterion("yinxu_q3 not in", values, "yinxuQ3");
            return (Criteria) this;
        }

        public Criteria andYinxuQ3Between(Integer value1, Integer value2) {
            addCriterion("yinxu_q3 between", value1, value2, "yinxuQ3");
            return (Criteria) this;
        }

        public Criteria andYinxuQ3NotBetween(Integer value1, Integer value2) {
            addCriterion("yinxu_q3 not between", value1, value2, "yinxuQ3");
            return (Criteria) this;
        }

        public Criteria andYinxuQ4IsNull() {
            addCriterion("yinxu_q4 is null");
            return (Criteria) this;
        }

        public Criteria andYinxuQ4IsNotNull() {
            addCriterion("yinxu_q4 is not null");
            return (Criteria) this;
        }

        public Criteria andYinxuQ4EqualTo(Integer value) {
            addCriterion("yinxu_q4 =", value, "yinxuQ4");
            return (Criteria) this;
        }

        public Criteria andYinxuQ4NotEqualTo(Integer value) {
            addCriterion("yinxu_q4 <>", value, "yinxuQ4");
            return (Criteria) this;
        }

        public Criteria andYinxuQ4GreaterThan(Integer value) {
            addCriterion("yinxu_q4 >", value, "yinxuQ4");
            return (Criteria) this;
        }

        public Criteria andYinxuQ4GreaterThanOrEqualTo(Integer value) {
            addCriterion("yinxu_q4 >=", value, "yinxuQ4");
            return (Criteria) this;
        }

        public Criteria andYinxuQ4LessThan(Integer value) {
            addCriterion("yinxu_q4 <", value, "yinxuQ4");
            return (Criteria) this;
        }

        public Criteria andYinxuQ4LessThanOrEqualTo(Integer value) {
            addCriterion("yinxu_q4 <=", value, "yinxuQ4");
            return (Criteria) this;
        }

        public Criteria andYinxuQ4In(List<Integer> values) {
            addCriterion("yinxu_q4 in", values, "yinxuQ4");
            return (Criteria) this;
        }

        public Criteria andYinxuQ4NotIn(List<Integer> values) {
            addCriterion("yinxu_q4 not in", values, "yinxuQ4");
            return (Criteria) this;
        }

        public Criteria andYinxuQ4Between(Integer value1, Integer value2) {
            addCriterion("yinxu_q4 between", value1, value2, "yinxuQ4");
            return (Criteria) this;
        }

        public Criteria andYinxuQ4NotBetween(Integer value1, Integer value2) {
            addCriterion("yinxu_q4 not between", value1, value2, "yinxuQ4");
            return (Criteria) this;
        }

        public Criteria andYinxuQ5IsNull() {
            addCriterion("yinxu_q5 is null");
            return (Criteria) this;
        }

        public Criteria andYinxuQ5IsNotNull() {
            addCriterion("yinxu_q5 is not null");
            return (Criteria) this;
        }

        public Criteria andYinxuQ5EqualTo(Integer value) {
            addCriterion("yinxu_q5 =", value, "yinxuQ5");
            return (Criteria) this;
        }

        public Criteria andYinxuQ5NotEqualTo(Integer value) {
            addCriterion("yinxu_q5 <>", value, "yinxuQ5");
            return (Criteria) this;
        }

        public Criteria andYinxuQ5GreaterThan(Integer value) {
            addCriterion("yinxu_q5 >", value, "yinxuQ5");
            return (Criteria) this;
        }

        public Criteria andYinxuQ5GreaterThanOrEqualTo(Integer value) {
            addCriterion("yinxu_q5 >=", value, "yinxuQ5");
            return (Criteria) this;
        }

        public Criteria andYinxuQ5LessThan(Integer value) {
            addCriterion("yinxu_q5 <", value, "yinxuQ5");
            return (Criteria) this;
        }

        public Criteria andYinxuQ5LessThanOrEqualTo(Integer value) {
            addCriterion("yinxu_q5 <=", value, "yinxuQ5");
            return (Criteria) this;
        }

        public Criteria andYinxuQ5In(List<Integer> values) {
            addCriterion("yinxu_q5 in", values, "yinxuQ5");
            return (Criteria) this;
        }

        public Criteria andYinxuQ5NotIn(List<Integer> values) {
            addCriterion("yinxu_q5 not in", values, "yinxuQ5");
            return (Criteria) this;
        }

        public Criteria andYinxuQ5Between(Integer value1, Integer value2) {
            addCriterion("yinxu_q5 between", value1, value2, "yinxuQ5");
            return (Criteria) this;
        }

        public Criteria andYinxuQ5NotBetween(Integer value1, Integer value2) {
            addCriterion("yinxu_q5 not between", value1, value2, "yinxuQ5");
            return (Criteria) this;
        }

        public Criteria andYinxuQ6IsNull() {
            addCriterion("yinxu_q6 is null");
            return (Criteria) this;
        }

        public Criteria andYinxuQ6IsNotNull() {
            addCriterion("yinxu_q6 is not null");
            return (Criteria) this;
        }

        public Criteria andYinxuQ6EqualTo(Integer value) {
            addCriterion("yinxu_q6 =", value, "yinxuQ6");
            return (Criteria) this;
        }

        public Criteria andYinxuQ6NotEqualTo(Integer value) {
            addCriterion("yinxu_q6 <>", value, "yinxuQ6");
            return (Criteria) this;
        }

        public Criteria andYinxuQ6GreaterThan(Integer value) {
            addCriterion("yinxu_q6 >", value, "yinxuQ6");
            return (Criteria) this;
        }

        public Criteria andYinxuQ6GreaterThanOrEqualTo(Integer value) {
            addCriterion("yinxu_q6 >=", value, "yinxuQ6");
            return (Criteria) this;
        }

        public Criteria andYinxuQ6LessThan(Integer value) {
            addCriterion("yinxu_q6 <", value, "yinxuQ6");
            return (Criteria) this;
        }

        public Criteria andYinxuQ6LessThanOrEqualTo(Integer value) {
            addCriterion("yinxu_q6 <=", value, "yinxuQ6");
            return (Criteria) this;
        }

        public Criteria andYinxuQ6In(List<Integer> values) {
            addCriterion("yinxu_q6 in", values, "yinxuQ6");
            return (Criteria) this;
        }

        public Criteria andYinxuQ6NotIn(List<Integer> values) {
            addCriterion("yinxu_q6 not in", values, "yinxuQ6");
            return (Criteria) this;
        }

        public Criteria andYinxuQ6Between(Integer value1, Integer value2) {
            addCriterion("yinxu_q6 between", value1, value2, "yinxuQ6");
            return (Criteria) this;
        }

        public Criteria andYinxuQ6NotBetween(Integer value1, Integer value2) {
            addCriterion("yinxu_q6 not between", value1, value2, "yinxuQ6");
            return (Criteria) this;
        }

        public Criteria andYinxuQ7IsNull() {
            addCriterion("yinxu_q7 is null");
            return (Criteria) this;
        }

        public Criteria andYinxuQ7IsNotNull() {
            addCriterion("yinxu_q7 is not null");
            return (Criteria) this;
        }

        public Criteria andYinxuQ7EqualTo(Integer value) {
            addCriterion("yinxu_q7 =", value, "yinxuQ7");
            return (Criteria) this;
        }

        public Criteria andYinxuQ7NotEqualTo(Integer value) {
            addCriterion("yinxu_q7 <>", value, "yinxuQ7");
            return (Criteria) this;
        }

        public Criteria andYinxuQ7GreaterThan(Integer value) {
            addCriterion("yinxu_q7 >", value, "yinxuQ7");
            return (Criteria) this;
        }

        public Criteria andYinxuQ7GreaterThanOrEqualTo(Integer value) {
            addCriterion("yinxu_q7 >=", value, "yinxuQ7");
            return (Criteria) this;
        }

        public Criteria andYinxuQ7LessThan(Integer value) {
            addCriterion("yinxu_q7 <", value, "yinxuQ7");
            return (Criteria) this;
        }

        public Criteria andYinxuQ7LessThanOrEqualTo(Integer value) {
            addCriterion("yinxu_q7 <=", value, "yinxuQ7");
            return (Criteria) this;
        }

        public Criteria andYinxuQ7In(List<Integer> values) {
            addCriterion("yinxu_q7 in", values, "yinxuQ7");
            return (Criteria) this;
        }

        public Criteria andYinxuQ7NotIn(List<Integer> values) {
            addCriterion("yinxu_q7 not in", values, "yinxuQ7");
            return (Criteria) this;
        }

        public Criteria andYinxuQ7Between(Integer value1, Integer value2) {
            addCriterion("yinxu_q7 between", value1, value2, "yinxuQ7");
            return (Criteria) this;
        }

        public Criteria andYinxuQ7NotBetween(Integer value1, Integer value2) {
            addCriterion("yinxu_q7 not between", value1, value2, "yinxuQ7");
            return (Criteria) this;
        }

        public Criteria andYinxuQ8IsNull() {
            addCriterion("yinxu_q8 is null");
            return (Criteria) this;
        }

        public Criteria andYinxuQ8IsNotNull() {
            addCriterion("yinxu_q8 is not null");
            return (Criteria) this;
        }

        public Criteria andYinxuQ8EqualTo(Integer value) {
            addCriterion("yinxu_q8 =", value, "yinxuQ8");
            return (Criteria) this;
        }

        public Criteria andYinxuQ8NotEqualTo(Integer value) {
            addCriterion("yinxu_q8 <>", value, "yinxuQ8");
            return (Criteria) this;
        }

        public Criteria andYinxuQ8GreaterThan(Integer value) {
            addCriterion("yinxu_q8 >", value, "yinxuQ8");
            return (Criteria) this;
        }

        public Criteria andYinxuQ8GreaterThanOrEqualTo(Integer value) {
            addCriterion("yinxu_q8 >=", value, "yinxuQ8");
            return (Criteria) this;
        }

        public Criteria andYinxuQ8LessThan(Integer value) {
            addCriterion("yinxu_q8 <", value, "yinxuQ8");
            return (Criteria) this;
        }

        public Criteria andYinxuQ8LessThanOrEqualTo(Integer value) {
            addCriterion("yinxu_q8 <=", value, "yinxuQ8");
            return (Criteria) this;
        }

        public Criteria andYinxuQ8In(List<Integer> values) {
            addCriterion("yinxu_q8 in", values, "yinxuQ8");
            return (Criteria) this;
        }

        public Criteria andYinxuQ8NotIn(List<Integer> values) {
            addCriterion("yinxu_q8 not in", values, "yinxuQ8");
            return (Criteria) this;
        }

        public Criteria andYinxuQ8Between(Integer value1, Integer value2) {
            addCriterion("yinxu_q8 between", value1, value2, "yinxuQ8");
            return (Criteria) this;
        }

        public Criteria andYinxuQ8NotBetween(Integer value1, Integer value2) {
            addCriterion("yinxu_q8 not between", value1, value2, "yinxuQ8");
            return (Criteria) this;
        }

        public Criteria andYinxuScoreIsNull() {
            addCriterion("yinxu_score is null");
            return (Criteria) this;
        }

        public Criteria andYinxuScoreIsNotNull() {
            addCriterion("yinxu_score is not null");
            return (Criteria) this;
        }

        public Criteria andYinxuScoreEqualTo(Integer value) {
            addCriterion("yinxu_score =", value, "yinxuScore");
            return (Criteria) this;
        }

        public Criteria andYinxuScoreNotEqualTo(Integer value) {
            addCriterion("yinxu_score <>", value, "yinxuScore");
            return (Criteria) this;
        }

        public Criteria andYinxuScoreGreaterThan(Integer value) {
            addCriterion("yinxu_score >", value, "yinxuScore");
            return (Criteria) this;
        }

        public Criteria andYinxuScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("yinxu_score >=", value, "yinxuScore");
            return (Criteria) this;
        }

        public Criteria andYinxuScoreLessThan(Integer value) {
            addCriterion("yinxu_score <", value, "yinxuScore");
            return (Criteria) this;
        }

        public Criteria andYinxuScoreLessThanOrEqualTo(Integer value) {
            addCriterion("yinxu_score <=", value, "yinxuScore");
            return (Criteria) this;
        }

        public Criteria andYinxuScoreIn(List<Integer> values) {
            addCriterion("yinxu_score in", values, "yinxuScore");
            return (Criteria) this;
        }

        public Criteria andYinxuScoreNotIn(List<Integer> values) {
            addCriterion("yinxu_score not in", values, "yinxuScore");
            return (Criteria) this;
        }

        public Criteria andYinxuScoreBetween(Integer value1, Integer value2) {
            addCriterion("yinxu_score between", value1, value2, "yinxuScore");
            return (Criteria) this;
        }

        public Criteria andYinxuScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("yinxu_score not between", value1, value2, "yinxuScore");
            return (Criteria) this;
        }

        public Criteria andYinxuResultIsNull() {
            addCriterion("yinxu_result is null");
            return (Criteria) this;
        }

        public Criteria andYinxuResultIsNotNull() {
            addCriterion("yinxu_result is not null");
            return (Criteria) this;
        }

        public Criteria andYinxuResultEqualTo(String value) {
            addCriterion("yinxu_result =", value, "yinxuResult");
            return (Criteria) this;
        }

        public Criteria andYinxuResultNotEqualTo(String value) {
            addCriterion("yinxu_result <>", value, "yinxuResult");
            return (Criteria) this;
        }

        public Criteria andYinxuResultGreaterThan(String value) {
            addCriterion("yinxu_result >", value, "yinxuResult");
            return (Criteria) this;
        }

        public Criteria andYinxuResultGreaterThanOrEqualTo(String value) {
            addCriterion("yinxu_result >=", value, "yinxuResult");
            return (Criteria) this;
        }

        public Criteria andYinxuResultLessThan(String value) {
            addCriterion("yinxu_result <", value, "yinxuResult");
            return (Criteria) this;
        }

        public Criteria andYinxuResultLessThanOrEqualTo(String value) {
            addCriterion("yinxu_result <=", value, "yinxuResult");
            return (Criteria) this;
        }

        public Criteria andYinxuResultLike(String value) {
            addCriterion("yinxu_result like", value, "yinxuResult");
            return (Criteria) this;
        }

        public Criteria andYinxuResultNotLike(String value) {
            addCriterion("yinxu_result not like", value, "yinxuResult");
            return (Criteria) this;
        }

        public Criteria andYinxuResultIn(List<String> values) {
            addCriterion("yinxu_result in", values, "yinxuResult");
            return (Criteria) this;
        }

        public Criteria andYinxuResultNotIn(List<String> values) {
            addCriterion("yinxu_result not in", values, "yinxuResult");
            return (Criteria) this;
        }

        public Criteria andYinxuResultBetween(String value1, String value2) {
            addCriterion("yinxu_result between", value1, value2, "yinxuResult");
            return (Criteria) this;
        }

        public Criteria andYinxuResultNotBetween(String value1, String value2) {
            addCriterion("yinxu_result not between", value1, value2, "yinxuResult");
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