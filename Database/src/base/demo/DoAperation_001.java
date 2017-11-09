package base.demo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.sql.ResultSet;
import java.sql.SQLException;
public class DoAperation {
	private GetConn gcon = null;
	private Connection conn = null;
	private PreparedStatement ps = null;
	private ResultSet set=null;
	public DoAperation() {
		gcon = new GetConn();
		conn = gcon.getConn();
	}
	public void close() {
		gcon.close();
	}
	public List<Map<String, String>> selectThanId(int id) {
		String sql = "select * from dept where d_no >= ?";
		List<Map<String, String>> res = new ArrayList<>();
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			ps.execute();
			set = ps.getResultSet();
			while(set.next()) {
				Map<String, String> item = new HashMap<>();
				item.put("d_no", set.getString("d_no"));
				item.put("d_name", set.getString("d_name"));
				item.put("d_location", set.getString("d_location"));
				res.add(item);
			}
			return res;
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				set.close();
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return null;
	}
}
