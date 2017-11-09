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
			System.out.println("------------欢迎使用------------");
			System.out.println("1 登录");
			System.out.println("2 注册");
			System.out.println("3 退出");
			
			Scanner sc=new Scanner(System.in);
			String choiseString=sc.nextLine();
			
			UserDao ud=new UserDaoImpl();
			
			switch(choiseString) {	
			case "1":
				System.out.println("------------登录界面------------");
				System.out.println("请输入用户名:");
				String username=sc.nextLine();
				System.out.println("请输入密码:");
				String password=sc.nextLine();
				
				boolean flag=ud.isLogin(username, password);
				if(flag) {
					System.out.println("登录成功,开始玩游戏吧");
					System.out.println("玩游戏吗? Y/N");
					while(true) {
						String result=sc.nextLine();
						if(result.equalsIgnoreCase("y")) {
							Game.guessNumber();
							System.out.println("还玩吗? Y/N");
						}else {
							break;
						}
//						sc.close();
					}
					System.out.println("游戏结束,欢迎下次再来");
//					break;  这里的break,结束的是switch,而不是while循环
					//应该这样结束外层while循环
					System.exit(0);	//退出JVM虚拟机
					
				}else {
					System.out.println("登录失败");
				}
				
				break;			
			case "2":
				System.out.println("------------注册界面------------");
				System.out.println("请输入用户名:");
				String newUsername=sc.nextLine();
				System.out.println("请输入密码:");
				String newPassword=sc.nextLine();
				
				User user=new User();
				user.setUsername(newUsername);
				user.setPassword(newPassword);
				//调用注册方法
				//多态
				ud.regist(user);
				System.out.println("注册成功");
				break;
			case "3":
			default:
				System.out.println("------------谢谢使用------------");
				System.exit(0);
				break;
			}
		}
	}

}
