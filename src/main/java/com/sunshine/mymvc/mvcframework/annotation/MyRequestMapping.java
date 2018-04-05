package com.sunshine.mymvc.mvcframework.annotation;

import java.lang.annotation.*;

/**
 * Created by wangtao on 2018/3/27.
 */

@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyRequestMapping {

    String value() default "";
}
