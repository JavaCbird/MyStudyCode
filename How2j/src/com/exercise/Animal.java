package com.exercise;

public abstract class Animal {
	protected int legs;
	protected Animal(int legs) {
		this.legs=legs;
	}
	abstract void eat();
	void walk() {
		System.out.println("动物用"+legs+"条腿行走");
	}
}
