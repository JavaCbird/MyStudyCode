/*
 * 功能: 方法覆盖
 */
package com.zzc;

public class FuGai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建一只猫
		Cat cat1=new Cat();
		cat1.voice();
		Dog dog1=new Dog();
		dog1.voice();
	}

}

//动物类
class Animal
{
	int age;
	String name;
	public void voice()
	{
		System.out.println("我是动物,不知道怎么叫唤!");
	}
}

//猫类
class Cat extends Animal
{
	//覆盖父类
	public void voice()
	{
		System.out.println("猫叫唤!");
	}
}

//狗类
class Dog extends Animal
{
	//覆盖父类
	public void voice()
	{
		System.out.println("狗叫唤!");
	}
}