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

        public Criteria andResearchdirectionIsNull() {
            addCriterion("researchDirection is null");
            return (Criteria) this;
        }

        public Criteria andResearchdirectionIsNotNull() {
            addCriterion("researchDirection is not null");
            return (Criteria) this;
        }

        public Criteria andResearchdirectionEqualTo(String value) {
            addCriterion("researchDirection =", value, "researchdirection");
            return (Criteria) this;
        }

        public Criteria andResearchdirectionNotEqualTo(String value) {
            addCriterion("researchDirection <>", value, "researchdirection");
            return (Criteria) this;
        }

        public Criteria andResearchdirectionGreaterThan(String value) {
            addCriterion("researchDirection >", value, "researchdirection");
            return (Criteria) this;
        }

        public Criteria andResearchdirectionGreaterThanOrEqualTo(String value) {
            addCriterion("researchDirection >=", value, "researchdirection");
            return (Criteria) this;
        }

        public Criteria andResearchdirectionLessThan(String value) {
            addCriterion("researchDirection <", value, "researchdirection");
            return (Criteria) this;
        }

        public Criteria andResearchdirectionLessThanOrEqualTo(String value) {
            addCriterion("researchDirection <=", value, "researchdirection");
            return (Criteria) this;
        }

        public Criteria andResearchdirectionLike(String value) {
            addCriterion("researchDirection like", value, "researchdirection");
            return (Criteria) this;
        }

        public Criteria andResearchdirectionNotLike(String value) {
            addCriterion("researchDirection not like", value, "researchdirection");
            return (Criteria) this;
        }

        public Criteria andResearchdirectionIn(List<String> values) {
            addCriterion("researchDirection in", values, "researchdirection");
            return (Criteria) this;
        }

        public Criteria andResearchdirectionNotIn(List<String> values) {
            addCriterion("researchDirection not in", values, "researchdirection");
            return (Criteria) this;
        }

        public Criteria andResearchdirectionBetween(String value1, String value2) {
            addCriterion("researchDirection between", value1, value2, "researchdirection");
            return (Criteria) this;
        }

        public Criteria andResearchdirectionNotBetween(String value1, String value2) {
            addCriterion("researchDirection not between", value1, value2, "researchdirection");
            return (Criteria) this;
        }

        public Criteria andTutortitleIsNull() {
            addCriterion("tutorTitle is null");
            return (Criteria) this;
        }

        public Criteria andTutortitleIsNotNull() {
            addCriterion("tutorTitle is not null");
            return (Criteria) this;
        }

        public Criteria andTutortitleEqualTo(String value) {
            addCriterion("tutorTitle =", value, "tutortitle");
            return (Criteria) this;
        }

        public Criteria andTutortitleNotEqualTo(String value) {
            addCriterion("tutorTitle <>", value, "tutortitle");
            return (Criteria) this;
        }

        public Criteria andTutortitleGreaterThan(String value) {
            addCriterion("tutorTitle >", value, "tutortitle");
            return (Criteria) this;
        }

        public Criteria andTutortitleGreaterThanOrEqualTo(String value) {
            addCriterion("tutorTitle >=", value, "tutortitle");
            return (Criteria) this;
        }

        public Criteria andTutortitleLessThan(String value) {
            addCriterion("tutorTitle <", value, "tutortitle");
            return (Criteria) this;
        }

        public Criteria andTutortitleLessThanOrEqualTo(String value) {
            addCriterion("tutorTitle <=", value, "tutortitle");
            return (Criteria) this;
        }

        public Criteria andTutortitleLike(String value) {
            addCriterion("tutorTitle like", value, "tutortitle");
            return (Criteria) this;
        }

        public Criteria andTutortitleNotLike(String value) {
            addCriterion("tutorTitle not like", value, "tutortitle");
            return (Criteria) this;
        }

        public Criteria andTutortitleIn(List<String> values) {
            addCriterion("tutorTitle in", values, "tutortitle");
            return (Criteria) this;
        }

        public Criteria andTutortitleNotIn(List<String> values) {
            addCriterion("tutorTitle not in", values, "tutortitle");
            return (Criteria) this;
        }

        public Criteria andTutortitleBetween(String value1, String value2) {
            addCriterion("tutorTitle between", value1, value2, "tutortitle");
            return (Criteria) this;
        }

        public Criteria andTutortitleNotBetween(String value1, String value2) {
            addCriterion("tutorTitle not between", value1, value2, "tutortitle");
            return (Criteria) this;
        }

        public Criteria andStudentrequirementIsNull() {
            addCriterion("studentRequirement is null");
            return (Criteria) this;
        }

        public Criteria andStudentrequirementIsNotNull() {
            addCriterion("studentRequirement is not null");
            return (Criteria) this;
        }

        public Criteria andStudentrequirementEqualTo(Integer value) {
            addCriterion("studentRequirement =", value, "studentrequirement");
            return (Criteria) this;
        }

        public Criteria andStudentrequirementNotEqualTo(Integer value) {
            addCriterion("studentRequirement <>", value, "studentrequirement");
            return (Criteria) this;
        }

        public Criteria andStudentrequirementGreaterThan(Integer value) {
            addCriterion("studentRequirement >", value, "studentrequirement");
            return (Criteria) this;
        }

        public Criteria andStudentrequirementGreaterThanOrEqualTo(Integer value) {
            addCriterion("studentRequirement >=", value, "studentrequirement");
            return (Criteria) this;
        }

        public Criteria andStudentrequirementLessThan(Integer value) {
            addCriterion("studentRequirement <", value, "studentrequirement");
            return (Criteria) this;
        }

        public Criteria andStudentrequirementLessThanOrEqualTo(Integer value) {
            addCriterion("studentRequirement <=", value, "studentrequirement");
            return (Criteria) this;
        }

        public Criteria andStudentrequirementIn(List<Integer> values) {
            addCriterion("studentRequirement in", values, "studentrequirement");
            return (Criteria) this;
        }

        public Criteria andStudentrequirementNotIn(List<Integer> values) {
            addCriterion("studentRequirement not in", values, "studentrequirement");
            return (Criteria) this;
        }

        public Criteria andStudentrequirementBetween(Integer value1, Integer value2) {
            addCriterion("studentRequirement between", value1, value2, "studentrequirement");
            return (Criteria) this;
        }

        public Criteria andStudentrequirementNotBetween(Integer value1, Integer value2) {
            addCriterion("studentRequirement not between", value1, value2, "studentrequirement");
            return (Criteria) this;
        }

        public Criteria andEdubackgroundIsNull() {
            addCriterion("` eduBackground` is null");
            return (Criteria) this;
        }

        public Criteria andEdubackgroundIsNotNull() {
            addCriterion("` eduBackground` is not null");
            return (Criteria) this;
        }

        public Criteria andEdubackgroundEqualTo(String value) {
            addCriterion("` eduBackground` =", value, "edubackground");
            return (Criteria) this;
        }

        public Criteria andEdubackgroundNotEqualTo(String value) {
            addCriterion("` eduBackground` <>", value, "edubackground");
            return (Criteria) this;
        }

        public Criteria andEdubackgroundGreaterThan(String value) {
            addCriterion("` eduBackground` >", value, "edubackground");
            return (Criteria) this;
        }

        public Criteria andEdubackgroundGreaterThanOrEqualTo(String value) {
            addCriterion("` eduBackground` >=", value, "edubackground");
            return (Criteria) this;
        }

        public Criteria andEdubackgroundLessThan(String value) {
            addCriterion("` eduBackground` <", value, "edubackground");
            return (Criteria) this;
        }

        public Criteria andEdubackgroundLessThanOrEqualTo(String value) {
            addCriterion("` eduBackground` <=", value, "edubackground");
            return (Criteria) this;
        }

        public Criteria andEdubackgroundLike(String value) {
            addCriterion("` eduBackground` like", value, "edubackground");
            return (Criteria) this;
        }

        public Criteria andEdubackgroundNotLike(String value) {
            addCriterion("` eduBackground` not like", value, "edubackground");
            return (Criteria) this;
        }

        public Criteria andEdubackgroundIn(List<String> values) {
            addCriterion("` eduBackground` in", values, "edubackground");
            return (Criteria) this;
        }

        public Criteria andEdubackgroundNotIn(List<String> values) {
            addCriterion("` eduBackground` not in", values, "edubackground");
            return (Criteria) this;
        }

        public Criteria andEdubackgroundBetween(String value1, String value2) {
            addCriterion("` eduBackground` between", value1, value2, "edubackground");
            return (Criteria) this;
        }

        public Criteria andEdubackgroundNotBetween(String value1, String value2) {
            addCriterion("` eduBackground` not between", value1, value2, "edubackground");
            return (Criteria) this;
        }

        public Criteria andTutordutyIsNull() {
            addCriterion("tutorDuty is null");
            return (Criteria) this;
        }

        public Criteria andTutordutyIsNotNull() {
            addCriterion("tutorDuty is not null");
            return (Criteria) this;
        }

        public Criteria andTutordutyEqualTo(String value) {
            addCriterion("tutorDuty =", value, "tutorduty");
            return (Criteria) this;
        }

        public Criteria andTutordutyNotEqualTo(String value) {
            addCriterion("tutorDuty <>", value, "tutorduty");
            return (Criteria) this;
        }

        public Criteria andTutordutyGreaterThan(String value) {
            addCriterion("tutorDuty >", value, "tutorduty");
            return (Criteria) this;
        }

        public Criteria andTutordutyGreaterThanOrEqualTo(String value) {
            addCriterion("tutorDuty >=", value, "tutorduty");
            return (Criteria) this;
        }

        public Criteria andTutordutyLessThan(String value) {
            addCriterion("tutorDuty <", value, "tutorduty");
            return (Criteria) this;
        }

        public Criteria andTutordutyLessThanOrEqualTo(String value) {
            addCriterion("tutorDuty <=", value, "tutorduty");
            return (Criteria) this;
        }

        public Criteria andTutordutyLike(String value) {
            addCriterion("tutorDuty like", value, "tutorduty");
            return (Criteria) this;
        }

        public Criteria andTutordutyNotLike(String value) {
            addCriterion("tutorDuty not like", value, "tutorduty");
            return (Criteria) this;
        }

        public Criteria andTutordutyIn(List<String> values) {
            addCriterion("tutorDuty in", values, "tutorduty");
            return (Criteria) this;
        }

        public Criteria andTutordutyNotIn(List<String> values) {
            addCriterion("tutorDuty not in", values, "tutorduty");
            return (Criteria) this;
        }

        public Criteria andTutordutyBetween(String value1, String value2) {
            addCriterion("tutorDuty between", value1, value2, "tutorduty");
            return (Criteria) this;
        }

        public Criteria andTutordutyNotBetween(String value1, String value2) {
            addCriterion("tutorDuty not between", value1, value2, "tutorduty");
            return (Criteria) this;
        }

        public Criteria andTutorsexIsNull() {
            addCriterion("tutorSex is null");
            return (Criteria) this;
        }

        public Criteria andTutorsexIsNotNull() {
            addCriterion("tutorSex is not null");
            return (Criteria) this;
        }

        public Criteria andTutorsexEqualTo(String value) {
            addCriterion("tutorSex =", value, "tutorsex");
            return (Criteria) this;
        }

        public Criteria andTutorsexNotEqualTo(String value) {
            addCriterion("tutorSex <>", value, "tutorsex");
            return (Criteria) this;
        }

        public Criteria andTutorsexGreaterThan(String value) {
            addCriterion("tutorSex >", value, "tutorsex");
            return (Criteria) this;
        }

        public Criteria andTutorsexGreaterThanOrEqualTo(String value) {
            addCriterion("tutorSex >=", value, "tutorsex");
            return (Criteria) this;
        }

        public Criteria andTutorsexLessThan(String value) {
            addCriterion("tutorSex <", value, "tutorsex");
            return (Criteria) this;
        }

        public Criteria andTutorsexLessThanOrEqualTo(String value) {
            addCriterion("tutorSex <=", value, "tutorsex");
            return (Criteria) this;
        }

        public Criteria andTutorsexLike(String value) {
            addCriterion("tutorSex like", value, "tutorsex");
            return (Criteria) this;
        }

        public Criteria andTutorsexNotLike(String value) {
            addCriterion("tutorSex not like", value, "tutorsex");
            return (Criteria) this;
        }

        public Criteria andTutorsexIn(List<String> values) {
            addCriterion("tutorSex in", values, "tutorsex");
            return (Criteria) this;
        }

        public Criteria andTutorsexNotIn(List<String> values) {
            addCriterion("tutorSex not in", values, "tutorsex");
            return (Criteria) this;
        }

        public Criteria andTutorsexBetween(String value1, String value2) {
            addCriterion("tutorSex between", value1, value2, "tutorsex");
            return (Criteria) this;
        }

        public Criteria andTutorsexNotBetween(String value1, String value2) {
            addCriterion("tutorSex not between", value1, value2, "tutorsex");
            return (Criteria) this;
        }

        public Criteria andTutorageIsNull() {
            addCriterion("tutorAge is null");
            return (Criteria) this;
        }

        public Criteria andTutorageIsNotNull() {
            addCriterion("tutorAge is not null");
            return (Criteria) this;
        }

        public Criteria andTutorageEqualTo(Integer value) {
            addCriterion("tutorAge =", value, "tutorage");
            return (Criteria) this;
        }

        public Criteria andTutorageNotEqualTo(Integer value) {
            addCriterion("tutorAge <>", value, "tutorage");
            return (Criteria) this;
        }

        public Criteria andTutorageGreaterThan(Integer value) {
            addCriterion("tutorAge >", value, "tutorage");
            return (Criteria) this;
        }

        public Criteria andTutorageGreaterThanOrEqualTo(Integer value) {
            addCriterion("tutorAge >=", value, "tutorage");
            return (Criteria) this;
        }

        public Criteria andTutorageLessThan(Integer value) {
            addCriterion("tutorAge <", value, "tutorage");
            return (Criteria) this;
        }

        public Criteria andTutorageLessThanOrEqualTo(Integer value) {
            addCriterion("tutorAge <=", value, "tutorage");
            return (Criteria) this;
        }

        public Criteria andTutorageIn(List<Integer> values) {
            addCriterion("tutorAge in", values, "tutorage");
            return (Criteria) this;
        }

        public Criteria andTutorageNotIn(List<Integer> values) {
            addCriterion("tutorAge not in", values, "tutorage");
            return (Criteria) this;
        }

        public Criteria andTutorageBetween(Integer value1, Integer value2) {
            addCriterion("tutorAge between", value1, value2, "tutorage");
            return (Criteria) this;
        }

        public Criteria andTutorageNotBetween(Integer value1, Integer value2) {
            addCriterion("tutorAge not between", value1, value2, "tutorage");
            return (Criteria) this;
        }

        public Criteria andCultivationmodelIsNull() {
            addCriterion("cultivationModel is null");
            return (Criteria) this;
        }

        public Criteria andCultivationmodelIsNotNull() {
            addCriterion("cultivationModel is not null");
            return (Criteria) this;
        }

        public Criteria andCultivationmodelEqualTo(String value) {
            addCriterion("cultivationModel =", value, "cultivationmodel");
            return (Criteria) this;
        }

        public Criteria andCultivationmodelNotEqualTo(String value) {
            addCriterion("cultivationModel <>", value, "cultivationmodel");
            return (Criteria) this;
        }

        public Criteria andCultivationmodelGreaterThan(String value) {
            addCriterion("cultivationModel >", value, "cultivationmodel");
            return (Criteria) this;
        }

        public Criteria andCultivationmodelGreaterThanOrEqualTo(String value) {
            addCriterion("cultivationModel >=", value, "cultivationmodel");
            return (Criteria) this;
        }

        public Criteria andCultivationmodelLessThan(String value) {
            addCriterion("cultivationModel <", value, "cultivationmodel");
            return (Criteria) this;
        }

        public Criteria andCultivationmodelLessThanOrEqualTo(String value) {
            addCriterion("cultivationModel <=", value, "cultivationmodel");
            return (Criteria) this;
        }

        public Criteria andCultivationmodelLike(String value) {
            addCriterion("cultivationModel like", value, "cultivationmodel");
            return (Criteria) this;
        }

        public Criteria andCultivationmodelNotLike(String value) {
            addCriterion("cultivationModel not like", value, "cultivationmodel");
            return (Criteria) this;
        }

        public Criteria andCultivationmodelIn(List<String> values) {
            addCriterion("cultivationModel in", values, "cultivationmodel");
            return (Criteria) this;
        }

        public Criteria andCultivationmodelNotIn(List<String> values) {
            addCriterion("cultivationModel not in", values, "cultivationmodel");
            return (Criteria) this;
        }

        public Criteria andCultivationmodelBetween(String value1, String value2) {
            addCriterion("cultivationModel between", value1, value2, "cultivationmodel");
            return (Criteria) this;
        }

        public Criteria andCultivationmodelNotBetween(String value1, String value2) {
            addCriterion("cultivationModel not between", value1, value2, "cultivationmodel");
            return (Criteria) this;
        }

        public Criteria andThesisIsNull() {
            addCriterion("thesis is null");
            return (Criteria) this;
        }

        public Criteria andThesisIsNotNull() {
            addCriterion("thesis is not null");
            return (Criteria) this;
        }

        public Criteria andThesisEqualTo(String value) {
            addCriterion("thesis =", value, "thesis");
            return (Criteria) this;
        }

        public Criteria andThesisNotEqualTo(String value) {
            addCriterion("thesis <>", value, "thesis");
            return (Criteria) this;
        }

        public Criteria andThesisGreaterThan(String value) {
            addCriterion("thesis >", value, "thesis");
            return (Criteria) this;
        }

        public Criteria andThesisGreaterThanOrEqualTo(String value) {
            addCriterion("thesis >=", value, "thesis");
            return (Criteria) this;
        }

        public Criteria andThesisLessThan(String value) {
            addCriterion("thesis <", value, "thesis");
            return (Criteria) this;
        }

        public Criteria andThesisLessThanOrEqualTo(String value) {
            addCriterion("thesis <=", value, "thesis");
            return (Criteria) this;
        }

        public Criteria andThesisLike(String value) {
            addCriterion("thesis like", value, "thesis");
            return (Criteria) this;
        }

        public Criteria andThesisNotLike(String value) {
            addCriterion("thesis not like", value, "thesis");
            return (Criteria) this;
        }

        public Criteria andThesisIn(List<String> values) {
            addCriterion("thesis in", values, "thesis");
            return (Criteria) this;
        }

        public Criteria andThesisNotIn(List<String> values) {
            addCriterion("thesis not in", values, "thesis");
            return (Criteria) this;
        }

        public Criteria andThesisBetween(String value1, String value2) {
            addCriterion("thesis between", value1, value2, "thesis");
            return (Criteria) this;
        }

        public Criteria andThesisNotBetween(String value1, String value2) {
            addCriterion("thesis not between", value1, value2, "thesis");
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