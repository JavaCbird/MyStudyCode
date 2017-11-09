package com.IO_Demo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 功能:复制单级文件夹,并修改文件夹下的后缀名,将.txt改为.jpg
 */
public class CopyFolder_DanJi_rename {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//封装目录
		File srcFile=new File("F:/java练习文件/IO_Demo/三国演义");
		//封装目的地
		File destFile=new File("F:/java练习文件/IO_Demo/三国演义_copy2");
		if(!destFile.exists()) {
			destFile.mkdir();
		}
		//复制文件
		copyFile(srcFile,destFile);
		//重命名
		reName_File(destFile);
	}

	private static void reName_File(File destFile) {
		// TODO Auto-generated method stub
		File[] fs=destFile.listFiles();
		for(File f:fs) {
//			System.out.println(f);
			if(f.getName().endsWith(".txt")) {
//				System.out.println(f);
				String name=f.getName();
				String newName=name.replace(".txt", ".jpg");
//				System.out.println(newName);
				File newFile=new File(destFile,newName);
				f.renameTo(newFile);
			}
		}
	}

	private static void copyFile(File srcFile, File destFile) throws IOException {
		// TODO Auto-generated method stub
		File[] fs=srcFile.listFiles();
		for(File f:fs) {
			BufferedInputStream bis=new BufferedInputStream(new FileInputStream(f));
			File newFile=new File(destFile,f.getName());
//			System.out.println(newFile);
			BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(newFile));
			byte[] bys=new byte[1024];
			int len=0;
			while((len=bis.read(bys))!=-1) {
				bos.write(bys, 0, len);
			}
			bos.close();
			bis.close();
		}
		
	}

}
