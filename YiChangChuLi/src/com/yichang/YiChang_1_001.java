package com.yichang;
import java.io.*; //ʹ���ļ���,��Ҫ���������
import java.net.Socket;
public class YiChang_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����쳣1.���ļ�
		FileReader fr=null;
		try {
			//2.����һ��192.168.12.12 ip�Ķ˿ں�4567
			Socket s=new Socket("192.1688.1.23",78);
			fr=new FileReader("d:\\aa.txt");
		} catch (Exception e) {
			// TODO: handle exception
			//���쳣����Ϣ���,�����ų�bug
			e.printStackTrace();
			System.out.println("aaa");
		}finally {  //����
			//�������,������û���쳣,����ִ��
			//һ��˵,Ϊ�˰�ȫ�Կ���,����Ҫ�رյ���Դ(�ļ�,����,�ڴ��)�ر�	
			if(fr!=null) {  //����ļ����ڴ򿪵�״̬
				try {
					fr.close(); //�ر��ļ�
				} catch (Exception e2) {
					// TODO: handle exception
				}	
			}
		}
		
		//�����쳣
		//int a=4/0;
		//int arr[]= {1,2,3};
		//System.out.println(arr[234]);
		
	}

}
