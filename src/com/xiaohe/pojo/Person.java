package com.xiaohe.pojo;


import java.util.List;
import java.util.Map;

import com.sun.xml.internal.fastinfoset.sax.Properties;

public class Person {
	//private String name;
	private String[] arrs;
	private List<String> list;
	private Map<String,String> map;
	private Properties properties;
	
	
	public void setArrs(String[] arrs) {
		this.arrs = arrs;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	public void setMap(Map<String, String> map) {
		this.map = map;
	}
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	public void test() {
//		System.out.println(name);
		System.out.println("arrs"+arrs);
		System.out.println("list"+list);
		System.out.println("map"+map);
		System.out.println("properties"+properties);
	}
}
