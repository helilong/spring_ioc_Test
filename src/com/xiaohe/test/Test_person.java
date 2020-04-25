package com.xiaohe.test;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xiaohe.bean.Demo1;
import com.xiaohe.bean.Demo2;
import com.xiaohe.pojo.Person;
import com.xiaohe.service.UserService;





public class Test_person {
	
	@Test
	public void show() {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
		Person person=(Person)context.getBean("person");
		person.test();
		
	}
}
