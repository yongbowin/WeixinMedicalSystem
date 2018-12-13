package com.clouds.igankong.po;

import java.util.ArrayList;
import java.util.List;

public class InfectionHistoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InfectionHistoryExample() {
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

        public Criteria andInfeNameIsNull() {
            addCriterion("infe_name is null");
            return (Criteria) this;
        }

        public Criteria andInfeNameIsNotNull() {
            addCriterion("infe_name is not null");
            return (Criteria) this;
        }

        public Criteria andInfeNameEqualTo(String value) {
            addCriterion("infe_name =", value, "infeName");
            return (Criteria) this;
        }

        public Criteria andInfeNameNotEqualTo(String value) {
            addCriterion("infe_name <>", value, "infeName");
            return (Criteria) this;
        }

        public Criteria andInfeNameGreaterThan(String value) {
            addCriterion("infe_name >", value, "infeName");
            return (Criteria) this;
        }

        public Criteria andInfeNameGreaterThanOrEqualTo(String value) {
            addCriterion("infe_name >=", value, "infeName");
            return (Criteria) this;
        }

        public Criteria andInfeNameLessThan(String value) {
            addCriterion("infe_name <", value, "infeName");
            return (Criteria) this;
        }

        public Criteria andInfeNameLessThanOrEqualTo(String value) {
            addCriterion("infe_name <=", value, "infeName");
            return (Criteria) this;
        }

        public Criteria andInfeNameLike(String value) {
            addCriterion("infe_name like", value, "infeName");
            return (Criteria) this;
        }

        public Criteria andInfeNameNotLike(String value) {
            addCriterion("infe_name not like", value, "infeName");
            return (Criteria) this;
        }

        public Criteria andInfeNameIn(List<String> values) {
            addCriterion("infe_name in", values, "infeName");
            return (Criteria) this;
        }

        public Criteria andInfeNameNotIn(List<String> values) {
            addCriterion("infe_name not in", values, "infeName");
            return (Criteria) this;
        }

        public Criteria andInfeNameBetween(String value1, String value2) {
            addCriterion("infe_name between", value1, value2, "infeName");
            return (Criteria) this;
        }

        public Criteria andInfeNameNotBetween(String value1, String value2) {
            addCriterion("infe_name not between", value1, value2, "infeName");
            return (Criteria) this;
        }

        public Criteria andInfeResultIsNull() {
            addCriterion("infe_result is null");
            return (Criteria) this;
        }

        public Criteria andInfeResultIsNotNull() {
            addCriterion("infe_result is not null");
            return (Criteria) this;
        }

        public Criteria andInfeResultEqualTo(String value) {
            addCriterion("infe_result =", value, "infeResult");
            return (Criteria) this;
        }

        public Criteria andInfeResultNotEqualTo(String value) {
            addCriterion("infe_result <>", value, "infeResult");
            return (Criteria) this;
        }

        public Criteria andInfeResultGreaterThan(String value) {
            addCriterion("infe_result >", value, "infeResult");
            return (Criteria) this;
        }

        public Criteria andInfeResultGreaterThanOrEqualTo(String value) {
            addCriterion("infe_result >=", value, "infeResult");
            return (Criteria) this;
        }

        public Criteria andInfeResultLessThan(String value) {
            addCriterion("infe_result <", value, "infeResult");
            return (Criteria) this;
        }

        public Criteria andInfeResultLessThanOrEqualTo(String value) {
            addCriterion("infe_result <=", value, "infeResult");
            return (Criteria) this;
        }

        public Criteria andInfeResultLike(String value) {
            addCriterion("infe_result like", value, "infeResult");
            return (Criteria) this;
        }

        public Criteria andInfeResultNotLike(String value) {
            addCriterion("infe_result not like", value, "infeResult");
            return (Criteria) this;
        }

        public Criteria andInfeResultIn(List<String> values) {
            addCriterion("infe_result in", values, "infeResult");
            return (Criteria) this;
        }

        public Criteria andInfeResultNotIn(List<String> values) {
            addCriterion("infe_result not in", values, "infeResult");
            return (Criteria) this;
        }

        public Criteria andInfeResultBetween(String value1, String value2) {
            addCriterion("infe_result between", value1, value2, "infeResult");
            return (Criteria) this;
        }

        public Criteria andInfeResultNotBetween(String value1, String value2) {
            addCriterion("infe_result not between", value1, value2, "infeResult");
            return (Criteria) this;
        }

