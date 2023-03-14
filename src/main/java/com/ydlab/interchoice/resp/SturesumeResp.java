package com.ydlab.interchoice.resp;

public class SturesumeResp<T> {
    private String name;

    private String status;

    private String rank;

    private String cet4;

    private String cet6;

    private String interestedDirection;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getCet4() {
        return cet4;
    }

    public void setCet4(String cet4) {
        this.cet4 = cet4;
    }

    public String getCet6() {
        return cet6;
    }

    public void setCet6(String cet6) {
        this.cet6 = cet6;
    }

    public String getInterestedDirection() {
        return interestedDirection;
    }

    public void setInterestedDirection(String interestedDirection) {
        this.interestedDirection = interestedDirection;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", name=").append(name);
        sb.append(", status=").append(status);
        sb.append(", rank=").append(rank);
        sb.append(", cet4=").append(cet4);
        sb.append(", cet6=").append(cet6);
        sb.append(", interestedDirection=").append(interestedDirection);
        sb.append("]");
        return sb.toString();
    }
}