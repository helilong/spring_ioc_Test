package com.xiaohe.test;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xiaohe.ioc.User;

public class Test_ioc {
	
	@Test
	public void show() {
		//1����spring�����ļ� ���ݴ�������
		ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
		
		//2�õ����ô�������
		User user1 =(User)context.getBean("user");
		User user2 =(User)context.getBean("user");
		System.out.println(user1);
		System.out.println(user2);
	}
}
