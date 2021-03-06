package com.myproject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MyProject_findTXT {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File srcFile=new File("F:\\Java学习视频\\传智播客_解压");
		File destFile=new File("F:\\Java学习视频\\传智播客_解压/总结.txt");
		if(!destFile.exists()) {
			destFile.mkdir();
		}
		File[] secondFiles=srcFile.listFiles();
		for(File secondFile:secondFiles) {
//			System.out.println(secondFile);
			File[] files=secondFile.listFiles();
			for(File file:files) {
				if(file.getName().equalsIgnoreCase("code")) {
//					System.out.println(file.getAbsolutePath());
					File[] fs=file.listFiles();
					for(File f:fs) {
						if(!f.isDirectory() && f.getName().endsWith("总结.txt")) {
							BufferedReader br=new BufferedReader(new FileReader(f));
							File new_destFile=new File(destFile,f.getName());
							BufferedWriter bw=new BufferedWriter(new FileWriter(new_destFile));
							char[] chs=new char[1024];
							int len=0;
							while((len=br.read(chs))!=-1) {
								bw.write(chs, 0, len);
								bw.flush();
							}
							bw.close();
							br.close();
						}
					}
				}
			}
		}
	}

}
