package com.example;

import java.awt.Color;
import java.awt.Container;

import javax.swing.*;

public class Example1_P230 extends JFrame{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Example1_P230().creatJFrame("创建一个JFrame窗体");
	}
	public void creatJFrame(String title) {
		JFrame jf=new JFrame(title);
		Container container=jf.getContentPane();
		JLabel jl=new JLabel("这是一个JFrame窗体");
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(jl);
		container.setBackground(Color.white);
		jf.setVisible(true);
		jf.setSize(500, 350);
		jf.setLocation(100, 200); //设置初始位置
		//设置当关闭窗口时,保证jvm也退出
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
}