        public Criteria andVaccineStatusIsNull() {
            addCriterion("vaccine_status is null");
            return (Criteria) this;
        }

        public Criteria andVaccineStatusIsNotNull() {
            addCriterion("vaccine_status is not null");
            return (Criteria) this;
        }

        public Criteria andVaccineStatusEqualTo(String value) {
            addCriterion("vaccine_status =", value, "vaccineStatus");
            return (Criteria) this;
        }

        public Criteria andVaccineStatusNotEqualTo(String value) {
            addCriterion("vaccine_status <>", value, "vaccineStatus");
            return (Criteria) this;
        }

        public Criteria andVaccineStatusGreaterThan(String value) {
            addCriterion("vaccine_status >", value, "vaccineStatus");
            return (Criteria) this;
        }

        public Criteria andVaccineStatusGreaterThanOrEqualTo(String value) {
            addCriterion("vaccine_status >=", value, "vaccineStatus");
            return (Criteria) this;
        }

        public Criteria andVaccineStatusLessThan(String value) {
            addCriterion("vaccine_status <", value, "vaccineStatus");
            return (Criteria) this;
        }

        public Criteria andVaccineStatusLessThanOrEqualTo(String value) {
            addCriterion("vaccine_status <=", value, "vaccineStatus");
            return (Criteria) this;
        }

        public Criteria andVaccineStatusLike(String value) {
            addCriterion("vaccine_status like", value, "vaccineStatus");
            return (Criteria) this;
        }

        public Criteria andVaccineStatusNotLike(String value) {
            addCriterion("vaccine_status not like", value, "vaccineStatus");
            return (Criteria) this;
        }

        public Criteria andVaccineStatusIn(List<String> values) {
            addCriterion("vaccine_status in", values, "vaccineStatus");
            return (Criteria) this;
        }

        public Criteria andVaccineStatusNotIn(List<String> values) {
            addCriterion("vaccine_status not in", values, "vaccineStatus");
            return (Criteria) this;
        }

        public Criteria andVaccineStatusBetween(String value1, String value2) {
            addCriterion("vaccine_status between", value1, value2, "vaccineStatus");
            return (Criteria) this;
        }

        public Criteria andVaccineStatusNotBetween(String value1, String value2) {
            addCriterion("vaccine_status not between", value1, value2, "vaccineStatus");
            return (Criteria) this;
        }

        public Criteria andVaccineNumIsNull() {
            addCriterion("vaccine_num is null");
            return (Criteria) this;
        }

        public Criteria andVaccineNumIsNotNull() {
            addCriterion("vaccine_num is not null");
            return (Criteria) this;
        }

        public Criteria andVaccineNumEqualTo(String value) {
            addCriterion("vaccine_num =", value, "vaccineNum");
            return (Criteria) this;
        }

        public Criteria andVaccineNumNotEqualTo(String value) {
            addCriterion("vaccine_num <>", value, "vaccineNum");
            return (Criteria) this;
        }

        public Criteria andVaccineNumGreaterThan(String value) {
            addCriterion("vaccine_num >", value, "vaccineNum");
            return (Criteria) this;
        }

        public Criteria andVaccineNumGreaterThanOrEqualTo(String value) {
            addCriterion("vaccine_num >=", value, "vaccineNum");
            return (Criteria) this;
        }

        public Criteria andVaccineNumLessThan(String value) {
            addCriterion("vaccine_num <", value, "vaccineNum");
            return (Criteria) this;
        }

        public Criteria andVaccineNumLessThanOrEqualTo(String value) {
            addCriterion("vaccine_num <=", value, "vaccineNum");
            return (Criteria) this;
        }

        public Criteria andVaccineNumLike(String value) {
            addCriterion("vaccine_num like", value, "vaccineNum");
            return (Criteria) this;
        }

        public Criteria andVaccineNumNotLike(String value) {
            addCriterion("vaccine_num not like", value, "vaccineNum");
            return (Criteria) this;
        }

        public Criteria andVaccineNumIn(List<String> values) {
            addCriterion("vaccine_num in", values, "vaccineNum");
            return (Criteria) this;
        }

        public Criteria andVaccineNumNotIn(List<String> values) {
            addCriterion("vaccine_num not in", values, "vaccineNum");
            return (Criteria) this;
        }

        public Criteria andVaccineNumBetween(String value1, String value2) {
            addCriterion("vaccine_num between", value1, value2, "vaccineNum");
            return (Criteria) this;
        }

        public Criteria andVaccineNumNotBetween(String value1, String value2) {
            addCriterion("vaccine_num not between", value1, value2, "vaccineNum");
            return (Criteria) this;
        }

