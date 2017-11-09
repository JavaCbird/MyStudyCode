package com.Web_Demo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/*
 * UDP协议接收数据
 * 接收端
 */
public class Receive_Demo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//创建接收端的Socket对象,将端口号作为参数传入
		DatagramSocket ds=new DatagramSocket(10086);
		
		//创建一个数据包(接收容器)dp
		byte[] bys=new byte[1024];
		int length=bys.length;
		DatagramPacket dp=new DatagramPacket(bys,length);
		
		//调用Socket对象的接收方法接收对象
		ds.receive(dp);
		
		//解析数据包,并显示在控制台
		byte[] bys2=dp.getData();//获取数据缓冲区
		int len=dp.getLength();//获取数据的实际长度
		String s=new String(bys2,0,len);
		System.out.println(s);
		
		//释放资源
		ds.close();
	}

}
