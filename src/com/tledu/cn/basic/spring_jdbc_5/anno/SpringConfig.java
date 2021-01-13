package com.tledu.cn.basic.spring_jdbc_5.anno;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration//指定该类是一个配置类、等价于一个spring的配置文件
@ComponentScan(basePackages="com.tledu.cn.basic.spring_jdbc_5")//指定扫包范围
@Import(JdbcConfig.class) //引入JdbcConfig.class文件
public class SpringConfig {


}