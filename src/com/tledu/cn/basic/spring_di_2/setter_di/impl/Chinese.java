package com.tledu.cn.basic.spring_di_2.setter_di.impl;


import com.tledu.cn.basic.spring_di_2.setter_di.Axe;
import com.tledu.cn.basic.spring_di_2.setter_di.Person;
//业务类
public class Chinese
	implements Person
{
	private Axe axe;
	public void setAxe(Axe axe)
	{
		this.axe = axe;
	}



	public void useAxe()
	{
		System.out.println(axe.chop());
	}

}