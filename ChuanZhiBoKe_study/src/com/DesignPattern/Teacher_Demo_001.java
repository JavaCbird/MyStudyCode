package com.DesignPattern;
/*
 * 单例模式:
 * 		懒汉式:用的时候才创建对象,即调用getTeacher()方法时才创建对象
 */
public class Teacher_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher t1=Teacher.getTeacher();
		Teacher t2=Teacher.getTeacher();
		System.out.println(t1==t2);
	}

}
