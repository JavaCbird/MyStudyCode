package com.IO_Demo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReader_BufferedWriter_2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new FileReader("F:\\java练习文件\\IO_Demo/new_BufferedReader.txt"));
		BufferedWriter bw=new BufferedWriter(new FileWriter("F:\\java练习文件\\IO_Demo/new_BufferedWriter.txt"));
		
		String line=null;
		while((line=br.readLine())!=null) {
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		bw.close();
		br.close();
	}

}
