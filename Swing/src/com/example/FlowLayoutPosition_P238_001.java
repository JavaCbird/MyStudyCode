package com.example;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.*;

public class FlowLayoutPosition_P238 extends JFrame{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FlowLayoutPosition_P238();
	}
	
	public FlowLayoutPosition_P238() {
		setTitle("����һ����ʽ����");
		Container c=getContentPane();
		setLayout(new FlowLayout(0,20,10));
		for(int i=0;i<10;i++) {
			c.add(new JButton("��ť"+i));
		}
		setLocation(200, 200);
		setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		//��ֹ�û��ı䴰���С
		this.setResizable(false);
	}
}
