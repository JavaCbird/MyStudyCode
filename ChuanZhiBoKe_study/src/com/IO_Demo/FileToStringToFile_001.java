package com.IO_Demo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

/*
 * 将s.txt文件中的字符串从小到大排序后存储到ss.txt
 */
public class FileToStringToFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//封装来源
		File srcFile=new File("f:/java练习文件/IO_Demo/s.txt");
		//封装目的地
		File destFile=new File("f:/java练习文件/IO_Demo/ss.txt");
		BufferedReader br=new BufferedReader(new FileReader(srcFile));
		BufferedWriter bw=new BufferedWriter(new FileWriter(destFile));
		//从文件中读取字符串
		String s=br.readLine();
		br.close();
		//将字符串转成字符数组
		char[] cs=s.toCharArray();
		//对字符数组排序
		Arrays.sort(cs);
		//将字符数组转成字符串
		String ss=new String(cs);
		//将排序后的字符串写到文件中
		bw.write(ss);
		bw.close();
	}

}
