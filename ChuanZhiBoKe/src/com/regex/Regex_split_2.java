/*
 * ��ֹ�����ϰ
 */
package com.regex;

public class Regex_split_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//��ִ���","��
		String str1="aa,bb,cc";
		String[] strs1=str1.split(",");
		for(int i=0;i<strs1.length;i++) {
			System.out.println(strs1[i]);
		}
		System.out.println("---------------------");
		
		//��ִ���"."��
		String str2="aa.bb.cc";
		String[] strs2=str2.split("\\.");
		for(int i=0;i<strs2.length;i++) {
			System.out.println(strs2[i]);
		}
		System.out.println("---------------------");
		
		//��ִ�����Ŀ��ȷ���Ŀո��
		String str3="aa    bb              cc";
		String[] strs3=str3.split(" +");
		for(int i=0;i<strs3.length;i++) {
			System.out.println(strs3[i]);
		}
		System.out.println("---------------------");
		
		//���һ��·��
		String str4="F:\\java��ϰ�ļ�\\cc";
		String[] strs4=str4.split("\\\\");		//  "\\"Ҫ��"\\\\"��ʾ
		for(int i=0;i<strs4.length;i++) {
			System.out.println(strs4[i]);
		}
		System.out.println("---------------------");
	}

}
