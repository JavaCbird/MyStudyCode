/*
 * ����:�����ļ���
 */
package com.file;

import java.io.File;

public class File1 {

	// public File1(String string) {
	// // TODO Auto-generated constructor stub
	// }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File f = new File("F:/java��ϰ�ļ�");
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
		System.out.println("����ļ���: "+maxFile+"  ��С��: "+maxSize);
		System.out.println("��С�ļ���: "+minFile+"  ��С��: "+minSize);
	}

}
