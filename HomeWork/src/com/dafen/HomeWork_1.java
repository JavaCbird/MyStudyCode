/*
 * 功能:size个裁判打分,去掉最高分和最低分,求平均值,并找到最低分和最高分的裁判
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
	
	public Judge() {  //构造函数
		score=new float[size];
		//初始化
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		
		try {  //捕获异常
			for(int i=0;i<size;i++) {
				System.out.println("请输入第"+(i+1)+"个裁判的成绩");
				score[i]=Float.parseFloat(br.readLine()); //readLine()返回的是字符串,所以要转成float
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
	
	//最后得分
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
	
	//找到最低分下标
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
	
	//找到最高分下标
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
	
	//找到裁判
	public void getJudge() {
		System.out.println("最低分裁判是第"+(getLowScoreIndex()+1)+"个");
		System.out.println("最高分裁判是第"+(getHighScoreIndex()+1)+"个");
	}
}