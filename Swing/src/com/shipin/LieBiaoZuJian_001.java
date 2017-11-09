/*
 * JComboBox,JList,JScrollpane
 */
package com.shipin;

import java.awt.GridLayout;

import javax.swing.*;

import com.example.JScrollPaneTest_P243;

public class LieBiaoZuJian extends JFrame{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new LieBiaoZuJian();
	}

	JPanel jp1,jp2;
	JLabel jl1,jl2;
	JComboBox jc;
	JList jl;
	JScrollPane jsp;
	
	public LieBiaoZuJian() {
		jp1=new JPanel();
		jp2=new JPanel();
		
		jl1=new JLabel("���ļ�����");
		jl2=new JLabel("��ϲ��ȥ���εĵ���");
		
		String[] jg= {"����","�Ϻ�","ɽ��","ɽ��"};
		jc=new JComboBox(jg);
		
		String[] dq= {"����","�Ϻ�","ɽ��","ɽ��","�Ĵ�"};
		jl=new JList(dq);
		jl.setVisibleRowCount(3);
		jsp=new JScrollPane(jl);
		
		jp1.add(jl1);
		jp1.add(jc);
		
		jp2.add(jl2);
		jp2.add(jsp);
		
		this.setLayout(new GridLayout(2, 1));
		this.add(jp1);
		this.add(jp2);
		this.setTitle("�ʾ����");
		this.setSize(300, 180);
		this.setLocation(200, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setResizable(false);
	}
}
