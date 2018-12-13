package com.clouds.igankong.po;

import java.util.ArrayList;
import java.util.List;

public class NoticeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NoticeExample() {
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

        public Criteria andNDepartmentIsNull() {
            addCriterion("n_department is null");
            return (Criteria) this;
        }

        public Criteria andNDepartmentIsNotNull() {
            addCriterion("n_department is not null");
            return (Criteria) this;
        }

        public Criteria andNDepartmentEqualTo(String value) {
            addCriterion("n_department =", value, "nDepartment");
            return (Criteria) this;
        }

        public Criteria andNDepartmentNotEqualTo(String value) {
            addCriterion("n_department <>", value, "nDepartment");
            return (Criteria) this;
        }

        public Criteria andNDepartmentGreaterThan(String value) {
            addCriterion("n_department >", value, "nDepartment");
            return (Criteria) this;
        }

        public Criteria andNDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("n_department >=", value, "nDepartment");
            return (Criteria) this;
        }

        public Criteria andNDepartmentLessThan(String value) {
            addCriterion("n_department <", value, "nDepartment");
            return (Criteria) this;
        }

        public Criteria andNDepartmentLessThanOrEqualTo(String value) {
            addCriterion("n_department <=", value, "nDepartment");
            return (Criteria) this;
        }

        public Criteria andNDepartmentLike(String value) {
            addCriterion("n_department like", value, "nDepartment");
            return (Criteria) this;
        }

        public Criteria andNDepartmentNotLike(String value) {
            addCriterion("n_department not like", value, "nDepartment");
            return (Criteria) this;
        }

        public Criteria andNDepartmentIn(List<String> values) {
            addCriterion("n_department in", values, "nDepartment");
            return (Criteria) this;
        }

        public Criteria andNDepartmentNotIn(List<String> values) {
            addCriterion("n_department not in", values, "nDepartment");
            return (Criteria) this;
        }

        public Criteria andNDepartmentBetween(String value1, String value2) {
            addCriterion("n_department between", value1, value2, "nDepartment");
            return (Criteria) this;
        }

        public Criteria andNDepartmentNotBetween(String value1, String value2) {
            addCriterion("n_department not between", value1, value2, "nDepartment");
            return (Criteria) this;
        }

        public Criteria andNScopeIsNull() {
            addCriterion("n_scope is null");
            return (Criteria) this;
        }

        public Criteria andNScopeIsNotNull() {
            addCriterion("n_scope is not null");
            return (Criteria) this;
        }

        public Criteria andNScopeEqualTo(String value) {
            addCriterion("n_scope =", value, "nScope");
            return (Criteria) this;
        }

        public Criteria andNScopeNotEqualTo(String value) {
            addCriterion("n_scope <>", value, "nScope");
            return (Criteria) this;
        }

        public Criteria andNScopeGreaterThan(String value) {
            addCriterion("n_scope >", value, "nScope");
            return (Criteria) this;
        }

        public Criteria andNScopeGreaterThanOrEqualTo(String value) {
            addCriterion("n_scope >=", value, "nScope");
            return (Criteria) this;
        }

        public Criteria andNScopeLessThan(String value) {
            addCriterion("n_scope <", value, "nScope");
            return (Criteria) this;
        }

        public Criteria andNScopeLessThanOrEqualTo(String value) {
            addCriterion("n_scope <=", value, "nScope");
            return (Criteria) this;
        }

        public Criteria andNScopeLike(String value) {
            addCriterion("n_scope like", value, "nScope");
            return (Criteria) this;
        }

        public Criteria andNScopeNotLike(String value) {
            addCriterion("n_scope not like", value, "nScope");
            return (Criteria) this;
        }

        public Criteria andNScopeIn(List<String> values) {
            addCriterion("n_scope in", values, "nScope");
            return (Criteria) this;
        }

        public Criteria andNScopeNotIn(List<String> values) {
            addCriterion("n_scope not in", values, "nScope");
            return (Criteria) this;
        }

        public Criteria andNScopeBetween(String value1, String value2) {
            addCriterion("n_scope between", value1, value2, "nScope");
            return (Criteria) this;
        }

        public Criteria andNScopeNotBetween(String value1, String value2) {
            addCriterion("n_scope not between", value1, value2, "nScope");
            return (Criteria) this;
        }

        public Criteria andNSendTimeIsNull() {
            addCriterion("n_send_time is null");
            return (Criteria) this;
        }

        public Criteria andNSendTimeIsNotNull() {
            addCriterion("n_send_time is not null");
            return (Criteria) this;
        }

        public Criteria andNSendTimeEqualTo(String value) {
            addCriterion("n_send_time =", value, "nSendTime");
            return (Criteria) this;
        }

        public Criteria andNSendTimeNotEqualTo(String value) {
            addCriterion("n_send_time <>", value, "nSendTime");
            return (Criteria) this;
        }

        public Criteria andNSendTimeGreaterThan(String value) {
            addCriterion("n_send_time >", value, "nSendTime");
            return (Criteria) this;
        }

        public Criteria andNSendTimeGreaterThanOrEqualTo(String value) {
            addCriterion("n_send_time >=", value, "nSendTime");
            return (Criteria) this;
        }

        public Criteria andNSendTimeLessThan(String value) {
            addCriterion("n_send_time <", value, "nSendTime");
            return (Criteria) this;
        }

        public Criteria andNSendTimeLessThanOrEqualTo(String value) {
            addCriterion("n_send_time <=", value, "nSendTime");
            return (Criteria) this;
        }

        public Criteria andNSendTimeLike(String value) {
            addCriterion("n_send_time like", value, "nSendTime");
            return (Criteria) this;
        }

        public Criteria andNSendTimeNotLike(String value) {
            addCriterion("n_send_time not like", value, "nSendTime");
            return (Criteria) this;
        }

        public Criteria andNSendTimeIn(List<String> values) {
            addCriterion("n_send_time in", values, "nSendTime");
            return (Criteria) this;
        }

        public Criteria andNSendTimeNotIn(List<String> values) {
            addCriterion("n_send_time not in", values, "nSendTime");
            return (Criteria) this;
        }

        public Criteria andNSendTimeBetween(String value1, String value2) {
            addCriterion("n_send_time between", value1, value2, "nSendTime");
            return (Criteria) this;
        }

        public Criteria andNSendTimeNotBetween(String value1, String value2) {
            addCriterion("n_send_time not between", value1, value2, "nSendTime");
            return (Criteria) this;
        }

        public Criteria andNSenderIsNull() {
            addCriterion("n_sender is null");
            return (Criteria) this;
        }

        public Criteria andNSenderIsNotNull() {
            addCriterion("n_sender is not null");
            return (Criteria) this;
        }

        public Criteria andNSenderEqualTo(String value) {
            addCriterion("n_sender =", value, "nSender");
            return (Criteria) this;
        }

        public Criteria andNSenderNotEqualTo(String value) {
            addCriterion("n_sender <>", value, "nSender");
            return (Criteria) this;
        }

        public Criteria andNSenderGreaterThan(String value) {
            addCriterion("n_sender >", value, "nSender");
            return (Criteria) this;
        }

        public Criteria andNSenderGreaterThanOrEqualTo(String value) {
            addCriterion("n_sender >=", value, "nSender");
            return (Criteria) this;
        }

        public Criteria andNSenderLessThan(String value) {
            addCriterion("n_sender <", value, "nSender");
            return (Criteria) this;
        }

        public Criteria andNSenderLessThanOrEqualTo(String value) {
            addCriterion("n_sender <=", value, "nSender");
            return (Criteria) this;
        }

        public Criteria andNSenderLike(String value) {
            addCriterion("n_sender like", value, "nSender");
            return (Criteria) this;
        }

        public Criteria andNSenderNotLike(String value) {
            addCriterion("n_sender not like", value, "nSender");
            return (Criteria) this;
        }

        public Criteria andNSenderIn(List<String> values) {
            addCriterion("n_sender in", values, "nSender");
            return (Criteria) this;
        }

        public Criteria andNSenderNotIn(List<String> values) {
            addCriterion("n_sender not in", values, "nSender");
            return (Criteria) this;
        }

        public Criteria andNSenderBetween(String value1, String value2) {
            addCriterion("n_sender between", value1, value2, "nSender");
            return (Criteria) this;
        }

        public Criteria andNSenderNotBetween(String value1, String value2) {
            addCriterion("n_sender not between", value1, value2, "nSender");
            return (Criteria) this;
        }

        public Criteria andNSenderOpenidIsNull() {
            addCriterion("n_sender_openID is null");
            return (Criteria) this;
        }

        public Criteria andNSenderOpenidIsNotNull() {
            addCriterion("n_sender_openID is not null");
            return (Criteria) this;
        }

        public Criteria andNSenderOpenidEqualTo(String value) {
            addCriterion("n_sender_openID =", value, "nSenderOpenid");
            return (Criteria) this;
        }

        public Criteria andNSenderOpenidNotEqualTo(String value) {
            addCriterion("n_sender_openID <>", value, "nSenderOpenid");
            return (Criteria) this;
        }

        public Criteria andNSenderOpenidGreaterThan(String value) {
            addCriterion("n_sender_openID >", value, "nSenderOpenid");
            return (Criteria) this;
        }

        public Criteria andNSenderOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("n_sender_openID >=", value, "nSenderOpenid");
            return (Criteria) this;
        }

        public Criteria andNSenderOpenidLessThan(String value) {
            addCriterion("n_sender_openID <", value, "nSenderOpenid");
            return (Criteria) this;
        }

        public Criteria andNSenderOpenidLessThanOrEqualTo(String value) {
            addCriterion("n_sender_openID <=", value, "nSenderOpenid");
            return (Criteria) this;
        }

        public Criteria andNSenderOpenidLike(String value) {
            addCriterion("n_sender_openID like", value, "nSenderOpenid");
            return (Criteria) this;
        }

        public Criteria andNSenderOpenidNotLike(String value) {
            addCriterion("n_sender_openID not like", value, "nSenderOpenid");
            return (Criteria) this;
        }

        public Criteria andNSenderOpenidIn(List<String> values) {
            addCriterion("n_sender_openID in", values, "nSenderOpenid");
            return (Criteria) this;
        }

        public Criteria andNSenderOpenidNotIn(List<String> values) {
            addCriterion("n_sender_openID not in", values, "nSenderOpenid");
            return (Criteria) this;
        }

        public Criteria andNSenderOpenidBetween(String value1, String value2) {
            addCriterion("n_sender_openID between", value1, value2, "nSenderOpenid");
            return (Criteria) this;
        }

        public Criteria andNSenderOpenidNotBetween(String value1, String value2) {
            addCriterion("n_sender_openID not between", value1, value2, "nSenderOpenid");
            return (Criteria) this;
        }

        public Criteria andNContentIsNull() {
            addCriterion("n_content is null");
            return (Criteria) this;
        }

        public Criteria andNContentIsNotNull() {
            addCriterion("n_content is not null");
            return (Criteria) this;
        }

        public Criteria andNContentEqualTo(String value) {
            addCriterion("n_content =", value, "nContent");
            return (Criteria) this;
        }

        public Criteria andNContentNotEqualTo(String value) {
            addCriterion("n_content <>", value, "nContent");
            return (Criteria) this;
        }

        public Criteria andNContentGreaterThan(String value) {
            addCriterion("n_content >", value, "nContent");
            return (Criteria) this;
        }

        public Criteria andNContentGreaterThanOrEqualTo(String value) {
            addCriterion("n_content >=", value, "nContent");
            return (Criteria) this;
        }

        public Criteria andNContentLessThan(String value) {
            addCriterion("n_content <", value, "nContent");
            return (Criteria) this;
        }

        public Criteria andNContentLessThanOrEqualTo(String value) {
            addCriterion("n_content <=", value, "nContent");
            return (Criteria) this;
        }

        public Criteria andNContentLike(String value) {
            addCriterion("n_content like", value, "nContent");
            return (Criteria) this;
        }

        public Criteria andNContentNotLike(String value) {
            addCriterion("n_content not like", value, "nContent");
            return (Criteria) this;
        }

        public Criteria andNContentIn(List<String> values) {
            addCriterion("n_content in", values, "nContent");
            return (Criteria) this;
        }

        public Criteria andNContentNotIn(List<String> values) {
            addCriterion("n_content not in", values, "nContent");
            return (Criteria) this;
        }

        public Criteria andNContentBetween(String value1, String value2) {
            addCriterion("n_content between", value1, value2, "nContent");
            return (Criteria) this;
        }

        public Criteria andNContentNotBetween(String value1, String value2) {
            addCriterion("n_content not between", value1, value2, "nContent");
            return (Criteria) this;
        }

        public Criteria andNSenderUseridIsNull() {
            addCriterion("n_sender_userid is null");
            return (Criteria) this;
        }

        public Criteria andNSenderUseridIsNotNull() {
            addCriterion("n_sender_userid is not null");
            return (Criteria) this;
        }

        public Criteria andNSenderUseridEqualTo(String value) {
            addCriterion("n_sender_userid =", value, "nSenderUserid");
            return (Criteria) this;
        }

        public Criteria andNSenderUseridNotEqualTo(String value) {
            addCriterion("n_sender_userid <>", value, "nSenderUserid");
            return (Criteria) this;
        }

        public Criteria andNSenderUseridGreaterThan(String value) {
            addCriterion("n_sender_userid >", value, "nSenderUserid");
            return (Criteria) this;
        }

        public Criteria andNSenderUseridGreaterThanOrEqualTo(String value) {
            addCriterion("n_sender_userid >=", value, "nSenderUserid");
            return (Criteria) this;
        }

        public Criteria andNSenderUseridLessThan(String value) {
            addCriterion("n_sender_userid <", value, "nSenderUserid");
            return (Criteria) this;
        }

        public Criteria andNSenderUseridLessThanOrEqualTo(String value) {
            addCriterion("n_sender_userid <=", value, "nSenderUserid");
            return (Criteria) this;
        }

        public Criteria andNSenderUseridLike(String value) {
            addCriterion("n_sender_userid like", value, "nSenderUserid");
            return (Criteria) this;
        }

        public Criteria andNSenderUseridNotLike(String value) {
            addCriterion("n_sender_userid not like", value, "nSenderUserid");
            return (Criteria) this;
        }

        public Criteria andNSenderUseridIn(List<String> values) {
            addCriterion("n_sender_userid in", values, "nSenderUserid");
            return (Criteria) this;
        }

        public Criteria andNSenderUseridNotIn(List<String> values) {
            addCriterion("n_sender_userid not in", values, "nSenderUserid");
            return (Criteria) this;
        }

        public Criteria andNSenderUseridBetween(String value1, String value2) {
            addCriterion("n_sender_userid between", value1, value2, "nSenderUserid");
            return (Criteria) this;
        }

        public Criteria andNSenderUseridNotBetween(String value1, String value2) {
            addCriterion("n_sender_userid not between", value1, value2, "nSenderUserid");
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