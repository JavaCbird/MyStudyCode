package com.exercise;

public class Cat extends Animal implements Pet{
	String name;
	
	protected Cat(String name) {
		super(4);
		// TODO Auto-generated constructor stub
		this.name=name;
	}

	protected Cat() {
		this("");
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Сè��ˣ");
	}

	@Override
	void eat() {
		// TODO Auto-generated method stub
		System.out.println("Сè��");
	}

	@Override
	public String setName(String name) {
		// TODO Auto-generated method stub
		return name;
	}
	
	
}
