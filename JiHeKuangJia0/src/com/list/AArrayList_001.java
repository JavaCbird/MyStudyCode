/*
 * 功能:演示java集合的用法
 */
package com.list;

//先引入一个包
import java.util.*;
public class AArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();//定义ArrayList对象
		System.out.println("al大小:"+al.size());//显示大小
		//向al中加入数据(类型是Object)
		//创建一个职员
		Clerk clerk1=new Clerk("宋江",50,1000);
		Clerk clerk2=new Clerk("吴用",40,1200);
		//将clerk1加入到al中
		al.add(clerk1);
		al.add(clerk2);
		al.add(clerk1);//可以重复加入
		System.out.println("al大小:"+al.size());//显示大小
		
		//如何访问al中的对象(数据)
		//访问第一个对象
		Clerk temp=(Clerk)al.get(0);//后者返回的是Object类,需要强制转换成Clerk类
		System.out.println("第一个的名字是:"+temp.getName());
		//遍历al所有的对象
		for(int i=0;i<al.size();i++) {
			Clerk temp1=(Clerk)al.get(i);
			System.out.println("第"+(i+1)+"个人的名字是:"+temp1.getName());
		}
		
		//如何从al中删除一个对象
		al.remove(1);
		//遍历al所有的对象
		for(int i=0;i<al.size();i++) {
			Clerk temp1=(Clerk)al.get(i);
			System.out.println("第"+(i+1)+"个人的名字是:"+temp1.getName());
		}
	}

	private String size() {
		// TODO Auto-generated method stub
		return null;
	}

}
//定义一个员工类
class Clerk{
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
	public float getSal() {
		return sal;
	}
	public void setSal(float sal) {
		this.sal = sal;
	}
	private int age;
	private float sal;
	public Clerk(String name,int age,float sal) {
		this.name=name;
		this.age=age;
		this.sal=sal;
	}
}
