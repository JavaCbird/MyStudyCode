package com.exercise;

public class Exercise_P226_3 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Computer com=new Computer();
		try {
			com.ff(18, -14);
		} catch (MiyException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}

class MiyException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	String message;
	public MiyException(String ErrorMessage) {
		message=ErrorMessage;
	}
	public String getMessage() {
		return message;
	}
}

class Computer{
	public void ff(int m,int n) throws MiyException{
		if(m<=0||n<=0) {
			throw new MiyException("不能为负数!");
		}
		while(m!=n) {
			if(m>n) {
				m=m-n;
			}
			if(m<n) {
				n=n-m;
			}
		}
		System.out.println(m);
	}
}