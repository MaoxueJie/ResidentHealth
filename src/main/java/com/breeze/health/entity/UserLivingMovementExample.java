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

        public Criteria andViolentDaysPerWeekEqualTo(Float value) {
            addCriterion("violent_days_per_week =", value, "violentDaysPerWeek");
            return (Criteria) this;
        }

        public Criteria andViolentDaysPerWeekNotEqualTo(Float value) {
            addCriterion("violent_days_per_week <>", value, "violentDaysPerWeek");
            return (Criteria) this;
        }

        public Criteria andViolentDaysPerWeekGreaterThan(Float value) {
            addCriterion("violent_days_per_week >", value, "violentDaysPerWeek");
            return (Criteria) this;
        }

        public Criteria andViolentDaysPerWeekGreaterThanOrEqualTo(Float value) {
            addCriterion("violent_days_per_week >=", value, "violentDaysPerWeek");
            return (Criteria) this;
        }

        public Criteria andViolentDaysPerWeekLessThan(Float value) {
            addCriterion("violent_days_per_week <", value, "violentDaysPerWeek");
            return (Criteria) this;
        }

        public Criteria andViolentDaysPerWeekLessThanOrEqualTo(Float value) {
            addCriterion("violent_days_per_week <=", value, "violentDaysPerWeek");
            return (Criteria) this;
        }

        public Criteria andViolentDaysPerWeekIn(List<Float> values) {
            addCriterion("violent_days_per_week in", values, "violentDaysPerWeek");
            return (Criteria) this;
        }

        public Criteria andViolentDaysPerWeekNotIn(List<Float> values) {
            addCriterion("violent_days_per_week not in", values, "violentDaysPerWeek");
            return (Criteria) this;
        }

        public Criteria andViolentDaysPerWeekBetween(Float value1, Float value2) {
            addCriterion("violent_days_per_week between", value1, value2, "violentDaysPerWeek");
            return (Criteria) this;
        }

        public Criteria andViolentDaysPerWeekNotBetween(Float value1, Float value2) {
            addCriterion("violent_days_per_week not between", value1, value2, "violentDaysPerWeek");
            return (Criteria) this;
        }

        public Criteria andViolentMovementPerDayIsNull() {
            addCriterion("violent_movement_per_day is null");
            return (Criteria) this;
        }

        public Criteria andViolentMovementPerDayIsNotNull() {
            addCriterion("violent_movement_per_day is not null");
            return (Criteria) this;
        }

        public Criteria andViolentMovementPerDayEqualTo(Integer value) {
            addCriterion("violent_movement_per_day =", value, "violentMovementPerDay");
            return (Criteria) this;
        }

        public Criteria andViolentMovementPerDayNotEqualTo(Integer value) {
            addCriterion("violent_movement_per_day <>", value, "violentMovementPerDay");
            return (Criteria) this;
        }

        public Criteria andViolentMovementPerDayGreaterThan(Integer value) {
            addCriterion("violent_movement_per_day >", value, "violentMovementPerDay");
            return (Criteria) this;
        }

        public Criteria andViolentMovementPerDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("violent_movement_per_day >=", value, "violentMovementPerDay");
            return (Criteria) this;
        }

        public Criteria andViolentMovementPerDayLessThan(Integer value) {
            addCriterion("violent_movement_per_day <", value, "violentMovementPerDay");
            return (Criteria) this;
        }

        public Criteria andViolentMovementPerDayLessThanOrEqualTo(Integer value) {
            addCriterion("violent_movement_per_day <=", value, "violentMovementPerDay");
            return (Criteria) this;
        }

        public Criteria andViolentMovementPerDayIn(List<Integer> values) {
            addCriterion("violent_movement_per_day in", values, "violentMovementPerDay");
            return (Criteria) this;
        }

        public Criteria andViolentMovementPerDayNotIn(List<Integer> values) {
            addCriterion("violent_movement_per_day not in", values, "violentMovementPerDay");
            return (Criteria) this;
        }

        public Criteria andViolentMovementPerDayBetween(Integer value1, Integer value2) {
            addCriterion("violent_movement_per_day between", value1, value2, "violentMovementPerDay");
            return (Criteria) this;
        }

        public Criteria andViolentMovementPerDayNotBetween(Integer value1, Integer value2) {
            addCriterion("violent_movement_per_day not between", value1, value2, "violentMovementPerDay");
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

        public Criteria andViolentMinutePerDayEqualTo(Float value) {
            addCriterion("violent_minute_per_day =", value, "violentMinutePerDay");
            return (Criteria) this;
        }

        public Criteria andViolentMinutePerDayNotEqualTo(Float value) {
            addCriterion("violent_minute_per_day <>", value, "violentMinutePerDay");
            return (Criteria) this;
        }

        public Criteria andViolentMinutePerDayGreaterThan(Float value) {
            addCriterion("violent_minute_per_day >", value, "violentMinutePerDay");
            return (Criteria) this;
        }

        public Criteria andViolentMinutePerDayGreaterThanOrEqualTo(Float value) {
            addCriterion("violent_minute_per_day >=", value, "violentMinutePerDay");
            return (Criteria) this;
        }

        public Criteria andViolentMinutePerDayLessThan(Float value) {
            addCriterion("violent_minute_per_day <", value, "violentMinutePerDay");
            return (Criteria) this;
        }

        public Criteria andViolentMinutePerDayLessThanOrEqualTo(Float value) {
            addCriterion("violent_minute_per_day <=", value, "violentMinutePerDay");
            return (Criteria) this;
        }

        public Criteria andViolentMinutePerDayIn(List<Float> values) {
            addCriterion("violent_minute_per_day in", values, "violentMinutePerDay");
            return (Criteria) this;
        }

        public Criteria andViolentMinutePerDayNotIn(List<Float> values) {
            addCriterion("violent_minute_per_day not in", values, "violentMinutePerDay");
            return (Criteria) this;
        }

        public Criteria andViolentMinutePerDayBetween(Float value1, Float value2) {
            addCriterion("violent_minute_per_day between", value1, value2, "violentMinutePerDay");
            return (Criteria) this;
        }

        public Criteria andViolentMinutePerDayNotBetween(Float value1, Float value2) {
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

        public Criteria andModerateDaysPerWeekEqualTo(Float value) {
            addCriterion("moderate_days_per_week =", value, "moderateDaysPerWeek");
            return (Criteria) this;
        }

        public Criteria andModerateDaysPerWeekNotEqualTo(Float value) {
            addCriterion("moderate_days_per_week <>", value, "moderateDaysPerWeek");
            return (Criteria) this;
        }

        public Criteria andModerateDaysPerWeekGreaterThan(Float value) {
            addCriterion("moderate_days_per_week >", value, "moderateDaysPerWeek");
            return (Criteria) this;
        }

        public Criteria andModerateDaysPerWeekGreaterThanOrEqualTo(Float value) {
            addCriterion("moderate_days_per_week >=", value, "moderateDaysPerWeek");
            return (Criteria) this;
        }

        public Criteria andModerateDaysPerWeekLessThan(Float value) {
            addCriterion("moderate_days_per_week <", value, "moderateDaysPerWeek");
            return (Criteria) this;
        }

        public Criteria andModerateDaysPerWeekLessThanOrEqualTo(Float value) {
            addCriterion("moderate_days_per_week <=", value, "moderateDaysPerWeek");
            return (Criteria) this;
        }

        public Criteria andModerateDaysPerWeekIn(List<Float> values) {
            addCriterion("moderate_days_per_week in", values, "moderateDaysPerWeek");
            return (Criteria) this;
        }

        public Criteria andModerateDaysPerWeekNotIn(List<Float> values) {
            addCriterion("moderate_days_per_week not in", values, "moderateDaysPerWeek");
            return (Criteria) this;
        }

        public Criteria andModerateDaysPerWeekBetween(Float value1, Float value2) {
            addCriterion("moderate_days_per_week between", value1, value2, "moderateDaysPerWeek");
            return (Criteria) this;
        }

        public Criteria andModerateDaysPerWeekNotBetween(Float value1, Float value2) {
            addCriterion("moderate_days_per_week not between", value1, value2, "moderateDaysPerWeek");
            return (Criteria) this;
        }

        public Criteria andModerateMinuteIsNull() {
            addCriterion("moderate_minute is null");
            return (Criteria) this;
        }

        public Criteria andModerateMinuteIsNotNull() {
            addCriterion("moderate_minute is not null");
            return (Criteria) this;
        }

        public Criteria andModerateMinuteEqualTo(Integer value) {
            addCriterion("moderate_minute =", value, "moderateMinute");
            return (Criteria) this;
        }

        public Criteria andModerateMinuteNotEqualTo(Integer value) {
            addCriterion("moderate_minute <>", value, "moderateMinute");
            return (Criteria) this;
        }

        public Criteria andModerateMinuteGreaterThan(Integer value) {
            addCriterion("moderate_minute >", value, "moderateMinute");
            return (Criteria) this;
        }

        public Criteria andModerateMinuteGreaterThanOrEqualTo(Integer value) {
            addCriterion("moderate_minute >=", value, "moderateMinute");
            return (Criteria) this;
        }

        public Criteria andModerateMinuteLessThan(Integer value) {
            addCriterion("moderate_minute <", value, "moderateMinute");
            return (Criteria) this;
        }

        public Criteria andModerateMinuteLessThanOrEqualTo(Integer value) {
            addCriterion("moderate_minute <=", value, "moderateMinute");
            return (Criteria) this;
        }

        public Criteria andModerateMinuteIn(List<Integer> values) {
            addCriterion("moderate_minute in", values, "moderateMinute");
            return (Criteria) this;
        }

        public Criteria andModerateMinuteNotIn(List<Integer> values) {
            addCriterion("moderate_minute not in", values, "moderateMinute");
            return (Criteria) this;
        }

        public Criteria andModerateMinuteBetween(Integer value1, Integer value2) {
            addCriterion("moderate_minute between", value1, value2, "moderateMinute");
            return (Criteria) this;
        }

        public Criteria andModerateMinuteNotBetween(Integer value1, Integer value2) {
            addCriterion("moderate_minute not between", value1, value2, "moderateMinute");
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

        public Criteria andModerateMinutePerDayEqualTo(Float value) {
            addCriterion("moderate_minute_per_day =", value, "moderateMinutePerDay");
            return (Criteria) this;
        }

        public Criteria andModerateMinutePerDayNotEqualTo(Float value) {
            addCriterion("moderate_minute_per_day <>", value, "moderateMinutePerDay");
            return (Criteria) this;
        }

        public Criteria andModerateMinutePerDayGreaterThan(Float value) {
            addCriterion("moderate_minute_per_day >", value, "moderateMinutePerDay");
            return (Criteria) this;
        }

        public Criteria andModerateMinutePerDayGreaterThanOrEqualTo(Float value) {
            addCriterion("moderate_minute_per_day >=", value, "moderateMinutePerDay");
            return (Criteria) this;
        }

        public Criteria andModerateMinutePerDayLessThan(Float value) {
            addCriterion("moderate_minute_per_day <", value, "moderateMinutePerDay");
            return (Criteria) this;
        }

        public Criteria andModerateMinutePerDayLessThanOrEqualTo(Float value) {
            addCriterion("moderate_minute_per_day <=", value, "moderateMinutePerDay");
            return (Criteria) this;
        }

        public Criteria andModerateMinutePerDayIn(List<Float> values) {
            addCriterion("moderate_minute_per_day in", values, "moderateMinutePerDay");
            return (Criteria) this;
        }

        public Criteria andModerateMinutePerDayNotIn(List<Float> values) {
            addCriterion("moderate_minute_per_day not in", values, "moderateMinutePerDay");
            return (Criteria) this;
        }

        public Criteria andModerateMinutePerDayBetween(Float value1, Float value2) {
            addCriterion("moderate_minute_per_day between", value1, value2, "moderateMinutePerDay");
            return (Criteria) this;
        }

        public Criteria andModerateMinutePerDayNotBetween(Float value1, Float value2) {
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

        public Criteria andWalkDaysPerWeekEqualTo(Float value) {
            addCriterion("walk_days_per_week =", value, "walkDaysPerWeek");
            return (Criteria) this;
        }

        public Criteria andWalkDaysPerWeekNotEqualTo(Float value) {
            addCriterion("walk_days_per_week <>", value, "walkDaysPerWeek");
            return (Criteria) this;
        }

        public Criteria andWalkDaysPerWeekGreaterThan(Float value) {
            addCriterion("walk_days_per_week >", value, "walkDaysPerWeek");
            return (Criteria) this;
        }

        public Criteria andWalkDaysPerWeekGreaterThanOrEqualTo(Float value) {
            addCriterion("walk_days_per_week >=", value, "walkDaysPerWeek");
            return (Criteria) this;
        }

        public Criteria andWalkDaysPerWeekLessThan(Float value) {
            addCriterion("walk_days_per_week <", value, "walkDaysPerWeek");
            return (Criteria) this;
        }

        public Criteria andWalkDaysPerWeekLessThanOrEqualTo(Float value) {
            addCriterion("walk_days_per_week <=", value, "walkDaysPerWeek");
            return (Criteria) this;
        }

        public Criteria andWalkDaysPerWeekIn(List<Float> values) {
            addCriterion("walk_days_per_week in", values, "walkDaysPerWeek");
            return (Criteria) this;
        }

        public Criteria andWalkDaysPerWeekNotIn(List<Float> values) {
            addCriterion("walk_days_per_week not in", values, "walkDaysPerWeek");
            return (Criteria) this;
        }

        public Criteria andWalkDaysPerWeekBetween(Float value1, Float value2) {
            addCriterion("walk_days_per_week between", value1, value2, "walkDaysPerWeek");
            return (Criteria) this;
        }

        public Criteria andWalkDaysPerWeekNotBetween(Float value1, Float value2) {
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

        public Criteria andWalkMinutePerDayEqualTo(Float value) {
            addCriterion("walk_minute_per_day =", value, "walkMinutePerDay");
            return (Criteria) this;
        }

        public Criteria andWalkMinutePerDayNotEqualTo(Float value) {
            addCriterion("walk_minute_per_day <>", value, "walkMinutePerDay");
            return (Criteria) this;
        }

        public Criteria andWalkMinutePerDayGreaterThan(Float value) {
            addCriterion("walk_minute_per_day >", value, "walkMinutePerDay");
            return (Criteria) this;
        }

        public Criteria andWalkMinutePerDayGreaterThanOrEqualTo(Float value) {
            addCriterion("walk_minute_per_day >=", value, "walkMinutePerDay");
            return (Criteria) this;
        }

        public Criteria andWalkMinutePerDayLessThan(Float value) {
            addCriterion("walk_minute_per_day <", value, "walkMinutePerDay");
            return (Criteria) this;
        }

        public Criteria andWalkMinutePerDayLessThanOrEqualTo(Float value) {
            addCriterion("walk_minute_per_day <=", value, "walkMinutePerDay");
            return (Criteria) this;
        }

        public Criteria andWalkMinutePerDayIn(List<Float> values) {
            addCriterion("walk_minute_per_day in", values, "walkMinutePerDay");
            return (Criteria) this;
        }

        public Criteria andWalkMinutePerDayNotIn(List<Float> values) {
            addCriterion("walk_minute_per_day not in", values, "walkMinutePerDay");
            return (Criteria) this;
        }

        public Criteria andWalkMinutePerDayBetween(Float value1, Float value2) {
            addCriterion("walk_minute_per_day between", value1, value2, "walkMinutePerDay");
            return (Criteria) this;
        }

        public Criteria andWalkMinutePerDayNotBetween(Float value1, Float value2) {
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

        public Criteria andSittingDaysRecent7DaysEqualTo(Float value) {
            addCriterion("sitting_days_recent7_days =", value, "sittingDaysRecent7Days");
            return (Criteria) this;
        }

        public Criteria andSittingDaysRecent7DaysNotEqualTo(Float value) {
            addCriterion("sitting_days_recent7_days <>", value, "sittingDaysRecent7Days");
            return (Criteria) this;
        }

        public Criteria andSittingDaysRecent7DaysGreaterThan(Float value) {
            addCriterion("sitting_days_recent7_days >", value, "sittingDaysRecent7Days");
            return (Criteria) this;
        }

        public Criteria andSittingDaysRecent7DaysGreaterThanOrEqualTo(Float value) {
            addCriterion("sitting_days_recent7_days >=", value, "sittingDaysRecent7Days");
            return (Criteria) this;
        }

        public Criteria andSittingDaysRecent7DaysLessThan(Float value) {
            addCriterion("sitting_days_recent7_days <", value, "sittingDaysRecent7Days");
            return (Criteria) this;
        }

        public Criteria andSittingDaysRecent7DaysLessThanOrEqualTo(Float value) {
            addCriterion("sitting_days_recent7_days <=", value, "sittingDaysRecent7Days");
            return (Criteria) this;
        }

        public Criteria andSittingDaysRecent7DaysIn(List<Float> values) {
            addCriterion("sitting_days_recent7_days in", values, "sittingDaysRecent7Days");
            return (Criteria) this;
        }

        public Criteria andSittingDaysRecent7DaysNotIn(List<Float> values) {
            addCriterion("sitting_days_recent7_days not in", values, "sittingDaysRecent7Days");
            return (Criteria) this;
        }

        public Criteria andSittingDaysRecent7DaysBetween(Float value1, Float value2) {
            addCriterion("sitting_days_recent7_days between", value1, value2, "sittingDaysRecent7Days");
            return (Criteria) this;
        }

        public Criteria andSittingDaysRecent7DaysNotBetween(Float value1, Float value2) {
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

        public Criteria andSittingHoursPerDayEqualTo(Float value) {
            addCriterion("sitting_hours_per_day =", value, "sittingHoursPerDay");
            return (Criteria) this;
        }

        public Criteria andSittingHoursPerDayNotEqualTo(Float value) {
            addCriterion("sitting_hours_per_day <>", value, "sittingHoursPerDay");
            return (Criteria) this;
        }

        public Criteria andSittingHoursPerDayGreaterThan(Float value) {
            addCriterion("sitting_hours_per_day >", value, "sittingHoursPerDay");
            return (Criteria) this;
        }

        public Criteria andSittingHoursPerDayGreaterThanOrEqualTo(Float value) {
            addCriterion("sitting_hours_per_day >=", value, "sittingHoursPerDay");
            return (Criteria) this;
        }

        public Criteria andSittingHoursPerDayLessThan(Float value) {
            addCriterion("sitting_hours_per_day <", value, "sittingHoursPerDay");
            return (Criteria) this;
        }

        public Criteria andSittingHoursPerDayLessThanOrEqualTo(Float value) {
            addCriterion("sitting_hours_per_day <=", value, "sittingHoursPerDay");
            return (Criteria) this;
        }

        public Criteria andSittingHoursPerDayIn(List<Float> values) {
            addCriterion("sitting_hours_per_day in", values, "sittingHoursPerDay");
            return (Criteria) this;
        }

        public Criteria andSittingHoursPerDayNotIn(List<Float> values) {
            addCriterion("sitting_hours_per_day not in", values, "sittingHoursPerDay");
            return (Criteria) this;
        }

        public Criteria andSittingHoursPerDayBetween(Float value1, Float value2) {
            addCriterion("sitting_hours_per_day between", value1, value2, "sittingHoursPerDay");
            return (Criteria) this;
        }

        public Criteria andSittingHoursPerDayNotBetween(Float value1, Float value2) {
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