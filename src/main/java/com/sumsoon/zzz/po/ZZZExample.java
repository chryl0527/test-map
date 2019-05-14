package com.sumsoon.zzz.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ZZZExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZZZExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andQweIsNull() {
            addCriterion("qwe is null");
            return (Criteria) this;
        }

        public Criteria andQweIsNotNull() {
            addCriterion("qwe is not null");
            return (Criteria) this;
        }

        public Criteria andQweEqualTo(String value) {
            addCriterion("qwe =", value, "qwe");
            return (Criteria) this;
        }

        public Criteria andQweNotEqualTo(String value) {
            addCriterion("qwe <>", value, "qwe");
            return (Criteria) this;
        }

        public Criteria andQweGreaterThan(String value) {
            addCriterion("qwe >", value, "qwe");
            return (Criteria) this;
        }

        public Criteria andQweGreaterThanOrEqualTo(String value) {
            addCriterion("qwe >=", value, "qwe");
            return (Criteria) this;
        }

        public Criteria andQweLessThan(String value) {
            addCriterion("qwe <", value, "qwe");
            return (Criteria) this;
        }

        public Criteria andQweLessThanOrEqualTo(String value) {
            addCriterion("qwe <=", value, "qwe");
            return (Criteria) this;
        }

        public Criteria andQweLike(String value) {
            addCriterion("qwe like", value, "qwe");
            return (Criteria) this;
        }

        public Criteria andQweNotLike(String value) {
            addCriterion("qwe not like", value, "qwe");
            return (Criteria) this;
        }

        public Criteria andQweIn(List<String> values) {
            addCriterion("qwe in", values, "qwe");
            return (Criteria) this;
        }

        public Criteria andQweNotIn(List<String> values) {
            addCriterion("qwe not in", values, "qwe");
            return (Criteria) this;
        }

        public Criteria andQweBetween(String value1, String value2) {
            addCriterion("qwe between", value1, value2, "qwe");
            return (Criteria) this;
        }

        public Criteria andQweNotBetween(String value1, String value2) {
            addCriterion("qwe not between", value1, value2, "qwe");
            return (Criteria) this;
        }

        public Criteria andAsdIsNull() {
            addCriterion("asd is null");
            return (Criteria) this;
        }

        public Criteria andAsdIsNotNull() {
            addCriterion("asd is not null");
            return (Criteria) this;
        }

        public Criteria andAsdEqualTo(Integer value) {
            addCriterion("asd =", value, "asd");
            return (Criteria) this;
        }

        public Criteria andAsdNotEqualTo(Integer value) {
            addCriterion("asd <>", value, "asd");
            return (Criteria) this;
        }

        public Criteria andAsdGreaterThan(Integer value) {
            addCriterion("asd >", value, "asd");
            return (Criteria) this;
        }

        public Criteria andAsdGreaterThanOrEqualTo(Integer value) {
            addCriterion("asd >=", value, "asd");
            return (Criteria) this;
        }

        public Criteria andAsdLessThan(Integer value) {
            addCriterion("asd <", value, "asd");
            return (Criteria) this;
        }

        public Criteria andAsdLessThanOrEqualTo(Integer value) {
            addCriterion("asd <=", value, "asd");
            return (Criteria) this;
        }

        public Criteria andAsdIn(List<Integer> values) {
            addCriterion("asd in", values, "asd");
            return (Criteria) this;
        }

        public Criteria andAsdNotIn(List<Integer> values) {
            addCriterion("asd not in", values, "asd");
            return (Criteria) this;
        }

        public Criteria andAsdBetween(Integer value1, Integer value2) {
            addCriterion("asd between", value1, value2, "asd");
            return (Criteria) this;
        }

        public Criteria andAsdNotBetween(Integer value1, Integer value2) {
            addCriterion("asd not between", value1, value2, "asd");
            return (Criteria) this;
        }

        public Criteria andZxcIsNull() {
            addCriterion("zxc is null");
            return (Criteria) this;
        }

        public Criteria andZxcIsNotNull() {
            addCriterion("zxc is not null");
            return (Criteria) this;
        }

        public Criteria andZxcEqualTo(Date value) {
            addCriterionForJDBCDate("zxc =", value, "zxc");
            return (Criteria) this;
        }

        public Criteria andZxcNotEqualTo(Date value) {
            addCriterionForJDBCDate("zxc <>", value, "zxc");
            return (Criteria) this;
        }

        public Criteria andZxcGreaterThan(Date value) {
            addCriterionForJDBCDate("zxc >", value, "zxc");
            return (Criteria) this;
        }

        public Criteria andZxcGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("zxc >=", value, "zxc");
            return (Criteria) this;
        }

        public Criteria andZxcLessThan(Date value) {
            addCriterionForJDBCDate("zxc <", value, "zxc");
            return (Criteria) this;
        }

        public Criteria andZxcLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("zxc <=", value, "zxc");
            return (Criteria) this;
        }

        public Criteria andZxcIn(List<Date> values) {
            addCriterionForJDBCDate("zxc in", values, "zxc");
            return (Criteria) this;
        }

        public Criteria andZxcNotIn(List<Date> values) {
            addCriterionForJDBCDate("zxc not in", values, "zxc");
            return (Criteria) this;
        }

        public Criteria andZxcBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("zxc between", value1, value2, "zxc");
            return (Criteria) this;
        }

        public Criteria andZxcNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("zxc not between", value1, value2, "zxc");
            return (Criteria) this;
        }

        public Criteria andRtyIsNull() {
            addCriterion("rty is null");
            return (Criteria) this;
        }

        public Criteria andRtyIsNotNull() {
            addCriterion("rty is not null");
            return (Criteria) this;
        }

        public Criteria andRtyEqualTo(Date value) {
            addCriterion("rty =", value, "rty");
            return (Criteria) this;
        }

        public Criteria andRtyNotEqualTo(Date value) {
            addCriterion("rty <>", value, "rty");
            return (Criteria) this;
        }

        public Criteria andRtyGreaterThan(Date value) {
            addCriterion("rty >", value, "rty");
            return (Criteria) this;
        }

        public Criteria andRtyGreaterThanOrEqualTo(Date value) {
            addCriterion("rty >=", value, "rty");
            return (Criteria) this;
        }

        public Criteria andRtyLessThan(Date value) {
            addCriterion("rty <", value, "rty");
            return (Criteria) this;
        }

        public Criteria andRtyLessThanOrEqualTo(Date value) {
            addCriterion("rty <=", value, "rty");
            return (Criteria) this;
        }

        public Criteria andRtyIn(List<Date> values) {
            addCriterion("rty in", values, "rty");
            return (Criteria) this;
        }

        public Criteria andRtyNotIn(List<Date> values) {
            addCriterion("rty not in", values, "rty");
            return (Criteria) this;
        }

        public Criteria andRtyBetween(Date value1, Date value2) {
            addCriterion("rty between", value1, value2, "rty");
            return (Criteria) this;
        }

        public Criteria andRtyNotBetween(Date value1, Date value2) {
            addCriterion("rty not between", value1, value2, "rty");
            return (Criteria) this;
        }

        public Criteria andFghIsNull() {
            addCriterion("fgh is null");
            return (Criteria) this;
        }

        public Criteria andFghIsNotNull() {
            addCriterion("fgh is not null");
            return (Criteria) this;
        }

        public Criteria andFghEqualTo(Double value) {
            addCriterion("fgh =", value, "fgh");
            return (Criteria) this;
        }

        public Criteria andFghNotEqualTo(Double value) {
            addCriterion("fgh <>", value, "fgh");
            return (Criteria) this;
        }

        public Criteria andFghGreaterThan(Double value) {
            addCriterion("fgh >", value, "fgh");
            return (Criteria) this;
        }

        public Criteria andFghGreaterThanOrEqualTo(Double value) {
            addCriterion("fgh >=", value, "fgh");
            return (Criteria) this;
        }

        public Criteria andFghLessThan(Double value) {
            addCriterion("fgh <", value, "fgh");
            return (Criteria) this;
        }

        public Criteria andFghLessThanOrEqualTo(Double value) {
            addCriterion("fgh <=", value, "fgh");
            return (Criteria) this;
        }

        public Criteria andFghIn(List<Double> values) {
            addCriterion("fgh in", values, "fgh");
            return (Criteria) this;
        }

        public Criteria andFghNotIn(List<Double> values) {
            addCriterion("fgh not in", values, "fgh");
            return (Criteria) this;
        }

        public Criteria andFghBetween(Double value1, Double value2) {
            addCriterion("fgh between", value1, value2, "fgh");
            return (Criteria) this;
        }

        public Criteria andFghNotBetween(Double value1, Double value2) {
            addCriterion("fgh not between", value1, value2, "fgh");
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