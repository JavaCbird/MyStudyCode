package com.homework;
import java.util.*;
public class JiSuanTaoZi {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JiSuanTaoZi.scan();
	}
	//day��ʾ��õ������������,sday��ʾ���˶�����ʣ��һ��
	public static int peach(int day,int sday) {
		if(day==sday) {
			return 1;
		}
		else {
			//���õݹ�
			return((peach(day+1,sday)+1)*2);
		}
	}
	public static void scan() {
		System.out.println("������������:");
		Scanner sr=new Scanner(System.in);
		int a=sr.nextInt();
		int b=sr.nextInt();
				
		if(a<b) {
			System.out.println(JiSuanTaoZi.peach(a, b));
		}
		else {
			System.out.println("��һ����ҪС�ڵڶ�����!");
			JiSuanTaoZi.scan();
		}
	}
}
