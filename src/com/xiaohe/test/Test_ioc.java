package com.xiaohe.test;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xiaohe.ioc.User;

public class Test_ioc {
	
	@Test
	public void show() {
		//1加载spring配置文件 根据创建对象
		ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
		
		//2得到配置创建对象
		User user1 =(User)context.getBean("user");
		User user2 =(User)context.getBean("user");
		System.out.println(user1);
		System.out.println(user2);
	}
}
