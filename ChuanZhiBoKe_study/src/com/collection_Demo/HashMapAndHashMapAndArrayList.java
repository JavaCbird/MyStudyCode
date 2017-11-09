package com.collection_Demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class HashMapAndHashMapAndArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String,HashMap<String,ArrayList<NewStudent>>> czbkMap=new HashMap<String,HashMap<String,ArrayList<NewStudent>>>();
		//北京校区
		HashMap<String,ArrayList<NewStudent>> bjCzbkMap=new HashMap<String,ArrayList<NewStudent>>();
		
		ArrayList<NewStudent> bj_jc_al=new ArrayList<NewStudent>();
		NewStudent bj_jc_s1=new NewStudent("bj_jc_s1",21);
		NewStudent bj_jc_s2=new NewStudent("bj_jc_s2",20);
		bj_jc_al.add(bj_jc_s1);
		bj_jc_al.add(bj_jc_s2);
		
		ArrayList<NewStudent> bj_jy_al=new ArrayList<NewStudent>();
		NewStudent bj_jy_s1=new NewStudent("bj_jy_s1",21);
		NewStudent bj_jy_s2=new NewStudent("bj_jy_s2",20);
		bj_jy_al.add(bj_jy_s1);
		bj_jy_al.add(bj_jy_s2);
		
		bjCzbkMap.put("jc", bj_jc_al);
		bjCzbkMap.put("jy", bj_jy_al);
		
		//上海校区
		HashMap<String,ArrayList<NewStudent>> shCzbkMap=new HashMap<String,ArrayList<NewStudent>>();
		
		ArrayList<NewStudent> sh_jc_al=new ArrayList<NewStudent>();
		NewStudent sh_jc_s1=new NewStudent("sh_jc_s1",21);
		NewStudent sh_jc_s2=new NewStudent("sh_jc_s2",20);
		sh_jc_al.add(sh_jc_s1);
		sh_jc_al.add(sh_jc_s2);
		
		ArrayList<NewStudent> sh_jy_al=new ArrayList<NewStudent>();
		NewStudent sh_jy_s1=new NewStudent("sh_jy_s1",21);
		NewStudent sh_jy_s2=new NewStudent("sh_jy_s2",20);
		sh_jy_al.add(sh_jy_s1);
		sh_jy_al.add(sh_jy_s2);
		
		shCzbkMap.put("jc", sh_jc_al);
		shCzbkMap.put("jy", sh_jy_al);
		
		//广州校区
		HashMap<String,ArrayList<NewStudent>> gzCzbkMap=new HashMap<String,ArrayList<NewStudent>>();
		
		ArrayList<NewStudent> gz_jc_al=new ArrayList<NewStudent>();
		NewStudent gz_jc_s1=new NewStudent("gz_jc_s1",21);
		NewStudent gz_jc_s2=new NewStudent("gz_jc_s2",20);
		gz_jc_al.add(gz_jc_s1);
		gz_jc_al.add(gz_jc_s2);
		
		ArrayList<NewStudent> gz_jy_al=new ArrayList<NewStudent>();
		NewStudent gz_jy_s1=new NewStudent("gz_jy_s1",21);
		NewStudent gz_jy_s2=new NewStudent("gz_jy_s2",20);
		gz_jy_al.add(gz_jy_s1);
		gz_jy_al.add(gz_jy_s2);
		
		gzCzbkMap.put("jc", gz_jc_al);
		gzCzbkMap.put("jy", gz_jy_al);
		
		
		czbkMap.put("bj", bjCzbkMap);
		czbkMap.put("sh", shCzbkMap);
		czbkMap.put("gz", gzCzbkMap);
		
		
		//取出
		Set<String> czbkKeys=czbkMap.keySet();
		for(String czbkKey:czbkKeys) {
			System.out.println(czbkKey+"\t");
			HashMap<String,ArrayList<NewStudent>> czbkValue=czbkMap.get(czbkKey);
			Set<String> czbkValueKeys=czbkValue.keySet();
			for(String czbkValueKey:czbkValueKeys) {
				System.out.println("   "+czbkValueKey+"\t");
				ArrayList<NewStudent> stus=czbkValue.get(czbkValueKey);
				for(NewStudent stu:stus) {					
					System.out.println("       "+stu.getName()+"----"+stu.getAge());
				}
			}
		}
	}

}

class NewStudent {
	String name;
	int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public NewStudent(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public NewStudent() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "NewStudent [name=" + name + ", age=" + age + "]";
	}
	
}