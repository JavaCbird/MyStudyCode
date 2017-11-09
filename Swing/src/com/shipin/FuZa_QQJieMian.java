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

	//北部区域
	JLabel jl1;
	//南部区域
	JPanel jp1;
	JButton jb1,jb2,jb3;
	//中部区域
	JTabbedPane jtp;  //选项卡窗格
	JPanel jp2,jp3,jp4;//三个JPanel对应三个窗格
	
	JLabel jl2,jl3,jl4,jl5;
	JTextField jtf;
	JPasswordField jpf;
	JButton jb4;
	JCheckBox jcb1,jcb2;
	
	//构造函数
	public FuZa_QQJieMian() {
		//北部区域
		jl1=new JLabel(new ImageIcon("images/qq2011.jpg"));
		
		//南部区域
		jp1=new JPanel();
		
		jb1=new JButton("登录");
		jb2=new JButton("取消");
		jb3=new JButton("注册向导");
		
		jb1.setFont(new Font("隶书",Font.PLAIN,16));//设置字体样式
		jb1.setForeground(Color.RED);  //设置字体颜色
		jb2.setFont(new Font("隶书",Font.PLAIN,16));//设置字体样式
		jb2.setForeground(Color.RED);  //设置字体颜色
		jb3.setFont(new Font("隶书",Font.PLAIN,16));//设置字体样式
		jb3.setForeground(Color.RED);  //设置字体颜色
		
		jp1.add(jb1);
		jp1.add(jb2);
		jp1.add(jb3);
		
		//中部区域
		jl2=new JLabel("QQ号码",JLabel.CENTER);
		jl3=new JLabel("QQ密码",JLabel.CENTER);
		jl4=new JLabel("忘记密码",JLabel.CENTER);
		jl4.setFont(new Font("宋体",Font.PLAIN,16));//设置字体样式
		jl4.setForeground(Color.BLUE);  //设置字体颜色
		jl5=new JLabel("申请密码保护",JLabel.CENTER);
		//鼠标移动到jl5上是显示手形
		jl5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		jtf=new JTextField();
		jpf=new JPasswordField();
		
		jb4=new JButton("清除号码");
		jb4.setFont(new Font("隶书",Font.PLAIN,16));//设置字体样式
		jb4.setForeground(Color.RED);  //设置字体颜色
		
		jcb1=new JCheckBox("隐身登录");
		jcb2=new JCheckBox("记住密码");
		
		//设置窗格
		jtp=new JTabbedPane();
		jp2=new JPanel();
		jp3=new JPanel();
		jp3.setBackground(Color.RED);//给面板设置背景色
		jp4=new JPanel();
		jp4.setBackground(Color.blue);
		//将面板添加到选项卡窗格上
		jtp.add("QQ号码", jp2);
		jtp.add("手机号码", jp3);
		jtp.add("电子邮箱", jp4); 
		//设置面板2(jp2)的布局
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
		
		this.setTitle("用户注册界面");
		//在窗体栏中添加图片
		this.setIconImage((new ImageIcon("images/qq.jpg")).getImage());
		this.setSize(500, 400);
		this.setLocation(200, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setResizable(false);
	}
}
