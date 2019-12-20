package com.dsfsys.base.dataimpl;

import com.alibaba.fastjson.JSONObject;
import com.dsfsys.base.data.PostDataBase;
import com.dsfsys.pub.utils.JsonUtil;

import java.util.Map;

public class PostDataBaseImpl implements PostDataBase {

    public Map<String, Object> dataMap;

    @Override
    public Map<String, Object> getData() {
        return dataMap;
    }

    @Override
    public void setData(Map<String, Object> data) {
        this.dataMap = dataMap;
    }

    public String getJsonStr(){
        return JsonUtil.map2Str(dataMap);
    }
}
