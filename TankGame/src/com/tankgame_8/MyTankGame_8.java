/*
 * ����:�ڰ汾7������ʹ�з�̹�˿�������ƶ�
 * 	����:���з�̹����Ϊ�߳�
 * 	������71,72��, Members��EnemyTank��ʵ��Runnable�ӿ�,����д��ط���(��54��)
 */
package com.tankgame_8;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

import javax.swing.*;

public class MyTankGame_8 extends JFrame{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyTankGame_8();
	}
	MyPanel mp=null;
	public MyTankGame_8() {
		mp=new MyPanel();
		//����MyPanel�߳�
		Thread t=new Thread(mp);
		t.start();
		
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
class MyPanel extends JPanel implements KeyListener,Runnable{
	
	//����һ���ҵ�̹��
	MyTank mt=null;
	//������˵�̹����    etsΪVector���ϵĶ���
	Vector<EnemyTank> ets=new Vector<EnemyTank>();
	int enSize=4;	//�з�̹������
	
	//����һ��ը������Vector
	Vector<Bomb> bombs=new Vector<Bomb>();
	
	//��������ͼƬ,����ͼƬ���һ����ըЧ��
	Image image1=null;
	Image image2=null;
	Image image3=null;
	
	
	//���캯��
	public MyPanel() {
		//��ʼ���ҵ�̹��
		mt=new MyTank(100,100);
		
		//��ʼ���з�̹��
		for(int i=0;i<enSize;i++) {
			//�������˵�̹�˶���
			EnemyTank et=new EnemyTank((i+1)*100, 0);
			//���õз�̹������Ϊ1,����ɫ���ҵ�̹�˲�ͬ
			et.setType(1);
			//���õз�̹�˳�ʼ����Ϊ��
			et.setDirect(1);
			//����̹���߳�
			Thread t=new Thread(et);
			t.start();
			//��ÿ��̹�˶���ֱ���뼯��
			ets.add(et);
		}
		
		//��ʼ������ͼƬ
		image1=Toolkit.getDefaultToolkit().getImage("images/bomb_1.jpg");
		image2=Toolkit.getDefaultToolkit().getImage("images/bomb_2.jpg");
		image3=Toolkit.getDefaultToolkit().getImage("images/bomb_3.jpg");
	}
	
	//��д�����paint����
	public void paint(Graphics g) {
		super.paint(g);
		
		//�������δ����Ǵ����ϲ�õ�,Ŀ���ǽ����һ��ը�����ез�̹�˺�û�б�ըЧ��������
		g.drawImage(image1, 100,100,30, 30, this);
		g.drawImage(image2, 100,100,30, 30, this);
		g.drawImage(image3, 100,100,30, 30, this);
		
		g.fillRect(0, 0, 500, 500);  //��䱳����ɫΪ��ɫ
		
		//�����ҵ�̹��
		this.drawTank(mt.getX(), mt.getY(), g, 0, mt.getDirect());
		
		//�����з�̹��
		for(int i=0;i<ets.size();i++) {
			EnemyTank et=ets.get(i);
			if(et.isLive==true) {
				this.drawTank(et.getX(), et.getY(), g,et.getType(),et.getDirect());
			}
		}
		
		//�����ӵ�
		for(int i=0;i<mt.bs.size();i++) {
			Bullet mybullet=mt.bs.get(i);
			g.setColor(Color.cyan);
			if(mybullet !=null && mybullet.isLive==true) {
			g.draw3DRect(mybullet.x,mybullet.y, 2, 2, false);
			}
			//����ӵ�����,�����Ƴ�
			if(mybullet.isLive==false) {
				mt.bs.remove(mybullet);
			}
		}
		
		//����ը��
		for(int i=0;i<bombs.size();i++) {
			Bomb bomb=bombs.get(i);
			if(bomb.life>6) {
				g.drawImage(image1, bomb.x,bomb.y,30, 30, this);
			}else if(bomb.life>3) {
				g.drawImage(image2, bomb.x,bomb.y,30, 30, this);
			}else {
				g.drawImage(image3, bomb.x,bomb.y,30, 30, this);
			}
			//��ը��������ֵ����
			bomb.lifeDown();
			//���ը������,�����Ƴ�����
			if(bomb.isLive==false) {
				bombs.remove(bomb);
			}
		}
	}
	
	//дһ�������ж��ӵ��Ƿ���ез�̹��
	public void hitTank(Bullet b,EnemyTank et) {
		//�жϸ�̹�˷���
		switch(et.direct) {
		case 0:
		case 1:
			if(b.x>et.x&&b.x<et.x+20 && b.y>et.y&&b.y<et.y+30) {
				//�������
				//�ӵ�����
				b.isLive=false;
				//�з�̹������
				et.isLive=false;
				//����һ��ը��,����Vector
				Bomb bomb=new Bomb(et.x,et.y);
				bombs.add(bomb);
			}
		case 2:
		case 3:
			if(b.x>et.x&&b.x<et.x+30 && b.y>et.y&&b.y<et.y+20) {
				//�������
				//�ӵ�����
				b.isLive=false;
				//�з�̹������
				et.isLive=false;
				//����һ��ը��,����Vector
				Bomb bomb=new Bomb(et.x,et.y);
				bombs.add(bomb);
			}
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
		if(e.getKeyCode()==KeyEvent.VK_DOWN) { 
			mt.setDirect(1);
			mt.moveDown();
		}
		if(e.getKeyCode()==KeyEvent.VK_LEFT) {
			mt.setDirect(2);
			mt.moveLeft();
		}
		if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
			mt.setDirect(3);
			mt.moveRight();
		}
		if(e.getKeyCode()==KeyEvent.VK_J) {
			//�����ӵ�����
			if(mt.bs.size()<mt.bNum) {
				//����
				mt.fire();
			}
		}
		
		//�ػ�panel
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

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//�ж��Ƿ����
			for(int i=0;i<mt.bs.size();i++) {
				//ȡ���ӵ�
				Bullet mybullet=mt.bs.get(i);
				//����ӵ�������
				if(mybullet.isLive==true) {
					for(int j=0;j<ets.size();j++) {
						//ȡ��̹��
						EnemyTank et=ets.get(j);
						//���̹�˻�����
						if(et.isLive==true) {
							this.hitTank(mybullet, et);
						}
					}
				}
			}
			
			this.repaint();
		}
	}
}


