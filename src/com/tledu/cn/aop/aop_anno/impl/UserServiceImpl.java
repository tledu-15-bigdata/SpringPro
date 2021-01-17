package com.tledu.cn.aop.aop_anno.impl;

import com.tledu.cn.aop.aop_anno.UserService;
import com.tledu.cn.aop.aop_anno.self_anno.ExceptionAnno;
import com.tledu.cn.aop.aop_anno.self_anno.LogAnno;
import com.tledu.cn.aop.aop_anno.self_anno.My;
import org.springframework.stereotype.Service;

@Service("userServiceImpl")
public class UserServiceImpl implements UserService {

    @LogAnno(name = "日志")
    public int add(){
        System.out.println("UserService add()");
        return 123;
    }

    public boolean delete(){
        System.out.println("UserService delete()");
        return true;
    }
//    @LogAnno()
//    @ExceptionAnno(name="异常")
    public boolean edit(){
        System.out.println("UserService edit()");
        int i = 5/0;
        return true;
    }
    
    
}