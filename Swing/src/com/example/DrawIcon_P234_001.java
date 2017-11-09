package com.example;

import java.awt.Component;
import java.awt.Container;
import java.awt.Graphics;

import javax.swing.*;

public class DrawIcon_P234 implements Icon{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DrawIcon_P234 icon=new DrawIcon_P234(15,15);
		JLabel jl=new JLabel("≤‚ ‘",icon,SwingConstants.CENTER);
		JFrame jf=new JFrame();
		Container c=jf.getContentPane();
		c.add(jl);
		jf.setSize(300, 300);
		jf.setLocation(200, 300);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
	}
	
	private int width;
	private int height;
	
	public int getIconHeight() {
		return this.height;
	}
	public int getIconWidth() {
		return this.width;
	}
	public void paintIcon(Component c, Graphics g, int x, int y) {
		g.fillOval(x, y, width, height);
	}
	public DrawIcon_P234(int width,int height){
		this.width=width;
		this.height=height;
	}
	
}
