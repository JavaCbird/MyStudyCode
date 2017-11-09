/*
 * 功能:在版本14基础上添加暂停和继续功能
 * 方法:当点击暂停时,所有坦克及子弹的速度变为0,方向不变
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
	//定义窗体大小
	int width=500;
	int height=500;
	
	//定义菜单
	JMenuBar jmb=null;
	JMenu jm1=null;
	JMenuItem jmi1=null;
	JMenuItem jmi2=null;
	JMenuItem jmi3=null;
	
	public MyTankGame_15_NEW() { 
		sp=new StartPanel(width, height);
		//启动StartPanel线程
		Thread t=new Thread(sp);
		t.start();
		
		//创建菜单
		jmb=new JMenuBar();
		jm1=new JMenu("打开");
		jm1.setMnemonic('O');
		jmi1=new JMenuItem("新游戏");
		jmi1.setMnemonic('N');
		jmi2=new JMenuItem("继续");
		jmi2.setMnemonic('G');
		//分别给jmi1,jmi2设置监听
		jmi1.addActionListener(this);
		jmi1.setActionCommand("新游戏");
		jmi2.addActionListener(this);
		jmi2.setActionCommand("继续");
		//加入
		jm1.add(jmi1);
		jm1.add(jmi2);
		jmb.add(jm1);
		this.setJMenuBar(jmb);
		
		this.add(sp);
		this.setTitle("坦克大战");
		this.setSize(width, height);
		this.setLocation(100, 100);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.addKeyListener(mp);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getActionCommand().equals("新游戏")) {
  	 	    mp=new MyPanel(width,height);
			//启动MyPanel线程
			Thread t=new Thread(mp);
			t.start();
			//先将开始面板移除
			this.remove(sp);
			//再添加战场面板
			this.add(mp);
			//刷新
			this.setVisible(true);
			this.addKeyListener(mp);
		}
		if(arg0.getActionCommand().equals("继续")) {
			
		}
	}
}
//开始面板,用于显示关数,做出线程的目的是为了实现文字闪烁的效果
class StartPanel extends JPanel implements Runnable{
	//定义面板大小
	int width;
	int height;
	//设置开关
	int times=0;
	//构造函数
	public StartPanel (int width,int height) {
		this.width=width;
		this.height=height;
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		g.fillRect(0, 0, width, height);
		//提示信息
		//设置信息字体
		Font myFont=new Font("华文新魏",Font.BOLD,40);
		g.setFont(myFont);
		//设置信息的颜色
		g.setColor(Color.BLUE);
		//为使代码更加健壮,不能让times无穷增加
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

//我的面板
class MyPanel extends JPanel implements KeyListener,Runnable{
	
	//定义面板大小
	int width;
	int height;
	//定义坦克
	Tank tk=null;
	//定义一个我的坦克
	MyTank mt=null;
	//定义敌人的坦克组    ets为Vector集合的对象
	Vector<EnemyTank> ets=new Vector<EnemyTank>();
	int enSize=8;	//敌方坦克数量
	
	//创建一个炸弹集合Vector
	Vector<Bomb> bombs=new Vector<Bomb>();
	
	//定义三张图片,三张图片组成一个爆炸效果
	Image image1=null;
	Image image2=null;
	Image image3=null;
	
	
	//构造函数
	public MyPanel(int width,int height) {
		this.width=width;
		this.height=height;
		
		//初始化坦克
		tk=new Tank(0,0,width,height);
		
		//初始化我的坦克
		mt=new MyTank(100,100,width,height);
		
		//初始化敌方坦克
		for(int i=0;i<enSize;i++) {
			//创建敌人的坦克对象
			EnemyTank et=new EnemyTank((i+1)*100, 0,width,height);
			//设置敌方坦克类型为1,即颜色与我的坦克不同
			et.setType(1);
			//设置敌方坦克初始方向为下
			et.setDirect(1);
			//启动坦克线程
			Thread t=new Thread(et);
			t.start();
			//将每个坦克对象分别加入集合
			ets.add(et);
			//给敌人坦克添加一颗子弹
			Bullet b=new Bullet(et.x+10,et.y,1);
			//将子弹加入到集合
			et.bs.add(b);
			//Bullet 是线程,需要启动该线程
			Thread t2=new Thread(b);
			t2.start();
			//调用EnemyTank类中定义的方法
			et.getEnemyTank(ets);
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
		
		g.fillRect(0, 0, width, height);  //填充背景颜色为黑色
		
		//画出我的坦克
		if(mt.isLive==true) {
			this.drawTank(mt.getX(), mt.getY(), g, 0, mt.getDirect());
		}
		
		//画出敌方坦克
		for(int i=0;i<ets.size();i++) {
			EnemyTank et=ets.get(i);
			if(et.isLive==true) {
				this.drawTank(et.getX(), et.getY(), g,et.getType(),et.getDirect());
				//再画出敌人子弹
				for(int j=0;j<et.bs.size();j++) {
					Bullet enemybullet=et.bs.get(j);
					g.setColor(Color.red);	//设置子弹颜色
					if(enemybullet.isLive==true) {
						g.draw3DRect(enemybullet.x,enemybullet.y, 2, 2, false);
					}else {
						//如果敌人子弹死亡了,就将其移除
						et.bs.remove(enemybullet);
					}
				}
			}
		}
		
		//画出我的子弹
		for(int i=0;i<mt.bs.size();i++) {
			Bullet mybullet=mt.bs.get(i);
			g.setColor(Color.cyan);	//设置子弹颜色
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
	
	//写一个函数判断子弹是否击中坦克
	public void hitTank(Bullet b,Tank t) {
		//判断该坦克方向
		switch(t.direct) {
		case 0:
		case 1:
			if(b.x>t.x&&b.x<t.x+20 && b.y>t.y&&b.y<t.y+30) {
				//如果击中
				//子弹死亡
				b.isLive=false;
				//坦克死亡
				t.isLive=false;
				//创建一颗炸弹,放入Vector
				Bomb bomb=new Bomb(t.x,t.y);
				bombs.add(bomb);
			}
		case 2:
		case 3:
			if(b.x>t.x&&b.x<t.x+30 && b.y>t.y&&b.y<t.y+20) {
				//如果击中
				//子弹死亡
				b.isLive=false;
				//坦克死亡
				t.isLive=false;
				//创建一颗炸弹,放入Vector
				Bomb bomb=new Bomb(t.x,t.y);
				bombs.add(bomb);
			}
		}
	}
	
	//写一个函数判断我的子弹是否击中敌方坦克
	public void hitEnemyTank() {
		for(int i=0;i<mt.bs.size();i++) {
			//取出我的子弹
			Bullet mybullet=mt.bs.get(i);
			//如果我的子弹还活着
			if(mybullet.isLive==true) {
				for(int j=0;j<ets.size();j++) {
					//取出敌方坦克
					EnemyTank et=ets.get(j);
					//如果敌方坦克还活着
					if(et.isLive==true) {
						this.hitTank(mybullet, et);
					}
				}
			}
		}

	}
	
	//写一个函数判断敌人子弹是否击中我的坦克
	public void hitMyTank() {
		//判断敌方坦克是否击中我的坦克
		for(int i=0;i<ets.size();i++) {
			EnemyTank et=ets.get(i);
			for(int j=0;j<et.bs.size();j++) {
				Bullet enemybullet=et.bs.get(j);
				//如果我的坦克还活着
				if(mt.isLive==true) {
					this.hitTank(enemybullet, mt);
				}
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
			
			//调用函数
			this.hitEnemyTank();
			this.hitMyTank();
			
			this.repaint();
		}
	}
}


