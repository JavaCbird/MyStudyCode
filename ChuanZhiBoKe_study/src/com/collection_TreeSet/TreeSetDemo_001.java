package com.collection_TreeSet;

import java.util.TreeSet;

/**
 * TreeSet�洢�Զ������,����֤�����Ψһ
 * @author ���ǳ�
 *
 */
public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Student> ts=new TreeSet<Student>();
		
		Student s1=new Student("С��",21);
		Student s2=new Student("Сǿ",23);
		Student s3=new Student("С��",18);
		Student s4=new Student("С��",25);
		Student s5=new Student("Сǿ",23);
		Student s6=new Student("Сǿ",23);
		Student s7=new Student("С��",21);
		
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		ts.add(s5);
		ts.add(s6);
		ts.add(s7);
		
		for(Student s:ts) {
			System.out.println(s.getName()+"----"+s.getAge());
		}
	}

}
