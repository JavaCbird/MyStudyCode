/*
 * ����:���ַ���ʵ���ı�����
 */
package com.TxtCopy;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TxtCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��f1ָ����ļ��ж�ȡ����
		File f1=new File("f:/java��ϰ�ļ�/dd.txt");
		//������д�뵽f2ָ����ļ�,�ļ����������ȡ
		File f2=new File("f:/java��ϰ�ļ�/cc/dd_copy.txt");
		//�����ݶ����ڴ�(������)
		FileReader fr=null;
		//�����ݴ��ڴ�д������(�����)
		FileWriter fw=null;
		try {
			fr=new FileReader(f1);
			fw=new FileWriter(f2);
			char[] c=new char[1024];
			int n=0;
			while((n=fr.read(c))!=-1) {
//				String s=new String(c,0,n);
//				System.out.println(s);
				fw.write(c);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fr.close();
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
