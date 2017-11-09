package com.homework;
import java.util.*;
public class JiSuanTaoZi {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JiSuanTaoZi.scan();
	}
	//day表示想得到哪天的桃子树,sday表示吃了多少天剩下一个
	public static int peach(int day,int sday) {
		if(day==sday) {
			return 1;
		}
		else {
			//运用递归
			return((peach(day+1,sday)+1)*2);
		}
	}
	public static void scan() {
		System.out.println("请输入两个数:");
		Scanner sr=new Scanner(System.in);
		int a=sr.nextInt();
		int b=sr.nextInt();
				
		if(a<b) {
			System.out.println(JiSuanTaoZi.peach(a, b));
		}
		else {
			System.out.println("第一个数要小于第二个数!");
			JiSuanTaoZi.scan();
		}
	}
}
