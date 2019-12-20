package com.dsfsys.proj.db.entity.usercenter;

import java.util.Date;

public class UserInfo extends UserInfoKey {
    private String userName;

    private String psswd;

    private String aliace;

    private Integer gender;

    private String address;

    private String phone;

    private String idCode;

    private Integer idType;

    private String email;

    private Date birth;

    private String lastUpdateUsrid;

    private Date lastUpdateDate;

    private Date createDate;

    private String createUsrid;

    private Long version;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPsswd() {
        return psswd;
    }

    public void setPsswd(String psswd) {
        this.psswd = psswd;
    }

    public String getAliace() {
        return aliace;
    }

    public void setAliace(String aliace) {
        this.aliace = aliace;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIdCode() {
        return idCode;
    }

    public void setIdCode(String idCode) {
        this.idCode = idCode;
    }

    public Integer getIdType() {
        return idType;
    }

    public void setIdType(Integer idType) {
        this.idType = idType;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getLastUpdateUsrid() {
        return lastUpdateUsrid;
    }

    public void setLastUpdateUsrid(String lastUpdateUsrid) {
        this.lastUpdateUsrid = lastUpdateUsrid;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCreateUsrid() {
        return createUsrid;
    }

    public void setCreateUsrid(String createUsrid) {
        this.createUsrid = createUsrid;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }
}