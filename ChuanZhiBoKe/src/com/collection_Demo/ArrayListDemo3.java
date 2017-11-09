/*
 * contains()�����ĵײ���equals()����,���ԱȽ�Student��Ķ���ʱ,��Ҫ����Student���е�equals()����,
 * Ȼ��,��Student����û��equals()����,�����Student����,��Object���е�equals()����,���÷���Ĭ�ϵ���
 * �Ƚϵ�ֵַ,������Ԫ��ֵ,��Student�Ķ�����ͨ��new�õ���,��ֵַ����ͬ,��˱ȽϽ��Ϊ������ͬ.
 * 
 * ���������:��Student�������equals()����(��ͨ����ݼ��������)
 */
package com.collection_Demo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> array=new ArrayList<Student>();
		ArrayList<Student> array_new=new ArrayList<Student>();
		
		Student s1=new Student("aaa",23);
		Student s2=new Student("bbb",21);
		Student s3=new Student("ccc",24);
		Student s4=new Student("aaa",23);
		Student s5=new Student("ddd",22);
		Student s6=new Student("ccc",23);

		array.add(s1);
		array.add(s2);
		array.add(s3);
		array.add(s4);
		array.add(s5);
		array.add(s6);
		
//		Iterator<Student> it=array.iterator();
//		while(it.hasNext()) {
//			Student s=it.next();
//			if(!array_new.contains(s)) {
//				array_new.add(s);
//			}
//		}
		
		//ʹ����ǿfor
		if(array!=null) {
			for(Student s:array) {
				if(!array_new.contains(s)) {
					array_new.add(s);
				}
			}
		}
		
//		for(int i=0;i<array_new.size();i++) {
//			Student s=array_new.get(i);
//			System.out.println(s.getName()+"----"+s.getAge());
//		}
		
		//ʹ����ǿfor
		if(array_new!=null) {
			for(Student s:array_new) {
				System.out.println(s.getName()+"----"+s.getAge());
			}
		}
	}

}

class Student {
	private String name;
	private int age;
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
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}