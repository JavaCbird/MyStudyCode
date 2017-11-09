package com.collection_TreeSet;

public class Student2 /*implements Comparable<Student2>*/{

	private String name;
	private int age;
	
	public Student2(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

//	@Override
//	/**
//	 * 重写比较方法,按照名字长度排序,长度相同时,按照名字内容排序,内容相同时,按照年龄排序
//	 */
//	public int compareTo(Student2 o) {
//		// TODO Auto-generated method stub
////		return 0;
//		//比较名字长度大小
//		int num=this.name.length()-o.name.length();
//		//若长度相同,比较名字内容大小
//		int num1= num==0?this.name.compareTo(o.name):num;
//		//若名字长度和内容都相同,比较年龄大小
//		int num2= num1==0?this.age-o.age:num1;
//		return num2;
//	}

	
	
}
