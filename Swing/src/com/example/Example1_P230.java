package com.example;

import java.awt.Color;
import java.awt.Container;

import javax.swing.*;

public class Example1_P230 extends JFrame{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Example1_P230().creatJFrame("����һ��JFrame����");
	}
	public void creatJFrame(String title) {
		JFrame jf=new JFrame(title);
		Container container=jf.getContentPane();
		JLabel jl=new JLabel("����һ��JFrame����");
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(jl);
		container.setBackground(Color.white);
		jf.setVisible(true);
		jf.setSize(500, 350);
		jf.setLocation(100, 200); //���ó�ʼλ��
		//���õ��رմ���ʱ,��֤jvmҲ�˳�
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
}
