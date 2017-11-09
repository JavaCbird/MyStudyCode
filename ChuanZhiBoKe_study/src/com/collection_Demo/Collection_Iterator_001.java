package com.collection_Demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Collection_Iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection c=new ArrayList();
		c.add("hello");
		c.add("world");
		c.add("java");
		//µü´ú
		Iterator it=c.iterator();
		while(it.hasNext()) {
//			System.out.println(it.next());
			String s=(String)it.next();
			System.out.println(s);
		}
	}

}
