package com.breeze.health.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserPsychologicalGAD7Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserPsychologicalGAD7Example() {
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

        public Criteria andGad7Q1IsNull() {
            addCriterion("gad7_q1 is null");
            return (Criteria) this;
        }

        public Criteria andGad7Q1IsNotNull() {
            addCriterion("gad7_q1 is not null");
            return (Criteria) this;
        }

        public Criteria andGad7Q1EqualTo(Integer value) {
            addCriterion("gad7_q1 =", value, "gad7Q1");
            return (Criteria) this;
        }

        public Criteria andGad7Q1NotEqualTo(Integer value) {
            addCriterion("gad7_q1 <>", value, "gad7Q1");
            return (Criteria) this;
        }

        public Criteria andGad7Q1GreaterThan(Integer value) {
            addCriterion("gad7_q1 >", value, "gad7Q1");
            return (Criteria) this;
        }

        public Criteria andGad7Q1GreaterThanOrEqualTo(Integer value) {
            addCriterion("gad7_q1 >=", value, "gad7Q1");
            return (Criteria) this;
        }

        public Criteria andGad7Q1LessThan(Integer value) {
            addCriterion("gad7_q1 <", value, "gad7Q1");
            return (Criteria) this;
        }

        public Criteria andGad7Q1LessThanOrEqualTo(Integer value) {
            addCriterion("gad7_q1 <=", value, "gad7Q1");
            return (Criteria) this;
        }

        public Criteria andGad7Q1In(List<Integer> values) {
            addCriterion("gad7_q1 in", values, "gad7Q1");
            return (Criteria) this;
        }

        public Criteria andGad7Q1NotIn(List<Integer> values) {
            addCriterion("gad7_q1 not in", values, "gad7Q1");
            return (Criteria) this;
        }

        public Criteria andGad7Q1Between(Integer value1, Integer value2) {
            addCriterion("gad7_q1 between", value1, value2, "gad7Q1");
            return (Criteria) this;
        }

        public Criteria andGad7Q1NotBetween(Integer value1, Integer value2) {
            addCriterion("gad7_q1 not between", value1, value2, "gad7Q1");
            return (Criteria) this;
        }

        public Criteria andGad7Q2IsNull() {
            addCriterion("gad7_q2 is null");
            return (Criteria) this;
        }

        public Criteria andGad7Q2IsNotNull() {
            addCriterion("gad7_q2 is not null");
            return (Criteria) this;
        }

        public Criteria andGad7Q2EqualTo(Integer value) {
            addCriterion("gad7_q2 =", value, "gad7Q2");
            return (Criteria) this;
        }

        public Criteria andGad7Q2NotEqualTo(Integer value) {
            addCriterion("gad7_q2 <>", value, "gad7Q2");
            return (Criteria) this;
        }

        public Criteria andGad7Q2GreaterThan(Integer value) {
            addCriterion("gad7_q2 >", value, "gad7Q2");
            return (Criteria) this;
        }

        public Criteria andGad7Q2GreaterThanOrEqualTo(Integer value) {
            addCriterion("gad7_q2 >=", value, "gad7Q2");
            return (Criteria) this;
        }

        public Criteria andGad7Q2LessThan(Integer value) {
            addCriterion("gad7_q2 <", value, "gad7Q2");
            return (Criteria) this;
        }

        public Criteria andGad7Q2LessThanOrEqualTo(Integer value) {
            addCriterion("gad7_q2 <=", value, "gad7Q2");
            return (Criteria) this;
        }

        public Criteria andGad7Q2In(List<Integer> values) {
            addCriterion("gad7_q2 in", values, "gad7Q2");
            return (Criteria) this;
        }

        public Criteria andGad7Q2NotIn(List<Integer> values) {
            addCriterion("gad7_q2 not in", values, "gad7Q2");
            return (Criteria) this;
        }

        public Criteria andGad7Q2Between(Integer value1, Integer value2) {
            addCriterion("gad7_q2 between", value1, value2, "gad7Q2");
            return (Criteria) this;
        }

        public Criteria andGad7Q2NotBetween(Integer value1, Integer value2) {
            addCriterion("gad7_q2 not between", value1, value2, "gad7Q2");
            return (Criteria) this;
        }

        public Criteria andGad7Q3IsNull() {
            addCriterion("gad7_q3 is null");
            return (Criteria) this;
        }

        public Criteria andGad7Q3IsNotNull() {
            addCriterion("gad7_q3 is not null");
            return (Criteria) this;
        }

        public Criteria andGad7Q3EqualTo(Integer value) {
            addCriterion("gad7_q3 =", value, "gad7Q3");
            return (Criteria) this;
        }

        public Criteria andGad7Q3NotEqualTo(Integer value) {
            addCriterion("gad7_q3 <>", value, "gad7Q3");
            return (Criteria) this;
        }

        public Criteria andGad7Q3GreaterThan(Integer value) {
            addCriterion("gad7_q3 >", value, "gad7Q3");
            return (Criteria) this;
        }

        public Criteria andGad7Q3GreaterThanOrEqualTo(Integer value) {
            addCriterion("gad7_q3 >=", value, "gad7Q3");
            return (Criteria) this;
        }

        public Criteria andGad7Q3LessThan(Integer value) {
            addCriterion("gad7_q3 <", value, "gad7Q3");
            return (Criteria) this;
        }

        public Criteria andGad7Q3LessThanOrEqualTo(Integer value) {
            addCriterion("gad7_q3 <=", value, "gad7Q3");
            return (Criteria) this;
        }

        public Criteria andGad7Q3In(List<Integer> values) {
            addCriterion("gad7_q3 in", values, "gad7Q3");
            return (Criteria) this;
        }

        public Criteria andGad7Q3NotIn(List<Integer> values) {
            addCriterion("gad7_q3 not in", values, "gad7Q3");
            return (Criteria) this;
        }

        public Criteria andGad7Q3Between(Integer value1, Integer value2) {
            addCriterion("gad7_q3 between", value1, value2, "gad7Q3");
            return (Criteria) this;
        }

        public Criteria andGad7Q3NotBetween(Integer value1, Integer value2) {
            addCriterion("gad7_q3 not between", value1, value2, "gad7Q3");
            return (Criteria) this;
        }

        public Criteria andGad7Q4IsNull() {
            addCriterion("gad7_q4 is null");
            return (Criteria) this;
        }

        public Criteria andGad7Q4IsNotNull() {
            addCriterion("gad7_q4 is not null");
            return (Criteria) this;
        }

        public Criteria andGad7Q4EqualTo(Integer value) {
            addCriterion("gad7_q4 =", value, "gad7Q4");
            return (Criteria) this;
        }

        public Criteria andGad7Q4NotEqualTo(Integer value) {
            addCriterion("gad7_q4 <>", value, "gad7Q4");
            return (Criteria) this;
        }

        public Criteria andGad7Q4GreaterThan(Integer value) {
            addCriterion("gad7_q4 >", value, "gad7Q4");
            return (Criteria) this;
        }

        public Criteria andGad7Q4GreaterThanOrEqualTo(Integer value) {
            addCriterion("gad7_q4 >=", value, "gad7Q4");
            return (Criteria) this;
        }

        public Criteria andGad7Q4LessThan(Integer value) {
            addCriterion("gad7_q4 <", value, "gad7Q4");
            return (Criteria) this;
        }

        public Criteria andGad7Q4LessThanOrEqualTo(Integer value) {
            addCriterion("gad7_q4 <=", value, "gad7Q4");
            return (Criteria) this;
        }

        public Criteria andGad7Q4In(List<Integer> values) {
            addCriterion("gad7_q4 in", values, "gad7Q4");
            return (Criteria) this;
        }

        public Criteria andGad7Q4NotIn(List<Integer> values) {
            addCriterion("gad7_q4 not in", values, "gad7Q4");
            return (Criteria) this;
        }

        public Criteria andGad7Q4Between(Integer value1, Integer value2) {
            addCriterion("gad7_q4 between", value1, value2, "gad7Q4");
            return (Criteria) this;
        }

        public Criteria andGad7Q4NotBetween(Integer value1, Integer value2) {
            addCriterion("gad7_q4 not between", value1, value2, "gad7Q4");
            return (Criteria) this;
        }

        public Criteria andGad7Q5IsNull() {
            addCriterion("gad7_q5 is null");
            return (Criteria) this;
        }

        public Criteria andGad7Q5IsNotNull() {
            addCriterion("gad7_q5 is not null");
            return (Criteria) this;
        }

        public Criteria andGad7Q5EqualTo(Integer value) {
            addCriterion("gad7_q5 =", value, "gad7Q5");
            return (Criteria) this;
        }

        public Criteria andGad7Q5NotEqualTo(Integer value) {
            addCriterion("gad7_q5 <>", value, "gad7Q5");
            return (Criteria) this;
        }

        public Criteria andGad7Q5GreaterThan(Integer value) {
            addCriterion("gad7_q5 >", value, "gad7Q5");
            return (Criteria) this;
        }

        public Criteria andGad7Q5GreaterThanOrEqualTo(Integer value) {
            addCriterion("gad7_q5 >=", value, "gad7Q5");
            return (Criteria) this;
        }

        public Criteria andGad7Q5LessThan(Integer value) {
            addCriterion("gad7_q5 <", value, "gad7Q5");
            return (Criteria) this;
        }

        public Criteria andGad7Q5LessThanOrEqualTo(Integer value) {
            addCriterion("gad7_q5 <=", value, "gad7Q5");
            return (Criteria) this;
        }

        public Criteria andGad7Q5In(List<Integer> values) {
            addCriterion("gad7_q5 in", values, "gad7Q5");
            return (Criteria) this;
        }

        public Criteria andGad7Q5NotIn(List<Integer> values) {
            addCriterion("gad7_q5 not in", values, "gad7Q5");
            return (Criteria) this;
        }

        public Criteria andGad7Q5Between(Integer value1, Integer value2) {
            addCriterion("gad7_q5 between", value1, value2, "gad7Q5");
            return (Criteria) this;
        }

        public Criteria andGad7Q5NotBetween(Integer value1, Integer value2) {
            addCriterion("gad7_q5 not between", value1, value2, "gad7Q5");
            return (Criteria) this;
        }

        public Criteria andGad7Q6IsNull() {
            addCriterion("gad7_q6 is null");
            return (Criteria) this;
        }

        public Criteria andGad7Q6IsNotNull() {
            addCriterion("gad7_q6 is not null");
            return (Criteria) this;
        }

        public Criteria andGad7Q6EqualTo(Integer value) {
            addCriterion("gad7_q6 =", value, "gad7Q6");
            return (Criteria) this;
        }

        public Criteria andGad7Q6NotEqualTo(Integer value) {
            addCriterion("gad7_q6 <>", value, "gad7Q6");
            return (Criteria) this;
        }

        public Criteria andGad7Q6GreaterThan(Integer value) {
            addCriterion("gad7_q6 >", value, "gad7Q6");
            return (Criteria) this;
        }

        public Criteria andGad7Q6GreaterThanOrEqualTo(Integer value) {
            addCriterion("gad7_q6 >=", value, "gad7Q6");
            return (Criteria) this;
        }

        public Criteria andGad7Q6LessThan(Integer value) {
            addCriterion("gad7_q6 <", value, "gad7Q6");
            return (Criteria) this;
        }

        public Criteria andGad7Q6LessThanOrEqualTo(Integer value) {
            addCriterion("gad7_q6 <=", value, "gad7Q6");
            return (Criteria) this;
        }

        public Criteria andGad7Q6In(List<Integer> values) {
            addCriterion("gad7_q6 in", values, "gad7Q6");
            return (Criteria) this;
        }

        public Criteria andGad7Q6NotIn(List<Integer> values) {
            addCriterion("gad7_q6 not in", values, "gad7Q6");
            return (Criteria) this;
        }

        public Criteria andGad7Q6Between(Integer value1, Integer value2) {
            addCriterion("gad7_q6 between", value1, value2, "gad7Q6");
            return (Criteria) this;
        }

        public Criteria andGad7Q6NotBetween(Integer value1, Integer value2) {
            addCriterion("gad7_q6 not between", value1, value2, "gad7Q6");
            return (Criteria) this;
        }

        public Criteria andGad7Q7IsNull() {
            addCriterion("gad7_q7 is null");
            return (Criteria) this;
        }

        public Criteria andGad7Q7IsNotNull() {
            addCriterion("gad7_q7 is not null");
            return (Criteria) this;
        }

        public Criteria andGad7Q7EqualTo(Integer value) {
            addCriterion("gad7_q7 =", value, "gad7Q7");
            return (Criteria) this;
        }

        public Criteria andGad7Q7NotEqualTo(Integer value) {
            addCriterion("gad7_q7 <>", value, "gad7Q7");
            return (Criteria) this;
        }

        public Criteria andGad7Q7GreaterThan(Integer value) {
            addCriterion("gad7_q7 >", value, "gad7Q7");
            return (Criteria) this;
        }

        public Criteria andGad7Q7GreaterThanOrEqualTo(Integer value) {
            addCriterion("gad7_q7 >=", value, "gad7Q7");
            return (Criteria) this;
        }

        public Criteria andGad7Q7LessThan(Integer value) {
            addCriterion("gad7_q7 <", value, "gad7Q7");
            return (Criteria) this;
        }

        public Criteria andGad7Q7LessThanOrEqualTo(Integer value) {
            addCriterion("gad7_q7 <=", value, "gad7Q7");
            return (Criteria) this;
        }

        public Criteria andGad7Q7In(List<Integer> values) {
            addCriterion("gad7_q7 in", values, "gad7Q7");
            return (Criteria) this;
        }

        public Criteria andGad7Q7NotIn(List<Integer> values) {
            addCriterion("gad7_q7 not in", values, "gad7Q7");
            return (Criteria) this;
        }

        public Criteria andGad7Q7Between(Integer value1, Integer value2) {
            addCriterion("gad7_q7 between", value1, value2, "gad7Q7");
            return (Criteria) this;
        }

        public Criteria andGad7Q7NotBetween(Integer value1, Integer value2) {
            addCriterion("gad7_q7 not between", value1, value2, "gad7Q7");
            return (Criteria) this;
        }

        public Criteria andGad7AffectIsNull() {
            addCriterion("gad7_affect is null");
            return (Criteria) this;
        }

        public Criteria andGad7AffectIsNotNull() {
            addCriterion("gad7_affect is not null");
            return (Criteria) this;
        }

        public Criteria andGad7AffectEqualTo(Integer value) {
            addCriterion("gad7_affect =", value, "gad7Affect");
            return (Criteria) this;
        }

        public Criteria andGad7AffectNotEqualTo(Integer value) {
            addCriterion("gad7_affect <>", value, "gad7Affect");
            return (Criteria) this;
        }

        public Criteria andGad7AffectGreaterThan(Integer value) {
            addCriterion("gad7_affect >", value, "gad7Affect");
            return (Criteria) this;
        }

        public Criteria andGad7AffectGreaterThanOrEqualTo(Integer value) {
            addCriterion("gad7_affect >=", value, "gad7Affect");
            return (Criteria) this;
        }

        public Criteria andGad7AffectLessThan(Integer value) {
            addCriterion("gad7_affect <", value, "gad7Affect");
            return (Criteria) this;
        }

        public Criteria andGad7AffectLessThanOrEqualTo(Integer value) {
            addCriterion("gad7_affect <=", value, "gad7Affect");
            return (Criteria) this;
        }

        public Criteria andGad7AffectIn(List<Integer> values) {
            addCriterion("gad7_affect in", values, "gad7Affect");
            return (Criteria) this;
        }

        public Criteria andGad7AffectNotIn(List<Integer> values) {
            addCriterion("gad7_affect not in", values, "gad7Affect");
            return (Criteria) this;
        }

        public Criteria andGad7AffectBetween(Integer value1, Integer value2) {
            addCriterion("gad7_affect between", value1, value2, "gad7Affect");
            return (Criteria) this;
        }

        public Criteria andGad7AffectNotBetween(Integer value1, Integer value2) {
            addCriterion("gad7_affect not between", value1, value2, "gad7Affect");
            return (Criteria) this;
        }

        public Criteria andGad7ScoreIsNull() {
            addCriterion("gad7_score is null");
            return (Criteria) this;
        }

        public Criteria andGad7ScoreIsNotNull() {
            addCriterion("gad7_score is not null");
            return (Criteria) this;
        }

        public Criteria andGad7ScoreEqualTo(Integer value) {
            addCriterion("gad7_score =", value, "gad7Score");
            return (Criteria) this;
        }

        public Criteria andGad7ScoreNotEqualTo(Integer value) {
            addCriterion("gad7_score <>", value, "gad7Score");
            return (Criteria) this;
        }

        public Criteria andGad7ScoreGreaterThan(Integer value) {
            addCriterion("gad7_score >", value, "gad7Score");
            return (Criteria) this;
        }

        public Criteria andGad7ScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("gad7_score >=", value, "gad7Score");
            return (Criteria) this;
        }

        public Criteria andGad7ScoreLessThan(Integer value) {
            addCriterion("gad7_score <", value, "gad7Score");
            return (Criteria) this;
        }

        public Criteria andGad7ScoreLessThanOrEqualTo(Integer value) {
            addCriterion("gad7_score <=", value, "gad7Score");
            return (Criteria) this;
        }

        public Criteria andGad7ScoreIn(List<Integer> values) {
            addCriterion("gad7_score in", values, "gad7Score");
            return (Criteria) this;
        }

        public Criteria andGad7ScoreNotIn(List<Integer> values) {
            addCriterion("gad7_score not in", values, "gad7Score");
            return (Criteria) this;
        }

        public Criteria andGad7ScoreBetween(Integer value1, Integer value2) {
            addCriterion("gad7_score between", value1, value2, "gad7Score");
            return (Criteria) this;
        }

        public Criteria andGad7ScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("gad7_score not between", value1, value2, "gad7Score");
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