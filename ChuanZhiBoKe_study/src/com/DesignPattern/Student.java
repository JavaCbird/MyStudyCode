package com.DesignPattern;

public class Student {
	//构造函数私有
	private Student() {
		
	}
	//自己造一个
	//静态方法只能访问静态成员变量
	//为了不让外界修改这个值,加private
	private static Student s=new Student();
	//提供一个父类的方法以供访问
	//为保证外界能直接使用此方法,加静态
	public static Student getStudent() {
		return s;
	}
}
