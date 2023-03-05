package com.ydlab.interchoice.domain;

public class Tutor {
    private Integer tutorId;

    private String tutorName;

    private String researchDirection;

    private String tutorTitle;

    private Integer studentRequirement;

    private String educationalBackground;

    private String tutorDuty;

    private String tutorSex;

    private Integer tutorAge;

    private String favorateCharacter;

    public Integer getTutorId() {
        return tutorId;
    }

    public void setTutorId(Integer tutorId) {
        this.tutorId = tutorId;
    }

    public String getTutorName() {
        return tutorName;
    }

    public void setTutorName(String tutorName) {
        this.tutorName = tutorName;
    }

    public String getResearchDirection() {
        return researchDirection;
    }

    public void setResearchDirection(String researchDirection) {
        this.researchDirection = researchDirection;
    }

    public String getTutorTitle() {
        return tutorTitle;
    }

    public void setTutorTitle(String tutorTitle) {
        this.tutorTitle = tutorTitle;
    }

    public Integer getStudentRequirement() {
        return studentRequirement;
    }

    public void setStudentRequirement(Integer studentRequirement) {
        this.studentRequirement = studentRequirement;
    }

    public String getEducationalBackground() {
        return educationalBackground;
    }

    public void setEducationalBackground(String educationalBackground) {
        this.educationalBackground = educationalBackground;
    }

    public String getTutorDuty() {
        return tutorDuty;
    }

    public void setTutorDuty(String tutorDuty) {
        this.tutorDuty = tutorDuty;
    }

    public String getTutorSex() {
        return tutorSex;
    }

    public void setTutorSex(String tutorSex) {
        this.tutorSex = tutorSex;
    }

    public Integer getTutorAge() {
        return tutorAge;
    }

    public void setTutorAge(Integer tutorAge) {
        this.tutorAge = tutorAge;
    }

    public String getFavorateCharacter() {
        return favorateCharacter;
    }

    public void setFavorateCharacter(String favorateCharacter) {
        this.favorateCharacter = favorateCharacter;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tutorId=").append(tutorId);
        sb.append(", tutorName=").append(tutorName);
        sb.append(", researchDirection=").append(researchDirection);
        sb.append(", tutorTitle=").append(tutorTitle);
        sb.append(", studentRequirement=").append(studentRequirement);
        sb.append(", educationalBackground=").append(educationalBackground);
        sb.append(", tutorDuty=").append(tutorDuty);
        sb.append(", tutorSex=").append(tutorSex);
        sb.append(", tutorAge=").append(tutorAge);
        sb.append(", favorateCharacter=").append(favorateCharacter);
        sb.append("]");
        return sb.toString();
    }
}