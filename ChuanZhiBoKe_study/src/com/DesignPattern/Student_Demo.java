package com.DesignPattern;
/*
 * 单例模式:保证类在内存中只有一个对象
 * 		饿汉式:Student类一加载就创建对象
 */
public class Student_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=Student.getStudent();
		Student s2=Student.getStudent();
		System.out.println(s1==s2);//true,说明s1与s2是同一个对象
	}

}
