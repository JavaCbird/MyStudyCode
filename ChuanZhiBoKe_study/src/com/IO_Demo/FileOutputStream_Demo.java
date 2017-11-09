package com.IO_Demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ����:��ָ���ļ���д���ַ���,����,׷��д��,�쳣����
 * 
 * ע��:���з��Ĳ���:
 * 		Windows:\r\n
 * 		Linux:\n
 * 		Mac:\r
 */
public class FileOutputStream_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("f:/java��ϰ�ļ�/IO_Demo/FileOutputStream.txt");
//		FileOutputStream fos=new FileOutputStream(file);
		FileOutputStream fos=null;
		FileOutputStream fos1=null;
		try {
			fos=new FileOutputStream(file);
			fos.write("Hello,IO".getBytes());
			fos.write(97);	//д����97ת���ɵ�a,������97
			
			//дһ���ֽ�����
			byte[] bys= {97,'b','c','d'};
			fos.write(bys);
			fos.write(bys, 1, 3);//��1��ʼ,д3��
			
			//��ʾ����
			for(int i=0;i<5;i++) {
				fos.write(("hello"+i).getBytes());
				fos.write("\r\n".getBytes());
			}
			
			//��file�ļ���׷��д��
			fos1=new FileOutputStream(file, true);
			fos1.write("����׷��д���".getBytes());
			
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			//���fos����null,����Ҫclose
			if(fos!=null) {
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(fos1!=null) {
				try {
					fos1.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
