package base.demo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class GetConn {
	private Connection conn = null;
	public GetConn() {
		try {
			//¼ÓÔØÇý¶¯³ÌÐò
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_query?serverTimezone=GMT","root","zhu199586");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public void close() {
		try {
			this.conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public Connection getConn() {
		return this.conn;
	}
}
