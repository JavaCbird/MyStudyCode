/*
 * ����:���õݹ鷽��,�������ļ���
 */
package com.file;

import java.io.File;

public class File2_DiGui {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("F:/java��ϰ�ļ�");
		listFiles(f);
		System.out.println("����ļ���: "+maxFile+"  ��С��: "+maxSize);
		System.out.println("��С�ļ���: "+minFile+"  ��С��: "+minSize);
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
