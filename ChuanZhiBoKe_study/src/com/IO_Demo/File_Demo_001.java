package com.IO_Demo;

import java.io.File;
import java.io.IOException;

/*
 * 创建功能
 * 删除功能(java中的删除不走回收站)
 * 重命名功能(如果路径名相同,就是改名;如果路径名不相同,就是剪切加改名)
 * 判断功能
 * 获取功能
 */
public class File_Demo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		//创建文件夹
//		File file1=new File("f:/java练习文件/IO_Demo");
//		System.out.println("mkdir:"+file1.mkdir());
//		
//		//创建文件
//		File file2=new File(file1,"a.txt");
//		System.out.println("createNewFile:"+file2.createNewFile());
//		
//		//先创建文件夹,再在此文件夹下创建文件夹(不能创建文件)
//		File file3=new File(file1,"aa/bb");
//		System.out.println("mkdirs"+file3.mkdirs());
//		
//		//删除文件或文件夹
//		System.out.println("delete f:/java练习文件/IO_Demo/a.txt:"+file2.delete());
//		System.out.println("delete f:/java练习文件/IO_Demo/aa/bb:"+file3.delete());
//		
//		//若子文件夹存在,不能直接删除父文件夹
//		//IO_Demo文件夹下存在aa子文件夹,不能直接删除,可以先删除aa,再删除IO_Demo
//		System.out.println("delete f:/java练习文件/IO_Demo:"+file1.delete());
//		
//		//重命名功能
//		File file4=new File(file1,"林青霞.jpg");
//		System.out.println("createNewFile"+file4.createNewFile());
//		File newFile4=new File(file1,"东方不败.jpg");
//		System.out.println("renameTo:"+file4.renameTo(newFile4));
		
		//高级获取功能
		//list()方法获取指定路径下的文件夹和文件的名称数组
//		File file5=new File("f:/java练习文件");
//		String[] listNames=file5.list();
//		for(String listName:listNames) {
//			System.out.println(listName);
//		}
		//listFile()方法获取指定路径下的文件夹和文件的File数组
		File file6=new File("f:/java练习文件");
		File[] fs=file6.listFiles();
		for(File f:fs) {
			System.out.println(f.getName());
		}
	}

}
