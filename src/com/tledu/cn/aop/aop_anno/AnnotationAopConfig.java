package com.tledu.cn.aop.aop_anno;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan("com.tledu.cn.aop.aop_anno")
//@ImportResource("classpath:applicationContext_aopanno.xml")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AnnotationAopConfig {
}
