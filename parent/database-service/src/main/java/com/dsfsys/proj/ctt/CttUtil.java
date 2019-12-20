package com.dsfsys.proj.ctt;

public class CttUtil {
    public static CttUtil cttUtil;

    private CttHelper cttHelper;

    public void init(CttUtil cttUtil){
        this.cttUtil = cttUtil;
    }

    public void setCttHelper(CttHelper ctt){
        cttHelper = ctt;
    }

    public static CttHelper getCttHelper(){
        return cttUtil.cttHelper;
    }

}
