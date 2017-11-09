package com.exercise;

public class Exercise_P226_2 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Number num=new Number();
		try {
			int result;
			result=num.count(254896321, 0);
			System.out.println(result);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}

class Number{
	public int count(int a,int b){
		return a/b;
	}
}