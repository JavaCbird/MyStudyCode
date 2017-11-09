/*
 * ����:size�����д��,ȥ����߷ֺ���ͷ�,��ƽ��ֵ,���ҵ���ͷֺ���߷ֵĲ���
 */
package com.dafen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Judge ju=new Judge();
		System.out.println("aaa");
		ju.getScore();
		System.out.println("bbb");
		ju.getJudge();
	}

}

class Judge{
	float score[]=null;
	int size=5;
	
	public Judge() {  //���캯��
		score=new float[size];
		//��ʼ��
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		
		try {  //�����쳣
			for(int i=0;i<size;i++) {
				System.out.println("�������"+(i+1)+"�����еĳɼ�");
				score[i]=Float.parseFloat(br.readLine()); //readLine()���ص����ַ���,����Ҫת��float
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		  }finally {
			try {
				br.close();
				isr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		   }
	}
	
	//���÷�
	public void getScore() {
		float total=0;
		int a=getLowScoreIndex();
		int b=getHighScoreIndex();
		for(int i=0;i<size;i++) {
			if(i!=a&&i!=b) {
				total+=score[i];
			}
		}
		System.out.println(total/(size-2));
	}
	
	//�ҵ���ͷ��±�
	public int getLowScoreIndex() {
		float lowScore=score[0];
		int lowIndex=0;
		for(int i=1;i<size;i++) {
			if(score[i]<lowScore) {
				lowScore=score[i];
				lowIndex=i;
			}
		}
		return lowIndex;
	}
	
	//�ҵ���߷��±�
	public int getHighScoreIndex() {
		float highScore=score[0];
		int highIndex=0;
		for(int i=1;i<size;i++) {
			if(score[i]>highScore) {
				highScore=score[i];
				highIndex=i;
			}
		}
		return highIndex;
	}
	
	//�ҵ�����
	public void getJudge() {
		System.out.println("��ͷֲ����ǵ�"+(getLowScoreIndex()+1)+"��");
		System.out.println("��߷ֲ����ǵ�"+(getHighScoreIndex()+1)+"��");
	}
}