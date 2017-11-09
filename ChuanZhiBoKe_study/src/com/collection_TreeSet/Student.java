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
	 * ��д�ȽϷ���,���������С����,������������ֶ�Ψһ����ΪΨһ����
	 */
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
//		return 0;
		int num=this.age-o.age;
		int num1= num==0?this.name.compareTo(o.name):num;
		return num1;
	}

	
	
}
