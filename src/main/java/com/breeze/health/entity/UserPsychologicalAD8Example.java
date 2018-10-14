package com.breeze.health.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserPsychologicalAD8Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserPsychologicalAD8Example() {
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

        public Criteria andPsyIdIsNull() {
            addCriterion("psy_id is null");
            return (Criteria) this;
        }

        public Criteria andPsyIdIsNotNull() {
            addCriterion("psy_id is not null");
            return (Criteria) this;
        }

        public Criteria andPsyIdEqualTo(Long value) {
            addCriterion("psy_id =", value, "psyId");
            return (Criteria) this;
        }

        public Criteria andPsyIdNotEqualTo(Long value) {
            addCriterion("psy_id <>", value, "psyId");
            return (Criteria) this;
        }

        public Criteria andPsyIdGreaterThan(Long value) {
            addCriterion("psy_id >", value, "psyId");
            return (Criteria) this;
        }

        public Criteria andPsyIdGreaterThanOrEqualTo(Long value) {
            addCriterion("psy_id >=", value, "psyId");
            return (Criteria) this;
        }

        public Criteria andPsyIdLessThan(Long value) {
            addCriterion("psy_id <", value, "psyId");
            return (Criteria) this;
        }

        public Criteria andPsyIdLessThanOrEqualTo(Long value) {
            addCriterion("psy_id <=", value, "psyId");
            return (Criteria) this;
        }

        public Criteria andPsyIdIn(List<Long> values) {
            addCriterion("psy_id in", values, "psyId");
            return (Criteria) this;
        }

        public Criteria andPsyIdNotIn(List<Long> values) {
            addCriterion("psy_id not in", values, "psyId");
            return (Criteria) this;
        }

        public Criteria andPsyIdBetween(Long value1, Long value2) {
            addCriterion("psy_id between", value1, value2, "psyId");
            return (Criteria) this;
        }

        public Criteria andPsyIdNotBetween(Long value1, Long value2) {
            addCriterion("psy_id not between", value1, value2, "psyId");
            return (Criteria) this;
        }

        public Criteria andAd8Q1IsNull() {
            addCriterion("ad8_q1 is null");
            return (Criteria) this;
        }

        public Criteria andAd8Q1IsNotNull() {
            addCriterion("ad8_q1 is not null");
            return (Criteria) this;
        }

        public Criteria andAd8Q1EqualTo(Integer value) {
            addCriterion("ad8_q1 =", value, "ad8Q1");
            return (Criteria) this;
        }

        public Criteria andAd8Q1NotEqualTo(Integer value) {
            addCriterion("ad8_q1 <>", value, "ad8Q1");
            return (Criteria) this;
        }

        public Criteria andAd8Q1GreaterThan(Integer value) {
            addCriterion("ad8_q1 >", value, "ad8Q1");
            return (Criteria) this;
        }

        public Criteria andAd8Q1GreaterThanOrEqualTo(Integer value) {
            addCriterion("ad8_q1 >=", value, "ad8Q1");
            return (Criteria) this;
        }

        public Criteria andAd8Q1LessThan(Integer value) {
            addCriterion("ad8_q1 <", value, "ad8Q1");
            return (Criteria) this;
        }

        public Criteria andAd8Q1LessThanOrEqualTo(Integer value) {
            addCriterion("ad8_q1 <=", value, "ad8Q1");
            return (Criteria) this;
        }

        public Criteria andAd8Q1In(List<Integer> values) {
            addCriterion("ad8_q1 in", values, "ad8Q1");
            return (Criteria) this;
        }

        public Criteria andAd8Q1NotIn(List<Integer> values) {
            addCriterion("ad8_q1 not in", values, "ad8Q1");
            return (Criteria) this;
        }

        public Criteria andAd8Q1Between(Integer value1, Integer value2) {
            addCriterion("ad8_q1 between", value1, value2, "ad8Q1");
            return (Criteria) this;
        }

        public Criteria andAd8Q1NotBetween(Integer value1, Integer value2) {
            addCriterion("ad8_q1 not between", value1, value2, "ad8Q1");
            return (Criteria) this;
        }

        public Criteria andAd8Q2IsNull() {
            addCriterion("ad8_q2 is null");
            return (Criteria) this;
        }

        public Criteria andAd8Q2IsNotNull() {
            addCriterion("ad8_q2 is not null");
            return (Criteria) this;
        }

        public Criteria andAd8Q2EqualTo(Integer value) {
            addCriterion("ad8_q2 =", value, "ad8Q2");
            return (Criteria) this;
        }

        public Criteria andAd8Q2NotEqualTo(Integer value) {
            addCriterion("ad8_q2 <>", value, "ad8Q2");
            return (Criteria) this;
        }

        public Criteria andAd8Q2GreaterThan(Integer value) {
            addCriterion("ad8_q2 >", value, "ad8Q2");
            return (Criteria) this;
        }

        public Criteria andAd8Q2GreaterThanOrEqualTo(Integer value) {
            addCriterion("ad8_q2 >=", value, "ad8Q2");
            return (Criteria) this;
        }

        public Criteria andAd8Q2LessThan(Integer value) {
            addCriterion("ad8_q2 <", value, "ad8Q2");
            return (Criteria) this;
        }

        public Criteria andAd8Q2LessThanOrEqualTo(Integer value) {
            addCriterion("ad8_q2 <=", value, "ad8Q2");
            return (Criteria) this;
        }

        public Criteria andAd8Q2In(List<Integer> values) {
            addCriterion("ad8_q2 in", values, "ad8Q2");
            return (Criteria) this;
        }

        public Criteria andAd8Q2NotIn(List<Integer> values) {
            addCriterion("ad8_q2 not in", values, "ad8Q2");
            return (Criteria) this;
        }

        public Criteria andAd8Q2Between(Integer value1, Integer value2) {
            addCriterion("ad8_q2 between", value1, value2, "ad8Q2");
            return (Criteria) this;
        }

        public Criteria andAd8Q2NotBetween(Integer value1, Integer value2) {
            addCriterion("ad8_q2 not between", value1, value2, "ad8Q2");
            return (Criteria) this;
        }

        public Criteria andAd8Q3IsNull() {
            addCriterion("ad8_q3 is null");
            return (Criteria) this;
        }

        public Criteria andAd8Q3IsNotNull() {
            addCriterion("ad8_q3 is not null");
            return (Criteria) this;
        }

        public Criteria andAd8Q3EqualTo(Integer value) {
            addCriterion("ad8_q3 =", value, "ad8Q3");
            return (Criteria) this;
        }

        public Criteria andAd8Q3NotEqualTo(Integer value) {
            addCriterion("ad8_q3 <>", value, "ad8Q3");
            return (Criteria) this;
        }

        public Criteria andAd8Q3GreaterThan(Integer value) {
            addCriterion("ad8_q3 >", value, "ad8Q3");
            return (Criteria) this;
        }

        public Criteria andAd8Q3GreaterThanOrEqualTo(Integer value) {
            addCriterion("ad8_q3 >=", value, "ad8Q3");
            return (Criteria) this;
        }

        public Criteria andAd8Q3LessThan(Integer value) {
            addCriterion("ad8_q3 <", value, "ad8Q3");
            return (Criteria) this;
        }

        public Criteria andAd8Q3LessThanOrEqualTo(Integer value) {
            addCriterion("ad8_q3 <=", value, "ad8Q3");
            return (Criteria) this;
        }

        public Criteria andAd8Q3In(List<Integer> values) {
            addCriterion("ad8_q3 in", values, "ad8Q3");
            return (Criteria) this;
        }

        public Criteria andAd8Q3NotIn(List<Integer> values) {
            addCriterion("ad8_q3 not in", values, "ad8Q3");
            return (Criteria) this;
        }

        public Criteria andAd8Q3Between(Integer value1, Integer value2) {
            addCriterion("ad8_q3 between", value1, value2, "ad8Q3");
            return (Criteria) this;
        }

        public Criteria andAd8Q3NotBetween(Integer value1, Integer value2) {
            addCriterion("ad8_q3 not between", value1, value2, "ad8Q3");
            return (Criteria) this;
        }

        public Criteria andAd8Q4IsNull() {
            addCriterion("ad8_q4 is null");
            return (Criteria) this;
        }

        public Criteria andAd8Q4IsNotNull() {
            addCriterion("ad8_q4 is not null");
            return (Criteria) this;
        }

        public Criteria andAd8Q4EqualTo(Integer value) {
            addCriterion("ad8_q4 =", value, "ad8Q4");
            return (Criteria) this;
        }

        public Criteria andAd8Q4NotEqualTo(Integer value) {
            addCriterion("ad8_q4 <>", value, "ad8Q4");
            return (Criteria) this;
        }

        public Criteria andAd8Q4GreaterThan(Integer value) {
            addCriterion("ad8_q4 >", value, "ad8Q4");
            return (Criteria) this;
        }

        public Criteria andAd8Q4GreaterThanOrEqualTo(Integer value) {
            addCriterion("ad8_q4 >=", value, "ad8Q4");
            return (Criteria) this;
        }

        public Criteria andAd8Q4LessThan(Integer value) {
            addCriterion("ad8_q4 <", value, "ad8Q4");
            return (Criteria) this;
        }

        public Criteria andAd8Q4LessThanOrEqualTo(Integer value) {
            addCriterion("ad8_q4 <=", value, "ad8Q4");
            return (Criteria) this;
        }

        public Criteria andAd8Q4In(List<Integer> values) {
            addCriterion("ad8_q4 in", values, "ad8Q4");
            return (Criteria) this;
        }

        public Criteria andAd8Q4NotIn(List<Integer> values) {
            addCriterion("ad8_q4 not in", values, "ad8Q4");
            return (Criteria) this;
        }

        public Criteria andAd8Q4Between(Integer value1, Integer value2) {
            addCriterion("ad8_q4 between", value1, value2, "ad8Q4");
            return (Criteria) this;
        }

        public Criteria andAd8Q4NotBetween(Integer value1, Integer value2) {
            addCriterion("ad8_q4 not between", value1, value2, "ad8Q4");
            return (Criteria) this;
        }

        public Criteria andAd8Q5IsNull() {
            addCriterion("ad8_q5 is null");
            return (Criteria) this;
        }

        public Criteria andAd8Q5IsNotNull() {
            addCriterion("ad8_q5 is not null");
            return (Criteria) this;
        }

        public Criteria andAd8Q5EqualTo(Integer value) {
            addCriterion("ad8_q5 =", value, "ad8Q5");
            return (Criteria) this;
        }

        public Criteria andAd8Q5NotEqualTo(Integer value) {
            addCriterion("ad8_q5 <>", value, "ad8Q5");
            return (Criteria) this;
        }

        public Criteria andAd8Q5GreaterThan(Integer value) {
            addCriterion("ad8_q5 >", value, "ad8Q5");
            return (Criteria) this;
        }

        public Criteria andAd8Q5GreaterThanOrEqualTo(Integer value) {
            addCriterion("ad8_q5 >=", value, "ad8Q5");
            return (Criteria) this;
        }

        public Criteria andAd8Q5LessThan(Integer value) {
            addCriterion("ad8_q5 <", value, "ad8Q5");
            return (Criteria) this;
        }

        public Criteria andAd8Q5LessThanOrEqualTo(Integer value) {
            addCriterion("ad8_q5 <=", value, "ad8Q5");
            return (Criteria) this;
        }

        public Criteria andAd8Q5In(List<Integer> values) {
            addCriterion("ad8_q5 in", values, "ad8Q5");
            return (Criteria) this;
        }

        public Criteria andAd8Q5NotIn(List<Integer> values) {
            addCriterion("ad8_q5 not in", values, "ad8Q5");
            return (Criteria) this;
        }

        public Criteria andAd8Q5Between(Integer value1, Integer value2) {
            addCriterion("ad8_q5 between", value1, value2, "ad8Q5");
            return (Criteria) this;
        }

        public Criteria andAd8Q5NotBetween(Integer value1, Integer value2) {
            addCriterion("ad8_q5 not between", value1, value2, "ad8Q5");
            return (Criteria) this;
        }

        public Criteria andAd8Q6IsNull() {
            addCriterion("ad8_q6 is null");
            return (Criteria) this;
        }

        public Criteria andAd8Q6IsNotNull() {
            addCriterion("ad8_q6 is not null");
            return (Criteria) this;
        }

        public Criteria andAd8Q6EqualTo(Integer value) {
            addCriterion("ad8_q6 =", value, "ad8Q6");
            return (Criteria) this;
        }

        public Criteria andAd8Q6NotEqualTo(Integer value) {
            addCriterion("ad8_q6 <>", value, "ad8Q6");
            return (Criteria) this;
        }

        public Criteria andAd8Q6GreaterThan(Integer value) {
            addCriterion("ad8_q6 >", value, "ad8Q6");
            return (Criteria) this;
        }

        public Criteria andAd8Q6GreaterThanOrEqualTo(Integer value) {
            addCriterion("ad8_q6 >=", value, "ad8Q6");
            return (Criteria) this;
        }

        public Criteria andAd8Q6LessThan(Integer value) {
            addCriterion("ad8_q6 <", value, "ad8Q6");
            return (Criteria) this;
        }

        public Criteria andAd8Q6LessThanOrEqualTo(Integer value) {
            addCriterion("ad8_q6 <=", value, "ad8Q6");
            return (Criteria) this;
        }

        public Criteria andAd8Q6In(List<Integer> values) {
            addCriterion("ad8_q6 in", values, "ad8Q6");
            return (Criteria) this;
        }

        public Criteria andAd8Q6NotIn(List<Integer> values) {
            addCriterion("ad8_q6 not in", values, "ad8Q6");
            return (Criteria) this;
        }

        public Criteria andAd8Q6Between(Integer value1, Integer value2) {
            addCriterion("ad8_q6 between", value1, value2, "ad8Q6");
            return (Criteria) this;
        }

        public Criteria andAd8Q6NotBetween(Integer value1, Integer value2) {
            addCriterion("ad8_q6 not between", value1, value2, "ad8Q6");
            return (Criteria) this;
        }

        public Criteria andAd8Q7IsNull() {
            addCriterion("ad8_q7 is null");
            return (Criteria) this;
        }

        public Criteria andAd8Q7IsNotNull() {
            addCriterion("ad8_q7 is not null");
            return (Criteria) this;
        }

        public Criteria andAd8Q7EqualTo(Integer value) {
            addCriterion("ad8_q7 =", value, "ad8Q7");
            return (Criteria) this;
        }

        public Criteria andAd8Q7NotEqualTo(Integer value) {
            addCriterion("ad8_q7 <>", value, "ad8Q7");
            return (Criteria) this;
        }

        public Criteria andAd8Q7GreaterThan(Integer value) {
            addCriterion("ad8_q7 >", value, "ad8Q7");
            return (Criteria) this;
        }

        public Criteria andAd8Q7GreaterThanOrEqualTo(Integer value) {
            addCriterion("ad8_q7 >=", value, "ad8Q7");
            return (Criteria) this;
        }

        public Criteria andAd8Q7LessThan(Integer value) {
            addCriterion("ad8_q7 <", value, "ad8Q7");
            return (Criteria) this;
        }

        public Criteria andAd8Q7LessThanOrEqualTo(Integer value) {
            addCriterion("ad8_q7 <=", value, "ad8Q7");
            return (Criteria) this;
        }

        public Criteria andAd8Q7In(List<Integer> values) {
            addCriterion("ad8_q7 in", values, "ad8Q7");
            return (Criteria) this;
        }

        public Criteria andAd8Q7NotIn(List<Integer> values) {
            addCriterion("ad8_q7 not in", values, "ad8Q7");
            return (Criteria) this;
        }

        public Criteria andAd8Q7Between(Integer value1, Integer value2) {
            addCriterion("ad8_q7 between", value1, value2, "ad8Q7");
            return (Criteria) this;
        }

        public Criteria andAd8Q7NotBetween(Integer value1, Integer value2) {
            addCriterion("ad8_q7 not between", value1, value2, "ad8Q7");
            return (Criteria) this;
        }

        public Criteria andAd8Q8IsNull() {
            addCriterion("ad8_q8 is null");
            return (Criteria) this;
        }

        public Criteria andAd8Q8IsNotNull() {
            addCriterion("ad8_q8 is not null");
            return (Criteria) this;
        }

        public Criteria andAd8Q8EqualTo(Integer value) {
            addCriterion("ad8_q8 =", value, "ad8Q8");
            return (Criteria) this;
        }

        public Criteria andAd8Q8NotEqualTo(Integer value) {
            addCriterion("ad8_q8 <>", value, "ad8Q8");
            return (Criteria) this;
        }

        public Criteria andAd8Q8GreaterThan(Integer value) {
            addCriterion("ad8_q8 >", value, "ad8Q8");
            return (Criteria) this;
        }

        public Criteria andAd8Q8GreaterThanOrEqualTo(Integer value) {
            addCriterion("ad8_q8 >=", value, "ad8Q8");
            return (Criteria) this;
        }

        public Criteria andAd8Q8LessThan(Integer value) {
            addCriterion("ad8_q8 <", value, "ad8Q8");
            return (Criteria) this;
        }

        public Criteria andAd8Q8LessThanOrEqualTo(Integer value) {
            addCriterion("ad8_q8 <=", value, "ad8Q8");
            return (Criteria) this;
        }

        public Criteria andAd8Q8In(List<Integer> values) {
            addCriterion("ad8_q8 in", values, "ad8Q8");
            return (Criteria) this;
        }

        public Criteria andAd8Q8NotIn(List<Integer> values) {
            addCriterion("ad8_q8 not in", values, "ad8Q8");
            return (Criteria) this;
        }

        public Criteria andAd8Q8Between(Integer value1, Integer value2) {
            addCriterion("ad8_q8 between", value1, value2, "ad8Q8");
            return (Criteria) this;
        }

        public Criteria andAd8Q8NotBetween(Integer value1, Integer value2) {
            addCriterion("ad8_q8 not between", value1, value2, "ad8Q8");
            return (Criteria) this;
        }

        public Criteria andAd8ScoreIsNull() {
            addCriterion("ad8_score is null");
            return (Criteria) this;
        }

        public Criteria andAd8ScoreIsNotNull() {
            addCriterion("ad8_score is not null");
            return (Criteria) this;
        }

        public Criteria andAd8ScoreEqualTo(Integer value) {
            addCriterion("ad8_score =", value, "ad8Score");
            return (Criteria) this;
        }

        public Criteria andAd8ScoreNotEqualTo(Integer value) {
            addCriterion("ad8_score <>", value, "ad8Score");
            return (Criteria) this;
        }

        public Criteria andAd8ScoreGreaterThan(Integer value) {
            addCriterion("ad8_score >", value, "ad8Score");
            return (Criteria) this;
        }

        public Criteria andAd8ScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("ad8_score >=", value, "ad8Score");
            return (Criteria) this;
        }

        public Criteria andAd8ScoreLessThan(Integer value) {
            addCriterion("ad8_score <", value, "ad8Score");
            return (Criteria) this;
        }

        public Criteria andAd8ScoreLessThanOrEqualTo(Integer value) {
            addCriterion("ad8_score <=", value, "ad8Score");
            return (Criteria) this;
        }

        public Criteria andAd8ScoreIn(List<Integer> values) {
            addCriterion("ad8_score in", values, "ad8Score");
            return (Criteria) this;
        }

        public Criteria andAd8ScoreNotIn(List<Integer> values) {
            addCriterion("ad8_score not in", values, "ad8Score");
            return (Criteria) this;
        }

        public Criteria andAd8ScoreBetween(Integer value1, Integer value2) {
            addCriterion("ad8_score between", value1, value2, "ad8Score");
            return (Criteria) this;
        }

        public Criteria andAd8ScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("ad8_score not between", value1, value2, "ad8Score");
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