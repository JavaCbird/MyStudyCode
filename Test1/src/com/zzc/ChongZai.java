/*
 * 功能: 方法重载
 */
package com.zzc;
import javax.swing.*;
public class ChongZai extends JFrame{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abc abc1=new Abc();
		System.out.println(abc1.getMax(25, 20.6f));
		
	}

}

class Abc
{	
	//返回较大的整数
	public int getMax(int i,int j)
	{
		return (i>=j?i:j);
	}
	
	public float getMax(float i,float j)
	{
		return (i>=j?i:j);
	}
	
	public float getMax(int i,float j)
	{
		return (i>=j?i:j);
	}
	
	//如果只是返回类型不一样,不能构成重载
/*	public float getMax(int i,int j)
	{
		return (i>=j?i:j);
	}
*/
/*	//如果只是控制访问修饰符不一样
	protected int getMax(int i,int j)
	{
		return (i>=j?i:j);
	}
*/
}