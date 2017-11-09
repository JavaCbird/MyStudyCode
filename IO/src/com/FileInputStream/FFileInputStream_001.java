/*
 * 演示FileInputStream类的使用
 */
package com.FileInputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FFileInputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("f:/java练习文件/aa.txt");
		
		//因为File没有读写的能力,所以需要使用FileInputStream类
		FileInputStream fis=null;
		try {
			fis=new FileInputStream(f);
			
			//定义一个字节数组,相对于缓存
			byte[] b=new byte[1024];
			int n=0;	//得到实际读取到的字节数
			//循环读取
			while((n=fis.read(b))!=-1) {
				//把字节转成String
				String s=new String(b,0,n);
				System.out.println(s);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//一定要关闭文件流
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
