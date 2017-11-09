package com.Thread_Demo;
/*
 * 写一个产生死锁的代码
 */
public class DieLock_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DieLock dl1=new DieLock(true);
		DieLock dl2=new DieLock(false);
		dl1.start();
		dl2.start();
	}

}

//创建锁
class MyLock{
	//创建两个锁对象
	public static final Object obj1=new Object();
	public static final Object obj2=new Object();
}

class DieLock extends Thread{
	private boolean flag;

	public DieLock(boolean flag) {
		this.flag = flag;
	}
	
	public void run() {
		if(flag) {
			synchronized (MyLock.obj1) {
				System.out.println("if obj1");
				synchronized (MyLock.obj2) {
					System.out.println("if obj2");
				}
			}
		}else {
			synchronized (MyLock.obj2) {
				System.out.println("else obj2");
				synchronized (MyLock.obj1) {
					System.out.println("else obj1");
				}
			}
		}
	}
}