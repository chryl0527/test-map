package com.sumsoon.zzz.po;

import java.util.ArrayList;
import java.util.List;

public class ClazzExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClazzExample() {
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

        public Criteria andClazzIdIsNull() {
            addCriterion("clazz_id is null");
            return (Criteria) this;
        }

        public Criteria andClazzIdIsNotNull() {
            addCriterion("clazz_id is not null");
            return (Criteria) this;
        }

        public Criteria andClazzIdEqualTo(Integer value) {
            addCriterion("clazz_id =", value, "clazzId");
            return (Criteria) this;
        }

        public Criteria andClazzIdNotEqualTo(Integer value) {
            addCriterion("clazz_id <>", value, "clazzId");
            return (Criteria) this;
        }

        public Criteria andClazzIdGreaterThan(Integer value) {
            addCriterion("clazz_id >", value, "clazzId");
            return (Criteria) this;
        }

        public Criteria andClazzIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("clazz_id >=", value, "clazzId");
            return (Criteria) this;
        }

        public Criteria andClazzIdLessThan(Integer value) {
            addCriterion("clazz_id <", value, "clazzId");
            return (Criteria) this;
        }

        public Criteria andClazzIdLessThanOrEqualTo(Integer value) {
            addCriterion("clazz_id <=", value, "clazzId");
            return (Criteria) this;
        }

        public Criteria andClazzIdIn(List<Integer> values) {
            addCriterion("clazz_id in", values, "clazzId");
            return (Criteria) this;
        }

        public Criteria andClazzIdNotIn(List<Integer> values) {
            addCriterion("clazz_id not in", values, "clazzId");
            return (Criteria) this;
        }

        public Criteria andClazzIdBetween(Integer value1, Integer value2) {
            addCriterion("clazz_id between", value1, value2, "clazzId");
            return (Criteria) this;
        }

        public Criteria andClazzIdNotBetween(Integer value1, Integer value2) {
            addCriterion("clazz_id not between", value1, value2, "clazzId");
            return (Criteria) this;
        }

        public Criteria andClazzNameIsNull() {
            addCriterion("clazz_name is null");
            return (Criteria) this;
        }

        public Criteria andClazzNameIsNotNull() {
            addCriterion("clazz_name is not null");
            return (Criteria) this;
        }

        public Criteria andClazzNameEqualTo(String value) {
            addCriterion("clazz_name =", value, "clazzName");
            return (Criteria) this;
        }

        public Criteria andClazzNameNotEqualTo(String value) {
            addCriterion("clazz_name <>", value, "clazzName");
            return (Criteria) this;
        }

        public Criteria andClazzNameGreaterThan(String value) {
            addCriterion("clazz_name >", value, "clazzName");
            return (Criteria) this;
        }

        public Criteria andClazzNameGreaterThanOrEqualTo(String value) {
            addCriterion("clazz_name >=", value, "clazzName");
            return (Criteria) this;
        }

        public Criteria andClazzNameLessThan(String value) {
            addCriterion("clazz_name <", value, "clazzName");
            return (Criteria) this;
        }

        public Criteria andClazzNameLessThanOrEqualTo(String value) {
            addCriterion("clazz_name <=", value, "clazzName");
            return (Criteria) this;
        }

        public Criteria andClazzNameLike(String value) {
            addCriterion("clazz_name like", value, "clazzName");
            return (Criteria) this;
        }

        public Criteria andClazzNameNotLike(String value) {
            addCriterion("clazz_name not like", value, "clazzName");
            return (Criteria) this;
        }

        public Criteria andClazzNameIn(List<String> values) {
            addCriterion("clazz_name in", values, "clazzName");
            return (Criteria) this;
        }

        public Criteria andClazzNameNotIn(List<String> values) {
            addCriterion("clazz_name not in", values, "clazzName");
            return (Criteria) this;
        }

        public Criteria andClazzNameBetween(String value1, String value2) {
            addCriterion("clazz_name between", value1, value2, "clazzName");
            return (Criteria) this;
        }

        public Criteria andClazzNameNotBetween(String value1, String value2) {
            addCriterion("clazz_name not between", value1, value2, "clazzName");
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