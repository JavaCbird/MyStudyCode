package com.IO_Demo;

import java.io.File;

/*
 * ����:���õݹ�ʵ�ֻ�ȡf:/java��ϰ�ļ�/IO_Demo·���µ�����.jpg�ļ�
 */
public class File_exercise_DiGui_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("f:/java��ϰ�ļ�/IO_Demo");
		getFile(file);
	}
	public static void getFile(File file) {
		File[] fs=file.listFiles();
		for(File f:fs) {
			if(f.isDirectory()) {
				getFile(f);
			}else {
				if(f.getName().endsWith(".jpg")) {
					System.out.println(f.getAbsolutePath());
				}
			}
		}
	}

}
