package com.breeze.health.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserPsychologicalPHQ9Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserPsychologicalPHQ9Example() {
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

        public Criteria andPhq9Q1IsNull() {
            addCriterion("phq9_q1 is null");
            return (Criteria) this;
        }

        public Criteria andPhq9Q1IsNotNull() {
            addCriterion("phq9_q1 is not null");
            return (Criteria) this;
        }

        public Criteria andPhq9Q1EqualTo(Integer value) {
            addCriterion("phq9_q1 =", value, "phq9Q1");
            return (Criteria) this;
        }

        public Criteria andPhq9Q1NotEqualTo(Integer value) {
            addCriterion("phq9_q1 <>", value, "phq9Q1");
            return (Criteria) this;
        }

        public Criteria andPhq9Q1GreaterThan(Integer value) {
            addCriterion("phq9_q1 >", value, "phq9Q1");
            return (Criteria) this;
        }

        public Criteria andPhq9Q1GreaterThanOrEqualTo(Integer value) {
            addCriterion("phq9_q1 >=", value, "phq9Q1");
            return (Criteria) this;
        }

        public Criteria andPhq9Q1LessThan(Integer value) {
            addCriterion("phq9_q1 <", value, "phq9Q1");
            return (Criteria) this;
        }

        public Criteria andPhq9Q1LessThanOrEqualTo(Integer value) {
            addCriterion("phq9_q1 <=", value, "phq9Q1");
            return (Criteria) this;
        }

        public Criteria andPhq9Q1In(List<Integer> values) {
            addCriterion("phq9_q1 in", values, "phq9Q1");
            return (Criteria) this;
        }

        public Criteria andPhq9Q1NotIn(List<Integer> values) {
            addCriterion("phq9_q1 not in", values, "phq9Q1");
            return (Criteria) this;
        }

        public Criteria andPhq9Q1Between(Integer value1, Integer value2) {
            addCriterion("phq9_q1 between", value1, value2, "phq9Q1");
            return (Criteria) this;
        }

        public Criteria andPhq9Q1NotBetween(Integer value1, Integer value2) {
            addCriterion("phq9_q1 not between", value1, value2, "phq9Q1");
            return (Criteria) this;
        }

        public Criteria andPhq9Q2IsNull() {
            addCriterion("phq9_q2 is null");
            return (Criteria) this;
        }

        public Criteria andPhq9Q2IsNotNull() {
            addCriterion("phq9_q2 is not null");
            return (Criteria) this;
        }

        public Criteria andPhq9Q2EqualTo(Integer value) {
            addCriterion("phq9_q2 =", value, "phq9Q2");
            return (Criteria) this;
        }

        public Criteria andPhq9Q2NotEqualTo(Integer value) {
            addCriterion("phq9_q2 <>", value, "phq9Q2");
            return (Criteria) this;
        }

        public Criteria andPhq9Q2GreaterThan(Integer value) {
            addCriterion("phq9_q2 >", value, "phq9Q2");
            return (Criteria) this;
        }

        public Criteria andPhq9Q2GreaterThanOrEqualTo(Integer value) {
            addCriterion("phq9_q2 >=", value, "phq9Q2");
            return (Criteria) this;
        }

        public Criteria andPhq9Q2LessThan(Integer value) {
            addCriterion("phq9_q2 <", value, "phq9Q2");
            return (Criteria) this;
        }

        public Criteria andPhq9Q2LessThanOrEqualTo(Integer value) {
            addCriterion("phq9_q2 <=", value, "phq9Q2");
            return (Criteria) this;
        }

        public Criteria andPhq9Q2In(List<Integer> values) {
            addCriterion("phq9_q2 in", values, "phq9Q2");
            return (Criteria) this;
        }

        public Criteria andPhq9Q2NotIn(List<Integer> values) {
            addCriterion("phq9_q2 not in", values, "phq9Q2");
            return (Criteria) this;
        }

        public Criteria andPhq9Q2Between(Integer value1, Integer value2) {
            addCriterion("phq9_q2 between", value1, value2, "phq9Q2");
            return (Criteria) this;
        }

        public Criteria andPhq9Q2NotBetween(Integer value1, Integer value2) {
            addCriterion("phq9_q2 not between", value1, value2, "phq9Q2");
            return (Criteria) this;
        }

        public Criteria andPhq9Q3IsNull() {
            addCriterion("phq9_q3 is null");
            return (Criteria) this;
        }

        public Criteria andPhq9Q3IsNotNull() {
            addCriterion("phq9_q3 is not null");
            return (Criteria) this;
        }

        public Criteria andPhq9Q3EqualTo(Integer value) {
            addCriterion("phq9_q3 =", value, "phq9Q3");
            return (Criteria) this;
        }

        public Criteria andPhq9Q3NotEqualTo(Integer value) {
            addCriterion("phq9_q3 <>", value, "phq9Q3");
            return (Criteria) this;
        }

        public Criteria andPhq9Q3GreaterThan(Integer value) {
            addCriterion("phq9_q3 >", value, "phq9Q3");
            return (Criteria) this;
        }

        public Criteria andPhq9Q3GreaterThanOrEqualTo(Integer value) {
            addCriterion("phq9_q3 >=", value, "phq9Q3");
            return (Criteria) this;
        }

        public Criteria andPhq9Q3LessThan(Integer value) {
            addCriterion("phq9_q3 <", value, "phq9Q3");
            return (Criteria) this;
        }

        public Criteria andPhq9Q3LessThanOrEqualTo(Integer value) {
            addCriterion("phq9_q3 <=", value, "phq9Q3");
            return (Criteria) this;
        }

        public Criteria andPhq9Q3In(List<Integer> values) {
            addCriterion("phq9_q3 in", values, "phq9Q3");
            return (Criteria) this;
        }

        public Criteria andPhq9Q3NotIn(List<Integer> values) {
            addCriterion("phq9_q3 not in", values, "phq9Q3");
            return (Criteria) this;
        }

        public Criteria andPhq9Q3Between(Integer value1, Integer value2) {
            addCriterion("phq9_q3 between", value1, value2, "phq9Q3");
            return (Criteria) this;
        }

        public Criteria andPhq9Q3NotBetween(Integer value1, Integer value2) {
            addCriterion("phq9_q3 not between", value1, value2, "phq9Q3");
            return (Criteria) this;
        }

        public Criteria andPhq9Q4IsNull() {
            addCriterion("phq9_q4 is null");
            return (Criteria) this;
        }

        public Criteria andPhq9Q4IsNotNull() {
            addCriterion("phq9_q4 is not null");
            return (Criteria) this;
        }

        public Criteria andPhq9Q4EqualTo(Integer value) {
            addCriterion("phq9_q4 =", value, "phq9Q4");
            return (Criteria) this;
        }

        public Criteria andPhq9Q4NotEqualTo(Integer value) {
            addCriterion("phq9_q4 <>", value, "phq9Q4");
            return (Criteria) this;
        }

        public Criteria andPhq9Q4GreaterThan(Integer value) {
            addCriterion("phq9_q4 >", value, "phq9Q4");
            return (Criteria) this;
        }

        public Criteria andPhq9Q4GreaterThanOrEqualTo(Integer value) {
            addCriterion("phq9_q4 >=", value, "phq9Q4");
            return (Criteria) this;
        }

        public Criteria andPhq9Q4LessThan(Integer value) {
            addCriterion("phq9_q4 <", value, "phq9Q4");
            return (Criteria) this;
        }

        public Criteria andPhq9Q4LessThanOrEqualTo(Integer value) {
            addCriterion("phq9_q4 <=", value, "phq9Q4");
            return (Criteria) this;
        }

        public Criteria andPhq9Q4In(List<Integer> values) {
            addCriterion("phq9_q4 in", values, "phq9Q4");
            return (Criteria) this;
        }

        public Criteria andPhq9Q4NotIn(List<Integer> values) {
            addCriterion("phq9_q4 not in", values, "phq9Q4");
            return (Criteria) this;
        }

        public Criteria andPhq9Q4Between(Integer value1, Integer value2) {
            addCriterion("phq9_q4 between", value1, value2, "phq9Q4");
            return (Criteria) this;
        }

        public Criteria andPhq9Q4NotBetween(Integer value1, Integer value2) {
            addCriterion("phq9_q4 not between", value1, value2, "phq9Q4");
            return (Criteria) this;
        }

        public Criteria andPhq9Q5IsNull() {
            addCriterion("phq9_q5 is null");
            return (Criteria) this;
        }

        public Criteria andPhq9Q5IsNotNull() {
            addCriterion("phq9_q5 is not null");
            return (Criteria) this;
        }

        public Criteria andPhq9Q5EqualTo(Integer value) {
            addCriterion("phq9_q5 =", value, "phq9Q5");
            return (Criteria) this;
        }

        public Criteria andPhq9Q5NotEqualTo(Integer value) {
            addCriterion("phq9_q5 <>", value, "phq9Q5");
            return (Criteria) this;
        }

        public Criteria andPhq9Q5GreaterThan(Integer value) {
            addCriterion("phq9_q5 >", value, "phq9Q5");
            return (Criteria) this;
        }

        public Criteria andPhq9Q5GreaterThanOrEqualTo(Integer value) {
            addCriterion("phq9_q5 >=", value, "phq9Q5");
            return (Criteria) this;
        }

        public Criteria andPhq9Q5LessThan(Integer value) {
            addCriterion("phq9_q5 <", value, "phq9Q5");
            return (Criteria) this;
        }

        public Criteria andPhq9Q5LessThanOrEqualTo(Integer value) {
            addCriterion("phq9_q5 <=", value, "phq9Q5");
            return (Criteria) this;
        }

        public Criteria andPhq9Q5In(List<Integer> values) {
            addCriterion("phq9_q5 in", values, "phq9Q5");
            return (Criteria) this;
        }

        public Criteria andPhq9Q5NotIn(List<Integer> values) {
            addCriterion("phq9_q5 not in", values, "phq9Q5");
            return (Criteria) this;
        }

        public Criteria andPhq9Q5Between(Integer value1, Integer value2) {
            addCriterion("phq9_q5 between", value1, value2, "phq9Q5");
            return (Criteria) this;
        }

        public Criteria andPhq9Q5NotBetween(Integer value1, Integer value2) {
            addCriterion("phq9_q5 not between", value1, value2, "phq9Q5");
            return (Criteria) this;
        }

        public Criteria andPhq9Q6IsNull() {
            addCriterion("phq9_q6 is null");
            return (Criteria) this;
        }

        public Criteria andPhq9Q6IsNotNull() {
            addCriterion("phq9_q6 is not null");
            return (Criteria) this;
        }

        public Criteria andPhq9Q6EqualTo(Integer value) {
            addCriterion("phq9_q6 =", value, "phq9Q6");
            return (Criteria) this;
        }

        public Criteria andPhq9Q6NotEqualTo(Integer value) {
            addCriterion("phq9_q6 <>", value, "phq9Q6");
            return (Criteria) this;
        }

        public Criteria andPhq9Q6GreaterThan(Integer value) {
            addCriterion("phq9_q6 >", value, "phq9Q6");
            return (Criteria) this;
        }

        public Criteria andPhq9Q6GreaterThanOrEqualTo(Integer value) {
            addCriterion("phq9_q6 >=", value, "phq9Q6");
            return (Criteria) this;
        }

        public Criteria andPhq9Q6LessThan(Integer value) {
            addCriterion("phq9_q6 <", value, "phq9Q6");
            return (Criteria) this;
        }

        public Criteria andPhq9Q6LessThanOrEqualTo(Integer value) {
            addCriterion("phq9_q6 <=", value, "phq9Q6");
            return (Criteria) this;
        }

        public Criteria andPhq9Q6In(List<Integer> values) {
            addCriterion("phq9_q6 in", values, "phq9Q6");
            return (Criteria) this;
        }

        public Criteria andPhq9Q6NotIn(List<Integer> values) {
            addCriterion("phq9_q6 not in", values, "phq9Q6");
            return (Criteria) this;
        }

        public Criteria andPhq9Q6Between(Integer value1, Integer value2) {
            addCriterion("phq9_q6 between", value1, value2, "phq9Q6");
            return (Criteria) this;
        }

        public Criteria andPhq9Q6NotBetween(Integer value1, Integer value2) {
            addCriterion("phq9_q6 not between", value1, value2, "phq9Q6");
            return (Criteria) this;
        }

        public Criteria andPhq9Q7IsNull() {
            addCriterion("phq9_q7 is null");
            return (Criteria) this;
        }

        public Criteria andPhq9Q7IsNotNull() {
            addCriterion("phq9_q7 is not null");
            return (Criteria) this;
        }

        public Criteria andPhq9Q7EqualTo(Integer value) {
            addCriterion("phq9_q7 =", value, "phq9Q7");
            return (Criteria) this;
        }

        public Criteria andPhq9Q7NotEqualTo(Integer value) {
            addCriterion("phq9_q7 <>", value, "phq9Q7");
            return (Criteria) this;
        }

        public Criteria andPhq9Q7GreaterThan(Integer value) {
            addCriterion("phq9_q7 >", value, "phq9Q7");
            return (Criteria) this;
        }

        public Criteria andPhq9Q7GreaterThanOrEqualTo(Integer value) {
            addCriterion("phq9_q7 >=", value, "phq9Q7");
            return (Criteria) this;
        }

        public Criteria andPhq9Q7LessThan(Integer value) {
            addCriterion("phq9_q7 <", value, "phq9Q7");
            return (Criteria) this;
        }

        public Criteria andPhq9Q7LessThanOrEqualTo(Integer value) {
            addCriterion("phq9_q7 <=", value, "phq9Q7");
            return (Criteria) this;
        }

        public Criteria andPhq9Q7In(List<Integer> values) {
            addCriterion("phq9_q7 in", values, "phq9Q7");
            return (Criteria) this;
        }

        public Criteria andPhq9Q7NotIn(List<Integer> values) {
            addCriterion("phq9_q7 not in", values, "phq9Q7");
            return (Criteria) this;
        }

        public Criteria andPhq9Q7Between(Integer value1, Integer value2) {
            addCriterion("phq9_q7 between", value1, value2, "phq9Q7");
            return (Criteria) this;
        }

        public Criteria andPhq9Q7NotBetween(Integer value1, Integer value2) {
            addCriterion("phq9_q7 not between", value1, value2, "phq9Q7");
            return (Criteria) this;
        }

        public Criteria andPhq9Q8IsNull() {
            addCriterion("phq9_q8 is null");
            return (Criteria) this;
        }

        public Criteria andPhq9Q8IsNotNull() {
            addCriterion("phq9_q8 is not null");
            return (Criteria) this;
        }

        public Criteria andPhq9Q8EqualTo(Integer value) {
            addCriterion("phq9_q8 =", value, "phq9Q8");
            return (Criteria) this;
        }

        public Criteria andPhq9Q8NotEqualTo(Integer value) {
            addCriterion("phq9_q8 <>", value, "phq9Q8");
            return (Criteria) this;
        }

        public Criteria andPhq9Q8GreaterThan(Integer value) {
            addCriterion("phq9_q8 >", value, "phq9Q8");
            return (Criteria) this;
        }

        public Criteria andPhq9Q8GreaterThanOrEqualTo(Integer value) {
            addCriterion("phq9_q8 >=", value, "phq9Q8");
            return (Criteria) this;
        }

        public Criteria andPhq9Q8LessThan(Integer value) {
            addCriterion("phq9_q8 <", value, "phq9Q8");
            return (Criteria) this;
        }

        public Criteria andPhq9Q8LessThanOrEqualTo(Integer value) {
            addCriterion("phq9_q8 <=", value, "phq9Q8");
            return (Criteria) this;
        }

        public Criteria andPhq9Q8In(List<Integer> values) {
            addCriterion("phq9_q8 in", values, "phq9Q8");
            return (Criteria) this;
        }

        public Criteria andPhq9Q8NotIn(List<Integer> values) {
            addCriterion("phq9_q8 not in", values, "phq9Q8");
            return (Criteria) this;
        }

        public Criteria andPhq9Q8Between(Integer value1, Integer value2) {
            addCriterion("phq9_q8 between", value1, value2, "phq9Q8");
            return (Criteria) this;
        }

        public Criteria andPhq9Q8NotBetween(Integer value1, Integer value2) {
            addCriterion("phq9_q8 not between", value1, value2, "phq9Q8");
            return (Criteria) this;
        }

        public Criteria andPhq9Q9IsNull() {
            addCriterion("phq9_q9 is null");
            return (Criteria) this;
        }

        public Criteria andPhq9Q9IsNotNull() {
            addCriterion("phq9_q9 is not null");
            return (Criteria) this;
        }

        public Criteria andPhq9Q9EqualTo(Integer value) {
            addCriterion("phq9_q9 =", value, "phq9Q9");
            return (Criteria) this;
        }

        public Criteria andPhq9Q9NotEqualTo(Integer value) {
            addCriterion("phq9_q9 <>", value, "phq9Q9");
            return (Criteria) this;
        }

        public Criteria andPhq9Q9GreaterThan(Integer value) {
            addCriterion("phq9_q9 >", value, "phq9Q9");
            return (Criteria) this;
        }

        public Criteria andPhq9Q9GreaterThanOrEqualTo(Integer value) {
            addCriterion("phq9_q9 >=", value, "phq9Q9");
            return (Criteria) this;
        }

        public Criteria andPhq9Q9LessThan(Integer value) {
            addCriterion("phq9_q9 <", value, "phq9Q9");
            return (Criteria) this;
        }

        public Criteria andPhq9Q9LessThanOrEqualTo(Integer value) {
            addCriterion("phq9_q9 <=", value, "phq9Q9");
            return (Criteria) this;
        }

        public Criteria andPhq9Q9In(List<Integer> values) {
            addCriterion("phq9_q9 in", values, "phq9Q9");
            return (Criteria) this;
        }

        public Criteria andPhq9Q9NotIn(List<Integer> values) {
            addCriterion("phq9_q9 not in", values, "phq9Q9");
            return (Criteria) this;
        }

        public Criteria andPhq9Q9Between(Integer value1, Integer value2) {
            addCriterion("phq9_q9 between", value1, value2, "phq9Q9");
            return (Criteria) this;
        }

        public Criteria andPhq9Q9NotBetween(Integer value1, Integer value2) {
            addCriterion("phq9_q9 not between", value1, value2, "phq9Q9");
            return (Criteria) this;
        }

        public Criteria andPhq9AffectIsNull() {
            addCriterion("phq9_affect is null");
            return (Criteria) this;
        }

        public Criteria andPhq9AffectIsNotNull() {
            addCriterion("phq9_affect is not null");
            return (Criteria) this;
        }

        public Criteria andPhq9AffectEqualTo(Integer value) {
            addCriterion("phq9_affect =", value, "phq9Affect");
            return (Criteria) this;
        }

        public Criteria andPhq9AffectNotEqualTo(Integer value) {
            addCriterion("phq9_affect <>", value, "phq9Affect");
            return (Criteria) this;
        }

        public Criteria andPhq9AffectGreaterThan(Integer value) {
            addCriterion("phq9_affect >", value, "phq9Affect");
            return (Criteria) this;
        }

        public Criteria andPhq9AffectGreaterThanOrEqualTo(Integer value) {
            addCriterion("phq9_affect >=", value, "phq9Affect");
            return (Criteria) this;
        }

        public Criteria andPhq9AffectLessThan(Integer value) {
            addCriterion("phq9_affect <", value, "phq9Affect");
            return (Criteria) this;
        }

        public Criteria andPhq9AffectLessThanOrEqualTo(Integer value) {
            addCriterion("phq9_affect <=", value, "phq9Affect");
            return (Criteria) this;
        }

        public Criteria andPhq9AffectIn(List<Integer> values) {
            addCriterion("phq9_affect in", values, "phq9Affect");
            return (Criteria) this;
        }

        public Criteria andPhq9AffectNotIn(List<Integer> values) {
            addCriterion("phq9_affect not in", values, "phq9Affect");
            return (Criteria) this;
        }

        public Criteria andPhq9AffectBetween(Integer value1, Integer value2) {
            addCriterion("phq9_affect between", value1, value2, "phq9Affect");
            return (Criteria) this;
        }

        public Criteria andPhq9AffectNotBetween(Integer value1, Integer value2) {
            addCriterion("phq9_affect not between", value1, value2, "phq9Affect");
            return (Criteria) this;
        }

        public Criteria andPhq9ScoreIsNull() {
            addCriterion("phq9_score is null");
            return (Criteria) this;
        }

        public Criteria andPhq9ScoreIsNotNull() {
            addCriterion("phq9_score is not null");
            return (Criteria) this;
        }

        public Criteria andPhq9ScoreEqualTo(Integer value) {
            addCriterion("phq9_score =", value, "phq9Score");
            return (Criteria) this;
        }

        public Criteria andPhq9ScoreNotEqualTo(Integer value) {
            addCriterion("phq9_score <>", value, "phq9Score");
            return (Criteria) this;
        }

        public Criteria andPhq9ScoreGreaterThan(Integer value) {
            addCriterion("phq9_score >", value, "phq9Score");
            return (Criteria) this;
        }

        public Criteria andPhq9ScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("phq9_score >=", value, "phq9Score");
            return (Criteria) this;
        }

        public Criteria andPhq9ScoreLessThan(Integer value) {
            addCriterion("phq9_score <", value, "phq9Score");
            return (Criteria) this;
        }

        public Criteria andPhq9ScoreLessThanOrEqualTo(Integer value) {
            addCriterion("phq9_score <=", value, "phq9Score");
            return (Criteria) this;
        }

        public Criteria andPhq9ScoreIn(List<Integer> values) {
            addCriterion("phq9_score in", values, "phq9Score");
            return (Criteria) this;
        }

        public Criteria andPhq9ScoreNotIn(List<Integer> values) {
            addCriterion("phq9_score not in", values, "phq9Score");
            return (Criteria) this;
        }

        public Criteria andPhq9ScoreBetween(Integer value1, Integer value2) {
            addCriterion("phq9_score between", value1, value2, "phq9Score");
            return (Criteria) this;
        }

        public Criteria andPhq9ScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("phq9_score not between", value1, value2, "phq9Score");
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