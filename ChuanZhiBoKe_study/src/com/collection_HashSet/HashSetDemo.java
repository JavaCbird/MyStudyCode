package com.collection_HashSet;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Student> hs=new HashSet<Student>();

		Student s1=new Student("С��",21);
		Student s2=new Student("Сǿ",23);
		Student s3=new Student("С��",18);
		Student s4=new Student("С��",25);
		Student s5=new Student("Сǿ",23);
		Student s6=new Student("Сǿ",23);

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
