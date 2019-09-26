package com.cicms.pojo;

public class TakeMedicine {
    private String takeno;

    private String payno;

    private Integer taketype;

    private String prescriptionno;

    public String getTakeno() {
        return takeno;
    }

    public void setTakeno(String takeno) {
        this.takeno = takeno == null ? null : takeno.trim();
    }

    public String getPayno() {
        return payno;
    }

    public void setPayno(String payno) {
        this.payno = payno == null ? null : payno.trim();
    }

    public Integer getTaketype() {
        return taketype;
    }

    public void setTaketype(Integer taketype) {
        this.taketype = taketype;
    }

    public String getPrescriptionno() {
        return prescriptionno;
    }

    public void setPrescriptionno(String prescriptionno) {
        this.prescriptionno = prescriptionno == null ? null : prescriptionno.trim();
    }
}