/*
 * ����:��ʾjava���ϵ��÷�
 */
package com.list;

//������һ����
import java.util.*;
public class AArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();//����ArrayList����
		System.out.println("al��С:"+al.size());//��ʾ��С
		//��al�м�������(������Object)
		//����һ��ְԱ
		Clerk clerk1=new Clerk("�ν�",50,1000);
		Clerk clerk2=new Clerk("����",40,1200);
		//��clerk1���뵽al��
		al.add(clerk1);
		al.add(clerk2);
		al.add(clerk1);//�����ظ�����
		System.out.println("al��С:"+al.size());//��ʾ��С
		
		//��η���al�еĶ���(����)
		//���ʵ�һ������
		Clerk temp=(Clerk)al.get(0);//���߷��ص���Object��,��Ҫǿ��ת����Clerk��
		System.out.println("��һ����������:"+temp.getName());
		//����al���еĶ���
		for(int i=0;i<al.size();i++) {
			Clerk temp1=(Clerk)al.get(i);
			System.out.println("��"+(i+1)+"���˵�������:"+temp1.getName());
		}
		
		//��δ�al��ɾ��һ������
		al.remove(1);
		//����al���еĶ���
		for(int i=0;i<al.size();i++) {
			Clerk temp1=(Clerk)al.get(i);
			System.out.println("��"+(i+1)+"���˵�������:"+temp1.getName());
		}
	}

	private String size() {
		// TODO Auto-generated method stub
		return null;
	}

}
//����һ��Ա����
class Clerk{
	private String name;
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
	public float getSal() {
		return sal;
	}
	public void setSal(float sal) {
		this.sal = sal;
	}
	private int age;
	private float sal;
	public Clerk(String name,int age,float sal) {
		this.name=name;
		this.age=age;
		this.sal=sal;
	}
}
