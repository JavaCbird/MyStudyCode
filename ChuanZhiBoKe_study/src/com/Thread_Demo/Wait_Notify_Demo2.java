package com.Thread_Demo;

/*
 * 优化代码
 * 出问题了
 */
public class Wait_Notify_Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2 s2 = new Student2();
		SetThread2 st2 = new SetThread2(s2);
		GetThread2 gt2 = new GetThread2(s2);

		Thread t1 = new Thread(st2);
		Thread t2 = new Thread(gt2);
		t1.start();
		t2.start();
	}

}

class Student2 {
	private String name;
	private int age;
	private boolean flag; // 默认为false

	public synchronized void set(String name, int age) {
		// 如果有数据,就等待
		if (this.flag == true) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		this.name = name;
		this.age = age;

		this.flag = true;
		this.notify();
	}

	public synchronized void get() {
		if (this.flag == false) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(this.name + "---" + this.age);
		
		this.flag = false;
		this.notify();
	}
}

// 生产者线程
class SetThread2 implements Runnable {
	private Student2 s;
	private int x = 0;

	public SetThread2(Student2 s) {
		this.s = s;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			if (x % 2 == 0) {
				s.set("林青霞", 27);
			} else {
				s.set("周杰伦", 30);
			}
			x++;
		}
	}
}

// 消费者线程
class GetThread2 implements Runnable {
	private Student2 s;

	public GetThread2(Student2 s) {
		this.s = s;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			s.get();
		}
	}

}