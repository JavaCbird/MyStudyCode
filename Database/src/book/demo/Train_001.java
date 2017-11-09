package book.demo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * ģ����ѯ
 */
public class Train {
	static Connection con;
	static Statement sql;
	static ResultSet res;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conn c=new Conn();
		con=c.getConnection();
		try {
			sql=con.createStatement();
			res=sql.executeQuery("select * from dept where d_location like 'Sh%'");
			while(res.next()) {
				String no=res.getString("d_no");
				String name=res.getString("d_name");
				String loc=res.getString("d_location");
				System.out.print("���:"+no);
				System.out.print("����:"+name);
				System.out.println("��ַ:"+loc);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				sql.close();
				res.close();
				c.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
