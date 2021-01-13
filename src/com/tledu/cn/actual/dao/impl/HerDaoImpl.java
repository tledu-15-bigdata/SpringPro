package com.tledu.cn.actual.dao.impl;

import com.tledu.cn.actual.dao.HisDao;
import org.springframework.stereotype.Repository;

@Repository
public class HerDaoImpl implements HisDao {
    @Override
    public int work(int a, int b) {
        System.out.println("HerDaoImpl");
        return a+b;
    }
}
