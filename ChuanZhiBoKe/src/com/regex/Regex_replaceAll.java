/*
 * ÑÝÊ¾Ìæ»»¹¦ÄÜ
 */
package com.regex;

public class Regex_replaceAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="hello123world06874343";
		
		String regex1="\\d";
		String replacement1="*";
		String result1=str.replaceAll(regex1, replacement1);
		System.out.println(result1);
		System.out.println("---------------------------");
		
		String regex2="\\d+";
		String replacement2="*";
		String result2=str.replaceAll(regex2, replacement2);
		System.out.println(result2);
		System.out.println("---------------------------");
	}

}
