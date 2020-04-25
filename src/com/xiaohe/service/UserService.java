package com.xiaohe.service;

//需要导的原因是跨包了
import com.xiaohe.dao.Dao;

public class UserService {
	//
	private Dao dao;

	public void setDao(Dao dao) {
		this.dao = dao;
	}



	public void add() {
		System.out.println("service___________________");
		//在service中 得到dao的对象才能调用里面的方法
		dao.add();
	}
	
	
	
	
}
