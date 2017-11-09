package com.yichang;

public class Test_P219 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String str="LiLi";
			System.out.println(str+"年龄是:");
			int age=Integer.parseInt("20L"); //此异常后面的语句将不被执行
			System.out.println(age);
			System.out.println("test");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("program over");
	}

}
