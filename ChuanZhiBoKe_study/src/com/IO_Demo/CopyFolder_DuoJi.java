package com.IO_Demo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 功能:复制多级文件夹
 */
public class CopyFolder_DuoJi {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//封装来源
		File srcFile=new File("F:/java练习文件/IO_Demo");
		//封装目的地
		File destFile=new File("F:/java练习文件/New_IO_Demo");
		
		//复制文件夹功能
		copyFolder(srcFile,destFile);
	}

	private static void copyFolder(File srcFile, File destFile) throws IOException {
		// TODO Auto-generated method stub
		if(srcFile.isDirectory()) {
			//文件夹
			//新建该文件夹
			File newFolder=new File(destFile,srcFile.getName());
			newFolder.mkdir();
//			System.out.println(newFolder);
			File[] fs=srcFile.listFiles();
			for(File f:fs) {
//				System.out.println(f);
				copyFolder(f,newFolder);
			}
		}else {
			//文件
			File newFile=new File(destFile,srcFile.getName());
			copyFile(srcFile,newFile);
		}
	}

	private static void copyFile(File srcFile, File newFile) throws IOException {
		// TODO Auto-generated method stub
		BufferedInputStream bis=new BufferedInputStream(new FileInputStream(srcFile));
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
