package com.Web_Demo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/*
 * UDPЭ���������
 * ���ն�
 */
public class Receive_Demo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//�������ն˵�Socket����,���˿ں���Ϊ��������
		DatagramSocket ds=new DatagramSocket(10086);
		
		//����һ�����ݰ�(��������)dp
		byte[] bys=new byte[1024];
		int length=bys.length;
		DatagramPacket dp=new DatagramPacket(bys,length);
		
		//����Socket����Ľ��շ������ն���
		ds.receive(dp);
		
		//�������ݰ�,����ʾ�ڿ���̨
		byte[] bys2=dp.getData();//��ȡ���ݻ�����
		int len=dp.getLength();//��ȡ���ݵ�ʵ�ʳ���
		String s=new String(bys2,0,len);
		System.out.println(s);
		
		//�ͷ���Դ
		ds.close();
	}

}
