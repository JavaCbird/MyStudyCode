/*
 * 功能:可以计算4只狗的平均体重,找出体重最大和最小的狗的名字;可以通过输入狗的名字,查找它的体重
 */
package com.shuzu;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DuiXiangShuZu {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		//定义一个可以存放四只狗的对象数组
		Dog dogs[]=new Dog[4];
		
		//给各个狗赋初值
		/*dogs[0]=new Dog();
		dogs[0].setName("花花");
		dogs[0].setWeight(4.5f);*/
		
		//从控制台输入各个狗的信息
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		for(int i=0;i<4;i++) {
			dogs[i]=new Dog();
			System.out.println("请输入第"+(i+1)+"只狗的名字:");
			//从控制台读取狗名
			String name=br.readLine();//出现异常,通过throws Exception扔出去
			dogs[i].setName(name);//将名字赋给对象
			System.out.println("请输入第"+(i+1)+"只狗的体重:");
			String s_weight=br.readLine();//读入的是一个字符串
			float weight=Float.parseFloat(s_weight);//将String型转化成float型
			dogs[i].setWeight(weight);//将体重赋给对象
		}
		//先计算总体重
		float all_weight=0;
		for(int i=0;i<4;i++) {
			all_weight+=dogs[i].getWeight();
		}
		//计算平均值
		System.out.println("总体重为:"+all_weight+" 平均值为:"+(all_weight/dogs.length));
		
		//找出体重最大的狗
		float max_weight=dogs[0].getWeight();
		int max_index=0;
		for(int i=1;i<dogs.length;i++) {
			if(max_weight<dogs[i].getWeight()) {
				max_weight=dogs[i].getWeight();
				max_index=i;
			}
		}
		System.out.println("体重最大的狗是第"+(max_index+1)+"只    体重是:"+max_weight);
		
		//找出体重最小的狗
		float min_weight=dogs[0].getWeight();
		int min_index=0;
		for(int i=1;i<dogs.length;i++) {
			if(min_weight<dogs[i].getWeight()) {
				min_weight=dogs[i].getWeight();
				min_index=i;
			}
		}
		System.out.println("体重最小的狗是第"+(min_index+1)+"只    体重是:"+min_weight);
	}
}
//定义一个狗类
class Dog{
	private String name;
	private float weight;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight=weight;
	}
}