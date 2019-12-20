package com.dsfsys.proj.db.entity.ctt;

import java.util.Date;

public class CttExecuData extends CttExecuDataKey {
    private String mothedName;

    private String sqlData;

    private String sql;

    private String timeStamp;

    private String cttSql;

    private String uniKey;

    private String executeMethod;

    private String executeData;

    private String executeTime;

    private Date createDatetime;

    private Date lastUpdDatetime;

    private String cttData;

    public String getMothedName() {
        return mothedName;
    }

    public void setMothedName(String mothedName) {
        this.mothedName = mothedName;
    }

    public String getSqlData() {
        return sqlData;
    }

    public void setSqlData(String sqlData) {
        this.sqlData = sqlData;
    }

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getCttSql() {
        return cttSql;
    }

    public void setCttSql(String cttSql) {
        this.cttSql = cttSql;
    }

    public String getUniKey() {
        return uniKey;
    }

    public void setUniKey(String uniKey) {
        this.uniKey = uniKey;
    }

    public String getExecuteMethod() {
        return executeMethod;
    }

    public void setExecuteMethod(String executeMethod) {
        this.executeMethod = executeMethod;
    }

    public String getExecuteData() {
        return executeData;
    }

    public void setExecuteData(String executeData) {
        this.executeData = executeData;
    }

    public String getExecuteTime() {
        return executeTime;
    }

    public void setExecuteTime(String executeTime) {
        this.executeTime = executeTime;
    }

    public Date getCreateDatetime() {
        return createDatetime;
    }

    public void setCreateDatetime(Date createDatetime) {
        this.createDatetime = createDatetime;
    }

    public Date getLastUpdDatetime() {
        return lastUpdDatetime;
    }

    public void setLastUpdDatetime(Date lastUpdDatetime) {
        this.lastUpdDatetime = lastUpdDatetime;
    }

    public String getCttData() {
        return cttData;
    }

    public void setCttData(String cttData) {
        this.cttData = cttData;
    }
}