/*
 * ����:���Լ���4ֻ����ƽ������,�ҳ�����������С�Ĺ�������;����ͨ�����빷������,������������
 */
package com.shuzu;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DuiXiangShuZu {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		//����һ�����Դ����ֻ���Ķ�������
		Dog dogs[]=new Dog[4];
		
		//������������ֵ
		/*dogs[0]=new Dog();
		dogs[0].setName("����");
		dogs[0].setWeight(4.5f);*/
		
		//�ӿ���̨�������������Ϣ
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		for(int i=0;i<4;i++) {
			dogs[i]=new Dog();
			System.out.println("�������"+(i+1)+"ֻ��������:");
			//�ӿ���̨��ȡ����
			String name=br.readLine();//�����쳣,ͨ��throws Exception�ӳ�ȥ
			dogs[i].setName(name);//�����ָ�������
			System.out.println("�������"+(i+1)+"ֻ��������:");
			String s_weight=br.readLine();//�������һ���ַ���
			float weight=Float.parseFloat(s_weight);//��String��ת����float��
			dogs[i].setWeight(weight);//�����ظ�������
		}
		//�ȼ���������
		float all_weight=0;
		for(int i=0;i<4;i++) {
			all_weight+=dogs[i].getWeight();
		}
		//����ƽ��ֵ
		System.out.println("������Ϊ:"+all_weight+" ƽ��ֵΪ:"+(all_weight/dogs.length));
		
		//�ҳ��������Ĺ�
		float max_weight=dogs[0].getWeight();
		int max_index=0;
		for(int i=1;i<dogs.length;i++) {
			if(max_weight<dogs[i].getWeight()) {
				max_weight=dogs[i].getWeight();
				max_index=i;
			}
		}
		System.out.println("�������Ĺ��ǵ�"+(max_index+1)+"ֻ    ������:"+max_weight);
		
		//�ҳ�������С�Ĺ�
		float min_weight=dogs[0].getWeight();
		int min_index=0;
		for(int i=1;i<dogs.length;i++) {
			if(min_weight<dogs[i].getWeight()) {
				min_weight=dogs[i].getWeight();
				min_index=i;
			}
		}
		System.out.println("������С�Ĺ��ǵ�"+(min_index+1)+"ֻ    ������:"+min_weight);
	}
}
//����һ������
class Dog{
	private String name;
	private float weight;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight=weight;
	}
}