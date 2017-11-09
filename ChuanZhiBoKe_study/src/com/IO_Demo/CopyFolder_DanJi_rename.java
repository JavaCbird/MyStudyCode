package com.IO_Demo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ����:���Ƶ����ļ���,���޸��ļ����µĺ�׺��,��.txt��Ϊ.jpg
 */
public class CopyFolder_DanJi_rename {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//��װĿ¼
		File srcFile=new File("F:/java��ϰ�ļ�/IO_Demo/��������");
		//��װĿ�ĵ�
		File destFile=new File("F:/java��ϰ�ļ�/IO_Demo/��������_copy2");
		if(!destFile.exists()) {
			destFile.mkdir();
		}
		//�����ļ�
		copyFile(srcFile,destFile);
		//������
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
