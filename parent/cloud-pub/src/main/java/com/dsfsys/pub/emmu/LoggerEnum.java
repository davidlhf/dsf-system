package com.dsfsys.pub.emmu;

public enum LoggerEnum {
    SERURITY("serurity"),OPER("oper"),COMMON("common"),DEBUG("debug"),DB("db");

    private final String name;

    LoggerEnum(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

}
