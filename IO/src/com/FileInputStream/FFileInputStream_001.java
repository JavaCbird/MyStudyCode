/*
 * ��ʾFileInputStream���ʹ��
 */
package com.FileInputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FFileInputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("f:/java��ϰ�ļ�/aa.txt");
		
		//��ΪFileû�ж�д������,������Ҫʹ��FileInputStream��
		FileInputStream fis=null;
		try {
			fis=new FileInputStream(f);
			
			//����һ���ֽ�����,����ڻ���
			byte[] b=new byte[1024];
			int n=0;	//�õ�ʵ�ʶ�ȡ�����ֽ���
			//ѭ����ȡ
			while((n=fis.read(b))!=-1) {
				//���ֽ�ת��String
				String s=new String(b,0,n);
				System.out.println(s);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//һ��Ҫ�ر��ļ���
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
