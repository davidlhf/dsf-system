package com.dsfsys.pub.utils;

import com.dsfsys.common.constant.DateFormaterConstant;
import com.dsfsys.pub.exception.ConcrrentException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StrConvertUtil {

    /**
     * str to int
     * @param str
     * @return
     */
    public static Integer str2Int(String str) throws ConcrrentException {
        if(StringUtil.isBlank(str)){
            return null;
        }
        try {
            return Integer.valueOf(str);
        } catch (NumberFormatException e) {
            throw new ConcrrentException("0002",e.getMessage(),"StrConvertUtil.str2Int");
        }
    }

    /**
     * str to short
     * @param str
     * @return
     */
    public static Short str2Short(String str) throws ConcrrentException {
        if(StringUtil.isBlank(str)){
            return null;
        }
        try {
            return Short.valueOf(str);
        } catch (NumberFormatException e) {
            throw new ConcrrentException("0002",e.getMessage(),"StrConvertUtil.str2Short");
        }
    }

    /**
     * str to Long
     * @param str
     * @return
     */
    public static Long str2Long(String str) throws ConcrrentException {
        if(StringUtil.isBlank(str)){
            return null;
        }
        try {
            return Long.valueOf(str);
        } catch (NumberFormatException e) {
            throw new ConcrrentException("0002",e.getMessage(),"StrConvertUtil.str2Long");
        }
    }

    /**
     * str to Date
     * @param str
     * @return
     */
    public static Date str2Date(String str) throws ConcrrentException {
        if(StringUtil.isBlank(str)){
            return null;
        }
        try {
            SimpleDateFormat simpleDateFormat = null;
            if(str.contains("-")){
                simpleDateFormat = new SimpleDateFormat(DateFormaterConstant.DATE_PARTTERN_yyyyMMdd_DISPLAY);
            }else{
                simpleDateFormat = new SimpleDateFormat(DateFormaterConstant.DATE_PARTTERN_yyyyMMdd);
            }
            return simpleDateFormat.parse(str);
        } catch (ParseException e) {
            throw new ConcrrentException("0002",e.getMessage(),"StrConvertUtil.str2Date");
        }
    }

    /**
     * str to time
     * @param  str
     * @return Date
     */
    public static Date str2Time(String str) throws ConcrrentException {
        if(StringUtil.isBlank(str)){
            return null;
        }
        try {
            SimpleDateFormat simpleDateFormat = null;
            if(str.contains(":")){
                simpleDateFormat = new SimpleDateFormat(DateFormaterConstant.DATE_PARTTERN_HHmmss_DISPLAY);
            }else{
                simpleDateFormat = new SimpleDateFormat(DateFormaterConstant.DATE_PARTTERN_HHmmss);
            }
            return simpleDateFormat.parse(str);
        } catch (ParseException e) {
            throw new ConcrrentException("0002",e.getMessage(),"StrConvertUtil.str2Time");
        }
    }
}
