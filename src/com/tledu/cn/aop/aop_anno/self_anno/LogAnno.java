package com.tledu.cn.aop.aop_anno.self_anno;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface LogAnno {
    String name() default "";
}
