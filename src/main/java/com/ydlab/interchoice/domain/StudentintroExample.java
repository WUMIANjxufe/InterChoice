package com.ydlab.interchoice.domain;

import java.util.ArrayList;
import java.util.List;

public class StudentintroExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentintroExample() {
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

        public Criteria andStudentIdIsNull() {
            addCriterion("student_id is null");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNotNull() {
            addCriterion("student_id is not null");
            return (Criteria) this;
        }

        public Criteria andStudentIdEqualTo(Integer value) {
            addCriterion("student_id =", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotEqualTo(Integer value) {
            addCriterion("student_id <>", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThan(Integer value) {
            addCriterion("student_id >", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_id >=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThan(Integer value) {
            addCriterion("student_id <", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThanOrEqualTo(Integer value) {
            addCriterion("student_id <=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdIn(List<Integer> values) {
            addCriterion("student_id in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotIn(List<Integer> values) {
            addCriterion("student_id not in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdBetween(Integer value1, Integer value2) {
            addCriterion("student_id between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("student_id not between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentNameIsNull() {
            addCriterion("student_name is null");
            return (Criteria) this;
        }

        public Criteria andStudentNameIsNotNull() {
            addCriterion("student_name is not null");
            return (Criteria) this;
        }

        public Criteria andStudentNameEqualTo(String value) {
            addCriterion("student_name =", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotEqualTo(String value) {
            addCriterion("student_name <>", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameGreaterThan(String value) {
            addCriterion("student_name >", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameGreaterThanOrEqualTo(String value) {
            addCriterion("student_name >=", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLessThan(String value) {
            addCriterion("student_name <", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLessThanOrEqualTo(String value) {
            addCriterion("student_name <=", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLike(String value) {
            addCriterion("student_name like", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotLike(String value) {
            addCriterion("student_name not like", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameIn(List<String> values) {
            addCriterion("student_name in", values, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotIn(List<String> values) {
            addCriterion("student_name not in", values, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameBetween(String value1, String value2) {
            addCriterion("student_name between", value1, value2, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotBetween(String value1, String value2) {
            addCriterion("student_name not between", value1, value2, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentSexIsNull() {
            addCriterion("student_sex is null");
            return (Criteria) this;
        }

        public Criteria andStudentSexIsNotNull() {
            addCriterion("student_sex is not null");
            return (Criteria) this;
        }

        public Criteria andStudentSexEqualTo(String value) {
            addCriterion("student_sex =", value, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexNotEqualTo(String value) {
            addCriterion("student_sex <>", value, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexGreaterThan(String value) {
            addCriterion("student_sex >", value, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexGreaterThanOrEqualTo(String value) {
            addCriterion("student_sex >=", value, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexLessThan(String value) {
            addCriterion("student_sex <", value, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexLessThanOrEqualTo(String value) {
            addCriterion("student_sex <=", value, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexLike(String value) {
            addCriterion("student_sex like", value, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexNotLike(String value) {
            addCriterion("student_sex not like", value, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexIn(List<String> values) {
            addCriterion("student_sex in", values, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexNotIn(List<String> values) {
            addCriterion("student_sex not in", values, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexBetween(String value1, String value2) {
            addCriterion("student_sex between", value1, value2, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexNotBetween(String value1, String value2) {
            addCriterion("student_sex not between", value1, value2, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentResidenceplaceIsNull() {
            addCriterion("student_residenceplace is null");
            return (Criteria) this;
        }

        public Criteria andStudentResidenceplaceIsNotNull() {
            addCriterion("student_residenceplace is not null");
            return (Criteria) this;
        }

        public Criteria andStudentResidenceplaceEqualTo(String value) {
            addCriterion("student_residenceplace =", value, "studentResidenceplace");
            return (Criteria) this;
        }

        public Criteria andStudentResidenceplaceNotEqualTo(String value) {
            addCriterion("student_residenceplace <>", value, "studentResidenceplace");
            return (Criteria) this;
        }

        public Criteria andStudentResidenceplaceGreaterThan(String value) {
            addCriterion("student_residenceplace >", value, "studentResidenceplace");
            return (Criteria) this;
        }

        public Criteria andStudentResidenceplaceGreaterThanOrEqualTo(String value) {
            addCriterion("student_residenceplace >=", value, "studentResidenceplace");
            return (Criteria) this;
        }

        public Criteria andStudentResidenceplaceLessThan(String value) {
            addCriterion("student_residenceplace <", value, "studentResidenceplace");
            return (Criteria) this;
        }

        public Criteria andStudentResidenceplaceLessThanOrEqualTo(String value) {
            addCriterion("student_residenceplace <=", value, "studentResidenceplace");
            return (Criteria) this;
        }

        public Criteria andStudentResidenceplaceLike(String value) {
            addCriterion("student_residenceplace like", value, "studentResidenceplace");
            return (Criteria) this;
        }

        public Criteria andStudentResidenceplaceNotLike(String value) {
            addCriterion("student_residenceplace not like", value, "studentResidenceplace");
            return (Criteria) this;
        }

        public Criteria andStudentResidenceplaceIn(List<String> values) {
            addCriterion("student_residenceplace in", values, "studentResidenceplace");
            return (Criteria) this;
        }

        public Criteria andStudentResidenceplaceNotIn(List<String> values) {
            addCriterion("student_residenceplace not in", values, "studentResidenceplace");
            return (Criteria) this;
        }

        public Criteria andStudentResidenceplaceBetween(String value1, String value2) {
            addCriterion("student_residenceplace between", value1, value2, "studentResidenceplace");
            return (Criteria) this;
        }

        public Criteria andStudentResidenceplaceNotBetween(String value1, String value2) {
            addCriterion("student_residenceplace not between", value1, value2, "studentResidenceplace");
            return (Criteria) this;
        }

        public Criteria andStudentAgeIsNull() {
            addCriterion("student_age is null");
            return (Criteria) this;
        }

        public Criteria andStudentAgeIsNotNull() {
            addCriterion("student_age is not null");
            return (Criteria) this;
        }

        public Criteria andStudentAgeEqualTo(Integer value) {
            addCriterion("student_age =", value, "studentAge");
            return (Criteria) this;
        }

        public Criteria andStudentAgeNotEqualTo(Integer value) {
            addCriterion("student_age <>", value, "studentAge");
            return (Criteria) this;
        }

        public Criteria andStudentAgeGreaterThan(Integer value) {
            addCriterion("student_age >", value, "studentAge");
            return (Criteria) this;
        }

        public Criteria andStudentAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_age >=", value, "studentAge");
            return (Criteria) this;
        }

        public Criteria andStudentAgeLessThan(Integer value) {
            addCriterion("student_age <", value, "studentAge");
            return (Criteria) this;
        }

        public Criteria andStudentAgeLessThanOrEqualTo(Integer value) {
            addCriterion("student_age <=", value, "studentAge");
            return (Criteria) this;
        }

        public Criteria andStudentAgeIn(List<Integer> values) {
            addCriterion("student_age in", values, "studentAge");
            return (Criteria) this;
        }

        public Criteria andStudentAgeNotIn(List<Integer> values) {
            addCriterion("student_age not in", values, "studentAge");
            return (Criteria) this;
        }

        public Criteria andStudentAgeBetween(Integer value1, Integer value2) {
            addCriterion("student_age between", value1, value2, "studentAge");
            return (Criteria) this;
        }

        public Criteria andStudentAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("student_age not between", value1, value2, "studentAge");
            return (Criteria) this;
        }

        public Criteria andCet4ScoreIsNull() {
            addCriterion("cet4_score is null");
            return (Criteria) this;
        }

        public Criteria andCet4ScoreIsNotNull() {
            addCriterion("cet4_score is not null");
            return (Criteria) this;
        }

        public Criteria andCet4ScoreEqualTo(Integer value) {
            addCriterion("cet4_score =", value, "cet4Score");
            return (Criteria) this;
        }

        public Criteria andCet4ScoreNotEqualTo(Integer value) {
            addCriterion("cet4_score <>", value, "cet4Score");
            return (Criteria) this;
        }

        public Criteria andCet4ScoreGreaterThan(Integer value) {
            addCriterion("cet4_score >", value, "cet4Score");
            return (Criteria) this;
        }

        public Criteria andCet4ScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("cet4_score >=", value, "cet4Score");
            return (Criteria) this;
        }

        public Criteria andCet4ScoreLessThan(Integer value) {
            addCriterion("cet4_score <", value, "cet4Score");
            return (Criteria) this;
        }

        public Criteria andCet4ScoreLessThanOrEqualTo(Integer value) {
            addCriterion("cet4_score <=", value, "cet4Score");
            return (Criteria) this;
        }

        public Criteria andCet4ScoreIn(List<Integer> values) {
            addCriterion("cet4_score in", values, "cet4Score");
            return (Criteria) this;
        }

        public Criteria andCet4ScoreNotIn(List<Integer> values) {
            addCriterion("cet4_score not in", values, "cet4Score");
            return (Criteria) this;
        }

        public Criteria andCet4ScoreBetween(Integer value1, Integer value2) {
            addCriterion("cet4_score between", value1, value2, "cet4Score");
            return (Criteria) this;
        }

        public Criteria andCet4ScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("cet4_score not between", value1, value2, "cet4Score");
            return (Criteria) this;
        }

        public Criteria andCet6ScoreIsNull() {
            addCriterion("cet6_score is null");
            return (Criteria) this;
        }

        public Criteria andCet6ScoreIsNotNull() {
            addCriterion("cet6_score is not null");
            return (Criteria) this;
        }

        public Criteria andCet6ScoreEqualTo(Integer value) {
            addCriterion("cet6_score =", value, "cet6Score");
            return (Criteria) this;
        }

        public Criteria andCet6ScoreNotEqualTo(Integer value) {
            addCriterion("cet6_score <>", value, "cet6Score");
            return (Criteria) this;
        }

        public Criteria andCet6ScoreGreaterThan(Integer value) {
            addCriterion("cet6_score >", value, "cet6Score");
            return (Criteria) this;
        }

        public Criteria andCet6ScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("cet6_score >=", value, "cet6Score");
            return (Criteria) this;
        }

        public Criteria andCet6ScoreLessThan(Integer value) {
            addCriterion("cet6_score <", value, "cet6Score");
            return (Criteria) this;
        }

        public Criteria andCet6ScoreLessThanOrEqualTo(Integer value) {
            addCriterion("cet6_score <=", value, "cet6Score");
            return (Criteria) this;
        }

        public Criteria andCet6ScoreIn(List<Integer> values) {
            addCriterion("cet6_score in", values, "cet6Score");
            return (Criteria) this;
        }

        public Criteria andCet6ScoreNotIn(List<Integer> values) {
            addCriterion("cet6_score not in", values, "cet6Score");
            return (Criteria) this;
        }

        public Criteria andCet6ScoreBetween(Integer value1, Integer value2) {
            addCriterion("cet6_score between", value1, value2, "cet6Score");
            return (Criteria) this;
        }

        public Criteria andCet6ScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("cet6_score not between", value1, value2, "cet6Score");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusIsNull() {
            addCriterion("political_status is null");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusIsNotNull() {
            addCriterion("political_status is not null");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusEqualTo(String value) {
            addCriterion("political_status =", value, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusNotEqualTo(String value) {
            addCriterion("political_status <>", value, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusGreaterThan(String value) {
            addCriterion("political_status >", value, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusGreaterThanOrEqualTo(String value) {
            addCriterion("political_status >=", value, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusLessThan(String value) {
            addCriterion("political_status <", value, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusLessThanOrEqualTo(String value) {
            addCriterion("political_status <=", value, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusLike(String value) {
            addCriterion("political_status like", value, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusNotLike(String value) {
            addCriterion("political_status not like", value, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusIn(List<String> values) {
            addCriterion("political_status in", values, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusNotIn(List<String> values) {
            addCriterion("political_status not in", values, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusBetween(String value1, String value2) {
            addCriterion("political_status between", value1, value2, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusNotBetween(String value1, String value2) {
            addCriterion("political_status not between", value1, value2, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andSchoolLevelIsNull() {
            addCriterion("school_level is null");
            return (Criteria) this;
        }

        public Criteria andSchoolLevelIsNotNull() {
            addCriterion("school_level is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolLevelEqualTo(String value) {
            addCriterion("school_level =", value, "schoolLevel");
            return (Criteria) this;
        }

        public Criteria andSchoolLevelNotEqualTo(String value) {
            addCriterion("school_level <>", value, "schoolLevel");
            return (Criteria) this;
        }

        public Criteria andSchoolLevelGreaterThan(String value) {
            addCriterion("school_level >", value, "schoolLevel");
            return (Criteria) this;
        }

        public Criteria andSchoolLevelGreaterThanOrEqualTo(String value) {
            addCriterion("school_level >=", value, "schoolLevel");
            return (Criteria) this;
        }

        public Criteria andSchoolLevelLessThan(String value) {
            addCriterion("school_level <", value, "schoolLevel");
            return (Criteria) this;
        }

        public Criteria andSchoolLevelLessThanOrEqualTo(String value) {
            addCriterion("school_level <=", value, "schoolLevel");
            return (Criteria) this;
        }

        public Criteria andSchoolLevelLike(String value) {
            addCriterion("school_level like", value, "schoolLevel");
            return (Criteria) this;
        }

        public Criteria andSchoolLevelNotLike(String value) {
            addCriterion("school_level not like", value, "schoolLevel");
            return (Criteria) this;
        }

        public Criteria andSchoolLevelIn(List<String> values) {
            addCriterion("school_level in", values, "schoolLevel");
            return (Criteria) this;
        }

        public Criteria andSchoolLevelNotIn(List<String> values) {
            addCriterion("school_level not in", values, "schoolLevel");
            return (Criteria) this;
        }

        public Criteria andSchoolLevelBetween(String value1, String value2) {
            addCriterion("school_level between", value1, value2, "schoolLevel");
            return (Criteria) this;
        }

        public Criteria andSchoolLevelNotBetween(String value1, String value2) {
            addCriterion("school_level not between", value1, value2, "schoolLevel");
            return (Criteria) this;
        }

        public Criteria andThesisLevelIsNull() {
            addCriterion("thesis_level is null");
            return (Criteria) this;
        }

        public Criteria andThesisLevelIsNotNull() {
            addCriterion("thesis_level is not null");
            return (Criteria) this;
        }

        public Criteria andThesisLevelEqualTo(String value) {
            addCriterion("thesis_level =", value, "thesisLevel");
            return (Criteria) this;
        }

        public Criteria andThesisLevelNotEqualTo(String value) {
            addCriterion("thesis_level <>", value, "thesisLevel");
            return (Criteria) this;
        }

        public Criteria andThesisLevelGreaterThan(String value) {
            addCriterion("thesis_level >", value, "thesisLevel");
            return (Criteria) this;
        }

        public Criteria andThesisLevelGreaterThanOrEqualTo(String value) {
            addCriterion("thesis_level >=", value, "thesisLevel");
            return (Criteria) this;
        }

        public Criteria andThesisLevelLessThan(String value) {
            addCriterion("thesis_level <", value, "thesisLevel");
            return (Criteria) this;
        }

        public Criteria andThesisLevelLessThanOrEqualTo(String value) {
            addCriterion("thesis_level <=", value, "thesisLevel");
            return (Criteria) this;
        }

        public Criteria andThesisLevelLike(String value) {
            addCriterion("thesis_level like", value, "thesisLevel");
            return (Criteria) this;
        }

        public Criteria andThesisLevelNotLike(String value) {
            addCriterion("thesis_level not like", value, "thesisLevel");
            return (Criteria) this;
        }

        public Criteria andThesisLevelIn(List<String> values) {
            addCriterion("thesis_level in", values, "thesisLevel");
            return (Criteria) this;
        }

        public Criteria andThesisLevelNotIn(List<String> values) {
            addCriterion("thesis_level not in", values, "thesisLevel");
            return (Criteria) this;
        }

        public Criteria andThesisLevelBetween(String value1, String value2) {
            addCriterion("thesis_level between", value1, value2, "thesisLevel");
            return (Criteria) this;
        }

        public Criteria andThesisLevelNotBetween(String value1, String value2) {
            addCriterion("thesis_level not between", value1, value2, "thesisLevel");
            return (Criteria) this;
        }

        public Criteria andCompetitionLevelIsNull() {
            addCriterion("competition_level is null");
            return (Criteria) this;
        }

        public Criteria andCompetitionLevelIsNotNull() {
            addCriterion("competition_level is not null");
            return (Criteria) this;
        }

        public Criteria andCompetitionLevelEqualTo(String value) {
            addCriterion("competition_level =", value, "competitionLevel");
            return (Criteria) this;
        }

        public Criteria andCompetitionLevelNotEqualTo(String value) {
            addCriterion("competition_level <>", value, "competitionLevel");
            return (Criteria) this;
        }

        public Criteria andCompetitionLevelGreaterThan(String value) {
            addCriterion("competition_level >", value, "competitionLevel");
            return (Criteria) this;
        }

        public Criteria andCompetitionLevelGreaterThanOrEqualTo(String value) {
            addCriterion("competition_level >=", value, "competitionLevel");
            return (Criteria) this;
        }

        public Criteria andCompetitionLevelLessThan(String value) {
            addCriterion("competition_level <", value, "competitionLevel");
            return (Criteria) this;
        }

        public Criteria andCompetitionLevelLessThanOrEqualTo(String value) {
            addCriterion("competition_level <=", value, "competitionLevel");
            return (Criteria) this;
        }

        public Criteria andCompetitionLevelLike(String value) {
            addCriterion("competition_level like", value, "competitionLevel");
            return (Criteria) this;
        }

        public Criteria andCompetitionLevelNotLike(String value) {
            addCriterion("competition_level not like", value, "competitionLevel");
            return (Criteria) this;
        }

        public Criteria andCompetitionLevelIn(List<String> values) {
            addCriterion("competition_level in", values, "competitionLevel");
            return (Criteria) this;
        }

        public Criteria andCompetitionLevelNotIn(List<String> values) {
            addCriterion("competition_level not in", values, "competitionLevel");
            return (Criteria) this;
        }

        public Criteria andCompetitionLevelBetween(String value1, String value2) {
            addCriterion("competition_level between", value1, value2, "competitionLevel");
            return (Criteria) this;
        }

        public Criteria andCompetitionLevelNotBetween(String value1, String value2) {
            addCriterion("competition_level not between", value1, value2, "competitionLevel");
            return (Criteria) this;
        }

        public Criteria andInternshipCompanyIsNull() {
            addCriterion("Internship_company is null");
            return (Criteria) this;
        }

        public Criteria andInternshipCompanyIsNotNull() {
            addCriterion("Internship_company is not null");
            return (Criteria) this;
        }

        public Criteria andInternshipCompanyEqualTo(String value) {
            addCriterion("Internship_company =", value, "internshipCompany");
            return (Criteria) this;
        }

        public Criteria andInternshipCompanyNotEqualTo(String value) {
            addCriterion("Internship_company <>", value, "internshipCompany");
            return (Criteria) this;
        }

        public Criteria andInternshipCompanyGreaterThan(String value) {
            addCriterion("Internship_company >", value, "internshipCompany");
            return (Criteria) this;
        }

        public Criteria andInternshipCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("Internship_company >=", value, "internshipCompany");
            return (Criteria) this;
        }

        public Criteria andInternshipCompanyLessThan(String value) {
            addCriterion("Internship_company <", value, "internshipCompany");
            return (Criteria) this;
        }

        public Criteria andInternshipCompanyLessThanOrEqualTo(String value) {
            addCriterion("Internship_company <=", value, "internshipCompany");
            return (Criteria) this;
        }

        public Criteria andInternshipCompanyLike(String value) {
            addCriterion("Internship_company like", value, "internshipCompany");
            return (Criteria) this;
        }

        public Criteria andInternshipCompanyNotLike(String value) {
            addCriterion("Internship_company not like", value, "internshipCompany");
            return (Criteria) this;
        }

        public Criteria andInternshipCompanyIn(List<String> values) {
            addCriterion("Internship_company in", values, "internshipCompany");
            return (Criteria) this;
        }

        public Criteria andInternshipCompanyNotIn(List<String> values) {
            addCriterion("Internship_company not in", values, "internshipCompany");
            return (Criteria) this;
        }

        public Criteria andInternshipCompanyBetween(String value1, String value2) {
            addCriterion("Internship_company between", value1, value2, "internshipCompany");
            return (Criteria) this;
        }

        public Criteria andInternshipCompanyNotBetween(String value1, String value2) {
            addCriterion("Internship_company not between", value1, value2, "internshipCompany");
            return (Criteria) this;
        }

        public Criteria andScholarshipLevelIsNull() {
            addCriterion("scholarship_level is null");
            return (Criteria) this;
        }

        public Criteria andScholarshipLevelIsNotNull() {
            addCriterion("scholarship_level is not null");
            return (Criteria) this;
        }

        public Criteria andScholarshipLevelEqualTo(String value) {
            addCriterion("scholarship_level =", value, "scholarshipLevel");
            return (Criteria) this;
        }

        public Criteria andScholarshipLevelNotEqualTo(String value) {
            addCriterion("scholarship_level <>", value, "scholarshipLevel");
            return (Criteria) this;
        }

        public Criteria andScholarshipLevelGreaterThan(String value) {
            addCriterion("scholarship_level >", value, "scholarshipLevel");
            return (Criteria) this;
        }

        public Criteria andScholarshipLevelGreaterThanOrEqualTo(String value) {
            addCriterion("scholarship_level >=", value, "scholarshipLevel");
            return (Criteria) this;
        }

        public Criteria andScholarshipLevelLessThan(String value) {
            addCriterion("scholarship_level <", value, "scholarshipLevel");
            return (Criteria) this;
        }

        public Criteria andScholarshipLevelLessThanOrEqualTo(String value) {
            addCriterion("scholarship_level <=", value, "scholarshipLevel");
            return (Criteria) this;
        }

        public Criteria andScholarshipLevelLike(String value) {
            addCriterion("scholarship_level like", value, "scholarshipLevel");
            return (Criteria) this;
        }

        public Criteria andScholarshipLevelNotLike(String value) {
            addCriterion("scholarship_level not like", value, "scholarshipLevel");
            return (Criteria) this;
        }

        public Criteria andScholarshipLevelIn(List<String> values) {
            addCriterion("scholarship_level in", values, "scholarshipLevel");
            return (Criteria) this;
        }

        public Criteria andScholarshipLevelNotIn(List<String> values) {
            addCriterion("scholarship_level not in", values, "scholarshipLevel");
            return (Criteria) this;
        }

        public Criteria andScholarshipLevelBetween(String value1, String value2) {
            addCriterion("scholarship_level between", value1, value2, "scholarshipLevel");
            return (Criteria) this;
        }

        public Criteria andScholarshipLevelNotBetween(String value1, String value2) {
            addCriterion("scholarship_level not between", value1, value2, "scholarshipLevel");
            return (Criteria) this;
        }

        public Criteria andCampusExperienceIsNull() {
            addCriterion("campus_experience is null");
            return (Criteria) this;
        }

        public Criteria andCampusExperienceIsNotNull() {
            addCriterion("campus_experience is not null");
            return (Criteria) this;
        }

        public Criteria andCampusExperienceEqualTo(String value) {
            addCriterion("campus_experience =", value, "campusExperience");
            return (Criteria) this;
        }

        public Criteria andCampusExperienceNotEqualTo(String value) {
            addCriterion("campus_experience <>", value, "campusExperience");
            return (Criteria) this;
        }

        public Criteria andCampusExperienceGreaterThan(String value) {
            addCriterion("campus_experience >", value, "campusExperience");
            return (Criteria) this;
        }

        public Criteria andCampusExperienceGreaterThanOrEqualTo(String value) {
            addCriterion("campus_experience >=", value, "campusExperience");
            return (Criteria) this;
        }

        public Criteria andCampusExperienceLessThan(String value) {
            addCriterion("campus_experience <", value, "campusExperience");
            return (Criteria) this;
        }

        public Criteria andCampusExperienceLessThanOrEqualTo(String value) {
            addCriterion("campus_experience <=", value, "campusExperience");
            return (Criteria) this;
        }

        public Criteria andCampusExperienceLike(String value) {
            addCriterion("campus_experience like", value, "campusExperience");
            return (Criteria) this;
        }

        public Criteria andCampusExperienceNotLike(String value) {
            addCriterion("campus_experience not like", value, "campusExperience");
            return (Criteria) this;
        }

        public Criteria andCampusExperienceIn(List<String> values) {
            addCriterion("campus_experience in", values, "campusExperience");
            return (Criteria) this;
        }

        public Criteria andCampusExperienceNotIn(List<String> values) {
            addCriterion("campus_experience not in", values, "campusExperience");
            return (Criteria) this;
        }

        public Criteria andCampusExperienceBetween(String value1, String value2) {
            addCriterion("campus_experience between", value1, value2, "campusExperience");
            return (Criteria) this;
        }

        public Criteria andCampusExperienceNotBetween(String value1, String value2) {
            addCriterion("campus_experience not between", value1, value2, "campusExperience");
            return (Criteria) this;
        }

        public Criteria andInterestedDirectionIsNull() {
            addCriterion("Interested_direction is null");
            return (Criteria) this;
        }

        public Criteria andInterestedDirectionIsNotNull() {
            addCriterion("Interested_direction is not null");
            return (Criteria) this;
        }

        public Criteria andInterestedDirectionEqualTo(String value) {
            addCriterion("Interested_direction =", value, "interestedDirection");
            return (Criteria) this;
        }

        public Criteria andInterestedDirectionNotEqualTo(String value) {
            addCriterion("Interested_direction <>", value, "interestedDirection");
            return (Criteria) this;
        }

        public Criteria andInterestedDirectionGreaterThan(String value) {
            addCriterion("Interested_direction >", value, "interestedDirection");
            return (Criteria) this;
        }

        public Criteria andInterestedDirectionGreaterThanOrEqualTo(String value) {
            addCriterion("Interested_direction >=", value, "interestedDirection");
            return (Criteria) this;
        }

        public Criteria andInterestedDirectionLessThan(String value) {
            addCriterion("Interested_direction <", value, "interestedDirection");
            return (Criteria) this;
        }

        public Criteria andInterestedDirectionLessThanOrEqualTo(String value) {
            addCriterion("Interested_direction <=", value, "interestedDirection");
            return (Criteria) this;
        }

        public Criteria andInterestedDirectionLike(String value) {
            addCriterion("Interested_direction like", value, "interestedDirection");
            return (Criteria) this;
        }

        public Criteria andInterestedDirectionNotLike(String value) {
            addCriterion("Interested_direction not like", value, "interestedDirection");
            return (Criteria) this;
        }

        public Criteria andInterestedDirectionIn(List<String> values) {
            addCriterion("Interested_direction in", values, "interestedDirection");
            return (Criteria) this;
        }

        public Criteria andInterestedDirectionNotIn(List<String> values) {
            addCriterion("Interested_direction not in", values, "interestedDirection");
            return (Criteria) this;
        }

        public Criteria andInterestedDirectionBetween(String value1, String value2) {
            addCriterion("Interested_direction between", value1, value2, "interestedDirection");
            return (Criteria) this;
        }

        public Criteria andInterestedDirectionNotBetween(String value1, String value2) {
            addCriterion("Interested_direction not between", value1, value2, "interestedDirection");
            return (Criteria) this;
        }

        public Criteria andIntroLevelIsNull() {
            addCriterion("Intro_level is null");
            return (Criteria) this;
        }

        public Criteria andIntroLevelIsNotNull() {
            addCriterion("Intro_level is not null");
            return (Criteria) this;
        }

        public Criteria andIntroLevelEqualTo(Integer value) {
            addCriterion("Intro_level =", value, "introLevel");
            return (Criteria) this;
        }

        public Criteria andIntroLevelNotEqualTo(Integer value) {
            addCriterion("Intro_level <>", value, "introLevel");
            return (Criteria) this;
        }

        public Criteria andIntroLevelGreaterThan(Integer value) {
            addCriterion("Intro_level >", value, "introLevel");
            return (Criteria) this;
        }

        public Criteria andIntroLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("Intro_level >=", value, "introLevel");
            return (Criteria) this;
        }

        public Criteria andIntroLevelLessThan(Integer value) {
            addCriterion("Intro_level <", value, "introLevel");
            return (Criteria) this;
        }

        public Criteria andIntroLevelLessThanOrEqualTo(Integer value) {
            addCriterion("Intro_level <=", value, "introLevel");
            return (Criteria) this;
        }

        public Criteria andIntroLevelIn(List<Integer> values) {
            addCriterion("Intro_level in", values, "introLevel");
            return (Criteria) this;
        }

        public Criteria andIntroLevelNotIn(List<Integer> values) {
            addCriterion("Intro_level not in", values, "introLevel");
            return (Criteria) this;
        }

        public Criteria andIntroLevelBetween(Integer value1, Integer value2) {
            addCriterion("Intro_level between", value1, value2, "introLevel");
            return (Criteria) this;
        }

        public Criteria andIntroLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("Intro_level not between", value1, value2, "introLevel");
            return (Criteria) this;
        }

        public Criteria andStudentCharacterIsNull() {
            addCriterion("student_character is null");
            return (Criteria) this;
        }

        public Criteria andStudentCharacterIsNotNull() {
            addCriterion("student_character is not null");
            return (Criteria) this;
        }

        public Criteria andStudentCharacterEqualTo(String value) {
            addCriterion("student_character =", value, "studentCharacter");
            return (Criteria) this;
        }

        public Criteria andStudentCharacterNotEqualTo(String value) {
            addCriterion("student_character <>", value, "studentCharacter");
            return (Criteria) this;
        }

        public Criteria andStudentCharacterGreaterThan(String value) {
            addCriterion("student_character >", value, "studentCharacter");
            return (Criteria) this;
        }

        public Criteria andStudentCharacterGreaterThanOrEqualTo(String value) {
            addCriterion("student_character >=", value, "studentCharacter");
            return (Criteria) this;
        }

        public Criteria andStudentCharacterLessThan(String value) {
            addCriterion("student_character <", value, "studentCharacter");
            return (Criteria) this;
        }

        public Criteria andStudentCharacterLessThanOrEqualTo(String value) {
            addCriterion("student_character <=", value, "studentCharacter");
            return (Criteria) this;
        }

        public Criteria andStudentCharacterLike(String value) {
            addCriterion("student_character like", value, "studentCharacter");
            return (Criteria) this;
        }

        public Criteria andStudentCharacterNotLike(String value) {
            addCriterion("student_character not like", value, "studentCharacter");
            return (Criteria) this;
        }

        public Criteria andStudentCharacterIn(List<String> values) {
            addCriterion("student_character in", values, "studentCharacter");
            return (Criteria) this;
        }

        public Criteria andStudentCharacterNotIn(List<String> values) {
            addCriterion("student_character not in", values, "studentCharacter");
            return (Criteria) this;
        }

        public Criteria andStudentCharacterBetween(String value1, String value2) {
            addCriterion("student_character between", value1, value2, "studentCharacter");
            return (Criteria) this;
        }

        public Criteria andStudentCharacterNotBetween(String value1, String value2) {
            addCriterion("student_character not between", value1, value2, "studentCharacter");
            return (Criteria) this;
        }

        public Criteria andTelNumberIsNull() {
            addCriterion("tel_number is null");
            return (Criteria) this;
        }

        public Criteria andTelNumberIsNotNull() {
            addCriterion("tel_number is not null");
            return (Criteria) this;
        }

        public Criteria andTelNumberEqualTo(String value) {
            addCriterion("tel_number =", value, "telNumber");
            return (Criteria) this;
        }

        public Criteria andTelNumberNotEqualTo(String value) {
            addCriterion("tel_number <>", value, "telNumber");
            return (Criteria) this;
        }

        public Criteria andTelNumberGreaterThan(String value) {
            addCriterion("tel_number >", value, "telNumber");
            return (Criteria) this;
        }

        public Criteria andTelNumberGreaterThanOrEqualTo(String value) {
            addCriterion("tel_number >=", value, "telNumber");
            return (Criteria) this;
        }

        public Criteria andTelNumberLessThan(String value) {
            addCriterion("tel_number <", value, "telNumber");
            return (Criteria) this;
        }

        public Criteria andTelNumberLessThanOrEqualTo(String value) {
            addCriterion("tel_number <=", value, "telNumber");
            return (Criteria) this;
        }

        public Criteria andTelNumberLike(String value) {
            addCriterion("tel_number like", value, "telNumber");
            return (Criteria) this;
        }

        public Criteria andTelNumberNotLike(String value) {
            addCriterion("tel_number not like", value, "telNumber");
            return (Criteria) this;
        }

        public Criteria andTelNumberIn(List<String> values) {
            addCriterion("tel_number in", values, "telNumber");
            return (Criteria) this;
        }

        public Criteria andTelNumberNotIn(List<String> values) {
            addCriterion("tel_number not in", values, "telNumber");
            return (Criteria) this;
        }

        public Criteria andTelNumberBetween(String value1, String value2) {
            addCriterion("tel_number between", value1, value2, "telNumber");
            return (Criteria) this;
        }

        public Criteria andTelNumberNotBetween(String value1, String value2) {
            addCriterion("tel_number not between", value1, value2, "telNumber");
            return (Criteria) this;
        }

        public Criteria andStudentImgIsNull() {
            addCriterion("student_img is null");
            return (Criteria) this;
        }

        public Criteria andStudentImgIsNotNull() {
            addCriterion("student_img is not null");
            return (Criteria) this;
        }

        public Criteria andStudentImgEqualTo(String value) {
            addCriterion("student_img =", value, "studentImg");
            return (Criteria) this;
        }

        public Criteria andStudentImgNotEqualTo(String value) {
            addCriterion("student_img <>", value, "studentImg");
            return (Criteria) this;
        }

        public Criteria andStudentImgGreaterThan(String value) {
            addCriterion("student_img >", value, "studentImg");
            return (Criteria) this;
        }

        public Criteria andStudentImgGreaterThanOrEqualTo(String value) {
            addCriterion("student_img >=", value, "studentImg");
            return (Criteria) this;
        }

        public Criteria andStudentImgLessThan(String value) {
            addCriterion("student_img <", value, "studentImg");
            return (Criteria) this;
        }

        public Criteria andStudentImgLessThanOrEqualTo(String value) {
            addCriterion("student_img <=", value, "studentImg");
            return (Criteria) this;
        }

        public Criteria andStudentImgLike(String value) {
            addCriterion("student_img like", value, "studentImg");
            return (Criteria) this;
        }

        public Criteria andStudentImgNotLike(String value) {
            addCriterion("student_img not like", value, "studentImg");
            return (Criteria) this;
        }

        public Criteria andStudentImgIn(List<String> values) {
            addCriterion("student_img in", values, "studentImg");
            return (Criteria) this;
        }

        public Criteria andStudentImgNotIn(List<String> values) {
            addCriterion("student_img not in", values, "studentImg");
            return (Criteria) this;
        }

        public Criteria andStudentImgBetween(String value1, String value2) {
            addCriterion("student_img between", value1, value2, "studentImg");
            return (Criteria) this;
        }

        public Criteria andStudentImgNotBetween(String value1, String value2) {
            addCriterion("student_img not between", value1, value2, "studentImg");
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