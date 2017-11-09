package com.map;
/*
 * HashMap相对于ArrayList的优点:可以直接根据key取出对象
 */
import java.util.HashMap;
import java.util.Iterator;

public class HHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hm=new HashMap();
		Emplot emp1=new Emplot("001","zzc",100);
		Emplot emp2=new Emplot("002","cl",200);
		Emplot emp3=new Emplot("003","ysd",300);
		//将emp放入到hm
		hm.put("001", emp1);
		hm.put("002", emp2);
		hm.put("002", emp3); //注意:此时,emp3会覆盖emp2
		
		//如果你要查找的编号是 002
		if(hm.containsKey("002")) {
			System.out.println("有该员工");
			//如何取出,键<-->值
			Emplot emp=(Emplot)hm.get("002");
			System.out.println("名字是:"+emp.getName());
		}else {
			System.out.println("没有该员工!");
		}
		
		//遍历HashMap中所有的key和value
		//Iterator(迭代)
		Iterator it=hm.keySet().iterator();
		//hasNext返回一个boolean,探测还有没有下一个
		while(it.hasNext()) {
			//取出key
			String key=it.next().toString(); //toString()的作用是将Object类型转换为字符串
			//通过key取出value
			Emplot emp=(Emplot)hm.get(key);
			System.out.println("名字:"+emp.getName());
			System.out.println("工资:"+emp.getSal());
		}
		
	}

}
//雇员类
class Emplot{
	private String No;
	public String getNo() {
		return No;
	}
	public void setNo(String no) {
		No = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSal() {
		return sal;
	}
	public void setSal(float sal) {
		this.sal = sal;
	}
	private String name;
	private float sal;
	public Emplot(String No,String name,float sal) {
		this.No=No;
		this.name=name;
		this.sal=sal;
	}
}