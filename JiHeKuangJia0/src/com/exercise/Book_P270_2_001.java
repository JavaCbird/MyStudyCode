/*
 * 功能:观察重复值能否在List集合与Set集合中添加.  结论是:重复值能在List集合中添加,但不能在Set集合中添加
 */
package com.exercise;

import java.util.*;

public class Book_P270_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set ts=new TreeSet();
		List ll=new LinkedList();
		
		ts.add("A");
		ts.add("a");
		ts.add("c");
		ts.add("C");
		ts.add("a");
		
		ll.add("A");
		ll.add("a");
		ll.add("c");
		ll.add("C");
		ll.add("a");
		
		System.out.println(ts);
		System.out.println(ll);
	}

}
