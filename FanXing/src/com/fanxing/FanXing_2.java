package com.fanxing;

import java.lang.reflect.Method;

public class FanXing_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gen<Bird> gen1=new Gen<Bird>(new Bird());
		gen1.showTypeName();
		Bird bird=new Bird();
		bird.test1();
		bird.count(1, 2);
	}

}

class Bird{
	public void test1(){
		System.out.println("aa");
	}
	public void count(int a,int b){
		System.out.println((a+b));
	}
}

class Gen<T>{
	private T o;
	//���캯��
	public Gen(T o) {
		this.o=o;
	}
	//�õ�T����������
	public void showTypeName() {
		System.out.println("������:"+o.getClass().getName());
	
		//ͨ���������,���Եõ�T������͵ĺܶ���Ϣ(�������ơ�����,���캯��,�ȵ�)
		Method[] m=o.getClass().getDeclaredMethods();
		for(int i=0;i<m.length;i++) {
			System.out.println(m[i].getName());
		}
	}
}