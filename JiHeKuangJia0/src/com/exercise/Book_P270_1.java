package com.exercise;

import java.util.*;

public class Book_P270_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List al=new ArrayList();
		for(int i=1;i<=100;i++) {
			al.add(i);
		}
		Iterator it=al.iterator();
		System.out.println("所有整数:");
		while(it.hasNext()) {
			int a=(int)it.next();
			System.out.print(a+" ");
			if(a%20==0) {
				System.out.println();
			}
		}
		
		System.out.println("移除之后的整数:");
		al.remove(al.get(10));
		it=al.iterator();
		while(it.hasNext()) {
			int b=(int)it.next();
			System.out.print(b+" ");
			if(b%20==0) {
				System.out.println();
			}
		}
	}
}
