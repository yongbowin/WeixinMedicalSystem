package com.clouds.igankong.po;

import java.util.ArrayList;
import java.util.List;

public class FluidInjuryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FluidInjuryExample() {
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

        public Criteria andFOpenidIsNull() {
            addCriterion("f_openID is null");
            return (Criteria) this;
        }

        public Criteria andFOpenidIsNotNull() {
            addCriterion("f_openID is not null");
            return (Criteria) this;
        }

        public Criteria andFOpenidEqualTo(String value) {
            addCriterion("f_openID =", value, "fOpenid");
            return (Criteria) this;
        }

        public Criteria andFOpenidNotEqualTo(String value) {
            addCriterion("f_openID <>", value, "fOpenid");
            return (Criteria) this;
        }

        public Criteria andFOpenidGreaterThan(String value) {
            addCriterion("f_openID >", value, "fOpenid");
            return (Criteria) this;
        }

        public Criteria andFOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("f_openID >=", value, "fOpenid");
            return (Criteria) this;
        }

        public Criteria andFOpenidLessThan(String value) {
            addCriterion("f_openID <", value, "fOpenid");
            return (Criteria) this;
        }

        public Criteria andFOpenidLessThanOrEqualTo(String value) {
            addCriterion("f_openID <=", value, "fOpenid");
            return (Criteria) this;
        }

        public Criteria andFOpenidLike(String value) {
            addCriterion("f_openID like", value, "fOpenid");
            return (Criteria) this;
        }

        public Criteria andFOpenidNotLike(String value) {
            addCriterion("f_openID not like", value, "fOpenid");
            return (Criteria) this;
        }

        public Criteria andFOpenidIn(List<String> values) {
            addCriterion("f_openID in", values, "fOpenid");
            return (Criteria) this;
        }

        public Criteria andFOpenidNotIn(List<String> values) {
            addCriterion("f_openID not in", values, "fOpenid");
            return (Criteria) this;
        }

        public Criteria andFOpenidBetween(String value1, String value2) {
            addCriterion("f_openID between", value1, value2, "fOpenid");
            return (Criteria) this;
        }

        public Criteria andFOpenidNotBetween(String value1, String value2) {
            addCriterion("f_openID not between", value1, value2, "fOpenid");
            return (Criteria) this;
        }

        public Criteria andFPlaceIsNull() {
            addCriterion("f_place is null");
            return (Criteria) this;
        }

        public Criteria andFPlaceIsNotNull() {
            addCriterion("f_place is not null");
            return (Criteria) this;
        }

        public Criteria andFPlaceEqualTo(String value) {
            addCriterion("f_place =", value, "fPlace");
            return (Criteria) this;
        }

        public Criteria andFPlaceNotEqualTo(String value) {
            addCriterion("f_place <>", value, "fPlace");
            return (Criteria) this;
        }

        public Criteria andFPlaceGreaterThan(String value) {
            addCriterion("f_place >", value, "fPlace");
            return (Criteria) this;
        }

        public Criteria andFPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("f_place >=", value, "fPlace");
            return (Criteria) this;
        }

        public Criteria andFPlaceLessThan(String value) {
            addCriterion("f_place <", value, "fPlace");
            return (Criteria) this;
        }

        public Criteria andFPlaceLessThanOrEqualTo(String value) {
            addCriterion("f_place <=", value, "fPlace");
            return (Criteria) this;
        }

        public Criteria andFPlaceLike(String value) {
            addCriterion("f_place like", value, "fPlace");
            return (Criteria) this;
        }

        public Criteria andFPlaceNotLike(String value) {
            addCriterion("f_place not like", value, "fPlace");
            return (Criteria) this;
        }

        public Criteria andFPlaceIn(List<String> values) {
            addCriterion("f_place in", values, "fPlace");
            return (Criteria) this;
        }

        public Criteria andFPlaceNotIn(List<String> values) {
            addCriterion("f_place not in", values, "fPlace");
            return (Criteria) this;
        }

        public Criteria andFPlaceBetween(String value1, String value2) {
            addCriterion("f_place between", value1, value2, "fPlace");
            return (Criteria) this;
        }

        public Criteria andFPlaceNotBetween(String value1, String value2) {
            addCriterion("f_place not between", value1, value2, "fPlace");
            return (Criteria) this;
        }

        public Criteria andFTypeIsNull() {
            addCriterion("f_type is null");
            return (Criteria) this;
        }

        public Criteria andFTypeIsNotNull() {
            addCriterion("f_type is not null");
            return (Criteria) this;
        }

        public Criteria andFTypeEqualTo(String value) {
            addCriterion("f_type =", value, "fType");
            return (Criteria) this;
        }

        public Criteria andFTypeNotEqualTo(String value) {
            addCriterion("f_type <>", value, "fType");
            return (Criteria) this;
        }

        public Criteria andFTypeGreaterThan(String value) {
            addCriterion("f_type >", value, "fType");
            return (Criteria) this;
        }

        public Criteria andFTypeGreaterThanOrEqualTo(String value) {
            addCriterion("f_type >=", value, "fType");
            return (Criteria) this;
        }

        public Criteria andFTypeLessThan(String value) {
            addCriterion("f_type <", value, "fType");
            return (Criteria) this;
        }

        public Criteria andFTypeLessThanOrEqualTo(String value) {
            addCriterion("f_type <=", value, "fType");
            return (Criteria) this;
        }

        public Criteria andFTypeLike(String value) {
            addCriterion("f_type like", value, "fType");
            return (Criteria) this;
        }

        public Criteria andFTypeNotLike(String value) {
            addCriterion("f_type not like", value, "fType");
            return (Criteria) this;
        }

        public Criteria andFTypeIn(List<String> values) {
            addCriterion("f_type in", values, "fType");
            return (Criteria) this;
        }

        public Criteria andFTypeNotIn(List<String> values) {
            addCriterion("f_type not in", values, "fType");
            return (Criteria) this;
        }

        public Criteria andFTypeBetween(String value1, String value2) {
            addCriterion("f_type between", value1, value2, "fType");
            return (Criteria) this;
        }

        public Criteria andFTypeNotBetween(String value1, String value2) {
            addCriterion("f_type not between", value1, value2, "fType");
            return (Criteria) this;
        }

        public Criteria andFBloodStatusIsNull() {
            addCriterion("f_blood_status is null");
            return (Criteria) this;
        }

        public Criteria andFBloodStatusIsNotNull() {
            addCriterion("f_blood_status is not null");
            return (Criteria) this;
        }

        public Criteria andFBloodStatusEqualTo(String value) {
            addCriterion("f_blood_status =", value, "fBloodStatus");
            return (Criteria) this;
        }

        public Criteria andFBloodStatusNotEqualTo(String value) {
            addCriterion("f_blood_status <>", value, "fBloodStatus");
            return (Criteria) this;
        }

        public Criteria andFBloodStatusGreaterThan(String value) {
            addCriterion("f_blood_status >", value, "fBloodStatus");
            return (Criteria) this;
        }

        public Criteria andFBloodStatusGreaterThanOrEqualTo(String value) {
            addCriterion("f_blood_status >=", value, "fBloodStatus");
            return (Criteria) this;
        }

        public Criteria andFBloodStatusLessThan(String value) {
            addCriterion("f_blood_status <", value, "fBloodStatus");
            return (Criteria) this;
        }

        public Criteria andFBloodStatusLessThanOrEqualTo(String value) {
            addCriterion("f_blood_status <=", value, "fBloodStatus");
            return (Criteria) this;
        }

        public Criteria andFBloodStatusLike(String value) {
            addCriterion("f_blood_status like", value, "fBloodStatus");
            return (Criteria) this;
        }

        public Criteria andFBloodStatusNotLike(String value) {
            addCriterion("f_blood_status not like", value, "fBloodStatus");
            return (Criteria) this;
        }

        public Criteria andFBloodStatusIn(List<String> values) {
            addCriterion("f_blood_status in", values, "fBloodStatus");
            return (Criteria) this;
        }

        public Criteria andFBloodStatusNotIn(List<String> values) {
            addCriterion("f_blood_status not in", values, "fBloodStatus");
            return (Criteria) this;
        }

        public Criteria andFBloodStatusBetween(String value1, String value2) {
            addCriterion("f_blood_status between", value1, value2, "fBloodStatus");
            return (Criteria) this;
        }

        public Criteria andFBloodStatusNotBetween(String value1, String value2) {
            addCriterion("f_blood_status not between", value1, value2, "fBloodStatus");
            return (Criteria) this;
        }

        public Criteria andFExposePartIsNull() {
            addCriterion("f_expose_part is null");
            return (Criteria) this;
        }

        public Criteria andFExposePartIsNotNull() {
            addCriterion("f_expose_part is not null");
            return (Criteria) this;
        }

        public Criteria andFExposePartEqualTo(String value) {
            addCriterion("f_expose_part =", value, "fExposePart");
            return (Criteria) this;
        }

        public Criteria andFExposePartNotEqualTo(String value) {
            addCriterion("f_expose_part <>", value, "fExposePart");
            return (Criteria) this;
        }

        public Criteria andFExposePartGreaterThan(String value) {
            addCriterion("f_expose_part >", value, "fExposePart");
            return (Criteria) this;
        }

        public Criteria andFExposePartGreaterThanOrEqualTo(String value) {
            addCriterion("f_expose_part >=", value, "fExposePart");
            return (Criteria) this;
        }

        public Criteria andFExposePartLessThan(String value) {
            addCriterion("f_expose_part <", value, "fExposePart");
            return (Criteria) this;
        }

        public Criteria andFExposePartLessThanOrEqualTo(String value) {
            addCriterion("f_expose_part <=", value, "fExposePart");
            return (Criteria) this;
        }

        public Criteria andFExposePartLike(String value) {
            addCriterion("f_expose_part like", value, "fExposePart");
            return (Criteria) this;
        }

        public Criteria andFExposePartNotLike(String value) {
            addCriterion("f_expose_part not like", value, "fExposePart");
            return (Criteria) this;
        }

        public Criteria andFExposePartIn(List<String> values) {
            addCriterion("f_expose_part in", values, "fExposePart");
            return (Criteria) this;
        }

        public Criteria andFExposePartNotIn(List<String> values) {
            addCriterion("f_expose_part not in", values, "fExposePart");
            return (Criteria) this;
        }

        public Criteria andFExposePartBetween(String value1, String value2) {
            addCriterion("f_expose_part between", value1, value2, "fExposePart");
            return (Criteria) this;
        }

        public Criteria andFExposePartNotBetween(String value1, String value2) {
            addCriterion("f_expose_part not between", value1, value2, "fExposePart");
            return (Criteria) this;
        }

        public Criteria andFStatusIsNull() {
            addCriterion("f_status is null");
            return (Criteria) this;
        }

        public Criteria andFStatusIsNotNull() {
            addCriterion("f_status is not null");
            return (Criteria) this;
        }

        public Criteria andFStatusEqualTo(String value) {
            addCriterion("f_status =", value, "fStatus");
            return (Criteria) this;
        }

        public Criteria andFStatusNotEqualTo(String value) {
            addCriterion("f_status <>", value, "fStatus");
            return (Criteria) this;
        }

        public Criteria andFStatusGreaterThan(String value) {
            addCriterion("f_status >", value, "fStatus");
            return (Criteria) this;
        }

        public Criteria andFStatusGreaterThanOrEqualTo(String value) {
            addCriterion("f_status >=", value, "fStatus");
            return (Criteria) this;
        }

        public Criteria andFStatusLessThan(String value) {
            addCriterion("f_status <", value, "fStatus");
            return (Criteria) this;
        }

        public Criteria andFStatusLessThanOrEqualTo(String value) {
            addCriterion("f_status <=", value, "fStatus");
            return (Criteria) this;
        }

        public Criteria andFStatusLike(String value) {
            addCriterion("f_status like", value, "fStatus");
            return (Criteria) this;
        }

        public Criteria andFStatusNotLike(String value) {
            addCriterion("f_status not like", value, "fStatus");
            return (Criteria) this;
        }

        public Criteria andFStatusIn(List<String> values) {
            addCriterion("f_status in", values, "fStatus");
            return (Criteria) this;
        }

        public Criteria andFStatusNotIn(List<String> values) {
            addCriterion("f_status not in", values, "fStatus");
            return (Criteria) this;
        }

        public Criteria andFStatusBetween(String value1, String value2) {
            addCriterion("f_status between", value1, value2, "fStatus");
            return (Criteria) this;
        }

        public Criteria andFStatusNotBetween(String value1, String value2) {
            addCriterion("f_status not between", value1, value2, "fStatus");
            return (Criteria) this;
        }

        public Criteria andFProtectiveStatusIsNull() {
            addCriterion("f_protective_status is null");
            return (Criteria) this;
        }

        public Criteria andFProtectiveStatusIsNotNull() {
            addCriterion("f_protective_status is not null");
            return (Criteria) this;
        }

        public Criteria andFProtectiveStatusEqualTo(String value) {
            addCriterion("f_protective_status =", value, "fProtectiveStatus");
            return (Criteria) this;
        }

        public Criteria andFProtectiveStatusNotEqualTo(String value) {
            addCriterion("f_protective_status <>", value, "fProtectiveStatus");
            return (Criteria) this;
        }

        public Criteria andFProtectiveStatusGreaterThan(String value) {
            addCriterion("f_protective_status >", value, "fProtectiveStatus");
            return (Criteria) this;
        }

        public Criteria andFProtectiveStatusGreaterThanOrEqualTo(String value) {
            addCriterion("f_protective_status >=", value, "fProtectiveStatus");
            return (Criteria) this;
        }

        public Criteria andFProtectiveStatusLessThan(String value) {
            addCriterion("f_protective_status <", value, "fProtectiveStatus");
            return (Criteria) this;
        }

        public Criteria andFProtectiveStatusLessThanOrEqualTo(String value) {
            addCriterion("f_protective_status <=", value, "fProtectiveStatus");
            return (Criteria) this;
        }

        public Criteria andFProtectiveStatusLike(String value) {
            addCriterion("f_protective_status like", value, "fProtectiveStatus");
            return (Criteria) this;
        }

        public Criteria andFProtectiveStatusNotLike(String value) {
            addCriterion("f_protective_status not like", value, "fProtectiveStatus");
            return (Criteria) this;
        }

        public Criteria andFProtectiveStatusIn(List<String> values) {
            addCriterion("f_protective_status in", values, "fProtectiveStatus");
            return (Criteria) this;
        }

        public Criteria andFProtectiveStatusNotIn(List<String> values) {
            addCriterion("f_protective_status not in", values, "fProtectiveStatus");
            return (Criteria) this;
        }

        public Criteria andFProtectiveStatusBetween(String value1, String value2) {
            addCriterion("f_protective_status between", value1, value2, "fProtectiveStatus");
            return (Criteria) this;
        }

        public Criteria andFProtectiveStatusNotBetween(String value1, String value2) {
            addCriterion("f_protective_status not between", value1, value2, "fProtectiveStatus");
            return (Criteria) this;
        }

        public Criteria andFExposeReasonIsNull() {
            addCriterion("f_expose_reason is null");
            return (Criteria) this;
        }

        public Criteria andFExposeReasonIsNotNull() {
            addCriterion("f_expose_reason is not null");
            return (Criteria) this;
        }

        public Criteria andFExposeReasonEqualTo(String value) {
            addCriterion("f_expose_reason =", value, "fExposeReason");
            return (Criteria) this;
        }

        public Criteria andFExposeReasonNotEqualTo(String value) {
            addCriterion("f_expose_reason <>", value, "fExposeReason");
            return (Criteria) this;
        }

        public Criteria andFExposeReasonGreaterThan(String value) {
            addCriterion("f_expose_reason >", value, "fExposeReason");
            return (Criteria) this;
        }

        public Criteria andFExposeReasonGreaterThanOrEqualTo(String value) {
            addCriterion("f_expose_reason >=", value, "fExposeReason");
            return (Criteria) this;
        }

        public Criteria andFExposeReasonLessThan(String value) {
            addCriterion("f_expose_reason <", value, "fExposeReason");
            return (Criteria) this;
        }

        public Criteria andFExposeReasonLessThanOrEqualTo(String value) {
            addCriterion("f_expose_reason <=", value, "fExposeReason");
            return (Criteria) this;
        }

        public Criteria andFExposeReasonLike(String value) {
            addCriterion("f_expose_reason like", value, "fExposeReason");
            return (Criteria) this;
        }

        public Criteria andFExposeReasonNotLike(String value) {
            addCriterion("f_expose_reason not like", value, "fExposeReason");
            return (Criteria) this;
        }

        public Criteria andFExposeReasonIn(List<String> values) {
            addCriterion("f_expose_reason in", values, "fExposeReason");
            return (Criteria) this;
        }

        public Criteria andFExposeReasonNotIn(List<String> values) {
            addCriterion("f_expose_reason not in", values, "fExposeReason");
            return (Criteria) this;
        }

        public Criteria andFExposeReasonBetween(String value1, String value2) {
            addCriterion("f_expose_reason between", value1, value2, "fExposeReason");
            return (Criteria) this;
        }

        public Criteria andFExposeReasonNotBetween(String value1, String value2) {
            addCriterion("f_expose_reason not between", value1, value2, "fExposeReason");
            return (Criteria) this;
        }

        public Criteria andFTouchTimeIsNull() {
            addCriterion("f_touch_time is null");
            return (Criteria) this;
        }

        public Criteria andFTouchTimeIsNotNull() {
            addCriterion("f_touch_time is not null");
            return (Criteria) this;
        }

        public Criteria andFTouchTimeEqualTo(String value) {
            addCriterion("f_touch_time =", value, "fTouchTime");
            return (Criteria) this;
        }

        public Criteria andFTouchTimeNotEqualTo(String value) {
            addCriterion("f_touch_time <>", value, "fTouchTime");
            return (Criteria) this;
        }

        public Criteria andFTouchTimeGreaterThan(String value) {
            addCriterion("f_touch_time >", value, "fTouchTime");
            return (Criteria) this;
        }

        public Criteria andFTouchTimeGreaterThanOrEqualTo(String value) {
            addCriterion("f_touch_time >=", value, "fTouchTime");
            return (Criteria) this;
        }

        public Criteria andFTouchTimeLessThan(String value) {
            addCriterion("f_touch_time <", value, "fTouchTime");
            return (Criteria) this;
        }

        public Criteria andFTouchTimeLessThanOrEqualTo(String value) {
            addCriterion("f_touch_time <=", value, "fTouchTime");
            return (Criteria) this;
        }

        public Criteria andFTouchTimeLike(String value) {
            addCriterion("f_touch_time like", value, "fTouchTime");
            return (Criteria) this;
        }

        public Criteria andFTouchTimeNotLike(String value) {
            addCriterion("f_touch_time not like", value, "fTouchTime");
            return (Criteria) this;
        }

        public Criteria andFTouchTimeIn(List<String> values) {
            addCriterion("f_touch_time in", values, "fTouchTime");
            return (Criteria) this;
        }

        public Criteria andFTouchTimeNotIn(List<String> values) {
            addCriterion("f_touch_time not in", values, "fTouchTime");
            return (Criteria) this;
        }

        public Criteria andFTouchTimeBetween(String value1, String value2) {
            addCriterion("f_touch_time between", value1, value2, "fTouchTime");
            return (Criteria) this;
        }

        public Criteria andFTouchTimeNotBetween(String value1, String value2) {
            addCriterion("f_touch_time not between", value1, value2, "fTouchTime");
            return (Criteria) this;
        }

        public Criteria andFDescIsNull() {
            addCriterion("f_desc is null");
            return (Criteria) this;
        }

        public Criteria andFDescIsNotNull() {
            addCriterion("f_desc is not null");
            return (Criteria) this;
        }

        public Criteria andFDescEqualTo(String value) {
            addCriterion("f_desc =", value, "fDesc");
            return (Criteria) this;
        }

        public Criteria andFDescNotEqualTo(String value) {
            addCriterion("f_desc <>", value, "fDesc");
            return (Criteria) this;
        }

        public Criteria andFDescGreaterThan(String value) {
            addCriterion("f_desc >", value, "fDesc");
            return (Criteria) this;
        }

        public Criteria andFDescGreaterThanOrEqualTo(String value) {
            addCriterion("f_desc >=", value, "fDesc");
            return (Criteria) this;
        }

        public Criteria andFDescLessThan(String value) {
            addCriterion("f_desc <", value, "fDesc");
            return (Criteria) this;
        }

        public Criteria andFDescLessThanOrEqualTo(String value) {
            addCriterion("f_desc <=", value, "fDesc");
            return (Criteria) this;
        }

        public Criteria andFDescLike(String value) {
            addCriterion("f_desc like", value, "fDesc");
            return (Criteria) this;
        }

        public Criteria andFDescNotLike(String value) {
            addCriterion("f_desc not like", value, "fDesc");
            return (Criteria) this;
        }

        public Criteria andFDescIn(List<String> values) {
            addCriterion("f_desc in", values, "fDesc");
            return (Criteria) this;
        }

        public Criteria andFDescNotIn(List<String> values) {
            addCriterion("f_desc not in", values, "fDesc");
            return (Criteria) this;
        }

        public Criteria andFDescBetween(String value1, String value2) {
            addCriterion("f_desc between", value1, value2, "fDesc");
            return (Criteria) this;
        }

        public Criteria andFDescNotBetween(String value1, String value2) {
            addCriterion("f_desc not between", value1, value2, "fDesc");
            return (Criteria) this;
        }

        public Criteria andFWitnessIsNull() {
            addCriterion("f_witness is null");
            return (Criteria) this;
        }

        public Criteria andFWitnessIsNotNull() {
            addCriterion("f_witness is not null");
            return (Criteria) this;
        }

        public Criteria andFWitnessEqualTo(String value) {
            addCriterion("f_witness =", value, "fWitness");
            return (Criteria) this;
        }

        public Criteria andFWitnessNotEqualTo(String value) {
            addCriterion("f_witness <>", value, "fWitness");
            return (Criteria) this;
        }

        public Criteria andFWitnessGreaterThan(String value) {
            addCriterion("f_witness >", value, "fWitness");
            return (Criteria) this;
        }

        public Criteria andFWitnessGreaterThanOrEqualTo(String value) {
            addCriterion("f_witness >=", value, "fWitness");
            return (Criteria) this;
        }

        public Criteria andFWitnessLessThan(String value) {
            addCriterion("f_witness <", value, "fWitness");
            return (Criteria) this;
        }

        public Criteria andFWitnessLessThanOrEqualTo(String value) {
            addCriterion("f_witness <=", value, "fWitness");
            return (Criteria) this;
        }

        public Criteria andFWitnessLike(String value) {
            addCriterion("f_witness like", value, "fWitness");
            return (Criteria) this;
        }

        public Criteria andFWitnessNotLike(String value) {
            addCriterion("f_witness not like", value, "fWitness");
            return (Criteria) this;
        }

        public Criteria andFWitnessIn(List<String> values) {
            addCriterion("f_witness in", values, "fWitness");
            return (Criteria) this;
        }

        public Criteria andFWitnessNotIn(List<String> values) {
            addCriterion("f_witness not in", values, "fWitness");
            return (Criteria) this;
        }

        public Criteria andFWitnessBetween(String value1, String value2) {
            addCriterion("f_witness between", value1, value2, "fWitness");
            return (Criteria) this;
        }

        public Criteria andFWitnessNotBetween(String value1, String value2) {
            addCriterion("f_witness not between", value1, value2, "fWitness");
            return (Criteria) this;
        }

        public Criteria andFTreatmentIsNull() {
            addCriterion("f_treatment is null");
            return (Criteria) this;
        }

        public Criteria andFTreatmentIsNotNull() {
            addCriterion("f_treatment is not null");
            return (Criteria) this;
        }

        public Criteria andFTreatmentEqualTo(String value) {
            addCriterion("f_treatment =", value, "fTreatment");
            return (Criteria) this;
        }

        public Criteria andFTreatmentNotEqualTo(String value) {
            addCriterion("f_treatment <>", value, "fTreatment");
            return (Criteria) this;
        }

        public Criteria andFTreatmentGreaterThan(String value) {
            addCriterion("f_treatment >", value, "fTreatment");
            return (Criteria) this;
        }

        public Criteria andFTreatmentGreaterThanOrEqualTo(String value) {
            addCriterion("f_treatment >=", value, "fTreatment");
            return (Criteria) this;
        }

        public Criteria andFTreatmentLessThan(String value) {
            addCriterion("f_treatment <", value, "fTreatment");
            return (Criteria) this;
        }

        public Criteria andFTreatmentLessThanOrEqualTo(String value) {
            addCriterion("f_treatment <=", value, "fTreatment");
            return (Criteria) this;
        }

        public Criteria andFTreatmentLike(String value) {
            addCriterion("f_treatment like", value, "fTreatment");
            return (Criteria) this;
        }

        public Criteria andFTreatmentNotLike(String value) {
            addCriterion("f_treatment not like", value, "fTreatment");
            return (Criteria) this;
        }

        public Criteria andFTreatmentIn(List<String> values) {
            addCriterion("f_treatment in", values, "fTreatment");
            return (Criteria) this;
        }

        public Criteria andFTreatmentNotIn(List<String> values) {
            addCriterion("f_treatment not in", values, "fTreatment");
            return (Criteria) this;
        }

        public Criteria andFTreatmentBetween(String value1, String value2) {
            addCriterion("f_treatment between", value1, value2, "fTreatment");
            return (Criteria) this;
        }

        public Criteria andFTreatmentNotBetween(String value1, String value2) {
            addCriterion("f_treatment not between", value1, value2, "fTreatment");
            return (Criteria) this;
        }

        public Criteria andFUseridIsNull() {
            addCriterion("f_userid is null");
            return (Criteria) this;
        }

        public Criteria andFUseridIsNotNull() {
            addCriterion("f_userid is not null");
            return (Criteria) this;
        }

        public Criteria andFUseridEqualTo(String value) {
            addCriterion("f_userid =", value, "fUserid");
            return (Criteria) this;
        }

        public Criteria andFUseridNotEqualTo(String value) {
            addCriterion("f_userid <>", value, "fUserid");
            return (Criteria) this;
        }

        public Criteria andFUseridGreaterThan(String value) {
            addCriterion("f_userid >", value, "fUserid");
            return (Criteria) this;
        }

        public Criteria andFUseridGreaterThanOrEqualTo(String value) {
            addCriterion("f_userid >=", value, "fUserid");
            return (Criteria) this;
        }

        public Criteria andFUseridLessThan(String value) {
            addCriterion("f_userid <", value, "fUserid");
            return (Criteria) this;
        }

        public Criteria andFUseridLessThanOrEqualTo(String value) {
            addCriterion("f_userid <=", value, "fUserid");
            return (Criteria) this;
        }

        public Criteria andFUseridLike(String value) {
            addCriterion("f_userid like", value, "fUserid");
            return (Criteria) this;
        }

        public Criteria andFUseridNotLike(String value) {
            addCriterion("f_userid not like", value, "fUserid");
            return (Criteria) this;
        }

        public Criteria andFUseridIn(List<String> values) {
            addCriterion("f_userid in", values, "fUserid");
            return (Criteria) this;
        }

        public Criteria andFUseridNotIn(List<String> values) {
            addCriterion("f_userid not in", values, "fUserid");
            return (Criteria) this;
        }

        public Criteria andFUseridBetween(String value1, String value2) {
            addCriterion("f_userid between", value1, value2, "fUserid");
            return (Criteria) this;
        }

        public Criteria andFUseridNotBetween(String value1, String value2) {
            addCriterion("f_userid not between", value1, value2, "fUserid");
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