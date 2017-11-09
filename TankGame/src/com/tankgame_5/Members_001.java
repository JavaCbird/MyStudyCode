package com.tankgame_5;

import java.util.Vector;

//̹����
class Tank{
	int x=0;  //��ʾ̹�˵ĺ�����
	int y=0;  //��ʾ̹�˵�������
	int direct =0;//̹�˷���
	int speed=2; //̹���ٶ�
	int type;  //̹������
	
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public int getDirect() {
		return direct;
	}
	public void setDirect(int direct) {
		this.direct = direct;
	}
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

//�з�̹��
class EnemyTank extends Tank{

	public EnemyTank(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	
}

//�ҵ�̹��
class MyTank extends Tank{

	public MyTank(int x, int y) {
		super(x, y);
	}

	public void moveUp() {	//�����ƶ�
		y-=speed;
	}
	public void moveDown() {	//�����ƶ�
		y+=speed;
	}
	public void moveLeft() {	//�����ƶ�
		x-=speed;
	}
	public void moveRight() {	//�����ƶ�
		x+=speed;
	}
	
	//���ҵ�̹���д����ӵ�
	Bullet b=null;
	Vector<Bullet> bs=new Vector<Bullet>();
	//һ���Կɷ�������ӵ�����
	int bNum=5;
	//����
	public void fire() {
		switch(this.direct) {
		case 0:
			b=new Bullet(x+10,y,0);//�����ӵ�
			bs.add(b);
			break;
		case 1:
			b=new Bullet(x+10,y+30,1);
			bs.add(b);
			break;
		case 2:
			b=new Bullet(x,y+10,2);
			bs.add(b);
			break;
		case 3:
			b=new Bullet(x+30,y+10,3);
			bs.add(b);
			break;
		}
		//����Bullet�߳�
		Thread t=new Thread(b);
		t.start();
	}
}

//�ӵ�
class Bullet implements Runnable{
	int x=0;
	int y=0;
	int direct;
	int speed=3;
	//�߳��Ƿ����
	Boolean isLive=true;
	//��ʼ��
	public Bullet(int x,int y,int direct){
		this.x=x;
		this.y=y;
		this.direct=direct;
	}
	//���ӵ�������
	public void run() {
		while(true) {
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			switch(this.direct) {
			case 0:
				y-=speed;
				break;
			case 1:
				y+=speed;
				break;
			case 2:
				x-=speed;
				break;
			case 3:
				x+=speed;
				break;
			}
			System.out.println("x="+x+" "+"y="+y);
			//�ж��߳��Ƿ�����
			if(x<0||y<0||x>500||y>500) {
				isLive=false;
				break;
			}
		}
	}
}