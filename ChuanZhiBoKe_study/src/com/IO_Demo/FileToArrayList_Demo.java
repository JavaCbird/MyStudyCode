package com.IO_Demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/*
 * ����:���ı��ļ��е��ַ������뼯����,���漴��ȡһ���ַ���
 */
public class FileToArrayList_Demo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new FileReader("F:/java��ϰ�ļ�/IO_Demo/ArrayList.txt"));
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
		System.out.println("�漴��ȡ���ַ���Ϊ:"+aLine);
	}

}
