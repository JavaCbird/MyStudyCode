/*
 * ����: ������ı�Ҫ��
 */
package com.chouxianglei;

public class ChouXiangLei {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

//����һ��������
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

//��һ����̳еĸ����ǳ���Ļ�,��Ҫ���ǰѳ������е����г��󷽷�ȫ��ʵ��
class Cat extends Animal
{
	//ʵ�ָ����voice()
	public void voice()
	{
		//���Բ�д����
		//Ҳ����ʵ�ֶ���
		System.out.println("è��");
	}
}