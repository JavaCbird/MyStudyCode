package com.DesignPattern;

public class Student {
	//���캯��˽��
	private Student() {
		
	}
	//�Լ���һ��
	//��̬����ֻ�ܷ��ʾ�̬��Ա����
	//Ϊ�˲�������޸����ֵ,��private
	private static Student s=new Student();
	//�ṩһ������ķ����Թ�����
	//Ϊ��֤�����ֱ��ʹ�ô˷���,�Ӿ�̬
	public static Student getStudent() {
		return s;
	}
}
