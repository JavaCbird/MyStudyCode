/*
 * public static <T> List<T> asList(T... a) ����:������ת�ɼ���
 * ע������:�õ��ļ���ֻ�ܶ�Ԫ���޸�,��������ɾ,��Ϊ,�ü��ϱ�����������,���Ȳ��ܸı�
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
