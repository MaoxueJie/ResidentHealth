package com.breeze.health.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserLivingMovementExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserLivingMovementExample() {
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

        public Criteria andViolentMovementIsNull() {
            addCriterion("violent_movement is null");
            return (Criteria) this;
        }

        public Criteria andViolentMovementIsNotNull() {
            addCriterion("violent_movement is not null");
            return (Criteria) this;
        }

        public Criteria andViolentMovementEqualTo(Integer value) {
            addCriterion("violent_movement =", value, "violentMovement");
            return (Criteria) this;
        }

        public Criteria andViolentMovementNotEqualTo(Integer value) {
            addCriterion("violent_movement <>", value, "violentMovement");
            return (Criteria) this;
        }

        public Criteria andViolentMovementGreaterThan(Integer value) {
            addCriterion("violent_movement >", value, "violentMovement");
            return (Criteria) this;
        }

        public Criteria andViolentMovementGreaterThanOrEqualTo(Integer value) {
            addCriterion("violent_movement >=", value, "violentMovement");
            return (Criteria) this;
        }

        public Criteria andViolentMovementLessThan(Integer value) {
            addCriterion("violent_movement <", value, "violentMovement");
            return (Criteria) this;
        }

        public Criteria andViolentMovementLessThanOrEqualTo(Integer value) {
            addCriterion("violent_movement <=", value, "violentMovement");
            return (Criteria) this;
        }

        public Criteria andViolentMovementIn(List<Integer> values) {
            addCriterion("violent_movement in", values, "violentMovement");
            return (Criteria) this;
        }

        public Criteria andViolentMovementNotIn(List<Integer> values) {
            addCriterion("violent_movement not in", values, "violentMovement");
            return (Criteria) this;
        }

        public Criteria andViolentMovementBetween(Integer value1, Integer value2) {
            addCriterion("violent_movement between", value1, value2, "violentMovement");
            return (Criteria) this;
        }

        public Criteria andViolentMovementNotBetween(Integer value1, Integer value2) {
            addCriterion("violent_movement not between", value1, value2, "violentMovement");
            return (Criteria) this;
        }

        public Criteria andViolentDaysPerWeekIsNull() {
            addCriterion("violent_days_per_week is null");
            return (Criteria) this;
        }

        public Criteria andViolentDaysPerWeekIsNotNull() {
            addCriterion("violent_days_per_week is not null");
            return (Criteria) this;
        }

        public Criteria andViolentDaysPerWeekEqualTo(Integer value) {
            addCriterion("violent_days_per_week =", value, "violentDaysPerWeek");
            return (Criteria) this;
        }

        public Criteria andViolentDaysPerWeekNotEqualTo(Integer value) {
            addCriterion("violent_days_per_week <>", value, "violentDaysPerWeek");
            return (Criteria) this;
        }

        public Criteria andViolentDaysPerWeekGreaterThan(Integer value) {
            addCriterion("violent_days_per_week >", value, "violentDaysPerWeek");
            return (Criteria) this;
        }

        public Criteria andViolentDaysPerWeekGreaterThanOrEqualTo(Integer value) {
            addCriterion("violent_days_per_week >=", value, "violentDaysPerWeek");
            return (Criteria) this;
        }

        public Criteria andViolentDaysPerWeekLessThan(Integer value) {
            addCriterion("violent_days_per_week <", value, "violentDaysPerWeek");
            return (Criteria) this;
        }

        public Criteria andViolentDaysPerWeekLessThanOrEqualTo(Integer value) {
            addCriterion("violent_days_per_week <=", value, "violentDaysPerWeek");
            return (Criteria) this;
        }

        public Criteria andViolentDaysPerWeekIn(List<Integer> values) {
            addCriterion("violent_days_per_week in", values, "violentDaysPerWeek");
            return (Criteria) this;
        }

        public Criteria andViolentDaysPerWeekNotIn(List<Integer> values) {
            addCriterion("violent_days_per_week not in", values, "violentDaysPerWeek");
            return (Criteria) this;
        }

        public Criteria andViolentDaysPerWeekBetween(Integer value1, Integer value2) {
            addCriterion("violent_days_per_week between", value1, value2, "violentDaysPerWeek");
            return (Criteria) this;
        }

        public Criteria andViolentDaysPerWeekNotBetween(Integer value1, Integer value2) {
            addCriterion("violent_days_per_week not between", value1, value2, "violentDaysPerWeek");
            return (Criteria) this;
        }

        public Criteria andViolentMinutePerDayIsNull() {
            addCriterion("violent_minute_per_day is null");
            return (Criteria) this;
        }

        public Criteria andViolentMinutePerDayIsNotNull() {
            addCriterion("violent_minute_per_day is not null");
            return (Criteria) this;
        }

        public Criteria andViolentMinutePerDayEqualTo(Integer value) {
            addCriterion("violent_minute_per_day =", value, "violentMinutePerDay");
            return (Criteria) this;
        }

        public Criteria andViolentMinutePerDayNotEqualTo(Integer value) {
            addCriterion("violent_minute_per_day <>", value, "violentMinutePerDay");
            return (Criteria) this;
        }

        public Criteria andViolentMinutePerDayGreaterThan(Integer value) {
            addCriterion("violent_minute_per_day >", value, "violentMinutePerDay");
            return (Criteria) this;
        }

        public Criteria andViolentMinutePerDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("violent_minute_per_day >=", value, "violentMinutePerDay");
            return (Criteria) this;
        }

        public Criteria andViolentMinutePerDayLessThan(Integer value) {
            addCriterion("violent_minute_per_day <", value, "violentMinutePerDay");
            return (Criteria) this;
        }

        public Criteria andViolentMinutePerDayLessThanOrEqualTo(Integer value) {
            addCriterion("violent_minute_per_day <=", value, "violentMinutePerDay");
            return (Criteria) this;
        }

        public Criteria andViolentMinutePerDayIn(List<Integer> values) {
            addCriterion("violent_minute_per_day in", values, "violentMinutePerDay");
            return (Criteria) this;
        }

        public Criteria andViolentMinutePerDayNotIn(List<Integer> values) {
            addCriterion("violent_minute_per_day not in", values, "violentMinutePerDay");
            return (Criteria) this;
        }

        public Criteria andViolentMinutePerDayBetween(Integer value1, Integer value2) {
            addCriterion("violent_minute_per_day between", value1, value2, "violentMinutePerDay");
            return (Criteria) this;
        }

        public Criteria andViolentMinutePerDayNotBetween(Integer value1, Integer value2) {
            addCriterion("violent_minute_per_day not between", value1, value2, "violentMinutePerDay");
            return (Criteria) this;
        }

        public Criteria andModerateMovementIsNull() {
            addCriterion("moderate_movement is null");
            return (Criteria) this;
        }

        public Criteria andModerateMovementIsNotNull() {
            addCriterion("moderate_movement is not null");
            return (Criteria) this;
        }

        public Criteria andModerateMovementEqualTo(Integer value) {
            addCriterion("moderate_movement =", value, "moderateMovement");
            return (Criteria) this;
        }

        public Criteria andModerateMovementNotEqualTo(Integer value) {
            addCriterion("moderate_movement <>", value, "moderateMovement");
            return (Criteria) this;
        }

        public Criteria andModerateMovementGreaterThan(Integer value) {
            addCriterion("moderate_movement >", value, "moderateMovement");
            return (Criteria) this;
        }

        public Criteria andModerateMovementGreaterThanOrEqualTo(Integer value) {
            addCriterion("moderate_movement >=", value, "moderateMovement");
            return (Criteria) this;
        }

        public Criteria andModerateMovementLessThan(Integer value) {
            addCriterion("moderate_movement <", value, "moderateMovement");
            return (Criteria) this;
        }

        public Criteria andModerateMovementLessThanOrEqualTo(Integer value) {
            addCriterion("moderate_movement <=", value, "moderateMovement");
            return (Criteria) this;
        }

        public Criteria andModerateMovementIn(List<Integer> values) {
            addCriterion("moderate_movement in", values, "moderateMovement");
            return (Criteria) this;
        }

        public Criteria andModerateMovementNotIn(List<Integer> values) {
            addCriterion("moderate_movement not in", values, "moderateMovement");
            return (Criteria) this;
        }

        public Criteria andModerateMovementBetween(Integer value1, Integer value2) {
            addCriterion("moderate_movement between", value1, value2, "moderateMovement");
            return (Criteria) this;
        }

        public Criteria andModerateMovementNotBetween(Integer value1, Integer value2) {
            addCriterion("moderate_movement not between", value1, value2, "moderateMovement");
            return (Criteria) this;
        }

        public Criteria andModerateDaysPerWeekIsNull() {
            addCriterion("moderate_days_per_week is null");
            return (Criteria) this;
        }

        public Criteria andModerateDaysPerWeekIsNotNull() {
            addCriterion("moderate_days_per_week is not null");
            return (Criteria) this;
        }

        public Criteria andModerateDaysPerWeekEqualTo(Integer value) {
            addCriterion("moderate_days_per_week =", value, "moderateDaysPerWeek");
            return (Criteria) this;
        }

        public Criteria andModerateDaysPerWeekNotEqualTo(Integer value) {
            addCriterion("moderate_days_per_week <>", value, "moderateDaysPerWeek");
            return (Criteria) this;
        }

        public Criteria andModerateDaysPerWeekGreaterThan(Integer value) {
            addCriterion("moderate_days_per_week >", value, "moderateDaysPerWeek");
            return (Criteria) this;
        }

        public Criteria andModerateDaysPerWeekGreaterThanOrEqualTo(Integer value) {
            addCriterion("moderate_days_per_week >=", value, "moderateDaysPerWeek");
            return (Criteria) this;
        }

        public Criteria andModerateDaysPerWeekLessThan(Integer value) {
            addCriterion("moderate_days_per_week <", value, "moderateDaysPerWeek");
            return (Criteria) this;
        }

        public Criteria andModerateDaysPerWeekLessThanOrEqualTo(Integer value) {
            addCriterion("moderate_days_per_week <=", value, "moderateDaysPerWeek");
            return (Criteria) this;
        }

        public Criteria andModerateDaysPerWeekIn(List<Integer> values) {
            addCriterion("moderate_days_per_week in", values, "moderateDaysPerWeek");
            return (Criteria) this;
        }

        public Criteria andModerateDaysPerWeekNotIn(List<Integer> values) {
            addCriterion("moderate_days_per_week not in", values, "moderateDaysPerWeek");
            return (Criteria) this;
        }

        public Criteria andModerateDaysPerWeekBetween(Integer value1, Integer value2) {
            addCriterion("moderate_days_per_week between", value1, value2, "moderateDaysPerWeek");
            return (Criteria) this;
        }

        public Criteria andModerateDaysPerWeekNotBetween(Integer value1, Integer value2) {
            addCriterion("moderate_days_per_week not between", value1, value2, "moderateDaysPerWeek");
            return (Criteria) this;
        }

        public Criteria andModerateMinutePerDayIsNull() {
            addCriterion("moderate_minute_per_day is null");
            return (Criteria) this;
        }

        public Criteria andModerateMinutePerDayIsNotNull() {
            addCriterion("moderate_minute_per_day is not null");
            return (Criteria) this;
        }

        public Criteria andModerateMinutePerDayEqualTo(Integer value) {
            addCriterion("moderate_minute_per_day =", value, "moderateMinutePerDay");
            return (Criteria) this;
        }

        public Criteria andModerateMinutePerDayNotEqualTo(Integer value) {
            addCriterion("moderate_minute_per_day <>", value, "moderateMinutePerDay");
            return (Criteria) this;
        }

        public Criteria andModerateMinutePerDayGreaterThan(Integer value) {
            addCriterion("moderate_minute_per_day >", value, "moderateMinutePerDay");
            return (Criteria) this;
        }

        public Criteria andModerateMinutePerDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("moderate_minute_per_day >=", value, "moderateMinutePerDay");
            return (Criteria) this;
        }

        public Criteria andModerateMinutePerDayLessThan(Integer value) {
            addCriterion("moderate_minute_per_day <", value, "moderateMinutePerDay");
            return (Criteria) this;
        }

        public Criteria andModerateMinutePerDayLessThanOrEqualTo(Integer value) {
            addCriterion("moderate_minute_per_day <=", value, "moderateMinutePerDay");
            return (Criteria) this;
        }

        public Criteria andModerateMinutePerDayIn(List<Integer> values) {
            addCriterion("moderate_minute_per_day in", values, "moderateMinutePerDay");
            return (Criteria) this;
        }

        public Criteria andModerateMinutePerDayNotIn(List<Integer> values) {
            addCriterion("moderate_minute_per_day not in", values, "moderateMinutePerDay");
            return (Criteria) this;
        }

        public Criteria andModerateMinutePerDayBetween(Integer value1, Integer value2) {
            addCriterion("moderate_minute_per_day between", value1, value2, "moderateMinutePerDay");
            return (Criteria) this;
        }

        public Criteria andModerateMinutePerDayNotBetween(Integer value1, Integer value2) {
            addCriterion("moderate_minute_per_day not between", value1, value2, "moderateMinutePerDay");
            return (Criteria) this;
        }

        public Criteria andWalkMovementIsNull() {
            addCriterion("walk_movement is null");
            return (Criteria) this;
        }

        public Criteria andWalkMovementIsNotNull() {
            addCriterion("walk_movement is not null");
            return (Criteria) this;
        }

        public Criteria andWalkMovementEqualTo(Integer value) {
            addCriterion("walk_movement =", value, "walkMovement");
            return (Criteria) this;
        }

        public Criteria andWalkMovementNotEqualTo(Integer value) {
            addCriterion("walk_movement <>", value, "walkMovement");
            return (Criteria) this;
        }

        public Criteria andWalkMovementGreaterThan(Integer value) {
            addCriterion("walk_movement >", value, "walkMovement");
            return (Criteria) this;
        }

        public Criteria andWalkMovementGreaterThanOrEqualTo(Integer value) {
            addCriterion("walk_movement >=", value, "walkMovement");
            return (Criteria) this;
        }

        public Criteria andWalkMovementLessThan(Integer value) {
            addCriterion("walk_movement <", value, "walkMovement");
            return (Criteria) this;
        }

        public Criteria andWalkMovementLessThanOrEqualTo(Integer value) {
            addCriterion("walk_movement <=", value, "walkMovement");
            return (Criteria) this;
        }

        public Criteria andWalkMovementIn(List<Integer> values) {
            addCriterion("walk_movement in", values, "walkMovement");
            return (Criteria) this;
        }

        public Criteria andWalkMovementNotIn(List<Integer> values) {
            addCriterion("walk_movement not in", values, "walkMovement");
            return (Criteria) this;
        }

        public Criteria andWalkMovementBetween(Integer value1, Integer value2) {
            addCriterion("walk_movement between", value1, value2, "walkMovement");
            return (Criteria) this;
        }

        public Criteria andWalkMovementNotBetween(Integer value1, Integer value2) {
            addCriterion("walk_movement not between", value1, value2, "walkMovement");
            return (Criteria) this;
        }

        public Criteria andWalkDaysPerWeekIsNull() {
            addCriterion("walk_days_per_week is null");
            return (Criteria) this;
        }

        public Criteria andWalkDaysPerWeekIsNotNull() {
            addCriterion("walk_days_per_week is not null");
            return (Criteria) this;
        }

        public Criteria andWalkDaysPerWeekEqualTo(Integer value) {
            addCriterion("walk_days_per_week =", value, "walkDaysPerWeek");
            return (Criteria) this;
        }

        public Criteria andWalkDaysPerWeekNotEqualTo(Integer value) {
            addCriterion("walk_days_per_week <>", value, "walkDaysPerWeek");
            return (Criteria) this;
        }

        public Criteria andWalkDaysPerWeekGreaterThan(Integer value) {
            addCriterion("walk_days_per_week >", value, "walkDaysPerWeek");
            return (Criteria) this;
        }

        public Criteria andWalkDaysPerWeekGreaterThanOrEqualTo(Integer value) {
            addCriterion("walk_days_per_week >=", value, "walkDaysPerWeek");
            return (Criteria) this;
        }

        public Criteria andWalkDaysPerWeekLessThan(Integer value) {
            addCriterion("walk_days_per_week <", value, "walkDaysPerWeek");
            return (Criteria) this;
        }

        public Criteria andWalkDaysPerWeekLessThanOrEqualTo(Integer value) {
            addCriterion("walk_days_per_week <=", value, "walkDaysPerWeek");
            return (Criteria) this;
        }

        public Criteria andWalkDaysPerWeekIn(List<Integer> values) {
            addCriterion("walk_days_per_week in", values, "walkDaysPerWeek");
            return (Criteria) this;
        }

        public Criteria andWalkDaysPerWeekNotIn(List<Integer> values) {
            addCriterion("walk_days_per_week not in", values, "walkDaysPerWeek");
            return (Criteria) this;
        }

        public Criteria andWalkDaysPerWeekBetween(Integer value1, Integer value2) {
            addCriterion("walk_days_per_week between", value1, value2, "walkDaysPerWeek");
            return (Criteria) this;
        }

        public Criteria andWalkDaysPerWeekNotBetween(Integer value1, Integer value2) {
            addCriterion("walk_days_per_week not between", value1, value2, "walkDaysPerWeek");
            return (Criteria) this;
        }

        public Criteria andWalkMovementPerDayIsNull() {
            addCriterion("walk_movement_per_day is null");
            return (Criteria) this;
        }

        public Criteria andWalkMovementPerDayIsNotNull() {
            addCriterion("walk_movement_per_day is not null");
            return (Criteria) this;
        }

        public Criteria andWalkMovementPerDayEqualTo(Integer value) {
            addCriterion("walk_movement_per_day =", value, "walkMovementPerDay");
            return (Criteria) this;
        }

        public Criteria andWalkMovementPerDayNotEqualTo(Integer value) {
            addCriterion("walk_movement_per_day <>", value, "walkMovementPerDay");
            return (Criteria) this;
        }

        public Criteria andWalkMovementPerDayGreaterThan(Integer value) {
            addCriterion("walk_movement_per_day >", value, "walkMovementPerDay");
            return (Criteria) this;
        }

        public Criteria andWalkMovementPerDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("walk_movement_per_day >=", value, "walkMovementPerDay");
            return (Criteria) this;
        }

        public Criteria andWalkMovementPerDayLessThan(Integer value) {
            addCriterion("walk_movement_per_day <", value, "walkMovementPerDay");
            return (Criteria) this;
        }

        public Criteria andWalkMovementPerDayLessThanOrEqualTo(Integer value) {
            addCriterion("walk_movement_per_day <=", value, "walkMovementPerDay");
            return (Criteria) this;
        }

        public Criteria andWalkMovementPerDayIn(List<Integer> values) {
            addCriterion("walk_movement_per_day in", values, "walkMovementPerDay");
            return (Criteria) this;
        }

        public Criteria andWalkMovementPerDayNotIn(List<Integer> values) {
            addCriterion("walk_movement_per_day not in", values, "walkMovementPerDay");
            return (Criteria) this;
        }

        public Criteria andWalkMovementPerDayBetween(Integer value1, Integer value2) {
            addCriterion("walk_movement_per_day between", value1, value2, "walkMovementPerDay");
            return (Criteria) this;
        }

        public Criteria andWalkMovementPerDayNotBetween(Integer value1, Integer value2) {
            addCriterion("walk_movement_per_day not between", value1, value2, "walkMovementPerDay");
            return (Criteria) this;
        }

        public Criteria andWalkMinutePerDayIsNull() {
            addCriterion("walk_minute_per_day is null");
            return (Criteria) this;
        }

        public Criteria andWalkMinutePerDayIsNotNull() {
            addCriterion("walk_minute_per_day is not null");
            return (Criteria) this;
        }

        public Criteria andWalkMinutePerDayEqualTo(Integer value) {
            addCriterion("walk_minute_per_day =", value, "walkMinutePerDay");
            return (Criteria) this;
        }

        public Criteria andWalkMinutePerDayNotEqualTo(Integer value) {
            addCriterion("walk_minute_per_day <>", value, "walkMinutePerDay");
            return (Criteria) this;
        }

        public Criteria andWalkMinutePerDayGreaterThan(Integer value) {
            addCriterion("walk_minute_per_day >", value, "walkMinutePerDay");
            return (Criteria) this;
        }

        public Criteria andWalkMinutePerDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("walk_minute_per_day >=", value, "walkMinutePerDay");
            return (Criteria) this;
        }

        public Criteria andWalkMinutePerDayLessThan(Integer value) {
            addCriterion("walk_minute_per_day <", value, "walkMinutePerDay");
            return (Criteria) this;
        }

        public Criteria andWalkMinutePerDayLessThanOrEqualTo(Integer value) {
            addCriterion("walk_minute_per_day <=", value, "walkMinutePerDay");
            return (Criteria) this;
        }

        public Criteria andWalkMinutePerDayIn(List<Integer> values) {
            addCriterion("walk_minute_per_day in", values, "walkMinutePerDay");
            return (Criteria) this;
        }

        public Criteria andWalkMinutePerDayNotIn(List<Integer> values) {
            addCriterion("walk_minute_per_day not in", values, "walkMinutePerDay");
            return (Criteria) this;
        }

        public Criteria andWalkMinutePerDayBetween(Integer value1, Integer value2) {
            addCriterion("walk_minute_per_day between", value1, value2, "walkMinutePerDay");
            return (Criteria) this;
        }

        public Criteria andWalkMinutePerDayNotBetween(Integer value1, Integer value2) {
            addCriterion("walk_minute_per_day not between", value1, value2, "walkMinutePerDay");
            return (Criteria) this;
        }

        public Criteria andSittingRecent7DaysIsNull() {
            addCriterion("sitting_recent7_days is null");
            return (Criteria) this;
        }

        public Criteria andSittingRecent7DaysIsNotNull() {
            addCriterion("sitting_recent7_days is not null");
            return (Criteria) this;
        }

        public Criteria andSittingRecent7DaysEqualTo(Integer value) {
            addCriterion("sitting_recent7_days =", value, "sittingRecent7Days");
            return (Criteria) this;
        }

        public Criteria andSittingRecent7DaysNotEqualTo(Integer value) {
            addCriterion("sitting_recent7_days <>", value, "sittingRecent7Days");
            return (Criteria) this;
        }

        public Criteria andSittingRecent7DaysGreaterThan(Integer value) {
            addCriterion("sitting_recent7_days >", value, "sittingRecent7Days");
            return (Criteria) this;
        }

        public Criteria andSittingRecent7DaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("sitting_recent7_days >=", value, "sittingRecent7Days");
            return (Criteria) this;
        }

        public Criteria andSittingRecent7DaysLessThan(Integer value) {
            addCriterion("sitting_recent7_days <", value, "sittingRecent7Days");
            return (Criteria) this;
        }

        public Criteria andSittingRecent7DaysLessThanOrEqualTo(Integer value) {
            addCriterion("sitting_recent7_days <=", value, "sittingRecent7Days");
            return (Criteria) this;
        }

        public Criteria andSittingRecent7DaysIn(List<Integer> values) {
            addCriterion("sitting_recent7_days in", values, "sittingRecent7Days");
            return (Criteria) this;
        }

        public Criteria andSittingRecent7DaysNotIn(List<Integer> values) {
            addCriterion("sitting_recent7_days not in", values, "sittingRecent7Days");
            return (Criteria) this;
        }

        public Criteria andSittingRecent7DaysBetween(Integer value1, Integer value2) {
            addCriterion("sitting_recent7_days between", value1, value2, "sittingRecent7Days");
            return (Criteria) this;
        }

        public Criteria andSittingRecent7DaysNotBetween(Integer value1, Integer value2) {
            addCriterion("sitting_recent7_days not between", value1, value2, "sittingRecent7Days");
            return (Criteria) this;
        }

        public Criteria andSittingDaysRecent7DaysIsNull() {
            addCriterion("sitting_days_recent7_days is null");
            return (Criteria) this;
        }

        public Criteria andSittingDaysRecent7DaysIsNotNull() {
            addCriterion("sitting_days_recent7_days is not null");
            return (Criteria) this;
        }

        public Criteria andSittingDaysRecent7DaysEqualTo(Integer value) {
            addCriterion("sitting_days_recent7_days =", value, "sittingDaysRecent7Days");
            return (Criteria) this;
        }

        public Criteria andSittingDaysRecent7DaysNotEqualTo(Integer value) {
            addCriterion("sitting_days_recent7_days <>", value, "sittingDaysRecent7Days");
            return (Criteria) this;
        }

        public Criteria andSittingDaysRecent7DaysGreaterThan(Integer value) {
            addCriterion("sitting_days_recent7_days >", value, "sittingDaysRecent7Days");
            return (Criteria) this;
        }

        public Criteria andSittingDaysRecent7DaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("sitting_days_recent7_days >=", value, "sittingDaysRecent7Days");
            return (Criteria) this;
        }

        public Criteria andSittingDaysRecent7DaysLessThan(Integer value) {
            addCriterion("sitting_days_recent7_days <", value, "sittingDaysRecent7Days");
            return (Criteria) this;
        }

        public Criteria andSittingDaysRecent7DaysLessThanOrEqualTo(Integer value) {
            addCriterion("sitting_days_recent7_days <=", value, "sittingDaysRecent7Days");
            return (Criteria) this;
        }

        public Criteria andSittingDaysRecent7DaysIn(List<Integer> values) {
            addCriterion("sitting_days_recent7_days in", values, "sittingDaysRecent7Days");
            return (Criteria) this;
        }

        public Criteria andSittingDaysRecent7DaysNotIn(List<Integer> values) {
            addCriterion("sitting_days_recent7_days not in", values, "sittingDaysRecent7Days");
            return (Criteria) this;
        }

        public Criteria andSittingDaysRecent7DaysBetween(Integer value1, Integer value2) {
            addCriterion("sitting_days_recent7_days between", value1, value2, "sittingDaysRecent7Days");
            return (Criteria) this;
        }

        public Criteria andSittingDaysRecent7DaysNotBetween(Integer value1, Integer value2) {
            addCriterion("sitting_days_recent7_days not between", value1, value2, "sittingDaysRecent7Days");
            return (Criteria) this;
        }

        public Criteria andSittingHoursIsNull() {
            addCriterion("sitting_hours is null");
            return (Criteria) this;
        }

        public Criteria andSittingHoursIsNotNull() {
            addCriterion("sitting_hours is not null");
            return (Criteria) this;
        }

        public Criteria andSittingHoursEqualTo(Integer value) {
            addCriterion("sitting_hours =", value, "sittingHours");
            return (Criteria) this;
        }

        public Criteria andSittingHoursNotEqualTo(Integer value) {
            addCriterion("sitting_hours <>", value, "sittingHours");
            return (Criteria) this;
        }

        public Criteria andSittingHoursGreaterThan(Integer value) {
            addCriterion("sitting_hours >", value, "sittingHours");
            return (Criteria) this;
        }

        public Criteria andSittingHoursGreaterThanOrEqualTo(Integer value) {
            addCriterion("sitting_hours >=", value, "sittingHours");
            return (Criteria) this;
        }

        public Criteria andSittingHoursLessThan(Integer value) {
            addCriterion("sitting_hours <", value, "sittingHours");
            return (Criteria) this;
        }

        public Criteria andSittingHoursLessThanOrEqualTo(Integer value) {
            addCriterion("sitting_hours <=", value, "sittingHours");
            return (Criteria) this;
        }

        public Criteria andSittingHoursIn(List<Integer> values) {
            addCriterion("sitting_hours in", values, "sittingHours");
            return (Criteria) this;
        }

        public Criteria andSittingHoursNotIn(List<Integer> values) {
            addCriterion("sitting_hours not in", values, "sittingHours");
            return (Criteria) this;
        }

        public Criteria andSittingHoursBetween(Integer value1, Integer value2) {
            addCriterion("sitting_hours between", value1, value2, "sittingHours");
            return (Criteria) this;
        }

        public Criteria andSittingHoursNotBetween(Integer value1, Integer value2) {
            addCriterion("sitting_hours not between", value1, value2, "sittingHours");
            return (Criteria) this;
        }

        public Criteria andSittingHoursPerDayIsNull() {
            addCriterion("sitting_hours_per_day is null");
            return (Criteria) this;
        }

        public Criteria andSittingHoursPerDayIsNotNull() {
            addCriterion("sitting_hours_per_day is not null");
            return (Criteria) this;
        }

        public Criteria andSittingHoursPerDayEqualTo(Integer value) {
            addCriterion("sitting_hours_per_day =", value, "sittingHoursPerDay");
            return (Criteria) this;
        }

        public Criteria andSittingHoursPerDayNotEqualTo(Integer value) {
            addCriterion("sitting_hours_per_day <>", value, "sittingHoursPerDay");
            return (Criteria) this;
        }

        public Criteria andSittingHoursPerDayGreaterThan(Integer value) {
            addCriterion("sitting_hours_per_day >", value, "sittingHoursPerDay");
            return (Criteria) this;
        }

        public Criteria andSittingHoursPerDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("sitting_hours_per_day >=", value, "sittingHoursPerDay");
            return (Criteria) this;
        }

        public Criteria andSittingHoursPerDayLessThan(Integer value) {
            addCriterion("sitting_hours_per_day <", value, "sittingHoursPerDay");
            return (Criteria) this;
        }

        public Criteria andSittingHoursPerDayLessThanOrEqualTo(Integer value) {
            addCriterion("sitting_hours_per_day <=", value, "sittingHoursPerDay");
            return (Criteria) this;
        }

        public Criteria andSittingHoursPerDayIn(List<Integer> values) {
            addCriterion("sitting_hours_per_day in", values, "sittingHoursPerDay");
            return (Criteria) this;
        }

        public Criteria andSittingHoursPerDayNotIn(List<Integer> values) {
            addCriterion("sitting_hours_per_day not in", values, "sittingHoursPerDay");
            return (Criteria) this;
        }

        public Criteria andSittingHoursPerDayBetween(Integer value1, Integer value2) {
            addCriterion("sitting_hours_per_day between", value1, value2, "sittingHoursPerDay");
            return (Criteria) this;
        }

        public Criteria andSittingHoursPerDayNotBetween(Integer value1, Integer value2) {
            addCriterion("sitting_hours_per_day not between", value1, value2, "sittingHoursPerDay");
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