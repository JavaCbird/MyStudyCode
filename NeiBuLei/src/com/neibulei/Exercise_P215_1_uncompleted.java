package com.neibulei;

public class Exercise_P215_1_uncompleted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outclass oc=new Outclass();
		Outinterface oi=oc.doit();
		oi.f();
	}

}

//定义一个接口
interface Outinterface{
	public void f();
}

//外部类
class Outclass{
	public Outinterface doit() {  //定义doit()方法
		return new Outinterface() {  //声明匿名内部类
			private int i=0;
			public int getValue(){
				System.out.println("aa");  //不明白为什么不能输出
				return i;
			}
			public void f() {
				System.out.println("aaa");
			}
		};
		
	}
}