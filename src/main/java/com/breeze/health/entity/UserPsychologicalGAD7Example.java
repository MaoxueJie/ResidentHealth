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

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Integer value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Integer value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Integer value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Integer value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Integer value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Integer> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Integer> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Integer value1, Integer value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("score not between", value1, value2, "score");
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