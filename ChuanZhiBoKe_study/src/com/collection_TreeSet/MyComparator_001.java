package com.collection_TreeSet;

import java.util.Comparator;

public class MyComparator implements Comparator<Student2>{

	@Override
	public int compare(Student2 o1, Student2 o2) {
		// TODO Auto-generated method stub
//		return 0;
		//�Ƚ����ֳ��ȴ�С
		int num=o1.getName().length()-o2.getName().length();
		//��������ͬ,�Ƚ��������ݴ�С
		int num1= num==0?o1.getName().compareTo(o2.getName()):num;
		//�����ֳ��Ⱥ����ݶ���ͬ,�Ƚ������С
		int num2= num1==0?o1.getAge()-o2.getAge():num1;
		return num2;
	}

}
