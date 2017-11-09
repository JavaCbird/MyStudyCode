package com.Thread_Demo;

/*
 * 不常用,了解即可
 * Callable是泛型接口
 * 功能:分别用两个线程求和
 */
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Executors_Callable_Demo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		ExecutorService pool = Executors.newFixedThreadPool(2);
		Future<Integer> f1 = pool.submit(new MyCallable(100));
		Future<Integer> f2 = pool.submit(new MyCallable(200));
		Integer sum1 = f1.get();
		Integer sum2 = f2.get();
		System.out.println(sum1);
		System.out.println(sum2);
		pool.shutdown();
	}

}

class MyCallable implements Callable<Integer> {
	private int number;
	int sum = 0;

	public MyCallable(int number) {
		this.number = number;
	}

	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		for (int i = 1; i <= number; i++) {
			sum += i;
		}
		return sum;
	}

}