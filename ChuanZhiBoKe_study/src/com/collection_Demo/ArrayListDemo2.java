package com.collection_Demo;
/*
 * ����:��ʹ���¼��ϵ������,ȥ��ArrayList�����е��ظ�ֵ
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
					//�Ƴ�һ���ظ���֮��,����ľͻᲹ����,���������¼��ԭλ���Ƿ��ظ�,Ϊ��ֹ��©��֮��,
					//��j--,��j++,ʹ������ԭλ��
					j--;	
				}
			}
		}
		
//		//ʹ����ǿfor(ò�ƴ���������ʹ��)
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
		
		//ʹ����ǿfor
		if(array!=null) {
			for(String s:array) {
				System.out.println(s);
			}
		}
	}

}
