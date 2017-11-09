package com.tankgame_10;

import java.util.Vector;

//坦克类
class Tank{
	int x=0;  //表示坦克的横坐标
	int y=0;  //表示坦克的纵坐标
	int direct =0;//坦克方向
	int speed=2; //坦克速度
	int type;  //坦克类型
	Boolean isLive=true;
	//定义坦克运动范围
	int width;
	int height;
	
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
	
	public Tank(int x,int y,int width,int height) {
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
	}
}

//敌方坦克
class EnemyTank extends Tank implements Runnable{
	
	boolean isLive=true;
	//定义一个向量,可以存放敌人的子弹
	Vector<Bullet> bs=new Vector<Bullet>();
	//敌人添加子弹,应当在刚刚创建坦克和敌人的坦克子弹死亡后
	
	int times=0;

	public EnemyTank(int x, int y,int width,int height) {
		super(x, y,width,height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			switch(this.direct) {
			case 0:
				for(int i=0;i<30;i++) {   //朝一个方向前进30步
					if(y>0) {  //保证坦克不出边界
						y-=speed;
						
					}
					try {
						Thread.sleep(50);  //每50毫秒前进一步
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				break;
			case 1:
				for(int i=0;i<30;i++) {
					if(y<height-30) {  //-30的原因是考虑到坦克的坐标原点位置,30为坦克的长度
						y+=speed;
						try {
							Thread.sleep(50);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					
				}
				break;
			case 2:
				for(int i=0;i<30;i++) {
					if(x>0) {
						x-=speed;
					}
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				break;
			case 3:
				for(int i=0;i<30;i++) {
					if(x<width-30) {
						x+=speed;
					}
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				break;
			}
			
			times++;
			if(times%2==0) {  //30*50*2=3000毫秒=3秒
				//判断是否需要给坦克添加新的子弹
				if(isLive==true) {
					//如果子弹小于5颗,则添加子弹
					if(bs.size()<5) {
						Bullet b=null;
						switch(direct) {							
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
						//启动子弹线程
						Thread t=new Thread(b);
						t.start();
					}
				}
			}
			this.direct=(int)(Math.random()*4);
		}
		
	}
		
}

//我的坦克
class MyTank extends Tank{

	public MyTank(int x, int y,int width,int height) {
		super(x, y,width,height);
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
			System.out.println("子弹坐标 : x="+x+" "+"y="+y);
			//判断线程是否死亡
			if(x<0||y<0||x>500||y>500) {
				isLive=false;
				break;
			}
		}
	}
}

//炸弹类
class Bomb{
	int x;
	int y;
	Boolean isLive=true;
	public Bomb(int x,int y) {
		this.x=x;
		this.y=y;
	}
	
	//炸弹的生命值
	int life=9;
	//生命值减少
	public void lifeDown() {
		if(life>0) {
			life--;
		}else {
			isLive=false;
		}
	}
}