package com.breeze.health.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserTCMQiyuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserTCMQiyuExample() {
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

        public Criteria andQiyuQ1IsNull() {
            addCriterion("qiyu_q1 is null");
            return (Criteria) this;
        }

        public Criteria andQiyuQ1IsNotNull() {
            addCriterion("qiyu_q1 is not null");
            return (Criteria) this;
        }

        public Criteria andQiyuQ1EqualTo(Integer value) {
            addCriterion("qiyu_q1 =", value, "qiyuQ1");
            return (Criteria) this;
        }

        public Criteria andQiyuQ1NotEqualTo(Integer value) {
            addCriterion("qiyu_q1 <>", value, "qiyuQ1");
            return (Criteria) this;
        }

        public Criteria andQiyuQ1GreaterThan(Integer value) {
            addCriterion("qiyu_q1 >", value, "qiyuQ1");
            return (Criteria) this;
        }

        public Criteria andQiyuQ1GreaterThanOrEqualTo(Integer value) {
            addCriterion("qiyu_q1 >=", value, "qiyuQ1");
            return (Criteria) this;
        }

        public Criteria andQiyuQ1LessThan(Integer value) {
            addCriterion("qiyu_q1 <", value, "qiyuQ1");
            return (Criteria) this;
        }

        public Criteria andQiyuQ1LessThanOrEqualTo(Integer value) {
            addCriterion("qiyu_q1 <=", value, "qiyuQ1");
            return (Criteria) this;
        }

        public Criteria andQiyuQ1In(List<Integer> values) {
            addCriterion("qiyu_q1 in", values, "qiyuQ1");
            return (Criteria) this;
        }

        public Criteria andQiyuQ1NotIn(List<Integer> values) {
            addCriterion("qiyu_q1 not in", values, "qiyuQ1");
            return (Criteria) this;
        }

        public Criteria andQiyuQ1Between(Integer value1, Integer value2) {
            addCriterion("qiyu_q1 between", value1, value2, "qiyuQ1");
            return (Criteria) this;
        }

        public Criteria andQiyuQ1NotBetween(Integer value1, Integer value2) {
            addCriterion("qiyu_q1 not between", value1, value2, "qiyuQ1");
            return (Criteria) this;
        }

        public Criteria andQiyuQ2IsNull() {
            addCriterion("qiyu_q2 is null");
            return (Criteria) this;
        }

        public Criteria andQiyuQ2IsNotNull() {
            addCriterion("qiyu_q2 is not null");
            return (Criteria) this;
        }

        public Criteria andQiyuQ2EqualTo(Integer value) {
            addCriterion("qiyu_q2 =", value, "qiyuQ2");
            return (Criteria) this;
        }

        public Criteria andQiyuQ2NotEqualTo(Integer value) {
            addCriterion("qiyu_q2 <>", value, "qiyuQ2");
            return (Criteria) this;
        }

        public Criteria andQiyuQ2GreaterThan(Integer value) {
            addCriterion("qiyu_q2 >", value, "qiyuQ2");
            return (Criteria) this;
        }

        public Criteria andQiyuQ2GreaterThanOrEqualTo(Integer value) {
            addCriterion("qiyu_q2 >=", value, "qiyuQ2");
            return (Criteria) this;
        }

        public Criteria andQiyuQ2LessThan(Integer value) {
            addCriterion("qiyu_q2 <", value, "qiyuQ2");
            return (Criteria) this;
        }

        public Criteria andQiyuQ2LessThanOrEqualTo(Integer value) {
            addCriterion("qiyu_q2 <=", value, "qiyuQ2");
            return (Criteria) this;
        }

        public Criteria andQiyuQ2In(List<Integer> values) {
            addCriterion("qiyu_q2 in", values, "qiyuQ2");
            return (Criteria) this;
        }

        public Criteria andQiyuQ2NotIn(List<Integer> values) {
            addCriterion("qiyu_q2 not in", values, "qiyuQ2");
            return (Criteria) this;
        }

        public Criteria andQiyuQ2Between(Integer value1, Integer value2) {
            addCriterion("qiyu_q2 between", value1, value2, "qiyuQ2");
            return (Criteria) this;
        }

        public Criteria andQiyuQ2NotBetween(Integer value1, Integer value2) {
            addCriterion("qiyu_q2 not between", value1, value2, "qiyuQ2");
            return (Criteria) this;
        }

        public Criteria andQiyuQ3IsNull() {
            addCriterion("qiyu_q3 is null");
            return (Criteria) this;
        }

        public Criteria andQiyuQ3IsNotNull() {
            addCriterion("qiyu_q3 is not null");
            return (Criteria) this;
        }

        public Criteria andQiyuQ3EqualTo(Integer value) {
            addCriterion("qiyu_q3 =", value, "qiyuQ3");
            return (Criteria) this;
        }

        public Criteria andQiyuQ3NotEqualTo(Integer value) {
            addCriterion("qiyu_q3 <>", value, "qiyuQ3");
            return (Criteria) this;
        }

        public Criteria andQiyuQ3GreaterThan(Integer value) {
            addCriterion("qiyu_q3 >", value, "qiyuQ3");
            return (Criteria) this;
        }

        public Criteria andQiyuQ3GreaterThanOrEqualTo(Integer value) {
            addCriterion("qiyu_q3 >=", value, "qiyuQ3");
            return (Criteria) this;
        }

        public Criteria andQiyuQ3LessThan(Integer value) {
            addCriterion("qiyu_q3 <", value, "qiyuQ3");
            return (Criteria) this;
        }

        public Criteria andQiyuQ3LessThanOrEqualTo(Integer value) {
            addCriterion("qiyu_q3 <=", value, "qiyuQ3");
            return (Criteria) this;
        }

        public Criteria andQiyuQ3In(List<Integer> values) {
            addCriterion("qiyu_q3 in", values, "qiyuQ3");
            return (Criteria) this;
        }

        public Criteria andQiyuQ3NotIn(List<Integer> values) {
            addCriterion("qiyu_q3 not in", values, "qiyuQ3");
            return (Criteria) this;
        }

        public Criteria andQiyuQ3Between(Integer value1, Integer value2) {
            addCriterion("qiyu_q3 between", value1, value2, "qiyuQ3");
            return (Criteria) this;
        }

        public Criteria andQiyuQ3NotBetween(Integer value1, Integer value2) {
            addCriterion("qiyu_q3 not between", value1, value2, "qiyuQ3");
            return (Criteria) this;
        }

        public Criteria andQiyuQ4IsNull() {
            addCriterion("qiyu_q4 is null");
            return (Criteria) this;
        }

        public Criteria andQiyuQ4IsNotNull() {
            addCriterion("qiyu_q4 is not null");
            return (Criteria) this;
        }

        public Criteria andQiyuQ4EqualTo(Integer value) {
            addCriterion("qiyu_q4 =", value, "qiyuQ4");
            return (Criteria) this;
        }

        public Criteria andQiyuQ4NotEqualTo(Integer value) {
            addCriterion("qiyu_q4 <>", value, "qiyuQ4");
            return (Criteria) this;
        }

        public Criteria andQiyuQ4GreaterThan(Integer value) {
            addCriterion("qiyu_q4 >", value, "qiyuQ4");
            return (Criteria) this;
        }

        public Criteria andQiyuQ4GreaterThanOrEqualTo(Integer value) {
            addCriterion("qiyu_q4 >=", value, "qiyuQ4");
            return (Criteria) this;
        }

        public Criteria andQiyuQ4LessThan(Integer value) {
            addCriterion("qiyu_q4 <", value, "qiyuQ4");
            return (Criteria) this;
        }

        public Criteria andQiyuQ4LessThanOrEqualTo(Integer value) {
            addCriterion("qiyu_q4 <=", value, "qiyuQ4");
            return (Criteria) this;
        }

        public Criteria andQiyuQ4In(List<Integer> values) {
            addCriterion("qiyu_q4 in", values, "qiyuQ4");
            return (Criteria) this;
        }

        public Criteria andQiyuQ4NotIn(List<Integer> values) {
            addCriterion("qiyu_q4 not in", values, "qiyuQ4");
            return (Criteria) this;
        }

        public Criteria andQiyuQ4Between(Integer value1, Integer value2) {
            addCriterion("qiyu_q4 between", value1, value2, "qiyuQ4");
            return (Criteria) this;
        }

        public Criteria andQiyuQ4NotBetween(Integer value1, Integer value2) {
            addCriterion("qiyu_q4 not between", value1, value2, "qiyuQ4");
            return (Criteria) this;
        }

        public Criteria andQiyuQ5IsNull() {
            addCriterion("qiyu_q5 is null");
            return (Criteria) this;
        }

        public Criteria andQiyuQ5IsNotNull() {
            addCriterion("qiyu_q5 is not null");
            return (Criteria) this;
        }

        public Criteria andQiyuQ5EqualTo(Integer value) {
            addCriterion("qiyu_q5 =", value, "qiyuQ5");
            return (Criteria) this;
        }

        public Criteria andQiyuQ5NotEqualTo(Integer value) {
            addCriterion("qiyu_q5 <>", value, "qiyuQ5");
            return (Criteria) this;
        }

        public Criteria andQiyuQ5GreaterThan(Integer value) {
            addCriterion("qiyu_q5 >", value, "qiyuQ5");
            return (Criteria) this;
        }

        public Criteria andQiyuQ5GreaterThanOrEqualTo(Integer value) {
            addCriterion("qiyu_q5 >=", value, "qiyuQ5");
            return (Criteria) this;
        }

        public Criteria andQiyuQ5LessThan(Integer value) {
            addCriterion("qiyu_q5 <", value, "qiyuQ5");
            return (Criteria) this;
        }

        public Criteria andQiyuQ5LessThanOrEqualTo(Integer value) {
            addCriterion("qiyu_q5 <=", value, "qiyuQ5");
            return (Criteria) this;
        }

        public Criteria andQiyuQ5In(List<Integer> values) {
            addCriterion("qiyu_q5 in", values, "qiyuQ5");
            return (Criteria) this;
        }

        public Criteria andQiyuQ5NotIn(List<Integer> values) {
            addCriterion("qiyu_q5 not in", values, "qiyuQ5");
            return (Criteria) this;
        }

        public Criteria andQiyuQ5Between(Integer value1, Integer value2) {
            addCriterion("qiyu_q5 between", value1, value2, "qiyuQ5");
            return (Criteria) this;
        }

        public Criteria andQiyuQ5NotBetween(Integer value1, Integer value2) {
            addCriterion("qiyu_q5 not between", value1, value2, "qiyuQ5");
            return (Criteria) this;
        }

        public Criteria andQiyuQ6IsNull() {
            addCriterion("qiyu_q6 is null");
            return (Criteria) this;
        }

        public Criteria andQiyuQ6IsNotNull() {
            addCriterion("qiyu_q6 is not null");
            return (Criteria) this;
        }

        public Criteria andQiyuQ6EqualTo(Integer value) {
            addCriterion("qiyu_q6 =", value, "qiyuQ6");
            return (Criteria) this;
        }

        public Criteria andQiyuQ6NotEqualTo(Integer value) {
            addCriterion("qiyu_q6 <>", value, "qiyuQ6");
            return (Criteria) this;
        }

        public Criteria andQiyuQ6GreaterThan(Integer value) {
            addCriterion("qiyu_q6 >", value, "qiyuQ6");
            return (Criteria) this;
        }

        public Criteria andQiyuQ6GreaterThanOrEqualTo(Integer value) {
            addCriterion("qiyu_q6 >=", value, "qiyuQ6");
            return (Criteria) this;
        }

        public Criteria andQiyuQ6LessThan(Integer value) {
            addCriterion("qiyu_q6 <", value, "qiyuQ6");
            return (Criteria) this;
        }

        public Criteria andQiyuQ6LessThanOrEqualTo(Integer value) {
            addCriterion("qiyu_q6 <=", value, "qiyuQ6");
            return (Criteria) this;
        }

        public Criteria andQiyuQ6In(List<Integer> values) {
            addCriterion("qiyu_q6 in", values, "qiyuQ6");
            return (Criteria) this;
        }

        public Criteria andQiyuQ6NotIn(List<Integer> values) {
            addCriterion("qiyu_q6 not in", values, "qiyuQ6");
            return (Criteria) this;
        }

        public Criteria andQiyuQ6Between(Integer value1, Integer value2) {
            addCriterion("qiyu_q6 between", value1, value2, "qiyuQ6");
            return (Criteria) this;
        }

        public Criteria andQiyuQ6NotBetween(Integer value1, Integer value2) {
            addCriterion("qiyu_q6 not between", value1, value2, "qiyuQ6");
            return (Criteria) this;
        }

        public Criteria andQiyuQ7IsNull() {
            addCriterion("qiyu_q7 is null");
            return (Criteria) this;
        }

        public Criteria andQiyuQ7IsNotNull() {
            addCriterion("qiyu_q7 is not null");
            return (Criteria) this;
        }

        public Criteria andQiyuQ7EqualTo(Integer value) {
            addCriterion("qiyu_q7 =", value, "qiyuQ7");
            return (Criteria) this;
        }

        public Criteria andQiyuQ7NotEqualTo(Integer value) {
            addCriterion("qiyu_q7 <>", value, "qiyuQ7");
            return (Criteria) this;
        }

        public Criteria andQiyuQ7GreaterThan(Integer value) {
            addCriterion("qiyu_q7 >", value, "qiyuQ7");
            return (Criteria) this;
        }

        public Criteria andQiyuQ7GreaterThanOrEqualTo(Integer value) {
            addCriterion("qiyu_q7 >=", value, "qiyuQ7");
            return (Criteria) this;
        }

        public Criteria andQiyuQ7LessThan(Integer value) {
            addCriterion("qiyu_q7 <", value, "qiyuQ7");
            return (Criteria) this;
        }

        public Criteria andQiyuQ7LessThanOrEqualTo(Integer value) {
            addCriterion("qiyu_q7 <=", value, "qiyuQ7");
            return (Criteria) this;
        }

        public Criteria andQiyuQ7In(List<Integer> values) {
            addCriterion("qiyu_q7 in", values, "qiyuQ7");
            return (Criteria) this;
        }

        public Criteria andQiyuQ7NotIn(List<Integer> values) {
            addCriterion("qiyu_q7 not in", values, "qiyuQ7");
            return (Criteria) this;
        }

        public Criteria andQiyuQ7Between(Integer value1, Integer value2) {
            addCriterion("qiyu_q7 between", value1, value2, "qiyuQ7");
            return (Criteria) this;
        }

        public Criteria andQiyuQ7NotBetween(Integer value1, Integer value2) {
            addCriterion("qiyu_q7 not between", value1, value2, "qiyuQ7");
            return (Criteria) this;
        }

        public Criteria andQiyuScoreIsNull() {
            addCriterion("qiyu_score is null");
            return (Criteria) this;
        }

        public Criteria andQiyuScoreIsNotNull() {
            addCriterion("qiyu_score is not null");
            return (Criteria) this;
        }

        public Criteria andQiyuScoreEqualTo(Integer value) {
            addCriterion("qiyu_score =", value, "qiyuScore");
            return (Criteria) this;
        }

        public Criteria andQiyuScoreNotEqualTo(Integer value) {
            addCriterion("qiyu_score <>", value, "qiyuScore");
            return (Criteria) this;
        }

        public Criteria andQiyuScoreGreaterThan(Integer value) {
            addCriterion("qiyu_score >", value, "qiyuScore");
            return (Criteria) this;
        }

        public Criteria andQiyuScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("qiyu_score >=", value, "qiyuScore");
            return (Criteria) this;
        }

        public Criteria andQiyuScoreLessThan(Integer value) {
            addCriterion("qiyu_score <", value, "qiyuScore");
            return (Criteria) this;
        }

        public Criteria andQiyuScoreLessThanOrEqualTo(Integer value) {
            addCriterion("qiyu_score <=", value, "qiyuScore");
            return (Criteria) this;
        }

        public Criteria andQiyuScoreIn(List<Integer> values) {
            addCriterion("qiyu_score in", values, "qiyuScore");
            return (Criteria) this;
        }

        public Criteria andQiyuScoreNotIn(List<Integer> values) {
            addCriterion("qiyu_score not in", values, "qiyuScore");
            return (Criteria) this;
        }

        public Criteria andQiyuScoreBetween(Integer value1, Integer value2) {
            addCriterion("qiyu_score between", value1, value2, "qiyuScore");
            return (Criteria) this;
        }

        public Criteria andQiyuScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("qiyu_score not between", value1, value2, "qiyuScore");
            return (Criteria) this;
        }

        public Criteria andQiyuResultIsNull() {
            addCriterion("qiyu_result is null");
            return (Criteria) this;
        }

        public Criteria andQiyuResultIsNotNull() {
            addCriterion("qiyu_result is not null");
            return (Criteria) this;
        }

        public Criteria andQiyuResultEqualTo(String value) {
            addCriterion("qiyu_result =", value, "qiyuResult");
            return (Criteria) this;
        }

        public Criteria andQiyuResultNotEqualTo(String value) {
            addCriterion("qiyu_result <>", value, "qiyuResult");
            return (Criteria) this;
        }

        public Criteria andQiyuResultGreaterThan(String value) {
            addCriterion("qiyu_result >", value, "qiyuResult");
            return (Criteria) this;
        }

        public Criteria andQiyuResultGreaterThanOrEqualTo(String value) {
            addCriterion("qiyu_result >=", value, "qiyuResult");
            return (Criteria) this;
        }

        public Criteria andQiyuResultLessThan(String value) {
            addCriterion("qiyu_result <", value, "qiyuResult");
            return (Criteria) this;
        }

        public Criteria andQiyuResultLessThanOrEqualTo(String value) {
            addCriterion("qiyu_result <=", value, "qiyuResult");
            return (Criteria) this;
        }

        public Criteria andQiyuResultLike(String value) {
            addCriterion("qiyu_result like", value, "qiyuResult");
            return (Criteria) this;
        }

        public Criteria andQiyuResultNotLike(String value) {
            addCriterion("qiyu_result not like", value, "qiyuResult");
            return (Criteria) this;
        }

        public Criteria andQiyuResultIn(List<String> values) {
            addCriterion("qiyu_result in", values, "qiyuResult");
            return (Criteria) this;
        }

        public Criteria andQiyuResultNotIn(List<String> values) {
            addCriterion("qiyu_result not in", values, "qiyuResult");
            return (Criteria) this;
        }

        public Criteria andQiyuResultBetween(String value1, String value2) {
            addCriterion("qiyu_result between", value1, value2, "qiyuResult");
            return (Criteria) this;
        }

        public Criteria andQiyuResultNotBetween(String value1, String value2) {
            addCriterion("qiyu_result not between", value1, value2, "qiyuResult");
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