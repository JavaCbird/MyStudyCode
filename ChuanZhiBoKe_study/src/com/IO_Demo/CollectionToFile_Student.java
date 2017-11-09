package com.IO_Demo;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/*
 * ����:����¼��ѧ���ɼ���Ϣ,���ɸߵ��ʹ浽�ļ���
 */
public class CollectionToFile_Student {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		TreeSet<Student> stus=new TreeSet<Student>(new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				int num=o2.getSum()-o1.getSum();
				int num2= num==0 ? o2.getChinese()-o1.getChinese() : num;
				int num3= num2==0 ? o2.getMath()-o1.getMath() : num2;
				int num4= num3==0 ? o2.getEnglish()-o1.getEnglish() : num3;
				int num5= num4==0 ? o2.getName().compareTo(o1.getName()) : num4;
				return num5;
			}
		});
		
		//����¼��ѧ���ɼ�,�洢������
		for(int i=1;i<=5;i++) {
			Student stu=new Student();
			Scanner sc=new Scanner(System.in);
			System.out.println("�����"+i+"��ѧ��������:");
			stu.setName(sc.nextLine());
			System.out.println("�����"+i+"��ѧ�������ĳɼ�:");
			stu.setChinese(sc.nextInt());
			System.out.println("�����"+i+"��ѧ������ѧ�ɼ�:");
			stu.setMath(sc.nextInt());
			System.out.println("�����"+i+"��ѧ����Ӣ��ɼ�:");
			stu.setEnglish(sc.nextInt());
			
			stus.add(stu);
		}
		
		//�������е�Ԫ�ش洢���ļ�
		BufferedWriter bw=new BufferedWriter(new FileWriter("f:/java��ϰ�ļ�/IO_Demo/Student.txt"));
		for(Student stu:stus) {
			bw.write("����:"+stu.getName());
			bw.write("----");
			bw.write("�ܳɼ�:"+stu.getSum());
			bw.write("--");
			bw.write("����:"+stu.getChinese());
			bw.write("--");
			bw.write("��ѧ:"+stu.getMath());
			bw.write("--");
			bw.write("Ӣ��:"+stu.getEnglish());
			bw.newLine();
			bw.flush();
		}
		bw.close();
	}

}

class Student{
	private String name;
	private int chinese;
	private int math;
	private int english;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getChinese() {
		return chinese;
	}
	public void setChinese(int chinese) {
		this.chinese = chinese;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	
	public int getSum() {
		return this.chinese+this.math+this.english;
	}
	public Student(String name, int chinese, int math, int english) {
		super();
		this.name = name;
		this.chinese = chinese;
		this.math = math;
		this.english = english;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}