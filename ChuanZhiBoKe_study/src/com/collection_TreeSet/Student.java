package com.collection_TreeSet;

public class Student implements Comparable<Student>{

	private String name;
	private int age;
	
	public Student(String name, int age) {
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

	@Override
	/**
	 * 重写比较方法,按照年龄大小排序,并且年龄和名字都唯一才作为唯一条件
	 */
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
//		return 0;
		int num=this.age-o.age;
		int num1= num==0?this.name.compareTo(o.name):num;
		return num1;
	}

	
	
}
