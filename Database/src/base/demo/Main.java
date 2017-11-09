package base.demo;
import java.util.List;
import java.util.Map;
public class Main {

	public static void main(String[] args) {
		DoAperation d = new DoAperation();
		List<Map<String,String>> res = d.selectThanId(30);
		d.close();
		for(Map m : res) {
			System.out.println("d_no"+":"+m.get("d_no")+"|"+"d_name"+":"+m.get("d_name")+"|"+"d_location"+":"+m.get("d_location"));
		}
	}

}
