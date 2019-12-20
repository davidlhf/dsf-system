package com.dsfsys.proj.config;

import com.dsfsys.proj.ctt.CttHelper;
import com.dsfsys.proj.ctt.CttUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CttConfiguration {

    @Bean
    public CttUtil cttUtilManager(){
        CttUtil cttUtil = new CttUtil();
        cttUtil.init(cttUtil);
        cttUtil.setCttHelper(new CttHelper());
        return cttUtil;
    }

}
