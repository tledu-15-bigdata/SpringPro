package com.tledu.cn.basic.spring_jdbc_5.xml.dao;

import com.tledu.cn.basic.spring_jdbc_5.anno.pojo.Dept;
import com.tledu.cn.basic.spring_jdbc_5.anno.util.MyBeanPropertyRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@Repository
public class SpringDao {
//    @Autowired
    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Dept> queryAll()  {
        Connection conn=null;
        List<Dept> deptList1=null;
        try {
//        获取连接对象
            conn=jdbcTemplate.getDataSource().getConnection();
//        关闭自动提交
            conn.setAutoCommit(false);
//        JdbcTemplate 自动设定事务  自动每次crud操作，自动提交

           deptList1 = jdbcTemplate.query("select * from dept", new BeanPropertyRowMapper<Dept>(Dept.class));

           Object[] params = {"石家庄"};
           List<Dept> deptList2 =
                   jdbcTemplate.query("select * from dept where loc=?", params,
                   new BeanPropertyRowMapper<Dept>(Dept.class));
            //        手动提交
            conn.commit();
            conn.close();
       }catch(SQLException ex){
            try {
                //   手动回滚
                conn.rollback();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return deptList1;
    }

//    如果没有设定映射pojo 可以直接List<Map<String,Object>>接受
    public List<Map<String,Object>> queryAll2(){
        List<Map<String, Object>> mapList = jdbcTemplate.queryForList("select * from dept");
        List<Map<String, Object>> mapList1 = jdbcTemplate.queryForList("select * from dept where deptno=?",new Object[]{"555"});




        //        某个列所有数据拿到
        List<String>  mapList2 =
                jdbcTemplate.queryForList("select deptno from dept where deptno=?",
                        new Object[]{"555"},String.class);


        return mapList;
    }

    public Dept querySingle1(){
        Object[] params={"555","石家庄藁城"};
        String sql="select *  from dept where deptno=? and loc=?";
        Dept dept=jdbcTemplate.queryForObject(sql,params,new BeanPropertyRowMapper<Dept>(Dept.class));
        return dept;
    }

    public Map<String,Object> querySingle2(){
        String sql="select *  from dept where deptno=? and loc=?";
        Map<String,Object> map=jdbcTemplate.queryForMap(sql,"555","石家庄藁城");
        return map;
    }

//    自定义映射

    public Dept querySingle3(){
        Object[] params={"555","石家庄藁城"};
        String sql="select *  from dept where deptno=? and loc=?";
        Dept dept=jdbcTemplate.queryForObject(sql,params,new MyBeanPropertyRowMapper());
        return dept;
    }

//   增删改 都用 update来实现，sql语句不一致即可  后面根据占位符顺序依次填入参数值

    public int updateDept(){
        int resultNum = jdbcTemplate.update("update dept set dname =? where deptno =?", "石家庄财务", "123");
        return resultNum;
    }

    public int insertDept(){
        String sql="insert into dept(deptno,dname,loc) values(?,?,?)";
        int resultNum = jdbcTemplate.update(sql, "555", "石家庄党委", "石家庄藁城");
        return resultNum;
    }

    public int deleteDept(){
        String sql="delete from dept where deptno=?";
        int resultNum = jdbcTemplate.update(sql, "555");
        return resultNum;
    }


}
