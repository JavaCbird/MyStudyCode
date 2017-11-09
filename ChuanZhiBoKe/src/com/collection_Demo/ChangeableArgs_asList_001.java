/*
 * public static <T> List<T> asList(T... a) 功能:将数组转成集合
 * 注意事项:得到的集合只能对元素修改,而不能增删,因为,该集合本质上是数组,长度不能改变
 */
package com.collection_Demo;

import java.util.Arrays;
import java.util.List;

public class ChangeableArgs_asList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArray= {"hello","world","jave"};
		List<String> list=Arrays.asList(strArray);
		
//		list.add("javaee");
//		list.remove(1);
		list.set(1, "javaee");
		
		for(String s:list) {
			System.out.println(s);
		}
	}

}
