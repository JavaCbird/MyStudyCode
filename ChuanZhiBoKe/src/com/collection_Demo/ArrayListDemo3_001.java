/*
 * contains()方法的底层是equals()方法,所以比较Student类的对象时,就要调用Student类中的equals()方法,
 * 然而,若Student类中没有equals()方法,则调用Student父类,即Object类中的equals()方法,而该方法默认的是
 * 比较地址值,而不是元素值,而Student的对象都是通过new得到的,地址值都不同,因此比较结果为都不相同.
 * 
 * 解决方法是:在Student类中添加equals()方法(可通过快捷键快速添加)
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
		
		//使用增强for
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
		
		//使用增强for
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