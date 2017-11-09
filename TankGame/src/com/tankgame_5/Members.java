package com.tankgame_5;

import java.util.Vector;

//坦克类
class Tank{
	int x=0;  //表示坦克的横坐标
	int y=0;  //表示坦克的纵坐标
	int direct =0;//坦克方向
	int speed=2; //坦克速度
	int type;  //坦克类型
	
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

//敌方坦克
class EnemyTank extends Tank{

	public EnemyTank(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	
}

//我的坦克
class MyTank extends Tank{

	public MyTank(int x, int y) {
		super(x, y);
	}

	public void moveUp() {	//向上移动
		y-=speed;
	}
	public void moveDown() {	//向下移动
		y+=speed;
	}
	public void moveLeft() {	//向左移动
		x-=speed;
	}
	public void moveRight() {	//向右移动
		x+=speed;
	}
	
	//在我的坦克中创建子弹
	Bullet b=null;
	Vector<Bullet> bs=new Vector<Bullet>();
	//一次性可发射最大子弹颗数
	int bNum=5;
	//开火
	public void fire() {
		switch(this.direct) {
		case 0:
			b=new Bullet(x+10,y,0);//创建子弹
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
		//启动Bullet线程
		Thread t=new Thread(b);
		t.start();
	}
}

//子弹
class Bullet implements Runnable{
	int x=0;
	int y=0;
	int direct;
	int speed=3;
	//线程是否活着
	Boolean isLive=true;
	//初始化
	public Bullet(int x,int y,int direct){
		this.x=x;
		this.y=y;
		this.direct=direct;
	}
	//让子弹跑起来
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
			//判断线程是否死亡
			if(x<0||y<0||x>500||y>500) {
				isLive=false;
				break;
			}
		}
	}
}