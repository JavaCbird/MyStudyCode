package com.xiancheng;

public class RRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog=new Dog();
		//创建一个Thread对象
		Thread t=new Thread(dog);
		t.start();
	}

}

class Dog implements Runnable{
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