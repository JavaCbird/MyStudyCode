package com.collection_Demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Poker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//创建扑克牌
		ArrayList<String> arrays=new ArrayList<String>();
		
		String[] colors= {"♡","♠","♧","♢"};
		String[] numbers= {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		
		for(String color:colors) {
			for(String number:numbers) {
				//方法1
//				StringBuilder sb=new StringBuilder();
//				String res=sb.append(color).append(number).toString();
//				arrays.add(res);
				//方法2
				arrays.add(color.concat(number));
				//方法3
//				arrays.add(color+number);
			}
		}
		arrays.add("小王");
		arrays.add("大王");
		
		//洗牌
		Collections.shuffle(arrays);
		
		for(String array:arrays) {
			System.out.println(array);
		}
		
		//发牌
		ArrayList<String> zzc=new ArrayList<String>();
		ArrayList<String> ysd=new ArrayList<String>();
		ArrayList<String> ws=new ArrayList<String>();
		ArrayList<String> DiPai=new ArrayList<String>();
		
		for(int i=0;i<arrays.size();i++) {
			if(i>=arrays.size()-3) {
				DiPai.add(arrays.get(i));
			}else if(i%3==0){
				zzc.add(arrays.get(i));
			}else if(i%3==1){
				ysd.add(arrays.get(i));
			}else if(i%3==2){
				ws.add(arrays.get(i));
			}
		}
		
		//看牌
		lookPoker("朱智超",zzc);
		lookPoker("闫思达",ysd);
		lookPoker("吴松",ws);
		lookPoker("底牌",DiPai);
	}
	
	//写一个看牌功能
	public static void lookPoker(String name,ArrayList<String> array) {
		ArrayList<String> al=new ArrayList<String>();
		for(String s:array) {
			al.add(s);
		}
		Collections.sort(al);
		System.out.println(name+"的牌是:");
		System.out.println("\t"+al);
	}
}
