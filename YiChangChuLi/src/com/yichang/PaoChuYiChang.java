/*
 * �׳��쳣,������һ��ȥ����
 */
package com.yichang;

import java.io.FileReader;

public class PaoChuYiChang {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Father f=new Father();
		f.test1();
	}

}

class Father{
	private Son son=null;
	public Father(){  //���캯��
		son=new Son();
	}
	
	public void test1() throws Exception{
		System.out.println("1");
		son.test2();
		/*try {
			son.test2();
		} catch (Exception e) {
			// TODO: handle exception
		}*/
	}
}

class Son{
	public void test2() throws Exception{
		FileReader fr=null;
		fr=new FileReader("d:\\dd.txt"); //�����쳣,�����׳�
	}
}