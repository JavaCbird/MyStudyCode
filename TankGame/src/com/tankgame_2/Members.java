package com.tankgame_2;

//̹����
class Tank{
	int x=0;  //��ʾ̹�˵ĺ�����
	int y=0;  //��ʾ̹�˵�������
	int direct =0;//̹�˷���
	int speed=2; //̹���ٶ�
	
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
}
