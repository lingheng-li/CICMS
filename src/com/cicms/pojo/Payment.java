package com.cicms.pojo;

import java.util.Date;

public class Payment {
    private String payno;

    private String patientno;

    private String prescriptionno;

    private String username;

    private Date paytime;

    private Integer paystatus;

    private String payremarks;

    private Double money;

    public String getPayno() {
        return payno;
    }

    public void setPayno(String payno) {
        this.payno = payno == null ? null : payno.trim();
    }

    public String getPatientno() {
        return patientno;
    }

    public void setPatientno(String patientno) {
        this.patientno = patientno == null ? null : patientno.trim();
    }

    public String getPrescriptionno() {
        return prescriptionno;
    }

    public void setPrescriptionno(String prescriptionno) {
        this.prescriptionno = prescriptionno == null ? null : prescriptionno.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Date getPaytime() {
        return paytime;
    }

    public void setPaytime(Date paytime) {
        this.paytime = paytime;
    }

    public Integer getPaystatus() {
        return paystatus;
    }

    public void setPaystatus(Integer paystatus) {
        this.paystatus = paystatus;
    }

    public String getPayremarks() {
        return payremarks;
    }

    public void setPayremarks(String payremarks) {
        this.payremarks = payremarks == null ? null : payremarks.trim();
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }
}