package com.tledu.cn.aop.base_aop_xml;

/**
 * @ClassName OrderDao
 * @Description TODO
 * @Author YouLi
 * @Date 2018/4/17 21:30
 **/
//业务类  target
public class OrderDao {
//    主营业务方法 targetMethod
    public int save(int a,String b) {
        System.out.println("-------orderdao核心业务：已经保存！-------");
//        int c=1/0;
//        System.out.println(c);
        return 3;
    }
}
