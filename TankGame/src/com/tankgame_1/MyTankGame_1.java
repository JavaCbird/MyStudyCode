/*
 * ����:����̹��
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
		this.setTitle("̹�˴�ս");
		this.setSize(500, 500);
		this.setLocation(100, 100);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

//�ҵ����
class MyPanel extends JPanel{
	
	//����һ���ҵ�̹��
	MyTank mt=null;
	//���캯��
	public MyPanel() {
		mt=new MyTank(100,100);
	}
	
	//��д�����paint����
	public void paint(Graphics g) {
		super.paint(g);
		g.fillRect(0, 0, 500, 500);  //��䱳����ɫΪ��ɫ
		this.drawTank(mt.getX(), mt.getY(), g, 0, 0);
	}
	
	//����һ������̹�˵ķ���
	public void drawTank(int x,int y,Graphics g,int type,int direct) {
		switch(type) {	//�ж���ʲô���͵�̹��
		case 0:	//�ҷ�̹��
			g.setColor(Color.CYAN);
			break;
		case 1:	//�з�̹��
			g.setColor(Color.RED);
			break;
		}
		
		switch(direct) {	//�ж�̹�˵ķ���
		case 0:	//����
			//1.����������
			g.fill3DRect(x, y, 5, 30, false);
			//2.�����Ҳ����
			g.fill3DRect(x+15, y, 5, 30, false);
			//3.�����м����
			g.fill3DRect(x+5, y+5, 10, 20, false);
			//4.�����м�Բ��
			g.fillOval(x+5, y+10, 10, 10);
			//5.�����м�ֱ��
			g.drawLine(x+10, y+15, x+10, y);
			break;
		case 1:
			g.fill3DRect(x, y, 5, 30, false);
			g.fill3DRect(x+15, y, 5, 30, false);
			g.fill3DRect(x+5, y+5, 10, 20, false);
			g.fillOval(x+5, y+10, 10, 10);
			//�����м�ֱ��
			g.drawLine(x+10, y+15, x+10, y+30);
			break;
		}
		
	}
}

//̹����
class Tank{
	int x=0;  //��ʾ̹�˵ĺ�����
	int y=0;  //��ʾ̹�˵�������
	
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

//�ҵ�̹��
class MyTank extends Tank{

	public MyTank(int x, int y) {
		super(x, y);
	}
	
}