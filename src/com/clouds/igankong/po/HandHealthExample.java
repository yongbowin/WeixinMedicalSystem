package com.clouds.igankong.po;

import java.util.ArrayList;
import java.util.List;

public class HandHealthExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HandHealthExample() {
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

        public Criteria andHOpenidIsNull() {
            addCriterion("h_openID is null");
            return (Criteria) this;
        }

        public Criteria andHOpenidIsNotNull() {
            addCriterion("h_openID is not null");
            return (Criteria) this;
        }

        public Criteria andHOpenidEqualTo(String value) {
            addCriterion("h_openID =", value, "hOpenid");
            return (Criteria) this;
        }

        public Criteria andHOpenidNotEqualTo(String value) {
            addCriterion("h_openID <>", value, "hOpenid");
            return (Criteria) this;
        }

        public Criteria andHOpenidGreaterThan(String value) {
            addCriterion("h_openID >", value, "hOpenid");
            return (Criteria) this;
        }

        public Criteria andHOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("h_openID >=", value, "hOpenid");
            return (Criteria) this;
        }

        public Criteria andHOpenidLessThan(String value) {
            addCriterion("h_openID <", value, "hOpenid");
            return (Criteria) this;
        }

        public Criteria andHOpenidLessThanOrEqualTo(String value) {
            addCriterion("h_openID <=", value, "hOpenid");
            return (Criteria) this;
        }

        public Criteria andHOpenidLike(String value) {
            addCriterion("h_openID like", value, "hOpenid");
            return (Criteria) this;
        }

        public Criteria andHOpenidNotLike(String value) {
            addCriterion("h_openID not like", value, "hOpenid");
            return (Criteria) this;
        }

        public Criteria andHOpenidIn(List<String> values) {
            addCriterion("h_openID in", values, "hOpenid");
            return (Criteria) this;
        }

        public Criteria andHOpenidNotIn(List<String> values) {
            addCriterion("h_openID not in", values, "hOpenid");
            return (Criteria) this;
        }

        public Criteria andHOpenidBetween(String value1, String value2) {
            addCriterion("h_openID between", value1, value2, "hOpenid");
            return (Criteria) this;
        }

        public Criteria andHOpenidNotBetween(String value1, String value2) {
            addCriterion("h_openID not between", value1, value2, "hOpenid");
            return (Criteria) this;
        }

        public Criteria andHTimeIsNull() {
            addCriterion("h_time is null");
            return (Criteria) this;
        }

        public Criteria andHTimeIsNotNull() {
            addCriterion("h_time is not null");
            return (Criteria) this;
        }

        public Criteria andHTimeEqualTo(String value) {
            addCriterion("h_time =", value, "hTime");
            return (Criteria) this;
        }

        public Criteria andHTimeNotEqualTo(String value) {
            addCriterion("h_time <>", value, "hTime");
            return (Criteria) this;
        }

        public Criteria andHTimeGreaterThan(String value) {
            addCriterion("h_time >", value, "hTime");
            return (Criteria) this;
        }

        public Criteria andHTimeGreaterThanOrEqualTo(String value) {
            addCriterion("h_time >=", value, "hTime");
            return (Criteria) this;
        }

        public Criteria andHTimeLessThan(String value) {
            addCriterion("h_time <", value, "hTime");
            return (Criteria) this;
        }

        public Criteria andHTimeLessThanOrEqualTo(String value) {
            addCriterion("h_time <=", value, "hTime");
            return (Criteria) this;
        }

        public Criteria andHTimeLike(String value) {
            addCriterion("h_time like", value, "hTime");
            return (Criteria) this;
        }

        public Criteria andHTimeNotLike(String value) {
            addCriterion("h_time not like", value, "hTime");
            return (Criteria) this;
        }

        public Criteria andHTimeIn(List<String> values) {
            addCriterion("h_time in", values, "hTime");
            return (Criteria) this;
        }

        public Criteria andHTimeNotIn(List<String> values) {
            addCriterion("h_time not in", values, "hTime");
            return (Criteria) this;
        }

        public Criteria andHTimeBetween(String value1, String value2) {
            addCriterion("h_time between", value1, value2, "hTime");
            return (Criteria) this;
        }

        public Criteria andHTimeNotBetween(String value1, String value2) {
            addCriterion("h_time not between", value1, value2, "hTime");
            return (Criteria) this;
        }

        public Criteria andHDepartmentIsNull() {
            addCriterion("h_department is null");
            return (Criteria) this;
        }

        public Criteria andHDepartmentIsNotNull() {
            addCriterion("h_department is not null");
            return (Criteria) this;
        }

        public Criteria andHDepartmentEqualTo(String value) {
            addCriterion("h_department =", value, "hDepartment");
            return (Criteria) this;
        }

        public Criteria andHDepartmentNotEqualTo(String value) {
            addCriterion("h_department <>", value, "hDepartment");
            return (Criteria) this;
        }

        public Criteria andHDepartmentGreaterThan(String value) {
            addCriterion("h_department >", value, "hDepartment");
            return (Criteria) this;
        }

        public Criteria andHDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("h_department >=", value, "hDepartment");
            return (Criteria) this;
        }

        public Criteria andHDepartmentLessThan(String value) {
            addCriterion("h_department <", value, "hDepartment");
            return (Criteria) this;
        }

        public Criteria andHDepartmentLessThanOrEqualTo(String value) {
            addCriterion("h_department <=", value, "hDepartment");
            return (Criteria) this;
        }

        public Criteria andHDepartmentLike(String value) {
            addCriterion("h_department like", value, "hDepartment");
            return (Criteria) this;
        }

        public Criteria andHDepartmentNotLike(String value) {
            addCriterion("h_department not like", value, "hDepartment");
            return (Criteria) this;
        }

        public Criteria andHDepartmentIn(List<String> values) {
            addCriterion("h_department in", values, "hDepartment");
            return (Criteria) this;
        }

        public Criteria andHDepartmentNotIn(List<String> values) {
            addCriterion("h_department not in", values, "hDepartment");
            return (Criteria) this;
        }

        public Criteria andHDepartmentBetween(String value1, String value2) {
            addCriterion("h_department between", value1, value2, "hDepartment");
            return (Criteria) this;
        }

        public Criteria andHDepartmentNotBetween(String value1, String value2) {
            addCriterion("h_department not between", value1, value2, "hDepartment");
            return (Criteria) this;
        }

        public Criteria andHDepartmentSubIsNull() {
            addCriterion("h_department_sub is null");
            return (Criteria) this;
        }

        public Criteria andHDepartmentSubIsNotNull() {
            addCriterion("h_department_sub is not null");
            return (Criteria) this;
        }

        public Criteria andHDepartmentSubEqualTo(String value) {
            addCriterion("h_department_sub =", value, "hDepartmentSub");
            return (Criteria) this;
        }

        public Criteria andHDepartmentSubNotEqualTo(String value) {
            addCriterion("h_department_sub <>", value, "hDepartmentSub");
            return (Criteria) this;
        }

        public Criteria andHDepartmentSubGreaterThan(String value) {
            addCriterion("h_department_sub >", value, "hDepartmentSub");
            return (Criteria) this;
        }

        public Criteria andHDepartmentSubGreaterThanOrEqualTo(String value) {
            addCriterion("h_department_sub >=", value, "hDepartmentSub");
            return (Criteria) this;
        }

        public Criteria andHDepartmentSubLessThan(String value) {
            addCriterion("h_department_sub <", value, "hDepartmentSub");
            return (Criteria) this;
        }

        public Criteria andHDepartmentSubLessThanOrEqualTo(String value) {
            addCriterion("h_department_sub <=", value, "hDepartmentSub");
            return (Criteria) this;
        }

        public Criteria andHDepartmentSubLike(String value) {
            addCriterion("h_department_sub like", value, "hDepartmentSub");
            return (Criteria) this;
        }

        public Criteria andHDepartmentSubNotLike(String value) {
            addCriterion("h_department_sub not like", value, "hDepartmentSub");
            return (Criteria) this;
        }

        public Criteria andHDepartmentSubIn(List<String> values) {
            addCriterion("h_department_sub in", values, "hDepartmentSub");
            return (Criteria) this;
        }

        public Criteria andHDepartmentSubNotIn(List<String> values) {
            addCriterion("h_department_sub not in", values, "hDepartmentSub");
            return (Criteria) this;
        }

        public Criteria andHDepartmentSubBetween(String value1, String value2) {
            addCriterion("h_department_sub between", value1, value2, "hDepartmentSub");
            return (Criteria) this;
        }

        public Criteria andHDepartmentSubNotBetween(String value1, String value2) {
            addCriterion("h_department_sub not between", value1, value2, "hDepartmentSub");
            return (Criteria) this;
        }

        public Criteria andHRoleIsNull() {
            addCriterion("h_role is null");
            return (Criteria) this;
        }

        public Criteria andHRoleIsNotNull() {
            addCriterion("h_role is not null");
            return (Criteria) this;
        }

        public Criteria andHRoleEqualTo(String value) {
            addCriterion("h_role =", value, "hRole");
            return (Criteria) this;
        }

        public Criteria andHRoleNotEqualTo(String value) {
            addCriterion("h_role <>", value, "hRole");
            return (Criteria) this;
        }

        public Criteria andHRoleGreaterThan(String value) {
            addCriterion("h_role >", value, "hRole");
            return (Criteria) this;
        }

        public Criteria andHRoleGreaterThanOrEqualTo(String value) {
            addCriterion("h_role >=", value, "hRole");
            return (Criteria) this;
        }

        public Criteria andHRoleLessThan(String value) {
            addCriterion("h_role <", value, "hRole");
            return (Criteria) this;
        }

        public Criteria andHRoleLessThanOrEqualTo(String value) {
            addCriterion("h_role <=", value, "hRole");
            return (Criteria) this;
        }

        public Criteria andHRoleLike(String value) {
            addCriterion("h_role like", value, "hRole");
            return (Criteria) this;
        }

        public Criteria andHRoleNotLike(String value) {
            addCriterion("h_role not like", value, "hRole");
            return (Criteria) this;
        }

        public Criteria andHRoleIn(List<String> values) {
            addCriterion("h_role in", values, "hRole");
            return (Criteria) this;
        }

        public Criteria andHRoleNotIn(List<String> values) {
            addCriterion("h_role not in", values, "hRole");
            return (Criteria) this;
        }

        public Criteria andHRoleBetween(String value1, String value2) {
            addCriterion("h_role between", value1, value2, "hRole");
            return (Criteria) this;
        }

        public Criteria andHRoleNotBetween(String value1, String value2) {
            addCriterion("h_role not between", value1, value2, "hRole");
            return (Criteria) this;
        }

        public Criteria andHBehaviorIsNull() {
            addCriterion("h_behavior is null");
            return (Criteria) this;
        }

        public Criteria andHBehaviorIsNotNull() {
            addCriterion("h_behavior is not null");
            return (Criteria) this;
        }

        public Criteria andHBehaviorEqualTo(String value) {
            addCriterion("h_behavior =", value, "hBehavior");
            return (Criteria) this;
        }

        public Criteria andHBehaviorNotEqualTo(String value) {
            addCriterion("h_behavior <>", value, "hBehavior");
            return (Criteria) this;
        }

        public Criteria andHBehaviorGreaterThan(String value) {
            addCriterion("h_behavior >", value, "hBehavior");
            return (Criteria) this;
        }

        public Criteria andHBehaviorGreaterThanOrEqualTo(String value) {
            addCriterion("h_behavior >=", value, "hBehavior");
            return (Criteria) this;
        }

        public Criteria andHBehaviorLessThan(String value) {
            addCriterion("h_behavior <", value, "hBehavior");
            return (Criteria) this;
        }

        public Criteria andHBehaviorLessThanOrEqualTo(String value) {
            addCriterion("h_behavior <=", value, "hBehavior");
            return (Criteria) this;
        }

        public Criteria andHBehaviorLike(String value) {
            addCriterion("h_behavior like", value, "hBehavior");
            return (Criteria) this;
        }

        public Criteria andHBehaviorNotLike(String value) {
            addCriterion("h_behavior not like", value, "hBehavior");
            return (Criteria) this;
        }

        public Criteria andHBehaviorIn(List<String> values) {
            addCriterion("h_behavior in", values, "hBehavior");
            return (Criteria) this;
        }

        public Criteria andHBehaviorNotIn(List<String> values) {
            addCriterion("h_behavior not in", values, "hBehavior");
            return (Criteria) this;
        }

        public Criteria andHBehaviorBetween(String value1, String value2) {
            addCriterion("h_behavior between", value1, value2, "hBehavior");
            return (Criteria) this;
        }

        public Criteria andHBehaviorNotBetween(String value1, String value2) {
            addCriterion("h_behavior not between", value1, value2, "hBehavior");
            return (Criteria) this;
        }

        public Criteria andHSignIsNull() {
            addCriterion("h_sign is null");
            return (Criteria) this;
        }

        public Criteria andHSignIsNotNull() {
            addCriterion("h_sign is not null");
            return (Criteria) this;
        }

        public Criteria andHSignEqualTo(String value) {
            addCriterion("h_sign =", value, "hSign");
            return (Criteria) this;
        }

        public Criteria andHSignNotEqualTo(String value) {
            addCriterion("h_sign <>", value, "hSign");
            return (Criteria) this;
        }

        public Criteria andHSignGreaterThan(String value) {
            addCriterion("h_sign >", value, "hSign");
            return (Criteria) this;
        }

        public Criteria andHSignGreaterThanOrEqualTo(String value) {
            addCriterion("h_sign >=", value, "hSign");
            return (Criteria) this;
        }

        public Criteria andHSignLessThan(String value) {
            addCriterion("h_sign <", value, "hSign");
            return (Criteria) this;
        }

        public Criteria andHSignLessThanOrEqualTo(String value) {
            addCriterion("h_sign <=", value, "hSign");
            return (Criteria) this;
        }

        public Criteria andHSignLike(String value) {
            addCriterion("h_sign like", value, "hSign");
            return (Criteria) this;
        }

        public Criteria andHSignNotLike(String value) {
            addCriterion("h_sign not like", value, "hSign");
            return (Criteria) this;
        }

        public Criteria andHSignIn(List<String> values) {
            addCriterion("h_sign in", values, "hSign");
            return (Criteria) this;
        }

        public Criteria andHSignNotIn(List<String> values) {
            addCriterion("h_sign not in", values, "hSign");
            return (Criteria) this;
        }

        public Criteria andHSignBetween(String value1, String value2) {
            addCriterion("h_sign between", value1, value2, "hSign");
            return (Criteria) this;
        }

        public Criteria andHSignNotBetween(String value1, String value2) {
            addCriterion("h_sign not between", value1, value2, "hSign");
            return (Criteria) this;
        }

        public Criteria andHUseridIsNull() {
            addCriterion("h_userid is null");
            return (Criteria) this;
        }

        public Criteria andHUseridIsNotNull() {
            addCriterion("h_userid is not null");
            return (Criteria) this;
        }

        public Criteria andHUseridEqualTo(String value) {
            addCriterion("h_userid =", value, "hUserid");
            return (Criteria) this;
        }

        public Criteria andHUseridNotEqualTo(String value) {
            addCriterion("h_userid <>", value, "hUserid");
            return (Criteria) this;
        }

        public Criteria andHUseridGreaterThan(String value) {
            addCriterion("h_userid >", value, "hUserid");
            return (Criteria) this;
        }

        public Criteria andHUseridGreaterThanOrEqualTo(String value) {
            addCriterion("h_userid >=", value, "hUserid");
            return (Criteria) this;
        }

        public Criteria andHUseridLessThan(String value) {
            addCriterion("h_userid <", value, "hUserid");
            return (Criteria) this;
        }

        public Criteria andHUseridLessThanOrEqualTo(String value) {
            addCriterion("h_userid <=", value, "hUserid");
            return (Criteria) this;
        }

        public Criteria andHUseridLike(String value) {
            addCriterion("h_userid like", value, "hUserid");
            return (Criteria) this;
        }

        public Criteria andHUseridNotLike(String value) {
            addCriterion("h_userid not like", value, "hUserid");
            return (Criteria) this;
        }

        public Criteria andHUseridIn(List<String> values) {
            addCriterion("h_userid in", values, "hUserid");
            return (Criteria) this;
        }

        public Criteria andHUseridNotIn(List<String> values) {
            addCriterion("h_userid not in", values, "hUserid");
            return (Criteria) this;
        }

        public Criteria andHUseridBetween(String value1, String value2) {
            addCriterion("h_userid between", value1, value2, "hUserid");
            return (Criteria) this;
        }

        public Criteria andHUseridNotBetween(String value1, String value2) {
            addCriterion("h_userid not between", value1, value2, "hUserid");
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