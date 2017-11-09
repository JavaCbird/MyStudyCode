package exercise.collection.test;

import java.util.Scanner;

import exercise.collection.dao.UserDao;
import exercise.collection.game.Game;
import exercise.collection.pojo.User;
import exercise.collection_IO.dao.impl.UserDaoImpl;

public class UserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("------------��ӭʹ��------------");
			System.out.println("1 ��¼");
			System.out.println("2 ע��");
			System.out.println("3 �˳�");
			
			Scanner sc=new Scanner(System.in);
			String choiseString=sc.nextLine();
			
			UserDao ud=new UserDaoImpl();
			
			switch(choiseString) {	
			case "1":
				System.out.println("------------��¼����------------");
				System.out.println("�������û���:");
				String username=sc.nextLine();
				System.out.println("����������:");
				String password=sc.nextLine();
				
				boolean flag=ud.isLogin(username, password);
				if(flag) {
					System.out.println("��¼�ɹ�,��ʼ����Ϸ��");
					System.out.println("����Ϸ��? Y/N");
					while(true) {
						String result=sc.nextLine();
						if(result.equalsIgnoreCase("y")) {
							Game.guessNumber();
							System.out.println("������? Y/N");
						}else {
							break;
						}
//						sc.close();
					}
					System.out.println("��Ϸ����,��ӭ�´�����");
//					break;  �����break,��������switch,������whileѭ��
					//Ӧ�������������whileѭ��
					System.exit(0);	//�˳�JVM�����
					
				}else {
					System.out.println("��¼ʧ��");
				}
				
				break;			
			case "2":
				System.out.println("------------ע�����------------");
				System.out.println("�������û���:");
				String newUsername=sc.nextLine();
				System.out.println("����������:");
				String newPassword=sc.nextLine();
				
				User user=new User();
				user.setUsername(newUsername);
				user.setPassword(newPassword);
				//����ע�᷽��
				//��̬
				ud.regist(user);
				System.out.println("ע��ɹ�");
				break;
			case "3":
			default:
				System.out.println("------------ллʹ��------------");
				System.exit(0);
				break;
			}
		}
	}

}
