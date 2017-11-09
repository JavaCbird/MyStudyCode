package exercise.collection.game;

import java.util.Scanner;

public class Game {
	private Game() {
		
	}
	public static void guessNumber() {
		int num=(int)(Math.random()*100+1);
		int count=0;
		System.out.println("输入你猜的数字(1-100):");
		
		while(true) {
			Scanner sc=new Scanner(System.in);
			int myNum=sc.nextInt();				
			count++;
			
			if(myNum<num) {
				System.out.println("你猜的数小了");
			}else if(myNum>num) {
				System.out.println("你猜的数大了");
			}else {
				System.out.println("恭喜你,猜了"+count+"次猜对了");
//				sc.close();
				break;
			}
		}
	}
}
