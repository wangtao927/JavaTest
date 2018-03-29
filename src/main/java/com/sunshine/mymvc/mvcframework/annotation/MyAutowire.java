package com.sunshine.mymvc.mvcframework.annotation;

import java.lang.annotation.*;

/**
 * Created by wangtao on 2018/3/28.
 */
@Target (ElementType.FIELD)
@Retention (RetentionPolicy.RUNTIME)
@Documented
public @interface MyAutowire {

    String value() default "";
}
