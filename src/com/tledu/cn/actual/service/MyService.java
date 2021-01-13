package com.tledu.cn.actual.service;

import com.tledu.cn.actual.dao.HisDao;
import com.tledu.cn.actual.dao.MyDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MyService {

//    被注入变量 类型 HisDao（2 子实现类 HerDaoImpl  HisDaoImpl）
    @Autowired
    @Qualifier("HisDaoImpl")
    private HisDao myDao;



    public int work(int a,int b){
        return  myDao.work(a,b);
    }
}
