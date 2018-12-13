package com.clouds.igankong.po;

import java.util.ArrayList;
import java.util.List;

public class ReviewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReviewExample() {
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

        public Criteria andReviewTimeIsNull() {
            addCriterion("review_time is null");
            return (Criteria) this;
        }

        public Criteria andReviewTimeIsNotNull() {
            addCriterion("review_time is not null");
            return (Criteria) this;
        }

        public Criteria andReviewTimeEqualTo(String value) {
            addCriterion("review_time =", value, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeNotEqualTo(String value) {
            addCriterion("review_time <>", value, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeGreaterThan(String value) {
            addCriterion("review_time >", value, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeGreaterThanOrEqualTo(String value) {
            addCriterion("review_time >=", value, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeLessThan(String value) {
            addCriterion("review_time <", value, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeLessThanOrEqualTo(String value) {
            addCriterion("review_time <=", value, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeLike(String value) {
            addCriterion("review_time like", value, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeNotLike(String value) {
            addCriterion("review_time not like", value, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeIn(List<String> values) {
            addCriterion("review_time in", values, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeNotIn(List<String> values) {
            addCriterion("review_time not in", values, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeBetween(String value1, String value2) {
            addCriterion("review_time between", value1, value2, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeNotBetween(String value1, String value2) {
            addCriterion("review_time not between", value1, value2, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewOpenidIsNull() {
            addCriterion("review_openID is null");
            return (Criteria) this;
        }

        public Criteria andReviewOpenidIsNotNull() {
            addCriterion("review_openID is not null");
            return (Criteria) this;
        }

        public Criteria andReviewOpenidEqualTo(String value) {
            addCriterion("review_openID =", value, "reviewOpenid");
            return (Criteria) this;
        }

        public Criteria andReviewOpenidNotEqualTo(String value) {
            addCriterion("review_openID <>", value, "reviewOpenid");
            return (Criteria) this;
        }

        public Criteria andReviewOpenidGreaterThan(String value) {
            addCriterion("review_openID >", value, "reviewOpenid");
            return (Criteria) this;
        }

        public Criteria andReviewOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("review_openID >=", value, "reviewOpenid");
            return (Criteria) this;
        }

        public Criteria andReviewOpenidLessThan(String value) {
            addCriterion("review_openID <", value, "reviewOpenid");
            return (Criteria) this;
        }

        public Criteria andReviewOpenidLessThanOrEqualTo(String value) {
            addCriterion("review_openID <=", value, "reviewOpenid");
            return (Criteria) this;
        }

        public Criteria andReviewOpenidLike(String value) {
            addCriterion("review_openID like", value, "reviewOpenid");
            return (Criteria) this;
        }

        public Criteria andReviewOpenidNotLike(String value) {
            addCriterion("review_openID not like", value, "reviewOpenid");
            return (Criteria) this;
        }

        public Criteria andReviewOpenidIn(List<String> values) {
            addCriterion("review_openID in", values, "reviewOpenid");
            return (Criteria) this;
        }

        public Criteria andReviewOpenidNotIn(List<String> values) {
            addCriterion("review_openID not in", values, "reviewOpenid");
            return (Criteria) this;
        }

        public Criteria andReviewOpenidBetween(String value1, String value2) {
            addCriterion("review_openID between", value1, value2, "reviewOpenid");
            return (Criteria) this;
        }

        public Criteria andReviewOpenidNotBetween(String value1, String value2) {
            addCriterion("review_openID not between", value1, value2, "reviewOpenid");
            return (Criteria) this;
        }

        public Criteria andReviewResultIsNull() {
            addCriterion("review_result is null");
            return (Criteria) this;
        }

        public Criteria andReviewResultIsNotNull() {
            addCriterion("review_result is not null");
            return (Criteria) this;
        }

        public Criteria andReviewResultEqualTo(String value) {
            addCriterion("review_result =", value, "reviewResult");
            return (Criteria) this;
        }

        public Criteria andReviewResultNotEqualTo(String value) {
            addCriterion("review_result <>", value, "reviewResult");
            return (Criteria) this;
        }

        public Criteria andReviewResultGreaterThan(String value) {
            addCriterion("review_result >", value, "reviewResult");
            return (Criteria) this;
        }

        public Criteria andReviewResultGreaterThanOrEqualTo(String value) {
            addCriterion("review_result >=", value, "reviewResult");
            return (Criteria) this;
        }

        public Criteria andReviewResultLessThan(String value) {
            addCriterion("review_result <", value, "reviewResult");
            return (Criteria) this;
        }

        public Criteria andReviewResultLessThanOrEqualTo(String value) {
            addCriterion("review_result <=", value, "reviewResult");
            return (Criteria) this;
        }

        public Criteria andReviewResultLike(String value) {
            addCriterion("review_result like", value, "reviewResult");
            return (Criteria) this;
        }

        public Criteria andReviewResultNotLike(String value) {
            addCriterion("review_result not like", value, "reviewResult");
            return (Criteria) this;
        }

        public Criteria andReviewResultIn(List<String> values) {
            addCriterion("review_result in", values, "reviewResult");
            return (Criteria) this;
        }

        public Criteria andReviewResultNotIn(List<String> values) {
            addCriterion("review_result not in", values, "reviewResult");
            return (Criteria) this;
        }

        public Criteria andReviewResultBetween(String value1, String value2) {
            addCriterion("review_result between", value1, value2, "reviewResult");
            return (Criteria) this;
        }

        public Criteria andReviewResultNotBetween(String value1, String value2) {
            addCriterion("review_result not between", value1, value2, "reviewResult");
            return (Criteria) this;
        }

        public Criteria andReviewUseridIsNull() {
            addCriterion("review_userid is null");
            return (Criteria) this;
        }

        public Criteria andReviewUseridIsNotNull() {
            addCriterion("review_userid is not null");
            return (Criteria) this;
        }

        public Criteria andReviewUseridEqualTo(String value) {
            addCriterion("review_userid =", value, "reviewUserid");
            return (Criteria) this;
        }

        public Criteria andReviewUseridNotEqualTo(String value) {
            addCriterion("review_userid <>", value, "reviewUserid");
            return (Criteria) this;
        }

        public Criteria andReviewUseridGreaterThan(String value) {
            addCriterion("review_userid >", value, "reviewUserid");
            return (Criteria) this;
        }

        public Criteria andReviewUseridGreaterThanOrEqualTo(String value) {
            addCriterion("review_userid >=", value, "reviewUserid");
            return (Criteria) this;
        }

        public Criteria andReviewUseridLessThan(String value) {
            addCriterion("review_userid <", value, "reviewUserid");
            return (Criteria) this;
        }

        public Criteria andReviewUseridLessThanOrEqualTo(String value) {
            addCriterion("review_userid <=", value, "reviewUserid");
            return (Criteria) this;
        }

        public Criteria andReviewUseridLike(String value) {
            addCriterion("review_userid like", value, "reviewUserid");
            return (Criteria) this;
        }

        public Criteria andReviewUseridNotLike(String value) {
            addCriterion("review_userid not like", value, "reviewUserid");
            return (Criteria) this;
        }

        public Criteria andReviewUseridIn(List<String> values) {
            addCriterion("review_userid in", values, "reviewUserid");
            return (Criteria) this;
        }

        public Criteria andReviewUseridNotIn(List<String> values) {
            addCriterion("review_userid not in", values, "reviewUserid");
            return (Criteria) this;
        }

        public Criteria andReviewUseridBetween(String value1, String value2) {
            addCriterion("review_userid between", value1, value2, "reviewUserid");
            return (Criteria) this;
        }

        public Criteria andReviewUseridNotBetween(String value1, String value2) {
            addCriterion("review_userid not between", value1, value2, "reviewUserid");
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