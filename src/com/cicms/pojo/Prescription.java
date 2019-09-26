package com.cicms.pojo;

public class Prescription {
    private Integer id;

    private String prescriptionno;

    private Integer takenum;

    private Double medicineprice;

    private String medicineno;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPrescriptionno() {
        return prescriptionno;
    }

    public void setPrescriptionno(String prescriptionno) {
        this.prescriptionno = prescriptionno == null ? null : prescriptionno.trim();
    }

    public Integer getTakenum() {
        return takenum;
    }

    public void setTakenum(Integer takenum) {
        this.takenum = takenum;
    }

    public Double getMedicineprice() {
        return medicineprice;
    }

    public void setMedicineprice(Double medicineprice) {
        this.medicineprice = medicineprice;
    }

    public String getMedicineno() {
        return medicineno;
    }

    public void setMedicineno(String medicineno) {
        this.medicineno = medicineno == null ? null : medicineno.trim();
    }
}