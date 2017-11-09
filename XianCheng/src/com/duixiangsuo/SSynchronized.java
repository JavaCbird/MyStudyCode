/*
 * 功能:使用对象锁来控制多线程并发,保证代码的原子性
 */
package com.duixiangsuo;

public class SSynchronized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建一个售票窗口
		TicketWindow tw=new TicketWindow();
		//使用三个线程同时启动
		Thread t1=new Thread(tw);
		Thread t2=new Thread(tw);
		Thread t3=new Thread(tw);
		
		t1.start();
		t2.start();
		t3.start();
	}

}
//售票窗口类
class TicketWindow implements Runnable{
	private int nums=2000;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			synchronized (this) {  //对象锁
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			//Thread.currentThread().getName()用来获取当前线程的名字
			System.out.println(Thread.currentThread().getName()+" 正在售出第 "+nums+" 张票");
			nums--;
			}
			
		}
	}
	
}