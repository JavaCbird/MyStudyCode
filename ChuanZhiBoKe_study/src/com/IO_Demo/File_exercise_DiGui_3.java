package com.IO_Demo;

import java.io.File;

/*
 * ���õݹ�ķ���ɾ��f:/java��ϰ�ļ�/IO_Demo/DiGui�ļ���,������������������ļ����ļ���
 */
public class File_exercise_DiGui_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("f:/java��ϰ�ļ�/IO_Demo/DiGui");
		deleteAll(file);
	}
 
	public static void deleteAll(File file) {
		// TODO Auto-generated method stub
		File[] fs=file.listFiles();
		for(File f:fs) {
			if(f.isDirectory()) {
				deleteAll(f);
			}else {
				System.out.println(f.getName()+"----"+f.delete());
			}
		}
		System.out.println(file.getName()+"----"+file.delete());
	}

}
