package com.tledu.cn.basic.spring_jdbc_5.anno.util;

import com.tledu.cn.basic.spring_jdbc_5.anno.pojo.Dept;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
//借鉴Mybatis  自定义pojo映射器
public class MyBeanPropertyRowMapper implements RowMapper<Dept> {
//
    @Override
    public Dept mapRow(ResultSet rs, int rowNumber) throws SQLException {
//        ResultSet rs  : JDBC 查询的数据结果
//        rowNumber ：查询结果的个数
        System.out.println(rowNumber);
        Dept dept=new Dept();
        dept.setDeptno(rs.getString(1).toString());
        dept.setDname(rs.getString(2).toString());
        dept.setLoc(rs.getString(3).toString());
        return dept;
    }
}
