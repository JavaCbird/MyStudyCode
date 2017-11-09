package com.DesignPattern;

public class Teacher {
	private Teacher() {
		
	}
	private static Teacher t=null;
	//为了解决多线程问题,加synchronized
	public synchronized static Teacher getTeacher(){
		if(t==null) {
			t=new Teacher();
		}
		return t;
	}
}
