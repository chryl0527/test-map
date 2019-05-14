package com.sumsoon.zzz.po;

import java.util.ArrayList;
import java.util.List;

public class XXXExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XXXExample() {
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

        public Criteria andMaaIsNull() {
            addCriterion("maa is null");
            return (Criteria) this;
        }

        public Criteria andMaaIsNotNull() {
            addCriterion("maa is not null");
            return (Criteria) this;
        }

        public Criteria andMaaEqualTo(String value) {
            addCriterion("maa =", value, "maa");
            return (Criteria) this;
        }

        public Criteria andMaaNotEqualTo(String value) {
            addCriterion("maa <>", value, "maa");
            return (Criteria) this;
        }

        public Criteria andMaaGreaterThan(String value) {
            addCriterion("maa >", value, "maa");
            return (Criteria) this;
        }

        public Criteria andMaaGreaterThanOrEqualTo(String value) {
            addCriterion("maa >=", value, "maa");
            return (Criteria) this;
        }

        public Criteria andMaaLessThan(String value) {
            addCriterion("maa <", value, "maa");
            return (Criteria) this;
        }

        public Criteria andMaaLessThanOrEqualTo(String value) {
            addCriterion("maa <=", value, "maa");
            return (Criteria) this;
        }

        public Criteria andMaaLike(String value) {
            addCriterion("maa like", value, "maa");
            return (Criteria) this;
        }

        public Criteria andMaaNotLike(String value) {
            addCriterion("maa not like", value, "maa");
            return (Criteria) this;
        }

        public Criteria andMaaIn(List<String> values) {
            addCriterion("maa in", values, "maa");
            return (Criteria) this;
        }

        public Criteria andMaaNotIn(List<String> values) {
            addCriterion("maa not in", values, "maa");
            return (Criteria) this;
        }

        public Criteria andMaaBetween(String value1, String value2) {
            addCriterion("maa between", value1, value2, "maa");
            return (Criteria) this;
        }

        public Criteria andMaaNotBetween(String value1, String value2) {
            addCriterion("maa not between", value1, value2, "maa");
            return (Criteria) this;
        }

        public Criteria andSadfIsNull() {
            addCriterion("sadf is null");
            return (Criteria) this;
        }

        public Criteria andSadfIsNotNull() {
            addCriterion("sadf is not null");
            return (Criteria) this;
        }

        public Criteria andSadfEqualTo(String value) {
            addCriterion("sadf =", value, "sadf");
            return (Criteria) this;
        }

        public Criteria andSadfNotEqualTo(String value) {
            addCriterion("sadf <>", value, "sadf");
            return (Criteria) this;
        }

        public Criteria andSadfGreaterThan(String value) {
            addCriterion("sadf >", value, "sadf");
            return (Criteria) this;
        }

        public Criteria andSadfGreaterThanOrEqualTo(String value) {
            addCriterion("sadf >=", value, "sadf");
            return (Criteria) this;
        }

        public Criteria andSadfLessThan(String value) {
            addCriterion("sadf <", value, "sadf");
            return (Criteria) this;
        }

        public Criteria andSadfLessThanOrEqualTo(String value) {
            addCriterion("sadf <=", value, "sadf");
            return (Criteria) this;
        }

        public Criteria andSadfLike(String value) {
            addCriterion("sadf like", value, "sadf");
            return (Criteria) this;
        }

        public Criteria andSadfNotLike(String value) {
            addCriterion("sadf not like", value, "sadf");
            return (Criteria) this;
        }

        public Criteria andSadfIn(List<String> values) {
            addCriterion("sadf in", values, "sadf");
            return (Criteria) this;
        }

        public Criteria andSadfNotIn(List<String> values) {
            addCriterion("sadf not in", values, "sadf");
            return (Criteria) this;
        }

        public Criteria andSadfBetween(String value1, String value2) {
            addCriterion("sadf between", value1, value2, "sadf");
            return (Criteria) this;
        }

        public Criteria andSadfNotBetween(String value1, String value2) {
            addCriterion("sadf not between", value1, value2, "sadf");
            return (Criteria) this;
        }

