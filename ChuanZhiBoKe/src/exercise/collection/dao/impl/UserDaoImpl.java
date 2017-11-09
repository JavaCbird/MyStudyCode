package exercise.collection.dao.impl;

import java.util.ArrayList;

import exercise.collection.dao.UserDao;
import exercise.collection.pojo.User;
/**
 * 这是用户操作的具体实现类(集合版)
 * @author 朱智超
 *
 */
public class UserDaoImpl implements UserDao {
	//为了让多个对象共用一个成员变量,将成员变量设为static
	private static ArrayList<User> array=new ArrayList<User>();
	@Override
	//登录
	public boolean isLogin(String username, String password) {
		// TODO Auto-generated method stub
		boolean flag=false;

		for(User u:array) {
			if(u.getUsername().equals(username) && u.getPassword().equals(password)) {
				flag=true;
				break;
			}
		}
		return flag;
	}

	@Override
	//注册
	public void regist(User user) {
		// TODO Auto-generated method stub
//		ArrayList<User> array=new ArrayList<User>();
		array.add(user);
	}

}
