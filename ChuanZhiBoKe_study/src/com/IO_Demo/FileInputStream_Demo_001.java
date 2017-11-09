package com.IO_Demo;
/*
 * 功能:读入数据
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStream_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis=null;
		File file=new File("f:/java练习文件/IO_Demo/FileInputStream.txt");
		try {
			fis=new FileInputStream(file);
			int by=0;
			try {
				//fis.read()只能读单个字节,通过循环才能读多个,返回-1时,说明后面没有了
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
		
		//用字节数组读取
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
