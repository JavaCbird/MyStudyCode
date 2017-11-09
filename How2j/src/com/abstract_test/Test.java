package com.abstract_test;

public class Test implements AP,AD{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t=new Test();
		t.attack();
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		AD.super.attack();
		AP.super.attack();
		System.out.println("aaa");
	}
	

}

interface AD{
	default public void attack(){
		System.out.println("AD attack");
	}
}
interface AP{
	default public void attack(){
		System.out.println("AP attack");
	}
}