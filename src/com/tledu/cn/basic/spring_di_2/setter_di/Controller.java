package com.tledu.cn.basic.spring_di_2.setter_di;

import com.tledu.cn.basic.spring_di_2.setter_di.impl.Chinese;

public class Controller {
    private Chinese p;

    public Person getP() {
        return p;
    }

    public void setP(Chinese p) {
        this.p = p;
    }

    public void work(){
        p.useAxe();
    }
}
