package com.test4;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

interface Fish
{
	public void swimming();
}

interface Bird
{
	public void flying();
}

class Monkey
{
	int name;
	public void jump()
	{
		System.out.println("ºï×Ó»áÌø!");
	}
}

class LittleMonkey extends Monkey implements Fish,Bird
{

	@Override
	public void swimming() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void flying() {
		// TODO Auto-generated method stub
		
	}
	
}