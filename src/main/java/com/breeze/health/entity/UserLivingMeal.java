package com.breeze.health.entity;

import java.util.Date;

public class UserLivingMeal {
    private Long id;

    private Long livingId;

    private Integer meal;

    private Integer breakfast;

    private Integer extraMeal1;

    private Integer lunch;

    private Integer extraMeal2;

    private Integer dinner;

    private Integer nightingale;

    private String mealDesc;

    private Integer alizarin;

    private Integer preference;

    private Integer special;

    private String specialOther;

    private Integer sweets;

    private Integer fruit;

    private Integer sugaryDrink;

    private Date createTime;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getLivingId() {
        return livingId;
    }

    public void setLivingId(Long livingId) {
        this.livingId = livingId;
    }

    public Integer getMeal() {
        return meal;
    }

    public void setMeal(Integer meal) {
        this.meal = meal;
    }

    public Integer getBreakfast() {
        return breakfast;
    }

    public void setBreakfast(Integer breakfast) {
        this.breakfast = breakfast;
    }

    public Integer getExtraMeal1() {
        return extraMeal1;
    }

    public void setExtraMeal1(Integer extraMeal1) {
        this.extraMeal1 = extraMeal1;
    }

    public Integer getLunch() {
        return lunch;
    }

    public void setLunch(Integer lunch) {
        this.lunch = lunch;
    }

    public Integer getExtraMeal2() {
        return extraMeal2;
    }

    public void setExtraMeal2(Integer extraMeal2) {
        this.extraMeal2 = extraMeal2;
    }

    public Integer getDinner() {
        return dinner;
    }

    public void setDinner(Integer dinner) {
        this.dinner = dinner;
    }

    public Integer getNightingale() {
        return nightingale;
    }

    public void setNightingale(Integer nightingale) {
        this.nightingale = nightingale;
    }

    public String getMealDesc() {
        return mealDesc;
    }

    public void setMealDesc(String mealDesc) {
        this.mealDesc = mealDesc == null ? null : mealDesc.trim();
    }

    public Integer getAlizarin() {
        return alizarin;
    }

    public void setAlizarin(Integer alizarin) {
        this.alizarin = alizarin;
    }

    public Integer getPreference() {
        return preference;
    }

    public void setPreference(Integer preference) {
        this.preference = preference;
    }

    public Integer getSpecial() {
        return special;
    }

    public void setSpecial(Integer special) {
        this.special = special;
    }

    public String getSpecialOther() {
        return specialOther;
    }

    public void setSpecialOther(String specialOther) {
        this.specialOther = specialOther == null ? null : specialOther.trim();
    }

    public Integer getSweets() {
        return sweets;
    }

    public void setSweets(Integer sweets) {
        this.sweets = sweets;
    }

    public Integer getFruit() {
        return fruit;
    }

    public void setFruit(Integer fruit) {
        this.fruit = fruit;
    }

    public Integer getSugaryDrink() {
        return sugaryDrink;
    }

    public void setSugaryDrink(Integer sugaryDrink) {
        this.sugaryDrink = sugaryDrink;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}