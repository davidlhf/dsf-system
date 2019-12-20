package com.dsfsys.validateanno;

import java.lang.annotation.*;

/**
 * 字符转换类注解
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DataConvert {
    boolean skip() default false;
    boolean str2Int() default false;//字符串转int
    boolean str2Long() default false;//字符串转long
    boolean str2Short() default false;//字符串转short
    boolean str2Date() default false;//字符串转date
    boolean str2Time() default false;//字符串转时间
}
