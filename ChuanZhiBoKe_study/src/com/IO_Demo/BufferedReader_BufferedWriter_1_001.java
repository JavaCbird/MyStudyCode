package com.IO_Demo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * �ַ�������
 */
public class BufferedReader_BufferedWriter_1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new FileReader("F:\\java��ϰ�ļ�\\IO_Demo/BufferedReader.txt"));
		BufferedWriter bw=new BufferedWriter(new FileWriter("F:\\java��ϰ�ļ�\\IO_Demo/BufferedWriter.txt"));
		
		//��ʽһ
//		int ch=0;
//		while((ch=br.read())!=-1) {
//			bw.write(ch);
//		}
//		bw.close();
//		br.close();
		
		//��ʽ��
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
