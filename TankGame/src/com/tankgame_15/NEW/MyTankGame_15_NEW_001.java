/*
 * ����:�ڰ汾14�����������ͣ�ͼ�������
 * ����:�������ͣʱ,����̹�˼��ӵ����ٶȱ�Ϊ0,���򲻱�
 */
package com.tankgame_15.NEW;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

import javax.swing.*;
public class MyTankGame_15_NEW extends JFrame implements ActionListener{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyTankGame_15_NEW();
	}
	StartPanel sp=null;
	MyPanel mp=null;
	//���崰���С
	int width=500;
	int height=500;
	
	//����˵�
	JMenuBar jmb=null;
	JMenu jm1=null;
	JMenuItem jmi1=null;
	JMenuItem jmi2=null;
	JMenuItem jmi3=null;
	
	public MyTankGame_15_NEW() { 
		sp=new StartPanel(width, height);
		//����StartPanel�߳�
		Thread t=new Thread(sp);
		t.start();
		
		//�����˵�
		jmb=new JMenuBar();
		jm1=new JMenu("��");
		jm1.setMnemonic('O');
		jmi1=new JMenuItem("����Ϸ");
		jmi1.setMnemonic('N');
		jmi2=new JMenuItem("����");
		jmi2.setMnemonic('G');
		//�ֱ��jmi1,jmi2���ü���
		jmi1.addActionListener(this);
		jmi1.setActionCommand("����Ϸ");
		jmi2.addActionListener(this);
		jmi2.setActionCommand("����");
		//����
		jm1.add(jmi1);
		jm1.add(jmi2);
		jmb.add(jm1);
		this.setJMenuBar(jmb);
		
		this.add(sp);
		this.setTitle("̹�˴�ս");
		this.setSize(width, height);
		this.setLocation(100, 100);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.addKeyListener(mp);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getActionCommand().equals("����Ϸ")) {
  	 	    mp=new MyPanel(width,height);
			//����MyPanel�߳�
			Thread t=new Thread(mp);
			t.start();
			//�Ƚ���ʼ����Ƴ�
			this.remove(sp);
			//�����ս�����
			this.add(mp);
			//ˢ��
			this.setVisible(true);
			this.addKeyListener(mp);
		}
		if(arg0.getActionCommand().equals("����")) {
			
		}
	}
}
//��ʼ���,������ʾ����,�����̵߳�Ŀ����Ϊ��ʵ��������˸��Ч��
class StartPanel extends JPanel implements Runnable{
	//��������С
	int width;
	int height;
	//���ÿ���
	int times=0;
	//���캯��
	public StartPanel (int width,int height) {
		this.width=width;
		this.height=height;
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		g.fillRect(0, 0, width, height);
		//��ʾ��Ϣ
		//������Ϣ����
		Font myFont=new Font("������κ",Font.BOLD,40);
		g.setFont(myFont);
		//������Ϣ����ɫ
		g.setColor(Color.BLUE);
		//Ϊʹ������ӽ�׳,������times��������
		if(times==10000) {
			times=0;
		}
		if(times%2==0) {
			g.drawString("stage:1", 180, 230);
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			times++;
			this.repaint();
		}
	}
}

//�ҵ����
class MyPanel extends JPanel implements KeyListener,Runnable{
	
	//��������С
	int width;
	int height;
	//����̹��
	Tank tk=null;
	//����һ���ҵ�̹��
	MyTank mt=null;
	//������˵�̹����    etsΪVector���ϵĶ���
	Vector<EnemyTank> ets=new Vector<EnemyTank>();
	int enSize=8;	//�з�̹������
	
	//����һ��ը������Vector
	Vector<Bomb> bombs=new Vector<Bomb>();
	
