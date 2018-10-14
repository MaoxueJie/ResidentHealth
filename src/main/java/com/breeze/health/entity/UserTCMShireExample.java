package com.breeze.health.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserTCMShireExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserTCMShireExample() {
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

        public Criteria andShireQ1IsNull() {
            addCriterion("shire_q1 is null");
            return (Criteria) this;
        }

        public Criteria andShireQ1IsNotNull() {
            addCriterion("shire_q1 is not null");
            return (Criteria) this;
        }

        public Criteria andShireQ1EqualTo(Integer value) {
            addCriterion("shire_q1 =", value, "shireQ1");
            return (Criteria) this;
        }

        public Criteria andShireQ1NotEqualTo(Integer value) {
            addCriterion("shire_q1 <>", value, "shireQ1");
            return (Criteria) this;
        }

        public Criteria andShireQ1GreaterThan(Integer value) {
            addCriterion("shire_q1 >", value, "shireQ1");
            return (Criteria) this;
        }

        public Criteria andShireQ1GreaterThanOrEqualTo(Integer value) {
            addCriterion("shire_q1 >=", value, "shireQ1");
            return (Criteria) this;
        }

        public Criteria andShireQ1LessThan(Integer value) {
            addCriterion("shire_q1 <", value, "shireQ1");
            return (Criteria) this;
        }

        public Criteria andShireQ1LessThanOrEqualTo(Integer value) {
            addCriterion("shire_q1 <=", value, "shireQ1");
            return (Criteria) this;
        }

        public Criteria andShireQ1In(List<Integer> values) {
            addCriterion("shire_q1 in", values, "shireQ1");
            return (Criteria) this;
        }

        public Criteria andShireQ1NotIn(List<Integer> values) {
            addCriterion("shire_q1 not in", values, "shireQ1");
            return (Criteria) this;
        }

        public Criteria andShireQ1Between(Integer value1, Integer value2) {
            addCriterion("shire_q1 between", value1, value2, "shireQ1");
            return (Criteria) this;
        }

        public Criteria andShireQ1NotBetween(Integer value1, Integer value2) {
            addCriterion("shire_q1 not between", value1, value2, "shireQ1");
            return (Criteria) this;
        }

        public Criteria andShireQ2IsNull() {
            addCriterion("shire_q2 is null");
            return (Criteria) this;
        }

        public Criteria andShireQ2IsNotNull() {
            addCriterion("shire_q2 is not null");
            return (Criteria) this;
        }

        public Criteria andShireQ2EqualTo(Integer value) {
            addCriterion("shire_q2 =", value, "shireQ2");
            return (Criteria) this;
        }

        public Criteria andShireQ2NotEqualTo(Integer value) {
            addCriterion("shire_q2 <>", value, "shireQ2");
            return (Criteria) this;
        }

        public Criteria andShireQ2GreaterThan(Integer value) {
            addCriterion("shire_q2 >", value, "shireQ2");
            return (Criteria) this;
        }

        public Criteria andShireQ2GreaterThanOrEqualTo(Integer value) {
            addCriterion("shire_q2 >=", value, "shireQ2");
            return (Criteria) this;
        }

        public Criteria andShireQ2LessThan(Integer value) {
            addCriterion("shire_q2 <", value, "shireQ2");
            return (Criteria) this;
        }

        public Criteria andShireQ2LessThanOrEqualTo(Integer value) {
            addCriterion("shire_q2 <=", value, "shireQ2");
            return (Criteria) this;
        }

        public Criteria andShireQ2In(List<Integer> values) {
            addCriterion("shire_q2 in", values, "shireQ2");
            return (Criteria) this;
        }

        public Criteria andShireQ2NotIn(List<Integer> values) {
            addCriterion("shire_q2 not in", values, "shireQ2");
            return (Criteria) this;
        }

        public Criteria andShireQ2Between(Integer value1, Integer value2) {
            addCriterion("shire_q2 between", value1, value2, "shireQ2");
            return (Criteria) this;
        }

        public Criteria andShireQ2NotBetween(Integer value1, Integer value2) {
            addCriterion("shire_q2 not between", value1, value2, "shireQ2");
            return (Criteria) this;
        }

        public Criteria andShireQ3IsNull() {
            addCriterion("shire_q3 is null");
            return (Criteria) this;
        }

        public Criteria andShireQ3IsNotNull() {
            addCriterion("shire_q3 is not null");
            return (Criteria) this;
        }

        public Criteria andShireQ3EqualTo(Integer value) {
            addCriterion("shire_q3 =", value, "shireQ3");
            return (Criteria) this;
        }

        public Criteria andShireQ3NotEqualTo(Integer value) {
            addCriterion("shire_q3 <>", value, "shireQ3");
            return (Criteria) this;
        }

        public Criteria andShireQ3GreaterThan(Integer value) {
            addCriterion("shire_q3 >", value, "shireQ3");
            return (Criteria) this;
        }

        public Criteria andShireQ3GreaterThanOrEqualTo(Integer value) {
            addCriterion("shire_q3 >=", value, "shireQ3");
            return (Criteria) this;
        }

        public Criteria andShireQ3LessThan(Integer value) {
            addCriterion("shire_q3 <", value, "shireQ3");
            return (Criteria) this;
        }

        public Criteria andShireQ3LessThanOrEqualTo(Integer value) {
            addCriterion("shire_q3 <=", value, "shireQ3");
            return (Criteria) this;
        }

        public Criteria andShireQ3In(List<Integer> values) {
            addCriterion("shire_q3 in", values, "shireQ3");
            return (Criteria) this;
        }

        public Criteria andShireQ3NotIn(List<Integer> values) {
            addCriterion("shire_q3 not in", values, "shireQ3");
            return (Criteria) this;
        }

        public Criteria andShireQ3Between(Integer value1, Integer value2) {
            addCriterion("shire_q3 between", value1, value2, "shireQ3");
            return (Criteria) this;
        }

        public Criteria andShireQ3NotBetween(Integer value1, Integer value2) {
            addCriterion("shire_q3 not between", value1, value2, "shireQ3");
            return (Criteria) this;
        }

        public Criteria andShireQ4IsNull() {
            addCriterion("shire_q4 is null");
            return (Criteria) this;
        }

        public Criteria andShireQ4IsNotNull() {
            addCriterion("shire_q4 is not null");
            return (Criteria) this;
        }

        public Criteria andShireQ4EqualTo(Integer value) {
            addCriterion("shire_q4 =", value, "shireQ4");
            return (Criteria) this;
        }

        public Criteria andShireQ4NotEqualTo(Integer value) {
            addCriterion("shire_q4 <>", value, "shireQ4");
            return (Criteria) this;
        }

        public Criteria andShireQ4GreaterThan(Integer value) {
            addCriterion("shire_q4 >", value, "shireQ4");
            return (Criteria) this;
        }

        public Criteria andShireQ4GreaterThanOrEqualTo(Integer value) {
            addCriterion("shire_q4 >=", value, "shireQ4");
            return (Criteria) this;
        }

        public Criteria andShireQ4LessThan(Integer value) {
            addCriterion("shire_q4 <", value, "shireQ4");
            return (Criteria) this;
        }

        public Criteria andShireQ4LessThanOrEqualTo(Integer value) {
            addCriterion("shire_q4 <=", value, "shireQ4");
            return (Criteria) this;
        }

        public Criteria andShireQ4In(List<Integer> values) {
            addCriterion("shire_q4 in", values, "shireQ4");
            return (Criteria) this;
        }

        public Criteria andShireQ4NotIn(List<Integer> values) {
            addCriterion("shire_q4 not in", values, "shireQ4");
            return (Criteria) this;
        }

        public Criteria andShireQ4Between(Integer value1, Integer value2) {
            addCriterion("shire_q4 between", value1, value2, "shireQ4");
            return (Criteria) this;
        }

        public Criteria andShireQ4NotBetween(Integer value1, Integer value2) {
            addCriterion("shire_q4 not between", value1, value2, "shireQ4");
            return (Criteria) this;
        }

        public Criteria andShireQ5IsNull() {
            addCriterion("shire_q5 is null");
            return (Criteria) this;
        }

        public Criteria andShireQ5IsNotNull() {
            addCriterion("shire_q5 is not null");
            return (Criteria) this;
        }

        public Criteria andShireQ5EqualTo(Integer value) {
            addCriterion("shire_q5 =", value, "shireQ5");
            return (Criteria) this;
        }

        public Criteria andShireQ5NotEqualTo(Integer value) {
            addCriterion("shire_q5 <>", value, "shireQ5");
            return (Criteria) this;
        }

        public Criteria andShireQ5GreaterThan(Integer value) {
            addCriterion("shire_q5 >", value, "shireQ5");
            return (Criteria) this;
        }

        public Criteria andShireQ5GreaterThanOrEqualTo(Integer value) {
            addCriterion("shire_q5 >=", value, "shireQ5");
            return (Criteria) this;
        }

        public Criteria andShireQ5LessThan(Integer value) {
            addCriterion("shire_q5 <", value, "shireQ5");
            return (Criteria) this;
        }

        public Criteria andShireQ5LessThanOrEqualTo(Integer value) {
            addCriterion("shire_q5 <=", value, "shireQ5");
            return (Criteria) this;
        }

        public Criteria andShireQ5In(List<Integer> values) {
            addCriterion("shire_q5 in", values, "shireQ5");
            return (Criteria) this;
        }

        public Criteria andShireQ5NotIn(List<Integer> values) {
            addCriterion("shire_q5 not in", values, "shireQ5");
            return (Criteria) this;
        }

        public Criteria andShireQ5Between(Integer value1, Integer value2) {
            addCriterion("shire_q5 between", value1, value2, "shireQ5");
            return (Criteria) this;
        }

        public Criteria andShireQ5NotBetween(Integer value1, Integer value2) {
            addCriterion("shire_q5 not between", value1, value2, "shireQ5");
            return (Criteria) this;
        }

        public Criteria andShireQ6IsNull() {
            addCriterion("shire_q6 is null");
            return (Criteria) this;
        }

        public Criteria andShireQ6IsNotNull() {
            addCriterion("shire_q6 is not null");
            return (Criteria) this;
        }

        public Criteria andShireQ6EqualTo(Integer value) {
            addCriterion("shire_q6 =", value, "shireQ6");
            return (Criteria) this;
        }

        public Criteria andShireQ6NotEqualTo(Integer value) {
            addCriterion("shire_q6 <>", value, "shireQ6");
            return (Criteria) this;
        }

        public Criteria andShireQ6GreaterThan(Integer value) {
            addCriterion("shire_q6 >", value, "shireQ6");
            return (Criteria) this;
        }

        public Criteria andShireQ6GreaterThanOrEqualTo(Integer value) {
            addCriterion("shire_q6 >=", value, "shireQ6");
            return (Criteria) this;
        }

        public Criteria andShireQ6LessThan(Integer value) {
            addCriterion("shire_q6 <", value, "shireQ6");
            return (Criteria) this;
        }

        public Criteria andShireQ6LessThanOrEqualTo(Integer value) {
            addCriterion("shire_q6 <=", value, "shireQ6");
            return (Criteria) this;
        }

        public Criteria andShireQ6In(List<Integer> values) {
            addCriterion("shire_q6 in", values, "shireQ6");
            return (Criteria) this;
        }

        public Criteria andShireQ6NotIn(List<Integer> values) {
            addCriterion("shire_q6 not in", values, "shireQ6");
            return (Criteria) this;
        }

        public Criteria andShireQ6Between(Integer value1, Integer value2) {
            addCriterion("shire_q6 between", value1, value2, "shireQ6");
            return (Criteria) this;
        }

        public Criteria andShireQ6NotBetween(Integer value1, Integer value2) {
            addCriterion("shire_q6 not between", value1, value2, "shireQ6");
            return (Criteria) this;
        }

        public Criteria andShireQ7IsNull() {
            addCriterion("shire_q7 is null");
            return (Criteria) this;
        }

        public Criteria andShireQ7IsNotNull() {
            addCriterion("shire_q7 is not null");
            return (Criteria) this;
        }

        public Criteria andShireQ7EqualTo(Integer value) {
            addCriterion("shire_q7 =", value, "shireQ7");
            return (Criteria) this;
        }

        public Criteria andShireQ7NotEqualTo(Integer value) {
            addCriterion("shire_q7 <>", value, "shireQ7");
            return (Criteria) this;
        }

        public Criteria andShireQ7GreaterThan(Integer value) {
            addCriterion("shire_q7 >", value, "shireQ7");
            return (Criteria) this;
        }

        public Criteria andShireQ7GreaterThanOrEqualTo(Integer value) {
            addCriterion("shire_q7 >=", value, "shireQ7");
            return (Criteria) this;
        }

        public Criteria andShireQ7LessThan(Integer value) {
            addCriterion("shire_q7 <", value, "shireQ7");
            return (Criteria) this;
        }

        public Criteria andShireQ7LessThanOrEqualTo(Integer value) {
            addCriterion("shire_q7 <=", value, "shireQ7");
            return (Criteria) this;
        }

        public Criteria andShireQ7In(List<Integer> values) {
            addCriterion("shire_q7 in", values, "shireQ7");
            return (Criteria) this;
        }

        public Criteria andShireQ7NotIn(List<Integer> values) {
            addCriterion("shire_q7 not in", values, "shireQ7");
            return (Criteria) this;
        }

        public Criteria andShireQ7Between(Integer value1, Integer value2) {
            addCriterion("shire_q7 between", value1, value2, "shireQ7");
            return (Criteria) this;
        }

        public Criteria andShireQ7NotBetween(Integer value1, Integer value2) {
            addCriterion("shire_q7 not between", value1, value2, "shireQ7");
            return (Criteria) this;
        }

        public Criteria andShireScoreIsNull() {
            addCriterion("shire_score is null");
            return (Criteria) this;
        }

        public Criteria andShireScoreIsNotNull() {
            addCriterion("shire_score is not null");
            return (Criteria) this;
        }

        public Criteria andShireScoreEqualTo(Integer value) {
            addCriterion("shire_score =", value, "shireScore");
            return (Criteria) this;
        }

        public Criteria andShireScoreNotEqualTo(Integer value) {
            addCriterion("shire_score <>", value, "shireScore");
            return (Criteria) this;
        }

        public Criteria andShireScoreGreaterThan(Integer value) {
            addCriterion("shire_score >", value, "shireScore");
            return (Criteria) this;
        }

        public Criteria andShireScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("shire_score >=", value, "shireScore");
            return (Criteria) this;
        }

        public Criteria andShireScoreLessThan(Integer value) {
            addCriterion("shire_score <", value, "shireScore");
            return (Criteria) this;
        }

        public Criteria andShireScoreLessThanOrEqualTo(Integer value) {
            addCriterion("shire_score <=", value, "shireScore");
            return (Criteria) this;
        }

        public Criteria andShireScoreIn(List<Integer> values) {
            addCriterion("shire_score in", values, "shireScore");
            return (Criteria) this;
        }

        public Criteria andShireScoreNotIn(List<Integer> values) {
            addCriterion("shire_score not in", values, "shireScore");
            return (Criteria) this;
        }

        public Criteria andShireScoreBetween(Integer value1, Integer value2) {
            addCriterion("shire_score between", value1, value2, "shireScore");
            return (Criteria) this;
        }

        public Criteria andShireScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("shire_score not between", value1, value2, "shireScore");
            return (Criteria) this;
        }

        public Criteria andShireResultIsNull() {
            addCriterion("shire_result is null");
            return (Criteria) this;
        }

        public Criteria andShireResultIsNotNull() {
            addCriterion("shire_result is not null");
            return (Criteria) this;
        }

        public Criteria andShireResultEqualTo(Integer value) {
            addCriterion("shire_result =", value, "shireResult");
            return (Criteria) this;
        }

        public Criteria andShireResultNotEqualTo(Integer value) {
            addCriterion("shire_result <>", value, "shireResult");
            return (Criteria) this;
        }

        public Criteria andShireResultGreaterThan(Integer value) {
            addCriterion("shire_result >", value, "shireResult");
            return (Criteria) this;
        }

        public Criteria andShireResultGreaterThanOrEqualTo(Integer value) {
            addCriterion("shire_result >=", value, "shireResult");
            return (Criteria) this;
        }

        public Criteria andShireResultLessThan(Integer value) {
            addCriterion("shire_result <", value, "shireResult");
            return (Criteria) this;
        }

        public Criteria andShireResultLessThanOrEqualTo(Integer value) {
            addCriterion("shire_result <=", value, "shireResult");
            return (Criteria) this;
        }

        public Criteria andShireResultIn(List<Integer> values) {
            addCriterion("shire_result in", values, "shireResult");
            return (Criteria) this;
        }

        public Criteria andShireResultNotIn(List<Integer> values) {
            addCriterion("shire_result not in", values, "shireResult");
            return (Criteria) this;
        }

        public Criteria andShireResultBetween(Integer value1, Integer value2) {
            addCriterion("shire_result between", value1, value2, "shireResult");
            return (Criteria) this;
        }

        public Criteria andShireResultNotBetween(Integer value1, Integer value2) {
            addCriterion("shire_result not between", value1, value2, "shireResult");
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