package com.DesignPattern;
/*
 * ����ģʽ:
 * 		����ʽ:�õ�ʱ��Ŵ�������,������getTeacher()����ʱ�Ŵ�������
 */
public class Teacher_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher t1=Teacher.getTeacher();
		Teacher t2=Teacher.getTeacher();
		System.out.println(t1==t2);
	}

}
