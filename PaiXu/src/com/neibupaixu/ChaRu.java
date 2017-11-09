/*
 * 功能:插入式排序法,从小到大排序
 */
package com.neibupaixu;

import java.util.Calendar;

public class ChaRu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int arr[]= {5,4,9,-5,3,1,8};
		//让程序随机产生一个数组
		int len=100000;
		int arr[]=new int[len];
		for(int i=0;i<len;i++) {
			arr[i]=(int)(Math.random()*10000);
		}
		InsertSort ins=new InsertSort();
		
		Calendar cal=Calendar.getInstance();
		System.out.println("排序前:"+cal.getTime());
		ins.sort(arr);
		cal=Calendar.getInstance();
		System.out.println("排序后:"+cal.getTime());
	}

}

class InsertSort{
	public void sort(int arr[]) {
		for(int i=1;i<arr.length;i++) {
			int insertVal=arr[i];
			//insertVal准备和前一个数比较
			int index=i-1;
			while(index>=0&&insertVal<arr[index]) {
				arr[index+1]=arr[index];  //把arr[index]向后移动
				index--;  //让index向前移动,继续与insertVal比较
			}
			arr[index+1]=insertVal;  //将insertVal插入到适当位置
		}
	/*	for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}*/
	}
}