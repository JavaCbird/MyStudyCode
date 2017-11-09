/*
 * ����:�ڰ汾2��������ӵз�̹��
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
		this.setTitle("̹�˴�ս");
		this.setSize(500, 500);
		this.setLocation(100, 100);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.addKeyListener(mp);
	}
}

//�ҵ����
class MyPanel extends JPanel implements KeyListener{
	
	//����һ���ҵ�̹��
	MyTank mt=null;
	//������˵�̹����    etsΪVector���ϵĶ���
	Vector<EnemyTank> ets=new Vector<EnemyTank>();
	int enSize=3;	//�з�̹������
	
	//���캯��
	public MyPanel() {
		mt=new MyTank(100,100);
		
		//��ʼ���з�̹��
		for(int i=0;i<enSize;i++) {
			//�������˵�̹�˶���
			EnemyTank et=new EnemyTank((i+1)*100, 0);
			//���õз�̹������Ϊ1,����ɫ���ҵ�̹�˲�ͬ
			et.setType(1);
			//���õз�̹�˳�ʼ����Ϊ��
			et.setDirect(1);
			//��ÿ��̹�˶���ֱ���뼯��
			ets.add(et);
		}
	}
	
	//��д�����paint����
	public void paint(Graphics g) {
		super.paint(g);
		g.fillRect(0, 0, 500, 500);  //��䱳����ɫΪ��ɫ
		//�����ҵ�̹��
		this.drawTank(mt.getX(), mt.getY(), g, 0, mt.getDirect());
		//�����з�̹��
		for(int i=0;i<ets.size();i++) {
			this.drawTank(ets.get(i).getX(), ets.get(i).getY(), g, ets.get(i).getType(), ets.get(i).getDirect());
		}
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
		case 1:	//����
			g.fill3DRect(x, y, 5, 30, false);
			g.fill3DRect(x+15, y, 5, 30, false);
			g.fill3DRect(x+5, y+5, 10, 20, false);
			g.fillOval(x+5, y+10, 10, 10);
			//�����м�ֱ��
			g.drawLine(x+10, y+15, x+10, y+30);
			break;
		case 2:	//����
			//1.�����ϲ����
			g.fill3DRect(x, y, 30, 5, false);
			//2.�����²����
			g.fill3DRect(x, y+15, 30, 5, false);
			//3.�����м����
			g.fill3DRect(x+5, y+5, 20, 10, false);
			//4.�����м�Բ��
			g.fillOval(x+10, y+5, 10, 10);
			//5.�����м�ֱ��
			g.drawLine(x+15, y+10, x, y+10);
			break;
		case 3:	//����
			g.fill3DRect(x, y, 30, 5, false);
			g.fill3DRect(x, y+15, 30, 5, false);
			g.fill3DRect(x+5, y+5, 20, 10, false);
			g.fillOval(x+10, y+5, 10, 10);
			g.drawLine(x+15, y+10, x+30, y+10);
			break;
		}
	
	}

	@Override	//��ѹ���̿��Ʒ���
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


