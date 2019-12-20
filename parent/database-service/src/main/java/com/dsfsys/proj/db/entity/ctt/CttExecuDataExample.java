package com.dsfsys.proj.db.entity.ctt;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CttExecuDataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CttExecuDataExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andTableIdIsNull() {
            addCriterion("table_id is null");
            return (Criteria) this;
        }

        public Criteria andTableIdIsNotNull() {
            addCriterion("table_id is not null");
            return (Criteria) this;
        }

        public Criteria andTableIdEqualTo(Long value) {
            addCriterion("table_id =", value, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdNotEqualTo(Long value) {
            addCriterion("table_id <>", value, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdGreaterThan(Long value) {
            addCriterion("table_id >", value, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdGreaterThanOrEqualTo(Long value) {
            addCriterion("table_id >=", value, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdLessThan(Long value) {
            addCriterion("table_id <", value, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdLessThanOrEqualTo(Long value) {
            addCriterion("table_id <=", value, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdIn(List<Long> values) {
            addCriterion("table_id in", values, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdNotIn(List<Long> values) {
            addCriterion("table_id not in", values, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdBetween(Long value1, Long value2) {
            addCriterion("table_id between", value1, value2, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdNotBetween(Long value1, Long value2) {
            addCriterion("table_id not between", value1, value2, "tableId");
            return (Criteria) this;
        }

        public Criteria andRouterIdIsNull() {
            addCriterion("router_id is null");
            return (Criteria) this;
        }

        public Criteria andRouterIdIsNotNull() {
            addCriterion("router_id is not null");
            return (Criteria) this;
        }

        public Criteria andRouterIdEqualTo(String value) {
            addCriterion("router_id =", value, "routerId");
            return (Criteria) this;
        }

        public Criteria andRouterIdNotEqualTo(String value) {
            addCriterion("router_id <>", value, "routerId");
            return (Criteria) this;
        }

        public Criteria andRouterIdGreaterThan(String value) {
            addCriterion("router_id >", value, "routerId");
            return (Criteria) this;
        }

        public Criteria andRouterIdGreaterThanOrEqualTo(String value) {
            addCriterion("router_id >=", value, "routerId");
            return (Criteria) this;
        }

        public Criteria andRouterIdLessThan(String value) {
            addCriterion("router_id <", value, "routerId");
            return (Criteria) this;
        }

        public Criteria andRouterIdLessThanOrEqualTo(String value) {
            addCriterion("router_id <=", value, "routerId");
            return (Criteria) this;
        }

        public Criteria andRouterIdLike(String value) {
            addCriterion("router_id like", value, "routerId");
            return (Criteria) this;
        }

        public Criteria andRouterIdNotLike(String value) {
            addCriterion("router_id not like", value, "routerId");
            return (Criteria) this;
        }

        public Criteria andRouterIdIn(List<String> values) {
            addCriterion("router_id in", values, "routerId");
            return (Criteria) this;
        }

        public Criteria andRouterIdNotIn(List<String> values) {
            addCriterion("router_id not in", values, "routerId");
            return (Criteria) this;
        }

        public Criteria andRouterIdBetween(String value1, String value2) {
            addCriterion("router_id between", value1, value2, "routerId");
            return (Criteria) this;
        }

        public Criteria andRouterIdNotBetween(String value1, String value2) {
            addCriterion("router_id not between", value1, value2, "routerId");
            return (Criteria) this;
        }

        public Criteria andMothedNameIsNull() {
            addCriterion("mothed_name is null");
            return (Criteria) this;
        }

        public Criteria andMothedNameIsNotNull() {
            addCriterion("mothed_name is not null");
            return (Criteria) this;
        }

        public Criteria andMothedNameEqualTo(String value) {
            addCriterion("mothed_name =", value, "mothedName");
            return (Criteria) this;
        }

        public Criteria andMothedNameNotEqualTo(String value) {
            addCriterion("mothed_name <>", value, "mothedName");
            return (Criteria) this;
        }

        public Criteria andMothedNameGreaterThan(String value) {
            addCriterion("mothed_name >", value, "mothedName");
            return (Criteria) this;
        }

        public Criteria andMothedNameGreaterThanOrEqualTo(String value) {
            addCriterion("mothed_name >=", value, "mothedName");
            return (Criteria) this;
        }

        public Criteria andMothedNameLessThan(String value) {
            addCriterion("mothed_name <", value, "mothedName");
            return (Criteria) this;
        }

        public Criteria andMothedNameLessThanOrEqualTo(String value) {
            addCriterion("mothed_name <=", value, "mothedName");
            return (Criteria) this;
        }

        public Criteria andMothedNameLike(String value) {
            addCriterion("mothed_name like", value, "mothedName");
            return (Criteria) this;
        }

        public Criteria andMothedNameNotLike(String value) {
            addCriterion("mothed_name not like", value, "mothedName");
            return (Criteria) this;
        }

        public Criteria andMothedNameIn(List<String> values) {
            addCriterion("mothed_name in", values, "mothedName");
            return (Criteria) this;
        }

        public Criteria andMothedNameNotIn(List<String> values) {
            addCriterion("mothed_name not in", values, "mothedName");
            return (Criteria) this;
        }

        public Criteria andMothedNameBetween(String value1, String value2) {
            addCriterion("mothed_name between", value1, value2, "mothedName");
            return (Criteria) this;
        }

        public Criteria andMothedNameNotBetween(String value1, String value2) {
            addCriterion("mothed_name not between", value1, value2, "mothedName");
            return (Criteria) this;
        }

        public Criteria andSqlDataIsNull() {
            addCriterion("sql_data is null");
            return (Criteria) this;
        }

        public Criteria andSqlDataIsNotNull() {
            addCriterion("sql_data is not null");
            return (Criteria) this;
        }

        public Criteria andSqlDataEqualTo(String value) {
            addCriterion("sql_data =", value, "sqlData");
            return (Criteria) this;
        }

        public Criteria andSqlDataNotEqualTo(String value) {
            addCriterion("sql_data <>", value, "sqlData");
            return (Criteria) this;
        }

        public Criteria andSqlDataGreaterThan(String value) {
            addCriterion("sql_data >", value, "sqlData");
            return (Criteria) this;
        }

        public Criteria andSqlDataGreaterThanOrEqualTo(String value) {
            addCriterion("sql_data >=", value, "sqlData");
            return (Criteria) this;
        }

        public Criteria andSqlDataLessThan(String value) {
            addCriterion("sql_data <", value, "sqlData");
            return (Criteria) this;
        }

        public Criteria andSqlDataLessThanOrEqualTo(String value) {
            addCriterion("sql_data <=", value, "sqlData");
            return (Criteria) this;
        }

        public Criteria andSqlDataLike(String value) {
            addCriterion("sql_data like", value, "sqlData");
            return (Criteria) this;
        }

        public Criteria andSqlDataNotLike(String value) {
            addCriterion("sql_data not like", value, "sqlData");
            return (Criteria) this;
        }

        public Criteria andSqlDataIn(List<String> values) {
            addCriterion("sql_data in", values, "sqlData");
            return (Criteria) this;
        }

        public Criteria andSqlDataNotIn(List<String> values) {
            addCriterion("sql_data not in", values, "sqlData");
            return (Criteria) this;
        }

        public Criteria andSqlDataBetween(String value1, String value2) {
            addCriterion("sql_data between", value1, value2, "sqlData");
            return (Criteria) this;
        }

        public Criteria andSqlDataNotBetween(String value1, String value2) {
            addCriterion("sql_data not between", value1, value2, "sqlData");
            return (Criteria) this;
        }

        public Criteria andSqlIsNull() {
            addCriterion("sql is null");
            return (Criteria) this;
        }

        public Criteria andSqlIsNotNull() {
            addCriterion("sql is not null");
            return (Criteria) this;
        }

        public Criteria andSqlEqualTo(String value) {
            addCriterion("sql =", value, "sql");
            return (Criteria) this;
        }

        public Criteria andSqlNotEqualTo(String value) {
            addCriterion("sql <>", value, "sql");
            return (Criteria) this;
        }

        public Criteria andSqlGreaterThan(String value) {
            addCriterion("sql >", value, "sql");
            return (Criteria) this;
        }

        public Criteria andSqlGreaterThanOrEqualTo(String value) {
            addCriterion("sql >=", value, "sql");
            return (Criteria) this;
        }

        public Criteria andSqlLessThan(String value) {
            addCriterion("sql <", value, "sql");
            return (Criteria) this;
        }

        public Criteria andSqlLessThanOrEqualTo(String value) {
            addCriterion("sql <=", value, "sql");
            return (Criteria) this;
        }

        public Criteria andSqlLike(String value) {
            addCriterion("sql like", value, "sql");
            return (Criteria) this;
        }

        public Criteria andSqlNotLike(String value) {
            addCriterion("sql not like", value, "sql");
            return (Criteria) this;
        }

        public Criteria andSqlIn(List<String> values) {
            addCriterion("sql in", values, "sql");
            return (Criteria) this;
        }

        public Criteria andSqlNotIn(List<String> values) {
            addCriterion("sql not in", values, "sql");
            return (Criteria) this;
        }

        public Criteria andSqlBetween(String value1, String value2) {
            addCriterion("sql between", value1, value2, "sql");
            return (Criteria) this;
        }

        public Criteria andSqlNotBetween(String value1, String value2) {
            addCriterion("sql not between", value1, value2, "sql");
            return (Criteria) this;
        }

        public Criteria andTimeStampIsNull() {
            addCriterion("time_stamp is null");
            return (Criteria) this;
        }

        public Criteria andTimeStampIsNotNull() {
            addCriterion("time_stamp is not null");
            return (Criteria) this;
        }

        public Criteria andTimeStampEqualTo(String value) {
            addCriterion("time_stamp =", value, "timeStamp");
            return (Criteria) this;
        }

        public Criteria andTimeStampNotEqualTo(String value) {
            addCriterion("time_stamp <>", value, "timeStamp");
            return (Criteria) this;
        }

        public Criteria andTimeStampGreaterThan(String value) {
            addCriterion("time_stamp >", value, "timeStamp");
            return (Criteria) this;
        }

        public Criteria andTimeStampGreaterThanOrEqualTo(String value) {
            addCriterion("time_stamp >=", value, "timeStamp");
            return (Criteria) this;
        }

        public Criteria andTimeStampLessThan(String value) {
            addCriterion("time_stamp <", value, "timeStamp");
            return (Criteria) this;
        }

        public Criteria andTimeStampLessThanOrEqualTo(String value) {
            addCriterion("time_stamp <=", value, "timeStamp");
            return (Criteria) this;
        }

        public Criteria andTimeStampLike(String value) {
            addCriterion("time_stamp like", value, "timeStamp");
            return (Criteria) this;
        }

        public Criteria andTimeStampNotLike(String value) {
            addCriterion("time_stamp not like", value, "timeStamp");
            return (Criteria) this;
        }

        public Criteria andTimeStampIn(List<String> values) {
            addCriterion("time_stamp in", values, "timeStamp");
            return (Criteria) this;
        }

        public Criteria andTimeStampNotIn(List<String> values) {
            addCriterion("time_stamp not in", values, "timeStamp");
            return (Criteria) this;
        }

        public Criteria andTimeStampBetween(String value1, String value2) {
            addCriterion("time_stamp between", value1, value2, "timeStamp");
            return (Criteria) this;
        }

        public Criteria andTimeStampNotBetween(String value1, String value2) {
            addCriterion("time_stamp not between", value1, value2, "timeStamp");
            return (Criteria) this;
        }

        public Criteria andCttSqlIsNull() {
            addCriterion("ctt_sql is null");
            return (Criteria) this;
        }

        public Criteria andCttSqlIsNotNull() {
            addCriterion("ctt_sql is not null");
            return (Criteria) this;
        }

        public Criteria andCttSqlEqualTo(String value) {
            addCriterion("ctt_sql =", value, "cttSql");
            return (Criteria) this;
        }

        public Criteria andCttSqlNotEqualTo(String value) {
            addCriterion("ctt_sql <>", value, "cttSql");
            return (Criteria) this;
        }

        public Criteria andCttSqlGreaterThan(String value) {
            addCriterion("ctt_sql >", value, "cttSql");
            return (Criteria) this;
        }

        public Criteria andCttSqlGreaterThanOrEqualTo(String value) {
            addCriterion("ctt_sql >=", value, "cttSql");
            return (Criteria) this;
        }

        public Criteria andCttSqlLessThan(String value) {
            addCriterion("ctt_sql <", value, "cttSql");
            return (Criteria) this;
        }

        public Criteria andCttSqlLessThanOrEqualTo(String value) {
            addCriterion("ctt_sql <=", value, "cttSql");
            return (Criteria) this;
        }

        public Criteria andCttSqlLike(String value) {
            addCriterion("ctt_sql like", value, "cttSql");
            return (Criteria) this;
        }

        public Criteria andCttSqlNotLike(String value) {
            addCriterion("ctt_sql not like", value, "cttSql");
            return (Criteria) this;
        }

        public Criteria andCttSqlIn(List<String> values) {
            addCriterion("ctt_sql in", values, "cttSql");
            return (Criteria) this;
        }

        public Criteria andCttSqlNotIn(List<String> values) {
            addCriterion("ctt_sql not in", values, "cttSql");
            return (Criteria) this;
        }

        public Criteria andCttSqlBetween(String value1, String value2) {
            addCriterion("ctt_sql between", value1, value2, "cttSql");
            return (Criteria) this;
        }

        public Criteria andCttSqlNotBetween(String value1, String value2) {
            addCriterion("ctt_sql not between", value1, value2, "cttSql");
            return (Criteria) this;
        }

        public Criteria andUniKeyIsNull() {
            addCriterion("uni_key is null");
            return (Criteria) this;
        }

        public Criteria andUniKeyIsNotNull() {
            addCriterion("uni_key is not null");
            return (Criteria) this;
        }

        public Criteria andUniKeyEqualTo(String value) {
            addCriterion("uni_key =", value, "uniKey");
            return (Criteria) this;
        }

        public Criteria andUniKeyNotEqualTo(String value) {
            addCriterion("uni_key <>", value, "uniKey");
            return (Criteria) this;
        }

        public Criteria andUniKeyGreaterThan(String value) {
            addCriterion("uni_key >", value, "uniKey");
            return (Criteria) this;
        }

        public Criteria andUniKeyGreaterThanOrEqualTo(String value) {
            addCriterion("uni_key >=", value, "uniKey");
            return (Criteria) this;
        }

        public Criteria andUniKeyLessThan(String value) {
            addCriterion("uni_key <", value, "uniKey");
            return (Criteria) this;
        }

        public Criteria andUniKeyLessThanOrEqualTo(String value) {
            addCriterion("uni_key <=", value, "uniKey");
            return (Criteria) this;
        }

        public Criteria andUniKeyLike(String value) {
            addCriterion("uni_key like", value, "uniKey");
            return (Criteria) this;
        }

        public Criteria andUniKeyNotLike(String value) {
            addCriterion("uni_key not like", value, "uniKey");
            return (Criteria) this;
        }

        public Criteria andUniKeyIn(List<String> values) {
            addCriterion("uni_key in", values, "uniKey");
            return (Criteria) this;
        }

        public Criteria andUniKeyNotIn(List<String> values) {
            addCriterion("uni_key not in", values, "uniKey");
            return (Criteria) this;
        }

        public Criteria andUniKeyBetween(String value1, String value2) {
            addCriterion("uni_key between", value1, value2, "uniKey");
            return (Criteria) this;
        }

        public Criteria andUniKeyNotBetween(String value1, String value2) {
            addCriterion("uni_key not between", value1, value2, "uniKey");
            return (Criteria) this;
        }

        public Criteria andExecuteMethodIsNull() {
            addCriterion("execute_method is null");
            return (Criteria) this;
        }

        public Criteria andExecuteMethodIsNotNull() {
            addCriterion("execute_method is not null");
            return (Criteria) this;
        }

        public Criteria andExecuteMethodEqualTo(String value) {
            addCriterion("execute_method =", value, "executeMethod");
            return (Criteria) this;
        }

        public Criteria andExecuteMethodNotEqualTo(String value) {
            addCriterion("execute_method <>", value, "executeMethod");
            return (Criteria) this;
        }

        public Criteria andExecuteMethodGreaterThan(String value) {
            addCriterion("execute_method >", value, "executeMethod");
            return (Criteria) this;
        }

        public Criteria andExecuteMethodGreaterThanOrEqualTo(String value) {
            addCriterion("execute_method >=", value, "executeMethod");
            return (Criteria) this;
        }

        public Criteria andExecuteMethodLessThan(String value) {
            addCriterion("execute_method <", value, "executeMethod");
            return (Criteria) this;
        }

        public Criteria andExecuteMethodLessThanOrEqualTo(String value) {
            addCriterion("execute_method <=", value, "executeMethod");
            return (Criteria) this;
        }

        public Criteria andExecuteMethodLike(String value) {
            addCriterion("execute_method like", value, "executeMethod");
            return (Criteria) this;
        }

        public Criteria andExecuteMethodNotLike(String value) {
            addCriterion("execute_method not like", value, "executeMethod");
            return (Criteria) this;
        }

        public Criteria andExecuteMethodIn(List<String> values) {
            addCriterion("execute_method in", values, "executeMethod");
            return (Criteria) this;
        }

        public Criteria andExecuteMethodNotIn(List<String> values) {
            addCriterion("execute_method not in", values, "executeMethod");
            return (Criteria) this;
        }

        public Criteria andExecuteMethodBetween(String value1, String value2) {
            addCriterion("execute_method between", value1, value2, "executeMethod");
            return (Criteria) this;
        }

        public Criteria andExecuteMethodNotBetween(String value1, String value2) {
            addCriterion("execute_method not between", value1, value2, "executeMethod");
            return (Criteria) this;
        }

        public Criteria andExecuteDataIsNull() {
            addCriterion("execute_data is null");
            return (Criteria) this;
        }

        public Criteria andExecuteDataIsNotNull() {
            addCriterion("execute_data is not null");
            return (Criteria) this;
        }

        public Criteria andExecuteDataEqualTo(String value) {
            addCriterion("execute_data =", value, "executeData");
            return (Criteria) this;
        }

        public Criteria andExecuteDataNotEqualTo(String value) {
            addCriterion("execute_data <>", value, "executeData");
            return (Criteria) this;
        }

        public Criteria andExecuteDataGreaterThan(String value) {
            addCriterion("execute_data >", value, "executeData");
            return (Criteria) this;
        }

        public Criteria andExecuteDataGreaterThanOrEqualTo(String value) {
            addCriterion("execute_data >=", value, "executeData");
            return (Criteria) this;
        }

        public Criteria andExecuteDataLessThan(String value) {
            addCriterion("execute_data <", value, "executeData");
            return (Criteria) this;
        }

        public Criteria andExecuteDataLessThanOrEqualTo(String value) {
            addCriterion("execute_data <=", value, "executeData");
            return (Criteria) this;
        }

        public Criteria andExecuteDataLike(String value) {
            addCriterion("execute_data like", value, "executeData");
            return (Criteria) this;
        }

        public Criteria andExecuteDataNotLike(String value) {
            addCriterion("execute_data not like", value, "executeData");
            return (Criteria) this;
        }

        public Criteria andExecuteDataIn(List<String> values) {
            addCriterion("execute_data in", values, "executeData");
            return (Criteria) this;
        }

        public Criteria andExecuteDataNotIn(List<String> values) {
            addCriterion("execute_data not in", values, "executeData");
            return (Criteria) this;
        }

        public Criteria andExecuteDataBetween(String value1, String value2) {
            addCriterion("execute_data between", value1, value2, "executeData");
            return (Criteria) this;
        }

        public Criteria andExecuteDataNotBetween(String value1, String value2) {
            addCriterion("execute_data not between", value1, value2, "executeData");
            return (Criteria) this;
        }

        public Criteria andExecuteTimeIsNull() {
            addCriterion("execute_time is null");
            return (Criteria) this;
        }

        public Criteria andExecuteTimeIsNotNull() {
            addCriterion("execute_time is not null");
            return (Criteria) this;
        }

        public Criteria andExecuteTimeEqualTo(String value) {
            addCriterion("execute_time =", value, "executeTime");
            return (Criteria) this;
        }

        public Criteria andExecuteTimeNotEqualTo(String value) {
            addCriterion("execute_time <>", value, "executeTime");
            return (Criteria) this;
        }

        public Criteria andExecuteTimeGreaterThan(String value) {
            addCriterion("execute_time >", value, "executeTime");
            return (Criteria) this;
        }

        public Criteria andExecuteTimeGreaterThanOrEqualTo(String value) {
            addCriterion("execute_time >=", value, "executeTime");
            return (Criteria) this;
        }

        public Criteria andExecuteTimeLessThan(String value) {
            addCriterion("execute_time <", value, "executeTime");
            return (Criteria) this;
        }

        public Criteria andExecuteTimeLessThanOrEqualTo(String value) {
            addCriterion("execute_time <=", value, "executeTime");
            return (Criteria) this;
        }

        public Criteria andExecuteTimeLike(String value) {
            addCriterion("execute_time like", value, "executeTime");
            return (Criteria) this;
        }

        public Criteria andExecuteTimeNotLike(String value) {
            addCriterion("execute_time not like", value, "executeTime");
            return (Criteria) this;
        }

        public Criteria andExecuteTimeIn(List<String> values) {
            addCriterion("execute_time in", values, "executeTime");
            return (Criteria) this;
        }

        public Criteria andExecuteTimeNotIn(List<String> values) {
            addCriterion("execute_time not in", values, "executeTime");
            return (Criteria) this;
        }

        public Criteria andExecuteTimeBetween(String value1, String value2) {
            addCriterion("execute_time between", value1, value2, "executeTime");
            return (Criteria) this;
        }

        public Criteria andExecuteTimeNotBetween(String value1, String value2) {
            addCriterion("execute_time not between", value1, value2, "executeTime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeIsNull() {
            addCriterion("create_datetime is null");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeIsNotNull() {
            addCriterion("create_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeEqualTo(Date value) {
            addCriterion("create_datetime =", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeNotEqualTo(Date value) {
            addCriterion("create_datetime <>", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeGreaterThan(Date value) {
            addCriterion("create_datetime >", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_datetime >=", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeLessThan(Date value) {
            addCriterion("create_datetime <", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("create_datetime <=", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeIn(List<Date> values) {
            addCriterion("create_datetime in", values, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeNotIn(List<Date> values) {
            addCriterion("create_datetime not in", values, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeBetween(Date value1, Date value2) {
            addCriterion("create_datetime between", value1, value2, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("create_datetime not between", value1, value2, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andLastUpdDatetimeIsNull() {
            addCriterion("last_upd_datetime is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdDatetimeIsNotNull() {
            addCriterion("last_upd_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdDatetimeEqualTo(Date value) {
            addCriterion("last_upd_datetime =", value, "lastUpdDatetime");
            return (Criteria) this;
        }

        public Criteria andLastUpdDatetimeNotEqualTo(Date value) {
            addCriterion("last_upd_datetime <>", value, "lastUpdDatetime");
            return (Criteria) this;
        }

        public Criteria andLastUpdDatetimeGreaterThan(Date value) {
            addCriterion("last_upd_datetime >", value, "lastUpdDatetime");
            return (Criteria) this;
        }

        public Criteria andLastUpdDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_upd_datetime >=", value, "lastUpdDatetime");
            return (Criteria) this;
        }

        public Criteria andLastUpdDatetimeLessThan(Date value) {
            addCriterion("last_upd_datetime <", value, "lastUpdDatetime");
            return (Criteria) this;
        }

        public Criteria andLastUpdDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("last_upd_datetime <=", value, "lastUpdDatetime");
            return (Criteria) this;
        }

        public Criteria andLastUpdDatetimeIn(List<Date> values) {
            addCriterion("last_upd_datetime in", values, "lastUpdDatetime");
            return (Criteria) this;
        }

        public Criteria andLastUpdDatetimeNotIn(List<Date> values) {
            addCriterion("last_upd_datetime not in", values, "lastUpdDatetime");
            return (Criteria) this;
        }

        public Criteria andLastUpdDatetimeBetween(Date value1, Date value2) {
            addCriterion("last_upd_datetime between", value1, value2, "lastUpdDatetime");
            return (Criteria) this;
        }

        public Criteria andLastUpdDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("last_upd_datetime not between", value1, value2, "lastUpdDatetime");
            return (Criteria) this;
        }

        public Criteria andCttDataIsNull() {
            addCriterion("ctt_data is null");
            return (Criteria) this;
        }

        public Criteria andCttDataIsNotNull() {
            addCriterion("ctt_data is not null");
            return (Criteria) this;
        }

        public Criteria andCttDataEqualTo(String value) {
            addCriterion("ctt_data =", value, "cttData");
            return (Criteria) this;
        }

        public Criteria andCttDataNotEqualTo(String value) {
            addCriterion("ctt_data <>", value, "cttData");
            return (Criteria) this;
        }

        public Criteria andCttDataGreaterThan(String value) {
            addCriterion("ctt_data >", value, "cttData");
            return (Criteria) this;
        }

        public Criteria andCttDataGreaterThanOrEqualTo(String value) {
            addCriterion("ctt_data >=", value, "cttData");
            return (Criteria) this;
        }

        public Criteria andCttDataLessThan(String value) {
            addCriterion("ctt_data <", value, "cttData");
            return (Criteria) this;
        }

        public Criteria andCttDataLessThanOrEqualTo(String value) {
            addCriterion("ctt_data <=", value, "cttData");
            return (Criteria) this;
        }

        public Criteria andCttDataLike(String value) {
            addCriterion("ctt_data like", value, "cttData");
            return (Criteria) this;
        }

        public Criteria andCttDataNotLike(String value) {
            addCriterion("ctt_data not like", value, "cttData");
            return (Criteria) this;
        }

        public Criteria andCttDataIn(List<String> values) {
            addCriterion("ctt_data in", values, "cttData");
            return (Criteria) this;
        }

        public Criteria andCttDataNotIn(List<String> values) {
            addCriterion("ctt_data not in", values, "cttData");
            return (Criteria) this;
        }

        public Criteria andCttDataBetween(String value1, String value2) {
            addCriterion("ctt_data between", value1, value2, "cttData");
            return (Criteria) this;
        }

        public Criteria andCttDataNotBetween(String value1, String value2) {
            addCriterion("ctt_data not between", value1, value2, "cttData");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}