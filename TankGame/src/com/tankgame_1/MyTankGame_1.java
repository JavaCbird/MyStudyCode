/*
 * 功能:画出坦克
 */
package com.tankgame_1;

import java.awt.*;

import javax.swing.*;

public class MyTankGame_1 extends JFrame{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyTankGame_1();
	}
	MyPanel mp=null;
	public MyTankGame_1() {
		mp=new MyPanel();
		this.add(mp);
		this.setTitle("坦克大战");
		this.setSize(500, 500);
		this.setLocation(100, 100);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

//我的面板
class MyPanel extends JPanel{
	
	//定义一个我的坦克
	MyTank mt=null;
	//构造函数
	public MyPanel() {
		mt=new MyTank(100,100);
	}
	
	//重写父类的paint方法
	public void paint(Graphics g) {
		super.paint(g);
		g.fillRect(0, 0, 500, 500);  //填充背景颜色为黑色
		this.drawTank(mt.getX(), mt.getY(), g, 0, 0);
	}
	
	//定义一个画出坦克的方法
	public void drawTank(int x,int y,Graphics g,int type,int direct) {
		switch(type) {	//判断是什么类型的坦克
		case 0:	//我方坦克
			g.setColor(Color.CYAN);
			break;
		case 1:	//敌方坦克
			g.setColor(Color.RED);
			break;
		}
		
		switch(direct) {	//判断坦克的方向
		case 0:	//向上
			//1.画出左侧矩形
			g.fill3DRect(x, y, 5, 30, false);
			//2.画出右侧矩形
			g.fill3DRect(x+15, y, 5, 30, false);
			//3.画出中间矩形
			g.fill3DRect(x+5, y+5, 10, 20, false);
			//4.画出中间圆形
			g.fillOval(x+5, y+10, 10, 10);
			//5.画出中间直线
			g.drawLine(x+10, y+15, x+10, y);
			break;
		case 1:
			g.fill3DRect(x, y, 5, 30, false);
			g.fill3DRect(x+15, y, 5, 30, false);
			g.fill3DRect(x+5, y+5, 10, 20, false);
			g.fillOval(x+5, y+10, 10, 10);
			//画出中间直线
			g.drawLine(x+10, y+15, x+10, y+30);
			break;
		}
		
	}
}

//坦克类
class Tank{
	int x=0;  //表示坦克的横坐标
	int y=0;  //表示坦克的纵坐标
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public Tank(int x,int y) {
		this.x=x;
		this.y=y;
	}
}

//我的坦克
class MyTank extends Tank{

	public MyTank(int x, int y) {
		super(x, y);
	}
	
}