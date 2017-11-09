package com.collection_TreeSet;

import java.util.Comparator;

public class MyComparator implements Comparator<Student2>{

	@Override
	public int compare(Student2 o1, Student2 o2) {
		// TODO Auto-generated method stub
//		return 0;
		//比较名字长度大小
		int num=o1.getName().length()-o2.getName().length();
		//若长度相同,比较名字内容大小
		int num1= num==0?o1.getName().compareTo(o2.getName()):num;
		//若名字长度和内容都相同,比较年龄大小
		int num2= num1==0?o1.getAge()-o2.getAge():num1;
		return num2;
	}

}
