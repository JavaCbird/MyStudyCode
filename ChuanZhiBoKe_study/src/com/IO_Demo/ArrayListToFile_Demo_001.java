package com.IO_Demo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
 * 功能:将ArrayList集合中的字符串存储到文本文件中
 */
public class ArrayListToFile_Demo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ArrayList<String> als=new ArrayList<String>();
		als.add("hello,world");
		als.add("中国");
		als.add("java");
		
		BufferedWriter bw=new BufferedWriter(new FileWriter("F:/java练习文件/IO_Demo/ArrayList.txt"));
		for(String al:als) {
			bw.write(al);
			bw.newLine();
			bw.flush();
		}
		bw.close();
	}

}
