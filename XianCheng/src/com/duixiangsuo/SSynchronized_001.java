/*
 * ����:ʹ�ö����������ƶ��̲߳���,��֤�����ԭ����
 */
package com.duixiangsuo;

public class SSynchronized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����һ����Ʊ����
		TicketWindow tw=new TicketWindow();
		//ʹ�������߳�ͬʱ����
		Thread t1=new Thread(tw);
		Thread t2=new Thread(tw);
		Thread t3=new Thread(tw);
		
		t1.start();
		t2.start();
		t3.start();
	}

}
//��Ʊ������
class TicketWindow implements Runnable{
	private int nums=2000;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			synchronized (this) {  //������
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			//Thread.currentThread().getName()������ȡ��ǰ�̵߳�����
			System.out.println(Thread.currentThread().getName()+" �����۳��� "+nums+" ��Ʊ");
			nums--;
			}
			
		}
	}
	
}