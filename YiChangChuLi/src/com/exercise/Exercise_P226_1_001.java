package com.exercise;

public class Exercise_P226_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st=new Student();
		try {
			st.speak(10000);
		} catch (MyException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}

class MyException extends Exception{
	String ErrorMessage;
	public MyException(String ErrorMessage) {
		this.ErrorMessage=ErrorMessage;
	}
	public String getMessage() {
		return ErrorMessage;
	}
}

class Student{
	static void speak(int m) throws MyException{
		if(m>1000) {
			throw new MyException("Öµ´óÓÚ1000!");
		}
	}
}