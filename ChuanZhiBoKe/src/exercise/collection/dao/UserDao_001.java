package exercise.collection.dao;

import exercise.collection.pojo.User;

/**
 * ��������û����в����Ľӿ�
 * @author ���ǳ�
 *
 */
public interface UserDao {
	/**
	 * �����û���¼����
	 * @param username	�û���
	 * @param password	����
	 * @return	���ص�¼�Ƿ�ɹ�
	 */
	public abstract boolean isLogin(String username,String password);
	/**
	 * �����û�ע�Ṧ��
	 * @param user	Ҫע����û���Ϣ
	 */
	public abstract void regist(User user);
}
