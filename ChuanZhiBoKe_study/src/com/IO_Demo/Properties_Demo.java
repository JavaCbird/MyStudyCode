package com.IO_Demo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Properties;

/*
 * Properties��һ������,ͨ��load()��store()����ʵ�ּ������ļ����໥�洢
 * 	load():�ļ�-->����
 * 	store():����-->�ļ�
 */
public class Properties_Demo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		myLoad();
		myStore();
	}

	private static void myStore() throws IOException {
		// TODO Auto-generated method stub
		Properties prop=new Properties();
		Writer w=new FileWriter("f:/java��ϰ�ļ�/IO_Demo/Properties_store.txt");
		prop.setProperty("zzc", "22");
		prop.setProperty("cl", "23");
		prop.setProperty("ws", "20");
		prop.store(w, "students information");
		w.close();
	}

	private static void myLoad() throws IOException {
		// TODO Auto-generated method stub
		Properties prop=new Properties();
		//����ļ�������ݱ����Ǽ�ֵ����ʽ
		Reader r=new FileReader("f:/java��ϰ�ļ�/IO_Demo/Properties.txt");
		prop.load(r);
		r.close();
		System.out.println("prop:"+prop);
	}

}
