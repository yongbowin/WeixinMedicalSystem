package com.clouds.igankong.po;

import java.util.ArrayList;
import java.util.List;

public class RemindExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RemindExample() {
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

        public Criteria andRTimeIsNull() {
            addCriterion("r_time is null");
            return (Criteria) this;
        }

        public Criteria andRTimeIsNotNull() {
            addCriterion("r_time is not null");
            return (Criteria) this;
        }

        public Criteria andRTimeEqualTo(String value) {
            addCriterion("r_time =", value, "rTime");
            return (Criteria) this;
        }

        public Criteria andRTimeNotEqualTo(String value) {
            addCriterion("r_time <>", value, "rTime");
            return (Criteria) this;
        }

        public Criteria andRTimeGreaterThan(String value) {
            addCriterion("r_time >", value, "rTime");
            return (Criteria) this;
        }

        public Criteria andRTimeGreaterThanOrEqualTo(String value) {
            addCriterion("r_time >=", value, "rTime");
            return (Criteria) this;
        }

        public Criteria andRTimeLessThan(String value) {
            addCriterion("r_time <", value, "rTime");
            return (Criteria) this;
        }

        public Criteria andRTimeLessThanOrEqualTo(String value) {
            addCriterion("r_time <=", value, "rTime");
            return (Criteria) this;
        }

        public Criteria andRTimeLike(String value) {
            addCriterion("r_time like", value, "rTime");
            return (Criteria) this;
        }

        public Criteria andRTimeNotLike(String value) {
            addCriterion("r_time not like", value, "rTime");
            return (Criteria) this;
        }

        public Criteria andRTimeIn(List<String> values) {
            addCriterion("r_time in", values, "rTime");
            return (Criteria) this;
        }

        public Criteria andRTimeNotIn(List<String> values) {
            addCriterion("r_time not in", values, "rTime");
            return (Criteria) this;
        }

        public Criteria andRTimeBetween(String value1, String value2) {
            addCriterion("r_time between", value1, value2, "rTime");
            return (Criteria) this;
        }

        public Criteria andRTimeNotBetween(String value1, String value2) {
            addCriterion("r_time not between", value1, value2, "rTime");
            return (Criteria) this;
        }

        public Criteria andRRelatePersonIsNull() {
            addCriterion("r_relate_person is null");
            return (Criteria) this;
        }

        public Criteria andRRelatePersonIsNotNull() {
            addCriterion("r_relate_person is not null");
            return (Criteria) this;
        }

        public Criteria andRRelatePersonEqualTo(String value) {
            addCriterion("r_relate_person =", value, "rRelatePerson");
            return (Criteria) this;
        }

        public Criteria andRRelatePersonNotEqualTo(String value) {
            addCriterion("r_relate_person <>", value, "rRelatePerson");
            return (Criteria) this;
        }

        public Criteria andRRelatePersonGreaterThan(String value) {
            addCriterion("r_relate_person >", value, "rRelatePerson");
            return (Criteria) this;
        }

        public Criteria andRRelatePersonGreaterThanOrEqualTo(String value) {
            addCriterion("r_relate_person >=", value, "rRelatePerson");
            return (Criteria) this;
        }

        public Criteria andRRelatePersonLessThan(String value) {
            addCriterion("r_relate_person <", value, "rRelatePerson");
            return (Criteria) this;
        }

        public Criteria andRRelatePersonLessThanOrEqualTo(String value) {
            addCriterion("r_relate_person <=", value, "rRelatePerson");
            return (Criteria) this;
        }

        public Criteria andRRelatePersonLike(String value) {
            addCriterion("r_relate_person like", value, "rRelatePerson");
            return (Criteria) this;
        }

        public Criteria andRRelatePersonNotLike(String value) {
            addCriterion("r_relate_person not like", value, "rRelatePerson");
            return (Criteria) this;
        }

        public Criteria andRRelatePersonIn(List<String> values) {
            addCriterion("r_relate_person in", values, "rRelatePerson");
            return (Criteria) this;
        }

        public Criteria andRRelatePersonNotIn(List<String> values) {
            addCriterion("r_relate_person not in", values, "rRelatePerson");
            return (Criteria) this;
        }

        public Criteria andRRelatePersonBetween(String value1, String value2) {
            addCriterion("r_relate_person between", value1, value2, "rRelatePerson");
            return (Criteria) this;
        }

