/*
 * ����:ѡ������
 */
package com.neibupaixu;

import java.util.Calendar;

public class XuanZePX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int arr[]= {2,4,-6,23,-1,3};
		
		//�����������
		int len=100000;
		int arr[]=new int[len];
		for(int i=0;i<len;i++) {
			//�ó����������һ��1~10000����
			//Math.random()�����һ��0~1����
			arr[i]=(int)(Math.random()*10000);
			
		}
		Select se=new Select();
		
		Calendar cal=Calendar.getInstance();  //������ǰ��ӡϵͳʱ��
		System.out.println("����ǰ:"+cal.getTime());
		se.sort(arr);
		cal=Calendar.getInstance();  //��������ӡϵͳʱ��
		System.out.println("�����:"+cal.getTime());
	}

}

class Select{
	//ѡ������
	public void sort(int arr[]) {
		int temp;
		for(int i=0;i<arr.length-1;i++) {  //���һ��������Ƚ�
			int min=arr[i];  //������Ϊ��һ����������С��
			int min_index=i;  //��¼��С�����±�
			
			for(int j=i+1;j<arr.length;j++) {
				if(min>arr[j]) {
					min=arr[j];
					min_index=j;
				}
			}
			//���˳�forѭ��ʱ���ҵ���ε���Сֵ
			temp=arr[i];
			arr[i]=arr[min_index];
			arr[min_index]=temp;
		}
		//������
		//����̫��,�����ע�͵�
		/*for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}*/
	}
	
}