package com.tankgame_2;

//坦克类
class Tank{
	int x=0;  //表示坦克的横坐标
	int y=0;  //表示坦克的纵坐标
	int direct =0;//坦克方向
	int speed=2; //坦克速度
	
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
}
