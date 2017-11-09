package com.collection_HashSet;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Student> hs=new HashSet<Student>();

		Student s1=new Student("小明",21);
		Student s2=new Student("小强",23);
		Student s3=new Student("小红",18);
		Student s4=new Student("小花",25);
		Student s5=new Student("小强",23);
		Student s6=new Student("小强",23);

		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		hs.add(s4);
		hs.add(s5);
		hs.add(s6);
		
		for(Student s:hs) {
//			System.out.println(s);
			System.out.println(s.getName()+"----"+s.getAge());
		}
	}

}
