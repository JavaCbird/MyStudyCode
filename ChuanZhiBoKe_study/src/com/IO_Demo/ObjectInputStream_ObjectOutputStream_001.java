package com.IO_Demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * 序列化流----ObjectOutputStream
 * 反序列化流----ObjectInputStream
 * 功能:用来将Object对象写入流及从流中读取
 */
public class ObjectInputStream_ObjectOutputStream {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub

		File file=new File("f:/java练习文件/IO_Demo/ObjectStream.txt");
		write(file);
		read(file);
	}

	private static void read(File file) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream(file));
		Object obj1=ois.readObject();
		Object obj2=ois.readObject();
		System.out.println(obj1+"----"+obj2);
		ois.close();
	}

	private static void write(File file) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(file));
		Person p1=new Person("林青霞",25);
		Person p2=new Person("古天乐",30);
		oos.writeObject(p1);
		oos.writeObject(p2);
		oos.close();
	}

}

class Person implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2538047960619134005L;
	private String name;
//	private int age;
//	int age;
	//若不想年龄被序列化,则
	private transient int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}