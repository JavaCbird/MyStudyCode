/*
 * 功能:在版本7基础上使敌方坦克可以随机移动
 * 	方法:将敌方坦克设为线程
 * 	新增第71,72行, Members中EnemyTank类实现Runnable接口,并编写相关方法(第54行)
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
		//启动MyPanel线程
		Thread t=new Thread(mp);
		t.start();
		
		this.add(mp);
		this.setTitle("坦克大战");
		this.setSize(500, 500);
		this.setLocation(100, 100);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.addKeyListener(mp);
	}
}

//我的面板
class MyPanel extends JPanel implements KeyListener,Runnable{
	
	//定义一个我的坦克
	MyTank mt=null;
	//定义敌人的坦克组    ets为Vector集合的对象
	Vector<EnemyTank> ets=new Vector<EnemyTank>();
	int enSize=4;	//敌方坦克数量
	
	//创建一个炸弹集合Vector
	Vector<Bomb> bombs=new Vector<Bomb>();
	
	//定义三张图片,三张图片组成一个爆炸效果
	Image image1=null;
	Image image2=null;
	Image image3=null;
	
	
	//构造函数
	public MyPanel() {
		//初始化我的坦克
		mt=new MyTank(100,100);
		
		//初始化敌方坦克
		for(int i=0;i<enSize;i++) {
			//创建敌人的坦克对象
			EnemyTank et=new EnemyTank((i+1)*100, 0);
			//设置敌方坦克类型为1,即颜色与我的坦克不同
			et.setType(1);
			//设置敌方坦克初始方向为下
			et.setDirect(1);
			//启动坦克线程
			Thread t=new Thread(et);
			t.start();
			//将每个坦克对象分别加入集合
			ets.add(et);
		}
		
		//初始化三张图片
		image1=Toolkit.getDefaultToolkit().getImage("images/bomb_1.jpg");
		image2=Toolkit.getDefaultToolkit().getImage("images/bomb_2.jpg");
		image3=Toolkit.getDefaultToolkit().getImage("images/bomb_3.jpg");
	}
	
	//重写父类的paint方法
	public void paint(Graphics g) {
		super.paint(g);
		
		//以下三段代码是从网上查得的,目的是解决第一颗炸弹击中敌方坦克后没有爆炸效果的问题
		g.drawImage(image1, 100,100,30, 30, this);
		g.drawImage(image2, 100,100,30, 30, this);
		g.drawImage(image3, 100,100,30, 30, this);
		
		g.fillRect(0, 0, 500, 500);  //填充背景颜色为黑色
		
		//画出我的坦克
		this.drawTank(mt.getX(), mt.getY(), g, 0, mt.getDirect());
		
		//画出敌方坦克
		for(int i=0;i<ets.size();i++) {
			EnemyTank et=ets.get(i);
			if(et.isLive==true) {
				this.drawTank(et.getX(), et.getY(), g,et.getType(),et.getDirect());
			}
		}
		
		//画出子弹
		for(int i=0;i<mt.bs.size();i++) {
			Bullet mybullet=mt.bs.get(i);
			g.setColor(Color.cyan);
			if(mybullet !=null && mybullet.isLive==true) {
			g.draw3DRect(mybullet.x,mybullet.y, 2, 2, false);
			}
			//如果子弹死亡,则将其移除
			if(mybullet.isLive==false) {
				mt.bs.remove(mybullet);
			}
		}
		
		//画出炸弹
		for(int i=0;i<bombs.size();i++) {
			Bomb bomb=bombs.get(i);
			if(bomb.life>6) {
				g.drawImage(image1, bomb.x,bomb.y,30, 30, this);
			}else if(bomb.life>3) {
				g.drawImage(image2, bomb.x,bomb.y,30, 30, this);
			}else {
				g.drawImage(image3, bomb.x,bomb.y,30, 30, this);
			}
			//让炸弹的生命值减少
			bomb.lifeDown();
			//如果炸弹死亡,将其移出集合
			if(bomb.isLive==false) {
				bombs.remove(bomb);
			}
		}
	}
	
	//写一个函数判断子弹是否击中敌方坦克
	public void hitTank(Bullet b,EnemyTank et) {
		//判断该坦克方向
		switch(et.direct) {
		case 0:
		case 1:
			if(b.x>et.x&&b.x<et.x+20 && b.y>et.y&&b.y<et.y+30) {
				//如果击中
				//子弹死亡
				b.isLive=false;
				//敌方坦克死亡
				et.isLive=false;
				//创建一颗炸弹,放入Vector
				Bomb bomb=new Bomb(et.x,et.y);
				bombs.add(bomb);
			}
		case 2:
		case 3:
			if(b.x>et.x&&b.x<et.x+30 && b.y>et.y&&b.y<et.y+20) {
				//如果击中
				//子弹死亡
				b.isLive=false;
				//敌方坦克死亡
				et.isLive=false;
				//创建一颗炸弹,放入Vector
				Bomb bomb=new Bomb(et.x,et.y);
				bombs.add(bomb);
			}
		}
	}
	
	//定义一个画出坦克的方法
	public void drawTank(int x,int y,Graphics g,int type,int direct) {
		switch(type) {	//判断是什么类型的坦克
		case 0:	//我方坦克
			g.setColor(Color.CYAN);
			break;
		case 1:	//敌方坦克
			g.setColor(Color.RED);
			break;
		}
		
		switch(direct) {	//判断坦克的方向
		case 0:	//向上
			//1.画出左侧矩形
			g.fill3DRect(x, y, 5, 30, false);
			//2.画出右侧矩形
			g.fill3DRect(x+15, y, 5, 30, false);
			//3.画出中间矩形
			g.fill3DRect(x+5, y+5, 10, 20, false);
			//4.画出中间圆形
			g.fillOval(x+5, y+10, 10, 10);
			//5.画出中间直线
			g.drawLine(x+10, y+15, x+10, y);
			break;
		case 1:	//向下
			g.fill3DRect(x, y, 5, 30, false);
			g.fill3DRect(x+15, y, 5, 30, false);
			g.fill3DRect(x+5, y+5, 10, 20, false);
			g.fillOval(x+5, y+10, 10, 10);
			//画出中间直线
			g.drawLine(x+10, y+15, x+10, y+30);
			break;
		case 2:	//向左
			//1.画出上侧矩形
			g.fill3DRect(x, y, 30, 5, false);
			//2.画出下侧矩形
			g.fill3DRect(x, y+15, 30, 5, false);
			//3.画出中间矩形
			g.fill3DRect(x+5, y+5, 20, 10, false);
			//4.画出中间圆形
			g.fillOval(x+10, y+5, 10, 10);
			//5.画出中间直线
			g.drawLine(x+15, y+10, x, y+10);
			break;
		case 3:	//向右
			g.fill3DRect(x, y, 30, 5, false);
			g.fill3DRect(x, y+15, 30, 5, false);
			g.fill3DRect(x+5, y+5, 20, 10, false);
			g.fillOval(x+10, y+5, 10, 10);
			g.drawLine(x+15, y+10, x+30, y+10);
			break;
		}
	
	}

	@Override	//按压键盘控制方向
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
			//限制子弹颗数
			if(mt.bs.size()<mt.bNum) {
				//开火
				mt.fire();
			}
		}
		
		//重绘panel
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
			
			//判断是否击中
			for(int i=0;i<mt.bs.size();i++) {
				//取出子弹
				Bullet mybullet=mt.bs.get(i);
				//如果子弹还活着
				if(mybullet.isLive==true) {
					for(int j=0;j<ets.size();j++) {
						//取出坦克
						EnemyTank et=ets.get(j);
						//如果坦克还活着
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


