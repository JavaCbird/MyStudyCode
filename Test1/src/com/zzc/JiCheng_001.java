/*
 * ����:˵���̳е���Ҫ��
 */
package com.zzc;

public class JiCheng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pupil p1=new Pupil();
		p1.printName();
	}

}

//����
class Stu
{
	public int age;
	public String name;
	public float fee;
	private String job;
	
    public void printName()
	{
		System.out.println("����:"+this.name);
	}
}

//Сѧ����
class Pupil extends Stu
{
	
	public void pay(float fee)
	{
		this.fee=fee;
	}
}
//��ѧ����
class MiddleStu extends Stu
{
	
	public void pay(float fee)
	{
		this.fee=fee*0.8f;
	}
}
//��ѧ����
class ColStu extends Stu
{
	
	public void pay(float fee)
	{
		this.fee=fee*0.1f;
	}
}