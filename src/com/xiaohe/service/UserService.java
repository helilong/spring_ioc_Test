package com.xiaohe.service;

//��Ҫ����ԭ���ǿ����
import com.xiaohe.dao.Dao;

public class UserService {
	//
	private Dao dao;

	public void setDao(Dao dao) {
		this.dao = dao;
	}



	public void add() {
		System.out.println("service___________________");
		//��service�� �õ�dao�Ķ�����ܵ�������ķ���
		dao.add();
	}
	
	
	
	
}
