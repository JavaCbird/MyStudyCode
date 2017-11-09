package com.IO_Demo;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/*
 * ��Readerģ��BufferedReader��readLine()����
 */
public class MyBufferedReader_Demo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		MyBufferedReader mbr=new MyBufferedReader(new FileReader("f:/java��ϰ�ļ�/IO_Demo/a.txt"));
		String line=null;
		while((line=mbr.readLine())!=null) {
			System.out.println(line);
		}
		mbr.close();
	}

}

class MyBufferedReader{
	private Reader r;
	public MyBufferedReader(Reader r) {
		this.r=r;
	}
	
	//дһ������,����ֵ���ַ���
	public String readLine() throws IOException {
		StringBuilder sb=new StringBuilder();
		int ch=0;
		while((ch=r.read())!=-1) {
			if(ch=='\r') {
				continue;
			}
			if(ch=='\n') {
				return sb.toString();
			}else {
				sb.append((char)ch);
			}
		}
		//Ϊ��ֹ���һ���ַ�������û�лس��������������ʧ
		if(sb.length()>0) {
			return sb.toString();
		}
		//��û������,����null
		return null;
	}
	
	//дһ���رշ���
	public void close() throws IOException {
		r.close();
	}
}