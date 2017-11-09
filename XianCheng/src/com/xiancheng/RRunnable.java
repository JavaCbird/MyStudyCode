package com.xiancheng;

public class RRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog=new Dog();
		//����һ��Thread����
		Thread t=new Thread(dog);
		t.start();
	}

}

class Dog implements Runnable{
	int times=0;
	//��дThread���е�run����
	public void run() {
		while(true) {
			try {
				//����sleep�����ᵼ���߳̽���Blocked������״̬  , 1000��ʾ1000���뼴 1��
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			times++;
			System.out.println("Hello,World!"+times);
			if(times==10) {
				break;	//ִ��break�ͻ�����whileѭ��,��ζ�Ÿ��߳�����
			}
		}
	}
}