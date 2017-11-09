package com.yichang;
import java.io.*; //使用文件类,就要引入这个包
import java.net.Socket;
public class YiChang_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//检查异常1.打开文件
		FileReader fr=null;
		try {
			//2.连接一个192.168.12.12 ip的端口号4567
			Socket s=new Socket("192.1688.1.23",78);
			fr=new FileReader("d:\\aa.txt");
		} catch (Exception e) {
			// TODO: handle exception
			//把异常的信息输出,利于排除bug
			e.printStackTrace();
			System.out.println("aaa");
		}finally {  //处理
			//这个语句块,不管有没有异常,都会执行
			//一般说,为了安全性考虑,把需要关闭的资源(文件,链接,内存等)关闭	
			if(fr!=null) {  //如果文件处于打开的状态
				try {
					fr.close(); //关闭文件
				} catch (Exception e2) {
					// TODO: handle exception
				}	
			}
		}
		
		//运行异常
		//int a=4/0;
		//int arr[]= {1,2,3};
		//System.out.println(arr[234]);
		
	}

}
