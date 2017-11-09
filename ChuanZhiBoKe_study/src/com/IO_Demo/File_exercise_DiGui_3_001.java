package com.IO_Demo;

import java.io.File;

/*
 * 利用递归的方法删除f:/java练习文件/IO_Demo/DiGui文件夹,包括在其里面的所有文件及文件夹
 */
public class File_exercise_DiGui_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("f:/java练习文件/IO_Demo/DiGui");
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