        public Criteria andRRelatePersonNotBetween(String value1, String value2) {
            addCriterion("r_relate_person not between", value1, value2, "rRelatePerson");
            return (Criteria) this;
        }

        public Criteria andRRemarkIsNull() {
            addCriterion("r_remark is null");
            return (Criteria) this;
        }

        public Criteria andRRemarkIsNotNull() {
            addCriterion("r_remark is not null");
            return (Criteria) this;
        }

        public Criteria andRRemarkEqualTo(String value) {
            addCriterion("r_remark =", value, "rRemark");
            return (Criteria) this;
        }

        public Criteria andRRemarkNotEqualTo(String value) {
            addCriterion("r_remark <>", value, "rRemark");
            return (Criteria) this;
        }

        public Criteria andRRemarkGreaterThan(String value) {
            addCriterion("r_remark >", value, "rRemark");
            return (Criteria) this;
        }

        public Criteria andRRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("r_remark >=", value, "rRemark");
            return (Criteria) this;
        }

        public Criteria andRRemarkLessThan(String value) {
            addCriterion("r_remark <", value, "rRemark");
            return (Criteria) this;
        }

        public Criteria andRRemarkLessThanOrEqualTo(String value) {
            addCriterion("r_remark <=", value, "rRemark");
            return (Criteria) this;
        }

        public Criteria andRRemarkLike(String value) {
            addCriterion("r_remark like", value, "rRemark");
            return (Criteria) this;
        }

        public Criteria andRRemarkNotLike(String value) {
            addCriterion("r_remark not like", value, "rRemark");
            return (Criteria) this;
        }

        public Criteria andRRemarkIn(List<String> values) {
            addCriterion("r_remark in", values, "rRemark");
            return (Criteria) this;
        }

        public Criteria andRRemarkNotIn(List<String> values) {
            addCriterion("r_remark not in", values, "rRemark");
            return (Criteria) this;
        }

        public Criteria andRRemarkBetween(String value1, String value2) {
            addCriterion("r_remark between", value1, value2, "rRemark");
            return (Criteria) this;
        }

        public Criteria andRRemarkNotBetween(String value1, String value2) {
            addCriterion("r_remark not between", value1, value2, "rRemark");
            return (Criteria) this;
        }

        public Criteria andRStatusIsNull() {
            addCriterion("r_status is null");
            return (Criteria) this;
        }

        public Criteria andRStatusIsNotNull() {
            addCriterion("r_status is not null");
            return (Criteria) this;
        }

        public Criteria andRStatusEqualTo(String value) {
            addCriterion("r_status =", value, "rStatus");
            return (Criteria) this;
        }

        public Criteria andRStatusNotEqualTo(String value) {
            addCriterion("r_status <>", value, "rStatus");
            return (Criteria) this;
        }

        public Criteria andRStatusGreaterThan(String value) {
            addCriterion("r_status >", value, "rStatus");
            return (Criteria) this;
        }

        public Criteria andRStatusGreaterThanOrEqualTo(String value) {
            addCriterion("r_status >=", value, "rStatus");
            return (Criteria) this;
        }

        public Criteria andRStatusLessThan(String value) {
            addCriterion("r_status <", value, "rStatus");
            return (Criteria) this;
        }

        public Criteria andRStatusLessThanOrEqualTo(String value) {
            addCriterion("r_status <=", value, "rStatus");
            return (Criteria) this;
        }

        public Criteria andRStatusLike(String value) {
            addCriterion("r_status like", value, "rStatus");
            return (Criteria) this;
        }

        public Criteria andRStatusNotLike(String value) {
            addCriterion("r_status not like", value, "rStatus");
            return (Criteria) this;
        }

        public Criteria andRStatusIn(List<String> values) {
            addCriterion("r_status in", values, "rStatus");
            return (Criteria) this;
        }

        public Criteria andRStatusNotIn(List<String> values) {
            addCriterion("r_status not in", values, "rStatus");
            return (Criteria) this;
        }

        public Criteria andRStatusBetween(String value1, String value2) {
            addCriterion("r_status between", value1, value2, "rStatus");
            return (Criteria) this;
        }

        public Criteria andRStatusNotBetween(String value1, String value2) {
            addCriterion("r_status not between", value1, value2, "rStatus");
            return (Criteria) this;
        }

        public Criteria andROpenidIsNull() {
            addCriterion("r_openID is null");
            return (Criteria) this;
        }

        public Criteria andROpenidIsNotNull() {
            addCriterion("r_openID is not null");
            return (Criteria) this;
        }

        public Criteria andROpenidEqualTo(String value) {
            addCriterion("r_openID =", value, "rOpenid");
            return (Criteria) this;
        }

        public Criteria andROpenidNotEqualTo(String value) {
            addCriterion("r_openID <>", value, "rOpenid");
            return (Criteria) this;
        }

        public Criteria andROpenidGreaterThan(String value) {
            addCriterion("r_openID >", value, "rOpenid");
            return (Criteria) this;
        }

        public Criteria andROpenidGreaterThanOrEqualTo(String value) {
            addCriterion("r_openID >=", value, "rOpenid");
            return (Criteria) this;
        }

        public Criteria andROpenidLessThan(String value) {
            addCriterion("r_openID <", value, "rOpenid");
            return (Criteria) this;
        }

        public Criteria andROpenidLessThanOrEqualTo(String value) {
            addCriterion("r_openID <=", value, "rOpenid");
            return (Criteria) this;
        }

        public Criteria andROpenidLike(String value) {
            addCriterion("r_openID like", value, "rOpenid");
            return (Criteria) this;
        }

        public Criteria andROpenidNotLike(String value) {
            addCriterion("r_openID not like", value, "rOpenid");
            return (Criteria) this;
        }

        public Criteria andROpenidIn(List<String> values) {
            addCriterion("r_openID in", values, "rOpenid");
            return (Criteria) this;
        }

        public Criteria andROpenidNotIn(List<String> values) {
            addCriterion("r_openID not in", values, "rOpenid");
            return (Criteria) this;
        }

        public Criteria andROpenidBetween(String value1, String value2) {
            addCriterion("r_openID between", value1, value2, "rOpenid");
            return (Criteria) this;
        }

        public Criteria andROpenidNotBetween(String value1, String value2) {
            addCriterion("r_openID not between", value1, value2, "rOpenid");
            return (Criteria) this;
        }

        public Criteria andRUseridIsNull() {
            addCriterion("r_userid is null");
            return (Criteria) this;
        }

        public Criteria andRUseridIsNotNull() {
            addCriterion("r_userid is not null");
            return (Criteria) this;
        }

        public Criteria andRUseridEqualTo(String value) {
            addCriterion("r_userid =", value, "rUserid");
            return (Criteria) this;
        }

        public Criteria andRUseridNotEqualTo(String value) {
            addCriterion("r_userid <>", value, "rUserid");
            return (Criteria) this;
        }

        public Criteria andRUseridGreaterThan(String value) {
            addCriterion("r_userid >", value, "rUserid");
            return (Criteria) this;
        }

        public Criteria andRUseridGreaterThanOrEqualTo(String value) {
            addCriterion("r_userid >=", value, "rUserid");
            return (Criteria) this;
        }

        public Criteria andRUseridLessThan(String value) {
            addCriterion("r_userid <", value, "rUserid");
            return (Criteria) this;
        }

        public Criteria andRUseridLessThanOrEqualTo(String value) {
            addCriterion("r_userid <=", value, "rUserid");
            return (Criteria) this;
        }

        public Criteria andRUseridLike(String value) {
            addCriterion("r_userid like", value, "rUserid");
            return (Criteria) this;
        }

        public Criteria andRUseridNotLike(String value) {
            addCriterion("r_userid not like", value, "rUserid");
            return (Criteria) this;
        }

        public Criteria andRUseridIn(List<String> values) {
            addCriterion("r_userid in", values, "rUserid");
            return (Criteria) this;
        }

        public Criteria andRUseridNotIn(List<String> values) {
            addCriterion("r_userid not in", values, "rUserid");
            return (Criteria) this;
        }

        public Criteria andRUseridBetween(String value1, String value2) {
            addCriterion("r_userid between", value1, value2, "rUserid");
            return (Criteria) this;
        }

        public Criteria andRUseridNotBetween(String value1, String value2) {
            addCriterion("r_userid not between", value1, value2, "rUserid");
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