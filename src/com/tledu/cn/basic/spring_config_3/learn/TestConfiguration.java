package com.tledu.cn.basic.spring_config_3.learn;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

//@Configuration标注在类上，相当于把该类作为spring的xml配置文件中的，作用为：配置spring容器(应用上下文)
@Configuration
public class TestConfiguration {

    public TestConfiguration() {
        System.out.println("TestConfiguration 容器启动初始化...");
    }


//    注：
//      (1)、@Bean注解在返回实例的方法上，如果未通过@Bean指定bean的名称，则默认与标注的方法名相同；
//      (2)、@Bean注解默认作用域为单例singleton作用域，可通过@Scope(“prototype”)设置为原型作用域；
//      (3)、既然@Bean的作用是注册bean对象，那么完全可以使用@Component、@Controller、@Service、@Repository等注解注册bean，当然需要配置@ComponentScan注解进行自动扫描。
//    @Bean(name = "myUser",initMethod = "start",destroyMethod = "cleanUp")
    @Bean(name = "myUser")
    @Scope("prototype")
    public User user(){



        return new User();
    }
}