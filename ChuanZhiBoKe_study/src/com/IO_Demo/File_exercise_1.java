package com.IO_Demo;

import java.io.File;
import java.io.FilenameFilter;
/*
 * ����:��ȡf:/java��ϰ�ļ�/IO_Demo·���µ�.jpg�ļ�
 */
public class File_exercise_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file1=new File("f:/java��ϰ�ļ�/IO_Demo");
		//����һ
//		File[] fs=file1.listFiles();
//		for(File f:fs) {
//			if(f.isFile()) {
//				if(f.getName().endsWith(".jpg")) {
//					System.out.println(f.getName());
//				}
//			}else if(f.isDirectory()) {
//				file1=f;
//			}
//		}
		
		//������,ʹ���ļ�������
		String[] ss=file1.list(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				return new File(dir,name).isFile() && name.endsWith(".jpg");
			}
		});
		for(String s:ss) {
			System.out.println(s);
		}
	}

}
