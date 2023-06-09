package com.ydlab.interchoice.domain;

import java.util.ArrayList;
import java.util.List;

public class SturesumeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SturesumeExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andNameIsNull() {
            addCriterion("`name` is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("`name` is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("`name` =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("`name` <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("`name` >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("`name` >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("`name` <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("`name` <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("`name` like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("`name` not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("`name` in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("`name` not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("`name` between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("`name` not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("`status` is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("`status` is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("`status` =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("`status` <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("`status` >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("`status` >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("`status` <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("`status` <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("`status` like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("`status` not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("`status` in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("`status` not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("`status` between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("`status` not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andRankIsNull() {
            addCriterion("`rank` is null");
            return (Criteria) this;
        }

        public Criteria andRankIsNotNull() {
            addCriterion("`rank` is not null");
            return (Criteria) this;
        }

        public Criteria andRankEqualTo(String value) {
            addCriterion("`rank` =", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotEqualTo(String value) {
            addCriterion("`rank` <>", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankGreaterThan(String value) {
            addCriterion("`rank` >", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankGreaterThanOrEqualTo(String value) {
            addCriterion("`rank` >=", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankLessThan(String value) {
            addCriterion("`rank` <", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankLessThanOrEqualTo(String value) {
            addCriterion("`rank` <=", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankLike(String value) {
            addCriterion("`rank` like", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotLike(String value) {
            addCriterion("`rank` not like", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankIn(List<String> values) {
            addCriterion("`rank` in", values, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotIn(List<String> values) {
            addCriterion("`rank` not in", values, "rank");
            return (Criteria) this;
        }

        public Criteria andRankBetween(String value1, String value2) {
            addCriterion("`rank` between", value1, value2, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotBetween(String value1, String value2) {
            addCriterion("`rank` not between", value1, value2, "rank");
            return (Criteria) this;
        }

        public Criteria andCet4IsNull() {
            addCriterion("cet4 is null");
            return (Criteria) this;
        }

        public Criteria andCet4IsNotNull() {
            addCriterion("cet4 is not null");
            return (Criteria) this;
        }

        public Criteria andCet4EqualTo(String value) {
            addCriterion("cet4 =", value, "cet4");
            return (Criteria) this;
        }

        public Criteria andCet4NotEqualTo(String value) {
            addCriterion("cet4 <>", value, "cet4");
            return (Criteria) this;
        }

        public Criteria andCet4GreaterThan(String value) {
            addCriterion("cet4 >", value, "cet4");
            return (Criteria) this;
        }

        public Criteria andCet4GreaterThanOrEqualTo(String value) {
            addCriterion("cet4 >=", value, "cet4");
            return (Criteria) this;
        }

        public Criteria andCet4LessThan(String value) {
            addCriterion("cet4 <", value, "cet4");
            return (Criteria) this;
        }

        public Criteria andCet4LessThanOrEqualTo(String value) {
            addCriterion("cet4 <=", value, "cet4");
            return (Criteria) this;
        }

        public Criteria andCet4Like(String value) {
            addCriterion("cet4 like", value, "cet4");
            return (Criteria) this;
        }

        public Criteria andCet4NotLike(String value) {
            addCriterion("cet4 not like", value, "cet4");
            return (Criteria) this;
        }

        public Criteria andCet4In(List<String> values) {
            addCriterion("cet4 in", values, "cet4");
            return (Criteria) this;
        }

        public Criteria andCet4NotIn(List<String> values) {
            addCriterion("cet4 not in", values, "cet4");
            return (Criteria) this;
        }

        public Criteria andCet4Between(String value1, String value2) {
            addCriterion("cet4 between", value1, value2, "cet4");
            return (Criteria) this;
        }

        public Criteria andCet4NotBetween(String value1, String value2) {
            addCriterion("cet4 not between", value1, value2, "cet4");
            return (Criteria) this;
        }

        public Criteria andCet6IsNull() {
            addCriterion("cet6 is null");
            return (Criteria) this;
        }

        public Criteria andCet6IsNotNull() {
            addCriterion("cet6 is not null");
            return (Criteria) this;
        }

        public Criteria andCet6EqualTo(String value) {
            addCriterion("cet6 =", value, "cet6");
            return (Criteria) this;
        }

        public Criteria andCet6NotEqualTo(String value) {
            addCriterion("cet6 <>", value, "cet6");
            return (Criteria) this;
        }

        public Criteria andCet6GreaterThan(String value) {
            addCriterion("cet6 >", value, "cet6");
            return (Criteria) this;
        }

        public Criteria andCet6GreaterThanOrEqualTo(String value) {
            addCriterion("cet6 >=", value, "cet6");
            return (Criteria) this;
        }

        public Criteria andCet6LessThan(String value) {
            addCriterion("cet6 <", value, "cet6");
            return (Criteria) this;
        }

        public Criteria andCet6LessThanOrEqualTo(String value) {
            addCriterion("cet6 <=", value, "cet6");
            return (Criteria) this;
        }

        public Criteria andCet6Like(String value) {
            addCriterion("cet6 like", value, "cet6");
            return (Criteria) this;
        }

        public Criteria andCet6NotLike(String value) {
            addCriterion("cet6 not like", value, "cet6");
            return (Criteria) this;
        }

        public Criteria andCet6In(List<String> values) {
            addCriterion("cet6 in", values, "cet6");
            return (Criteria) this;
        }

        public Criteria andCet6NotIn(List<String> values) {
            addCriterion("cet6 not in", values, "cet6");
            return (Criteria) this;
        }

        public Criteria andCet6Between(String value1, String value2) {
            addCriterion("cet6 between", value1, value2, "cet6");
            return (Criteria) this;
        }

        public Criteria andCet6NotBetween(String value1, String value2) {
            addCriterion("cet6 not between", value1, value2, "cet6");
            return (Criteria) this;
        }

        public Criteria andInterestedDirectionIsNull() {
            addCriterion("interestedDirection is null");
            return (Criteria) this;
        }

        public Criteria andInterestedDirectionIsNotNull() {
            addCriterion("interestedDirection is not null");
            return (Criteria) this;
        }

        public Criteria andInterestedDirectionEqualTo(String value) {
            addCriterion("interestedDirection =", value, "interestedDirection");
            return (Criteria) this;
        }

        public Criteria andInterestedDirectionNotEqualTo(String value) {
            addCriterion("interestedDirection <>", value, "interestedDirection");
            return (Criteria) this;
        }

        public Criteria andInterestedDirectionGreaterThan(String value) {
            addCriterion("interestedDirection >", value, "interestedDirection");
            return (Criteria) this;
        }

        public Criteria andInterestedDirectionGreaterThanOrEqualTo(String value) {
            addCriterion("interestedDirection >=", value, "interestedDirection");
            return (Criteria) this;
        }

        public Criteria andInterestedDirectionLessThan(String value) {
            addCriterion("interestedDirection <", value, "interestedDirection");
            return (Criteria) this;
        }

        public Criteria andInterestedDirectionLessThanOrEqualTo(String value) {
            addCriterion("interestedDirection <=", value, "interestedDirection");
            return (Criteria) this;
        }

        public Criteria andInterestedDirectionLike(String value) {
            addCriterion("interestedDirection like", value, "interestedDirection");
            return (Criteria) this;
        }

        public Criteria andInterestedDirectionNotLike(String value) {
            addCriterion("interestedDirection not like", value, "interestedDirection");
            return (Criteria) this;
        }

        public Criteria andInterestedDirectionIn(List<String> values) {
            addCriterion("interestedDirection in", values, "interestedDirection");
            return (Criteria) this;
        }

        public Criteria andInterestedDirectionNotIn(List<String> values) {
            addCriterion("interestedDirection not in", values, "interestedDirection");
            return (Criteria) this;
        }

        public Criteria andInterestedDirectionBetween(String value1, String value2) {
            addCriterion("interestedDirection between", value1, value2, "interestedDirection");
            return (Criteria) this;
        }

        public Criteria andInterestedDirectionNotBetween(String value1, String value2) {
            addCriterion("interestedDirection not between", value1, value2, "interestedDirection");
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