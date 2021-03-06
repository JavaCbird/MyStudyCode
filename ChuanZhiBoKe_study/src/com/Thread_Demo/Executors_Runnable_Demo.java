package com.Thread_Demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * 线程池的使用
 */
public class Executors_Runnable_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建一个能存放两个线程的线程池
		ExecutorService pool=Executors.newFixedThreadPool(2);
		//添加线程
		pool.submit(new MyThread());
		pool.submit(new MyThread());
		//结束线程池
		pool.shutdown();
	}

}

class MyThread implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			System.out.println(i);
		}
	}
	
}