package com.sunshine.mymvc.mvcframework.annotation;

import java.lang.annotation.*;

/**
 * Created by wangtao on 2018/3/28.
 */
@Target (ElementType.PARAMETER)
@Retention (RetentionPolicy.RUNTIME)
@Documented
public @interface MyRequestParam {

    String value() default "";
    boolean required() default false;
}
