package com.carjiekou;

//�������۵�
public class CarShop {
	//�۳�����
	private int money=0;
	
	//����һ����
	public void sellCar(Car car) {
		System.out.println("����:"+car.getName()+"  �۸�:"+car.getPrice());
		//�����������ۼ۵�����
		money+=car.getPrice();
	}
	
	//�۳�������
	public int getMoney() {
		return money;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarShop aShop=new CarShop();
		//����һ������
		aShop.sellCar(new BMW());
		//����һ������QQ
		aShop.sellCar(new CheryQQ());
		//���������
		System.out.println("������:"+aShop.getMoney());
	}

}

//�����ӿ�
interface Car{
	String getName();  //��������
	int getPrice();  //�����۸�
}

//��������
class BMW implements Car{
	public String getName() {
		return "BMW";
	}
	
	public int getPrice() {
		return 300000;
	}
}

//����QQ
class CheryQQ implements Car{
	public String getName() {
		return "CheryQQ";
	}
	
	public int getPrice() {
		return 20000;
	}
}
