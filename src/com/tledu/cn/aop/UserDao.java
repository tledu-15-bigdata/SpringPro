package com.tledu.cn.aop;

/**
 * @ClassName UserDao
 * @Description TODO
 * @Author YouLi
 * @Date 2018/4/17 21:29
 **/
public class UserDao implements IUserDao {
    @Override
    public void save() {
        System.out.println("-------userdao核心业务：已经保存数据--------");
    }
}
