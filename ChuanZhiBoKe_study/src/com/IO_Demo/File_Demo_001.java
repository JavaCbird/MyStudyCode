package com.IO_Demo;

import java.io.File;
import java.io.IOException;

/*
 * ��������
 * ɾ������(java�е�ɾ�����߻���վ)
 * ����������(���·������ͬ,���Ǹ���;���·��������ͬ,���Ǽ��мӸ���)
 * �жϹ���
 * ��ȡ����
 */
public class File_Demo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		//�����ļ���
//		File file1=new File("f:/java��ϰ�ļ�/IO_Demo");
//		System.out.println("mkdir:"+file1.mkdir());
//		
//		//�����ļ�
//		File file2=new File(file1,"a.txt");
//		System.out.println("createNewFile:"+file2.createNewFile());
//		
//		//�ȴ����ļ���,���ڴ��ļ����´����ļ���(���ܴ����ļ�)
//		File file3=new File(file1,"aa/bb");
//		System.out.println("mkdirs"+file3.mkdirs());
//		
//		//ɾ���ļ����ļ���
//		System.out.println("delete f:/java��ϰ�ļ�/IO_Demo/a.txt:"+file2.delete());
//		System.out.println("delete f:/java��ϰ�ļ�/IO_Demo/aa/bb:"+file3.delete());
//		
//		//�����ļ��д���,����ֱ��ɾ�����ļ���
//		//IO_Demo�ļ����´���aa���ļ���,����ֱ��ɾ��,������ɾ��aa,��ɾ��IO_Demo
//		System.out.println("delete f:/java��ϰ�ļ�/IO_Demo:"+file1.delete());
//		
//		//����������
//		File file4=new File(file1,"����ϼ.jpg");
//		System.out.println("createNewFile"+file4.createNewFile());
//		File newFile4=new File(file1,"��������.jpg");
//		System.out.println("renameTo:"+file4.renameTo(newFile4));
		
		//�߼���ȡ����
		//list()������ȡָ��·���µ��ļ��к��ļ�����������
//		File file5=new File("f:/java��ϰ�ļ�");
//		String[] listNames=file5.list();
//		for(String listName:listNames) {
//			System.out.println(listName);
//		}
		//listFile()������ȡָ��·���µ��ļ��к��ļ���File����
		File file6=new File("f:/java��ϰ�ļ�");
		File[] fs=file6.listFiles();
		for(File f:fs) {
			System.out.println(f.getName());
		}
	}

}
