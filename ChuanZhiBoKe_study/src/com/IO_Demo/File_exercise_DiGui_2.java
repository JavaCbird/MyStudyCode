package com.IO_Demo;

import java.io.File;

/*
 * 功能:利用递归实现获取f:/java练习文件/IO_Demo路径下的所有.jpg文件
 */
public class File_exercise_DiGui_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("f:/java练习文件/IO_Demo");
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
