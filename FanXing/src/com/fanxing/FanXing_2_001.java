package com.fanxing;

import java.lang.reflect.Method;

public class FanXing_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gen<Bird> gen1=new Gen<Bird>(new Bird());
		gen1.showTypeName();
		Bird bird=new Bird();
		bird.test1();
		bird.count(1, 2);
	}

}

class Bird{
	public void test1(){
		System.out.println("aa");
	}
	public void count(int a,int b){
		System.out.println((a+b));
	}
}

class Gen<T>{
	private T o;
	//构造函数
	public Gen(T o) {
		this.o=o;
	}
	//得到T的类型名称
	public void showTypeName() {
		System.out.println("类型是:"+o.getClass().getName());
	
		//通过反射机制,可以得到T这个类型的很多信息(方法名称、类型,构造函数,等等)
		Method[] m=o.getClass().getDeclaredMethods();
		for(int i=0;i<m.length;i++) {
			System.out.println(m[i].getName());
		}
	}
}