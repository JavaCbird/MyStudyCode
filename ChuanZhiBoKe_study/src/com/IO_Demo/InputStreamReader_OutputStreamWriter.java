package com.IO_Demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class InputStreamReader_OutputStreamWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader isr=new InputStreamReader(new FileInputStream("F:\\java��ϰ�ļ�\\IO_Demo/Reader.txt"));
		OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("F:\\java��ϰ�ļ�\\IO_Demo/Writer.txt"));
		
		//��ʽһ
//		int ch=0;
//		while((ch=isr.read())!=-1) {
//			osw.write(ch);
//		}
//		osw.close();
//		isr.close();
		
		//��ʽ��
		char[] chs=new char[1024];	//ע��:�˴�Ϊchar���͵�����  
		int len=0;
		while((len=isr.read(chs))!=-1) {
			osw.write(chs, 0, len);
			osw.flush();
		}
		osw.close();
		isr.close();
	}

}
