/*
 * ����:��ʾ�����༰���ͷ���
 */
package com.collection_Demo;

public class FanXingLei {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ObjectTool<String> ot=new ObjectTool<String>();
		ot.setObj(new String("zzc"));
		String s=ot.getObj();
		System.out.println("������:"+s);
//		ot.setObj(new Integer(5));
		ot.show("aaa");
//		ot.show(new Integer(10));
		System.out.println("--------------------");
		
		ot.show_fanxing("bbb");
		ot.show_fanxing(34);
		ot.show_fanxing(true);
		System.out.println("--------------------");
		
		FfTool ft=new FfTool();
		ft.show_fanxing("aaa");
		ft.show_fanxing(25);
		ft.show_fanxing(true);
		System.out.println("--------------------");
		
		//��һ�����(������)
		Inter<String> it=new InterImp1();
		it.show_fxjk("ccc");
		System.out.println("--------------------");
		
		//�ڶ������
		InterImp2<Integer> ii=new InterImp2<Integer>();
		ii.show_fxjk(48);
//		ii.show_fxjk("ddd");
		System.out.println("--------------------");
		
		Inter<Integer> it2=new InterImp2<Integer>();
		it2.show_fxjk(10);
		System.out.println("--------------------");
	}

}

//���巺����
class ObjectTool<T>{
	private T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
	
	public void show(T t) {
		System.out.println("�������Ϊ:"+t);
	}
	
	//���巺�ͷ���
	public <E> void show_fanxing(E e) {
		System.out.println("�������еķ��ͷ������Ϊ:"+e);
	}
}

//�ڷǷ������ж��巺�ͷ���
class FfTool{
	public <T> void show_fanxing(T t) {
		System.out.println("�Ƿ������еķ��ͷ������Ϊ:"+t);
	}
}

//���巺�ͽӿ�
interface Inter<T>{
	public abstract void show_fxjk(T t);
}

//������ʵ�ַ��ͽӿ�
//��һ�����:�Ѿ�֪������ʲô����
class InterImp1 implements Inter<String>{

	@Override
	public void show_fxjk(String t) {
		// TODO Auto-generated method stub
		System.out.println("�ӿ������Ѿ�ȷ��,���Ϊ:"+t);
	}
}

//�ڶ������:����֪������ʲô����
class InterImp2<T> implements Inter<T>{

	@Override
	public void show_fxjk(T t) {
		// TODO Auto-generated method stub
		System.out.println("�ӿ����ͻ�δȷ��,���Ϊ:"+t);
	}
}