/*
 * ����: ��֤final�ؼ���
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
	/*int a;  //�������a����ֵ,��Ĭ��Ϊa==0,��һ��Ӧ�ø���ֵ */
	final int b=2;  //���븳��ֵ
	final public void sendMes() {
		System.out.println("������Ϣ!");
	}
}

class Student extends People{
	/*public void sendMes() {        //�޷��̳и����е�sendMes()����
		System.out.println("������Ϣ!");
	}*/
	public Student() {
		//a++;
		//b++;  ���಻�����ô˱���
	}
}

/*final class Aaa{
	
}

class Bbb extends Aaa{      //��Bbb���ܼ̳���final���ε���Aaa
	
}*/