        public Criteria andInfeOpenidIsNull() {
            addCriterion("infe_openID is null");
            return (Criteria) this;
        }

        public Criteria andInfeOpenidIsNotNull() {
            addCriterion("infe_openID is not null");
            return (Criteria) this;
        }

        public Criteria andInfeOpenidEqualTo(String value) {
            addCriterion("infe_openID =", value, "infeOpenid");
            return (Criteria) this;
        }

        public Criteria andInfeOpenidNotEqualTo(String value) {
            addCriterion("infe_openID <>", value, "infeOpenid");
            return (Criteria) this;
        }

        public Criteria andInfeOpenidGreaterThan(String value) {
            addCriterion("infe_openID >", value, "infeOpenid");
            return (Criteria) this;
        }

        public Criteria andInfeOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("infe_openID >=", value, "infeOpenid");
            return (Criteria) this;
        }

        public Criteria andInfeOpenidLessThan(String value) {
            addCriterion("infe_openID <", value, "infeOpenid");
            return (Criteria) this;
        }

        public Criteria andInfeOpenidLessThanOrEqualTo(String value) {
            addCriterion("infe_openID <=", value, "infeOpenid");
            return (Criteria) this;
        }

        public Criteria andInfeOpenidLike(String value) {
            addCriterion("infe_openID like", value, "infeOpenid");
            return (Criteria) this;
        }

        public Criteria andInfeOpenidNotLike(String value) {
            addCriterion("infe_openID not like", value, "infeOpenid");
            return (Criteria) this;
        }

        public Criteria andInfeOpenidIn(List<String> values) {
            addCriterion("infe_openID in", values, "infeOpenid");
            return (Criteria) this;
        }

        public Criteria andInfeOpenidNotIn(List<String> values) {
            addCriterion("infe_openID not in", values, "infeOpenid");
            return (Criteria) this;
        }

        public Criteria andInfeOpenidBetween(String value1, String value2) {
            addCriterion("infe_openID between", value1, value2, "infeOpenid");
            return (Criteria) this;
        }

        public Criteria andInfeOpenidNotBetween(String value1, String value2) {
            addCriterion("infe_openID not between", value1, value2, "infeOpenid");
            return (Criteria) this;
        }

        public Criteria andInfeUseridIsNull() {
            addCriterion("infe_userid is null");
            return (Criteria) this;
        }

        public Criteria andInfeUseridIsNotNull() {
            addCriterion("infe_userid is not null");
            return (Criteria) this;
        }

        public Criteria andInfeUseridEqualTo(String value) {
            addCriterion("infe_userid =", value, "infeUserid");
            return (Criteria) this;
        }

        public Criteria andInfeUseridNotEqualTo(String value) {
            addCriterion("infe_userid <>", value, "infeUserid");
            return (Criteria) this;
        }

        public Criteria andInfeUseridGreaterThan(String value) {
            addCriterion("infe_userid >", value, "infeUserid");
            return (Criteria) this;
        }

        public Criteria andInfeUseridGreaterThanOrEqualTo(String value) {
            addCriterion("infe_userid >=", value, "infeUserid");
            return (Criteria) this;
        }

        public Criteria andInfeUseridLessThan(String value) {
            addCriterion("infe_userid <", value, "infeUserid");
            return (Criteria) this;
        }

        public Criteria andInfeUseridLessThanOrEqualTo(String value) {
            addCriterion("infe_userid <=", value, "infeUserid");
            return (Criteria) this;
        }

        public Criteria andInfeUseridLike(String value) {
            addCriterion("infe_userid like", value, "infeUserid");
            return (Criteria) this;
        }

        public Criteria andInfeUseridNotLike(String value) {
            addCriterion("infe_userid not like", value, "infeUserid");
            return (Criteria) this;
        }

        public Criteria andInfeUseridIn(List<String> values) {
            addCriterion("infe_userid in", values, "infeUserid");
            return (Criteria) this;
        }

        public Criteria andInfeUseridNotIn(List<String> values) {
            addCriterion("infe_userid not in", values, "infeUserid");
            return (Criteria) this;
        }

        public Criteria andInfeUseridBetween(String value1, String value2) {
            addCriterion("infe_userid between", value1, value2, "infeUserid");
            return (Criteria) this;
        }

        public Criteria andInfeUseridNotBetween(String value1, String value2) {
            addCriterion("infe_userid not between", value1, value2, "infeUserid");
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