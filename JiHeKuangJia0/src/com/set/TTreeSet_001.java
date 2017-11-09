/*
 * 题目在P264
 */
package com.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TTreeSet implements Comparable<Object>{
	String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	long id;
	public TTreeSet(String name,long id) {
		this.name=name;
		this.id=id;
	}
	public int compareTo(Object o) {
		TTreeSet ts=(TTreeSet)o;
		int result=id>ts.id?1:(id==ts.id?0:-1);
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建TTreeSet对象
		TTreeSet ts1=new TTreeSet("李同学",01011);
		TTreeSet ts2=new TTreeSet("陈同学",01021);
		TTreeSet ts3=new TTreeSet("王同学",01051);
		TTreeSet ts4=new TTreeSet("马同学",01012);
		
		TreeSet tree=new TreeSet();
		tree.add(ts1);  //向集合中添加对象
		tree.add(ts2);
		tree.add(ts3);
		tree.add(ts4);
		
		Iterator it=tree.iterator();//Set集合中所有对象的迭代器
		System.out.println("集合中的所有对象:");
		while(it.hasNext()) {   //遍历集合
			TTreeSet ts=(TTreeSet)it.next();
			System.out.println(ts.getId()+" "+ts.getName());
		}
		
		System.out.println("截取前面部分的集合:");
		it=tree.headSet(ts2).iterator();  //截取排在ts2之前的对象
		while(it.hasNext()) {   //遍历集合
			TTreeSet ts=(TTreeSet)it.next();
			System.out.println(ts.getId()+" "+ts.getName());
		}
		
		System.out.println("截取中间部分的集合:");
		it=tree.subSet(ts2,ts3).iterator();  //截取排在ts2与ts3之间的对象
		while(it.hasNext()) {   //遍历集合
			TTreeSet ts=(TTreeSet)it.next();
			System.out.println(ts.getId()+" "+ts.getName());
		}
	}

}
