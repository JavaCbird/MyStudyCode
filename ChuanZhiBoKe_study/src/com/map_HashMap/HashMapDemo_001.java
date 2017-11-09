package com.map_HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> hm=new HashMap<String,String>();
		
		hm.put("邓超", "孙俪");
		hm.put("文章", "马伊琍");
		hm.put("黄晓明", "杨颖");
		hm.put("刘恺威", "杨幂");
		
		//方法1(掌握):根据键找值
		//获取所有键的集合
		Set<String> keys=hm.keySet();
		//遍历键的集合,得到每一个键
		for(String key:keys) {
			//根据键找值
			String value=hm.get(key);
			System.out.println(key+"----"+value);
		}
		
//		//方法2(理解):根据键值对对象找键和值
//		//获取所有键值对对象的集合
//		Set<Map.Entry<String, String>> set=hm.entrySet();
//		//遍历键值对对象的集合,得到每一个键值对对象
//		for(Map.Entry<String, String> me:set) {
//			//根据键值对对象找键和值
//			String key=me.getKey();
//			String value=me.getValue();
//			System.out.println(key+"----"+value);
//		}
		
		//只获得值
		Collection<String> value=hm.values();
		System.out.println(value);
	}

}
