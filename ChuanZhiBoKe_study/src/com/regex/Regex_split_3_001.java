package com.regex;

import java.util.Arrays;

public class Regex_split_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="69 54 86 25 37 16";
		String[] strs=str.split(" ");
		int[] nums=new int[strs.length];
		for(int i=0;i<strs.length;i++) {
			nums[i]=Integer.parseInt(strs[i]);
		}
		
		//¶ÔnumsÊý×éÅÅÐò
		Arrays.sort(nums);
		
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<nums.length;i++) {
			sb.append(nums[i]).append(" ");
		}
		String result=sb.toString().trim();
		System.out.println(result);
	}

}
