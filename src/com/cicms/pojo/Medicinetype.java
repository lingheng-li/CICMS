package com.cicms.pojo;

public class Medicinetype {
    private Integer medicinetypeid;

    private String medicinetypename;

    public Integer getMedicinetypeid() {
        return medicinetypeid;
    }

    public void setMedicinetypeid(Integer medicinetypeid) {
        this.medicinetypeid = medicinetypeid;
    }

    public String getMedicinetypename() {
        return medicinetypename;
    }

    public void setMedicinetypename(String medicinetypename) {
        this.medicinetypename = medicinetypename == null ? null : medicinetypename.trim();
    }
}