package exercise.collection.game;

import java.util.Scanner;

public class Game {
	private Game() {
		
	}
	public static void guessNumber() {
		int num=(int)(Math.random()*100+1);
		int count=0;
		System.out.println("������µ�����(1-100):");
		
		while(true) {
			Scanner sc=new Scanner(System.in);
			int myNum=sc.nextInt();				
			count++;
			
			if(myNum<num) {
				System.out.println("��µ���С��");
			}else if(myNum>num) {
				System.out.println("��µ�������");
			}else {
				System.out.println("��ϲ��,����"+count+"�β¶���");
//				sc.close();
				break;
			}
		}
	}
}
