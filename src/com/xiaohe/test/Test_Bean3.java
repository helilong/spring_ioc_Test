package com.xiaohe.test;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xiaohe.bean.Bean2;
import com.xiaohe.bean.Bean3;
import com.xiaohe.ioc.User;




public class Test_Bean3 {
	
	@Test
	public void show() {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
		Bean3 bean3 =(Bean3)context.getBean("bean3");
		System.out.println(bean3);
		bean3.bean();
	}
}
