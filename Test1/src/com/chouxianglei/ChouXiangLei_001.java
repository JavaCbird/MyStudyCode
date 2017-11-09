/*
 * 功能: 抽象类的必要性
 */
package com.chouxianglei;

public class ChouXiangLei {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

//这是一个抽象类
abstract class Animal
{
	String name;
	int age;
	abstract public void voice();
	public void print()
	{
		System.out.println("zzc");
	}
}

//当一个类继承的父类是抽象的话,需要我们把抽象类中的所有抽象方法全部实现
class Cat extends Animal
{
	//实现父类的voice()
	public void voice()
	{
		//可以不写东西
		//也可以实现东西
		System.out.println("猫叫");
	}
}