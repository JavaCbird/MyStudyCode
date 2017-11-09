package com.IO_Demo;
import java.io.BufferedReader;
/*
 * �ַ������������ⷽ��:
 * 		BufferedWriter:
 * 				public void newLine():д��һ���зָ������зָ����ַ�����ϵͳ���� line.separator ���壬���Ҳ�һ���ǵ������� ('\n') ����
 * 		BufferedReader:
 * 				public String readLine():��ȡһ���ı��С�ͨ�������ַ�֮һ������Ϊĳ������ֹ������ ('\n')���س� ('\r') ��س���ֱ�Ӹ��Ż��С�
 * 										 �����������ݵ��ַ������������κ�����ֹ��������ѵ�����ĩβ���򷵻� null 
 */
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReader_BufferedWriter_special {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		writer();
		reader();
	}

	private static void reader() throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new FileReader("F:\\java��ϰ�ļ�\\IO_Demo/new_BufferedReader.txt"));
		String line=null;
		while((line=br.readLine())!=null) {
			System.out.println(line);	//ע��:�˴���println������print
		}
		br.close();
	}

	private static void writer() throws IOException {
		// TODO Auto-generated method stub
		BufferedWriter bw=new BufferedWriter(new FileWriter("F:\\java��ϰ�ļ�\\IO_Demo/new_BufferedReader.txt"));
		for(int i=0;i<5;i++) {
			bw.write("Hello"+i);
			bw.newLine();
			bw.flush();
		}
		bw.close();
	}

}
