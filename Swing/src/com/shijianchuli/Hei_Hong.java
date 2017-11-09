/*
 * 事件处理机制
 */
package com.shijianchuli;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Hei_Hong extends JFrame implements ActionListener{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Hei_Hong();
	}

	JButton jb1=null;
	JButton jb2=null;
	JPanel jp=null;
	public Hei_Hong() {
		jb1=new JButton("黑色");
		jb2=new JButton("红色");
		jp=new JPanel();
		this.add(jb1,BorderLayout.NORTH);
		this.add(jp);
		this.add(jb2,BorderLayout.SOUTH);
		
		//注册监听
		jb1.addActionListener(this);
		//指定action命令
		jb1.setActionCommand("aa");
		jb2.addActionListener(this);
		jb2.setActionCommand("bb");
		
		this.setTitle("事件处理机制");
		this.setSize(500, 500);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if(ae.getActionCommand().equals("aa")) {
			jp.setBackground(Color.black);
		}else {
			jp.setBackground(Color.RED);
		}
	}
	
}

