package com.map;
/*
 * HashMap�����ArrayList���ŵ�:����ֱ�Ӹ���keyȡ������
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
		//��emp���뵽hm
		hm.put("001", emp1);
		hm.put("002", emp2);
		hm.put("002", emp3); //ע��:��ʱ,emp3�Ḳ��emp2
		
		//�����Ҫ���ҵı���� 002
		if(hm.containsKey("002")) {
			System.out.println("�и�Ա��");
			//���ȡ��,��<-->ֵ
			Emplot emp=(Emplot)hm.get("002");
			System.out.println("������:"+emp.getName());
		}else {
			System.out.println("û�и�Ա��!");
		}
		
		//����HashMap�����е�key��value
		//Iterator(����)
		Iterator it=hm.keySet().iterator();
		//hasNext����һ��boolean,̽�⻹��û����һ��
		while(it.hasNext()) {
			//ȡ��key
			String key=it.next().toString(); //toString()�������ǽ�Object����ת��Ϊ�ַ���
			//ͨ��keyȡ��value
			Emplot emp=(Emplot)hm.get(key);
			System.out.println("����:"+emp.getName());
			System.out.println("����:"+emp.getSal());
		}
		
	}

}
//��Ա��
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