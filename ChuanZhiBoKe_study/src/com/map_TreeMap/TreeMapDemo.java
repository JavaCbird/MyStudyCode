package com.map_TreeMap;
/*
 * ����:ͳ���ַ������ַ�����Ŀ
 * 	TreeMap���Խ����Զ�����
 */
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�����ַ���:");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char[] cs=s.toCharArray();
		
		TreeMap<Character,Integer> tm=new TreeMap<Character,Integer>();
		for(char c:cs){
			Integer value=tm.get(c);
//			System.out.println(value);
			if(value==null) {
				tm.put(c, 1);
			}else if(value!=null) {
				value++;
				tm.put(c, value);
			}
		}
		
		StringBuilder sb=new StringBuilder();
		Set<Character> keys=tm.keySet();
		for(Character key:keys) {
			Integer value=tm.get(key);
//			System.out.print(key+"("+value+")");
			sb.append(key).append("(").append(value).append(")");
		}
		String result=sb.toString(); 
		System.out.println(result);
		
		sc.close();
	}
}
