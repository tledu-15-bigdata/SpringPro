package com.tledu.cn.basic.spring_jdbc_5.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.annotation.Resource;
import javax.sql.DataSource;


@PropertySource("classpath:jdbc.properties")
public class JdbcConfig {

    @Value("${jdbc.driver}")
    private String driver;

    @Value("${jdbc.url}")
    private String url;

    @Value("${jdbc.username}")
    private String user;

    @Value("${jdbc.password}")
    private String password;

    DriverManagerDataSource dmd=null;


    /**
     * Bean注解：该注解只能写在方法上，表明使用此方法创建一个对象，并且放入spring容器。
     * name属性：给当前@Bean注解方法创建的对象指定一个名称(即bean的id）。
     *
     * @return
     */
//    数据库连接基础信息 对象
    @Bean(name = "dataSource")
    public DataSource createDataSource() {

        if(dmd==null){
            dmd = new DriverManagerDataSource();
            dmd.setDriverClassName(driver);
            dmd.setPassword(password);
            dmd.setUsername(user);
            dmd.setUrl(url);
        }

        return dmd;

    }


    @Bean(name = "jdbcTemplate")
    public JdbcTemplate createJdbcTemplate(@Autowired DataSource dataSource) {
//    public JdbcTemplate createJdbcTemplate(@Resource(name="dataSource") DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }
}
