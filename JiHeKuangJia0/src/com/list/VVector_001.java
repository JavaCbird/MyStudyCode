package com.list;

import java.util.Vector;

//Vector是向量的意思
public class VVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector vv=new Vector();
		Emplot emp1=new Emplot("001","zzc",10);
		vv.add(emp1);
		
		for(int i=0;i<vv.size();i++) {
			Emplot emp=(Emplot)vv.get(i);
			System.out.println(emp.getName());
		}
	}

}
