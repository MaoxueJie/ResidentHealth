package com.breeze.health.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UserBaseInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserBaseInfoExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andIdCardNoIsNull() {
            addCriterion("id_card_no is null");
            return (Criteria) this;
        }

        public Criteria andIdCardNoIsNotNull() {
            addCriterion("id_card_no is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardNoEqualTo(String value) {
            addCriterion("id_card_no =", value, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoNotEqualTo(String value) {
            addCriterion("id_card_no <>", value, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoGreaterThan(String value) {
            addCriterion("id_card_no >", value, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoGreaterThanOrEqualTo(String value) {
            addCriterion("id_card_no >=", value, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoLessThan(String value) {
            addCriterion("id_card_no <", value, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoLessThanOrEqualTo(String value) {
            addCriterion("id_card_no <=", value, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoLike(String value) {
            addCriterion("id_card_no like", value, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoNotLike(String value) {
            addCriterion("id_card_no not like", value, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoIn(List<String> values) {
            addCriterion("id_card_no in", values, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoNotIn(List<String> values) {
            addCriterion("id_card_no not in", values, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoBetween(String value1, String value2) {
            addCriterion("id_card_no between", value1, value2, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoNotBetween(String value1, String value2) {
            addCriterion("id_card_no not between", value1, value2, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(Integer value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(Integer value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(Integer value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(Integer value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(Integer value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(Integer value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<Integer> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<Integer> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(Integer value1, Integer value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(Integer value1, Integer value2) {
            addCriterion("gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andEducationIsNull() {
            addCriterion("education is null");
            return (Criteria) this;
        }

        public Criteria andEducationIsNotNull() {
            addCriterion("education is not null");
            return (Criteria) this;
        }

        public Criteria andEducationEqualTo(Integer value) {
            addCriterion("education =", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotEqualTo(Integer value) {
            addCriterion("education <>", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThan(Integer value) {
            addCriterion("education >", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThanOrEqualTo(Integer value) {
            addCriterion("education >=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThan(Integer value) {
            addCriterion("education <", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThanOrEqualTo(Integer value) {
            addCriterion("education <=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationIn(List<Integer> values) {
            addCriterion("education in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotIn(List<Integer> values) {
            addCriterion("education not in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationBetween(Integer value1, Integer value2) {
            addCriterion("education between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotBetween(Integer value1, Integer value2) {
            addCriterion("education not between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andMarriageIsNull() {
            addCriterion("marriage is null");
            return (Criteria) this;
        }

        public Criteria andMarriageIsNotNull() {
            addCriterion("marriage is not null");
            return (Criteria) this;
        }

        public Criteria andMarriageEqualTo(Integer value) {
            addCriterion("marriage =", value, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageNotEqualTo(Integer value) {
            addCriterion("marriage <>", value, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageGreaterThan(Integer value) {
            addCriterion("marriage >", value, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageGreaterThanOrEqualTo(Integer value) {
            addCriterion("marriage >=", value, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageLessThan(Integer value) {
            addCriterion("marriage <", value, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageLessThanOrEqualTo(Integer value) {
            addCriterion("marriage <=", value, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageIn(List<Integer> values) {
            addCriterion("marriage in", values, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageNotIn(List<Integer> values) {
            addCriterion("marriage not in", values, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageBetween(Integer value1, Integer value2) {
            addCriterion("marriage between", value1, value2, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageNotBetween(Integer value1, Integer value2) {
            addCriterion("marriage not between", value1, value2, "marriage");
            return (Criteria) this;
        }

        public Criteria andSonCountIsNull() {
            addCriterion("son_count is null");
            return (Criteria) this;
        }

        public Criteria andSonCountIsNotNull() {
            addCriterion("son_count is not null");
            return (Criteria) this;
        }

        public Criteria andSonCountEqualTo(Integer value) {
            addCriterion("son_count =", value, "sonCount");
            return (Criteria) this;
        }

        public Criteria andSonCountNotEqualTo(Integer value) {
            addCriterion("son_count <>", value, "sonCount");
            return (Criteria) this;
        }

        public Criteria andSonCountGreaterThan(Integer value) {
            addCriterion("son_count >", value, "sonCount");
            return (Criteria) this;
        }

        public Criteria andSonCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("son_count >=", value, "sonCount");
            return (Criteria) this;
        }

        public Criteria andSonCountLessThan(Integer value) {
            addCriterion("son_count <", value, "sonCount");
            return (Criteria) this;
        }

        public Criteria andSonCountLessThanOrEqualTo(Integer value) {
            addCriterion("son_count <=", value, "sonCount");
            return (Criteria) this;
        }

        public Criteria andSonCountIn(List<Integer> values) {
            addCriterion("son_count in", values, "sonCount");
            return (Criteria) this;
        }

        public Criteria andSonCountNotIn(List<Integer> values) {
            addCriterion("son_count not in", values, "sonCount");
            return (Criteria) this;
        }

        public Criteria andSonCountBetween(Integer value1, Integer value2) {
            addCriterion("son_count between", value1, value2, "sonCount");
            return (Criteria) this;
        }

        public Criteria andSonCountNotBetween(Integer value1, Integer value2) {
            addCriterion("son_count not between", value1, value2, "sonCount");
            return (Criteria) this;
        }

        public Criteria andDaughterCountIsNull() {
            addCriterion("daughter_count is null");
            return (Criteria) this;
        }

        public Criteria andDaughterCountIsNotNull() {
            addCriterion("daughter_count is not null");
            return (Criteria) this;
        }

        public Criteria andDaughterCountEqualTo(Integer value) {
            addCriterion("daughter_count =", value, "daughterCount");
            return (Criteria) this;
        }

        public Criteria andDaughterCountNotEqualTo(Integer value) {
            addCriterion("daughter_count <>", value, "daughterCount");
            return (Criteria) this;
        }

        public Criteria andDaughterCountGreaterThan(Integer value) {
            addCriterion("daughter_count >", value, "daughterCount");
            return (Criteria) this;
        }

        public Criteria andDaughterCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("daughter_count >=", value, "daughterCount");
            return (Criteria) this;
        }

        public Criteria andDaughterCountLessThan(Integer value) {
            addCriterion("daughter_count <", value, "daughterCount");
            return (Criteria) this;
        }

        public Criteria andDaughterCountLessThanOrEqualTo(Integer value) {
            addCriterion("daughter_count <=", value, "daughterCount");
            return (Criteria) this;
        }

        public Criteria andDaughterCountIn(List<Integer> values) {
            addCriterion("daughter_count in", values, "daughterCount");
            return (Criteria) this;
        }

        public Criteria andDaughterCountNotIn(List<Integer> values) {
            addCriterion("daughter_count not in", values, "daughterCount");
            return (Criteria) this;
        }

        public Criteria andDaughterCountBetween(Integer value1, Integer value2) {
            addCriterion("daughter_count between", value1, value2, "daughterCount");
            return (Criteria) this;
        }

        public Criteria andDaughterCountNotBetween(Integer value1, Integer value2) {
            addCriterion("daughter_count not between", value1, value2, "daughterCount");
            return (Criteria) this;
        }

        public Criteria andFamilyTypeIsNull() {
            addCriterion("family_type is null");
            return (Criteria) this;
        }

        public Criteria andFamilyTypeIsNotNull() {
            addCriterion("family_type is not null");
            return (Criteria) this;
        }

        public Criteria andFamilyTypeEqualTo(Integer value) {
            addCriterion("family_type =", value, "familyType");
            return (Criteria) this;
        }

        public Criteria andFamilyTypeNotEqualTo(Integer value) {
            addCriterion("family_type <>", value, "familyType");
            return (Criteria) this;
        }

        public Criteria andFamilyTypeGreaterThan(Integer value) {
            addCriterion("family_type >", value, "familyType");
            return (Criteria) this;
        }

        public Criteria andFamilyTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("family_type >=", value, "familyType");
            return (Criteria) this;
        }

        public Criteria andFamilyTypeLessThan(Integer value) {
            addCriterion("family_type <", value, "familyType");
            return (Criteria) this;
        }

        public Criteria andFamilyTypeLessThanOrEqualTo(Integer value) {
            addCriterion("family_type <=", value, "familyType");
            return (Criteria) this;
        }

        public Criteria andFamilyTypeIn(List<Integer> values) {
            addCriterion("family_type in", values, "familyType");
            return (Criteria) this;
        }

        public Criteria andFamilyTypeNotIn(List<Integer> values) {
            addCriterion("family_type not in", values, "familyType");
            return (Criteria) this;
        }

        public Criteria andFamilyTypeBetween(Integer value1, Integer value2) {
            addCriterion("family_type between", value1, value2, "familyType");
            return (Criteria) this;
        }

        public Criteria andFamilyTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("family_type not between", value1, value2, "familyType");
            return (Criteria) this;
        }

        public Criteria andFamilyDescIsNull() {
            addCriterion("family_desc is null");
            return (Criteria) this;
        }

        public Criteria andFamilyDescIsNotNull() {
            addCriterion("family_desc is not null");
            return (Criteria) this;
        }

        public Criteria andFamilyDescEqualTo(String value) {
            addCriterion("family_desc =", value, "familyDesc");
            return (Criteria) this;
        }

        public Criteria andFamilyDescNotEqualTo(String value) {
            addCriterion("family_desc <>", value, "familyDesc");
            return (Criteria) this;
        }

        public Criteria andFamilyDescGreaterThan(String value) {
            addCriterion("family_desc >", value, "familyDesc");
            return (Criteria) this;
        }

        public Criteria andFamilyDescGreaterThanOrEqualTo(String value) {
            addCriterion("family_desc >=", value, "familyDesc");
            return (Criteria) this;
        }

        public Criteria andFamilyDescLessThan(String value) {
            addCriterion("family_desc <", value, "familyDesc");
            return (Criteria) this;
        }

        public Criteria andFamilyDescLessThanOrEqualTo(String value) {
            addCriterion("family_desc <=", value, "familyDesc");
            return (Criteria) this;
        }

        public Criteria andFamilyDescLike(String value) {
            addCriterion("family_desc like", value, "familyDesc");
            return (Criteria) this;
        }

        public Criteria andFamilyDescNotLike(String value) {
            addCriterion("family_desc not like", value, "familyDesc");
            return (Criteria) this;
        }

        public Criteria andFamilyDescIn(List<String> values) {
            addCriterion("family_desc in", values, "familyDesc");
            return (Criteria) this;
        }

        public Criteria andFamilyDescNotIn(List<String> values) {
            addCriterion("family_desc not in", values, "familyDesc");
            return (Criteria) this;
        }

        public Criteria andFamilyDescBetween(String value1, String value2) {
            addCriterion("family_desc between", value1, value2, "familyDesc");
            return (Criteria) this;
        }

        public Criteria andFamilyDescNotBetween(String value1, String value2) {
            addCriterion("family_desc not between", value1, value2, "familyDesc");
            return (Criteria) this;
        }

        public Criteria andFamilyOtherIsNull() {
            addCriterion("family_other is null");
            return (Criteria) this;
        }

        public Criteria andFamilyOtherIsNotNull() {
            addCriterion("family_other is not null");
            return (Criteria) this;
        }

        public Criteria andFamilyOtherEqualTo(String value) {
            addCriterion("family_other =", value, "familyOther");
            return (Criteria) this;
        }

        public Criteria andFamilyOtherNotEqualTo(String value) {
            addCriterion("family_other <>", value, "familyOther");
            return (Criteria) this;
        }

        public Criteria andFamilyOtherGreaterThan(String value) {
            addCriterion("family_other >", value, "familyOther");
            return (Criteria) this;
        }

        public Criteria andFamilyOtherGreaterThanOrEqualTo(String value) {
            addCriterion("family_other >=", value, "familyOther");
            return (Criteria) this;
        }

        public Criteria andFamilyOtherLessThan(String value) {
            addCriterion("family_other <", value, "familyOther");
            return (Criteria) this;
        }

        public Criteria andFamilyOtherLessThanOrEqualTo(String value) {
            addCriterion("family_other <=", value, "familyOther");
            return (Criteria) this;
        }

        public Criteria andFamilyOtherLike(String value) {
            addCriterion("family_other like", value, "familyOther");
            return (Criteria) this;
        }

        public Criteria andFamilyOtherNotLike(String value) {
            addCriterion("family_other not like", value, "familyOther");
            return (Criteria) this;
        }

        public Criteria andFamilyOtherIn(List<String> values) {
            addCriterion("family_other in", values, "familyOther");
            return (Criteria) this;
        }

        public Criteria andFamilyOtherNotIn(List<String> values) {
            addCriterion("family_other not in", values, "familyOther");
            return (Criteria) this;
        }

        public Criteria andFamilyOtherBetween(String value1, String value2) {
            addCriterion("family_other between", value1, value2, "familyOther");
            return (Criteria) this;
        }

        public Criteria andFamilyOtherNotBetween(String value1, String value2) {
            addCriterion("family_other not between", value1, value2, "familyOther");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andZoneIsNull() {
            addCriterion("zone is null");
            return (Criteria) this;
        }

        public Criteria andZoneIsNotNull() {
            addCriterion("zone is not null");
            return (Criteria) this;
        }

        public Criteria andZoneEqualTo(String value) {
            addCriterion("zone =", value, "zone");
            return (Criteria) this;
        }

        public Criteria andZoneNotEqualTo(String value) {
            addCriterion("zone <>", value, "zone");
            return (Criteria) this;
        }

        public Criteria andZoneGreaterThan(String value) {
            addCriterion("zone >", value, "zone");
            return (Criteria) this;
        }

        public Criteria andZoneGreaterThanOrEqualTo(String value) {
            addCriterion("zone >=", value, "zone");
            return (Criteria) this;
        }

        public Criteria andZoneLessThan(String value) {
            addCriterion("zone <", value, "zone");
            return (Criteria) this;
        }

        public Criteria andZoneLessThanOrEqualTo(String value) {
            addCriterion("zone <=", value, "zone");
            return (Criteria) this;
        }

        public Criteria andZoneLike(String value) {
            addCriterion("zone like", value, "zone");
            return (Criteria) this;
        }

        public Criteria andZoneNotLike(String value) {
            addCriterion("zone not like", value, "zone");
            return (Criteria) this;
        }

        public Criteria andZoneIn(List<String> values) {
            addCriterion("zone in", values, "zone");
            return (Criteria) this;
        }

        public Criteria andZoneNotIn(List<String> values) {
            addCriterion("zone not in", values, "zone");
            return (Criteria) this;
        }

        public Criteria andZoneBetween(String value1, String value2) {
            addCriterion("zone between", value1, value2, "zone");
            return (Criteria) this;
        }

        public Criteria andZoneNotBetween(String value1, String value2) {
            addCriterion("zone not between", value1, value2, "zone");
            return (Criteria) this;
        }

        public Criteria andCommunityIsNull() {
            addCriterion("community is null");
            return (Criteria) this;
        }

        public Criteria andCommunityIsNotNull() {
            addCriterion("community is not null");
            return (Criteria) this;
        }

        public Criteria andCommunityEqualTo(String value) {
            addCriterion("community =", value, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityNotEqualTo(String value) {
            addCriterion("community <>", value, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityGreaterThan(String value) {
            addCriterion("community >", value, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityGreaterThanOrEqualTo(String value) {
            addCriterion("community >=", value, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityLessThan(String value) {
            addCriterion("community <", value, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityLessThanOrEqualTo(String value) {
            addCriterion("community <=", value, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityLike(String value) {
            addCriterion("community like", value, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityNotLike(String value) {
            addCriterion("community not like", value, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityIn(List<String> values) {
            addCriterion("community in", values, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityNotIn(List<String> values) {
            addCriterion("community not in", values, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityBetween(String value1, String value2) {
            addCriterion("community between", value1, value2, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityNotBetween(String value1, String value2) {
            addCriterion("community not between", value1, value2, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityLonIsNull() {
            addCriterion("community_lon is null");
            return (Criteria) this;
        }

        public Criteria andCommunityLonIsNotNull() {
            addCriterion("community_lon is not null");
            return (Criteria) this;
        }

        public Criteria andCommunityLonEqualTo(Double value) {
            addCriterion("community_lon =", value, "communityLon");
            return (Criteria) this;
        }

        public Criteria andCommunityLonNotEqualTo(Double value) {
            addCriterion("community_lon <>", value, "communityLon");
            return (Criteria) this;
        }

        public Criteria andCommunityLonGreaterThan(Double value) {
            addCriterion("community_lon >", value, "communityLon");
            return (Criteria) this;
        }

        public Criteria andCommunityLonGreaterThanOrEqualTo(Double value) {
            addCriterion("community_lon >=", value, "communityLon");
            return (Criteria) this;
        }

        public Criteria andCommunityLonLessThan(Double value) {
            addCriterion("community_lon <", value, "communityLon");
            return (Criteria) this;
        }

        public Criteria andCommunityLonLessThanOrEqualTo(Double value) {
            addCriterion("community_lon <=", value, "communityLon");
            return (Criteria) this;
        }

        public Criteria andCommunityLonIn(List<Double> values) {
            addCriterion("community_lon in", values, "communityLon");
            return (Criteria) this;
        }

        public Criteria andCommunityLonNotIn(List<Double> values) {
            addCriterion("community_lon not in", values, "communityLon");
            return (Criteria) this;
        }

        public Criteria andCommunityLonBetween(Double value1, Double value2) {
            addCriterion("community_lon between", value1, value2, "communityLon");
            return (Criteria) this;
        }

        public Criteria andCommunityLonNotBetween(Double value1, Double value2) {
            addCriterion("community_lon not between", value1, value2, "communityLon");
            return (Criteria) this;
        }

        public Criteria andCommunityLatIsNull() {
            addCriterion("community_lat is null");
            return (Criteria) this;
        }

        public Criteria andCommunityLatIsNotNull() {
            addCriterion("community_lat is not null");
            return (Criteria) this;
        }

        public Criteria andCommunityLatEqualTo(Double value) {
            addCriterion("community_lat =", value, "communityLat");
            return (Criteria) this;
        }

        public Criteria andCommunityLatNotEqualTo(Double value) {
            addCriterion("community_lat <>", value, "communityLat");
            return (Criteria) this;
        }

        public Criteria andCommunityLatGreaterThan(Double value) {
            addCriterion("community_lat >", value, "communityLat");
            return (Criteria) this;
        }

        public Criteria andCommunityLatGreaterThanOrEqualTo(Double value) {
            addCriterion("community_lat >=", value, "communityLat");
            return (Criteria) this;
        }

        public Criteria andCommunityLatLessThan(Double value) {
            addCriterion("community_lat <", value, "communityLat");
            return (Criteria) this;
        }

        public Criteria andCommunityLatLessThanOrEqualTo(Double value) {
            addCriterion("community_lat <=", value, "communityLat");
            return (Criteria) this;
        }

        public Criteria andCommunityLatIn(List<Double> values) {
            addCriterion("community_lat in", values, "communityLat");
            return (Criteria) this;
        }

        public Criteria andCommunityLatNotIn(List<Double> values) {
            addCriterion("community_lat not in", values, "communityLat");
            return (Criteria) this;
        }

        public Criteria andCommunityLatBetween(Double value1, Double value2) {
            addCriterion("community_lat between", value1, value2, "communityLat");
            return (Criteria) this;
        }

        public Criteria andCommunityLatNotBetween(Double value1, Double value2) {
            addCriterion("community_lat not between", value1, value2, "communityLat");
            return (Criteria) this;
        }

        public Criteria andJobIsNull() {
            addCriterion("job is null");
            return (Criteria) this;
        }

        public Criteria andJobIsNotNull() {
            addCriterion("job is not null");
            return (Criteria) this;
        }

        public Criteria andJobEqualTo(Integer value) {
            addCriterion("job =", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotEqualTo(Integer value) {
            addCriterion("job <>", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobGreaterThan(Integer value) {
            addCriterion("job >", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobGreaterThanOrEqualTo(Integer value) {
            addCriterion("job >=", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLessThan(Integer value) {
            addCriterion("job <", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLessThanOrEqualTo(Integer value) {
            addCriterion("job <=", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobIn(List<Integer> values) {
            addCriterion("job in", values, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotIn(List<Integer> values) {
            addCriterion("job not in", values, "job");
            return (Criteria) this;
        }

        public Criteria andJobBetween(Integer value1, Integer value2) {
            addCriterion("job between", value1, value2, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotBetween(Integer value1, Integer value2) {
            addCriterion("job not between", value1, value2, "job");
            return (Criteria) this;
        }

        public Criteria andReligionIsNull() {
            addCriterion("religion is null");
            return (Criteria) this;
        }

        public Criteria andReligionIsNotNull() {
            addCriterion("religion is not null");
            return (Criteria) this;
        }

        public Criteria andReligionEqualTo(String value) {
            addCriterion("religion =", value, "religion");
            return (Criteria) this;
        }

        public Criteria andReligionNotEqualTo(String value) {
            addCriterion("religion <>", value, "religion");
            return (Criteria) this;
        }

        public Criteria andReligionGreaterThan(String value) {
            addCriterion("religion >", value, "religion");
            return (Criteria) this;
        }

        public Criteria andReligionGreaterThanOrEqualTo(String value) {
            addCriterion("religion >=", value, "religion");
            return (Criteria) this;
        }

        public Criteria andReligionLessThan(String value) {
            addCriterion("religion <", value, "religion");
            return (Criteria) this;
        }

        public Criteria andReligionLessThanOrEqualTo(String value) {
            addCriterion("religion <=", value, "religion");
            return (Criteria) this;
        }

        public Criteria andReligionLike(String value) {
            addCriterion("religion like", value, "religion");
            return (Criteria) this;
        }

        public Criteria andReligionNotLike(String value) {
            addCriterion("religion not like", value, "religion");
            return (Criteria) this;
        }

        public Criteria andReligionIn(List<String> values) {
            addCriterion("religion in", values, "religion");
            return (Criteria) this;
        }

        public Criteria andReligionNotIn(List<String> values) {
            addCriterion("religion not in", values, "religion");
            return (Criteria) this;
        }

        public Criteria andReligionBetween(String value1, String value2) {
            addCriterion("religion between", value1, value2, "religion");
            return (Criteria) this;
        }

        public Criteria andReligionNotBetween(String value1, String value2) {
            addCriterion("religion not between", value1, value2, "religion");
            return (Criteria) this;
        }

        public Criteria andReligionOtherIsNull() {
            addCriterion("religion_other is null");
            return (Criteria) this;
        }

        public Criteria andReligionOtherIsNotNull() {
            addCriterion("religion_other is not null");
            return (Criteria) this;
        }

        public Criteria andReligionOtherEqualTo(String value) {
            addCriterion("religion_other =", value, "religionOther");
            return (Criteria) this;
        }

        public Criteria andReligionOtherNotEqualTo(String value) {
            addCriterion("religion_other <>", value, "religionOther");
            return (Criteria) this;
        }

        public Criteria andReligionOtherGreaterThan(String value) {
            addCriterion("religion_other >", value, "religionOther");
            return (Criteria) this;
        }

        public Criteria andReligionOtherGreaterThanOrEqualTo(String value) {
            addCriterion("religion_other >=", value, "religionOther");
            return (Criteria) this;
        }

        public Criteria andReligionOtherLessThan(String value) {
            addCriterion("religion_other <", value, "religionOther");
            return (Criteria) this;
        }

        public Criteria andReligionOtherLessThanOrEqualTo(String value) {
            addCriterion("religion_other <=", value, "religionOther");
            return (Criteria) this;
        }

        public Criteria andReligionOtherLike(String value) {
            addCriterion("religion_other like", value, "religionOther");
            return (Criteria) this;
        }

        public Criteria andReligionOtherNotLike(String value) {
            addCriterion("religion_other not like", value, "religionOther");
            return (Criteria) this;
        }

        public Criteria andReligionOtherIn(List<String> values) {
            addCriterion("religion_other in", values, "religionOther");
            return (Criteria) this;
        }

        public Criteria andReligionOtherNotIn(List<String> values) {
            addCriterion("religion_other not in", values, "religionOther");
            return (Criteria) this;
        }

        public Criteria andReligionOtherBetween(String value1, String value2) {
            addCriterion("religion_other between", value1, value2, "religionOther");
            return (Criteria) this;
        }

        public Criteria andReligionOtherNotBetween(String value1, String value2) {
            addCriterion("religion_other not between", value1, value2, "religionOther");
            return (Criteria) this;
        }

        public Criteria andPersonCountIsNull() {
            addCriterion("person_count is null");
            return (Criteria) this;
        }

        public Criteria andPersonCountIsNotNull() {
            addCriterion("person_count is not null");
            return (Criteria) this;
        }

        public Criteria andPersonCountEqualTo(Integer value) {
            addCriterion("person_count =", value, "personCount");
            return (Criteria) this;
        }

        public Criteria andPersonCountNotEqualTo(Integer value) {
            addCriterion("person_count <>", value, "personCount");
            return (Criteria) this;
        }

        public Criteria andPersonCountGreaterThan(Integer value) {
            addCriterion("person_count >", value, "personCount");
            return (Criteria) this;
        }

        public Criteria andPersonCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("person_count >=", value, "personCount");
            return (Criteria) this;
        }

        public Criteria andPersonCountLessThan(Integer value) {
            addCriterion("person_count <", value, "personCount");
            return (Criteria) this;
        }

        public Criteria andPersonCountLessThanOrEqualTo(Integer value) {
            addCriterion("person_count <=", value, "personCount");
            return (Criteria) this;
        }

        public Criteria andPersonCountIn(List<Integer> values) {
            addCriterion("person_count in", values, "personCount");
            return (Criteria) this;
        }

        public Criteria andPersonCountNotIn(List<Integer> values) {
            addCriterion("person_count not in", values, "personCount");
            return (Criteria) this;
        }

        public Criteria andPersonCountBetween(Integer value1, Integer value2) {
            addCriterion("person_count between", value1, value2, "personCount");
            return (Criteria) this;
        }

        public Criteria andPersonCountNotBetween(Integer value1, Integer value2) {
            addCriterion("person_count not between", value1, value2, "personCount");
            return (Criteria) this;
        }

        public Criteria andHabitatIncomeIsNull() {
            addCriterion("habitat_income is null");
            return (Criteria) this;
        }

        public Criteria andHabitatIncomeIsNotNull() {
            addCriterion("habitat_income is not null");
            return (Criteria) this;
        }

        public Criteria andHabitatIncomeEqualTo(Integer value) {
            addCriterion("habitat_income =", value, "habitatIncome");
            return (Criteria) this;
        }

        public Criteria andHabitatIncomeNotEqualTo(Integer value) {
            addCriterion("habitat_income <>", value, "habitatIncome");
            return (Criteria) this;
        }

        public Criteria andHabitatIncomeGreaterThan(Integer value) {
            addCriterion("habitat_income >", value, "habitatIncome");
            return (Criteria) this;
        }

        public Criteria andHabitatIncomeGreaterThanOrEqualTo(Integer value) {
            addCriterion("habitat_income >=", value, "habitatIncome");
            return (Criteria) this;
        }

        public Criteria andHabitatIncomeLessThan(Integer value) {
            addCriterion("habitat_income <", value, "habitatIncome");
            return (Criteria) this;
        }

        public Criteria andHabitatIncomeLessThanOrEqualTo(Integer value) {
            addCriterion("habitat_income <=", value, "habitatIncome");
            return (Criteria) this;
        }

        public Criteria andHabitatIncomeIn(List<Integer> values) {
            addCriterion("habitat_income in", values, "habitatIncome");
            return (Criteria) this;
        }

        public Criteria andHabitatIncomeNotIn(List<Integer> values) {
            addCriterion("habitat_income not in", values, "habitatIncome");
            return (Criteria) this;
        }

        public Criteria andHabitatIncomeBetween(Integer value1, Integer value2) {
            addCriterion("habitat_income between", value1, value2, "habitatIncome");
            return (Criteria) this;
        }

        public Criteria andHabitatIncomeNotBetween(Integer value1, Integer value2) {
            addCriterion("habitat_income not between", value1, value2, "habitatIncome");
            return (Criteria) this;
        }

        public Criteria andMedicalPayWayIsNull() {
            addCriterion("medical_pay_way is null");
            return (Criteria) this;
        }

        public Criteria andMedicalPayWayIsNotNull() {
            addCriterion("medical_pay_way is not null");
            return (Criteria) this;
        }

        public Criteria andMedicalPayWayEqualTo(String value) {
            addCriterion("medical_pay_way =", value, "medicalPayWay");
            return (Criteria) this;
        }

        public Criteria andMedicalPayWayNotEqualTo(String value) {
            addCriterion("medical_pay_way <>", value, "medicalPayWay");
            return (Criteria) this;
        }

        public Criteria andMedicalPayWayGreaterThan(String value) {
            addCriterion("medical_pay_way >", value, "medicalPayWay");
            return (Criteria) this;
        }

        public Criteria andMedicalPayWayGreaterThanOrEqualTo(String value) {
            addCriterion("medical_pay_way >=", value, "medicalPayWay");
            return (Criteria) this;
        }

        public Criteria andMedicalPayWayLessThan(String value) {
            addCriterion("medical_pay_way <", value, "medicalPayWay");
            return (Criteria) this;
        }

        public Criteria andMedicalPayWayLessThanOrEqualTo(String value) {
            addCriterion("medical_pay_way <=", value, "medicalPayWay");
            return (Criteria) this;
        }

        public Criteria andMedicalPayWayLike(String value) {
            addCriterion("medical_pay_way like", value, "medicalPayWay");
            return (Criteria) this;
        }

        public Criteria andMedicalPayWayNotLike(String value) {
            addCriterion("medical_pay_way not like", value, "medicalPayWay");
            return (Criteria) this;
        }

        public Criteria andMedicalPayWayIn(List<String> values) {
            addCriterion("medical_pay_way in", values, "medicalPayWay");
            return (Criteria) this;
        }

        public Criteria andMedicalPayWayNotIn(List<String> values) {
            addCriterion("medical_pay_way not in", values, "medicalPayWay");
            return (Criteria) this;
        }

        public Criteria andMedicalPayWayBetween(String value1, String value2) {
            addCriterion("medical_pay_way between", value1, value2, "medicalPayWay");
            return (Criteria) this;
        }

        public Criteria andMedicalPayWayNotBetween(String value1, String value2) {
            addCriterion("medical_pay_way not between", value1, value2, "medicalPayWay");
            return (Criteria) this;
        }

        public Criteria andMedicalPayDesc2IsNull() {
            addCriterion("medical_pay_desc2 is null");
            return (Criteria) this;
        }

        public Criteria andMedicalPayDesc2IsNotNull() {
            addCriterion("medical_pay_desc2 is not null");
            return (Criteria) this;
        }

        public Criteria andMedicalPayDesc2EqualTo(String value) {
            addCriterion("medical_pay_desc2 =", value, "medicalPayDesc2");
            return (Criteria) this;
        }

        public Criteria andMedicalPayDesc2NotEqualTo(String value) {
            addCriterion("medical_pay_desc2 <>", value, "medicalPayDesc2");
            return (Criteria) this;
        }

        public Criteria andMedicalPayDesc2GreaterThan(String value) {
            addCriterion("medical_pay_desc2 >", value, "medicalPayDesc2");
            return (Criteria) this;
        }

        public Criteria andMedicalPayDesc2GreaterThanOrEqualTo(String value) {
            addCriterion("medical_pay_desc2 >=", value, "medicalPayDesc2");
            return (Criteria) this;
        }

        public Criteria andMedicalPayDesc2LessThan(String value) {
            addCriterion("medical_pay_desc2 <", value, "medicalPayDesc2");
            return (Criteria) this;
        }

        public Criteria andMedicalPayDesc2LessThanOrEqualTo(String value) {
            addCriterion("medical_pay_desc2 <=", value, "medicalPayDesc2");
            return (Criteria) this;
        }

        public Criteria andMedicalPayDesc2Like(String value) {
            addCriterion("medical_pay_desc2 like", value, "medicalPayDesc2");
            return (Criteria) this;
        }

        public Criteria andMedicalPayDesc2NotLike(String value) {
            addCriterion("medical_pay_desc2 not like", value, "medicalPayDesc2");
            return (Criteria) this;
        }

        public Criteria andMedicalPayDesc2In(List<String> values) {
            addCriterion("medical_pay_desc2 in", values, "medicalPayDesc2");
            return (Criteria) this;
        }

        public Criteria andMedicalPayDesc2NotIn(List<String> values) {
            addCriterion("medical_pay_desc2 not in", values, "medicalPayDesc2");
            return (Criteria) this;
        }

        public Criteria andMedicalPayDesc2Between(String value1, String value2) {
            addCriterion("medical_pay_desc2 between", value1, value2, "medicalPayDesc2");
            return (Criteria) this;
        }

        public Criteria andMedicalPayDesc2NotBetween(String value1, String value2) {
            addCriterion("medical_pay_desc2 not between", value1, value2, "medicalPayDesc2");
            return (Criteria) this;
        }

        public Criteria andMedicalPayDesc3IsNull() {
            addCriterion("medical_pay_desc3 is null");
            return (Criteria) this;
        }

        public Criteria andMedicalPayDesc3IsNotNull() {
            addCriterion("medical_pay_desc3 is not null");
            return (Criteria) this;
        }

        public Criteria andMedicalPayDesc3EqualTo(String value) {
            addCriterion("medical_pay_desc3 =", value, "medicalPayDesc3");
            return (Criteria) this;
        }

        public Criteria andMedicalPayDesc3NotEqualTo(String value) {
            addCriterion("medical_pay_desc3 <>", value, "medicalPayDesc3");
            return (Criteria) this;
        }

        public Criteria andMedicalPayDesc3GreaterThan(String value) {
            addCriterion("medical_pay_desc3 >", value, "medicalPayDesc3");
            return (Criteria) this;
        }

        public Criteria andMedicalPayDesc3GreaterThanOrEqualTo(String value) {
            addCriterion("medical_pay_desc3 >=", value, "medicalPayDesc3");
            return (Criteria) this;
        }

        public Criteria andMedicalPayDesc3LessThan(String value) {
            addCriterion("medical_pay_desc3 <", value, "medicalPayDesc3");
            return (Criteria) this;
        }

        public Criteria andMedicalPayDesc3LessThanOrEqualTo(String value) {
            addCriterion("medical_pay_desc3 <=", value, "medicalPayDesc3");
            return (Criteria) this;
        }

        public Criteria andMedicalPayDesc3Like(String value) {
            addCriterion("medical_pay_desc3 like", value, "medicalPayDesc3");
            return (Criteria) this;
        }

        public Criteria andMedicalPayDesc3NotLike(String value) {
            addCriterion("medical_pay_desc3 not like", value, "medicalPayDesc3");
            return (Criteria) this;
        }

        public Criteria andMedicalPayDesc3In(List<String> values) {
            addCriterion("medical_pay_desc3 in", values, "medicalPayDesc3");
            return (Criteria) this;
        }

        public Criteria andMedicalPayDesc3NotIn(List<String> values) {
            addCriterion("medical_pay_desc3 not in", values, "medicalPayDesc3");
            return (Criteria) this;
        }

        public Criteria andMedicalPayDesc3Between(String value1, String value2) {
            addCriterion("medical_pay_desc3 between", value1, value2, "medicalPayDesc3");
            return (Criteria) this;
        }

        public Criteria andMedicalPayDesc3NotBetween(String value1, String value2) {
            addCriterion("medical_pay_desc3 not between", value1, value2, "medicalPayDesc3");
            return (Criteria) this;
        }

        public Criteria andMedicalPayDesc4IsNull() {
            addCriterion("medical_pay_desc4 is null");
            return (Criteria) this;
        }

        public Criteria andMedicalPayDesc4IsNotNull() {
            addCriterion("medical_pay_desc4 is not null");
            return (Criteria) this;
        }

        public Criteria andMedicalPayDesc4EqualTo(String value) {
            addCriterion("medical_pay_desc4 =", value, "medicalPayDesc4");
            return (Criteria) this;
        }

        public Criteria andMedicalPayDesc4NotEqualTo(String value) {
            addCriterion("medical_pay_desc4 <>", value, "medicalPayDesc4");
            return (Criteria) this;
        }

        public Criteria andMedicalPayDesc4GreaterThan(String value) {
            addCriterion("medical_pay_desc4 >", value, "medicalPayDesc4");
            return (Criteria) this;
        }

        public Criteria andMedicalPayDesc4GreaterThanOrEqualTo(String value) {
            addCriterion("medical_pay_desc4 >=", value, "medicalPayDesc4");
            return (Criteria) this;
        }

        public Criteria andMedicalPayDesc4LessThan(String value) {
            addCriterion("medical_pay_desc4 <", value, "medicalPayDesc4");
            return (Criteria) this;
        }

        public Criteria andMedicalPayDesc4LessThanOrEqualTo(String value) {
            addCriterion("medical_pay_desc4 <=", value, "medicalPayDesc4");
            return (Criteria) this;
        }

        public Criteria andMedicalPayDesc4Like(String value) {
            addCriterion("medical_pay_desc4 like", value, "medicalPayDesc4");
            return (Criteria) this;
        }

        public Criteria andMedicalPayDesc4NotLike(String value) {
            addCriterion("medical_pay_desc4 not like", value, "medicalPayDesc4");
            return (Criteria) this;
        }

        public Criteria andMedicalPayDesc4In(List<String> values) {
            addCriterion("medical_pay_desc4 in", values, "medicalPayDesc4");
            return (Criteria) this;
        }

        public Criteria andMedicalPayDesc4NotIn(List<String> values) {
            addCriterion("medical_pay_desc4 not in", values, "medicalPayDesc4");
            return (Criteria) this;
        }

        public Criteria andMedicalPayDesc4Between(String value1, String value2) {
            addCriterion("medical_pay_desc4 between", value1, value2, "medicalPayDesc4");
            return (Criteria) this;
        }

        public Criteria andMedicalPayDesc4NotBetween(String value1, String value2) {
            addCriterion("medical_pay_desc4 not between", value1, value2, "medicalPayDesc4");
            return (Criteria) this;
        }

        public Criteria andMedicalPayDesc5IsNull() {
            addCriterion("medical_pay_desc5 is null");
            return (Criteria) this;
        }

        public Criteria andMedicalPayDesc5IsNotNull() {
            addCriterion("medical_pay_desc5 is not null");
            return (Criteria) this;
        }

        public Criteria andMedicalPayDesc5EqualTo(String value) {
            addCriterion("medical_pay_desc5 =", value, "medicalPayDesc5");
            return (Criteria) this;
        }

        public Criteria andMedicalPayDesc5NotEqualTo(String value) {
            addCriterion("medical_pay_desc5 <>", value, "medicalPayDesc5");
            return (Criteria) this;
        }

        public Criteria andMedicalPayDesc5GreaterThan(String value) {
            addCriterion("medical_pay_desc5 >", value, "medicalPayDesc5");
            return (Criteria) this;
        }

        public Criteria andMedicalPayDesc5GreaterThanOrEqualTo(String value) {
            addCriterion("medical_pay_desc5 >=", value, "medicalPayDesc5");
            return (Criteria) this;
        }

        public Criteria andMedicalPayDesc5LessThan(String value) {
            addCriterion("medical_pay_desc5 <", value, "medicalPayDesc5");
            return (Criteria) this;
        }

        public Criteria andMedicalPayDesc5LessThanOrEqualTo(String value) {
            addCriterion("medical_pay_desc5 <=", value, "medicalPayDesc5");
            return (Criteria) this;
        }

        public Criteria andMedicalPayDesc5Like(String value) {
            addCriterion("medical_pay_desc5 like", value, "medicalPayDesc5");
            return (Criteria) this;
        }

        public Criteria andMedicalPayDesc5NotLike(String value) {
            addCriterion("medical_pay_desc5 not like", value, "medicalPayDesc5");
            return (Criteria) this;
        }

        public Criteria andMedicalPayDesc5In(List<String> values) {
            addCriterion("medical_pay_desc5 in", values, "medicalPayDesc5");
            return (Criteria) this;
        }

        public Criteria andMedicalPayDesc5NotIn(List<String> values) {
            addCriterion("medical_pay_desc5 not in", values, "medicalPayDesc5");
            return (Criteria) this;
        }

        public Criteria andMedicalPayDesc5Between(String value1, String value2) {
            addCriterion("medical_pay_desc5 between", value1, value2, "medicalPayDesc5");
            return (Criteria) this;
        }

        public Criteria andMedicalPayDesc5NotBetween(String value1, String value2) {
            addCriterion("medical_pay_desc5 not between", value1, value2, "medicalPayDesc5");
            return (Criteria) this;
        }

        public Criteria andMedicalPayDesc6IsNull() {
            addCriterion("medical_pay_desc6 is null");
            return (Criteria) this;
        }

        public Criteria andMedicalPayDesc6IsNotNull() {
            addCriterion("medical_pay_desc6 is not null");
            return (Criteria) this;
        }

        public Criteria andMedicalPayDesc6EqualTo(String value) {
            addCriterion("medical_pay_desc6 =", value, "medicalPayDesc6");
            return (Criteria) this;
        }

        public Criteria andMedicalPayDesc6NotEqualTo(String value) {
            addCriterion("medical_pay_desc6 <>", value, "medicalPayDesc6");
            return (Criteria) this;
        }

        public Criteria andMedicalPayDesc6GreaterThan(String value) {
            addCriterion("medical_pay_desc6 >", value, "medicalPayDesc6");
            return (Criteria) this;
        }

        public Criteria andMedicalPayDesc6GreaterThanOrEqualTo(String value) {
            addCriterion("medical_pay_desc6 >=", value, "medicalPayDesc6");
            return (Criteria) this;
        }

        public Criteria andMedicalPayDesc6LessThan(String value) {
            addCriterion("medical_pay_desc6 <", value, "medicalPayDesc6");
            return (Criteria) this;
        }

        public Criteria andMedicalPayDesc6LessThanOrEqualTo(String value) {
            addCriterion("medical_pay_desc6 <=", value, "medicalPayDesc6");
            return (Criteria) this;
        }

        public Criteria andMedicalPayDesc6Like(String value) {
            addCriterion("medical_pay_desc6 like", value, "medicalPayDesc6");
            return (Criteria) this;
        }

        public Criteria andMedicalPayDesc6NotLike(String value) {
            addCriterion("medical_pay_desc6 not like", value, "medicalPayDesc6");
            return (Criteria) this;
        }

        public Criteria andMedicalPayDesc6In(List<String> values) {
            addCriterion("medical_pay_desc6 in", values, "medicalPayDesc6");
            return (Criteria) this;
        }

        public Criteria andMedicalPayDesc6NotIn(List<String> values) {
            addCriterion("medical_pay_desc6 not in", values, "medicalPayDesc6");
            return (Criteria) this;
        }

        public Criteria andMedicalPayDesc6Between(String value1, String value2) {
            addCriterion("medical_pay_desc6 between", value1, value2, "medicalPayDesc6");
            return (Criteria) this;
        }

        public Criteria andMedicalPayDesc6NotBetween(String value1, String value2) {
            addCriterion("medical_pay_desc6 not between", value1, value2, "medicalPayDesc6");
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