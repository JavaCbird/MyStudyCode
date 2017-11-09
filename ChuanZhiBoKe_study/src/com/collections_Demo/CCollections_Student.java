package com.collections_Demo;

/*
 * 功能:排序,去掉重复值
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CCollections_Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Student> list=new ArrayList<Student>();
		
		Student s1=new Student("bbb",21);
		Student s2=new Student("ddd",20);
		Student s3=new Student("bbb",21);
		Student s4=new Student("ccc",21);
		Student s5=new Student("ccc",18);
		Student s6=new Student("aaa",23);
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		list.add(s6);
		
		//1.自然排序
		Collections.sort(list);
		
		//2.比较器排序
		Collections.sort(list, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				int num=o1.getAge()-o2.getAge();
				int num2= num==0?o1.getName().compareTo(o2.getName()):num;
				return num2;
			}
			
		});
		
		for(Student s:list) {
			System.out.println(s.getName()+"----"+s.getAge());
		}
		System.out.println("----------------");
		//去重
		for(int i=0;i<list.size()-1;i++) {
			Student stu1=list.get(i);
			for(int j=1;j<list.size();j++) {
				Student stu2=list.get(j);
				if(stu1.equals(stu2)) {
					list.remove(j);
					j--;
				}
			}
			
		}
		
		
		for(Student s:list) {
			System.out.println(s.getName()+"----"+s.getAge());
		}
		System.out.println("----------------");
		
		
		//去重
		for(int i=0;i<list.size()-1;i++) {
			Student stu1=list.get(i);
			for(int j=i+1;j<list.size();j++) {
				Student stu2=list.get(j);
				if(stu1.getAge()==stu2.getAge() && stu1.getName().equals(stu2.getName())) {
					list.remove(j);
					j--;
				}
			}
			
		}
		
		for(Student s:list) {
			System.out.println(s.getName()+"----"+s.getAge());
		}
	}

}

class Student implements Comparable<Student>{
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
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		int num=this.age-o.age;
		int num2= num==0?this.name.compareTo(o.name):num;
		return num2;
	}
	
	
}