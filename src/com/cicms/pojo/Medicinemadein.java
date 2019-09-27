package com.cicms.pojo;

public class Medicinemadein {
    private Integer medicinemadeinid;

    private String medicinemadeinname;

    public Integer getMedicinemadeinid() {
        return medicinemadeinid;
    }

    public void setMedicinemadeinid(Integer medicinemadeinid) {
        this.medicinemadeinid = medicinemadeinid;
    }

    public String getMedicinemadeinname() {
        return medicinemadeinname;
    }

    public void setMedicinemadeinname(String medicinemadeinname) {
        this.medicinemadeinname = medicinemadeinname == null ? null : medicinemadeinname.trim();
    }
}