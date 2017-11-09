package com.collection_TreeSet;

import java.util.TreeSet;

/**
 * TreeSet存储自定义对象,并保证排序和唯一
 * @author 朱智超
 *
 */
public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Student> ts=new TreeSet<Student>();
		
		Student s1=new Student("小明",21);
		Student s2=new Student("小强",23);
		Student s3=new Student("小红",18);
		Student s4=new Student("小花",25);
		Student s5=new Student("小强",23);
		Student s6=new Student("小强",23);
		Student s7=new Student("小刚",21);
		
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