	//��������ͼƬ,����ͼƬ���һ����ըЧ��
	Image image1=null;
	Image image2=null;
	Image image3=null;
	
	
	//���캯��
	public MyPanel(int width,int height) {
		this.width=width;
		this.height=height;
		
		//��ʼ��̹��
		tk=new Tank(0,0,width,height);
		
		//��ʼ���ҵ�̹��
		mt=new MyTank(100,100,width,height);
		
		//��ʼ���з�̹��
		for(int i=0;i<enSize;i++) {
			//�������˵�̹�˶���
			EnemyTank et=new EnemyTank((i+1)*100, 0,width,height);
			//���õз�̹������Ϊ1,����ɫ���ҵ�̹�˲�ͬ
			et.setType(1);
			//���õз�̹�˳�ʼ����Ϊ��
			et.setDirect(1);
			//����̹���߳�
			Thread t=new Thread(et);
			t.start();
			//��ÿ��̹�˶���ֱ���뼯��
			ets.add(et);
			//������̹�����һ���ӵ�
			Bullet b=new Bullet(et.x+10,et.y,1);
			//���ӵ����뵽����
			et.bs.add(b);
			//Bullet ���߳�,��Ҫ�������߳�
			Thread t2=new Thread(b);
			t2.start();
			//����EnemyTank���ж���ķ���
			et.getEnemyTank(ets);
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
		
		g.fillRect(0, 0, width, height);  //��䱳����ɫΪ��ɫ
		
		//�����ҵ�̹��
		if(mt.isLive==true) {
			this.drawTank(mt.getX(), mt.getY(), g, 0, mt.getDirect());
		}
		
		//�����з�̹��
		for(int i=0;i<ets.size();i++) {
			EnemyTank et=ets.get(i);
			if(et.isLive==true) {
				this.drawTank(et.getX(), et.getY(), g,et.getType(),et.getDirect());
				//�ٻ��������ӵ�
				for(int j=0;j<et.bs.size();j++) {
					Bullet enemybullet=et.bs.get(j);
					g.setColor(Color.red);	//�����ӵ���ɫ
					if(enemybullet.isLive==true) {
						g.draw3DRect(enemybullet.x,enemybullet.y, 2, 2, false);
					}else {
						//��������ӵ�������,�ͽ����Ƴ�
						et.bs.remove(enemybullet);
					}
				}
			}
		}
		
		//�����ҵ��ӵ�
		for(int i=0;i<mt.bs.size();i++) {
			Bullet mybullet=mt.bs.get(i);
			g.setColor(Color.cyan);	//�����ӵ���ɫ
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
	
	//дһ�������ж��ӵ��Ƿ����̹��
	public void hitTank(Bullet b,Tank t) {
		//�жϸ�̹�˷���
		switch(t.direct) {
		case 0:
		case 1:
			if(b.x>t.x&&b.x<t.x+20 && b.y>t.y&&b.y<t.y+30) {
				//�������
				//�ӵ�����
				b.isLive=false;
				//̹������
				t.isLive=false;
				//����һ��ը��,����Vector
				Bomb bomb=new Bomb(t.x,t.y);
				bombs.add(bomb);
			}
		case 2:
		case 3:
			if(b.x>t.x&&b.x<t.x+30 && b.y>t.y&&b.y<t.y+20) {
				//�������
				//�ӵ�����
				b.isLive=false;
				//̹������
				t.isLive=false;
				//����һ��ը��,����Vector
				Bomb bomb=new Bomb(t.x,t.y);
				bombs.add(bomb);
			}
		}
	}
	
	//дһ�������ж��ҵ��ӵ��Ƿ���ез�̹��
	public void hitEnemyTank() {
		for(int i=0;i<mt.bs.size();i++) {
			//ȡ���ҵ��ӵ�
			Bullet mybullet=mt.bs.get(i);
			//����ҵ��ӵ�������
			if(mybullet.isLive==true) {
				for(int j=0;j<ets.size();j++) {
					//ȡ���з�̹��
					EnemyTank et=ets.get(j);
					//����з�̹�˻�����
					if(et.isLive==true) {
						this.hitTank(mybullet, et);
					}
				}
			}
		}

	}
	
	//дһ�������жϵ����ӵ��Ƿ�����ҵ�̹��
	public void hitMyTank() {
		//�жϵз�̹���Ƿ�����ҵ�̹��
		for(int i=0;i<ets.size();i++) {
			EnemyTank et=ets.get(i);
			for(int j=0;j<et.bs.size();j++) {
				Bullet enemybullet=et.bs.get(j);
				//����ҵ�̹�˻�����
				if(mt.isLive==true) {
					this.hitTank(enemybullet, mt);
				}
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
			
			//���ú���
			this.hitEnemyTank();
			this.hitMyTank();
			
			this.repaint();
		}
	}
}


