package com.IO_Demo;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/*
 * 用Reader模拟BufferedReader的readLine()功能
 */
public class MyBufferedReader_Demo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		MyBufferedReader mbr=new MyBufferedReader(new FileReader("f:/java练习文件/IO_Demo/a.txt"));
		String line=null;
		while((line=mbr.readLine())!=null) {
			System.out.println(line);
		}
		mbr.close();
	}

}

class MyBufferedReader{
	private Reader r;
	public MyBufferedReader(Reader r) {
		this.r=r;
	}
	
	//写一个方法,返回值是字符串
	public String readLine() throws IOException {
		StringBuilder sb=new StringBuilder();
		int ch=0;
		while((ch=r.read())!=-1) {
			if(ch=='\r') {
				continue;
			}
			if(ch=='\n') {
				return sb.toString();
			}else {
				sb.append((char)ch);
			}
		}
		//为防止最后一行字符串后面没有回车换行造成数据遗失
		if(sb.length()>0) {
			return sb.toString();
		}
		//若没有数据,返回null
		return null;
	}
	
	//写一个关闭方法
	public void close() throws IOException {
		r.close();
	}
}