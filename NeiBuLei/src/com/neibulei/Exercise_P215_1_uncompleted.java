package com.neibulei;

public class Exercise_P215_1_uncompleted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outclass oc=new Outclass();
		Outinterface oi=oc.doit();
		oi.f();
	}

}

//����һ���ӿ�
interface Outinterface{
	public void f();
}

//�ⲿ��
class Outclass{
	public Outinterface doit() {  //����doit()����
		return new Outinterface() {  //���������ڲ���
			private int i=0;
			public int getValue(){
				System.out.println("aa");  //������Ϊʲô�������
				return i;
			}
			public void f() {
				System.out.println("aaa");
			}
		};
		
	}
}