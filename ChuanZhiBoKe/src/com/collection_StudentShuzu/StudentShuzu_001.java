package com.collection_StudentShuzu;

import java.util.ArrayList;
import java.util.Collection;

public class StudentShuzu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<Student> c=new ArrayList<Student>();
		
		Student s1=new Student("С��",21);
		Student s2=new Student("Сǿ",23);
		Student s3=new Student("С��",18);
		Student s4=new Student("С��",25);
		
		c.add(s1);
		c.add(s2);
		c.add(s3);
		c.add(s4);
		
		Object[] objs=c.toArray();
		for(int i=0;i<objs.length;i++) {
			Student s=(Student) objs[i];
			System.out.println("����:"+s.getName()+" ,����:"+s.getAge());
		}
	}

}
