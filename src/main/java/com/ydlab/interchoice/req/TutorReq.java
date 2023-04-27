package com.ydlab.interchoice.req;

public class TutorReq {
    private Integer tutorid;

    private String tutorname;

    private String researchdirection;

    private String tutortitle;

    private Integer studentrequirement;

    private String educationalbackground;

    private String tutorduty;

    private String tutorsex;

    private Integer tutorage;

    private String cultivationmodel;

    private String thesis;

    public Integer getTutorid() {
        return tutorid;
    }

    public void setTutorid(Integer tutorid) {
        this.tutorid = tutorid;
    }

    public String getTutorname() {
        return tutorname;
    }

    public void setTutorname(String tutorname) {
        this.tutorname = tutorname;
    }

    public String getResearchdirection() {
        return researchdirection;
    }

    public void setResearchdirection(String researchdirection) {
        this.researchdirection = researchdirection;
    }

    public String getTutortitle() {
        return tutortitle;
    }

    public void setTutortitle(String tutortitle) {
        this.tutortitle = tutortitle;
    }

    public Integer getStudentrequirement() {
        return studentrequirement;
    }

    public void setStudentrequirement(Integer studentrequirement) {
        this.studentrequirement = studentrequirement;
    }

    public String getEducationalbackground() {
        return educationalbackground;
    }

    public void setEducationalbackground(String educationalbackground) {
        this.educationalbackground = educationalbackground;
    }

    public String getTutorduty() {
        return tutorduty;
    }

    public void setTutorduty(String tutorduty) {
        this.tutorduty = tutorduty;
    }

    public String getTutorsex() {
        return tutorsex;
    }

    public void setTutorsex(String tutorsex) {
        this.tutorsex = tutorsex;
    }

    public Integer getTutorage() {
        return tutorage;
    }

    public void setTutorage(Integer tutorage) {
        this.tutorage = tutorage;
    }

    public String getCultivationmodel() {
        return cultivationmodel;
    }

    public void setCultivationmodel(String cultivationmodel) {
        this.cultivationmodel = cultivationmodel;
    }

    public String getThesis() {
        return thesis;
    }

    public void setThesis(String thesis) {
        this.thesis = thesis;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tutorid=").append(tutorid);
        sb.append(", tutorname=").append(tutorname);
        sb.append(", researchdirection=").append(researchdirection);
        sb.append(", tutortitle=").append(tutortitle);
        sb.append(", studentrequirement=").append(studentrequirement);
        sb.append(", educationalbackground=").append(educationalbackground);
        sb.append(", tutorduty=").append(tutorduty);
        sb.append(", tutorsex=").append(tutorsex);
        sb.append(", tutorage=").append(tutorage);
        sb.append(", cultivationmodel=").append(cultivationmodel);
        sb.append(", thesis=").append(thesis);
        sb.append("]");
        return sb.toString();
    }
}