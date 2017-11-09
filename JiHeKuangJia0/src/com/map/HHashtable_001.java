package com.map;

import java.util.HashMap;
import java.util.Hashtable;

public class HHashtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Hashtable ht=new Hashtable();
		ht.put(null,null);
		System.out.println("测试:"+ht.get(null));*/
		/*
		 * Hashtable不允许放入空值,否则运行时会报错;而HashMap允许放入空值
		 */
		HashMap hm=new HashMap();
		hm.put(null, null);
		System.out.println("测试:"+hm.get(null));
	}

}
