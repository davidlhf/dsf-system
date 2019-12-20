package com.dsfsys.pub.utils;

import com.alibaba.fastjson.JSONObject;

import java.util.Map;

public class JsonUtil {

    /**
     * 字符串转换json
     * @param str
     * @return
     */
    public static JSONObject str2Json(String str){
        if(StringUtil.isBlank(str)){
            return null;
        }
        return JSONObject.parseObject(str);
    }

    /**
     * json对象转Map
     * @param jSONObject
     * @return
     */
    public static Map<String,Object> json2Map(JSONObject jSONObject){
        if(jSONObject==null){
            return null;
        }
        return JSONObject.toJavaObject(jSONObject,Map.class);
    }

    /**
     * 字符串转换Map
     * @param str
     * @return
     */
    public static Map<String,Object> Str2Map(String str){
        if(StringUtil.isBlank(str)){
            return null;
        }
        return JSONObject.toJavaObject(JSONObject.parseObject(str),Map.class);
    }

    /**
     * map转换String
     * @param map
     * @return
     */
    public static String map2Str(Map<String,Object> map){
        if(map==null){
            return null;
        }
        return JSONObject.toJSONString(map);
    }
}
