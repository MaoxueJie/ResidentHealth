package com.breeze.health.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserPsychologicalSuicideExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserPsychologicalSuicideExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andQ1IsNull() {
            addCriterion("q1 is null");
            return (Criteria) this;
        }

        public Criteria andQ1IsNotNull() {
            addCriterion("q1 is not null");
            return (Criteria) this;
        }

        public Criteria andQ1EqualTo(Integer value) {
            addCriterion("q1 =", value, "q1");
            return (Criteria) this;
        }

        public Criteria andQ1NotEqualTo(Integer value) {
            addCriterion("q1 <>", value, "q1");
            return (Criteria) this;
        }

        public Criteria andQ1GreaterThan(Integer value) {
            addCriterion("q1 >", value, "q1");
            return (Criteria) this;
        }

        public Criteria andQ1GreaterThanOrEqualTo(Integer value) {
            addCriterion("q1 >=", value, "q1");
            return (Criteria) this;
        }

        public Criteria andQ1LessThan(Integer value) {
            addCriterion("q1 <", value, "q1");
            return (Criteria) this;
        }

        public Criteria andQ1LessThanOrEqualTo(Integer value) {
            addCriterion("q1 <=", value, "q1");
            return (Criteria) this;
        }

        public Criteria andQ1In(List<Integer> values) {
            addCriterion("q1 in", values, "q1");
            return (Criteria) this;
        }

        public Criteria andQ1NotIn(List<Integer> values) {
            addCriterion("q1 not in", values, "q1");
            return (Criteria) this;
        }

        public Criteria andQ1Between(Integer value1, Integer value2) {
            addCriterion("q1 between", value1, value2, "q1");
            return (Criteria) this;
        }

        public Criteria andQ1NotBetween(Integer value1, Integer value2) {
            addCriterion("q1 not between", value1, value2, "q1");
            return (Criteria) this;
        }

        public Criteria andQ2IsNull() {
            addCriterion("q2 is null");
            return (Criteria) this;
        }

        public Criteria andQ2IsNotNull() {
            addCriterion("q2 is not null");
            return (Criteria) this;
        }

        public Criteria andQ2EqualTo(Integer value) {
            addCriterion("q2 =", value, "q2");
            return (Criteria) this;
        }

        public Criteria andQ2NotEqualTo(Integer value) {
            addCriterion("q2 <>", value, "q2");
            return (Criteria) this;
        }

        public Criteria andQ2GreaterThan(Integer value) {
            addCriterion("q2 >", value, "q2");
            return (Criteria) this;
        }

        public Criteria andQ2GreaterThanOrEqualTo(Integer value) {
            addCriterion("q2 >=", value, "q2");
            return (Criteria) this;
        }

        public Criteria andQ2LessThan(Integer value) {
            addCriterion("q2 <", value, "q2");
            return (Criteria) this;
        }

        public Criteria andQ2LessThanOrEqualTo(Integer value) {
            addCriterion("q2 <=", value, "q2");
            return (Criteria) this;
        }

        public Criteria andQ2In(List<Integer> values) {
            addCriterion("q2 in", values, "q2");
            return (Criteria) this;
        }

        public Criteria andQ2NotIn(List<Integer> values) {
            addCriterion("q2 not in", values, "q2");
            return (Criteria) this;
        }

        public Criteria andQ2Between(Integer value1, Integer value2) {
            addCriterion("q2 between", value1, value2, "q2");
            return (Criteria) this;
        }

        public Criteria andQ2NotBetween(Integer value1, Integer value2) {
            addCriterion("q2 not between", value1, value2, "q2");
            return (Criteria) this;
        }

        public Criteria andQ3IsNull() {
            addCriterion("q3 is null");
            return (Criteria) this;
        }

        public Criteria andQ3IsNotNull() {
            addCriterion("q3 is not null");
            return (Criteria) this;
        }

        public Criteria andQ3EqualTo(Integer value) {
            addCriterion("q3 =", value, "q3");
            return (Criteria) this;
        }

        public Criteria andQ3NotEqualTo(Integer value) {
            addCriterion("q3 <>", value, "q3");
            return (Criteria) this;
        }

        public Criteria andQ3GreaterThan(Integer value) {
            addCriterion("q3 >", value, "q3");
            return (Criteria) this;
        }

        public Criteria andQ3GreaterThanOrEqualTo(Integer value) {
            addCriterion("q3 >=", value, "q3");
            return (Criteria) this;
        }

        public Criteria andQ3LessThan(Integer value) {
            addCriterion("q3 <", value, "q3");
            return (Criteria) this;
        }

        public Criteria andQ3LessThanOrEqualTo(Integer value) {
            addCriterion("q3 <=", value, "q3");
            return (Criteria) this;
        }

        public Criteria andQ3In(List<Integer> values) {
            addCriterion("q3 in", values, "q3");
            return (Criteria) this;
        }

        public Criteria andQ3NotIn(List<Integer> values) {
            addCriterion("q3 not in", values, "q3");
            return (Criteria) this;
        }

        public Criteria andQ3Between(Integer value1, Integer value2) {
            addCriterion("q3 between", value1, value2, "q3");
            return (Criteria) this;
        }

        public Criteria andQ3NotBetween(Integer value1, Integer value2) {
            addCriterion("q3 not between", value1, value2, "q3");
            return (Criteria) this;
        }

        public Criteria andQ4IsNull() {
            addCriterion("q4 is null");
            return (Criteria) this;
        }

        public Criteria andQ4IsNotNull() {
            addCriterion("q4 is not null");
            return (Criteria) this;
        }

        public Criteria andQ4EqualTo(Integer value) {
            addCriterion("q4 =", value, "q4");
            return (Criteria) this;
        }

        public Criteria andQ4NotEqualTo(Integer value) {
            addCriterion("q4 <>", value, "q4");
            return (Criteria) this;
        }

        public Criteria andQ4GreaterThan(Integer value) {
            addCriterion("q4 >", value, "q4");
            return (Criteria) this;
        }

        public Criteria andQ4GreaterThanOrEqualTo(Integer value) {
            addCriterion("q4 >=", value, "q4");
            return (Criteria) this;
        }

        public Criteria andQ4LessThan(Integer value) {
            addCriterion("q4 <", value, "q4");
            return (Criteria) this;
        }

        public Criteria andQ4LessThanOrEqualTo(Integer value) {
            addCriterion("q4 <=", value, "q4");
            return (Criteria) this;
        }

        public Criteria andQ4In(List<Integer> values) {
            addCriterion("q4 in", values, "q4");
            return (Criteria) this;
        }

        public Criteria andQ4NotIn(List<Integer> values) {
            addCriterion("q4 not in", values, "q4");
            return (Criteria) this;
        }

        public Criteria andQ4Between(Integer value1, Integer value2) {
            addCriterion("q4 between", value1, value2, "q4");
            return (Criteria) this;
        }

        public Criteria andQ4NotBetween(Integer value1, Integer value2) {
            addCriterion("q4 not between", value1, value2, "q4");
            return (Criteria) this;
        }

        public Criteria andQ5IsNull() {
            addCriterion("q5 is null");
            return (Criteria) this;
        }

        public Criteria andQ5IsNotNull() {
            addCriterion("q5 is not null");
            return (Criteria) this;
        }

        public Criteria andQ5EqualTo(Integer value) {
            addCriterion("q5 =", value, "q5");
            return (Criteria) this;
        }

        public Criteria andQ5NotEqualTo(Integer value) {
            addCriterion("q5 <>", value, "q5");
            return (Criteria) this;
        }

        public Criteria andQ5GreaterThan(Integer value) {
            addCriterion("q5 >", value, "q5");
            return (Criteria) this;
        }

        public Criteria andQ5GreaterThanOrEqualTo(Integer value) {
            addCriterion("q5 >=", value, "q5");
            return (Criteria) this;
        }

        public Criteria andQ5LessThan(Integer value) {
            addCriterion("q5 <", value, "q5");
            return (Criteria) this;
        }

        public Criteria andQ5LessThanOrEqualTo(Integer value) {
            addCriterion("q5 <=", value, "q5");
            return (Criteria) this;
        }

        public Criteria andQ5In(List<Integer> values) {
            addCriterion("q5 in", values, "q5");
            return (Criteria) this;
        }

        public Criteria andQ5NotIn(List<Integer> values) {
            addCriterion("q5 not in", values, "q5");
            return (Criteria) this;
        }

        public Criteria andQ5Between(Integer value1, Integer value2) {
            addCriterion("q5 between", value1, value2, "q5");
            return (Criteria) this;
        }

        public Criteria andQ5NotBetween(Integer value1, Integer value2) {
            addCriterion("q5 not between", value1, value2, "q5");
            return (Criteria) this;
        }

        public Criteria andQ6IsNull() {
            addCriterion("q6 is null");
            return (Criteria) this;
        }

        public Criteria andQ6IsNotNull() {
            addCriterion("q6 is not null");
            return (Criteria) this;
        }

        public Criteria andQ6EqualTo(Integer value) {
            addCriterion("q6 =", value, "q6");
            return (Criteria) this;
        }

        public Criteria andQ6NotEqualTo(Integer value) {
            addCriterion("q6 <>", value, "q6");
            return (Criteria) this;
        }

        public Criteria andQ6GreaterThan(Integer value) {
            addCriterion("q6 >", value, "q6");
            return (Criteria) this;
        }

        public Criteria andQ6GreaterThanOrEqualTo(Integer value) {
            addCriterion("q6 >=", value, "q6");
            return (Criteria) this;
        }

        public Criteria andQ6LessThan(Integer value) {
            addCriterion("q6 <", value, "q6");
            return (Criteria) this;
        }

        public Criteria andQ6LessThanOrEqualTo(Integer value) {
            addCriterion("q6 <=", value, "q6");
            return (Criteria) this;
        }

        public Criteria andQ6In(List<Integer> values) {
            addCriterion("q6 in", values, "q6");
            return (Criteria) this;
        }

        public Criteria andQ6NotIn(List<Integer> values) {
            addCriterion("q6 not in", values, "q6");
            return (Criteria) this;
        }

        public Criteria andQ6Between(Integer value1, Integer value2) {
            addCriterion("q6 between", value1, value2, "q6");
            return (Criteria) this;
        }

        public Criteria andQ6NotBetween(Integer value1, Integer value2) {
            addCriterion("q6 not between", value1, value2, "q6");
            return (Criteria) this;
        }

        public Criteria andQ7IsNull() {
            addCriterion("q7 is null");
            return (Criteria) this;
        }

        public Criteria andQ7IsNotNull() {
            addCriterion("q7 is not null");
            return (Criteria) this;
        }

        public Criteria andQ7EqualTo(Integer value) {
            addCriterion("q7 =", value, "q7");
            return (Criteria) this;
        }

        public Criteria andQ7NotEqualTo(Integer value) {
            addCriterion("q7 <>", value, "q7");
            return (Criteria) this;
        }

        public Criteria andQ7GreaterThan(Integer value) {
            addCriterion("q7 >", value, "q7");
            return (Criteria) this;
        }

        public Criteria andQ7GreaterThanOrEqualTo(Integer value) {
            addCriterion("q7 >=", value, "q7");
            return (Criteria) this;
        }

        public Criteria andQ7LessThan(Integer value) {
            addCriterion("q7 <", value, "q7");
            return (Criteria) this;
        }

        public Criteria andQ7LessThanOrEqualTo(Integer value) {
            addCriterion("q7 <=", value, "q7");
            return (Criteria) this;
        }

        public Criteria andQ7In(List<Integer> values) {
            addCriterion("q7 in", values, "q7");
            return (Criteria) this;
        }

        public Criteria andQ7NotIn(List<Integer> values) {
            addCriterion("q7 not in", values, "q7");
            return (Criteria) this;
        }

        public Criteria andQ7Between(Integer value1, Integer value2) {
            addCriterion("q7 between", value1, value2, "q7");
            return (Criteria) this;
        }

        public Criteria andQ7NotBetween(Integer value1, Integer value2) {
            addCriterion("q7 not between", value1, value2, "q7");
            return (Criteria) this;
        }

        public Criteria andQ8IsNull() {
            addCriterion("q8 is null");
            return (Criteria) this;
        }

        public Criteria andQ8IsNotNull() {
            addCriterion("q8 is not null");
            return (Criteria) this;
        }

        public Criteria andQ8EqualTo(Integer value) {
            addCriterion("q8 =", value, "q8");
            return (Criteria) this;
        }

        public Criteria andQ8NotEqualTo(Integer value) {
            addCriterion("q8 <>", value, "q8");
            return (Criteria) this;
        }

        public Criteria andQ8GreaterThan(Integer value) {
            addCriterion("q8 >", value, "q8");
            return (Criteria) this;
        }

        public Criteria andQ8GreaterThanOrEqualTo(Integer value) {
            addCriterion("q8 >=", value, "q8");
            return (Criteria) this;
        }

        public Criteria andQ8LessThan(Integer value) {
            addCriterion("q8 <", value, "q8");
            return (Criteria) this;
        }

        public Criteria andQ8LessThanOrEqualTo(Integer value) {
            addCriterion("q8 <=", value, "q8");
            return (Criteria) this;
        }

        public Criteria andQ8In(List<Integer> values) {
            addCriterion("q8 in", values, "q8");
            return (Criteria) this;
        }

        public Criteria andQ8NotIn(List<Integer> values) {
            addCriterion("q8 not in", values, "q8");
            return (Criteria) this;
        }

        public Criteria andQ8Between(Integer value1, Integer value2) {
            addCriterion("q8 between", value1, value2, "q8");
            return (Criteria) this;
        }

        public Criteria andQ8NotBetween(Integer value1, Integer value2) {
            addCriterion("q8 not between", value1, value2, "q8");
            return (Criteria) this;
        }

        public Criteria andQ9IsNull() {
            addCriterion("q9 is null");
            return (Criteria) this;
        }

        public Criteria andQ9IsNotNull() {
            addCriterion("q9 is not null");
            return (Criteria) this;
        }

        public Criteria andQ9EqualTo(Integer value) {
            addCriterion("q9 =", value, "q9");
            return (Criteria) this;
        }

        public Criteria andQ9NotEqualTo(Integer value) {
            addCriterion("q9 <>", value, "q9");
            return (Criteria) this;
        }

        public Criteria andQ9GreaterThan(Integer value) {
            addCriterion("q9 >", value, "q9");
            return (Criteria) this;
        }

        public Criteria andQ9GreaterThanOrEqualTo(Integer value) {
            addCriterion("q9 >=", value, "q9");
            return (Criteria) this;
        }

        public Criteria andQ9LessThan(Integer value) {
            addCriterion("q9 <", value, "q9");
            return (Criteria) this;
        }

        public Criteria andQ9LessThanOrEqualTo(Integer value) {
            addCriterion("q9 <=", value, "q9");
            return (Criteria) this;
        }

        public Criteria andQ9In(List<Integer> values) {
            addCriterion("q9 in", values, "q9");
            return (Criteria) this;
        }

        public Criteria andQ9NotIn(List<Integer> values) {
            addCriterion("q9 not in", values, "q9");
            return (Criteria) this;
        }

        public Criteria andQ9Between(Integer value1, Integer value2) {
            addCriterion("q9 between", value1, value2, "q9");
            return (Criteria) this;
        }

        public Criteria andQ9NotBetween(Integer value1, Integer value2) {
            addCriterion("q9 not between", value1, value2, "q9");
            return (Criteria) this;
        }

        public Criteria andQ10IsNull() {
            addCriterion("q10 is null");
            return (Criteria) this;
        }

        public Criteria andQ10IsNotNull() {
            addCriterion("q10 is not null");
            return (Criteria) this;
        }

        public Criteria andQ10EqualTo(Integer value) {
            addCriterion("q10 =", value, "q10");
            return (Criteria) this;
        }

        public Criteria andQ10NotEqualTo(Integer value) {
            addCriterion("q10 <>", value, "q10");
            return (Criteria) this;
        }

        public Criteria andQ10GreaterThan(Integer value) {
            addCriterion("q10 >", value, "q10");
            return (Criteria) this;
        }

        public Criteria andQ10GreaterThanOrEqualTo(Integer value) {
            addCriterion("q10 >=", value, "q10");
            return (Criteria) this;
        }

        public Criteria andQ10LessThan(Integer value) {
            addCriterion("q10 <", value, "q10");
            return (Criteria) this;
        }

        public Criteria andQ10LessThanOrEqualTo(Integer value) {
            addCriterion("q10 <=", value, "q10");
            return (Criteria) this;
        }

        public Criteria andQ10In(List<Integer> values) {
            addCriterion("q10 in", values, "q10");
            return (Criteria) this;
        }

        public Criteria andQ10NotIn(List<Integer> values) {
            addCriterion("q10 not in", values, "q10");
            return (Criteria) this;
        }

        public Criteria andQ10Between(Integer value1, Integer value2) {
            addCriterion("q10 between", value1, value2, "q10");
            return (Criteria) this;
        }

        public Criteria andQ10NotBetween(Integer value1, Integer value2) {
            addCriterion("q10 not between", value1, value2, "q10");
            return (Criteria) this;
        }

        public Criteria andQ11IsNull() {
            addCriterion("q11 is null");
            return (Criteria) this;
        }

        public Criteria andQ11IsNotNull() {
            addCriterion("q11 is not null");
            return (Criteria) this;
        }

        public Criteria andQ11EqualTo(Integer value) {
            addCriterion("q11 =", value, "q11");
            return (Criteria) this;
        }

        public Criteria andQ11NotEqualTo(Integer value) {
            addCriterion("q11 <>", value, "q11");
            return (Criteria) this;
        }

        public Criteria andQ11GreaterThan(Integer value) {
            addCriterion("q11 >", value, "q11");
            return (Criteria) this;
        }

        public Criteria andQ11GreaterThanOrEqualTo(Integer value) {
            addCriterion("q11 >=", value, "q11");
            return (Criteria) this;
        }

        public Criteria andQ11LessThan(Integer value) {
            addCriterion("q11 <", value, "q11");
            return (Criteria) this;
        }

        public Criteria andQ11LessThanOrEqualTo(Integer value) {
            addCriterion("q11 <=", value, "q11");
            return (Criteria) this;
        }

        public Criteria andQ11In(List<Integer> values) {
            addCriterion("q11 in", values, "q11");
            return (Criteria) this;
        }

        public Criteria andQ11NotIn(List<Integer> values) {
            addCriterion("q11 not in", values, "q11");
            return (Criteria) this;
        }

        public Criteria andQ11Between(Integer value1, Integer value2) {
            addCriterion("q11 between", value1, value2, "q11");
            return (Criteria) this;
        }

        public Criteria andQ11NotBetween(Integer value1, Integer value2) {
            addCriterion("q11 not between", value1, value2, "q11");
            return (Criteria) this;
        }

        public Criteria andQ12IsNull() {
            addCriterion("q12 is null");
            return (Criteria) this;
        }

        public Criteria andQ12IsNotNull() {
            addCriterion("q12 is not null");
            return (Criteria) this;
        }

        public Criteria andQ12EqualTo(Integer value) {
            addCriterion("q12 =", value, "q12");
            return (Criteria) this;
        }

        public Criteria andQ12NotEqualTo(Integer value) {
            addCriterion("q12 <>", value, "q12");
            return (Criteria) this;
        }

        public Criteria andQ12GreaterThan(Integer value) {
            addCriterion("q12 >", value, "q12");
            return (Criteria) this;
        }

        public Criteria andQ12GreaterThanOrEqualTo(Integer value) {
            addCriterion("q12 >=", value, "q12");
            return (Criteria) this;
        }

        public Criteria andQ12LessThan(Integer value) {
            addCriterion("q12 <", value, "q12");
            return (Criteria) this;
        }

        public Criteria andQ12LessThanOrEqualTo(Integer value) {
            addCriterion("q12 <=", value, "q12");
            return (Criteria) this;
        }

        public Criteria andQ12In(List<Integer> values) {
            addCriterion("q12 in", values, "q12");
            return (Criteria) this;
        }

        public Criteria andQ12NotIn(List<Integer> values) {
            addCriterion("q12 not in", values, "q12");
            return (Criteria) this;
        }

        public Criteria andQ12Between(Integer value1, Integer value2) {
            addCriterion("q12 between", value1, value2, "q12");
            return (Criteria) this;
        }

        public Criteria andQ12NotBetween(Integer value1, Integer value2) {
            addCriterion("q12 not between", value1, value2, "q12");
            return (Criteria) this;
        }

        public Criteria andQ13IsNull() {
            addCriterion("q13 is null");
            return (Criteria) this;
        }

        public Criteria andQ13IsNotNull() {
            addCriterion("q13 is not null");
            return (Criteria) this;
        }

        public Criteria andQ13EqualTo(Integer value) {
            addCriterion("q13 =", value, "q13");
            return (Criteria) this;
        }

        public Criteria andQ13NotEqualTo(Integer value) {
            addCriterion("q13 <>", value, "q13");
            return (Criteria) this;
        }

        public Criteria andQ13GreaterThan(Integer value) {
            addCriterion("q13 >", value, "q13");
            return (Criteria) this;
        }

        public Criteria andQ13GreaterThanOrEqualTo(Integer value) {
            addCriterion("q13 >=", value, "q13");
            return (Criteria) this;
        }

        public Criteria andQ13LessThan(Integer value) {
            addCriterion("q13 <", value, "q13");
            return (Criteria) this;
        }

        public Criteria andQ13LessThanOrEqualTo(Integer value) {
            addCriterion("q13 <=", value, "q13");
            return (Criteria) this;
        }

        public Criteria andQ13In(List<Integer> values) {
            addCriterion("q13 in", values, "q13");
            return (Criteria) this;
        }

        public Criteria andQ13NotIn(List<Integer> values) {
            addCriterion("q13 not in", values, "q13");
            return (Criteria) this;
        }

        public Criteria andQ13Between(Integer value1, Integer value2) {
            addCriterion("q13 between", value1, value2, "q13");
            return (Criteria) this;
        }

        public Criteria andQ13NotBetween(Integer value1, Integer value2) {
            addCriterion("q13 not between", value1, value2, "q13");
            return (Criteria) this;
        }

        public Criteria andQ14IsNull() {
            addCriterion("q14 is null");
            return (Criteria) this;
        }

        public Criteria andQ14IsNotNull() {
            addCriterion("q14 is not null");
            return (Criteria) this;
        }

        public Criteria andQ14EqualTo(Integer value) {
            addCriterion("q14 =", value, "q14");
            return (Criteria) this;
        }

        public Criteria andQ14NotEqualTo(Integer value) {
            addCriterion("q14 <>", value, "q14");
            return (Criteria) this;
        }

        public Criteria andQ14GreaterThan(Integer value) {
            addCriterion("q14 >", value, "q14");
            return (Criteria) this;
        }

        public Criteria andQ14GreaterThanOrEqualTo(Integer value) {
            addCriterion("q14 >=", value, "q14");
            return (Criteria) this;
        }

        public Criteria andQ14LessThan(Integer value) {
            addCriterion("q14 <", value, "q14");
            return (Criteria) this;
        }

        public Criteria andQ14LessThanOrEqualTo(Integer value) {
            addCriterion("q14 <=", value, "q14");
            return (Criteria) this;
        }

        public Criteria andQ14In(List<Integer> values) {
            addCriterion("q14 in", values, "q14");
            return (Criteria) this;
        }

        public Criteria andQ14NotIn(List<Integer> values) {
            addCriterion("q14 not in", values, "q14");
            return (Criteria) this;
        }

        public Criteria andQ14Between(Integer value1, Integer value2) {
            addCriterion("q14 between", value1, value2, "q14");
            return (Criteria) this;
        }

        public Criteria andQ14NotBetween(Integer value1, Integer value2) {
            addCriterion("q14 not between", value1, value2, "q14");
            return (Criteria) this;
        }

        public Criteria andQ15IsNull() {
            addCriterion("q15 is null");
            return (Criteria) this;
        }

        public Criteria andQ15IsNotNull() {
            addCriterion("q15 is not null");
            return (Criteria) this;
        }

        public Criteria andQ15EqualTo(Integer value) {
            addCriterion("q15 =", value, "q15");
            return (Criteria) this;
        }

        public Criteria andQ15NotEqualTo(Integer value) {
            addCriterion("q15 <>", value, "q15");
            return (Criteria) this;
        }

        public Criteria andQ15GreaterThan(Integer value) {
            addCriterion("q15 >", value, "q15");
            return (Criteria) this;
        }

        public Criteria andQ15GreaterThanOrEqualTo(Integer value) {
            addCriterion("q15 >=", value, "q15");
            return (Criteria) this;
        }

        public Criteria andQ15LessThan(Integer value) {
            addCriterion("q15 <", value, "q15");
            return (Criteria) this;
        }

        public Criteria andQ15LessThanOrEqualTo(Integer value) {
            addCriterion("q15 <=", value, "q15");
            return (Criteria) this;
        }

        public Criteria andQ15In(List<Integer> values) {
            addCriterion("q15 in", values, "q15");
            return (Criteria) this;
        }

        public Criteria andQ15NotIn(List<Integer> values) {
            addCriterion("q15 not in", values, "q15");
            return (Criteria) this;
        }

        public Criteria andQ15Between(Integer value1, Integer value2) {
            addCriterion("q15 between", value1, value2, "q15");
            return (Criteria) this;
        }

        public Criteria andQ15NotBetween(Integer value1, Integer value2) {
            addCriterion("q15 not between", value1, value2, "q15");
            return (Criteria) this;
        }

        public Criteria andQ16IsNull() {
            addCriterion("q16 is null");
            return (Criteria) this;
        }

        public Criteria andQ16IsNotNull() {
            addCriterion("q16 is not null");
            return (Criteria) this;
        }

        public Criteria andQ16EqualTo(Integer value) {
            addCriterion("q16 =", value, "q16");
            return (Criteria) this;
        }

        public Criteria andQ16NotEqualTo(Integer value) {
            addCriterion("q16 <>", value, "q16");
            return (Criteria) this;
        }

        public Criteria andQ16GreaterThan(Integer value) {
            addCriterion("q16 >", value, "q16");
            return (Criteria) this;
        }

        public Criteria andQ16GreaterThanOrEqualTo(Integer value) {
            addCriterion("q16 >=", value, "q16");
            return (Criteria) this;
        }

        public Criteria andQ16LessThan(Integer value) {
            addCriterion("q16 <", value, "q16");
            return (Criteria) this;
        }

        public Criteria andQ16LessThanOrEqualTo(Integer value) {
            addCriterion("q16 <=", value, "q16");
            return (Criteria) this;
        }

        public Criteria andQ16In(List<Integer> values) {
            addCriterion("q16 in", values, "q16");
            return (Criteria) this;
        }

        public Criteria andQ16NotIn(List<Integer> values) {
            addCriterion("q16 not in", values, "q16");
            return (Criteria) this;
        }

        public Criteria andQ16Between(Integer value1, Integer value2) {
            addCriterion("q16 between", value1, value2, "q16");
            return (Criteria) this;
        }

        public Criteria andQ16NotBetween(Integer value1, Integer value2) {
            addCriterion("q16 not between", value1, value2, "q16");
            return (Criteria) this;
        }

        public Criteria andQ17IsNull() {
            addCriterion("q17 is null");
            return (Criteria) this;
        }

        public Criteria andQ17IsNotNull() {
            addCriterion("q17 is not null");
            return (Criteria) this;
        }

        public Criteria andQ17EqualTo(Integer value) {
            addCriterion("q17 =", value, "q17");
            return (Criteria) this;
        }

        public Criteria andQ17NotEqualTo(Integer value) {
            addCriterion("q17 <>", value, "q17");
            return (Criteria) this;
        }

        public Criteria andQ17GreaterThan(Integer value) {
            addCriterion("q17 >", value, "q17");
            return (Criteria) this;
        }

        public Criteria andQ17GreaterThanOrEqualTo(Integer value) {
            addCriterion("q17 >=", value, "q17");
            return (Criteria) this;
        }

        public Criteria andQ17LessThan(Integer value) {
            addCriterion("q17 <", value, "q17");
            return (Criteria) this;
        }

        public Criteria andQ17LessThanOrEqualTo(Integer value) {
            addCriterion("q17 <=", value, "q17");
            return (Criteria) this;
        }

        public Criteria andQ17In(List<Integer> values) {
            addCriterion("q17 in", values, "q17");
            return (Criteria) this;
        }

        public Criteria andQ17NotIn(List<Integer> values) {
            addCriterion("q17 not in", values, "q17");
            return (Criteria) this;
        }

        public Criteria andQ17Between(Integer value1, Integer value2) {
            addCriterion("q17 between", value1, value2, "q17");
            return (Criteria) this;
        }

        public Criteria andQ17NotBetween(Integer value1, Integer value2) {
            addCriterion("q17 not between", value1, value2, "q17");
            return (Criteria) this;
        }

        public Criteria andQ18IsNull() {
            addCriterion("q18 is null");
            return (Criteria) this;
        }

        public Criteria andQ18IsNotNull() {
            addCriterion("q18 is not null");
            return (Criteria) this;
        }

        public Criteria andQ18EqualTo(Integer value) {
            addCriterion("q18 =", value, "q18");
            return (Criteria) this;
        }

        public Criteria andQ18NotEqualTo(Integer value) {
            addCriterion("q18 <>", value, "q18");
            return (Criteria) this;
        }

        public Criteria andQ18GreaterThan(Integer value) {
            addCriterion("q18 >", value, "q18");
            return (Criteria) this;
        }

        public Criteria andQ18GreaterThanOrEqualTo(Integer value) {
            addCriterion("q18 >=", value, "q18");
            return (Criteria) this;
        }

        public Criteria andQ18LessThan(Integer value) {
            addCriterion("q18 <", value, "q18");
            return (Criteria) this;
        }

        public Criteria andQ18LessThanOrEqualTo(Integer value) {
            addCriterion("q18 <=", value, "q18");
            return (Criteria) this;
        }

        public Criteria andQ18In(List<Integer> values) {
            addCriterion("q18 in", values, "q18");
            return (Criteria) this;
        }

        public Criteria andQ18NotIn(List<Integer> values) {
            addCriterion("q18 not in", values, "q18");
            return (Criteria) this;
        }

        public Criteria andQ18Between(Integer value1, Integer value2) {
            addCriterion("q18 between", value1, value2, "q18");
            return (Criteria) this;
        }

        public Criteria andQ18NotBetween(Integer value1, Integer value2) {
            addCriterion("q18 not between", value1, value2, "q18");
            return (Criteria) this;
        }

        public Criteria andQ19IsNull() {
            addCriterion("q19 is null");
            return (Criteria) this;
        }

        public Criteria andQ19IsNotNull() {
            addCriterion("q19 is not null");
            return (Criteria) this;
        }

        public Criteria andQ19EqualTo(Integer value) {
            addCriterion("q19 =", value, "q19");
            return (Criteria) this;
        }

        public Criteria andQ19NotEqualTo(Integer value) {
            addCriterion("q19 <>", value, "q19");
            return (Criteria) this;
        }

        public Criteria andQ19GreaterThan(Integer value) {
            addCriterion("q19 >", value, "q19");
            return (Criteria) this;
        }

        public Criteria andQ19GreaterThanOrEqualTo(Integer value) {
            addCriterion("q19 >=", value, "q19");
            return (Criteria) this;
        }

        public Criteria andQ19LessThan(Integer value) {
            addCriterion("q19 <", value, "q19");
            return (Criteria) this;
        }

        public Criteria andQ19LessThanOrEqualTo(Integer value) {
            addCriterion("q19 <=", value, "q19");
            return (Criteria) this;
        }

        public Criteria andQ19In(List<Integer> values) {
            addCriterion("q19 in", values, "q19");
            return (Criteria) this;
        }

        public Criteria andQ19NotIn(List<Integer> values) {
            addCriterion("q19 not in", values, "q19");
            return (Criteria) this;
        }

        public Criteria andQ19Between(Integer value1, Integer value2) {
            addCriterion("q19 between", value1, value2, "q19");
            return (Criteria) this;
        }

        public Criteria andQ19NotBetween(Integer value1, Integer value2) {
            addCriterion("q19 not between", value1, value2, "q19");
            return (Criteria) this;
        }

        public Criteria andQ20IsNull() {
            addCriterion("q20 is null");
            return (Criteria) this;
        }

        public Criteria andQ20IsNotNull() {
            addCriterion("q20 is not null");
            return (Criteria) this;
        }

        public Criteria andQ20EqualTo(Integer value) {
            addCriterion("q20 =", value, "q20");
            return (Criteria) this;
        }

        public Criteria andQ20NotEqualTo(Integer value) {
            addCriterion("q20 <>", value, "q20");
            return (Criteria) this;
        }

        public Criteria andQ20GreaterThan(Integer value) {
            addCriterion("q20 >", value, "q20");
            return (Criteria) this;
        }

        public Criteria andQ20GreaterThanOrEqualTo(Integer value) {
            addCriterion("q20 >=", value, "q20");
            return (Criteria) this;
        }

        public Criteria andQ20LessThan(Integer value) {
            addCriterion("q20 <", value, "q20");
            return (Criteria) this;
        }

        public Criteria andQ20LessThanOrEqualTo(Integer value) {
            addCriterion("q20 <=", value, "q20");
            return (Criteria) this;
        }

        public Criteria andQ20In(List<Integer> values) {
            addCriterion("q20 in", values, "q20");
            return (Criteria) this;
        }

        public Criteria andQ20NotIn(List<Integer> values) {
            addCriterion("q20 not in", values, "q20");
            return (Criteria) this;
        }

        public Criteria andQ20Between(Integer value1, Integer value2) {
            addCriterion("q20 between", value1, value2, "q20");
            return (Criteria) this;
        }

        public Criteria andQ20NotBetween(Integer value1, Integer value2) {
            addCriterion("q20 not between", value1, value2, "q20");
            return (Criteria) this;
        }

        public Criteria andQ21IsNull() {
            addCriterion("q21 is null");
            return (Criteria) this;
        }

        public Criteria andQ21IsNotNull() {
            addCriterion("q21 is not null");
            return (Criteria) this;
        }

        public Criteria andQ21EqualTo(Integer value) {
            addCriterion("q21 =", value, "q21");
            return (Criteria) this;
        }

        public Criteria andQ21NotEqualTo(Integer value) {
            addCriterion("q21 <>", value, "q21");
            return (Criteria) this;
        }

        public Criteria andQ21GreaterThan(Integer value) {
            addCriterion("q21 >", value, "q21");
            return (Criteria) this;
        }

        public Criteria andQ21GreaterThanOrEqualTo(Integer value) {
            addCriterion("q21 >=", value, "q21");
            return (Criteria) this;
        }

        public Criteria andQ21LessThan(Integer value) {
            addCriterion("q21 <", value, "q21");
            return (Criteria) this;
        }

        public Criteria andQ21LessThanOrEqualTo(Integer value) {
            addCriterion("q21 <=", value, "q21");
            return (Criteria) this;
        }

        public Criteria andQ21In(List<Integer> values) {
            addCriterion("q21 in", values, "q21");
            return (Criteria) this;
        }

        public Criteria andQ21NotIn(List<Integer> values) {
            addCriterion("q21 not in", values, "q21");
            return (Criteria) this;
        }

        public Criteria andQ21Between(Integer value1, Integer value2) {
            addCriterion("q21 between", value1, value2, "q21");
            return (Criteria) this;
        }

        public Criteria andQ21NotBetween(Integer value1, Integer value2) {
            addCriterion("q21 not between", value1, value2, "q21");
            return (Criteria) this;
        }

        public Criteria andQ22IsNull() {
            addCriterion("q22 is null");
            return (Criteria) this;
        }

        public Criteria andQ22IsNotNull() {
            addCriterion("q22 is not null");
            return (Criteria) this;
        }

        public Criteria andQ22EqualTo(Integer value) {
            addCriterion("q22 =", value, "q22");
            return (Criteria) this;
        }

        public Criteria andQ22NotEqualTo(Integer value) {
            addCriterion("q22 <>", value, "q22");
            return (Criteria) this;
        }

        public Criteria andQ22GreaterThan(Integer value) {
            addCriterion("q22 >", value, "q22");
            return (Criteria) this;
        }

        public Criteria andQ22GreaterThanOrEqualTo(Integer value) {
            addCriterion("q22 >=", value, "q22");
            return (Criteria) this;
        }

        public Criteria andQ22LessThan(Integer value) {
            addCriterion("q22 <", value, "q22");
            return (Criteria) this;
        }

        public Criteria andQ22LessThanOrEqualTo(Integer value) {
            addCriterion("q22 <=", value, "q22");
            return (Criteria) this;
        }

        public Criteria andQ22In(List<Integer> values) {
            addCriterion("q22 in", values, "q22");
            return (Criteria) this;
        }

        public Criteria andQ22NotIn(List<Integer> values) {
            addCriterion("q22 not in", values, "q22");
            return (Criteria) this;
        }

        public Criteria andQ22Between(Integer value1, Integer value2) {
            addCriterion("q22 between", value1, value2, "q22");
            return (Criteria) this;
        }

        public Criteria andQ22NotBetween(Integer value1, Integer value2) {
            addCriterion("q22 not between", value1, value2, "q22");
            return (Criteria) this;
        }

        public Criteria andQ23IsNull() {
            addCriterion("q23 is null");
            return (Criteria) this;
        }

        public Criteria andQ23IsNotNull() {
            addCriterion("q23 is not null");
            return (Criteria) this;
        }

        public Criteria andQ23EqualTo(Integer value) {
            addCriterion("q23 =", value, "q23");
            return (Criteria) this;
        }

        public Criteria andQ23NotEqualTo(Integer value) {
            addCriterion("q23 <>", value, "q23");
            return (Criteria) this;
        }

        public Criteria andQ23GreaterThan(Integer value) {
            addCriterion("q23 >", value, "q23");
            return (Criteria) this;
        }

        public Criteria andQ23GreaterThanOrEqualTo(Integer value) {
            addCriterion("q23 >=", value, "q23");
            return (Criteria) this;
        }

        public Criteria andQ23LessThan(Integer value) {
            addCriterion("q23 <", value, "q23");
            return (Criteria) this;
        }

        public Criteria andQ23LessThanOrEqualTo(Integer value) {
            addCriterion("q23 <=", value, "q23");
            return (Criteria) this;
        }

        public Criteria andQ23In(List<Integer> values) {
            addCriterion("q23 in", values, "q23");
            return (Criteria) this;
        }

        public Criteria andQ23NotIn(List<Integer> values) {
            addCriterion("q23 not in", values, "q23");
            return (Criteria) this;
        }

        public Criteria andQ23Between(Integer value1, Integer value2) {
            addCriterion("q23 between", value1, value2, "q23");
            return (Criteria) this;
        }

        public Criteria andQ23NotBetween(Integer value1, Integer value2) {
            addCriterion("q23 not between", value1, value2, "q23");
            return (Criteria) this;
        }

        public Criteria andQ24IsNull() {
            addCriterion("q24 is null");
            return (Criteria) this;
        }

        public Criteria andQ24IsNotNull() {
            addCriterion("q24 is not null");
            return (Criteria) this;
        }

        public Criteria andQ24EqualTo(Integer value) {
            addCriterion("q24 =", value, "q24");
            return (Criteria) this;
        }

        public Criteria andQ24NotEqualTo(Integer value) {
            addCriterion("q24 <>", value, "q24");
            return (Criteria) this;
        }

        public Criteria andQ24GreaterThan(Integer value) {
            addCriterion("q24 >", value, "q24");
            return (Criteria) this;
        }

        public Criteria andQ24GreaterThanOrEqualTo(Integer value) {
            addCriterion("q24 >=", value, "q24");
            return (Criteria) this;
        }

        public Criteria andQ24LessThan(Integer value) {
            addCriterion("q24 <", value, "q24");
            return (Criteria) this;
        }

        public Criteria andQ24LessThanOrEqualTo(Integer value) {
            addCriterion("q24 <=", value, "q24");
            return (Criteria) this;
        }

        public Criteria andQ24In(List<Integer> values) {
            addCriterion("q24 in", values, "q24");
            return (Criteria) this;
        }

        public Criteria andQ24NotIn(List<Integer> values) {
            addCriterion("q24 not in", values, "q24");
            return (Criteria) this;
        }

        public Criteria andQ24Between(Integer value1, Integer value2) {
            addCriterion("q24 between", value1, value2, "q24");
            return (Criteria) this;
        }

        public Criteria andQ24NotBetween(Integer value1, Integer value2) {
            addCriterion("q24 not between", value1, value2, "q24");
            return (Criteria) this;
        }

        public Criteria andQ25IsNull() {
            addCriterion("q25 is null");
            return (Criteria) this;
        }

        public Criteria andQ25IsNotNull() {
            addCriterion("q25 is not null");
            return (Criteria) this;
        }

        public Criteria andQ25EqualTo(Integer value) {
            addCriterion("q25 =", value, "q25");
            return (Criteria) this;
        }

        public Criteria andQ25NotEqualTo(Integer value) {
            addCriterion("q25 <>", value, "q25");
            return (Criteria) this;
        }

        public Criteria andQ25GreaterThan(Integer value) {
            addCriterion("q25 >", value, "q25");
            return (Criteria) this;
        }

        public Criteria andQ25GreaterThanOrEqualTo(Integer value) {
            addCriterion("q25 >=", value, "q25");
            return (Criteria) this;
        }

        public Criteria andQ25LessThan(Integer value) {
            addCriterion("q25 <", value, "q25");
            return (Criteria) this;
        }

        public Criteria andQ25LessThanOrEqualTo(Integer value) {
            addCriterion("q25 <=", value, "q25");
            return (Criteria) this;
        }

        public Criteria andQ25In(List<Integer> values) {
            addCriterion("q25 in", values, "q25");
            return (Criteria) this;
        }

        public Criteria andQ25NotIn(List<Integer> values) {
            addCriterion("q25 not in", values, "q25");
            return (Criteria) this;
        }

        public Criteria andQ25Between(Integer value1, Integer value2) {
            addCriterion("q25 between", value1, value2, "q25");
            return (Criteria) this;
        }

        public Criteria andQ25NotBetween(Integer value1, Integer value2) {
            addCriterion("q25 not between", value1, value2, "q25");
            return (Criteria) this;
        }

        public Criteria andQ26IsNull() {
            addCriterion("q26 is null");
            return (Criteria) this;
        }

        public Criteria andQ26IsNotNull() {
            addCriterion("q26 is not null");
            return (Criteria) this;
        }

        public Criteria andQ26EqualTo(Integer value) {
            addCriterion("q26 =", value, "q26");
            return (Criteria) this;
        }

        public Criteria andQ26NotEqualTo(Integer value) {
            addCriterion("q26 <>", value, "q26");
            return (Criteria) this;
        }

        public Criteria andQ26GreaterThan(Integer value) {
            addCriterion("q26 >", value, "q26");
            return (Criteria) this;
        }

        public Criteria andQ26GreaterThanOrEqualTo(Integer value) {
            addCriterion("q26 >=", value, "q26");
            return (Criteria) this;
        }

        public Criteria andQ26LessThan(Integer value) {
            addCriterion("q26 <", value, "q26");
            return (Criteria) this;
        }

        public Criteria andQ26LessThanOrEqualTo(Integer value) {
            addCriterion("q26 <=", value, "q26");
            return (Criteria) this;
        }

        public Criteria andQ26In(List<Integer> values) {
            addCriterion("q26 in", values, "q26");
            return (Criteria) this;
        }

        public Criteria andQ26NotIn(List<Integer> values) {
            addCriterion("q26 not in", values, "q26");
            return (Criteria) this;
        }

        public Criteria andQ26Between(Integer value1, Integer value2) {
            addCriterion("q26 between", value1, value2, "q26");
            return (Criteria) this;
        }

        public Criteria andQ26NotBetween(Integer value1, Integer value2) {
            addCriterion("q26 not between", value1, value2, "q26");
            return (Criteria) this;
        }

        public Criteria andQ27IsNull() {
            addCriterion("q27 is null");
            return (Criteria) this;
        }

        public Criteria andQ27IsNotNull() {
            addCriterion("q27 is not null");
            return (Criteria) this;
        }

        public Criteria andQ27EqualTo(Integer value) {
            addCriterion("q27 =", value, "q27");
            return (Criteria) this;
        }

        public Criteria andQ27NotEqualTo(Integer value) {
            addCriterion("q27 <>", value, "q27");
            return (Criteria) this;
        }

        public Criteria andQ27GreaterThan(Integer value) {
            addCriterion("q27 >", value, "q27");
            return (Criteria) this;
        }

        public Criteria andQ27GreaterThanOrEqualTo(Integer value) {
            addCriterion("q27 >=", value, "q27");
            return (Criteria) this;
        }

        public Criteria andQ27LessThan(Integer value) {
            addCriterion("q27 <", value, "q27");
            return (Criteria) this;
        }

        public Criteria andQ27LessThanOrEqualTo(Integer value) {
            addCriterion("q27 <=", value, "q27");
            return (Criteria) this;
        }

        public Criteria andQ27In(List<Integer> values) {
            addCriterion("q27 in", values, "q27");
            return (Criteria) this;
        }

        public Criteria andQ27NotIn(List<Integer> values) {
            addCriterion("q27 not in", values, "q27");
            return (Criteria) this;
        }

        public Criteria andQ27Between(Integer value1, Integer value2) {
            addCriterion("q27 between", value1, value2, "q27");
            return (Criteria) this;
        }

        public Criteria andQ27NotBetween(Integer value1, Integer value2) {
            addCriterion("q27 not between", value1, value2, "q27");
            return (Criteria) this;
        }

        public Criteria andQ28IsNull() {
            addCriterion("q28 is null");
            return (Criteria) this;
        }

        public Criteria andQ28IsNotNull() {
            addCriterion("q28 is not null");
            return (Criteria) this;
        }

        public Criteria andQ28EqualTo(Integer value) {
            addCriterion("q28 =", value, "q28");
            return (Criteria) this;
        }

        public Criteria andQ28NotEqualTo(Integer value) {
            addCriterion("q28 <>", value, "q28");
            return (Criteria) this;
        }

        public Criteria andQ28GreaterThan(Integer value) {
            addCriterion("q28 >", value, "q28");
            return (Criteria) this;
        }

        public Criteria andQ28GreaterThanOrEqualTo(Integer value) {
            addCriterion("q28 >=", value, "q28");
            return (Criteria) this;
        }

        public Criteria andQ28LessThan(Integer value) {
            addCriterion("q28 <", value, "q28");
            return (Criteria) this;
        }

        public Criteria andQ28LessThanOrEqualTo(Integer value) {
            addCriterion("q28 <=", value, "q28");
            return (Criteria) this;
        }

        public Criteria andQ28In(List<Integer> values) {
            addCriterion("q28 in", values, "q28");
            return (Criteria) this;
        }

        public Criteria andQ28NotIn(List<Integer> values) {
            addCriterion("q28 not in", values, "q28");
            return (Criteria) this;
        }

        public Criteria andQ28Between(Integer value1, Integer value2) {
            addCriterion("q28 between", value1, value2, "q28");
            return (Criteria) this;
        }

        public Criteria andQ28NotBetween(Integer value1, Integer value2) {
            addCriterion("q28 not between", value1, value2, "q28");
            return (Criteria) this;
        }

        public Criteria andQ29IsNull() {
            addCriterion("q29 is null");
            return (Criteria) this;
        }

        public Criteria andQ29IsNotNull() {
            addCriterion("q29 is not null");
            return (Criteria) this;
        }

        public Criteria andQ29EqualTo(Integer value) {
            addCriterion("q29 =", value, "q29");
            return (Criteria) this;
        }

        public Criteria andQ29NotEqualTo(Integer value) {
            addCriterion("q29 <>", value, "q29");
            return (Criteria) this;
        }

        public Criteria andQ29GreaterThan(Integer value) {
            addCriterion("q29 >", value, "q29");
            return (Criteria) this;
        }

        public Criteria andQ29GreaterThanOrEqualTo(Integer value) {
            addCriterion("q29 >=", value, "q29");
            return (Criteria) this;
        }

        public Criteria andQ29LessThan(Integer value) {
            addCriterion("q29 <", value, "q29");
            return (Criteria) this;
        }

        public Criteria andQ29LessThanOrEqualTo(Integer value) {
            addCriterion("q29 <=", value, "q29");
            return (Criteria) this;
        }

        public Criteria andQ29In(List<Integer> values) {
            addCriterion("q29 in", values, "q29");
            return (Criteria) this;
        }

        public Criteria andQ29NotIn(List<Integer> values) {
            addCriterion("q29 not in", values, "q29");
            return (Criteria) this;
        }

        public Criteria andQ29Between(Integer value1, Integer value2) {
            addCriterion("q29 between", value1, value2, "q29");
            return (Criteria) this;
        }

        public Criteria andQ29NotBetween(Integer value1, Integer value2) {
            addCriterion("q29 not between", value1, value2, "q29");
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