package com.IO_Demo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
 * ����:��ArrayList�����е��ַ����洢���ı��ļ���
 */
public class ArrayListToFile_Demo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ArrayList<String> als=new ArrayList<String>();
		als.add("hello,world");
		als.add("�й�");
		als.add("java");
		
		BufferedWriter bw=new BufferedWriter(new FileWriter("F:/java��ϰ�ļ�/IO_Demo/ArrayList.txt"));
		for(String al:als) {
			bw.write(al);
			bw.newLine();
			bw.flush();
		}
		bw.close();
	}

}
