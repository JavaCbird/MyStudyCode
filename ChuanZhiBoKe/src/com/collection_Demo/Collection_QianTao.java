/*
 * ����:��ʾ����Ƕ��
 */
package com.collection_Demo;

import java.util.ArrayList;

public class Collection_QianTao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Character ch_XYJ1=new Character("��ɮ", 30);
		Character ch_XYJ2=new Character("�����", 20);
		Character ch_XYJ3=new Character("��˽�", 20);
		Character ch_XYJ4=new Character("ɳɮ", 20);
		Character ch_XYJ5=new Character("�׹Ǿ�", 30);
		
		Character ch_SG1=new Character("����", 30);
		Character ch_SG2=new Character("��Ȩ", 30);
		Character ch_SG3=new Character("�ܲ�", 30);
		Character ch_SG4=new Character("�����", 30);
		
		Character ch_SHZ1=new Character("�ν�", 40);
		Character ch_SHZ2=new Character("����", 26);
		Character ch_SHZ3=new Character("����", 30);
		
		ArrayList<Character> ch_XYJ=new ArrayList<Character>();
		ch_XYJ.add(ch_XYJ1);
		ch_XYJ.add(ch_XYJ2);
		ch_XYJ.add(ch_XYJ3);
		ch_XYJ.add(ch_XYJ4);
		ch_XYJ.add(ch_XYJ5);
		
		ArrayList<Character> ch_SG=new ArrayList<Character>();
		ch_SG.add(ch_SG1);
		ch_SG.add(ch_SG2);
		ch_SG.add(ch_SG3);
		ch_SG.add(ch_SG4);
		
		ArrayList<Character> ch_SHZ=new ArrayList<Character>();
		ch_SHZ.add(ch_SHZ1);
		ch_SHZ.add(ch_SHZ2);
		ch_SHZ.add(ch_SHZ3);
		
		ArrayList<ArrayList<Character>> books=new ArrayList<ArrayList<Character>>();
		books.add(ch_XYJ);
		books.add(ch_SG);
		books.add(ch_SHZ);
		
		for(ArrayList<Character> book:books) {
//			if(book.contains(ch_XYJ)) {
//				System.out.println("���μ�:");
//				System.out.println("--------------");
//			}
			System.out.println("------------");
			for(Character ch:book) {
//				if(ch.equals(ch_XYJ)) {
//					System.out.println("���μ�:");
//				}
				System.out.println(ch.getName()+"----"+ch.getAge());
			}
		}
	}

}

class Character{
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
	
	public Character(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}	
}
