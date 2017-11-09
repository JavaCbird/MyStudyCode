/*
 * 演示缓冲字符流案例
 * 注意:使用BufferedReader和BufferedWriter之前要先创建FileReader和FileWriter对象
 */
package com.BufferedReader_BufferedWriter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReader_BufferedWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedReader br=null;
		BufferedWriter bw=null;
		try {
			//先创建FileReader对象
			FileReader fr=new FileReader("f:/java练习文件/dd.txt");
			br=new BufferedReader(fr);
			//先创建FileWriter对象
			FileWriter fw=new FileWriter("f:/java练习文件/cc/dd_copy_1.txt");
			bw=new BufferedWriter(fw);
			//循环读取文件
			String s="";
			while((s=br.readLine())!=null) {
//				System.out.println(s);
				bw.write(s+"\r\n");	//"\r\n"的作用是回车换行
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				br.close();
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
