package com.xiaohe.test;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xiaohe.bean.Demo1;
import com.xiaohe.bean.Demo2;





public class Test_demo2 {
	
	@Test
	public void show() {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
		Demo2 demo2 =(Demo2)context.getBean("demo2");
		demo2.test();
		
	}
}
