/*
 * 功能:遍历文件夹
 */
package com.file;

import java.io.File;

public class File1 {

	// public File1(String string) {
	// // TODO Auto-generated constructor stub
	// }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File f = new File("F:/java练习文件");
		File[] fs=f.listFiles();
		if(null==fs) {
			return;
		}
		
		long maxSize=0;
		long minSize=Integer.MAX_VALUE;
		File maxFile=null;
		File minFile=null;
		
		for(File file:fs) {
			if(file.length()>=maxSize) {
				maxSize=file.length();
				maxFile=file;
			}
			if(file.length()!=0 && file.length()<=minSize) {
				minSize=file.length();
				minFile=file;
			}
		}
		System.out.println("最大文件是: "+maxFile+"  大小是: "+maxSize);
		System.out.println("最小文件是: "+minFile+"  大小是: "+minSize);
	}

}
