package com.IO_Demo;
/*
 * ����:��������
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStream_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis=null;
		File file=new File("f:/java��ϰ�ļ�/IO_Demo/FileInputStream.txt");
		try {
			fis=new FileInputStream(file);
			int by=0;
			try {
				//fis.read()ֻ�ܶ������ֽ�,ͨ��ѭ�����ܶ����,����-1ʱ,˵������û����
				while((by=fis.read())!=-1) {
					System.out.print((char)by);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(fis!=null) {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	
		System.out.println("\r"+"----------------");
		
		//���ֽ������ȡ
		FileInputStream fis1=null;
		try {
			fis1=new FileInputStream(file);
			byte[] bys=new byte[1024];
			int len=0;
			try {
				while((len=fis1.read(bys))!=-1) {
					String s=new String(bys,0,len);
					System.out.println(s);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
