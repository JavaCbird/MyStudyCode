package com.DesignPattern;

public class Teacher {
	private Teacher() {
		
	}
	private static Teacher t=null;
	//Ϊ�˽�����߳�����,��synchronized
	public synchronized static Teacher getTeacher(){
		if(t==null) {
			t=new Teacher();
		}
		return t;
	}
}
