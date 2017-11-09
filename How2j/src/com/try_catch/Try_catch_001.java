package com.try_catch;

public class Try_catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(ff());
	}

	static int ff() {
		try {
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
			return 2;
		}finally {
			return 3;
		}
	}
}
