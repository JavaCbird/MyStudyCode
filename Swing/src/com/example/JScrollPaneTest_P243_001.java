package com.example;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

public class JScrollPaneTest_P243 extends JFrame{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JScrollPaneTest_P243();
	}

	public JScrollPaneTest_P243() {
		Container c=getContentPane();
		JTextArea ta=new JTextArea(80,100);
		JScrollPane sp=new JScrollPane(ta);
		c.add(sp);
		setTitle("带滚动条的文字编译器");
		setSize(400,400);
		setLocation(200, 200);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
}
