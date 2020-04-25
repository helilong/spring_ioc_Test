package com.xiaohe.test;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xiaohe.bean.Demo1;
import com.xiaohe.bean.Demo2;
import com.xiaohe.service.UserService;





public class Test_userService {
	
	@Test
	public void show() {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
		UserService userService=(UserService)context.getBean("userService");
		userService.add();
		
	}
}
