/*
 * ����: ��������
 */
package com.zzc;

public class FuGai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����һֻè
		Cat cat1=new Cat();
		cat1.voice();
		Dog dog1=new Dog();
		dog1.voice();
	}

}

//������
class Animal
{
	int age;
	String name;
	public void voice()
	{
		System.out.println("���Ƕ���,��֪����ô�л�!");
	}
}

//è��
class Cat extends Animal
{
	//���Ǹ���
	public void voice()
	{
		System.out.println("è�л�!");
	}
}

//����
class Dog extends Animal
{
	//���Ǹ���
	public void voice()
	{
		System.out.println("���л�!");
	}
}