/*
 * ���͵ı�Ҫ�� 
 */
package com.fanxing;

import java.util.ArrayList;

public class FanXing_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����һֻ��
		Dog dog1=new Dog();
		ArrayList<Dog> al=new ArrayList<Dog>();
		//���뵽����
		al.add(dog1);
		//ȡ��
		Dog temp=al.get(0);  //����д��Dog temp=(Dog)al.get(0)
	}

}

class Dog{
	private String name;
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
	private int age;
}