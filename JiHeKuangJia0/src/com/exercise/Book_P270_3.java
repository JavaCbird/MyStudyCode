package com.exercise;

import java.util.*;

public class Book_P270_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp emp1=new Emp("010","zzc");
		Emp emp2=new Emp("013","cl");
		Emp emp3=new Emp("018","lgy");
		Emp emp4=new Emp("015","ysd");
		
		Map hm=new HashMap();
		hm.put(emp1.getId(), emp1.getName());
		hm.put(emp2.getId(), emp2.getName());
		hm.put(emp3.getId(), emp3.getName());
		hm.put(emp4.getId(), emp4.getName());
		
		System.out.println("所有对象:");
		Iterator it=hm.keySet().iterator();
		while(it.hasNext()) {
			//取出Key
			String key=it.next().toString();
			//根据Key取出Value
			String name=(String)hm.get(key);
			System.out.println(key+" "+name);
		}
		
		System.out.println("移除之后:");
		hm.remove("015");
		it=hm.keySet().iterator();
		while(it.hasNext()) {
			//取出Key
			String key=it.next().toString();
			//根据Key取出Value
			String name=(String)hm.get(key);
			System.out.println(key+" "+name);
		}
	}

}

//Emp类
class Emp{
	private String id;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String name;
	public Emp(String id,String name) {
		this.id=id;
		this.name=name;
	}
}