package com.collection_Demo;
/*
 * 功能:不使用新集合的情况下,去掉ArrayList集合中的重复值
 */
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> array=new ArrayList<String>();
		
		array.add("hello");
		array.add("world");
		array.add("hello");
		array.add("hello");
		array.add("java");
		array.add("java");
		array.add("world");
		
		for(int i=0;i<array.size()-1;i++) {
			String s1=array.get(i);
			for(int j=i+1;j<array.size();j++) {
				String s2=array.get(j);
				if(s1.equals(s2)) {
					array.remove(j);
					//移除一个重复的之后,后面的就会补上来,而不会重新检测原位置是否重复,为防止有漏网之鱼,
					//先j--,再j++,使其仍在原位置
					j--;	
				}
			}
		}
		
//		//使用增强for(貌似此例不适宜使用)
//		if(array!=null) {
//			for(String s1:array) {
//				
//			}
//		}
		
//		Iterator<String> it=array.iterator();
//		while(it.hasNext()) {
//			String s=it.next();
//			System.out.println(s);
//		}
		
		//使用增强for
		if(array!=null) {
			for(String s:array) {
				System.out.println(s);
			}
		}
	}

}
