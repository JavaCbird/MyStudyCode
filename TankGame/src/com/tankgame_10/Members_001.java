package com.tankgame_10;

import java.util.Vector;

//̹����
class Tank{
	int x=0;  //��ʾ̹�˵ĺ�����
	int y=0;  //��ʾ̹�˵�������
	int direct =0;//̹�˷���
	int speed=2; //̹���ٶ�
	int type;  //̹������
	Boolean isLive=true;
	//����̹���˶���Χ
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

//�з�̹��
class EnemyTank extends Tank implements Runnable{
	
	boolean isLive=true;
	//����һ������,���Դ�ŵ��˵��ӵ�
	Vector<Bullet> bs=new Vector<Bullet>();
	//��������ӵ�,Ӧ���ڸոմ���̹�˺͵��˵�̹���ӵ�������
	
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
				for(int i=0;i<30;i++) {   //��һ������ǰ��30��
					if(y>0) {  //��֤̹�˲����߽�
						y-=speed;
						
					}
					try {
						Thread.sleep(50);  //ÿ50����ǰ��һ��
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				break;
			case 1:
				for(int i=0;i<30;i++) {
					if(y<height-30) {  //-30��ԭ���ǿ��ǵ�̹�˵�����ԭ��λ��,30Ϊ̹�˵ĳ���
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
			if(times%2==0) {  //30*50*2=3000����=3��
				//�ж��Ƿ���Ҫ��̹������µ��ӵ�
				if(isLive==true) {
					//����ӵ�С��5��,������ӵ�
					if(bs.size()<5) {
						Bullet b=null;
						switch(direct) {							
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
						//�����ӵ��߳�
						Thread t=new Thread(b);
						t.start();
					}
				}
			}
			this.direct=(int)(Math.random()*4);
		}
		
	}
		
}

//�ҵ�̹��
class MyTank extends Tank{

	public MyTank(int x, int y,int width,int height) {
		super(x, y,width,height);
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
			System.out.println("�ӵ����� : x="+x+" "+"y="+y);
			//�ж��߳��Ƿ�����
			if(x<0||y<0||x>500||y>500) {
				isLive=false;
				break;
			}
		}
	}
}

//ը����
class Bomb{
	int x;
	int y;
	Boolean isLive=true;
	public Bomb(int x,int y) {
		this.x=x;
		this.y=y;
	}
	
	//ը��������ֵ
	int life=9;
	//����ֵ����
	public void lifeDown() {
		if(life>0) {
			life--;
		}else {
			isLive=false;
		}
	}
}