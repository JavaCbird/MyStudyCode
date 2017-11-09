package com.yuesi;
import java.util.ArrayList;
import java.util.List;

class Go {
	private Item head = null;
	private int size = 0;
	private ArrayList<Integer> ress = new ArrayList<>();
	private int rest =0;
	public Go(int n, int rest) {
		size = n;
		this.rest =rest;
		head = new Item();
		Item temp =null;
		Item up =null;
		head.sit = 1;
		up = head;
		for(int i =2 ; i<= n; i++) {
			temp = new Item();
			temp.sit = i;
			up.next = temp;
			up = temp;
			if(i == n) {
				up.next = head;
			}
		}
	}
	public void put() {
		Item iter = head;
		for(int i = 0 ;i< size; i++) {
			System.out.println(iter.sit);
			iter = iter.next;
		}
	}
	public void ra(int x) {
		for(int i = 0;i<x;i++) {
			head = head.next;
		}
	}
	public int kill() {
		if(head.next == head)
			return head.sit;
		int res = head.sit;
		Item tp = head;
		Item next = head.next;
		while(tp.next != head) {
			tp=tp.next;
		}
		Item up = tp;
		up.next = next;
		head=next;
		return res;
	}
	
	public List doit(int x) {
		while(head.next != head) {
			ra(x-1);
			ress.add(kill());
		}
		ress.add(head.sit);
		for(int i = 0; i<rest;i++) {
			System.out.println(ress.get(size-1));
			size-=1;
		}
		return ress;
	}
}
