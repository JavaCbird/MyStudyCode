package com.xiaoqiang;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog1=new Dog();
		System.out.println(dog1.a);
	}
	
}
class Dog
{
	public int a;
	protected String name;
	String color;
	private float price;
	
	private void ab1() {
		System.out.println(a);
	}
}