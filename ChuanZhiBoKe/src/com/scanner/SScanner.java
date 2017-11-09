package com.scanner;

import java.util.Scanner;

public class SScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
//		if(sc.hasNextInt()) {
//			int x=sc.nextInt();
//			System.out.println("x="+x);
//		}
//		
//		if(sc.hasNextLine()) {
//			String c=sc.nextLine();
//			System.out.println(c);
//		}
		
//		String c=sc.nextLine();
//		String d=sc.nextLine();
//		System.out.println("c:"+c+" , d:"+d);
		
//		//先获取一个数值,再获取一个字符串,会出现问题
//		//主要原因是将换行符赋值给了字符串
//		int x=sc.nextInt();
//		String c=sc.nextLine();
//		System.out.println("x:"+x+" , c:"+c);
		
		//解决方法:把所有数据都先按照字符串获取,然后要什么,就对应转化为什么
//		if(sc.hasNextInt()) {
//			int x=sc.nextInt();
//		}else {
//			String s=sc.nextLine();
//		}
//		System.out.println("x:"+x+" , s:"+s);
		
	}

}
