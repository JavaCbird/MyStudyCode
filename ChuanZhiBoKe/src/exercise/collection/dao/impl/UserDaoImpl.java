package exercise.collection.dao.impl;

import java.util.ArrayList;

import exercise.collection.dao.UserDao;
import exercise.collection.pojo.User;
/**
 * �����û������ľ���ʵ����(���ϰ�)
 * @author ���ǳ�
 *
 */
public class UserDaoImpl implements UserDao {
	//Ϊ���ö��������һ����Ա����,����Ա������Ϊstatic
	private static ArrayList<User> array=new ArrayList<User>();
	@Override
	//��¼
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
	//ע��
	public void regist(User user) {
		// TODO Auto-generated method stub
//		ArrayList<User> array=new ArrayList<User>();
		array.add(user);
	}

}
