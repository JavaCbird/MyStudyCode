package com.shipin;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.*;

public class FuZa_QQJieMian extends JFrame{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FuZa_QQJieMian();
	}

	//��������
	JLabel jl1;
	//�ϲ�����
	JPanel jp1;
	JButton jb1,jb2,jb3;
	//�в�����
	JTabbedPane jtp;  //ѡ�����
	JPanel jp2,jp3,jp4;//����JPanel��Ӧ��������
	
	JLabel jl2,jl3,jl4,jl5;
	JTextField jtf;
	JPasswordField jpf;
	JButton jb4;
	JCheckBox jcb1,jcb2;
	
	//���캯��
	public FuZa_QQJieMian() {
		//��������
		jl1=new JLabel(new ImageIcon("images/qq2011.jpg"));
		
		//�ϲ�����
		jp1=new JPanel();
		
		jb1=new JButton("��¼");
		jb2=new JButton("ȡ��");
		jb3=new JButton("ע����");
		
		jb1.setFont(new Font("����",Font.PLAIN,16));//����������ʽ
		jb1.setForeground(Color.RED);  //����������ɫ
		jb2.setFont(new Font("����",Font.PLAIN,16));//����������ʽ
		jb2.setForeground(Color.RED);  //����������ɫ
		jb3.setFont(new Font("����",Font.PLAIN,16));//����������ʽ
		jb3.setForeground(Color.RED);  //����������ɫ
		
		jp1.add(jb1);
		jp1.add(jb2);
		jp1.add(jb3);
		
		//�в�����
		jl2=new JLabel("QQ����",JLabel.CENTER);
		jl3=new JLabel("QQ����",JLabel.CENTER);
		jl4=new JLabel("��������",JLabel.CENTER);
		jl4.setFont(new Font("����",Font.PLAIN,16));//����������ʽ
		jl4.setForeground(Color.BLUE);  //����������ɫ
		jl5=new JLabel("�������뱣��",JLabel.CENTER);
		//����ƶ���jl5������ʾ����
		jl5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		jtf=new JTextField();
		jpf=new JPasswordField();
		
		jb4=new JButton("�������");
		jb4.setFont(new Font("����",Font.PLAIN,16));//����������ʽ
		jb4.setForeground(Color.RED);  //����������ɫ
		
		jcb1=new JCheckBox("�����¼");
		jcb2=new JCheckBox("��ס����");
		
		//���ô���
		jtp=new JTabbedPane();
		jp2=new JPanel();
		jp3=new JPanel();
		jp3.setBackground(Color.RED);//��������ñ���ɫ
		jp4=new JPanel();
		jp4.setBackground(Color.blue);
		//�������ӵ�ѡ�������
		jtp.add("QQ����", jp2);
		jtp.add("�ֻ�����", jp3);
		jtp.add("��������", jp4); 
		//�������2(jp2)�Ĳ���
		jp2.setLayout(new GridLayout(3, 3));
		jp2.add(jl2);
		jp2.add(jtf);
		jp2.add(jb4);
		jp2.add(jl3);
		jp2.add(jpf);
		jp2.add(jl4);
		jp2.add(jcb1);
		jp2.add(jcb2);
		jp2.add(jl5);
		
		this.add(jl1,BorderLayout.NORTH);
		this.add(jtp,BorderLayout.CENTER);
		this.add(jp1,BorderLayout.SOUTH);
		
		this.setTitle("�û�ע�����");
		//�ڴ����������ͼƬ
		this.setIconImage((new ImageIcon("images/qq.jpg")).getImage());
		this.setSize(500, 400);
		this.setLocation(200, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setResizable(false);
	}
}
