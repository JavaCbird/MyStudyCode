/*
 * 演示拆分功能
 * 	举例:年龄范围:18-24
 */
package com.regex;

import java.util.Scanner;

public class Regex_split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入年龄:");
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		
		String ages="18-24";
		//定义拆分规则
		String regex="-";
		String[] strs=ages.split(regex);
		int startAge=Integer.parseInt(strs[0]);
		int endAge=Integer.parseInt(strs[1]);
		if(age>=startAge && age<=endAge) {
			System.out.println("你就是我想找的");
		}else {
			System.out.println("你不是我想找的");
		}
	}

}
