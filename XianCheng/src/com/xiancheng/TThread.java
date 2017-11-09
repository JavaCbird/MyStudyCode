/*
 * 功能:演示如何通过继承Thread来开发线程
 * 	   打印10次hello,world
 */
package com.xiancheng;

public class TThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat=new Cat();
		//启动线程,会导致run函数的运行
		cat.start();
	}

}

class Cat extends Thread{
	int times=0;
	//重写Thread类中的run函数
	public void run() {
		while(true) {
			try {
				//调用sleep方法会导致线程进入Blocked即阻塞状态  , 1000表示1000毫秒即 1秒
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			times++;
			System.out.println("Hello,World!"+times);
			if(times==10) {
				break;	//执行break就会跳出while循环,意味着该线程死亡
			}
		}
	}
}