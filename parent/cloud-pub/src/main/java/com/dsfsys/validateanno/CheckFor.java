package com.dsfsys.validateanno;

import java.lang.annotation.*;

/**
 * 实体类校验注解
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface CheckFor {
    boolean skip() default false;
    int length() default 0;  //长度
    boolean isEmpty() default true; //是否为空
    String regx() default "";//正则
    String grEql() default "";//大于等于
    String lwEql() default "";//小于等于
    String gr() default "";//大于
    String lw() default "";//小于
}
