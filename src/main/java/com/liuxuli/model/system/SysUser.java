package com.liuxuli.model.system;

public class SysUser {
    private Long userid;

    private String name;

    private String gender;

    private String polistatu;

    private String description;

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getPolistatu() {
        return polistatu;
    }

    public void setPolistatu(String polistatu) {
        this.polistatu = polistatu == null ? null : polistatu.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}