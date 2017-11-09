/*
 * 功能: 验证final关键字
 */
package com.zzc;

public class Final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		//System.out.println(s1.a);
	}

}

class People{
	/*int a;  //如果不给a赋初值,则默认为a==0,但一般应该赋初值 */
	final int b=2;  //必须赋初值
	final public void sendMes() {
		System.out.println("发送消息!");
	}
}

class Student extends People{
	/*public void sendMes() {        //无法继承父类中的sendMes()方法
		System.out.println("发送消息!");
	}*/
	public Student() {
		//a++;
		//b++;  子类不能引用此变量
	}
}

/*final class Aaa{
	
}

class Bbb extends Aaa{      //类Bbb不能继承用final修饰的类Aaa
	
}*/