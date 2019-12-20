package com.dsfsys.proj.ctt;

import com.dsfsys.pub.factory.DsfLoggerFactory;
import com.dsfsys.proj.db.entity.ctt.CttExecuData;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.SqlCommandType;
import org.apache.ibatis.plugin.Invocation;
import org.slf4j.Logger;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;

public class CttHelper {

    private static Logger LOGGER = DsfLoggerFactory.getDbsLog();


    public static Object doCtt(Invocation invocation,CttExecuData cttExecuData) throws InvocationTargetException, IllegalAccessException {
        MappedStatement mappedStatement = (MappedStatement) invocation.getArgs()[0];
        //获取sql命令操作类型
        SqlCommandType sqlCommandType = mappedStatement.getSqlCommandType();
        LOGGER.info("获取的sql命令为：" + sqlCommandType);

        //获取参数

        Object parameter = invocation.getArgs()[1];
        if (null != parameter) {
            //获取成员变量
            Field[] declaredFields = parameter.getClass().getDeclaredFields();
            for (Field field : declaredFields) {


                    //insert或者update语句，插入updateTime
                    if (SqlCommandType.INSERT.equals(sqlCommandType) || SqlCommandType.UPDATE.equals(sqlCommandType)) {
                        field.setAccessible(true);
                        field.set(parameter, new Date());
                    }

            }
        }

        return invocation.proceed();
    }

}
