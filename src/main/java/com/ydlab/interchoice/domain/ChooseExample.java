package com.ydlab.interchoice.domain;

import java.util.ArrayList;
import java.util.List;

public class ChooseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ChooseExample() {
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

        public Criteria andStudentidIsNull() {
            addCriterion("studentId is null");
            return (Criteria) this;
        }

        public Criteria andStudentidIsNotNull() {
            addCriterion("studentId is not null");
            return (Criteria) this;
        }

        public Criteria andStudentidEqualTo(Integer value) {
            addCriterion("studentId =", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidNotEqualTo(Integer value) {
            addCriterion("studentId <>", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidGreaterThan(Integer value) {
            addCriterion("studentId >", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("studentId >=", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidLessThan(Integer value) {
            addCriterion("studentId <", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidLessThanOrEqualTo(Integer value) {
            addCriterion("studentId <=", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidIn(List<Integer> values) {
            addCriterion("studentId in", values, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidNotIn(List<Integer> values) {
            addCriterion("studentId not in", values, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidBetween(Integer value1, Integer value2) {
            addCriterion("studentId between", value1, value2, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidNotBetween(Integer value1, Integer value2) {
            addCriterion("studentId not between", value1, value2, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentnameIsNull() {
            addCriterion("studentName is null");
            return (Criteria) this;
        }

        public Criteria andStudentnameIsNotNull() {
            addCriterion("studentName is not null");
            return (Criteria) this;
        }

        public Criteria andStudentnameEqualTo(String value) {
            addCriterion("studentName =", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameNotEqualTo(String value) {
            addCriterion("studentName <>", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameGreaterThan(String value) {
            addCriterion("studentName >", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameGreaterThanOrEqualTo(String value) {
            addCriterion("studentName >=", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameLessThan(String value) {
            addCriterion("studentName <", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameLessThanOrEqualTo(String value) {
            addCriterion("studentName <=", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameLike(String value) {
            addCriterion("studentName like", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameNotLike(String value) {
            addCriterion("studentName not like", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameIn(List<String> values) {
            addCriterion("studentName in", values, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameNotIn(List<String> values) {
            addCriterion("studentName not in", values, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameBetween(String value1, String value2) {
            addCriterion("studentName between", value1, value2, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameNotBetween(String value1, String value2) {
            addCriterion("studentName not between", value1, value2, "studentname");
            return (Criteria) this;
        }

        public Criteria andTutoridIsNull() {
            addCriterion("tutorId is null");
            return (Criteria) this;
        }

        public Criteria andTutoridIsNotNull() {
            addCriterion("tutorId is not null");
            return (Criteria) this;
        }

        public Criteria andTutoridEqualTo(Integer value) {
            addCriterion("tutorId =", value, "tutorid");
            return (Criteria) this;
        }

        public Criteria andTutoridNotEqualTo(Integer value) {
            addCriterion("tutorId <>", value, "tutorid");
            return (Criteria) this;
        }

        public Criteria andTutoridGreaterThan(Integer value) {
            addCriterion("tutorId >", value, "tutorid");
            return (Criteria) this;
        }

        public Criteria andTutoridGreaterThanOrEqualTo(Integer value) {
            addCriterion("tutorId >=", value, "tutorid");
            return (Criteria) this;
        }

        public Criteria andTutoridLessThan(Integer value) {
            addCriterion("tutorId <", value, "tutorid");
            return (Criteria) this;
        }

        public Criteria andTutoridLessThanOrEqualTo(Integer value) {
            addCriterion("tutorId <=", value, "tutorid");
            return (Criteria) this;
        }

        public Criteria andTutoridIn(List<Integer> values) {
            addCriterion("tutorId in", values, "tutorid");
            return (Criteria) this;
        }

        public Criteria andTutoridNotIn(List<Integer> values) {
            addCriterion("tutorId not in", values, "tutorid");
            return (Criteria) this;
        }

        public Criteria andTutoridBetween(Integer value1, Integer value2) {
            addCriterion("tutorId between", value1, value2, "tutorid");
            return (Criteria) this;
        }

        public Criteria andTutoridNotBetween(Integer value1, Integer value2) {
            addCriterion("tutorId not between", value1, value2, "tutorid");
            return (Criteria) this;
        }

        public Criteria andTutornameIsNull() {
            addCriterion("tutorName is null");
            return (Criteria) this;
        }

        public Criteria andTutornameIsNotNull() {
            addCriterion("tutorName is not null");
            return (Criteria) this;
        }

        public Criteria andTutornameEqualTo(String value) {
            addCriterion("tutorName =", value, "tutorname");
            return (Criteria) this;
        }

        public Criteria andTutornameNotEqualTo(String value) {
            addCriterion("tutorName <>", value, "tutorname");
            return (Criteria) this;
        }

        public Criteria andTutornameGreaterThan(String value) {
            addCriterion("tutorName >", value, "tutorname");
            return (Criteria) this;
        }

        public Criteria andTutornameGreaterThanOrEqualTo(String value) {
            addCriterion("tutorName >=", value, "tutorname");
            return (Criteria) this;
        }

        public Criteria andTutornameLessThan(String value) {
            addCriterion("tutorName <", value, "tutorname");
            return (Criteria) this;
        }

        public Criteria andTutornameLessThanOrEqualTo(String value) {
            addCriterion("tutorName <=", value, "tutorname");
            return (Criteria) this;
        }

        public Criteria andTutornameLike(String value) {
            addCriterion("tutorName like", value, "tutorname");
            return (Criteria) this;
        }

        public Criteria andTutornameNotLike(String value) {
            addCriterion("tutorName not like", value, "tutorname");
            return (Criteria) this;
        }

        public Criteria andTutornameIn(List<String> values) {
            addCriterion("tutorName in", values, "tutorname");
            return (Criteria) this;
        }

        public Criteria andTutornameNotIn(List<String> values) {
            addCriterion("tutorName not in", values, "tutorname");
            return (Criteria) this;
        }

        public Criteria andTutornameBetween(String value1, String value2) {
            addCriterion("tutorName between", value1, value2, "tutorname");
            return (Criteria) this;
        }

        public Criteria andTutornameNotBetween(String value1, String value2) {
            addCriterion("tutorName not between", value1, value2, "tutorname");
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