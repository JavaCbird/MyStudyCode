/*
 * ��ʾ��ֹ���
 * 	����:���䷶Χ:18-24
 */
package com.regex;

import java.util.Scanner;

public class Regex_split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("����������:");
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		
		String ages="18-24";
		//�����ֹ���
		String regex="-";
		String[] strs=ages.split(regex);
		int startAge=Integer.parseInt(strs[0]);
		int endAge=Integer.parseInt(strs[1]);
		if(age>=startAge && age<=endAge) {
			System.out.println("����������ҵ�");
		}else {
			System.out.println("�㲻�������ҵ�");
		}
	}

}
