/*
 * 功能:用字符流实现文本拷贝
 */
package com.TxtCopy;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TxtCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//从f1指向的文件中读取数据
		File f1=new File("f:/java练习文件/dd.txt");
		//将数据写入到f2指向的文件,文件名可以随便取
		File f2=new File("f:/java练习文件/cc/dd_copy.txt");
		//将数据读入内存(输入流)
		FileReader fr=null;
		//将数据从内存写到磁盘(输出流)
		FileWriter fw=null;
		try {
			fr=new FileReader(f1);
			fw=new FileWriter(f2);
			char[] c=new char[1024];
			int n=0;
			while((n=fr.read(c))!=-1) {
//				String s=new String(c,0,n);
//				System.out.println(s);
				fw.write(c);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fr.close();
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
