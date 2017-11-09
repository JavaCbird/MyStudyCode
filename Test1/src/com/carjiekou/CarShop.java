package com.carjiekou;

//汽车出售店
public class CarShop {
	//售车收入
	private int money=0;
	
	//卖出一部车
	public void sellCar(Car car) {
		System.out.println("车型:"+car.getName()+"  价格:"+car.getPrice());
		//增加卖出车售价的收入
		money+=car.getPrice();
	}
	
	//售车总收入
	public int getMoney() {
		return money;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarShop aShop=new CarShop();
		//卖出一辆宝马
		aShop.sellCar(new BMW());
		//卖出一辆奇瑞QQ
		aShop.sellCar(new CheryQQ());
		//输出总收入
		System.out.println("总收入:"+aShop.getMoney());
	}

}

//汽车接口
interface Car{
	String getName();  //汽车名称
	int getPrice();  //汽车价格
}

//宝马汽车
class BMW implements Car{
	public String getName() {
		return "BMW";
	}
	
	public int getPrice() {
		return 300000;
	}
}

//奇瑞QQ
class CheryQQ implements Car{
	public String getName() {
		return "CheryQQ";
	}
	
	public int getPrice() {
		return 20000;
	}
}
