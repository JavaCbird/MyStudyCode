package com.IO_Demo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 字符缓冲流
 */
public class BufferedReader_BufferedWriter_1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new FileReader("F:\\java练习文件\\IO_Demo/BufferedReader.txt"));
		BufferedWriter bw=new BufferedWriter(new FileWriter("F:\\java练习文件\\IO_Demo/BufferedWriter.txt"));
		
		//方式一
//		int ch=0;
//		while((ch=br.read())!=-1) {
//			bw.write(ch);
//		}
//		bw.close();
//		br.close();
		
		//方式二
		char[] chs=new char[1024];
		int len=0;
		while((len=br.read(chs))!=-1) {
			bw.write(chs, 0, len);
			bw.flush();
		}
		bw.close();
		br.close();
	}

}
