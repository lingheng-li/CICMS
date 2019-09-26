package com.cicms.pojo;

public class Log {
    private Integer logid;

    private String medicineno;

    private String medicinename;

    private String logremark;

    public Integer getLogid() {
        return logid;
    }

    public void setLogid(Integer logid) {
        this.logid = logid;
    }

    public String getMedicineno() {
        return medicineno;
    }

    public void setMedicineno(String medicineno) {
        this.medicineno = medicineno == null ? null : medicineno.trim();
    }

    public String getMedicinename() {
        return medicinename;
    }

    public void setMedicinename(String medicinename) {
        this.medicinename = medicinename == null ? null : medicinename.trim();
    }

    public String getLogremark() {
        return logremark;
    }

    public void setLogremark(String logremark) {
        this.logremark = logremark == null ? null : logremark.trim();
    }
}