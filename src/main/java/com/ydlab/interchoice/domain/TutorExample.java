package com.ydlab.interchoice.domain;

import java.util.ArrayList;
import java.util.List;

public class TutorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TutorExample() {
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

        public Criteria andTutorIdIsNull() {
            addCriterion("tutor_id is null");
            return (Criteria) this;
        }

        public Criteria andTutorIdIsNotNull() {
            addCriterion("tutor_id is not null");
            return (Criteria) this;
        }

        public Criteria andTutorIdEqualTo(Integer value) {
            addCriterion("tutor_id =", value, "tutorId");
            return (Criteria) this;
        }

        public Criteria andTutorIdNotEqualTo(Integer value) {
            addCriterion("tutor_id <>", value, "tutorId");
            return (Criteria) this;
        }

        public Criteria andTutorIdGreaterThan(Integer value) {
            addCriterion("tutor_id >", value, "tutorId");
            return (Criteria) this;
        }

        public Criteria andTutorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tutor_id >=", value, "tutorId");
            return (Criteria) this;
        }

        public Criteria andTutorIdLessThan(Integer value) {
            addCriterion("tutor_id <", value, "tutorId");
            return (Criteria) this;
        }

        public Criteria andTutorIdLessThanOrEqualTo(Integer value) {
            addCriterion("tutor_id <=", value, "tutorId");
            return (Criteria) this;
        }

        public Criteria andTutorIdIn(List<Integer> values) {
            addCriterion("tutor_id in", values, "tutorId");
            return (Criteria) this;
        }

        public Criteria andTutorIdNotIn(List<Integer> values) {
            addCriterion("tutor_id not in", values, "tutorId");
            return (Criteria) this;
        }

        public Criteria andTutorIdBetween(Integer value1, Integer value2) {
            addCriterion("tutor_id between", value1, value2, "tutorId");
            return (Criteria) this;
        }

        public Criteria andTutorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tutor_id not between", value1, value2, "tutorId");
            return (Criteria) this;
        }

        public Criteria andTutorNameIsNull() {
            addCriterion("tutor_name is null");
            return (Criteria) this;
        }

        public Criteria andTutorNameIsNotNull() {
            addCriterion("tutor_name is not null");
            return (Criteria) this;
        }

        public Criteria andTutorNameEqualTo(String value) {
            addCriterion("tutor_name =", value, "tutorName");
            return (Criteria) this;
        }

        public Criteria andTutorNameNotEqualTo(String value) {
            addCriterion("tutor_name <>", value, "tutorName");
            return (Criteria) this;
        }

        public Criteria andTutorNameGreaterThan(String value) {
            addCriterion("tutor_name >", value, "tutorName");
            return (Criteria) this;
        }

        public Criteria andTutorNameGreaterThanOrEqualTo(String value) {
            addCriterion("tutor_name >=", value, "tutorName");
            return (Criteria) this;
        }

        public Criteria andTutorNameLessThan(String value) {
            addCriterion("tutor_name <", value, "tutorName");
            return (Criteria) this;
        }

        public Criteria andTutorNameLessThanOrEqualTo(String value) {
            addCriterion("tutor_name <=", value, "tutorName");
            return (Criteria) this;
        }

        public Criteria andTutorNameLike(String value) {
            addCriterion("tutor_name like", value, "tutorName");
            return (Criteria) this;
        }

        public Criteria andTutorNameNotLike(String value) {
            addCriterion("tutor_name not like", value, "tutorName");
            return (Criteria) this;
        }

        public Criteria andTutorNameIn(List<String> values) {
            addCriterion("tutor_name in", values, "tutorName");
            return (Criteria) this;
        }

        public Criteria andTutorNameNotIn(List<String> values) {
            addCriterion("tutor_name not in", values, "tutorName");
            return (Criteria) this;
        }

        public Criteria andTutorNameBetween(String value1, String value2) {
            addCriterion("tutor_name between", value1, value2, "tutorName");
            return (Criteria) this;
        }

        public Criteria andTutorNameNotBetween(String value1, String value2) {
            addCriterion("tutor_name not between", value1, value2, "tutorName");
            return (Criteria) this;
        }

        public Criteria andResearchDirectionIsNull() {
            addCriterion("research_direction is null");
            return (Criteria) this;
        }

        public Criteria andResearchDirectionIsNotNull() {
            addCriterion("research_direction is not null");
            return (Criteria) this;
        }

        public Criteria andResearchDirectionEqualTo(String value) {
            addCriterion("research_direction =", value, "researchDirection");
            return (Criteria) this;
        }

        public Criteria andResearchDirectionNotEqualTo(String value) {
            addCriterion("research_direction <>", value, "researchDirection");
            return (Criteria) this;
        }

        public Criteria andResearchDirectionGreaterThan(String value) {
            addCriterion("research_direction >", value, "researchDirection");
            return (Criteria) this;
        }

        public Criteria andResearchDirectionGreaterThanOrEqualTo(String value) {
            addCriterion("research_direction >=", value, "researchDirection");
            return (Criteria) this;
        }

        public Criteria andResearchDirectionLessThan(String value) {
            addCriterion("research_direction <", value, "researchDirection");
            return (Criteria) this;
        }

        public Criteria andResearchDirectionLessThanOrEqualTo(String value) {
            addCriterion("research_direction <=", value, "researchDirection");
            return (Criteria) this;
        }

        public Criteria andResearchDirectionLike(String value) {
            addCriterion("research_direction like", value, "researchDirection");
            return (Criteria) this;
        }

        public Criteria andResearchDirectionNotLike(String value) {
            addCriterion("research_direction not like", value, "researchDirection");
            return (Criteria) this;
        }

        public Criteria andResearchDirectionIn(List<String> values) {
            addCriterion("research_direction in", values, "researchDirection");
            return (Criteria) this;
        }

        public Criteria andResearchDirectionNotIn(List<String> values) {
            addCriterion("research_direction not in", values, "researchDirection");
            return (Criteria) this;
        }

        public Criteria andResearchDirectionBetween(String value1, String value2) {
            addCriterion("research_direction between", value1, value2, "researchDirection");
            return (Criteria) this;
        }

        public Criteria andResearchDirectionNotBetween(String value1, String value2) {
            addCriterion("research_direction not between", value1, value2, "researchDirection");
            return (Criteria) this;
        }

        public Criteria andTutorTitleIsNull() {
            addCriterion("tutor_title is null");
            return (Criteria) this;
        }

        public Criteria andTutorTitleIsNotNull() {
            addCriterion("tutor_title is not null");
            return (Criteria) this;
        }

        public Criteria andTutorTitleEqualTo(String value) {
            addCriterion("tutor_title =", value, "tutorTitle");
            return (Criteria) this;
        }

        public Criteria andTutorTitleNotEqualTo(String value) {
            addCriterion("tutor_title <>", value, "tutorTitle");
            return (Criteria) this;
        }

        public Criteria andTutorTitleGreaterThan(String value) {
            addCriterion("tutor_title >", value, "tutorTitle");
            return (Criteria) this;
        }

        public Criteria andTutorTitleGreaterThanOrEqualTo(String value) {
            addCriterion("tutor_title >=", value, "tutorTitle");
            return (Criteria) this;
        }

        public Criteria andTutorTitleLessThan(String value) {
            addCriterion("tutor_title <", value, "tutorTitle");
            return (Criteria) this;
        }

        public Criteria andTutorTitleLessThanOrEqualTo(String value) {
            addCriterion("tutor_title <=", value, "tutorTitle");
            return (Criteria) this;
        }

        public Criteria andTutorTitleLike(String value) {
            addCriterion("tutor_title like", value, "tutorTitle");
            return (Criteria) this;
        }

        public Criteria andTutorTitleNotLike(String value) {
            addCriterion("tutor_title not like", value, "tutorTitle");
            return (Criteria) this;
        }

        public Criteria andTutorTitleIn(List<String> values) {
            addCriterion("tutor_title in", values, "tutorTitle");
            return (Criteria) this;
        }

        public Criteria andTutorTitleNotIn(List<String> values) {
            addCriterion("tutor_title not in", values, "tutorTitle");
            return (Criteria) this;
        }

        public Criteria andTutorTitleBetween(String value1, String value2) {
            addCriterion("tutor_title between", value1, value2, "tutorTitle");
            return (Criteria) this;
        }

        public Criteria andTutorTitleNotBetween(String value1, String value2) {
            addCriterion("tutor_title not between", value1, value2, "tutorTitle");
            return (Criteria) this;
        }

        public Criteria andStudentRequirementIsNull() {
            addCriterion("student_requirement is null");
            return (Criteria) this;
        }

        public Criteria andStudentRequirementIsNotNull() {
            addCriterion("student_requirement is not null");
            return (Criteria) this;
        }

        public Criteria andStudentRequirementEqualTo(Integer value) {
            addCriterion("student_requirement =", value, "studentRequirement");
            return (Criteria) this;
        }

        public Criteria andStudentRequirementNotEqualTo(Integer value) {
            addCriterion("student_requirement <>", value, "studentRequirement");
            return (Criteria) this;
        }

        public Criteria andStudentRequirementGreaterThan(Integer value) {
            addCriterion("student_requirement >", value, "studentRequirement");
            return (Criteria) this;
        }

        public Criteria andStudentRequirementGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_requirement >=", value, "studentRequirement");
            return (Criteria) this;
        }

        public Criteria andStudentRequirementLessThan(Integer value) {
            addCriterion("student_requirement <", value, "studentRequirement");
            return (Criteria) this;
        }

        public Criteria andStudentRequirementLessThanOrEqualTo(Integer value) {
            addCriterion("student_requirement <=", value, "studentRequirement");
            return (Criteria) this;
        }

        public Criteria andStudentRequirementIn(List<Integer> values) {
            addCriterion("student_requirement in", values, "studentRequirement");
            return (Criteria) this;
        }

        public Criteria andStudentRequirementNotIn(List<Integer> values) {
            addCriterion("student_requirement not in", values, "studentRequirement");
            return (Criteria) this;
        }

        public Criteria andStudentRequirementBetween(Integer value1, Integer value2) {
            addCriterion("student_requirement between", value1, value2, "studentRequirement");
            return (Criteria) this;
        }

        public Criteria andStudentRequirementNotBetween(Integer value1, Integer value2) {
            addCriterion("student_requirement not between", value1, value2, "studentRequirement");
            return (Criteria) this;
        }

        public Criteria andEducationalBackgroundIsNull() {
            addCriterion("` educational_background` is null");
            return (Criteria) this;
        }

        public Criteria andEducationalBackgroundIsNotNull() {
            addCriterion("` educational_background` is not null");
            return (Criteria) this;
        }

        public Criteria andEducationalBackgroundEqualTo(String value) {
            addCriterion("` educational_background` =", value, "educationalBackground");
            return (Criteria) this;
        }

        public Criteria andEducationalBackgroundNotEqualTo(String value) {
            addCriterion("` educational_background` <>", value, "educationalBackground");
            return (Criteria) this;
        }

        public Criteria andEducationalBackgroundGreaterThan(String value) {
            addCriterion("` educational_background` >", value, "educationalBackground");
            return (Criteria) this;
        }

        public Criteria andEducationalBackgroundGreaterThanOrEqualTo(String value) {
            addCriterion("` educational_background` >=", value, "educationalBackground");
            return (Criteria) this;
        }

        public Criteria andEducationalBackgroundLessThan(String value) {
            addCriterion("` educational_background` <", value, "educationalBackground");
            return (Criteria) this;
        }

        public Criteria andEducationalBackgroundLessThanOrEqualTo(String value) {
            addCriterion("` educational_background` <=", value, "educationalBackground");
            return (Criteria) this;
        }

        public Criteria andEducationalBackgroundLike(String value) {
            addCriterion("` educational_background` like", value, "educationalBackground");
            return (Criteria) this;
        }

        public Criteria andEducationalBackgroundNotLike(String value) {
            addCriterion("` educational_background` not like", value, "educationalBackground");
            return (Criteria) this;
        }

        public Criteria andEducationalBackgroundIn(List<String> values) {
            addCriterion("` educational_background` in", values, "educationalBackground");
            return (Criteria) this;
        }

        public Criteria andEducationalBackgroundNotIn(List<String> values) {
            addCriterion("` educational_background` not in", values, "educationalBackground");
            return (Criteria) this;
        }

        public Criteria andEducationalBackgroundBetween(String value1, String value2) {
            addCriterion("` educational_background` between", value1, value2, "educationalBackground");
            return (Criteria) this;
        }

        public Criteria andEducationalBackgroundNotBetween(String value1, String value2) {
            addCriterion("` educational_background` not between", value1, value2, "educationalBackground");
            return (Criteria) this;
        }

        public Criteria andTutorDutyIsNull() {
            addCriterion("tutor_duty is null");
            return (Criteria) this;
        }

        public Criteria andTutorDutyIsNotNull() {
            addCriterion("tutor_duty is not null");
            return (Criteria) this;
        }

        public Criteria andTutorDutyEqualTo(String value) {
            addCriterion("tutor_duty =", value, "tutorDuty");
            return (Criteria) this;
        }

        public Criteria andTutorDutyNotEqualTo(String value) {
            addCriterion("tutor_duty <>", value, "tutorDuty");
            return (Criteria) this;
        }

        public Criteria andTutorDutyGreaterThan(String value) {
            addCriterion("tutor_duty >", value, "tutorDuty");
            return (Criteria) this;
        }

        public Criteria andTutorDutyGreaterThanOrEqualTo(String value) {
            addCriterion("tutor_duty >=", value, "tutorDuty");
            return (Criteria) this;
        }

        public Criteria andTutorDutyLessThan(String value) {
            addCriterion("tutor_duty <", value, "tutorDuty");
            return (Criteria) this;
        }

        public Criteria andTutorDutyLessThanOrEqualTo(String value) {
            addCriterion("tutor_duty <=", value, "tutorDuty");
            return (Criteria) this;
        }

        public Criteria andTutorDutyLike(String value) {
            addCriterion("tutor_duty like", value, "tutorDuty");
            return (Criteria) this;
        }

        public Criteria andTutorDutyNotLike(String value) {
            addCriterion("tutor_duty not like", value, "tutorDuty");
            return (Criteria) this;
        }

        public Criteria andTutorDutyIn(List<String> values) {
            addCriterion("tutor_duty in", values, "tutorDuty");
            return (Criteria) this;
        }

        public Criteria andTutorDutyNotIn(List<String> values) {
            addCriterion("tutor_duty not in", values, "tutorDuty");
            return (Criteria) this;
        }

        public Criteria andTutorDutyBetween(String value1, String value2) {
            addCriterion("tutor_duty between", value1, value2, "tutorDuty");
            return (Criteria) this;
        }

        public Criteria andTutorDutyNotBetween(String value1, String value2) {
            addCriterion("tutor_duty not between", value1, value2, "tutorDuty");
            return (Criteria) this;
        }

        public Criteria andTutorSexIsNull() {
            addCriterion("tutor_sex is null");
            return (Criteria) this;
        }

        public Criteria andTutorSexIsNotNull() {
            addCriterion("tutor_sex is not null");
            return (Criteria) this;
        }

        public Criteria andTutorSexEqualTo(String value) {
            addCriterion("tutor_sex =", value, "tutorSex");
            return (Criteria) this;
        }

        public Criteria andTutorSexNotEqualTo(String value) {
            addCriterion("tutor_sex <>", value, "tutorSex");
            return (Criteria) this;
        }

        public Criteria andTutorSexGreaterThan(String value) {
            addCriterion("tutor_sex >", value, "tutorSex");
            return (Criteria) this;
        }

        public Criteria andTutorSexGreaterThanOrEqualTo(String value) {
            addCriterion("tutor_sex >=", value, "tutorSex");
            return (Criteria) this;
        }

        public Criteria andTutorSexLessThan(String value) {
            addCriterion("tutor_sex <", value, "tutorSex");
            return (Criteria) this;
        }

        public Criteria andTutorSexLessThanOrEqualTo(String value) {
            addCriterion("tutor_sex <=", value, "tutorSex");
            return (Criteria) this;
        }

        public Criteria andTutorSexLike(String value) {
            addCriterion("tutor_sex like", value, "tutorSex");
            return (Criteria) this;
        }

        public Criteria andTutorSexNotLike(String value) {
            addCriterion("tutor_sex not like", value, "tutorSex");
            return (Criteria) this;
        }

        public Criteria andTutorSexIn(List<String> values) {
            addCriterion("tutor_sex in", values, "tutorSex");
            return (Criteria) this;
        }

        public Criteria andTutorSexNotIn(List<String> values) {
            addCriterion("tutor_sex not in", values, "tutorSex");
            return (Criteria) this;
        }

        public Criteria andTutorSexBetween(String value1, String value2) {
            addCriterion("tutor_sex between", value1, value2, "tutorSex");
            return (Criteria) this;
        }

        public Criteria andTutorSexNotBetween(String value1, String value2) {
            addCriterion("tutor_sex not between", value1, value2, "tutorSex");
            return (Criteria) this;
        }

        public Criteria andTutorAgeIsNull() {
            addCriterion("tutor_age is null");
            return (Criteria) this;
        }

        public Criteria andTutorAgeIsNotNull() {
            addCriterion("tutor_age is not null");
            return (Criteria) this;
        }

        public Criteria andTutorAgeEqualTo(Integer value) {
            addCriterion("tutor_age =", value, "tutorAge");
            return (Criteria) this;
        }

        public Criteria andTutorAgeNotEqualTo(Integer value) {
            addCriterion("tutor_age <>", value, "tutorAge");
            return (Criteria) this;
        }

        public Criteria andTutorAgeGreaterThan(Integer value) {
            addCriterion("tutor_age >", value, "tutorAge");
            return (Criteria) this;
        }

        public Criteria andTutorAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("tutor_age >=", value, "tutorAge");
            return (Criteria) this;
        }

        public Criteria andTutorAgeLessThan(Integer value) {
            addCriterion("tutor_age <", value, "tutorAge");
            return (Criteria) this;
        }

        public Criteria andTutorAgeLessThanOrEqualTo(Integer value) {
            addCriterion("tutor_age <=", value, "tutorAge");
            return (Criteria) this;
        }

        public Criteria andTutorAgeIn(List<Integer> values) {
            addCriterion("tutor_age in", values, "tutorAge");
            return (Criteria) this;
        }

        public Criteria andTutorAgeNotIn(List<Integer> values) {
            addCriterion("tutor_age not in", values, "tutorAge");
            return (Criteria) this;
        }

        public Criteria andTutorAgeBetween(Integer value1, Integer value2) {
            addCriterion("tutor_age between", value1, value2, "tutorAge");
            return (Criteria) this;
        }

        public Criteria andTutorAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("tutor_age not between", value1, value2, "tutorAge");
            return (Criteria) this;
        }

        public Criteria andFavorateCharacterIsNull() {
            addCriterion("favorate_character is null");
            return (Criteria) this;
        }

        public Criteria andFavorateCharacterIsNotNull() {
            addCriterion("favorate_character is not null");
            return (Criteria) this;
        }

        public Criteria andFavorateCharacterEqualTo(String value) {
            addCriterion("favorate_character =", value, "favorateCharacter");
            return (Criteria) this;
        }

        public Criteria andFavorateCharacterNotEqualTo(String value) {
            addCriterion("favorate_character <>", value, "favorateCharacter");
            return (Criteria) this;
        }

        public Criteria andFavorateCharacterGreaterThan(String value) {
            addCriterion("favorate_character >", value, "favorateCharacter");
            return (Criteria) this;
        }

        public Criteria andFavorateCharacterGreaterThanOrEqualTo(String value) {
            addCriterion("favorate_character >=", value, "favorateCharacter");
            return (Criteria) this;
        }

        public Criteria andFavorateCharacterLessThan(String value) {
            addCriterion("favorate_character <", value, "favorateCharacter");
            return (Criteria) this;
        }

        public Criteria andFavorateCharacterLessThanOrEqualTo(String value) {
            addCriterion("favorate_character <=", value, "favorateCharacter");
            return (Criteria) this;
        }

        public Criteria andFavorateCharacterLike(String value) {
            addCriterion("favorate_character like", value, "favorateCharacter");
            return (Criteria) this;
        }

        public Criteria andFavorateCharacterNotLike(String value) {
            addCriterion("favorate_character not like", value, "favorateCharacter");
            return (Criteria) this;
        }

        public Criteria andFavorateCharacterIn(List<String> values) {
            addCriterion("favorate_character in", values, "favorateCharacter");
            return (Criteria) this;
        }

        public Criteria andFavorateCharacterNotIn(List<String> values) {
            addCriterion("favorate_character not in", values, "favorateCharacter");
            return (Criteria) this;
        }

        public Criteria andFavorateCharacterBetween(String value1, String value2) {
            addCriterion("favorate_character between", value1, value2, "favorateCharacter");
            return (Criteria) this;
        }

        public Criteria andFavorateCharacterNotBetween(String value1, String value2) {
            addCriterion("favorate_character not between", value1, value2, "favorateCharacter");
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