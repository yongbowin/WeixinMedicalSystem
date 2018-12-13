package com.clouds.igankong.po;

import java.util.ArrayList;
import java.util.List;

public class SharpInjuryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SharpInjuryExample() {
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSOpenidIsNull() {
            addCriterion("s_openID is null");
            return (Criteria) this;
        }

        public Criteria andSOpenidIsNotNull() {
            addCriterion("s_openID is not null");
            return (Criteria) this;
        }

        public Criteria andSOpenidEqualTo(String value) {
            addCriterion("s_openID =", value, "sOpenid");
            return (Criteria) this;
        }

        public Criteria andSOpenidNotEqualTo(String value) {
            addCriterion("s_openID <>", value, "sOpenid");
            return (Criteria) this;
        }

        public Criteria andSOpenidGreaterThan(String value) {
            addCriterion("s_openID >", value, "sOpenid");
            return (Criteria) this;
        }

        public Criteria andSOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("s_openID >=", value, "sOpenid");
            return (Criteria) this;
        }

        public Criteria andSOpenidLessThan(String value) {
            addCriterion("s_openID <", value, "sOpenid");
            return (Criteria) this;
        }

        public Criteria andSOpenidLessThanOrEqualTo(String value) {
            addCriterion("s_openID <=", value, "sOpenid");
            return (Criteria) this;
        }

        public Criteria andSOpenidLike(String value) {
            addCriterion("s_openID like", value, "sOpenid");
            return (Criteria) this;
        }

        public Criteria andSOpenidNotLike(String value) {
            addCriterion("s_openID not like", value, "sOpenid");
            return (Criteria) this;
        }

        public Criteria andSOpenidIn(List<String> values) {
            addCriterion("s_openID in", values, "sOpenid");
            return (Criteria) this;
        }

        public Criteria andSOpenidNotIn(List<String> values) {
            addCriterion("s_openID not in", values, "sOpenid");
            return (Criteria) this;
        }

        public Criteria andSOpenidBetween(String value1, String value2) {
            addCriterion("s_openID between", value1, value2, "sOpenid");
            return (Criteria) this;
        }

        public Criteria andSOpenidNotBetween(String value1, String value2) {
            addCriterion("s_openID not between", value1, value2, "sOpenid");
            return (Criteria) this;
        }

        public Criteria andSPlaceIsNull() {
            addCriterion("s_place is null");
            return (Criteria) this;
        }

        public Criteria andSPlaceIsNotNull() {
            addCriterion("s_place is not null");
            return (Criteria) this;
        }

        public Criteria andSPlaceEqualTo(String value) {
            addCriterion("s_place =", value, "sPlace");
            return (Criteria) this;
        }

        public Criteria andSPlaceNotEqualTo(String value) {
            addCriterion("s_place <>", value, "sPlace");
            return (Criteria) this;
        }

        public Criteria andSPlaceGreaterThan(String value) {
            addCriterion("s_place >", value, "sPlace");
            return (Criteria) this;
        }

        public Criteria andSPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("s_place >=", value, "sPlace");
            return (Criteria) this;
        }

        public Criteria andSPlaceLessThan(String value) {
            addCriterion("s_place <", value, "sPlace");
            return (Criteria) this;
        }

        public Criteria andSPlaceLessThanOrEqualTo(String value) {
            addCriterion("s_place <=", value, "sPlace");
            return (Criteria) this;
        }

        public Criteria andSPlaceLike(String value) {
            addCriterion("s_place like", value, "sPlace");
            return (Criteria) this;
        }

        public Criteria andSPlaceNotLike(String value) {
            addCriterion("s_place not like", value, "sPlace");
            return (Criteria) this;
        }

        public Criteria andSPlaceIn(List<String> values) {
            addCriterion("s_place in", values, "sPlace");
            return (Criteria) this;
        }

        public Criteria andSPlaceNotIn(List<String> values) {
            addCriterion("s_place not in", values, "sPlace");
            return (Criteria) this;
        }

        public Criteria andSPlaceBetween(String value1, String value2) {
            addCriterion("s_place between", value1, value2, "sPlace");
            return (Criteria) this;
        }

        public Criteria andSPlaceNotBetween(String value1, String value2) {
            addCriterion("s_place not between", value1, value2, "sPlace");
            return (Criteria) this;
        }

        public Criteria andSTypeIsNull() {
            addCriterion("s_type is null");
            return (Criteria) this;
        }

        public Criteria andSTypeIsNotNull() {
            addCriterion("s_type is not null");
            return (Criteria) this;
        }

        public Criteria andSTypeEqualTo(String value) {
            addCriterion("s_type =", value, "sType");
            return (Criteria) this;
        }

        public Criteria andSTypeNotEqualTo(String value) {
            addCriterion("s_type <>", value, "sType");
            return (Criteria) this;
        }

        public Criteria andSTypeGreaterThan(String value) {
            addCriterion("s_type >", value, "sType");
            return (Criteria) this;
        }

        public Criteria andSTypeGreaterThanOrEqualTo(String value) {
            addCriterion("s_type >=", value, "sType");
            return (Criteria) this;
        }

        public Criteria andSTypeLessThan(String value) {
            addCriterion("s_type <", value, "sType");
            return (Criteria) this;
        }

        public Criteria andSTypeLessThanOrEqualTo(String value) {
            addCriterion("s_type <=", value, "sType");
            return (Criteria) this;
        }

        public Criteria andSTypeLike(String value) {
            addCriterion("s_type like", value, "sType");
            return (Criteria) this;
        }

        public Criteria andSTypeNotLike(String value) {
            addCriterion("s_type not like", value, "sType");
            return (Criteria) this;
        }

        public Criteria andSTypeIn(List<String> values) {
            addCriterion("s_type in", values, "sType");
            return (Criteria) this;
        }

        public Criteria andSTypeNotIn(List<String> values) {
            addCriterion("s_type not in", values, "sType");
            return (Criteria) this;
        }

        public Criteria andSTypeBetween(String value1, String value2) {
            addCriterion("s_type between", value1, value2, "sType");
            return (Criteria) this;
        }

        public Criteria andSTypeNotBetween(String value1, String value2) {
            addCriterion("s_type not between", value1, value2, "sType");
            return (Criteria) this;
        }

        public Criteria andSStartTimeIsNull() {
            addCriterion("s_start_time is null");
            return (Criteria) this;
        }

        public Criteria andSStartTimeIsNotNull() {
            addCriterion("s_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andSStartTimeEqualTo(String value) {
            addCriterion("s_start_time =", value, "sStartTime");
            return (Criteria) this;
        }

        public Criteria andSStartTimeNotEqualTo(String value) {
            addCriterion("s_start_time <>", value, "sStartTime");
            return (Criteria) this;
        }

        public Criteria andSStartTimeGreaterThan(String value) {
            addCriterion("s_start_time >", value, "sStartTime");
            return (Criteria) this;
        }

        public Criteria andSStartTimeGreaterThanOrEqualTo(String value) {
            addCriterion("s_start_time >=", value, "sStartTime");
            return (Criteria) this;
        }

        public Criteria andSStartTimeLessThan(String value) {
            addCriterion("s_start_time <", value, "sStartTime");
            return (Criteria) this;
        }

        public Criteria andSStartTimeLessThanOrEqualTo(String value) {
            addCriterion("s_start_time <=", value, "sStartTime");
            return (Criteria) this;
        }

        public Criteria andSStartTimeLike(String value) {
            addCriterion("s_start_time like", value, "sStartTime");
            return (Criteria) this;
        }

        public Criteria andSStartTimeNotLike(String value) {
            addCriterion("s_start_time not like", value, "sStartTime");
            return (Criteria) this;
        }

        public Criteria andSStartTimeIn(List<String> values) {
            addCriterion("s_start_time in", values, "sStartTime");
            return (Criteria) this;
        }

        public Criteria andSStartTimeNotIn(List<String> values) {
            addCriterion("s_start_time not in", values, "sStartTime");
            return (Criteria) this;
        }

        public Criteria andSStartTimeBetween(String value1, String value2) {
            addCriterion("s_start_time between", value1, value2, "sStartTime");
            return (Criteria) this;
        }

        public Criteria andSStartTimeNotBetween(String value1, String value2) {
            addCriterion("s_start_time not between", value1, value2, "sStartTime");
            return (Criteria) this;
        }

        public Criteria andSUseStatusIsNull() {
            addCriterion("s_use_status is null");
            return (Criteria) this;
        }

        public Criteria andSUseStatusIsNotNull() {
            addCriterion("s_use_status is not null");
            return (Criteria) this;
        }

        public Criteria andSUseStatusEqualTo(String value) {
            addCriterion("s_use_status =", value, "sUseStatus");
            return (Criteria) this;
        }

        public Criteria andSUseStatusNotEqualTo(String value) {
            addCriterion("s_use_status <>", value, "sUseStatus");
            return (Criteria) this;
        }

        public Criteria andSUseStatusGreaterThan(String value) {
            addCriterion("s_use_status >", value, "sUseStatus");
            return (Criteria) this;
        }

        public Criteria andSUseStatusGreaterThanOrEqualTo(String value) {
            addCriterion("s_use_status >=", value, "sUseStatus");
            return (Criteria) this;
        }

        public Criteria andSUseStatusLessThan(String value) {
            addCriterion("s_use_status <", value, "sUseStatus");
            return (Criteria) this;
        }

        public Criteria andSUseStatusLessThanOrEqualTo(String value) {
            addCriterion("s_use_status <=", value, "sUseStatus");
            return (Criteria) this;
        }

        public Criteria andSUseStatusLike(String value) {
            addCriterion("s_use_status like", value, "sUseStatus");
            return (Criteria) this;
        }

        public Criteria andSUseStatusNotLike(String value) {
            addCriterion("s_use_status not like", value, "sUseStatus");
            return (Criteria) this;
        }

        public Criteria andSUseStatusIn(List<String> values) {
            addCriterion("s_use_status in", values, "sUseStatus");
            return (Criteria) this;
        }

        public Criteria andSUseStatusNotIn(List<String> values) {
            addCriterion("s_use_status not in", values, "sUseStatus");
            return (Criteria) this;
        }

        public Criteria andSUseStatusBetween(String value1, String value2) {
            addCriterion("s_use_status between", value1, value2, "sUseStatus");
            return (Criteria) this;
        }

        public Criteria andSUseStatusNotBetween(String value1, String value2) {
            addCriterion("s_use_status not between", value1, value2, "sUseStatus");
            return (Criteria) this;
        }

        public Criteria andSPollutionSituIsNull() {
            addCriterion("s_pollution_situ is null");
            return (Criteria) this;
        }

        public Criteria andSPollutionSituIsNotNull() {
            addCriterion("s_pollution_situ is not null");
            return (Criteria) this;
        }

        public Criteria andSPollutionSituEqualTo(String value) {
            addCriterion("s_pollution_situ =", value, "sPollutionSitu");
            return (Criteria) this;
        }

        public Criteria andSPollutionSituNotEqualTo(String value) {
            addCriterion("s_pollution_situ <>", value, "sPollutionSitu");
            return (Criteria) this;
        }

        public Criteria andSPollutionSituGreaterThan(String value) {
            addCriterion("s_pollution_situ >", value, "sPollutionSitu");
            return (Criteria) this;
        }

        public Criteria andSPollutionSituGreaterThanOrEqualTo(String value) {
            addCriterion("s_pollution_situ >=", value, "sPollutionSitu");
            return (Criteria) this;
        }

        public Criteria andSPollutionSituLessThan(String value) {
            addCriterion("s_pollution_situ <", value, "sPollutionSitu");
            return (Criteria) this;
        }

        public Criteria andSPollutionSituLessThanOrEqualTo(String value) {
            addCriterion("s_pollution_situ <=", value, "sPollutionSitu");
            return (Criteria) this;
        }

        public Criteria andSPollutionSituLike(String value) {
            addCriterion("s_pollution_situ like", value, "sPollutionSitu");
            return (Criteria) this;
        }

        public Criteria andSPollutionSituNotLike(String value) {
            addCriterion("s_pollution_situ not like", value, "sPollutionSitu");
            return (Criteria) this;
        }

        public Criteria andSPollutionSituIn(List<String> values) {
            addCriterion("s_pollution_situ in", values, "sPollutionSitu");
            return (Criteria) this;
        }

        public Criteria andSPollutionSituNotIn(List<String> values) {
            addCriterion("s_pollution_situ not in", values, "sPollutionSitu");
            return (Criteria) this;
        }

        public Criteria andSPollutionSituBetween(String value1, String value2) {
            addCriterion("s_pollution_situ between", value1, value2, "sPollutionSitu");
            return (Criteria) this;
        }

        public Criteria andSPollutionSituNotBetween(String value1, String value2) {
            addCriterion("s_pollution_situ not between", value1, value2, "sPollutionSitu");
            return (Criteria) this;
        }

        public Criteria andSBloodPollIsNull() {
            addCriterion("s_blood_poll is null");
            return (Criteria) this;
        }

        public Criteria andSBloodPollIsNotNull() {
            addCriterion("s_blood_poll is not null");
            return (Criteria) this;
        }

        public Criteria andSBloodPollEqualTo(String value) {
            addCriterion("s_blood_poll =", value, "sBloodPoll");
            return (Criteria) this;
        }

        public Criteria andSBloodPollNotEqualTo(String value) {
            addCriterion("s_blood_poll <>", value, "sBloodPoll");
            return (Criteria) this;
        }

        public Criteria andSBloodPollGreaterThan(String value) {
            addCriterion("s_blood_poll >", value, "sBloodPoll");
            return (Criteria) this;
        }

        public Criteria andSBloodPollGreaterThanOrEqualTo(String value) {
            addCriterion("s_blood_poll >=", value, "sBloodPoll");
            return (Criteria) this;
        }

        public Criteria andSBloodPollLessThan(String value) {
            addCriterion("s_blood_poll <", value, "sBloodPoll");
            return (Criteria) this;
        }

        public Criteria andSBloodPollLessThanOrEqualTo(String value) {
            addCriterion("s_blood_poll <=", value, "sBloodPoll");
            return (Criteria) this;
        }

        public Criteria andSBloodPollLike(String value) {
            addCriterion("s_blood_poll like", value, "sBloodPoll");
            return (Criteria) this;
        }

        public Criteria andSBloodPollNotLike(String value) {
            addCriterion("s_blood_poll not like", value, "sBloodPoll");
            return (Criteria) this;
        }

        public Criteria andSBloodPollIn(List<String> values) {
            addCriterion("s_blood_poll in", values, "sBloodPoll");
            return (Criteria) this;
        }

        public Criteria andSBloodPollNotIn(List<String> values) {
            addCriterion("s_blood_poll not in", values, "sBloodPoll");
            return (Criteria) this;
        }

        public Criteria andSBloodPollBetween(String value1, String value2) {
            addCriterion("s_blood_poll between", value1, value2, "sBloodPoll");
            return (Criteria) this;
        }

        public Criteria andSBloodPollNotBetween(String value1, String value2) {
            addCriterion("s_blood_poll not between", value1, value2, "sBloodPoll");
            return (Criteria) this;
        }

        public Criteria andSGloveStatusIsNull() {
            addCriterion("s_glove_status is null");
            return (Criteria) this;
        }

        public Criteria andSGloveStatusIsNotNull() {
            addCriterion("s_glove_status is not null");
            return (Criteria) this;
        }

        public Criteria andSGloveStatusEqualTo(String value) {
            addCriterion("s_glove_status =", value, "sGloveStatus");
            return (Criteria) this;
        }

        public Criteria andSGloveStatusNotEqualTo(String value) {
            addCriterion("s_glove_status <>", value, "sGloveStatus");
            return (Criteria) this;
        }

        public Criteria andSGloveStatusGreaterThan(String value) {
            addCriterion("s_glove_status >", value, "sGloveStatus");
            return (Criteria) this;
        }

        public Criteria andSGloveStatusGreaterThanOrEqualTo(String value) {
            addCriterion("s_glove_status >=", value, "sGloveStatus");
            return (Criteria) this;
        }

        public Criteria andSGloveStatusLessThan(String value) {
            addCriterion("s_glove_status <", value, "sGloveStatus");
            return (Criteria) this;
        }

        public Criteria andSGloveStatusLessThanOrEqualTo(String value) {
            addCriterion("s_glove_status <=", value, "sGloveStatus");
            return (Criteria) this;
        }

        public Criteria andSGloveStatusLike(String value) {
            addCriterion("s_glove_status like", value, "sGloveStatus");
            return (Criteria) this;
        }

        public Criteria andSGloveStatusNotLike(String value) {
            addCriterion("s_glove_status not like", value, "sGloveStatus");
            return (Criteria) this;
        }

        public Criteria andSGloveStatusIn(List<String> values) {
            addCriterion("s_glove_status in", values, "sGloveStatus");
            return (Criteria) this;
        }

        public Criteria andSGloveStatusNotIn(List<String> values) {
            addCriterion("s_glove_status not in", values, "sGloveStatus");
            return (Criteria) this;
        }

        public Criteria andSGloveStatusBetween(String value1, String value2) {
            addCriterion("s_glove_status between", value1, value2, "sGloveStatus");
            return (Criteria) this;
        }

        public Criteria andSGloveStatusNotBetween(String value1, String value2) {
            addCriterion("s_glove_status not between", value1, value2, "sGloveStatus");
            return (Criteria) this;
        }

        public Criteria andSExposePartIsNull() {
            addCriterion("s_expose_part is null");
            return (Criteria) this;
        }

        public Criteria andSExposePartIsNotNull() {
            addCriterion("s_expose_part is not null");
            return (Criteria) this;
        }

        public Criteria andSExposePartEqualTo(String value) {
            addCriterion("s_expose_part =", value, "sExposePart");
            return (Criteria) this;
        }

        public Criteria andSExposePartNotEqualTo(String value) {
            addCriterion("s_expose_part <>", value, "sExposePart");
            return (Criteria) this;
        }

        public Criteria andSExposePartGreaterThan(String value) {
            addCriterion("s_expose_part >", value, "sExposePart");
            return (Criteria) this;
        }

        public Criteria andSExposePartGreaterThanOrEqualTo(String value) {
            addCriterion("s_expose_part >=", value, "sExposePart");
            return (Criteria) this;
        }

        public Criteria andSExposePartLessThan(String value) {
            addCriterion("s_expose_part <", value, "sExposePart");
            return (Criteria) this;
        }

        public Criteria andSExposePartLessThanOrEqualTo(String value) {
            addCriterion("s_expose_part <=", value, "sExposePart");
            return (Criteria) this;
        }

        public Criteria andSExposePartLike(String value) {
            addCriterion("s_expose_part like", value, "sExposePart");
            return (Criteria) this;
        }

        public Criteria andSExposePartNotLike(String value) {
            addCriterion("s_expose_part not like", value, "sExposePart");
            return (Criteria) this;
        }

        public Criteria andSExposePartIn(List<String> values) {
            addCriterion("s_expose_part in", values, "sExposePart");
            return (Criteria) this;
        }

        public Criteria andSExposePartNotIn(List<String> values) {
            addCriterion("s_expose_part not in", values, "sExposePart");
            return (Criteria) this;
        }

        public Criteria andSExposePartBetween(String value1, String value2) {
            addCriterion("s_expose_part between", value1, value2, "sExposePart");
            return (Criteria) this;
        }

        public Criteria andSExposePartNotBetween(String value1, String value2) {
            addCriterion("s_expose_part not between", value1, value2, "sExposePart");
            return (Criteria) this;
        }

        public Criteria andSOperateIsNull() {
            addCriterion("s_operate is null");
            return (Criteria) this;
        }

        public Criteria andSOperateIsNotNull() {
            addCriterion("s_operate is not null");
            return (Criteria) this;
        }

        public Criteria andSOperateEqualTo(String value) {
            addCriterion("s_operate =", value, "sOperate");
            return (Criteria) this;
        }

        public Criteria andSOperateNotEqualTo(String value) {
            addCriterion("s_operate <>", value, "sOperate");
            return (Criteria) this;
        }

        public Criteria andSOperateGreaterThan(String value) {
            addCriterion("s_operate >", value, "sOperate");
            return (Criteria) this;
        }

        public Criteria andSOperateGreaterThanOrEqualTo(String value) {
            addCriterion("s_operate >=", value, "sOperate");
            return (Criteria) this;
        }

        public Criteria andSOperateLessThan(String value) {
            addCriterion("s_operate <", value, "sOperate");
            return (Criteria) this;
        }

        public Criteria andSOperateLessThanOrEqualTo(String value) {
            addCriterion("s_operate <=", value, "sOperate");
            return (Criteria) this;
        }

        public Criteria andSOperateLike(String value) {
            addCriterion("s_operate like", value, "sOperate");
            return (Criteria) this;
        }

        public Criteria andSOperateNotLike(String value) {
            addCriterion("s_operate not like", value, "sOperate");
            return (Criteria) this;
        }

        public Criteria andSOperateIn(List<String> values) {
            addCriterion("s_operate in", values, "sOperate");
            return (Criteria) this;
        }

        public Criteria andSOperateNotIn(List<String> values) {
            addCriterion("s_operate not in", values, "sOperate");
            return (Criteria) this;
        }

        public Criteria andSOperateBetween(String value1, String value2) {
            addCriterion("s_operate between", value1, value2, "sOperate");
            return (Criteria) this;
        }

        public Criteria andSOperateNotBetween(String value1, String value2) {
            addCriterion("s_operate not between", value1, value2, "sOperate");
            return (Criteria) this;
        }

        public Criteria andSInjuryPartIsNull() {
            addCriterion("s_injury_part is null");
            return (Criteria) this;
        }

        public Criteria andSInjuryPartIsNotNull() {
            addCriterion("s_injury_part is not null");
            return (Criteria) this;
        }

        public Criteria andSInjuryPartEqualTo(String value) {
            addCriterion("s_injury_part =", value, "sInjuryPart");
            return (Criteria) this;
        }

        public Criteria andSInjuryPartNotEqualTo(String value) {
            addCriterion("s_injury_part <>", value, "sInjuryPart");
            return (Criteria) this;
        }

        public Criteria andSInjuryPartGreaterThan(String value) {
            addCriterion("s_injury_part >", value, "sInjuryPart");
            return (Criteria) this;
        }

        public Criteria andSInjuryPartGreaterThanOrEqualTo(String value) {
            addCriterion("s_injury_part >=", value, "sInjuryPart");
            return (Criteria) this;
        }

        public Criteria andSInjuryPartLessThan(String value) {
            addCriterion("s_injury_part <", value, "sInjuryPart");
            return (Criteria) this;
        }

        public Criteria andSInjuryPartLessThanOrEqualTo(String value) {
            addCriterion("s_injury_part <=", value, "sInjuryPart");
            return (Criteria) this;
        }

        public Criteria andSInjuryPartLike(String value) {
            addCriterion("s_injury_part like", value, "sInjuryPart");
            return (Criteria) this;
        }

        public Criteria andSInjuryPartNotLike(String value) {
            addCriterion("s_injury_part not like", value, "sInjuryPart");
            return (Criteria) this;
        }

        public Criteria andSInjuryPartIn(List<String> values) {
            addCriterion("s_injury_part in", values, "sInjuryPart");
            return (Criteria) this;
        }

        public Criteria andSInjuryPartNotIn(List<String> values) {
            addCriterion("s_injury_part not in", values, "sInjuryPart");
            return (Criteria) this;
        }

        public Criteria andSInjuryPartBetween(String value1, String value2) {
            addCriterion("s_injury_part between", value1, value2, "sInjuryPart");
            return (Criteria) this;
        }

        public Criteria andSInjuryPartNotBetween(String value1, String value2) {
            addCriterion("s_injury_part not between", value1, value2, "sInjuryPart");
            return (Criteria) this;
        }

        public Criteria andSGestationStatusIsNull() {
            addCriterion("s_gestation_status is null");
            return (Criteria) this;
        }

        public Criteria andSGestationStatusIsNotNull() {
            addCriterion("s_gestation_status is not null");
            return (Criteria) this;
        }

        public Criteria andSGestationStatusEqualTo(String value) {
            addCriterion("s_gestation_status =", value, "sGestationStatus");
            return (Criteria) this;
        }

        public Criteria andSGestationStatusNotEqualTo(String value) {
            addCriterion("s_gestation_status <>", value, "sGestationStatus");
            return (Criteria) this;
        }

        public Criteria andSGestationStatusGreaterThan(String value) {
            addCriterion("s_gestation_status >", value, "sGestationStatus");
            return (Criteria) this;
        }

        public Criteria andSGestationStatusGreaterThanOrEqualTo(String value) {
            addCriterion("s_gestation_status >=", value, "sGestationStatus");
            return (Criteria) this;
        }

        public Criteria andSGestationStatusLessThan(String value) {
            addCriterion("s_gestation_status <", value, "sGestationStatus");
            return (Criteria) this;
        }

        public Criteria andSGestationStatusLessThanOrEqualTo(String value) {
            addCriterion("s_gestation_status <=", value, "sGestationStatus");
            return (Criteria) this;
        }

        public Criteria andSGestationStatusLike(String value) {
            addCriterion("s_gestation_status like", value, "sGestationStatus");
            return (Criteria) this;
        }

        public Criteria andSGestationStatusNotLike(String value) {
            addCriterion("s_gestation_status not like", value, "sGestationStatus");
            return (Criteria) this;
        }

        public Criteria andSGestationStatusIn(List<String> values) {
            addCriterion("s_gestation_status in", values, "sGestationStatus");
            return (Criteria) this;
        }

        public Criteria andSGestationStatusNotIn(List<String> values) {
            addCriterion("s_gestation_status not in", values, "sGestationStatus");
            return (Criteria) this;
        }

        public Criteria andSGestationStatusBetween(String value1, String value2) {
            addCriterion("s_gestation_status between", value1, value2, "sGestationStatus");
            return (Criteria) this;
        }

        public Criteria andSGestationStatusNotBetween(String value1, String value2) {
            addCriterion("s_gestation_status not between", value1, value2, "sGestationStatus");
            return (Criteria) this;
        }

        public Criteria andSHabitHandIsNull() {
            addCriterion("s_habit_hand is null");
            return (Criteria) this;
        }

        public Criteria andSHabitHandIsNotNull() {
            addCriterion("s_habit_hand is not null");
            return (Criteria) this;
        }

        public Criteria andSHabitHandEqualTo(String value) {
            addCriterion("s_habit_hand =", value, "sHabitHand");
            return (Criteria) this;
        }

        public Criteria andSHabitHandNotEqualTo(String value) {
            addCriterion("s_habit_hand <>", value, "sHabitHand");
            return (Criteria) this;
        }

        public Criteria andSHabitHandGreaterThan(String value) {
            addCriterion("s_habit_hand >", value, "sHabitHand");
            return (Criteria) this;
        }

        public Criteria andSHabitHandGreaterThanOrEqualTo(String value) {
            addCriterion("s_habit_hand >=", value, "sHabitHand");
            return (Criteria) this;
        }

        public Criteria andSHabitHandLessThan(String value) {
            addCriterion("s_habit_hand <", value, "sHabitHand");
            return (Criteria) this;
        }

        public Criteria andSHabitHandLessThanOrEqualTo(String value) {
            addCriterion("s_habit_hand <=", value, "sHabitHand");
            return (Criteria) this;
        }

        public Criteria andSHabitHandLike(String value) {
            addCriterion("s_habit_hand like", value, "sHabitHand");
            return (Criteria) this;
        }

        public Criteria andSHabitHandNotLike(String value) {
            addCriterion("s_habit_hand not like", value, "sHabitHand");
            return (Criteria) this;
        }

        public Criteria andSHabitHandIn(List<String> values) {
            addCriterion("s_habit_hand in", values, "sHabitHand");
            return (Criteria) this;
        }

        public Criteria andSHabitHandNotIn(List<String> values) {
            addCriterion("s_habit_hand not in", values, "sHabitHand");
            return (Criteria) this;
        }

        public Criteria andSHabitHandBetween(String value1, String value2) {
            addCriterion("s_habit_hand between", value1, value2, "sHabitHand");
            return (Criteria) this;
        }

        public Criteria andSHabitHandNotBetween(String value1, String value2) {
            addCriterion("s_habit_hand not between", value1, value2, "sHabitHand");
            return (Criteria) this;
        }

        public Criteria andSInjuryDegreeIsNull() {
            addCriterion("s_injury_degree is null");
            return (Criteria) this;
        }

        public Criteria andSInjuryDegreeIsNotNull() {
            addCriterion("s_injury_degree is not null");
            return (Criteria) this;
        }

        public Criteria andSInjuryDegreeEqualTo(String value) {
            addCriterion("s_injury_degree =", value, "sInjuryDegree");
            return (Criteria) this;
        }

        public Criteria andSInjuryDegreeNotEqualTo(String value) {
            addCriterion("s_injury_degree <>", value, "sInjuryDegree");
            return (Criteria) this;
        }

        public Criteria andSInjuryDegreeGreaterThan(String value) {
            addCriterion("s_injury_degree >", value, "sInjuryDegree");
            return (Criteria) this;
        }

        public Criteria andSInjuryDegreeGreaterThanOrEqualTo(String value) {
            addCriterion("s_injury_degree >=", value, "sInjuryDegree");
            return (Criteria) this;
        }

        public Criteria andSInjuryDegreeLessThan(String value) {
            addCriterion("s_injury_degree <", value, "sInjuryDegree");
            return (Criteria) this;
        }

        public Criteria andSInjuryDegreeLessThanOrEqualTo(String value) {
            addCriterion("s_injury_degree <=", value, "sInjuryDegree");
            return (Criteria) this;
        }

        public Criteria andSInjuryDegreeLike(String value) {
            addCriterion("s_injury_degree like", value, "sInjuryDegree");
            return (Criteria) this;
        }

        public Criteria andSInjuryDegreeNotLike(String value) {
            addCriterion("s_injury_degree not like", value, "sInjuryDegree");
            return (Criteria) this;
        }

        public Criteria andSInjuryDegreeIn(List<String> values) {
            addCriterion("s_injury_degree in", values, "sInjuryDegree");
            return (Criteria) this;
        }

        public Criteria andSInjuryDegreeNotIn(List<String> values) {
            addCriterion("s_injury_degree not in", values, "sInjuryDegree");
            return (Criteria) this;
        }

        public Criteria andSInjuryDegreeBetween(String value1, String value2) {
            addCriterion("s_injury_degree between", value1, value2, "sInjuryDegree");
            return (Criteria) this;
        }

        public Criteria andSInjuryDegreeNotBetween(String value1, String value2) {
            addCriterion("s_injury_degree not between", value1, value2, "sInjuryDegree");
            return (Criteria) this;
        }

        public Criteria andSAfterHandleIsNull() {
            addCriterion("s_after_handle is null");
            return (Criteria) this;
        }

        public Criteria andSAfterHandleIsNotNull() {
            addCriterion("s_after_handle is not null");
            return (Criteria) this;
        }

        public Criteria andSAfterHandleEqualTo(String value) {
            addCriterion("s_after_handle =", value, "sAfterHandle");
            return (Criteria) this;
        }

        public Criteria andSAfterHandleNotEqualTo(String value) {
            addCriterion("s_after_handle <>", value, "sAfterHandle");
            return (Criteria) this;
        }

        public Criteria andSAfterHandleGreaterThan(String value) {
            addCriterion("s_after_handle >", value, "sAfterHandle");
            return (Criteria) this;
        }

        public Criteria andSAfterHandleGreaterThanOrEqualTo(String value) {
            addCriterion("s_after_handle >=", value, "sAfterHandle");
            return (Criteria) this;
        }

        public Criteria andSAfterHandleLessThan(String value) {
            addCriterion("s_after_handle <", value, "sAfterHandle");
            return (Criteria) this;
        }

        public Criteria andSAfterHandleLessThanOrEqualTo(String value) {
            addCriterion("s_after_handle <=", value, "sAfterHandle");
            return (Criteria) this;
        }

        public Criteria andSAfterHandleLike(String value) {
            addCriterion("s_after_handle like", value, "sAfterHandle");
            return (Criteria) this;
        }

        public Criteria andSAfterHandleNotLike(String value) {
            addCriterion("s_after_handle not like", value, "sAfterHandle");
            return (Criteria) this;
        }

        public Criteria andSAfterHandleIn(List<String> values) {
            addCriterion("s_after_handle in", values, "sAfterHandle");
            return (Criteria) this;
        }

        public Criteria andSAfterHandleNotIn(List<String> values) {
            addCriterion("s_after_handle not in", values, "sAfterHandle");
            return (Criteria) this;
        }

        public Criteria andSAfterHandleBetween(String value1, String value2) {
            addCriterion("s_after_handle between", value1, value2, "sAfterHandle");
            return (Criteria) this;
        }

        public Criteria andSAfterHandleNotBetween(String value1, String value2) {
            addCriterion("s_after_handle not between", value1, value2, "sAfterHandle");
            return (Criteria) this;
        }

        public Criteria andSWitnessIsNull() {
            addCriterion("s_witness is null");
            return (Criteria) this;
        }

        public Criteria andSWitnessIsNotNull() {
            addCriterion("s_witness is not null");
            return (Criteria) this;
        }

        public Criteria andSWitnessEqualTo(String value) {
            addCriterion("s_witness =", value, "sWitness");
            return (Criteria) this;
        }

        public Criteria andSWitnessNotEqualTo(String value) {
            addCriterion("s_witness <>", value, "sWitness");
            return (Criteria) this;
        }

        public Criteria andSWitnessGreaterThan(String value) {
            addCriterion("s_witness >", value, "sWitness");
            return (Criteria) this;
        }

        public Criteria andSWitnessGreaterThanOrEqualTo(String value) {
            addCriterion("s_witness >=", value, "sWitness");
            return (Criteria) this;
        }

        public Criteria andSWitnessLessThan(String value) {
            addCriterion("s_witness <", value, "sWitness");
            return (Criteria) this;
        }

        public Criteria andSWitnessLessThanOrEqualTo(String value) {
            addCriterion("s_witness <=", value, "sWitness");
            return (Criteria) this;
        }

        public Criteria andSWitnessLike(String value) {
            addCriterion("s_witness like", value, "sWitness");
            return (Criteria) this;
        }

        public Criteria andSWitnessNotLike(String value) {
            addCriterion("s_witness not like", value, "sWitness");
            return (Criteria) this;
        }

        public Criteria andSWitnessIn(List<String> values) {
            addCriterion("s_witness in", values, "sWitness");
            return (Criteria) this;
        }

        public Criteria andSWitnessNotIn(List<String> values) {
            addCriterion("s_witness not in", values, "sWitness");
            return (Criteria) this;
        }

        public Criteria andSWitnessBetween(String value1, String value2) {
            addCriterion("s_witness between", value1, value2, "sWitness");
            return (Criteria) this;
        }

        public Criteria andSWitnessNotBetween(String value1, String value2) {
            addCriterion("s_witness not between", value1, value2, "sWitness");
            return (Criteria) this;
        }

        public Criteria andSTreatmentIsNull() {
            addCriterion("s_treatment is null");
            return (Criteria) this;
        }

        public Criteria andSTreatmentIsNotNull() {
            addCriterion("s_treatment is not null");
            return (Criteria) this;
        }

        public Criteria andSTreatmentEqualTo(String value) {
            addCriterion("s_treatment =", value, "sTreatment");
            return (Criteria) this;
        }

        public Criteria andSTreatmentNotEqualTo(String value) {
            addCriterion("s_treatment <>", value, "sTreatment");
            return (Criteria) this;
        }

        public Criteria andSTreatmentGreaterThan(String value) {
            addCriterion("s_treatment >", value, "sTreatment");
            return (Criteria) this;
        }

        public Criteria andSTreatmentGreaterThanOrEqualTo(String value) {
            addCriterion("s_treatment >=", value, "sTreatment");
            return (Criteria) this;
        }

        public Criteria andSTreatmentLessThan(String value) {
            addCriterion("s_treatment <", value, "sTreatment");
            return (Criteria) this;
        }

        public Criteria andSTreatmentLessThanOrEqualTo(String value) {
            addCriterion("s_treatment <=", value, "sTreatment");
            return (Criteria) this;
        }

        public Criteria andSTreatmentLike(String value) {
            addCriterion("s_treatment like", value, "sTreatment");
            return (Criteria) this;
        }

        public Criteria andSTreatmentNotLike(String value) {
            addCriterion("s_treatment not like", value, "sTreatment");
            return (Criteria) this;
        }

        public Criteria andSTreatmentIn(List<String> values) {
            addCriterion("s_treatment in", values, "sTreatment");
            return (Criteria) this;
        }

        public Criteria andSTreatmentNotIn(List<String> values) {
            addCriterion("s_treatment not in", values, "sTreatment");
            return (Criteria) this;
        }

        public Criteria andSTreatmentBetween(String value1, String value2) {
            addCriterion("s_treatment between", value1, value2, "sTreatment");
            return (Criteria) this;
        }

        public Criteria andSTreatmentNotBetween(String value1, String value2) {
            addCriterion("s_treatment not between", value1, value2, "sTreatment");
            return (Criteria) this;
        }

        public Criteria andSUseridIsNull() {
            addCriterion("s_userid is null");
            return (Criteria) this;
        }

        public Criteria andSUseridIsNotNull() {
            addCriterion("s_userid is not null");
            return (Criteria) this;
        }

        public Criteria andSUseridEqualTo(String value) {
            addCriterion("s_userid =", value, "sUserid");
            return (Criteria) this;
        }

        public Criteria andSUseridNotEqualTo(String value) {
            addCriterion("s_userid <>", value, "sUserid");
            return (Criteria) this;
        }

        public Criteria andSUseridGreaterThan(String value) {
            addCriterion("s_userid >", value, "sUserid");
            return (Criteria) this;
        }

        public Criteria andSUseridGreaterThanOrEqualTo(String value) {
            addCriterion("s_userid >=", value, "sUserid");
            return (Criteria) this;
        }

        public Criteria andSUseridLessThan(String value) {
            addCriterion("s_userid <", value, "sUserid");
            return (Criteria) this;
        }

        public Criteria andSUseridLessThanOrEqualTo(String value) {
            addCriterion("s_userid <=", value, "sUserid");
            return (Criteria) this;
        }

        public Criteria andSUseridLike(String value) {
            addCriterion("s_userid like", value, "sUserid");
            return (Criteria) this;
        }

        public Criteria andSUseridNotLike(String value) {
            addCriterion("s_userid not like", value, "sUserid");
            return (Criteria) this;
        }

        public Criteria andSUseridIn(List<String> values) {
            addCriterion("s_userid in", values, "sUserid");
            return (Criteria) this;
        }

        public Criteria andSUseridNotIn(List<String> values) {
            addCriterion("s_userid not in", values, "sUserid");
            return (Criteria) this;
        }

        public Criteria andSUseridBetween(String value1, String value2) {
            addCriterion("s_userid between", value1, value2, "sUserid");
            return (Criteria) this;
        }

        public Criteria andSUseridNotBetween(String value1, String value2) {
            addCriterion("s_userid not between", value1, value2, "sUserid");
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