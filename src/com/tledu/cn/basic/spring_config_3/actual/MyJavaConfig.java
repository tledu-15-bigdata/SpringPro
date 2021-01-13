package com.tledu.cn.basic.spring_config_3.actual;

import org.springframework.context.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan("com.tledu.cn.basic.spring_config_3")
@ImportResource("classpath:bean-configuration.xml")
@Import({JdbcConfig.class})
public class MyJavaConfig {

    @Bean(name="student")
    public Student getStudent(){
        return new Student();
    }

    @Bean(name="myList")
    public List<Student> getList(){
        List<Student> stuList=new ArrayList<Student>();
        stuList.add(getStudent());
        return stuList;
    }
}
