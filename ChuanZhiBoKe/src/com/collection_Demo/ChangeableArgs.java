/*
 * ����:��ʾ�ɱ����
 */
package com.collection_Demo;

public class ChangeableArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result=sum(10,20,30);
		System.out.println(result);
		result=sum(10,20,30,40);
		System.out.println(result);
		result=sum(10,20,30,40,50);
		System.out.println(result);
	}

	public static int sum(int...a) {
		int s=0;
		for(int t:a) {	//aʵ����һ������
			s+=t;
		}
		return s;
	}
}
