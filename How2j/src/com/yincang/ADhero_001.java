package com.yincang;

public class ADhero extends Hero{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hero h=new Hero();
		ADhero ad=new ADhero();
		Hero.battleWin();
		ADhero.battleWin();
		h=ad;
		h.battleWin();
		ad=(ADhero)h;
		ad.battleWin();
	}
	public static void battleWin() {
		System.out.println("ad");
//		System.out.println();
	}
}
