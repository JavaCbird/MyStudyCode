package com.IO_Demo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Properties;

/*
 * Properties是一个集合,通过load()与store()方法实现集合与文件的相互存储
 * 	load():文件-->集合
 * 	store():集合-->文件
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
		Writer w=new FileWriter("f:/java练习文件/IO_Demo/Properties_store.txt");
		prop.setProperty("zzc", "22");
		prop.setProperty("cl", "23");
		prop.setProperty("ws", "20");
		prop.store(w, "students information");
		w.close();
	}

	private static void myLoad() throws IOException {
		// TODO Auto-generated method stub
		Properties prop=new Properties();
		//这个文件里的数据必须是键值对形式
		Reader r=new FileReader("f:/java练习文件/IO_Demo/Properties.txt");
		prop.load(r);
		r.close();
		System.out.println("prop:"+prop);
	}

}
