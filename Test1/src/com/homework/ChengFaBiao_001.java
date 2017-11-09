package com.homework;

public class ChengFaBiao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChengFaBiao.set(5);
	}
	public static void set(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				if(i==3&&j==3||i==4&&j==3) {
					System.out.print(" "+i+"*"+j+"="+i*j+" ");
				}
				else {
					System.out.print(i+"*"+j+"="+i*j+" ");
				}
			}
			System.out.println();
		}
	}
}
