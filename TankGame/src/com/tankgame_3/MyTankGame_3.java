/*
 * 功能:在版本2基础上添加敌方坦克
 */
package com.tankgame_3;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

import javax.swing.*;

public class MyTankGame_3 extends JFrame{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyTankGame_3();
	}
	MyPanel mp=null;
	public MyTankGame_3() {
		mp=new MyPanel();
		this.add(mp);
		this.setTitle("坦克大战");
		this.setSize(500, 500);
		this.setLocation(100, 100);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.addKeyListener(mp);
	}
}

//我的面板
class MyPanel extends JPanel implements KeyListener{
	
	//定义一个我的坦克
	MyTank mt=null;
	//定义敌人的坦克组    ets为Vector集合的对象
	Vector<EnemyTank> ets=new Vector<EnemyTank>();
	int enSize=3;	//敌方坦克数量
	
	//构造函数
	public MyPanel() {
		mt=new MyTank(100,100);
		
		//初始化敌方坦克
		for(int i=0;i<enSize;i++) {
			//创建敌人的坦克对象
			EnemyTank et=new EnemyTank((i+1)*100, 0);
			//设置敌方坦克类型为1,即颜色与我的坦克不同
			et.setType(1);
			//设置敌方坦克初始方向为下
			et.setDirect(1);
			//将每个坦克对象分别加入集合
			ets.add(et);
		}
	}
	
	//重写父类的paint方法
	public void paint(Graphics g) {
		super.paint(g);
		g.fillRect(0, 0, 500, 500);  //填充背景颜色为黑色
		//画出我的坦克
		this.drawTank(mt.getX(), mt.getY(), g, 0, mt.getDirect());
		//画出敌方坦克
		for(int i=0;i<ets.size();i++) {
			this.drawTank(ets.get(i).getX(), ets.get(i).getY(), g, ets.get(i).getType(), ets.get(i).getDirect());
		}
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
		case 1:	//向下
			g.fill3DRect(x, y, 5, 30, false);
			g.fill3DRect(x+15, y, 5, 30, false);
			g.fill3DRect(x+5, y+5, 10, 20, false);
			g.fillOval(x+5, y+10, 10, 10);
			//画出中间直线
			g.drawLine(x+10, y+15, x+10, y+30);
			break;
		case 2:	//向左
			//1.画出上侧矩形
			g.fill3DRect(x, y, 30, 5, false);
			//2.画出下侧矩形
			g.fill3DRect(x, y+15, 30, 5, false);
			//3.画出中间矩形
			g.fill3DRect(x+5, y+5, 20, 10, false);
			//4.画出中间圆形
			g.fillOval(x+10, y+5, 10, 10);
			//5.画出中间直线
			g.drawLine(x+15, y+10, x, y+10);
			break;
		case 3:	//向右
			g.fill3DRect(x, y, 30, 5, false);
			g.fill3DRect(x, y+15, 30, 5, false);
			g.fill3DRect(x+5, y+5, 20, 10, false);
			g.fillOval(x+10, y+5, 10, 10);
			g.drawLine(x+15, y+10, x+30, y+10);
			break;
		}
	
	}

	@Override	//按压键盘控制方向
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode()==KeyEvent.VK_UP) {
			//mt.direct=0;
			mt.setDirect(0);
			mt.moveUp();
		}
		this.repaint();
		if(e.getKeyCode()==KeyEvent.VK_DOWN) { 
			mt.setDirect(1);
			mt.moveDown();
		}
		this.repaint();
		if(e.getKeyCode()==KeyEvent.VK_LEFT) {
			mt.setDirect(2);
			mt.moveLeft();
		}
		this.repaint();
		if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
			mt.setDirect(3);
			mt.moveRight();
		}
		this.repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}


