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
//	 * ��д�ȽϷ���,�������ֳ�������,������ͬʱ,����������������,������ͬʱ,������������
//	 */
//	public int compareTo(Student2 o) {
//		// TODO Auto-generated method stub
////		return 0;
//		//�Ƚ����ֳ��ȴ�С
//		int num=this.name.length()-o.name.length();
//		//��������ͬ,�Ƚ��������ݴ�С
//		int num1= num==0?this.name.compareTo(o.name):num;
//		//�����ֳ��Ⱥ����ݶ���ͬ,�Ƚ������С
//		int num2= num1==0?this.age-o.age:num1;
//		return num2;
//	}

	
	
}
