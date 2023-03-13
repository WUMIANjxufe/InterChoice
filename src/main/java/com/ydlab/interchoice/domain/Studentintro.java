package com.ydlab.interchoice.domain;

public class Studentintro {
    private Integer studentId;

    private String studentName;

    private String studentSex;

    private String studentResidenceplace;

    private Integer studentAge;

    private Integer cet4Score;

    private Integer cet6Score;

    private String politicalStatus;

    private String schoolLevel;

    private String thesisLevel;

    private String competitionLevel;

    private String internshipCompany;

    private String scholarshipLevel;

    private String campusExperience;

    private String interestedDirection;

    private Integer introLevel;

    private String studentCharacter;

    private String telNumber;

    private String studentImg;

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentSex() {
        return studentSex;
    }

    public void setStudentSex(String studentSex) {
        this.studentSex = studentSex;
    }

    public String getStudentResidenceplace() {
        return studentResidenceplace;
    }

    public void setStudentResidenceplace(String studentResidenceplace) {
        this.studentResidenceplace = studentResidenceplace;
    }

    public Integer getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(Integer studentAge) {
        this.studentAge = studentAge;
    }

    public Integer getCet4Score() {
        return cet4Score;
    }

    public void setCet4Score(Integer cet4Score) {
        this.cet4Score = cet4Score;
    }

    public Integer getCet6Score() {
        return cet6Score;
    }

    public void setCet6Score(Integer cet6Score) {
        this.cet6Score = cet6Score;
    }

    public String getPoliticalStatus() {
        return politicalStatus;
    }

    public void setPoliticalStatus(String politicalStatus) {
        this.politicalStatus = politicalStatus;
    }

    public String getSchoolLevel() {
        return schoolLevel;
    }

    public void setSchoolLevel(String schoolLevel) {
        this.schoolLevel = schoolLevel;
    }

    public String getThesisLevel() {
        return thesisLevel;
    }

    public void setThesisLevel(String thesisLevel) {
        this.thesisLevel = thesisLevel;
    }

    public String getCompetitionLevel() {
        return competitionLevel;
    }

    public void setCompetitionLevel(String competitionLevel) {
        this.competitionLevel = competitionLevel;
    }

    public String getInternshipCompany() {
        return internshipCompany;
    }

    public void setInternshipCompany(String internshipCompany) {
        this.internshipCompany = internshipCompany;
    }

    public String getScholarshipLevel() {
        return scholarshipLevel;
    }

    public void setScholarshipLevel(String scholarshipLevel) {
        this.scholarshipLevel = scholarshipLevel;
    }

    public String getCampusExperience() {
        return campusExperience;
    }

    public void setCampusExperience(String campusExperience) {
        this.campusExperience = campusExperience;
    }

    public String getInterestedDirection() {
        return interestedDirection;
    }

    public void setInterestedDirection(String interestedDirection) {
        this.interestedDirection = interestedDirection;
    }

    public Integer getIntroLevel() {
        return introLevel;
    }

    public void setIntroLevel(Integer introLevel) {
        this.introLevel = introLevel;
    }

    public String getStudentCharacter() {
        return studentCharacter;
    }

    public void setStudentCharacter(String studentCharacter) {
        this.studentCharacter = studentCharacter;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

    public String getStudentImg() {
        return studentImg;
    }

    public void setStudentImg(String studentImg) {
        this.studentImg = studentImg;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", studentId=").append(studentId);
        sb.append(", studentName=").append(studentName);
        sb.append(", studentSex=").append(studentSex);
        sb.append(", studentResidenceplace=").append(studentResidenceplace);
        sb.append(", studentAge=").append(studentAge);
        sb.append(", cet4Score=").append(cet4Score);
        sb.append(", cet6Score=").append(cet6Score);
        sb.append(", politicalStatus=").append(politicalStatus);
        sb.append(", schoolLevel=").append(schoolLevel);
        sb.append(", thesisLevel=").append(thesisLevel);
        sb.append(", competitionLevel=").append(competitionLevel);
        sb.append(", internshipCompany=").append(internshipCompany);
        sb.append(", scholarshipLevel=").append(scholarshipLevel);
        sb.append(", campusExperience=").append(campusExperience);
        sb.append(", interestedDirection=").append(interestedDirection);
        sb.append(", introLevel=").append(introLevel);
        sb.append(", studentCharacter=").append(studentCharacter);
        sb.append(", telNumber=").append(telNumber);
        sb.append(", studentImg=").append(studentImg);
        sb.append("]");
        return sb.toString();
    }
}