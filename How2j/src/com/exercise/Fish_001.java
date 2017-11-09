package com.exercise;

public class Fish extends Animal implements Pet{

	private String name;
	
	protected Fish() {
		super(0);
		// TODO Auto-generated constructor stub
	}

	void walk() {
		System.out.println("鱼没有腿,不能走路");
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public String setName(String name) {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("鱼玩耍");
	}

	@Override
	void eat() {
		// TODO Auto-generated method stub
		System.out.println("鱼吃饭");
	}
}