        public Criteria andWrsaIsNull() {
            addCriterion("wrsa is null");
            return (Criteria) this;
        }

        public Criteria andWrsaIsNotNull() {
            addCriterion("wrsa is not null");
            return (Criteria) this;
        }

        public Criteria andWrsaEqualTo(String value) {
            addCriterion("wrsa =", value, "wrsa");
            return (Criteria) this;
        }

        public Criteria andWrsaNotEqualTo(String value) {
            addCriterion("wrsa <>", value, "wrsa");
            return (Criteria) this;
        }

        public Criteria andWrsaGreaterThan(String value) {
            addCriterion("wrsa >", value, "wrsa");
            return (Criteria) this;
        }

        public Criteria andWrsaGreaterThanOrEqualTo(String value) {
            addCriterion("wrsa >=", value, "wrsa");
            return (Criteria) this;
        }

        public Criteria andWrsaLessThan(String value) {
            addCriterion("wrsa <", value, "wrsa");
            return (Criteria) this;
        }

        public Criteria andWrsaLessThanOrEqualTo(String value) {
            addCriterion("wrsa <=", value, "wrsa");
            return (Criteria) this;
        }

        public Criteria andWrsaLike(String value) {
            addCriterion("wrsa like", value, "wrsa");
            return (Criteria) this;
        }

        public Criteria andWrsaNotLike(String value) {
            addCriterion("wrsa not like", value, "wrsa");
            return (Criteria) this;
        }

        public Criteria andWrsaIn(List<String> values) {
            addCriterion("wrsa in", values, "wrsa");
            return (Criteria) this;
        }

        public Criteria andWrsaNotIn(List<String> values) {
            addCriterion("wrsa not in", values, "wrsa");
            return (Criteria) this;
        }

        public Criteria andWrsaBetween(String value1, String value2) {
            addCriterion("wrsa between", value1, value2, "wrsa");
            return (Criteria) this;
        }

        public Criteria andWrsaNotBetween(String value1, String value2) {
            addCriterion("wrsa not between", value1, value2, "wrsa");
            return (Criteria) this;
        }

        public Criteria andSfdsIsNull() {
            addCriterion("sfds is null");
            return (Criteria) this;
        }

        public Criteria andSfdsIsNotNull() {
            addCriterion("sfds is not null");
            return (Criteria) this;
        }

        public Criteria andSfdsEqualTo(String value) {
            addCriterion("sfds =", value, "sfds");
            return (Criteria) this;
        }

        public Criteria andSfdsNotEqualTo(String value) {
            addCriterion("sfds <>", value, "sfds");
            return (Criteria) this;
        }

        public Criteria andSfdsGreaterThan(String value) {
            addCriterion("sfds >", value, "sfds");
            return (Criteria) this;
        }

        public Criteria andSfdsGreaterThanOrEqualTo(String value) {
            addCriterion("sfds >=", value, "sfds");
            return (Criteria) this;
        }

        public Criteria andSfdsLessThan(String value) {
            addCriterion("sfds <", value, "sfds");
            return (Criteria) this;
        }

        public Criteria andSfdsLessThanOrEqualTo(String value) {
            addCriterion("sfds <=", value, "sfds");
            return (Criteria) this;
        }

        public Criteria andSfdsLike(String value) {
            addCriterion("sfds like", value, "sfds");
            return (Criteria) this;
        }

        public Criteria andSfdsNotLike(String value) {
            addCriterion("sfds not like", value, "sfds");
            return (Criteria) this;
        }

        public Criteria andSfdsIn(List<String> values) {
            addCriterion("sfds in", values, "sfds");
            return (Criteria) this;
        }

        public Criteria andSfdsNotIn(List<String> values) {
            addCriterion("sfds not in", values, "sfds");
            return (Criteria) this;
        }

        public Criteria andSfdsBetween(String value1, String value2) {
            addCriterion("sfds between", value1, value2, "sfds");
            return (Criteria) this;
        }

        public Criteria andSfdsNotBetween(String value1, String value2) {
            addCriterion("sfds not between", value1, value2, "sfds");
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