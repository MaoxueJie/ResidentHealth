package com.breeze.health.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserTCMXueyuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserTCMXueyuExample() {
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

        public Criteria andXueyuQ1IsNull() {
            addCriterion("xueyu_q1 is null");
            return (Criteria) this;
        }

        public Criteria andXueyuQ1IsNotNull() {
            addCriterion("xueyu_q1 is not null");
            return (Criteria) this;
        }

        public Criteria andXueyuQ1EqualTo(Integer value) {
            addCriterion("xueyu_q1 =", value, "xueyuQ1");
            return (Criteria) this;
        }

        public Criteria andXueyuQ1NotEqualTo(Integer value) {
            addCriterion("xueyu_q1 <>", value, "xueyuQ1");
            return (Criteria) this;
        }

        public Criteria andXueyuQ1GreaterThan(Integer value) {
            addCriterion("xueyu_q1 >", value, "xueyuQ1");
            return (Criteria) this;
        }

        public Criteria andXueyuQ1GreaterThanOrEqualTo(Integer value) {
            addCriterion("xueyu_q1 >=", value, "xueyuQ1");
            return (Criteria) this;
        }

        public Criteria andXueyuQ1LessThan(Integer value) {
            addCriterion("xueyu_q1 <", value, "xueyuQ1");
            return (Criteria) this;
        }

        public Criteria andXueyuQ1LessThanOrEqualTo(Integer value) {
            addCriterion("xueyu_q1 <=", value, "xueyuQ1");
            return (Criteria) this;
        }

        public Criteria andXueyuQ1In(List<Integer> values) {
            addCriterion("xueyu_q1 in", values, "xueyuQ1");
            return (Criteria) this;
        }

        public Criteria andXueyuQ1NotIn(List<Integer> values) {
            addCriterion("xueyu_q1 not in", values, "xueyuQ1");
            return (Criteria) this;
        }

        public Criteria andXueyuQ1Between(Integer value1, Integer value2) {
            addCriterion("xueyu_q1 between", value1, value2, "xueyuQ1");
            return (Criteria) this;
        }

        public Criteria andXueyuQ1NotBetween(Integer value1, Integer value2) {
            addCriterion("xueyu_q1 not between", value1, value2, "xueyuQ1");
            return (Criteria) this;
        }

        public Criteria andXueyuQ2IsNull() {
            addCriterion("xueyu_q2 is null");
            return (Criteria) this;
        }

        public Criteria andXueyuQ2IsNotNull() {
            addCriterion("xueyu_q2 is not null");
            return (Criteria) this;
        }

        public Criteria andXueyuQ2EqualTo(Integer value) {
            addCriterion("xueyu_q2 =", value, "xueyuQ2");
            return (Criteria) this;
        }

        public Criteria andXueyuQ2NotEqualTo(Integer value) {
            addCriterion("xueyu_q2 <>", value, "xueyuQ2");
            return (Criteria) this;
        }

        public Criteria andXueyuQ2GreaterThan(Integer value) {
            addCriterion("xueyu_q2 >", value, "xueyuQ2");
            return (Criteria) this;
        }

        public Criteria andXueyuQ2GreaterThanOrEqualTo(Integer value) {
            addCriterion("xueyu_q2 >=", value, "xueyuQ2");
            return (Criteria) this;
        }

        public Criteria andXueyuQ2LessThan(Integer value) {
            addCriterion("xueyu_q2 <", value, "xueyuQ2");
            return (Criteria) this;
        }

        public Criteria andXueyuQ2LessThanOrEqualTo(Integer value) {
            addCriterion("xueyu_q2 <=", value, "xueyuQ2");
            return (Criteria) this;
        }

        public Criteria andXueyuQ2In(List<Integer> values) {
            addCriterion("xueyu_q2 in", values, "xueyuQ2");
            return (Criteria) this;
        }

        public Criteria andXueyuQ2NotIn(List<Integer> values) {
            addCriterion("xueyu_q2 not in", values, "xueyuQ2");
            return (Criteria) this;
        }

        public Criteria andXueyuQ2Between(Integer value1, Integer value2) {
            addCriterion("xueyu_q2 between", value1, value2, "xueyuQ2");
            return (Criteria) this;
        }

        public Criteria andXueyuQ2NotBetween(Integer value1, Integer value2) {
            addCriterion("xueyu_q2 not between", value1, value2, "xueyuQ2");
            return (Criteria) this;
        }

        public Criteria andXueyuQ3IsNull() {
            addCriterion("xueyu_q3 is null");
            return (Criteria) this;
        }

        public Criteria andXueyuQ3IsNotNull() {
            addCriterion("xueyu_q3 is not null");
            return (Criteria) this;
        }

        public Criteria andXueyuQ3EqualTo(Integer value) {
            addCriterion("xueyu_q3 =", value, "xueyuQ3");
            return (Criteria) this;
        }

        public Criteria andXueyuQ3NotEqualTo(Integer value) {
            addCriterion("xueyu_q3 <>", value, "xueyuQ3");
            return (Criteria) this;
        }

        public Criteria andXueyuQ3GreaterThan(Integer value) {
            addCriterion("xueyu_q3 >", value, "xueyuQ3");
            return (Criteria) this;
        }

        public Criteria andXueyuQ3GreaterThanOrEqualTo(Integer value) {
            addCriterion("xueyu_q3 >=", value, "xueyuQ3");
            return (Criteria) this;
        }

        public Criteria andXueyuQ3LessThan(Integer value) {
            addCriterion("xueyu_q3 <", value, "xueyuQ3");
            return (Criteria) this;
        }

        public Criteria andXueyuQ3LessThanOrEqualTo(Integer value) {
            addCriterion("xueyu_q3 <=", value, "xueyuQ3");
            return (Criteria) this;
        }

        public Criteria andXueyuQ3In(List<Integer> values) {
            addCriterion("xueyu_q3 in", values, "xueyuQ3");
            return (Criteria) this;
        }

        public Criteria andXueyuQ3NotIn(List<Integer> values) {
            addCriterion("xueyu_q3 not in", values, "xueyuQ3");
            return (Criteria) this;
        }

        public Criteria andXueyuQ3Between(Integer value1, Integer value2) {
            addCriterion("xueyu_q3 between", value1, value2, "xueyuQ3");
            return (Criteria) this;
        }

        public Criteria andXueyuQ3NotBetween(Integer value1, Integer value2) {
            addCriterion("xueyu_q3 not between", value1, value2, "xueyuQ3");
            return (Criteria) this;
        }

        public Criteria andXueyuQ4IsNull() {
            addCriterion("xueyu_q4 is null");
            return (Criteria) this;
        }

        public Criteria andXueyuQ4IsNotNull() {
            addCriterion("xueyu_q4 is not null");
            return (Criteria) this;
        }

        public Criteria andXueyuQ4EqualTo(Integer value) {
            addCriterion("xueyu_q4 =", value, "xueyuQ4");
            return (Criteria) this;
        }

        public Criteria andXueyuQ4NotEqualTo(Integer value) {
            addCriterion("xueyu_q4 <>", value, "xueyuQ4");
            return (Criteria) this;
        }

        public Criteria andXueyuQ4GreaterThan(Integer value) {
            addCriterion("xueyu_q4 >", value, "xueyuQ4");
            return (Criteria) this;
        }

        public Criteria andXueyuQ4GreaterThanOrEqualTo(Integer value) {
            addCriterion("xueyu_q4 >=", value, "xueyuQ4");
            return (Criteria) this;
        }

        public Criteria andXueyuQ4LessThan(Integer value) {
            addCriterion("xueyu_q4 <", value, "xueyuQ4");
            return (Criteria) this;
        }

        public Criteria andXueyuQ4LessThanOrEqualTo(Integer value) {
            addCriterion("xueyu_q4 <=", value, "xueyuQ4");
            return (Criteria) this;
        }

        public Criteria andXueyuQ4In(List<Integer> values) {
            addCriterion("xueyu_q4 in", values, "xueyuQ4");
            return (Criteria) this;
        }

        public Criteria andXueyuQ4NotIn(List<Integer> values) {
            addCriterion("xueyu_q4 not in", values, "xueyuQ4");
            return (Criteria) this;
        }

        public Criteria andXueyuQ4Between(Integer value1, Integer value2) {
            addCriterion("xueyu_q4 between", value1, value2, "xueyuQ4");
            return (Criteria) this;
        }

        public Criteria andXueyuQ4NotBetween(Integer value1, Integer value2) {
            addCriterion("xueyu_q4 not between", value1, value2, "xueyuQ4");
            return (Criteria) this;
        }

        public Criteria andXueyuQ5IsNull() {
            addCriterion("xueyu_q5 is null");
            return (Criteria) this;
        }

        public Criteria andXueyuQ5IsNotNull() {
            addCriterion("xueyu_q5 is not null");
            return (Criteria) this;
        }

        public Criteria andXueyuQ5EqualTo(Integer value) {
            addCriterion("xueyu_q5 =", value, "xueyuQ5");
            return (Criteria) this;
        }

        public Criteria andXueyuQ5NotEqualTo(Integer value) {
            addCriterion("xueyu_q5 <>", value, "xueyuQ5");
            return (Criteria) this;
        }

        public Criteria andXueyuQ5GreaterThan(Integer value) {
            addCriterion("xueyu_q5 >", value, "xueyuQ5");
            return (Criteria) this;
        }

        public Criteria andXueyuQ5GreaterThanOrEqualTo(Integer value) {
            addCriterion("xueyu_q5 >=", value, "xueyuQ5");
            return (Criteria) this;
        }

        public Criteria andXueyuQ5LessThan(Integer value) {
            addCriterion("xueyu_q5 <", value, "xueyuQ5");
            return (Criteria) this;
        }

        public Criteria andXueyuQ5LessThanOrEqualTo(Integer value) {
            addCriterion("xueyu_q5 <=", value, "xueyuQ5");
            return (Criteria) this;
        }

        public Criteria andXueyuQ5In(List<Integer> values) {
            addCriterion("xueyu_q5 in", values, "xueyuQ5");
            return (Criteria) this;
        }

        public Criteria andXueyuQ5NotIn(List<Integer> values) {
            addCriterion("xueyu_q5 not in", values, "xueyuQ5");
            return (Criteria) this;
        }

        public Criteria andXueyuQ5Between(Integer value1, Integer value2) {
            addCriterion("xueyu_q5 between", value1, value2, "xueyuQ5");
            return (Criteria) this;
        }

        public Criteria andXueyuQ5NotBetween(Integer value1, Integer value2) {
            addCriterion("xueyu_q5 not between", value1, value2, "xueyuQ5");
            return (Criteria) this;
        }

        public Criteria andXueyuQ6IsNull() {
            addCriterion("xueyu_q6 is null");
            return (Criteria) this;
        }

        public Criteria andXueyuQ6IsNotNull() {
            addCriterion("xueyu_q6 is not null");
            return (Criteria) this;
        }

        public Criteria andXueyuQ6EqualTo(Integer value) {
            addCriterion("xueyu_q6 =", value, "xueyuQ6");
            return (Criteria) this;
        }

        public Criteria andXueyuQ6NotEqualTo(Integer value) {
            addCriterion("xueyu_q6 <>", value, "xueyuQ6");
            return (Criteria) this;
        }

        public Criteria andXueyuQ6GreaterThan(Integer value) {
            addCriterion("xueyu_q6 >", value, "xueyuQ6");
            return (Criteria) this;
        }

        public Criteria andXueyuQ6GreaterThanOrEqualTo(Integer value) {
            addCriterion("xueyu_q6 >=", value, "xueyuQ6");
            return (Criteria) this;
        }

        public Criteria andXueyuQ6LessThan(Integer value) {
            addCriterion("xueyu_q6 <", value, "xueyuQ6");
            return (Criteria) this;
        }

        public Criteria andXueyuQ6LessThanOrEqualTo(Integer value) {
            addCriterion("xueyu_q6 <=", value, "xueyuQ6");
            return (Criteria) this;
        }

        public Criteria andXueyuQ6In(List<Integer> values) {
            addCriterion("xueyu_q6 in", values, "xueyuQ6");
            return (Criteria) this;
        }

        public Criteria andXueyuQ6NotIn(List<Integer> values) {
            addCriterion("xueyu_q6 not in", values, "xueyuQ6");
            return (Criteria) this;
        }

        public Criteria andXueyuQ6Between(Integer value1, Integer value2) {
            addCriterion("xueyu_q6 between", value1, value2, "xueyuQ6");
            return (Criteria) this;
        }

        public Criteria andXueyuQ6NotBetween(Integer value1, Integer value2) {
            addCriterion("xueyu_q6 not between", value1, value2, "xueyuQ6");
            return (Criteria) this;
        }

        public Criteria andXueyuQ7IsNull() {
            addCriterion("xueyu_q7 is null");
            return (Criteria) this;
        }

        public Criteria andXueyuQ7IsNotNull() {
            addCriterion("xueyu_q7 is not null");
            return (Criteria) this;
        }

        public Criteria andXueyuQ7EqualTo(Integer value) {
            addCriterion("xueyu_q7 =", value, "xueyuQ7");
            return (Criteria) this;
        }

        public Criteria andXueyuQ7NotEqualTo(Integer value) {
            addCriterion("xueyu_q7 <>", value, "xueyuQ7");
            return (Criteria) this;
        }

        public Criteria andXueyuQ7GreaterThan(Integer value) {
            addCriterion("xueyu_q7 >", value, "xueyuQ7");
            return (Criteria) this;
        }

        public Criteria andXueyuQ7GreaterThanOrEqualTo(Integer value) {
            addCriterion("xueyu_q7 >=", value, "xueyuQ7");
            return (Criteria) this;
        }

        public Criteria andXueyuQ7LessThan(Integer value) {
            addCriterion("xueyu_q7 <", value, "xueyuQ7");
            return (Criteria) this;
        }

        public Criteria andXueyuQ7LessThanOrEqualTo(Integer value) {
            addCriterion("xueyu_q7 <=", value, "xueyuQ7");
            return (Criteria) this;
        }

        public Criteria andXueyuQ7In(List<Integer> values) {
            addCriterion("xueyu_q7 in", values, "xueyuQ7");
            return (Criteria) this;
        }

        public Criteria andXueyuQ7NotIn(List<Integer> values) {
            addCriterion("xueyu_q7 not in", values, "xueyuQ7");
            return (Criteria) this;
        }

        public Criteria andXueyuQ7Between(Integer value1, Integer value2) {
            addCriterion("xueyu_q7 between", value1, value2, "xueyuQ7");
            return (Criteria) this;
        }

        public Criteria andXueyuQ7NotBetween(Integer value1, Integer value2) {
            addCriterion("xueyu_q7 not between", value1, value2, "xueyuQ7");
            return (Criteria) this;
        }

        public Criteria andXueyuScoreIsNull() {
            addCriterion("xueyu_score is null");
            return (Criteria) this;
        }

        public Criteria andXueyuScoreIsNotNull() {
            addCriterion("xueyu_score is not null");
            return (Criteria) this;
        }

        public Criteria andXueyuScoreEqualTo(Integer value) {
            addCriterion("xueyu_score =", value, "xueyuScore");
            return (Criteria) this;
        }

        public Criteria andXueyuScoreNotEqualTo(Integer value) {
            addCriterion("xueyu_score <>", value, "xueyuScore");
            return (Criteria) this;
        }

        public Criteria andXueyuScoreGreaterThan(Integer value) {
            addCriterion("xueyu_score >", value, "xueyuScore");
            return (Criteria) this;
        }

        public Criteria andXueyuScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("xueyu_score >=", value, "xueyuScore");
            return (Criteria) this;
        }

        public Criteria andXueyuScoreLessThan(Integer value) {
            addCriterion("xueyu_score <", value, "xueyuScore");
            return (Criteria) this;
        }

        public Criteria andXueyuScoreLessThanOrEqualTo(Integer value) {
            addCriterion("xueyu_score <=", value, "xueyuScore");
            return (Criteria) this;
        }

        public Criteria andXueyuScoreIn(List<Integer> values) {
            addCriterion("xueyu_score in", values, "xueyuScore");
            return (Criteria) this;
        }

        public Criteria andXueyuScoreNotIn(List<Integer> values) {
            addCriterion("xueyu_score not in", values, "xueyuScore");
            return (Criteria) this;
        }

        public Criteria andXueyuScoreBetween(Integer value1, Integer value2) {
            addCriterion("xueyu_score between", value1, value2, "xueyuScore");
            return (Criteria) this;
        }

        public Criteria andXueyuScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("xueyu_score not between", value1, value2, "xueyuScore");
            return (Criteria) this;
        }

        public Criteria andXueyuResultIsNull() {
            addCriterion("xueyu_result is null");
            return (Criteria) this;
        }

        public Criteria andXueyuResultIsNotNull() {
            addCriterion("xueyu_result is not null");
            return (Criteria) this;
        }

        public Criteria andXueyuResultEqualTo(Integer value) {
            addCriterion("xueyu_result =", value, "xueyuResult");
            return (Criteria) this;
        }

        public Criteria andXueyuResultNotEqualTo(Integer value) {
            addCriterion("xueyu_result <>", value, "xueyuResult");
            return (Criteria) this;
        }

        public Criteria andXueyuResultGreaterThan(Integer value) {
            addCriterion("xueyu_result >", value, "xueyuResult");
            return (Criteria) this;
        }

        public Criteria andXueyuResultGreaterThanOrEqualTo(Integer value) {
            addCriterion("xueyu_result >=", value, "xueyuResult");
            return (Criteria) this;
        }

        public Criteria andXueyuResultLessThan(Integer value) {
            addCriterion("xueyu_result <", value, "xueyuResult");
            return (Criteria) this;
        }

        public Criteria andXueyuResultLessThanOrEqualTo(Integer value) {
            addCriterion("xueyu_result <=", value, "xueyuResult");
            return (Criteria) this;
        }

        public Criteria andXueyuResultIn(List<Integer> values) {
            addCriterion("xueyu_result in", values, "xueyuResult");
            return (Criteria) this;
        }

        public Criteria andXueyuResultNotIn(List<Integer> values) {
            addCriterion("xueyu_result not in", values, "xueyuResult");
            return (Criteria) this;
        }

        public Criteria andXueyuResultBetween(Integer value1, Integer value2) {
            addCriterion("xueyu_result between", value1, value2, "xueyuResult");
            return (Criteria) this;
        }

        public Criteria andXueyuResultNotBetween(Integer value1, Integer value2) {
            addCriterion("xueyu_result not between", value1, value2, "xueyuResult");
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