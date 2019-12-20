package com.dsfsys.validateanno;

import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface InputField {
    CheckFor checkFor() default @CheckFor(skip = true);
    DataConvert dataConvert() default @DataConvert(skip = true);
    String fieldName() default "";
    String inputName() default "";
}
