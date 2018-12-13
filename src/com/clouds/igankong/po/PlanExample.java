package com.clouds.igankong.po;

import java.util.ArrayList;
import java.util.List;

public class PlanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PlanExample() {
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

        public Criteria andPTimeIsNull() {
            addCriterion("p_time is null");
            return (Criteria) this;
        }

        public Criteria andPTimeIsNotNull() {
            addCriterion("p_time is not null");
            return (Criteria) this;
        }

        public Criteria andPTimeEqualTo(String value) {
            addCriterion("p_time =", value, "pTime");
            return (Criteria) this;
        }

        public Criteria andPTimeNotEqualTo(String value) {
            addCriterion("p_time <>", value, "pTime");
            return (Criteria) this;
        }

        public Criteria andPTimeGreaterThan(String value) {
            addCriterion("p_time >", value, "pTime");
            return (Criteria) this;
        }

        public Criteria andPTimeGreaterThanOrEqualTo(String value) {
            addCriterion("p_time >=", value, "pTime");
            return (Criteria) this;
        }

        public Criteria andPTimeLessThan(String value) {
            addCriterion("p_time <", value, "pTime");
            return (Criteria) this;
        }

        public Criteria andPTimeLessThanOrEqualTo(String value) {
            addCriterion("p_time <=", value, "pTime");
            return (Criteria) this;
        }

        public Criteria andPTimeLike(String value) {
            addCriterion("p_time like", value, "pTime");
            return (Criteria) this;
        }

        public Criteria andPTimeNotLike(String value) {
            addCriterion("p_time not like", value, "pTime");
            return (Criteria) this;
        }

        public Criteria andPTimeIn(List<String> values) {
            addCriterion("p_time in", values, "pTime");
            return (Criteria) this;
        }

        public Criteria andPTimeNotIn(List<String> values) {
            addCriterion("p_time not in", values, "pTime");
            return (Criteria) this;
        }

        public Criteria andPTimeBetween(String value1, String value2) {
            addCriterion("p_time between", value1, value2, "pTime");
            return (Criteria) this;
        }

        public Criteria andPTimeNotBetween(String value1, String value2) {
            addCriterion("p_time not between", value1, value2, "pTime");
            return (Criteria) this;
        }

        public Criteria andPRelatePersonIsNull() {
            addCriterion("p_relate_person is null");
            return (Criteria) this;
        }

        public Criteria andPRelatePersonIsNotNull() {
            addCriterion("p_relate_person is not null");
            return (Criteria) this;
        }

        public Criteria andPRelatePersonEqualTo(String value) {
            addCriterion("p_relate_person =", value, "pRelatePerson");
            return (Criteria) this;
        }

        public Criteria andPRelatePersonNotEqualTo(String value) {
            addCriterion("p_relate_person <>", value, "pRelatePerson");
            return (Criteria) this;
        }

        public Criteria andPRelatePersonGreaterThan(String value) {
            addCriterion("p_relate_person >", value, "pRelatePerson");
            return (Criteria) this;
        }

        public Criteria andPRelatePersonGreaterThanOrEqualTo(String value) {
            addCriterion("p_relate_person >=", value, "pRelatePerson");
            return (Criteria) this;
        }

        public Criteria andPRelatePersonLessThan(String value) {
            addCriterion("p_relate_person <", value, "pRelatePerson");
            return (Criteria) this;
        }

        public Criteria andPRelatePersonLessThanOrEqualTo(String value) {
            addCriterion("p_relate_person <=", value, "pRelatePerson");
            return (Criteria) this;
        }

        public Criteria andPRelatePersonLike(String value) {
            addCriterion("p_relate_person like", value, "pRelatePerson");
            return (Criteria) this;
        }

        public Criteria andPRelatePersonNotLike(String value) {
            addCriterion("p_relate_person not like", value, "pRelatePerson");
            return (Criteria) this;
        }

        public Criteria andPRelatePersonIn(List<String> values) {
            addCriterion("p_relate_person in", values, "pRelatePerson");
            return (Criteria) this;
        }

        public Criteria andPRelatePersonNotIn(List<String> values) {
            addCriterion("p_relate_person not in", values, "pRelatePerson");
            return (Criteria) this;
        }

        public Criteria andPRelatePersonBetween(String value1, String value2) {
            addCriterion("p_relate_person between", value1, value2, "pRelatePerson");
            return (Criteria) this;
        }

        public Criteria andPRelatePersonNotBetween(String value1, String value2) {
            addCriterion("p_relate_person not between", value1, value2, "pRelatePerson");
            return (Criteria) this;
        }

        public Criteria andPContentIsNull() {
            addCriterion("p_content is null");
            return (Criteria) this;
        }

        public Criteria andPContentIsNotNull() {
            addCriterion("p_content is not null");
            return (Criteria) this;
        }

        public Criteria andPContentEqualTo(String value) {
            addCriterion("p_content =", value, "pContent");
            return (Criteria) this;
        }

        public Criteria andPContentNotEqualTo(String value) {
            addCriterion("p_content <>", value, "pContent");
            return (Criteria) this;
        }

        public Criteria andPContentGreaterThan(String value) {
            addCriterion("p_content >", value, "pContent");
            return (Criteria) this;
        }

        public Criteria andPContentGreaterThanOrEqualTo(String value) {
            addCriterion("p_content >=", value, "pContent");
            return (Criteria) this;
        }

