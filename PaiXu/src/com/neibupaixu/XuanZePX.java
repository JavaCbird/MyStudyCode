/*
 * 功能:选择排序法
 */
package com.neibupaixu;

import java.util.Calendar;

public class XuanZePX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int arr[]= {2,4,-6,23,-1,3};
		
		//随机产生数组
		int len=100000;
		int arr[]=new int[len];
		for(int i=0;i<len;i++) {
			//让程序随机产生一个1~10000的数
			//Math.random()会产生一个0~1的数
			arr[i]=(int)(Math.random()*10000);
			
		}
		Select se=new Select();
		
		Calendar cal=Calendar.getInstance();  //在排序前打印系统时间
		System.out.println("排序前:"+cal.getTime());
		se.sort(arr);
		cal=Calendar.getInstance();  //在排序后打印系统时间
		System.out.println("排序后:"+cal.getTime());
	}

}

class Select{
	//选择排序
	public void sort(int arr[]) {
		int temp;
		for(int i=0;i<arr.length-1;i++) {  //最后一个不参与比较
			int min=arr[i];  //首先认为第一个数就是最小的
			int min_index=i;  //记录最小数的下标
			
			for(int j=i+1;j<arr.length;j++) {
				if(min>arr[j]) {
					min=arr[j];
					min_index=j;
				}
			}
			//当退出for循环时就找到这次的最小值
			temp=arr[i];
			arr[i]=arr[min_index];
			arr[min_index]=temp;
		}
		//输出结果
		//数字太多,将输出注释掉
		/*for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}*/
	}
	
}