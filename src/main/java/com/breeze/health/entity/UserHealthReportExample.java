package com.breeze.health.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserHealthReportExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserHealthReportExample() {
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

        public Criteria andSickIdIsNull() {
            addCriterion("sick_id is null");
            return (Criteria) this;
        }

        public Criteria andSickIdIsNotNull() {
            addCriterion("sick_id is not null");
            return (Criteria) this;
        }

        public Criteria andSickIdEqualTo(Long value) {
            addCriterion("sick_id =", value, "sickId");
            return (Criteria) this;
        }

        public Criteria andSickIdNotEqualTo(Long value) {
            addCriterion("sick_id <>", value, "sickId");
            return (Criteria) this;
        }

        public Criteria andSickIdGreaterThan(Long value) {
            addCriterion("sick_id >", value, "sickId");
            return (Criteria) this;
        }

        public Criteria andSickIdGreaterThanOrEqualTo(Long value) {
            addCriterion("sick_id >=", value, "sickId");
            return (Criteria) this;
        }

        public Criteria andSickIdLessThan(Long value) {
            addCriterion("sick_id <", value, "sickId");
            return (Criteria) this;
        }

        public Criteria andSickIdLessThanOrEqualTo(Long value) {
            addCriterion("sick_id <=", value, "sickId");
            return (Criteria) this;
        }

        public Criteria andSickIdIn(List<Long> values) {
            addCriterion("sick_id in", values, "sickId");
            return (Criteria) this;
        }

        public Criteria andSickIdNotIn(List<Long> values) {
            addCriterion("sick_id not in", values, "sickId");
            return (Criteria) this;
        }

        public Criteria andSickIdBetween(Long value1, Long value2) {
            addCriterion("sick_id between", value1, value2, "sickId");
            return (Criteria) this;
        }

        public Criteria andSickIdNotBetween(Long value1, Long value2) {
            addCriterion("sick_id not between", value1, value2, "sickId");
            return (Criteria) this;
        }

        public Criteria andPhyIdIsNull() {
            addCriterion("phy_id is null");
            return (Criteria) this;
        }

        public Criteria andPhyIdIsNotNull() {
            addCriterion("phy_id is not null");
            return (Criteria) this;
        }

        public Criteria andPhyIdEqualTo(Long value) {
            addCriterion("phy_id =", value, "phyId");
            return (Criteria) this;
        }

        public Criteria andPhyIdNotEqualTo(Long value) {
            addCriterion("phy_id <>", value, "phyId");
            return (Criteria) this;
        }

        public Criteria andPhyIdGreaterThan(Long value) {
            addCriterion("phy_id >", value, "phyId");
            return (Criteria) this;
        }

        public Criteria andPhyIdGreaterThanOrEqualTo(Long value) {
            addCriterion("phy_id >=", value, "phyId");
            return (Criteria) this;
        }

        public Criteria andPhyIdLessThan(Long value) {
            addCriterion("phy_id <", value, "phyId");
            return (Criteria) this;
        }

        public Criteria andPhyIdLessThanOrEqualTo(Long value) {
            addCriterion("phy_id <=", value, "phyId");
            return (Criteria) this;
        }

        public Criteria andPhyIdIn(List<Long> values) {
            addCriterion("phy_id in", values, "phyId");
            return (Criteria) this;
        }

        public Criteria andPhyIdNotIn(List<Long> values) {
            addCriterion("phy_id not in", values, "phyId");
            return (Criteria) this;
        }

        public Criteria andPhyIdBetween(Long value1, Long value2) {
            addCriterion("phy_id between", value1, value2, "phyId");
            return (Criteria) this;
        }

        public Criteria andPhyIdNotBetween(Long value1, Long value2) {
            addCriterion("phy_id not between", value1, value2, "phyId");
            return (Criteria) this;
        }

        public Criteria andLivingIdIsNull() {
            addCriterion("living_id is null");
            return (Criteria) this;
        }

        public Criteria andLivingIdIsNotNull() {
            addCriterion("living_id is not null");
            return (Criteria) this;
        }

        public Criteria andLivingIdEqualTo(Long value) {
            addCriterion("living_id =", value, "livingId");
            return (Criteria) this;
        }

        public Criteria andLivingIdNotEqualTo(Long value) {
            addCriterion("living_id <>", value, "livingId");
            return (Criteria) this;
        }

        public Criteria andLivingIdGreaterThan(Long value) {
            addCriterion("living_id >", value, "livingId");
            return (Criteria) this;
        }

        public Criteria andLivingIdGreaterThanOrEqualTo(Long value) {
            addCriterion("living_id >=", value, "livingId");
            return (Criteria) this;
        }

        public Criteria andLivingIdLessThan(Long value) {
            addCriterion("living_id <", value, "livingId");
            return (Criteria) this;
        }

        public Criteria andLivingIdLessThanOrEqualTo(Long value) {
            addCriterion("living_id <=", value, "livingId");
            return (Criteria) this;
        }

        public Criteria andLivingIdIn(List<Long> values) {
            addCriterion("living_id in", values, "livingId");
            return (Criteria) this;
        }

        public Criteria andLivingIdNotIn(List<Long> values) {
            addCriterion("living_id not in", values, "livingId");
            return (Criteria) this;
        }

        public Criteria andLivingIdBetween(Long value1, Long value2) {
            addCriterion("living_id between", value1, value2, "livingId");
            return (Criteria) this;
        }

        public Criteria andLivingIdNotBetween(Long value1, Long value2) {
            addCriterion("living_id not between", value1, value2, "livingId");
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

        public Criteria andSickReportIsNull() {
            addCriterion("sick_report is null");
            return (Criteria) this;
        }

        public Criteria andSickReportIsNotNull() {
            addCriterion("sick_report is not null");
            return (Criteria) this;
        }

        public Criteria andSickReportEqualTo(String value) {
            addCriterion("sick_report =", value, "sickReport");
            return (Criteria) this;
        }

        public Criteria andSickReportNotEqualTo(String value) {
            addCriterion("sick_report <>", value, "sickReport");
            return (Criteria) this;
        }

        public Criteria andSickReportGreaterThan(String value) {
            addCriterion("sick_report >", value, "sickReport");
            return (Criteria) this;
        }

        public Criteria andSickReportGreaterThanOrEqualTo(String value) {
            addCriterion("sick_report >=", value, "sickReport");
            return (Criteria) this;
        }

        public Criteria andSickReportLessThan(String value) {
            addCriterion("sick_report <", value, "sickReport");
            return (Criteria) this;
        }

        public Criteria andSickReportLessThanOrEqualTo(String value) {
            addCriterion("sick_report <=", value, "sickReport");
            return (Criteria) this;
        }

        public Criteria andSickReportLike(String value) {
            addCriterion("sick_report like", value, "sickReport");
            return (Criteria) this;
        }

        public Criteria andSickReportNotLike(String value) {
            addCriterion("sick_report not like", value, "sickReport");
            return (Criteria) this;
        }

        public Criteria andSickReportIn(List<String> values) {
            addCriterion("sick_report in", values, "sickReport");
            return (Criteria) this;
        }

        public Criteria andSickReportNotIn(List<String> values) {
            addCriterion("sick_report not in", values, "sickReport");
            return (Criteria) this;
        }

        public Criteria andSickReportBetween(String value1, String value2) {
            addCriterion("sick_report between", value1, value2, "sickReport");
            return (Criteria) this;
        }

        public Criteria andSickReportNotBetween(String value1, String value2) {
            addCriterion("sick_report not between", value1, value2, "sickReport");
            return (Criteria) this;
        }

        public Criteria andMealReportIsNull() {
            addCriterion("meal_report is null");
            return (Criteria) this;
        }

        public Criteria andMealReportIsNotNull() {
            addCriterion("meal_report is not null");
            return (Criteria) this;
        }

        public Criteria andMealReportEqualTo(String value) {
            addCriterion("meal_report =", value, "mealReport");
            return (Criteria) this;
        }

        public Criteria andMealReportNotEqualTo(String value) {
            addCriterion("meal_report <>", value, "mealReport");
            return (Criteria) this;
        }

        public Criteria andMealReportGreaterThan(String value) {
            addCriterion("meal_report >", value, "mealReport");
            return (Criteria) this;
        }

        public Criteria andMealReportGreaterThanOrEqualTo(String value) {
            addCriterion("meal_report >=", value, "mealReport");
            return (Criteria) this;
        }

        public Criteria andMealReportLessThan(String value) {
            addCriterion("meal_report <", value, "mealReport");
            return (Criteria) this;
        }

        public Criteria andMealReportLessThanOrEqualTo(String value) {
            addCriterion("meal_report <=", value, "mealReport");
            return (Criteria) this;
        }

        public Criteria andMealReportLike(String value) {
            addCriterion("meal_report like", value, "mealReport");
            return (Criteria) this;
        }

        public Criteria andMealReportNotLike(String value) {
            addCriterion("meal_report not like", value, "mealReport");
            return (Criteria) this;
        }

        public Criteria andMealReportIn(List<String> values) {
            addCriterion("meal_report in", values, "mealReport");
            return (Criteria) this;
        }

        public Criteria andMealReportNotIn(List<String> values) {
            addCriterion("meal_report not in", values, "mealReport");
            return (Criteria) this;
        }

        public Criteria andMealReportBetween(String value1, String value2) {
            addCriterion("meal_report between", value1, value2, "mealReport");
            return (Criteria) this;
        }

        public Criteria andMealReportNotBetween(String value1, String value2) {
            addCriterion("meal_report not between", value1, value2, "mealReport");
            return (Criteria) this;
        }

        public Criteria andMovementReportIsNull() {
            addCriterion("movement_report is null");
            return (Criteria) this;
        }

        public Criteria andMovementReportIsNotNull() {
            addCriterion("movement_report is not null");
            return (Criteria) this;
        }

        public Criteria andMovementReportEqualTo(String value) {
            addCriterion("movement_report =", value, "movementReport");
            return (Criteria) this;
        }

        public Criteria andMovementReportNotEqualTo(String value) {
            addCriterion("movement_report <>", value, "movementReport");
            return (Criteria) this;
        }

        public Criteria andMovementReportGreaterThan(String value) {
            addCriterion("movement_report >", value, "movementReport");
            return (Criteria) this;
        }

        public Criteria andMovementReportGreaterThanOrEqualTo(String value) {
            addCriterion("movement_report >=", value, "movementReport");
            return (Criteria) this;
        }

        public Criteria andMovementReportLessThan(String value) {
            addCriterion("movement_report <", value, "movementReport");
            return (Criteria) this;
        }

        public Criteria andMovementReportLessThanOrEqualTo(String value) {
            addCriterion("movement_report <=", value, "movementReport");
            return (Criteria) this;
        }

        public Criteria andMovementReportLike(String value) {
            addCriterion("movement_report like", value, "movementReport");
            return (Criteria) this;
        }

        public Criteria andMovementReportNotLike(String value) {
            addCriterion("movement_report not like", value, "movementReport");
            return (Criteria) this;
        }

        public Criteria andMovementReportIn(List<String> values) {
            addCriterion("movement_report in", values, "movementReport");
            return (Criteria) this;
        }

        public Criteria andMovementReportNotIn(List<String> values) {
            addCriterion("movement_report not in", values, "movementReport");
            return (Criteria) this;
        }

        public Criteria andMovementReportBetween(String value1, String value2) {
            addCriterion("movement_report between", value1, value2, "movementReport");
            return (Criteria) this;
        }

        public Criteria andMovementReportNotBetween(String value1, String value2) {
            addCriterion("movement_report not between", value1, value2, "movementReport");
            return (Criteria) this;
        }

        public Criteria andSmokingReportIsNull() {
            addCriterion("smoking_report is null");
            return (Criteria) this;
        }

        public Criteria andSmokingReportIsNotNull() {
            addCriterion("smoking_report is not null");
            return (Criteria) this;
        }

        public Criteria andSmokingReportEqualTo(String value) {
            addCriterion("smoking_report =", value, "smokingReport");
            return (Criteria) this;
        }

        public Criteria andSmokingReportNotEqualTo(String value) {
            addCriterion("smoking_report <>", value, "smokingReport");
            return (Criteria) this;
        }

        public Criteria andSmokingReportGreaterThan(String value) {
            addCriterion("smoking_report >", value, "smokingReport");
            return (Criteria) this;
        }

        public Criteria andSmokingReportGreaterThanOrEqualTo(String value) {
            addCriterion("smoking_report >=", value, "smokingReport");
            return (Criteria) this;
        }

        public Criteria andSmokingReportLessThan(String value) {
            addCriterion("smoking_report <", value, "smokingReport");
            return (Criteria) this;
        }

        public Criteria andSmokingReportLessThanOrEqualTo(String value) {
            addCriterion("smoking_report <=", value, "smokingReport");
            return (Criteria) this;
        }

        public Criteria andSmokingReportLike(String value) {
            addCriterion("smoking_report like", value, "smokingReport");
            return (Criteria) this;
        }

        public Criteria andSmokingReportNotLike(String value) {
            addCriterion("smoking_report not like", value, "smokingReport");
            return (Criteria) this;
        }

        public Criteria andSmokingReportIn(List<String> values) {
            addCriterion("smoking_report in", values, "smokingReport");
            return (Criteria) this;
        }

        public Criteria andSmokingReportNotIn(List<String> values) {
            addCriterion("smoking_report not in", values, "smokingReport");
            return (Criteria) this;
        }

        public Criteria andSmokingReportBetween(String value1, String value2) {
            addCriterion("smoking_report between", value1, value2, "smokingReport");
            return (Criteria) this;
        }

        public Criteria andSmokingReportNotBetween(String value1, String value2) {
            addCriterion("smoking_report not between", value1, value2, "smokingReport");
            return (Criteria) this;
        }

        public Criteria andPsychologicalReportIsNull() {
            addCriterion("psychological_report is null");
            return (Criteria) this;
        }

        public Criteria andPsychologicalReportIsNotNull() {
            addCriterion("psychological_report is not null");
            return (Criteria) this;
        }

        public Criteria andPsychologicalReportEqualTo(String value) {
            addCriterion("psychological_report =", value, "psychologicalReport");
            return (Criteria) this;
        }

        public Criteria andPsychologicalReportNotEqualTo(String value) {
            addCriterion("psychological_report <>", value, "psychologicalReport");
            return (Criteria) this;
        }

        public Criteria andPsychologicalReportGreaterThan(String value) {
            addCriterion("psychological_report >", value, "psychologicalReport");
            return (Criteria) this;
        }

        public Criteria andPsychologicalReportGreaterThanOrEqualTo(String value) {
            addCriterion("psychological_report >=", value, "psychologicalReport");
            return (Criteria) this;
        }

        public Criteria andPsychologicalReportLessThan(String value) {
            addCriterion("psychological_report <", value, "psychologicalReport");
            return (Criteria) this;
        }

        public Criteria andPsychologicalReportLessThanOrEqualTo(String value) {
            addCriterion("psychological_report <=", value, "psychologicalReport");
            return (Criteria) this;
        }

        public Criteria andPsychologicalReportLike(String value) {
            addCriterion("psychological_report like", value, "psychologicalReport");
            return (Criteria) this;
        }

        public Criteria andPsychologicalReportNotLike(String value) {
            addCriterion("psychological_report not like", value, "psychologicalReport");
            return (Criteria) this;
        }

        public Criteria andPsychologicalReportIn(List<String> values) {
            addCriterion("psychological_report in", values, "psychologicalReport");
            return (Criteria) this;
        }

        public Criteria andPsychologicalReportNotIn(List<String> values) {
            addCriterion("psychological_report not in", values, "psychologicalReport");
            return (Criteria) this;
        }

        public Criteria andPsychologicalReportBetween(String value1, String value2) {
            addCriterion("psychological_report between", value1, value2, "psychologicalReport");
            return (Criteria) this;
        }

        public Criteria andPsychologicalReportNotBetween(String value1, String value2) {
            addCriterion("psychological_report not between", value1, value2, "psychologicalReport");
            return (Criteria) this;
        }

        public Criteria andTcmReportIsNull() {
            addCriterion("tcm_report is null");
            return (Criteria) this;
        }

        public Criteria andTcmReportIsNotNull() {
            addCriterion("tcm_report is not null");
            return (Criteria) this;
        }

        public Criteria andTcmReportEqualTo(String value) {
            addCriterion("tcm_report =", value, "tcmReport");
            return (Criteria) this;
        }

        public Criteria andTcmReportNotEqualTo(String value) {
            addCriterion("tcm_report <>", value, "tcmReport");
            return (Criteria) this;
        }

        public Criteria andTcmReportGreaterThan(String value) {
            addCriterion("tcm_report >", value, "tcmReport");
            return (Criteria) this;
        }

        public Criteria andTcmReportGreaterThanOrEqualTo(String value) {
            addCriterion("tcm_report >=", value, "tcmReport");
            return (Criteria) this;
        }

        public Criteria andTcmReportLessThan(String value) {
            addCriterion("tcm_report <", value, "tcmReport");
            return (Criteria) this;
        }

        public Criteria andTcmReportLessThanOrEqualTo(String value) {
            addCriterion("tcm_report <=", value, "tcmReport");
            return (Criteria) this;
        }

        public Criteria andTcmReportLike(String value) {
            addCriterion("tcm_report like", value, "tcmReport");
            return (Criteria) this;
        }

        public Criteria andTcmReportNotLike(String value) {
            addCriterion("tcm_report not like", value, "tcmReport");
            return (Criteria) this;
        }

        public Criteria andTcmReportIn(List<String> values) {
            addCriterion("tcm_report in", values, "tcmReport");
            return (Criteria) this;
        }

        public Criteria andTcmReportNotIn(List<String> values) {
            addCriterion("tcm_report not in", values, "tcmReport");
            return (Criteria) this;
        }

        public Criteria andTcmReportBetween(String value1, String value2) {
            addCriterion("tcm_report between", value1, value2, "tcmReport");
            return (Criteria) this;
        }

        public Criteria andTcmReportNotBetween(String value1, String value2) {
            addCriterion("tcm_report not between", value1, value2, "tcmReport");
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