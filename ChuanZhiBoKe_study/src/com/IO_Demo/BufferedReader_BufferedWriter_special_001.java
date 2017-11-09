package com.IO_Demo;
import java.io.BufferedReader;
/*
 * 字符缓冲流的特殊方法:
 * 		BufferedWriter:
 * 				public void newLine():写入一个行分隔符。行分隔符字符串由系统属性 line.separator 定义，并且不一定是单个新行 ('\n') 符。
 * 		BufferedReader:
 * 				public String readLine():读取一个文本行。通过下列字符之一即可认为某行已终止：换行 ('\n')、回车 ('\r') 或回车后直接跟着换行。
 * 										 包含该行内容的字符串，不包含任何行终止符，如果已到达流末尾，则返回 null 
 */
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReader_BufferedWriter_special {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		writer();
		reader();
	}

	private static void reader() throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new FileReader("F:\\java练习文件\\IO_Demo/new_BufferedReader.txt"));
		String line=null;
		while((line=br.readLine())!=null) {
			System.out.println(line);	//注意:此处是println而不是print
		}
		br.close();
	}

	private static void writer() throws IOException {
		// TODO Auto-generated method stub
		BufferedWriter bw=new BufferedWriter(new FileWriter("F:\\java练习文件\\IO_Demo/new_BufferedReader.txt"));
		for(int i=0;i<5;i++) {
			bw.write("Hello"+i);
			bw.newLine();
			bw.flush();
		}
		bw.close();
	}

}
