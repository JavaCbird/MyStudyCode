/*
 * 演示FileOutputStream的使用
 */
package com.FileOutputStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FFileOutputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("f:/java练习文件/dd.txt");
		
		//字节输出流
		FileOutputStream fos=null;
		String n=null;
		try {
			fos=new FileOutputStream(f);
			String s="使用FileOutputStream\r\n";	//\r\n表示回车换行
			String s1="中国你好!";
//			byte[] b=new byte[1024];
			fos.write(s.getBytes());
			fos.write(s1.getBytes());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
