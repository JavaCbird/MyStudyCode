/*
 * ����: ��������
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
	//���ؽϴ������
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
	
	//���ֻ�Ƿ������Ͳ�һ��,���ܹ�������
/*	public float getMax(int i,int j)
	{
		return (i>=j?i:j);
	}
*/
/*	//���ֻ�ǿ��Ʒ������η���һ��
	protected int getMax(int i,int j)
	{
		return (i>=j?i:j);
	}
*/
}