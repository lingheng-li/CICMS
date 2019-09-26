package com.cicms.pojo;

public class Family {
    private String homeno;

    private String homename;

    private Integer homephone;

    private String homeaddress;

    private Integer doornum;

    private String information;

    private String attention;

    private String homeremarks;

    public String getHomeno() {
        return homeno;
    }

    public void setHomeno(String homeno) {
        this.homeno = homeno == null ? null : homeno.trim();
    }

    public String getHomename() {
        return homename;
    }

    public void setHomename(String homename) {
        this.homename = homename == null ? null : homename.trim();
    }

    public Integer getHomephone() {
        return homephone;
    }

    public void setHomephone(Integer homephone) {
        this.homephone = homephone;
    }

    public String getHomeaddress() {
        return homeaddress;
    }

    public void setHomeaddress(String homeaddress) {
        this.homeaddress = homeaddress == null ? null : homeaddress.trim();
    }

    public Integer getDoornum() {
        return doornum;
    }

    public void setDoornum(Integer doornum) {
        this.doornum = doornum;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information == null ? null : information.trim();
    }

    public String getAttention() {
        return attention;
    }

    public void setAttention(String attention) {
        this.attention = attention == null ? null : attention.trim();
    }

    public String getHomeremarks() {
        return homeremarks;
    }

    public void setHomeremarks(String homeremarks) {
        this.homeremarks = homeremarks == null ? null : homeremarks.trim();
    }
}