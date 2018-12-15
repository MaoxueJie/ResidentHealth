package com.breeze.health.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserLivingMealExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserLivingMealExample() {
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

        public Criteria andMealIsNull() {
            addCriterion("meal is null");
            return (Criteria) this;
        }

        public Criteria andMealIsNotNull() {
            addCriterion("meal is not null");
            return (Criteria) this;
        }

        public Criteria andMealEqualTo(Integer value) {
            addCriterion("meal =", value, "meal");
            return (Criteria) this;
        }

        public Criteria andMealNotEqualTo(Integer value) {
            addCriterion("meal <>", value, "meal");
            return (Criteria) this;
        }

        public Criteria andMealGreaterThan(Integer value) {
            addCriterion("meal >", value, "meal");
            return (Criteria) this;
        }

        public Criteria andMealGreaterThanOrEqualTo(Integer value) {
            addCriterion("meal >=", value, "meal");
            return (Criteria) this;
        }

        public Criteria andMealLessThan(Integer value) {
            addCriterion("meal <", value, "meal");
            return (Criteria) this;
        }

        public Criteria andMealLessThanOrEqualTo(Integer value) {
            addCriterion("meal <=", value, "meal");
            return (Criteria) this;
        }

        public Criteria andMealIn(List<Integer> values) {
            addCriterion("meal in", values, "meal");
            return (Criteria) this;
        }

        public Criteria andMealNotIn(List<Integer> values) {
            addCriterion("meal not in", values, "meal");
            return (Criteria) this;
        }

        public Criteria andMealBetween(Integer value1, Integer value2) {
            addCriterion("meal between", value1, value2, "meal");
            return (Criteria) this;
        }

        public Criteria andMealNotBetween(Integer value1, Integer value2) {
            addCriterion("meal not between", value1, value2, "meal");
            return (Criteria) this;
        }

        public Criteria andBreakfastIsNull() {
            addCriterion("breakfast is null");
            return (Criteria) this;
        }

        public Criteria andBreakfastIsNotNull() {
            addCriterion("breakfast is not null");
            return (Criteria) this;
        }

        public Criteria andBreakfastEqualTo(Integer value) {
            addCriterion("breakfast =", value, "breakfast");
            return (Criteria) this;
        }

        public Criteria andBreakfastNotEqualTo(Integer value) {
            addCriterion("breakfast <>", value, "breakfast");
            return (Criteria) this;
        }

        public Criteria andBreakfastGreaterThan(Integer value) {
            addCriterion("breakfast >", value, "breakfast");
            return (Criteria) this;
        }

        public Criteria andBreakfastGreaterThanOrEqualTo(Integer value) {
            addCriterion("breakfast >=", value, "breakfast");
            return (Criteria) this;
        }

        public Criteria andBreakfastLessThan(Integer value) {
            addCriterion("breakfast <", value, "breakfast");
            return (Criteria) this;
        }

        public Criteria andBreakfastLessThanOrEqualTo(Integer value) {
            addCriterion("breakfast <=", value, "breakfast");
            return (Criteria) this;
        }

        public Criteria andBreakfastIn(List<Integer> values) {
            addCriterion("breakfast in", values, "breakfast");
            return (Criteria) this;
        }

        public Criteria andBreakfastNotIn(List<Integer> values) {
            addCriterion("breakfast not in", values, "breakfast");
            return (Criteria) this;
        }

        public Criteria andBreakfastBetween(Integer value1, Integer value2) {
            addCriterion("breakfast between", value1, value2, "breakfast");
            return (Criteria) this;
        }

        public Criteria andBreakfastNotBetween(Integer value1, Integer value2) {
            addCriterion("breakfast not between", value1, value2, "breakfast");
            return (Criteria) this;
        }

        public Criteria andExtraMeal1IsNull() {
            addCriterion("extra_meal1 is null");
            return (Criteria) this;
        }

        public Criteria andExtraMeal1IsNotNull() {
            addCriterion("extra_meal1 is not null");
            return (Criteria) this;
        }

        public Criteria andExtraMeal1EqualTo(Integer value) {
            addCriterion("extra_meal1 =", value, "extraMeal1");
            return (Criteria) this;
        }

        public Criteria andExtraMeal1NotEqualTo(Integer value) {
            addCriterion("extra_meal1 <>", value, "extraMeal1");
            return (Criteria) this;
        }

        public Criteria andExtraMeal1GreaterThan(Integer value) {
            addCriterion("extra_meal1 >", value, "extraMeal1");
            return (Criteria) this;
        }

        public Criteria andExtraMeal1GreaterThanOrEqualTo(Integer value) {
            addCriterion("extra_meal1 >=", value, "extraMeal1");
            return (Criteria) this;
        }

        public Criteria andExtraMeal1LessThan(Integer value) {
            addCriterion("extra_meal1 <", value, "extraMeal1");
            return (Criteria) this;
        }

        public Criteria andExtraMeal1LessThanOrEqualTo(Integer value) {
            addCriterion("extra_meal1 <=", value, "extraMeal1");
            return (Criteria) this;
        }

        public Criteria andExtraMeal1In(List<Integer> values) {
            addCriterion("extra_meal1 in", values, "extraMeal1");
            return (Criteria) this;
        }

        public Criteria andExtraMeal1NotIn(List<Integer> values) {
            addCriterion("extra_meal1 not in", values, "extraMeal1");
            return (Criteria) this;
        }

        public Criteria andExtraMeal1Between(Integer value1, Integer value2) {
            addCriterion("extra_meal1 between", value1, value2, "extraMeal1");
            return (Criteria) this;
        }

        public Criteria andExtraMeal1NotBetween(Integer value1, Integer value2) {
            addCriterion("extra_meal1 not between", value1, value2, "extraMeal1");
            return (Criteria) this;
        }

        public Criteria andLunchIsNull() {
            addCriterion("lunch is null");
            return (Criteria) this;
        }

        public Criteria andLunchIsNotNull() {
            addCriterion("lunch is not null");
            return (Criteria) this;
        }

        public Criteria andLunchEqualTo(Integer value) {
            addCriterion("lunch =", value, "lunch");
            return (Criteria) this;
        }

        public Criteria andLunchNotEqualTo(Integer value) {
            addCriterion("lunch <>", value, "lunch");
            return (Criteria) this;
        }

        public Criteria andLunchGreaterThan(Integer value) {
            addCriterion("lunch >", value, "lunch");
            return (Criteria) this;
        }

        public Criteria andLunchGreaterThanOrEqualTo(Integer value) {
            addCriterion("lunch >=", value, "lunch");
            return (Criteria) this;
        }

        public Criteria andLunchLessThan(Integer value) {
            addCriterion("lunch <", value, "lunch");
            return (Criteria) this;
        }

        public Criteria andLunchLessThanOrEqualTo(Integer value) {
            addCriterion("lunch <=", value, "lunch");
            return (Criteria) this;
        }

        public Criteria andLunchIn(List<Integer> values) {
            addCriterion("lunch in", values, "lunch");
            return (Criteria) this;
        }

        public Criteria andLunchNotIn(List<Integer> values) {
            addCriterion("lunch not in", values, "lunch");
            return (Criteria) this;
        }

        public Criteria andLunchBetween(Integer value1, Integer value2) {
            addCriterion("lunch between", value1, value2, "lunch");
            return (Criteria) this;
        }

        public Criteria andLunchNotBetween(Integer value1, Integer value2) {
            addCriterion("lunch not between", value1, value2, "lunch");
            return (Criteria) this;
        }

        public Criteria andExtraMeal2IsNull() {
            addCriterion("extra_meal2 is null");
            return (Criteria) this;
        }

        public Criteria andExtraMeal2IsNotNull() {
            addCriterion("extra_meal2 is not null");
            return (Criteria) this;
        }

        public Criteria andExtraMeal2EqualTo(Integer value) {
            addCriterion("extra_meal2 =", value, "extraMeal2");
            return (Criteria) this;
        }

        public Criteria andExtraMeal2NotEqualTo(Integer value) {
            addCriterion("extra_meal2 <>", value, "extraMeal2");
            return (Criteria) this;
        }

        public Criteria andExtraMeal2GreaterThan(Integer value) {
            addCriterion("extra_meal2 >", value, "extraMeal2");
            return (Criteria) this;
        }

        public Criteria andExtraMeal2GreaterThanOrEqualTo(Integer value) {
            addCriterion("extra_meal2 >=", value, "extraMeal2");
            return (Criteria) this;
        }

        public Criteria andExtraMeal2LessThan(Integer value) {
            addCriterion("extra_meal2 <", value, "extraMeal2");
            return (Criteria) this;
        }

        public Criteria andExtraMeal2LessThanOrEqualTo(Integer value) {
            addCriterion("extra_meal2 <=", value, "extraMeal2");
            return (Criteria) this;
        }

        public Criteria andExtraMeal2In(List<Integer> values) {
            addCriterion("extra_meal2 in", values, "extraMeal2");
            return (Criteria) this;
        }

        public Criteria andExtraMeal2NotIn(List<Integer> values) {
            addCriterion("extra_meal2 not in", values, "extraMeal2");
            return (Criteria) this;
        }

        public Criteria andExtraMeal2Between(Integer value1, Integer value2) {
            addCriterion("extra_meal2 between", value1, value2, "extraMeal2");
            return (Criteria) this;
        }

        public Criteria andExtraMeal2NotBetween(Integer value1, Integer value2) {
            addCriterion("extra_meal2 not between", value1, value2, "extraMeal2");
            return (Criteria) this;
        }

        public Criteria andDinnerIsNull() {
            addCriterion("dinner is null");
            return (Criteria) this;
        }

        public Criteria andDinnerIsNotNull() {
            addCriterion("dinner is not null");
            return (Criteria) this;
        }

        public Criteria andDinnerEqualTo(Integer value) {
            addCriterion("dinner =", value, "dinner");
            return (Criteria) this;
        }

        public Criteria andDinnerNotEqualTo(Integer value) {
            addCriterion("dinner <>", value, "dinner");
            return (Criteria) this;
        }

        public Criteria andDinnerGreaterThan(Integer value) {
            addCriterion("dinner >", value, "dinner");
            return (Criteria) this;
        }

        public Criteria andDinnerGreaterThanOrEqualTo(Integer value) {
            addCriterion("dinner >=", value, "dinner");
            return (Criteria) this;
        }

        public Criteria andDinnerLessThan(Integer value) {
            addCriterion("dinner <", value, "dinner");
            return (Criteria) this;
        }

        public Criteria andDinnerLessThanOrEqualTo(Integer value) {
            addCriterion("dinner <=", value, "dinner");
            return (Criteria) this;
        }

        public Criteria andDinnerIn(List<Integer> values) {
            addCriterion("dinner in", values, "dinner");
            return (Criteria) this;
        }

        public Criteria andDinnerNotIn(List<Integer> values) {
            addCriterion("dinner not in", values, "dinner");
            return (Criteria) this;
        }

        public Criteria andDinnerBetween(Integer value1, Integer value2) {
            addCriterion("dinner between", value1, value2, "dinner");
            return (Criteria) this;
        }

        public Criteria andDinnerNotBetween(Integer value1, Integer value2) {
            addCriterion("dinner not between", value1, value2, "dinner");
            return (Criteria) this;
        }

        public Criteria andNightingaleIsNull() {
            addCriterion("nightingale is null");
            return (Criteria) this;
        }

        public Criteria andNightingaleIsNotNull() {
            addCriterion("nightingale is not null");
            return (Criteria) this;
        }

        public Criteria andNightingaleEqualTo(Integer value) {
            addCriterion("nightingale =", value, "nightingale");
            return (Criteria) this;
        }

        public Criteria andNightingaleNotEqualTo(Integer value) {
            addCriterion("nightingale <>", value, "nightingale");
            return (Criteria) this;
        }

        public Criteria andNightingaleGreaterThan(Integer value) {
            addCriterion("nightingale >", value, "nightingale");
            return (Criteria) this;
        }

        public Criteria andNightingaleGreaterThanOrEqualTo(Integer value) {
            addCriterion("nightingale >=", value, "nightingale");
            return (Criteria) this;
        }

        public Criteria andNightingaleLessThan(Integer value) {
            addCriterion("nightingale <", value, "nightingale");
            return (Criteria) this;
        }

        public Criteria andNightingaleLessThanOrEqualTo(Integer value) {
            addCriterion("nightingale <=", value, "nightingale");
            return (Criteria) this;
        }

        public Criteria andNightingaleIn(List<Integer> values) {
            addCriterion("nightingale in", values, "nightingale");
            return (Criteria) this;
        }

        public Criteria andNightingaleNotIn(List<Integer> values) {
            addCriterion("nightingale not in", values, "nightingale");
            return (Criteria) this;
        }

        public Criteria andNightingaleBetween(Integer value1, Integer value2) {
            addCriterion("nightingale between", value1, value2, "nightingale");
            return (Criteria) this;
        }

        public Criteria andNightingaleNotBetween(Integer value1, Integer value2) {
            addCriterion("nightingale not between", value1, value2, "nightingale");
            return (Criteria) this;
        }

        public Criteria andMealDescIsNull() {
            addCriterion("meal_desc is null");
            return (Criteria) this;
        }

        public Criteria andMealDescIsNotNull() {
            addCriterion("meal_desc is not null");
            return (Criteria) this;
        }

        public Criteria andMealDescEqualTo(String value) {
            addCriterion("meal_desc =", value, "mealDesc");
            return (Criteria) this;
        }

        public Criteria andMealDescNotEqualTo(String value) {
            addCriterion("meal_desc <>", value, "mealDesc");
            return (Criteria) this;
        }

        public Criteria andMealDescGreaterThan(String value) {
            addCriterion("meal_desc >", value, "mealDesc");
            return (Criteria) this;
        }

        public Criteria andMealDescGreaterThanOrEqualTo(String value) {
            addCriterion("meal_desc >=", value, "mealDesc");
            return (Criteria) this;
        }

        public Criteria andMealDescLessThan(String value) {
            addCriterion("meal_desc <", value, "mealDesc");
            return (Criteria) this;
        }

        public Criteria andMealDescLessThanOrEqualTo(String value) {
            addCriterion("meal_desc <=", value, "mealDesc");
            return (Criteria) this;
        }

        public Criteria andMealDescLike(String value) {
            addCriterion("meal_desc like", value, "mealDesc");
            return (Criteria) this;
        }

        public Criteria andMealDescNotLike(String value) {
            addCriterion("meal_desc not like", value, "mealDesc");
            return (Criteria) this;
        }

        public Criteria andMealDescIn(List<String> values) {
            addCriterion("meal_desc in", values, "mealDesc");
            return (Criteria) this;
        }

        public Criteria andMealDescNotIn(List<String> values) {
            addCriterion("meal_desc not in", values, "mealDesc");
            return (Criteria) this;
        }

        public Criteria andMealDescBetween(String value1, String value2) {
            addCriterion("meal_desc between", value1, value2, "mealDesc");
            return (Criteria) this;
        }

        public Criteria andMealDescNotBetween(String value1, String value2) {
            addCriterion("meal_desc not between", value1, value2, "mealDesc");
            return (Criteria) this;
        }

        public Criteria andAlizarinIsNull() {
            addCriterion("alizarin is null");
            return (Criteria) this;
        }

        public Criteria andAlizarinIsNotNull() {
            addCriterion("alizarin is not null");
            return (Criteria) this;
        }

        public Criteria andAlizarinEqualTo(Integer value) {
            addCriterion("alizarin =", value, "alizarin");
            return (Criteria) this;
        }

        public Criteria andAlizarinNotEqualTo(Integer value) {
            addCriterion("alizarin <>", value, "alizarin");
            return (Criteria) this;
        }

        public Criteria andAlizarinGreaterThan(Integer value) {
            addCriterion("alizarin >", value, "alizarin");
            return (Criteria) this;
        }

        public Criteria andAlizarinGreaterThanOrEqualTo(Integer value) {
            addCriterion("alizarin >=", value, "alizarin");
            return (Criteria) this;
        }

        public Criteria andAlizarinLessThan(Integer value) {
            addCriterion("alizarin <", value, "alizarin");
            return (Criteria) this;
        }

        public Criteria andAlizarinLessThanOrEqualTo(Integer value) {
            addCriterion("alizarin <=", value, "alizarin");
            return (Criteria) this;
        }

        public Criteria andAlizarinIn(List<Integer> values) {
            addCriterion("alizarin in", values, "alizarin");
            return (Criteria) this;
        }

        public Criteria andAlizarinNotIn(List<Integer> values) {
            addCriterion("alizarin not in", values, "alizarin");
            return (Criteria) this;
        }

        public Criteria andAlizarinBetween(Integer value1, Integer value2) {
            addCriterion("alizarin between", value1, value2, "alizarin");
            return (Criteria) this;
        }

        public Criteria andAlizarinNotBetween(Integer value1, Integer value2) {
            addCriterion("alizarin not between", value1, value2, "alizarin");
            return (Criteria) this;
        }

        public Criteria andPreferenceIsNull() {
            addCriterion("preference is null");
            return (Criteria) this;
        }

        public Criteria andPreferenceIsNotNull() {
            addCriterion("preference is not null");
            return (Criteria) this;
        }

        public Criteria andPreferenceEqualTo(String value) {
            addCriterion("preference =", value, "preference");
            return (Criteria) this;
        }

        public Criteria andPreferenceNotEqualTo(String value) {
            addCriterion("preference <>", value, "preference");
            return (Criteria) this;
        }

        public Criteria andPreferenceGreaterThan(String value) {
            addCriterion("preference >", value, "preference");
            return (Criteria) this;
        }

        public Criteria andPreferenceGreaterThanOrEqualTo(String value) {
            addCriterion("preference >=", value, "preference");
            return (Criteria) this;
        }

        public Criteria andPreferenceLessThan(String value) {
            addCriterion("preference <", value, "preference");
            return (Criteria) this;
        }

        public Criteria andPreferenceLessThanOrEqualTo(String value) {
            addCriterion("preference <=", value, "preference");
            return (Criteria) this;
        }

        public Criteria andPreferenceLike(String value) {
            addCriterion("preference like", value, "preference");
            return (Criteria) this;
        }

        public Criteria andPreferenceNotLike(String value) {
            addCriterion("preference not like", value, "preference");
            return (Criteria) this;
        }

        public Criteria andPreferenceIn(List<String> values) {
            addCriterion("preference in", values, "preference");
            return (Criteria) this;
        }

        public Criteria andPreferenceNotIn(List<String> values) {
            addCriterion("preference not in", values, "preference");
            return (Criteria) this;
        }

        public Criteria andPreferenceBetween(String value1, String value2) {
            addCriterion("preference between", value1, value2, "preference");
            return (Criteria) this;
        }

        public Criteria andPreferenceNotBetween(String value1, String value2) {
            addCriterion("preference not between", value1, value2, "preference");
            return (Criteria) this;
        }

        public Criteria andSpecialIsNull() {
            addCriterion("special is null");
            return (Criteria) this;
        }

        public Criteria andSpecialIsNotNull() {
            addCriterion("special is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialEqualTo(String value) {
            addCriterion("special =", value, "special");
            return (Criteria) this;
        }

        public Criteria andSpecialNotEqualTo(String value) {
            addCriterion("special <>", value, "special");
            return (Criteria) this;
        }

        public Criteria andSpecialGreaterThan(String value) {
            addCriterion("special >", value, "special");
            return (Criteria) this;
        }

        public Criteria andSpecialGreaterThanOrEqualTo(String value) {
            addCriterion("special >=", value, "special");
            return (Criteria) this;
        }

        public Criteria andSpecialLessThan(String value) {
            addCriterion("special <", value, "special");
            return (Criteria) this;
        }

        public Criteria andSpecialLessThanOrEqualTo(String value) {
            addCriterion("special <=", value, "special");
            return (Criteria) this;
        }

        public Criteria andSpecialLike(String value) {
            addCriterion("special like", value, "special");
            return (Criteria) this;
        }

        public Criteria andSpecialNotLike(String value) {
            addCriterion("special not like", value, "special");
            return (Criteria) this;
        }

        public Criteria andSpecialIn(List<String> values) {
            addCriterion("special in", values, "special");
            return (Criteria) this;
        }

        public Criteria andSpecialNotIn(List<String> values) {
            addCriterion("special not in", values, "special");
            return (Criteria) this;
        }

        public Criteria andSpecialBetween(String value1, String value2) {
            addCriterion("special between", value1, value2, "special");
            return (Criteria) this;
        }

        public Criteria andSpecialNotBetween(String value1, String value2) {
            addCriterion("special not between", value1, value2, "special");
            return (Criteria) this;
        }

        public Criteria andSpecialOtherIsNull() {
            addCriterion("special_other is null");
            return (Criteria) this;
        }

        public Criteria andSpecialOtherIsNotNull() {
            addCriterion("special_other is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialOtherEqualTo(String value) {
            addCriterion("special_other =", value, "specialOther");
            return (Criteria) this;
        }

        public Criteria andSpecialOtherNotEqualTo(String value) {
            addCriterion("special_other <>", value, "specialOther");
            return (Criteria) this;
        }

        public Criteria andSpecialOtherGreaterThan(String value) {
            addCriterion("special_other >", value, "specialOther");
            return (Criteria) this;
        }

        public Criteria andSpecialOtherGreaterThanOrEqualTo(String value) {
            addCriterion("special_other >=", value, "specialOther");
            return (Criteria) this;
        }

        public Criteria andSpecialOtherLessThan(String value) {
            addCriterion("special_other <", value, "specialOther");
            return (Criteria) this;
        }

        public Criteria andSpecialOtherLessThanOrEqualTo(String value) {
            addCriterion("special_other <=", value, "specialOther");
            return (Criteria) this;
        }

        public Criteria andSpecialOtherLike(String value) {
            addCriterion("special_other like", value, "specialOther");
            return (Criteria) this;
        }

        public Criteria andSpecialOtherNotLike(String value) {
            addCriterion("special_other not like", value, "specialOther");
            return (Criteria) this;
        }

        public Criteria andSpecialOtherIn(List<String> values) {
            addCriterion("special_other in", values, "specialOther");
            return (Criteria) this;
        }

        public Criteria andSpecialOtherNotIn(List<String> values) {
            addCriterion("special_other not in", values, "specialOther");
            return (Criteria) this;
        }

        public Criteria andSpecialOtherBetween(String value1, String value2) {
            addCriterion("special_other between", value1, value2, "specialOther");
            return (Criteria) this;
        }

        public Criteria andSpecialOtherNotBetween(String value1, String value2) {
            addCriterion("special_other not between", value1, value2, "specialOther");
            return (Criteria) this;
        }

        public Criteria andSweetsIsNull() {
            addCriterion("sweets is null");
            return (Criteria) this;
        }

        public Criteria andSweetsIsNotNull() {
            addCriterion("sweets is not null");
            return (Criteria) this;
        }

        public Criteria andSweetsEqualTo(Integer value) {
            addCriterion("sweets =", value, "sweets");
            return (Criteria) this;
        }

        public Criteria andSweetsNotEqualTo(Integer value) {
            addCriterion("sweets <>", value, "sweets");
            return (Criteria) this;
        }

        public Criteria andSweetsGreaterThan(Integer value) {
            addCriterion("sweets >", value, "sweets");
            return (Criteria) this;
        }

        public Criteria andSweetsGreaterThanOrEqualTo(Integer value) {
            addCriterion("sweets >=", value, "sweets");
            return (Criteria) this;
        }

        public Criteria andSweetsLessThan(Integer value) {
            addCriterion("sweets <", value, "sweets");
            return (Criteria) this;
        }

        public Criteria andSweetsLessThanOrEqualTo(Integer value) {
            addCriterion("sweets <=", value, "sweets");
            return (Criteria) this;
        }

        public Criteria andSweetsIn(List<Integer> values) {
            addCriterion("sweets in", values, "sweets");
            return (Criteria) this;
        }

        public Criteria andSweetsNotIn(List<Integer> values) {
            addCriterion("sweets not in", values, "sweets");
            return (Criteria) this;
        }

        public Criteria andSweetsBetween(Integer value1, Integer value2) {
            addCriterion("sweets between", value1, value2, "sweets");
            return (Criteria) this;
        }

        public Criteria andSweetsNotBetween(Integer value1, Integer value2) {
            addCriterion("sweets not between", value1, value2, "sweets");
            return (Criteria) this;
        }

        public Criteria andFruitIsNull() {
            addCriterion("fruit is null");
            return (Criteria) this;
        }

        public Criteria andFruitIsNotNull() {
            addCriterion("fruit is not null");
            return (Criteria) this;
        }

        public Criteria andFruitEqualTo(Integer value) {
            addCriterion("fruit =", value, "fruit");
            return (Criteria) this;
        }

        public Criteria andFruitNotEqualTo(Integer value) {
            addCriterion("fruit <>", value, "fruit");
            return (Criteria) this;
        }

        public Criteria andFruitGreaterThan(Integer value) {
            addCriterion("fruit >", value, "fruit");
            return (Criteria) this;
        }

        public Criteria andFruitGreaterThanOrEqualTo(Integer value) {
            addCriterion("fruit >=", value, "fruit");
            return (Criteria) this;
        }

        public Criteria andFruitLessThan(Integer value) {
            addCriterion("fruit <", value, "fruit");
            return (Criteria) this;
        }

        public Criteria andFruitLessThanOrEqualTo(Integer value) {
            addCriterion("fruit <=", value, "fruit");
            return (Criteria) this;
        }

        public Criteria andFruitIn(List<Integer> values) {
            addCriterion("fruit in", values, "fruit");
            return (Criteria) this;
        }

        public Criteria andFruitNotIn(List<Integer> values) {
            addCriterion("fruit not in", values, "fruit");
            return (Criteria) this;
        }

        public Criteria andFruitBetween(Integer value1, Integer value2) {
            addCriterion("fruit between", value1, value2, "fruit");
            return (Criteria) this;
        }

        public Criteria andFruitNotBetween(Integer value1, Integer value2) {
            addCriterion("fruit not between", value1, value2, "fruit");
            return (Criteria) this;
        }

        public Criteria andSugaryDrinkIsNull() {
            addCriterion("sugary_drink is null");
            return (Criteria) this;
        }

        public Criteria andSugaryDrinkIsNotNull() {
            addCriterion("sugary_drink is not null");
            return (Criteria) this;
        }

        public Criteria andSugaryDrinkEqualTo(Integer value) {
            addCriterion("sugary_drink =", value, "sugaryDrink");
            return (Criteria) this;
        }

        public Criteria andSugaryDrinkNotEqualTo(Integer value) {
            addCriterion("sugary_drink <>", value, "sugaryDrink");
            return (Criteria) this;
        }

        public Criteria andSugaryDrinkGreaterThan(Integer value) {
            addCriterion("sugary_drink >", value, "sugaryDrink");
            return (Criteria) this;
        }

        public Criteria andSugaryDrinkGreaterThanOrEqualTo(Integer value) {
            addCriterion("sugary_drink >=", value, "sugaryDrink");
            return (Criteria) this;
        }

        public Criteria andSugaryDrinkLessThan(Integer value) {
            addCriterion("sugary_drink <", value, "sugaryDrink");
            return (Criteria) this;
        }

        public Criteria andSugaryDrinkLessThanOrEqualTo(Integer value) {
            addCriterion("sugary_drink <=", value, "sugaryDrink");
            return (Criteria) this;
        }

        public Criteria andSugaryDrinkIn(List<Integer> values) {
            addCriterion("sugary_drink in", values, "sugaryDrink");
            return (Criteria) this;
        }

        public Criteria andSugaryDrinkNotIn(List<Integer> values) {
            addCriterion("sugary_drink not in", values, "sugaryDrink");
            return (Criteria) this;
        }

        public Criteria andSugaryDrinkBetween(Integer value1, Integer value2) {
            addCriterion("sugary_drink between", value1, value2, "sugaryDrink");
            return (Criteria) this;
        }

        public Criteria andSugaryDrinkNotBetween(Integer value1, Integer value2) {
            addCriterion("sugary_drink not between", value1, value2, "sugaryDrink");
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