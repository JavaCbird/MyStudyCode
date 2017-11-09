package com.IO_Demo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ����:���ƶ༶�ļ���
 */
public class CopyFolder_DuoJi {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//��װ��Դ
		File srcFile=new File("F:/java��ϰ�ļ�/IO_Demo");
		//��װĿ�ĵ�
		File destFile=new File("F:/java��ϰ�ļ�/New_IO_Demo");
		
		//�����ļ��й���
		copyFolder(srcFile,destFile);
	}

	private static void copyFolder(File srcFile, File destFile) throws IOException {
		// TODO Auto-generated method stub
		if(srcFile.isDirectory()) {
			//�ļ���
			//�½����ļ���
			File newFolder=new File(destFile,srcFile.getName());
			newFolder.mkdir();
//			System.out.println(newFolder);
			File[] fs=srcFile.listFiles();
			for(File f:fs) {
//				System.out.println(f);
				copyFolder(f,newFolder);
			}
		}else {
			//�ļ�
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
