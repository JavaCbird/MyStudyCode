package com.collection_Demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("����������:");
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> al=new ArrayList<Integer>();
		while(true) {
			int num=sc.nextInt();
			if(num!=0) {
				al.add(num);
			}else {
				break;
			}
		}
		
		//����ת������
		Integer[] i=new Integer[al.size()];
		al.toArray(i);
		Arrays.sort(i);
		System.out.println("����Ϊ:"+arrayToString(i)+"���ֵΪ:"+i[i.length-1]);
	}

	public static String arrayToString(Integer[] i) {
		StringBuilder sb=new StringBuilder();
		sb.append('[');
		for(int x=0;x<i.length;x++) {
			if(x==i.length-1) {
				sb.append(i[x]);
			}else {
				sb.append(i[x]).append(" , ");
			}
		}
		sb.append(']');
		return sb.toString();
	}
}
