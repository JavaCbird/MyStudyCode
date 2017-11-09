package com.IO_Demo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ����:���Ƶ����ļ���(����Ŀ¼,��mkdir��������)
 */
public class CopyFolder_DanJi {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//��װĿ¼
		File scrFile=new File("F:/java��ϰ�ļ�/IO_Demo/��������");
		//��װĿ�ĵ�
		File destFile=new File("F:/java��ϰ�ļ�/IO_Demo/��������_copy");
		if(!destFile.exists()) {
			destFile.mkdir();	//��������Ŀ¼
		}
		
		//��ȡ��Ŀ¼�µ������ļ���File����
		File[] fs=scrFile.listFiles();
		//��������,�õ�ÿ��File����
		for(File f:fs) {
			BufferedInputStream bis=new BufferedInputStream(new FileInputStream(f));
			String name=f.getName();
//			String path=(destFile).getPath().concat("/").concat(name);
//			System.out.println(path);
			File newfile=new File(destFile,name);
//			BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(path));
			BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(newfile));
			
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
