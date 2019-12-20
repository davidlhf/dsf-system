package com.dsfsys.base.data;

import com.dsfsys.pub.exception.ConcrrentException;
import com.dsfsys.pub.factory.DsfLoggerFactory;
import com.dsfsys.pub.utils.StrConvertUtil;
import com.dsfsys.pub.utils.StringUtil;
import com.dsfsys.validateanno.CheckFor;
import com.dsfsys.validateanno.DataConvert;
import com.dsfsys.validateanno.InputField;

import java.lang.reflect.Field;
import java.util.Map;
/**
* description:InputMapDataUtil
* @author lihf
* @date 2019/12/17
*/
public class InputMapDataUtil {

    /**
     * map转换实体类，并做数据校验
     * @param input
     * @param clazz
     * @param <T>
     * @return
     */
    public static<T> T getPostEntity(Map input,Class<T> clazz) throws ConcrrentException {
        try {
            T t = clazz.newInstance();
            Field[] fields = clazz.getFields();
            for (int i = 0; i < fields.length; i++) {
                fields[i].setAccessible(true);
                setField(t,clazz,fields[i],input);
            }
            return t;
        } catch (Exception e) {
            throw new ConcrrentException("0002",e.getMessage(),"InputMapDataUtil.getPostEntity");
        }
    }

    /**
     * 获取实体类字段并转换或者校验
     * @param t
     * @param clazz
     * @param field
     * @param input
     * @param <T>
     * @throws ConcrrentException
     */
    private static<T> void setField(T t,Class<T> clazz,Field field,Map input) throws ConcrrentException {
        InputField inputField = field.getAnnotation(InputField.class);
        String fieldName = inputField.fieldName();
        String inputName = inputField.inputName();//获取上送json中的值
        if(!fieldName.equals(field.getName())){
            throw new ConcrrentException("0002","转换失败，字段名称"+fieldName+"与需转换上送字段"+inputName+"不一致","InputMapDataUtil.getPostEntity");
        }
        Object obj = input.get(inputName);
        String value = obj==null?null:String.valueOf(obj);
        checkFor(value, inputField.checkFor(),inputName);//校验字段
        if(StringUtil.isBlank(value)){//不上送则不用赋值
            return;
        }
        covertAndSet(value,t,field,inputField.dataConvert(),inputName);//赋值
    }

    /**
     * 类型转换
     * @param val
     * @param t
     * @param field
     * @param dataConvert
     * @param <T>
     */
    private static<T> void covertAndSet(String val, T t, Field field, DataConvert dataConvert,String inputName) throws ConcrrentException {
        try {
            if(dataConvert.skip()){
                field.set(t, val);
            }
            if (dataConvert.str2Date()) {
                field.set(t, StrConvertUtil.str2Date(val));
            }
            if (dataConvert.str2Time()) {
                field.set(t, StrConvertUtil.str2Time(val));
            }
            if (dataConvert.str2Short()) {
                field.set(t, StrConvertUtil.str2Short(val));
            }
            if (dataConvert.str2Int()) {
                field.set(t, StrConvertUtil.str2Int(val));
            }
            if (dataConvert.str2Long()) {
                field.set(t, StrConvertUtil.str2Long(val));
            }
        }catch (Exception e){
            throw new ConcrrentException("0002",inputName+"转换异常:"+e.getMessage(),"InputMapDataUtil.covertAndSet");
        }
    }

    /**
     * 参数校验
     * @param val
     * @param checkfor
     * @return
     */
    private static void checkFor(String val, CheckFor checkfor,String inputName) throws ConcrrentException {
        if(checkfor.skip()){
            return;
        }
        boolean empyt = checkfor.isEmpty();
        if(!empyt && StringUtil.isBlank(val)){
            throw new ConcrrentException("0002",inputName+"字段上送不能为空","InputMapDataUtil.checkFor");
        }
        if(StringUtil.isBlank(val)){
            return;
        }
        int length = checkfor.length();
        if(length != 0 && val.length()>length){
            throw new ConcrrentException("0002",inputName+"字段长度超过规定长度"+length,"InputMapDataUtil.checkFor");
        }
        String regx = checkfor.regx();
        if(StringUtil.isNotEmpty(regx) && !val.matches(regx)){
            throw new ConcrrentException("0002",inputName+"字段上送与要求不匹配","InputMapDataUtil.checkFor");
        }
        String grEql = checkfor.grEql();
        if(StringUtil.isNotBlank(checkfor.grEql()) && !val.matches(checkfor.regx())){
            throw new ConcrrentException("0002",inputName+"字段上送大于等于要求值","InputMapDataUtil.checkFor");
        }
        String lwEql = checkfor.lwEql();
        if(StringUtil.isNotBlank(checkfor.lwEql()) && !val.matches(checkfor.regx())){
            throw new ConcrrentException("0002",inputName+"字段上送小于等于要求值","InputMapDataUtil.checkFor");
        }
    }
}
