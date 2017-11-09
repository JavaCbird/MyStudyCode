/*
 * 功能:说明继承的重要性
 */
package com.zzc;

public class JiCheng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pupil p1=new Pupil();
		p1.printName();
	}

}

//父类
class Stu
{
	public int age;
	public String name;
	public float fee;
	private String job;
	
    public void printName()
	{
		System.out.println("名字:"+this.name);
	}
}

//小学生类
class Pupil extends Stu
{
	
	public void pay(float fee)
	{
		this.fee=fee;
	}
}
//中学生类
class MiddleStu extends Stu
{
	
	public void pay(float fee)
	{
		this.fee=fee*0.8f;
	}
}
//大学生类
class ColStu extends Stu
{
	
	public void pay(float fee)
	{
		this.fee=fee*0.1f;
	}
}