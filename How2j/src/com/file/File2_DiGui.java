/*
 * 功能:利用递归方法,遍历子文件夹
 */
package com.file;

import java.io.File;

public class File2_DiGui {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("F:/java练习文件");
		listFiles(f);
		System.out.println("最大文件是: "+maxFile+"  大小是: "+maxSize);
		System.out.println("最小文件是: "+minFile+"  大小是: "+minSize);
	}

	static long maxSize=0;
	static long minSize=Integer.MAX_VALUE;
	static File maxFile=null;
	static File minFile=null;
	
	public static void listFiles(File file) {
		if(file.isFile()) {
				if(file.length()>=maxSize) {
					maxSize=file.length();
					maxFile=file;
				}
				if(file.length()!=0 && file.length()<=minSize) {
					minSize=file.length();
					minFile=file;
				}
		}
		if(file.isDirectory()) {
			File[] fs=file.listFiles();
			if(null!=fs) {
				for(File f:fs) {
					listFiles(f);
				}
			}
		}
	}
}
