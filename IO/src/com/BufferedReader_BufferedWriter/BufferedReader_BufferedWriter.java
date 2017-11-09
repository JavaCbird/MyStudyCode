/*
 * ��ʾ�����ַ�������
 * ע��:ʹ��BufferedReader��BufferedWriter֮ǰҪ�ȴ���FileReader��FileWriter����
 */
package com.BufferedReader_BufferedWriter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReader_BufferedWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedReader br=null;
		BufferedWriter bw=null;
		try {
			//�ȴ���FileReader����
			FileReader fr=new FileReader("f:/java��ϰ�ļ�/dd.txt");
			br=new BufferedReader(fr);
			//�ȴ���FileWriter����
			FileWriter fw=new FileWriter("f:/java��ϰ�ļ�/cc/dd_copy_1.txt");
			bw=new BufferedWriter(fw);
			//ѭ����ȡ�ļ�
			String s="";
			while((s=br.readLine())!=null) {
//				System.out.println(s);
				bw.write(s+"\r\n");	//"\r\n"�������ǻس�����
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				br.close();
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