        public Criteria andPContentLessThan(String value) {
            addCriterion("p_content <", value, "pContent");
            return (Criteria) this;
        }

        public Criteria andPContentLessThanOrEqualTo(String value) {
            addCriterion("p_content <=", value, "pContent");
            return (Criteria) this;
        }

        public Criteria andPContentLike(String value) {
            addCriterion("p_content like", value, "pContent");
            return (Criteria) this;
        }

        public Criteria andPContentNotLike(String value) {
            addCriterion("p_content not like", value, "pContent");
            return (Criteria) this;
        }

        public Criteria andPContentIn(List<String> values) {
            addCriterion("p_content in", values, "pContent");
            return (Criteria) this;
        }

        public Criteria andPContentNotIn(List<String> values) {
            addCriterion("p_content not in", values, "pContent");
            return (Criteria) this;
        }

        public Criteria andPContentBetween(String value1, String value2) {
            addCriterion("p_content between", value1, value2, "pContent");
            return (Criteria) this;
        }

        public Criteria andPContentNotBetween(String value1, String value2) {
            addCriterion("p_content not between", value1, value2, "pContent");
            return (Criteria) this;
        }

        public Criteria andPOpenidIsNull() {
            addCriterion("p_openID is null");
            return (Criteria) this;
        }

        public Criteria andPOpenidIsNotNull() {
            addCriterion("p_openID is not null");
            return (Criteria) this;
        }

        public Criteria andPOpenidEqualTo(String value) {
            addCriterion("p_openID =", value, "pOpenid");
            return (Criteria) this;
        }

        public Criteria andPOpenidNotEqualTo(String value) {
            addCriterion("p_openID <>", value, "pOpenid");
            return (Criteria) this;
        }

        public Criteria andPOpenidGreaterThan(String value) {
            addCriterion("p_openID >", value, "pOpenid");
            return (Criteria) this;
        }

        public Criteria andPOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("p_openID >=", value, "pOpenid");
            return (Criteria) this;
        }

        public Criteria andPOpenidLessThan(String value) {
            addCriterion("p_openID <", value, "pOpenid");
            return (Criteria) this;
        }

        public Criteria andPOpenidLessThanOrEqualTo(String value) {
            addCriterion("p_openID <=", value, "pOpenid");
            return (Criteria) this;
        }

        public Criteria andPOpenidLike(String value) {
            addCriterion("p_openID like", value, "pOpenid");
            return (Criteria) this;
        }

        public Criteria andPOpenidNotLike(String value) {
            addCriterion("p_openID not like", value, "pOpenid");
            return (Criteria) this;
        }

        public Criteria andPOpenidIn(List<String> values) {
            addCriterion("p_openID in", values, "pOpenid");
            return (Criteria) this;
        }

        public Criteria andPOpenidNotIn(List<String> values) {
            addCriterion("p_openID not in", values, "pOpenid");
            return (Criteria) this;
        }

        public Criteria andPOpenidBetween(String value1, String value2) {
            addCriterion("p_openID between", value1, value2, "pOpenid");
            return (Criteria) this;
        }

        public Criteria andPOpenidNotBetween(String value1, String value2) {
            addCriterion("p_openID not between", value1, value2, "pOpenid");
            return (Criteria) this;
        }

        public Criteria andPUseridIsNull() {
            addCriterion("p_userid is null");
            return (Criteria) this;
        }

        public Criteria andPUseridIsNotNull() {
            addCriterion("p_userid is not null");
            return (Criteria) this;
        }

        public Criteria andPUseridEqualTo(String value) {
            addCriterion("p_userid =", value, "pUserid");
            return (Criteria) this;
        }

        public Criteria andPUseridNotEqualTo(String value) {
            addCriterion("p_userid <>", value, "pUserid");
            return (Criteria) this;
        }

        public Criteria andPUseridGreaterThan(String value) {
            addCriterion("p_userid >", value, "pUserid");
            return (Criteria) this;
        }

        public Criteria andPUseridGreaterThanOrEqualTo(String value) {
            addCriterion("p_userid >=", value, "pUserid");
            return (Criteria) this;
        }

        public Criteria andPUseridLessThan(String value) {
            addCriterion("p_userid <", value, "pUserid");
            return (Criteria) this;
        }

        public Criteria andPUseridLessThanOrEqualTo(String value) {
            addCriterion("p_userid <=", value, "pUserid");
            return (Criteria) this;
        }

        public Criteria andPUseridLike(String value) {
            addCriterion("p_userid like", value, "pUserid");
            return (Criteria) this;
        }

        public Criteria andPUseridNotLike(String value) {
            addCriterion("p_userid not like", value, "pUserid");
            return (Criteria) this;
        }

        public Criteria andPUseridIn(List<String> values) {
            addCriterion("p_userid in", values, "pUserid");
            return (Criteria) this;
        }

        public Criteria andPUseridNotIn(List<String> values) {
            addCriterion("p_userid not in", values, "pUserid");
            return (Criteria) this;
        }

        public Criteria andPUseridBetween(String value1, String value2) {
            addCriterion("p_userid between", value1, value2, "pUserid");
            return (Criteria) this;
        }

        public Criteria andPUseridNotBetween(String value1, String value2) {
            addCriterion("p_userid not between", value1, value2, "pUserid");
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