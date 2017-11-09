package com.erweishuzu;

public class ShuChu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]=new int[4][6];  //自动将全部元素初始化为0
		Sharp sh=new Sharp();
		sh.print(a);
	}

}

class Sharp{
	public void print(int a[][]) {
		a[1][2]=1;
		a[2][1]=2;
		a[2][3]=3;
		for(int i=0;i<4;i++) {
			for(int j=0;j<6;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}