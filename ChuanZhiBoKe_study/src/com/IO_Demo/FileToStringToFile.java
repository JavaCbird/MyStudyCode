package com.IO_Demo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

/*
 * ��s.txt�ļ��е��ַ�����С���������洢��ss.txt
 */
public class FileToStringToFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//��װ��Դ
		File srcFile=new File("f:/java��ϰ�ļ�/IO_Demo/s.txt");
		//��װĿ�ĵ�
		File destFile=new File("f:/java��ϰ�ļ�/IO_Demo/ss.txt");
		BufferedReader br=new BufferedReader(new FileReader(srcFile));
		BufferedWriter bw=new BufferedWriter(new FileWriter(destFile));
		//���ļ��ж�ȡ�ַ���
		String s=br.readLine();
		br.close();
		//���ַ���ת���ַ�����
		char[] cs=s.toCharArray();
		//���ַ���������
		Arrays.sort(cs);
		//���ַ�����ת���ַ���
		String ss=new String(cs);
		//���������ַ���д���ļ���
		bw.write(ss);
		bw.close();
	}

}
