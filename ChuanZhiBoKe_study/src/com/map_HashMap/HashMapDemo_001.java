package com.map_HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> hm=new HashMap<String,String>();
		
		hm.put("�˳�", "��ٳ");
		hm.put("����", "�����P");
		hm.put("������", "��ӱ");
		hm.put("������", "����");
		
		//����1(����):���ݼ���ֵ
		//��ȡ���м��ļ���
		Set<String> keys=hm.keySet();
		//�������ļ���,�õ�ÿһ����
		for(String key:keys) {
			//���ݼ���ֵ
			String value=hm.get(key);
			System.out.println(key+"----"+value);
		}
		
//		//����2(���):���ݼ�ֵ�Զ����Ҽ���ֵ
//		//��ȡ���м�ֵ�Զ���ļ���
//		Set<Map.Entry<String, String>> set=hm.entrySet();
//		//������ֵ�Զ���ļ���,�õ�ÿһ����ֵ�Զ���
//		for(Map.Entry<String, String> me:set) {
//			//���ݼ�ֵ�Զ����Ҽ���ֵ
//			String key=me.getKey();
//			String value=me.getValue();
//			System.out.println(key+"----"+value);
//		}
		
		//ֻ���ֵ
		Collection<String> value=hm.values();
		System.out.println(value);
	}

}
