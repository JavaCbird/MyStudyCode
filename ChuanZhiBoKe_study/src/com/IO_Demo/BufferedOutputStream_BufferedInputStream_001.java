package com.IO_Demo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 功能:字节缓冲区流BufferedOutputStream与BufferedInputStream
 */
public class BufferedOutputStream_BufferedInputStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("F:\\java练习文件\\IO_Demo/BufferOutputStream.txt"));
		bos.write("hello,BufferedOutputStream".getBytes());
		bos.close();
		
		BufferedInputStream bis=new BufferedInputStream(new FileInputStream("F:\\java练习文件\\IO_Demo/BufferOutputStream.txt"));
		//方法一
//		int by=0;
//		while((by=bis.read())!=-1) {
//			System.out.print((char)by);
//		}
		//方法二
		byte[] bys=new byte[1024];
		int len=0;
		while((len=bis.read(bys))!=-1) {
			System.out.print(new String(bys,0,len));
		}
		bis.close();
	}

}
