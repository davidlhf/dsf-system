package com.dsfsys.proj.ctt;

import com.dsfsys.pub.factory.DsfLoggerFactory;
import com.dsfsys.pub.utils.StringUtil;
import com.dsfsys.proj.db.entity.ctt.CttExecuData;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.SqlCommandType;
import org.apache.ibatis.plugin.*;
import org.slf4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

import java.util.Properties;


/**
 * @Description: 拦截器核心代码，拦截重写crateTime和updateTime
 * @Author: zy
 * @Date:Created in 9:37 2019/7/10
 */
@Component
@RestController
@Intercepts({
        @Signature(type = Executor.class, method = "update", args = {MappedStatement.class, Object.class}),
//        @Signature(type = Executor.class, method = "query", args = {Statement.class, ResultHandler.class})
})
public class SqlInterceptor implements Interceptor {
//
//    /**
//     * org.apache.ibatis.executor.Executor;
//     * 是 Mybatis 的内部执行器，它负责调用 StatementHandler 操作数据库，并把结果集通过 ResultSetHandler 进行自动映射，另外，它还处理了二级缓存的操作。
//     * Executor创建StatementHandler对象,
//     * 同时,创建ParameterHandler和ResultSetHandler对象,而ParameterHandler和ResultSetHandler都依赖TypeHandler;
//     */
//    Executor;
//    /**
//     * org.apache.ibatis.executor.statement.StatementHandler;
//     * 是 Mybatis 直接和数据库执行 sql 脚本的对象，另外，它也实现了 Mybatis 的一级缓存。
//     */
//    StatementHandler;
//    /**
//     * org.apache.ibatis.executor.parameter.ParameterHandler;
//     *  是 Mybatis 实现 sql 入参设置的对象。
//     */
//    ParameterHandler;
//    /**
//     * org.apache.ibatis.executor.resultset.ResultSetHandler;
//     * 是 Mybatis 把 ResultSet 集合映射成 POJO 的接口对象。处理查询结果集;
//     */
//    ResultSetHandler;



    private static final Logger logger = DsfLoggerFactory.getDbsLog();
    private static final ThreadLocal<CttExecuData> threadLocal = new ThreadLocal<>();

    public static void startCttTx(String uniKey, String data){
        if(StringUtil.isBlank(uniKey)){
            return;
        }
        CttExecuData cttExecuData = new CttExecuData();
        cttExecuData.setUniKey(uniKey);
        cttExecuData.setCttData(data);
        threadLocal.set(cttExecuData);
    }

    public static void startCttTx(String uniKey){
        if(StringUtil.isBlank(uniKey)){
            return;
        }
        CttExecuData cttExecuData = new CttExecuData();
        cttExecuData.setUniKey(uniKey);
        threadLocal.set(cttExecuData);
    }

    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        MappedStatement mappedStatement = (MappedStatement) invocation.getArgs()[0];
        SqlCommandType sqlCommandType = mappedStatement.getSqlCommandType();
        CttExecuData cttExecuData = threadLocal.get();
        if(cttExecuData!=null && !SqlCommandType.SELECT.equals(sqlCommandType)){
            logger.info("START CTT THE METHOD IS:"+sqlCommandType+"####UUID IS:"+cttExecuData.getUniKey());
            return CttUtil.getCttHelper().doCtt(invocation,cttExecuData);
        }else{
            return invocation.proceed();
        }
    }

    @Override
    public Object plugin(Object o) {
        return Plugin.wrap(o, this);
    }

    @Override
    public void setProperties(Properties properties) {
    }

}