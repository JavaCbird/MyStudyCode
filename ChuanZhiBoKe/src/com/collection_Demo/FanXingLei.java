/*
 * 功能:演示泛型类及泛型方法
 */
package com.collection_Demo;

public class FanXingLei {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ObjectTool<String> ot=new ObjectTool<String>();
		ot.setObj(new String("zzc"));
		String s=ot.getObj();
		System.out.println("姓名是:"+s);
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
		
		//第一种情况(不常用)
		Inter<String> it=new InterImp1();
		it.show_fxjk("ccc");
		System.out.println("--------------------");
		
		//第二种情况
		InterImp2<Integer> ii=new InterImp2<Integer>();
		ii.show_fxjk(48);
//		ii.show_fxjk("ddd");
		System.out.println("--------------------");
		
		Inter<Integer> it2=new InterImp2<Integer>();
		it2.show_fxjk(10);
		System.out.println("--------------------");
	}

}

//定义泛型类
class ObjectTool<T>{
	private T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
	
	public void show(T t) {
		System.out.println("方法输出为:"+t);
	}
	
	//定义泛型方法
	public <E> void show_fanxing(E e) {
		System.out.println("泛型类中的泛型方法输出为:"+e);
	}
}

//在非泛型类中定义泛型方法
class FfTool{
	public <T> void show_fanxing(T t) {
		System.out.println("非泛型类中的泛型方法输出为:"+t);
	}
}

//定义泛型接口
interface Inter<T>{
	public abstract void show_fxjk(T t);
}

//定义类实现泛型接口
//第一种情况:已经知道该是什么类型
class InterImp1 implements Inter<String>{

	@Override
	public void show_fxjk(String t) {
		// TODO Auto-generated method stub
		System.out.println("接口类型已经确定,输出为:"+t);
	}
}

//第二种情况:还不知道该是什么类型
class InterImp2<T> implements Inter<T>{

	@Override
	public void show_fxjk(T t) {
		// TODO Auto-generated method stub
		System.out.println("接口类型还未确定,输出为:"+t);
	}
}