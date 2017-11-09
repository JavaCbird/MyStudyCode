package com.IO_Demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/*
 * 功能:将文本文件中的字符串读入集合中,并随即获取一个字符串
 */
public class FileToArrayList_Demo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new FileReader("F:/java练习文件/IO_Demo/ArrayList.txt"));
		ArrayList<String> als=new ArrayList<String>();
		
		String line=null;
		while((line=br.readLine())!=null) {
			als.add(line);
		}
		br.close();
		
		for(String al:als) {
			System.out.println(al);
		}
		
		Random r=new Random();
		int index=r.nextInt(als.size());
		String aLine=als.get(index);
		System.out.println("随即获取的字符串为:"+aLine);
	}

}
