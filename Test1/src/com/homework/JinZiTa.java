package com.homework;

public class JinZiTa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total_row=5;
		for(int i=1;i<=total_row;i++) {
			Space s1=new Space(total_row,i);
			s1.print_space();
			Star s2=new Star(total_row,i);
			s2.print_star();
			System.out.println();
		}
		  
	}

}

class Space
{
    int row,i;
	public Space(int total_row,int i) {
		this.row=total_row;
		this.i=i;
	}
	public void print_space() {
		for(int j=1;j<=row-i;j++){
			System.out.print(" ");
		}
	}
	
}

class Star{
	int row,i;
	public Star(int total_row,int i) {
		this.row=total_row;
		this.i=i;
	}
	public void print_star() {
		for(int j=1;j<=2*i-1;j++){
			System.out.print("*");
		}		
	}
}

