package com.dsfsys.pub.factory;

import com.dsfsys.pub.emmu.LoggerEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DsfLoggerFactory {

    public static Logger SERURITYLOGGER;
    public static Logger OPERLOGGER;
    public static Logger COMMONLOGGER;
    public static Logger DEBUGLOGGER;
    public static Logger DBLOGGER;
    static{
        SERURITYLOGGER = LoggerFactory.getLogger(LoggerEnum.SERURITY.getName());
        OPERLOGGER = LoggerFactory.getLogger(LoggerEnum.OPER.getName());
        COMMONLOGGER = LoggerFactory.getLogger(LoggerEnum.COMMON.getName());
        DEBUGLOGGER = LoggerFactory.getLogger(LoggerEnum.DEBUG.getName());
        DBLOGGER = LoggerFactory.getLogger(LoggerEnum.DB.getName());
    }


    public static Logger getSecurityLog(){
        return SERURITYLOGGER;
    }

    public static Logger getOperLog(){
        return OPERLOGGER;
    }

    public static Logger getCommonLog(){
        return COMMONLOGGER;
    }

    public static Logger getDebugLog(){
        return DEBUGLOGGER;
    }

    public static Logger getDbsLog(){
        return DBLOGGER;
    }

    public static void setInvokeLog(String func,String accdno,String userid,String reqJson){
        SERURITYLOGGER.info("请求[+"+func+"+]"+"+++++++++++++++拦截上送报文+++++"+accdno+"+++++"+userid+"+++++请求报文: "+reqJson);
        OPERLOGGER.info("请求[+"+func+"+]"+"+++++++++++++++拦截上送报文+++++"+accdno+"+++++"+userid+"+++++请求报文: "+reqJson);
    }

    public static void setResponseLog(String func,String accdno,String userid,String reqJson){
        SERURITYLOGGER.info("["+func+"]返回"+"+++++++++++++++拦截返回报文+++++"+accdno+"+++++"+userid+"+++++请求报文: "+reqJson);
        OPERLOGGER.info("["+func+"]返回"+"+++++++++++++++拦截返回回文+++++"+accdno+"+++++"+userid+"+++++请求报文: "+reqJson);
    }
}
