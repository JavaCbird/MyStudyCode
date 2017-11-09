package com.IO_Demo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 功能:复制单级文件夹(单级目录,用mkdir创建即可)
 */
public class CopyFolder_DanJi {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//封装目录
		File scrFile=new File("F:/java练习文件/IO_Demo/三国演义");
		//封装目的地
		File destFile=new File("F:/java练习文件/IO_Demo/三国演义_copy");
		if(!destFile.exists()) {
			destFile.mkdir();	//创建单级目录
		}
		
		//获取该目录下的所有文件的File数组
		File[] fs=scrFile.listFiles();
		//遍历数组,得到每个File对象
		for(File f:fs) {
			BufferedInputStream bis=new BufferedInputStream(new FileInputStream(f));
			String name=f.getName();
//			String path=(destFile).getPath().concat("/").concat(name);
//			System.out.println(path);
			File newfile=new File(destFile,name);
//			BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(path));
			BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(newfile));
			
			byte[] bys=new byte[1024];
			int len=0;
			while((len=bis.read(bys))!=-1) {
				bos.write(bys, 0, len);
			}
			
			bos.close();
			bis.close();
		}
	}

}
