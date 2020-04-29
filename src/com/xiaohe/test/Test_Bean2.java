package com.xiaohe.test;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xiaohe.bean.Bean2;
import com.xiaohe.ioc.User;



public class Test_Bean2 {
	
	@Test
	public void show() {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
		Bean2 bean2 =(Bean2)context.getBean("bean2");
		System.out.println(bean2);
		bean2.bean();
	}
}
