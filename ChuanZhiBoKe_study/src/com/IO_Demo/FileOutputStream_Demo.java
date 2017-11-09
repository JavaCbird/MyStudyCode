package com.IO_Demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 功能:向指定文件中写入字符串,换行,追加写入,异常处理
 * 
 * 注意:换行符的差异:
 * 		Windows:\r\n
 * 		Linux:\n
 * 		Mac:\r
 */
public class FileOutputStream_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("f:/java练习文件/IO_Demo/FileOutputStream.txt");
//		FileOutputStream fos=new FileOutputStream(file);
		FileOutputStream fos=null;
		FileOutputStream fos1=null;
		try {
			fos=new FileOutputStream(file);
			fos.write("Hello,IO".getBytes());
			fos.write(97);	//写的是97转化成的a,而不是97
			
			//写一个字节数组
			byte[] bys= {97,'b','c','d'};
			fos.write(bys);
			fos.write(bys, 1, 3);//从1开始,写3个
			
			//演示换行
			for(int i=0;i<5;i++) {
				fos.write(("hello"+i).getBytes());
				fos.write("\r\n".getBytes());
			}
			
			//向file文件中追加写入
			fos1=new FileOutputStream(file, true);
			fos1.write("这是追加写入的".getBytes());
			
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			//如果fos不是null,才需要close
			if(fos!=null) {
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(fos1!=null) {
				try {
					fos1.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
