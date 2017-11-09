/*
 * 拆分功能练习
 */
package com.regex;

public class Regex_split_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//拆分带有","的
		String str1="aa,bb,cc";
		String[] strs1=str1.split(",");
		for(int i=0;i<strs1.length;i++) {
			System.out.println(strs1[i]);
		}
		System.out.println("---------------------");
		
		//拆分带有"."的
		String str2="aa.bb.cc";
		String[] strs2=str2.split("\\.");
		for(int i=0;i<strs2.length;i++) {
			System.out.println(strs2[i]);
		}
		System.out.println("---------------------");
		
		//拆分带有数目不确定的空格的
		String str3="aa    bb              cc";
		String[] strs3=str3.split(" +");
		for(int i=0;i<strs3.length;i++) {
			System.out.println(strs3[i]);
		}
		System.out.println("---------------------");
		
		//拆分一个路径
		String str4="F:\\java练习文件\\cc";
		String[] strs4=str4.split("\\\\");		//  "\\"要用"\\\\"表示
		for(int i=0;i<strs4.length;i++) {
			System.out.println(strs4[i]);
		}
		System.out.println("---------------------");
	}

}
