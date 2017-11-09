package com.collection_Demo;

import java.util.ArrayList;
import java.util.Collection;

public class Collection_Demo_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection c=new ArrayList();
		c.add("hello");
		c.add("world");
		c.add("java");
		Object[] objs=c.toArray();
//		for(int i=0;i<objs.length;i++) {
////			System.out.println(objs[i]);
//			String s=(String)objs[i];
//			System.out.println(s+"----"+s.length());
//		}
		
		//使用增强for
		if(objs!=null) {
			for(Object obj:objs) {
//				System.out.println(obj);
				String s=(String)obj;
				System.out.println(s+"----"+s.length());
			}
		}
	}

}
