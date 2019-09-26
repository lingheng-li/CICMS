package com.cicms.pojo;

public class Medicine {
    private String medicineno;

    private String medicinename;

    private String medicinespec;

    private String medicinemadein;

    private Double medicineinprice;

    private Double medicineprice;

    private Integer medicinenum;

    private String medicinetype;

    private String medicineremarks;

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

    public String getMedicinespec() {
        return medicinespec;
    }

    public void setMedicinespec(String medicinespec) {
        this.medicinespec = medicinespec == null ? null : medicinespec.trim();
    }

    public String getMedicinemadein() {
        return medicinemadein;
    }

    public void setMedicinemadein(String medicinemadein) {
        this.medicinemadein = medicinemadein == null ? null : medicinemadein.trim();
    }

    public Double getMedicineinprice() {
        return medicineinprice;
    }

    public void setMedicineinprice(Double medicineinprice) {
        this.medicineinprice = medicineinprice;
    }

    public Double getMedicineprice() {
        return medicineprice;
    }

    public void setMedicineprice(Double medicineprice) {
        this.medicineprice = medicineprice;
    }

    public Integer getMedicinenum() {
        return medicinenum;
    }

    public void setMedicinenum(Integer medicinenum) {
        this.medicinenum = medicinenum;
    }

    public String getMedicinetype() {
        return medicinetype;
    }

    public void setMedicinetype(String medicinetype) {
        this.medicinetype = medicinetype == null ? null : medicinetype.trim();
    }

    public String getMedicineremarks() {
        return medicineremarks;
    }

    public void setMedicineremarks(String medicineremarks) {
        this.medicineremarks = medicineremarks == null ? null : medicineremarks.trim();
    }
}