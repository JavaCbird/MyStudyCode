/*
 * ��Ŀ��P264
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
		//����TTreeSet����
		TTreeSet ts1=new TTreeSet("��ͬѧ",01011);
		TTreeSet ts2=new TTreeSet("��ͬѧ",01021);
		TTreeSet ts3=new TTreeSet("��ͬѧ",01051);
		TTreeSet ts4=new TTreeSet("��ͬѧ",01012);
		
		TreeSet tree=new TreeSet();
		tree.add(ts1);  //�򼯺�����Ӷ���
		tree.add(ts2);
		tree.add(ts3);
		tree.add(ts4);
		
		Iterator it=tree.iterator();//Set���������ж���ĵ�����
		System.out.println("�����е����ж���:");
		while(it.hasNext()) {   //��������
			TTreeSet ts=(TTreeSet)it.next();
			System.out.println(ts.getId()+" "+ts.getName());
		}
		
		System.out.println("��ȡǰ�沿�ֵļ���:");
		it=tree.headSet(ts2).iterator();  //��ȡ����ts2֮ǰ�Ķ���
		while(it.hasNext()) {   //��������
			TTreeSet ts=(TTreeSet)it.next();
			System.out.println(ts.getId()+" "+ts.getName());
		}
		
		System.out.println("��ȡ�м䲿�ֵļ���:");
		it=tree.subSet(ts2,ts3).iterator();  //��ȡ����ts2��ts3֮��Ķ���
		while(it.hasNext()) {   //��������
			TTreeSet ts=(TTreeSet)it.next();
			System.out.println(ts.getId()+" "+ts.getName());
		}
	}

}
