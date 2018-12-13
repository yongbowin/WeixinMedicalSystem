package com.clouds.igankong.po;

import java.util.ArrayList;
import java.util.List;

public class DiseaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DiseaseExample() {
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

        public Criteria andDOpenidIsNull() {
            addCriterion("d_openID is null");
            return (Criteria) this;
        }

        public Criteria andDOpenidIsNotNull() {
            addCriterion("d_openID is not null");
            return (Criteria) this;
        }

        public Criteria andDOpenidEqualTo(String value) {
            addCriterion("d_openID =", value, "dOpenid");
            return (Criteria) this;
        }

        public Criteria andDOpenidNotEqualTo(String value) {
            addCriterion("d_openID <>", value, "dOpenid");
            return (Criteria) this;
        }

        public Criteria andDOpenidGreaterThan(String value) {
            addCriterion("d_openID >", value, "dOpenid");
            return (Criteria) this;
        }

        public Criteria andDOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("d_openID >=", value, "dOpenid");
            return (Criteria) this;
        }

        public Criteria andDOpenidLessThan(String value) {
            addCriterion("d_openID <", value, "dOpenid");
            return (Criteria) this;
        }

        public Criteria andDOpenidLessThanOrEqualTo(String value) {
            addCriterion("d_openID <=", value, "dOpenid");
            return (Criteria) this;
        }

        public Criteria andDOpenidLike(String value) {
            addCriterion("d_openID like", value, "dOpenid");
            return (Criteria) this;
        }

        public Criteria andDOpenidNotLike(String value) {
            addCriterion("d_openID not like", value, "dOpenid");
            return (Criteria) this;
        }

        public Criteria andDOpenidIn(List<String> values) {
            addCriterion("d_openID in", values, "dOpenid");
            return (Criteria) this;
        }

        public Criteria andDOpenidNotIn(List<String> values) {
            addCriterion("d_openID not in", values, "dOpenid");
            return (Criteria) this;
        }

        public Criteria andDOpenidBetween(String value1, String value2) {
            addCriterion("d_openID between", value1, value2, "dOpenid");
            return (Criteria) this;
        }

        public Criteria andDOpenidNotBetween(String value1, String value2) {
            addCriterion("d_openID not between", value1, value2, "dOpenid");
            return (Criteria) this;
        }

        public Criteria andDNameIsNull() {
            addCriterion("d_name is null");
            return (Criteria) this;
        }

        public Criteria andDNameIsNotNull() {
            addCriterion("d_name is not null");
            return (Criteria) this;
        }

        public Criteria andDNameEqualTo(String value) {
            addCriterion("d_name =", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameNotEqualTo(String value) {
            addCriterion("d_name <>", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameGreaterThan(String value) {
            addCriterion("d_name >", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameGreaterThanOrEqualTo(String value) {
            addCriterion("d_name >=", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameLessThan(String value) {
            addCriterion("d_name <", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameLessThanOrEqualTo(String value) {
            addCriterion("d_name <=", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameLike(String value) {
            addCriterion("d_name like", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameNotLike(String value) {
            addCriterion("d_name not like", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameIn(List<String> values) {
            addCriterion("d_name in", values, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameNotIn(List<String> values) {
            addCriterion("d_name not in", values, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameBetween(String value1, String value2) {
            addCriterion("d_name between", value1, value2, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameNotBetween(String value1, String value2) {
            addCriterion("d_name not between", value1, value2, "dName");
            return (Criteria) this;
        }

        public Criteria andDTypeIsNull() {
            addCriterion("d_type is null");
            return (Criteria) this;
        }

        public Criteria andDTypeIsNotNull() {
            addCriterion("d_type is not null");
            return (Criteria) this;
        }

        public Criteria andDTypeEqualTo(String value) {
            addCriterion("d_type =", value, "dType");
            return (Criteria) this;
        }

        public Criteria andDTypeNotEqualTo(String value) {
            addCriterion("d_type <>", value, "dType");
            return (Criteria) this;
        }

        public Criteria andDTypeGreaterThan(String value) {
            addCriterion("d_type >", value, "dType");
            return (Criteria) this;
        }

        public Criteria andDTypeGreaterThanOrEqualTo(String value) {
            addCriterion("d_type >=", value, "dType");
            return (Criteria) this;
        }

        public Criteria andDTypeLessThan(String value) {
            addCriterion("d_type <", value, "dType");
            return (Criteria) this;
        }

        public Criteria andDTypeLessThanOrEqualTo(String value) {
            addCriterion("d_type <=", value, "dType");
            return (Criteria) this;
        }

        public Criteria andDTypeLike(String value) {
            addCriterion("d_type like", value, "dType");
            return (Criteria) this;
        }

        public Criteria andDTypeNotLike(String value) {
            addCriterion("d_type not like", value, "dType");
            return (Criteria) this;
        }

        public Criteria andDTypeIn(List<String> values) {
            addCriterion("d_type in", values, "dType");
            return (Criteria) this;
        }

        public Criteria andDTypeNotIn(List<String> values) {
            addCriterion("d_type not in", values, "dType");
            return (Criteria) this;
        }

        public Criteria andDTypeBetween(String value1, String value2) {
            addCriterion("d_type between", value1, value2, "dType");
            return (Criteria) this;
        }

        public Criteria andDTypeNotBetween(String value1, String value2) {
            addCriterion("d_type not between", value1, value2, "dType");
            return (Criteria) this;
        }

        public Criteria andDResultIsNull() {
            addCriterion("d_result is null");
            return (Criteria) this;
        }

        public Criteria andDResultIsNotNull() {
            addCriterion("d_result is not null");
            return (Criteria) this;
        }

        public Criteria andDResultEqualTo(String value) {
            addCriterion("d_result =", value, "dResult");
            return (Criteria) this;
        }

        public Criteria andDResultNotEqualTo(String value) {
            addCriterion("d_result <>", value, "dResult");
            return (Criteria) this;
        }

        public Criteria andDResultGreaterThan(String value) {
            addCriterion("d_result >", value, "dResult");
            return (Criteria) this;
        }

        public Criteria andDResultGreaterThanOrEqualTo(String value) {
            addCriterion("d_result >=", value, "dResult");
            return (Criteria) this;
        }

        public Criteria andDResultLessThan(String value) {
            addCriterion("d_result <", value, "dResult");
            return (Criteria) this;
        }

        public Criteria andDResultLessThanOrEqualTo(String value) {
            addCriterion("d_result <=", value, "dResult");
            return (Criteria) this;
        }

        public Criteria andDResultLike(String value) {
            addCriterion("d_result like", value, "dResult");
            return (Criteria) this;
        }

        public Criteria andDResultNotLike(String value) {
            addCriterion("d_result not like", value, "dResult");
            return (Criteria) this;
        }

        public Criteria andDResultIn(List<String> values) {
            addCriterion("d_result in", values, "dResult");
            return (Criteria) this;
        }

        public Criteria andDResultNotIn(List<String> values) {
            addCriterion("d_result not in", values, "dResult");
            return (Criteria) this;
        }

        public Criteria andDResultBetween(String value1, String value2) {
            addCriterion("d_result between", value1, value2, "dResult");
            return (Criteria) this;
        }

        public Criteria andDResultNotBetween(String value1, String value2) {
            addCriterion("d_result not between", value1, value2, "dResult");
            return (Criteria) this;
        }

        public Criteria andDStartTimeIsNull() {
            addCriterion("d_start_time is null");
            return (Criteria) this;
        }

        public Criteria andDStartTimeIsNotNull() {
            addCriterion("d_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andDStartTimeEqualTo(String value) {
            addCriterion("d_start_time =", value, "dStartTime");
            return (Criteria) this;
        }

        public Criteria andDStartTimeNotEqualTo(String value) {
            addCriterion("d_start_time <>", value, "dStartTime");
            return (Criteria) this;
        }

        public Criteria andDStartTimeGreaterThan(String value) {
            addCriterion("d_start_time >", value, "dStartTime");
            return (Criteria) this;
        }

        public Criteria andDStartTimeGreaterThanOrEqualTo(String value) {
            addCriterion("d_start_time >=", value, "dStartTime");
            return (Criteria) this;
        }

        public Criteria andDStartTimeLessThan(String value) {
            addCriterion("d_start_time <", value, "dStartTime");
            return (Criteria) this;
        }

        public Criteria andDStartTimeLessThanOrEqualTo(String value) {
            addCriterion("d_start_time <=", value, "dStartTime");
            return (Criteria) this;
        }

        public Criteria andDStartTimeLike(String value) {
            addCriterion("d_start_time like", value, "dStartTime");
            return (Criteria) this;
        }

        public Criteria andDStartTimeNotLike(String value) {
            addCriterion("d_start_time not like", value, "dStartTime");
            return (Criteria) this;
        }

        public Criteria andDStartTimeIn(List<String> values) {
            addCriterion("d_start_time in", values, "dStartTime");
            return (Criteria) this;
        }

        public Criteria andDStartTimeNotIn(List<String> values) {
            addCriterion("d_start_time not in", values, "dStartTime");
            return (Criteria) this;
        }

        public Criteria andDStartTimeBetween(String value1, String value2) {
            addCriterion("d_start_time between", value1, value2, "dStartTime");
            return (Criteria) this;
        }

        public Criteria andDStartTimeNotBetween(String value1, String value2) {
            addCriterion("d_start_time not between", value1, value2, "dStartTime");
            return (Criteria) this;
        }

        public Criteria andDHospitalNumIsNull() {
            addCriterion("d_hospital_num is null");
            return (Criteria) this;
        }

        public Criteria andDHospitalNumIsNotNull() {
            addCriterion("d_hospital_num is not null");
            return (Criteria) this;
        }

        public Criteria andDHospitalNumEqualTo(String value) {
            addCriterion("d_hospital_num =", value, "dHospitalNum");
            return (Criteria) this;
        }

        public Criteria andDHospitalNumNotEqualTo(String value) {
            addCriterion("d_hospital_num <>", value, "dHospitalNum");
            return (Criteria) this;
        }

        public Criteria andDHospitalNumGreaterThan(String value) {
            addCriterion("d_hospital_num >", value, "dHospitalNum");
            return (Criteria) this;
        }

        public Criteria andDHospitalNumGreaterThanOrEqualTo(String value) {
            addCriterion("d_hospital_num >=", value, "dHospitalNum");
            return (Criteria) this;
        }

        public Criteria andDHospitalNumLessThan(String value) {
            addCriterion("d_hospital_num <", value, "dHospitalNum");
            return (Criteria) this;
        }

        public Criteria andDHospitalNumLessThanOrEqualTo(String value) {
            addCriterion("d_hospital_num <=", value, "dHospitalNum");
            return (Criteria) this;
        }

        public Criteria andDHospitalNumLike(String value) {
            addCriterion("d_hospital_num like", value, "dHospitalNum");
            return (Criteria) this;
        }

        public Criteria andDHospitalNumNotLike(String value) {
            addCriterion("d_hospital_num not like", value, "dHospitalNum");
            return (Criteria) this;
        }

        public Criteria andDHospitalNumIn(List<String> values) {
            addCriterion("d_hospital_num in", values, "dHospitalNum");
            return (Criteria) this;
        }

        public Criteria andDHospitalNumNotIn(List<String> values) {
            addCriterion("d_hospital_num not in", values, "dHospitalNum");
            return (Criteria) this;
        }

        public Criteria andDHospitalNumBetween(String value1, String value2) {
            addCriterion("d_hospital_num between", value1, value2, "dHospitalNum");
            return (Criteria) this;
        }

        public Criteria andDHospitalNumNotBetween(String value1, String value2) {
            addCriterion("d_hospital_num not between", value1, value2, "dHospitalNum");
            return (Criteria) this;
        }

        public Criteria andDSignIsNull() {
            addCriterion("d_sign is null");
            return (Criteria) this;
        }

        public Criteria andDSignIsNotNull() {
            addCriterion("d_sign is not null");
            return (Criteria) this;
        }

        public Criteria andDSignEqualTo(String value) {
            addCriterion("d_sign =", value, "dSign");
            return (Criteria) this;
        }

        public Criteria andDSignNotEqualTo(String value) {
            addCriterion("d_sign <>", value, "dSign");
            return (Criteria) this;
        }

        public Criteria andDSignGreaterThan(String value) {
            addCriterion("d_sign >", value, "dSign");
            return (Criteria) this;
        }

        public Criteria andDSignGreaterThanOrEqualTo(String value) {
            addCriterion("d_sign >=", value, "dSign");
            return (Criteria) this;
        }

        public Criteria andDSignLessThan(String value) {
            addCriterion("d_sign <", value, "dSign");
            return (Criteria) this;
        }

        public Criteria andDSignLessThanOrEqualTo(String value) {
            addCriterion("d_sign <=", value, "dSign");
            return (Criteria) this;
        }

        public Criteria andDSignLike(String value) {
            addCriterion("d_sign like", value, "dSign");
            return (Criteria) this;
        }

        public Criteria andDSignNotLike(String value) {
            addCriterion("d_sign not like", value, "dSign");
            return (Criteria) this;
        }

        public Criteria andDSignIn(List<String> values) {
            addCriterion("d_sign in", values, "dSign");
            return (Criteria) this;
        }

        public Criteria andDSignNotIn(List<String> values) {
            addCriterion("d_sign not in", values, "dSign");
            return (Criteria) this;
        }

        public Criteria andDSignBetween(String value1, String value2) {
            addCriterion("d_sign between", value1, value2, "dSign");
            return (Criteria) this;
        }

        public Criteria andDSignNotBetween(String value1, String value2) {
            addCriterion("d_sign not between", value1, value2, "dSign");
            return (Criteria) this;
        }

        public Criteria andDUseridIsNull() {
            addCriterion("d_userid is null");
            return (Criteria) this;
        }

        public Criteria andDUseridIsNotNull() {
            addCriterion("d_userid is not null");
            return (Criteria) this;
        }

        public Criteria andDUseridEqualTo(String value) {
            addCriterion("d_userid =", value, "dUserid");
            return (Criteria) this;
        }

        public Criteria andDUseridNotEqualTo(String value) {
            addCriterion("d_userid <>", value, "dUserid");
            return (Criteria) this;
        }

        public Criteria andDUseridGreaterThan(String value) {
            addCriterion("d_userid >", value, "dUserid");
            return (Criteria) this;
        }

        public Criteria andDUseridGreaterThanOrEqualTo(String value) {
            addCriterion("d_userid >=", value, "dUserid");
            return (Criteria) this;
        }

        public Criteria andDUseridLessThan(String value) {
            addCriterion("d_userid <", value, "dUserid");
            return (Criteria) this;
        }

        public Criteria andDUseridLessThanOrEqualTo(String value) {
            addCriterion("d_userid <=", value, "dUserid");
            return (Criteria) this;
        }

        public Criteria andDUseridLike(String value) {
            addCriterion("d_userid like", value, "dUserid");
            return (Criteria) this;
        }

        public Criteria andDUseridNotLike(String value) {
            addCriterion("d_userid not like", value, "dUserid");
            return (Criteria) this;
        }

        public Criteria andDUseridIn(List<String> values) {
            addCriterion("d_userid in", values, "dUserid");
            return (Criteria) this;
        }

        public Criteria andDUseridNotIn(List<String> values) {
            addCriterion("d_userid not in", values, "dUserid");
            return (Criteria) this;
        }

        public Criteria andDUseridBetween(String value1, String value2) {
            addCriterion("d_userid between", value1, value2, "dUserid");
            return (Criteria) this;
        }

        public Criteria andDUseridNotBetween(String value1, String value2) {
            addCriterion("d_userid not between", value1, value2, "dUserid");
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