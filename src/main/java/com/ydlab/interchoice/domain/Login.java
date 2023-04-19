package com.ydlab.interchoice.domain;

public class Login {
    private Integer studentId;

    private String studentName;

    private String password;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("studentId=").append(studentId);
        sb.append(", studentName=").append(studentName);
        sb.append(", password=").append(password);
        sb.append("]");
        return sb.toString();
    }
}