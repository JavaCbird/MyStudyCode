/*
 * ����:����ʽ����,��С��������
 */
package com.neibupaixu;

import java.util.Calendar;

public class ChaRu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int arr[]= {5,4,9,-5,3,1,8};
		//�ó����������һ������
		int len=100000;
		int arr[]=new int[len];
		for(int i=0;i<len;i++) {
			arr[i]=(int)(Math.random()*10000);
		}
		InsertSort ins=new InsertSort();
		
		Calendar cal=Calendar.getInstance();
		System.out.println("����ǰ:"+cal.getTime());
		ins.sort(arr);
		cal=Calendar.getInstance();
		System.out.println("�����:"+cal.getTime());
	}

}

class InsertSort{
	public void sort(int arr[]) {
		for(int i=1;i<arr.length;i++) {
			int insertVal=arr[i];
			//insertVal׼����ǰһ�����Ƚ�
			int index=i-1;
			while(index>=0&&insertVal<arr[index]) {
				arr[index+1]=arr[index];  //��arr[index]����ƶ�
				index--;  //��index��ǰ�ƶ�,������insertVal�Ƚ�
			}
			arr[index+1]=insertVal;  //��insertVal���뵽�ʵ�λ��
		}
	/*	for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}*/
	}
}