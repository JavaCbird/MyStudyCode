/*
 * 泛型的必要性 
 */
package com.fanxing;

import java.util.ArrayList;

public class FanXing_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建一只狗
		Dog dog1=new Dog();
		ArrayList<Dog> al=new ArrayList<Dog>();
		//放入到集合
		al.add(dog1);
		//取出
		Dog temp=al.get(0);  //不用写成Dog temp=(Dog)al.get(0)
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