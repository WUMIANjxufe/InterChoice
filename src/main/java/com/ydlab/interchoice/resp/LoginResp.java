package com.ydlab.interchoice.resp;
public class LoginResp {
    private Integer studentId;

    private String studentName;
    private String token;
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

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

    @Override
    public String toString() {
        return "LoginResp{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", token='" + token + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}