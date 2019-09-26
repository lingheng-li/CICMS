package com.cicms.pojo;

import java.util.Date;

public class Patient {
    private String patientno;

    private String patientname;

    private String patinentsex;

    private String patientbirthday;

    private Integer patientphone;

    private String patientaddress;

    private String patientremarks;

    private Date patienttime;

    public String getPatientno() {
        return patientno;
    }

    public void setPatientno(String patientno) {
        this.patientno = patientno == null ? null : patientno.trim();
    }

    public String getPatientname() {
        return patientname;
    }

    public void setPatientname(String patientname) {
        this.patientname = patientname == null ? null : patientname.trim();
    }

    public String getPatinentsex() {
        return patinentsex;
    }

    public void setPatinentsex(String patinentsex) {
        this.patinentsex = patinentsex == null ? null : patinentsex.trim();
    }

    public String getPatientbirthday() {
        return patientbirthday;
    }

    public void setPatientbirthday(String patientbirthday) {
        this.patientbirthday = patientbirthday == null ? null : patientbirthday.trim();
    }

    public Integer getPatientphone() {
        return patientphone;
    }

    public void setPatientphone(Integer patientphone) {
        this.patientphone = patientphone;
    }

    public String getPatientaddress() {
        return patientaddress;
    }

    public void setPatientaddress(String patientaddress) {
        this.patientaddress = patientaddress == null ? null : patientaddress.trim();
    }

    public String getPatientremarks() {
        return patientremarks;
    }

    public void setPatientremarks(String patientremarks) {
        this.patientremarks = patientremarks == null ? null : patientremarks.trim();
    }

    public Date getPatienttime() {
        return patienttime;
    }

    public void setPatienttime(Date patienttime) {
        this.patienttime = patienttime;
    }
}