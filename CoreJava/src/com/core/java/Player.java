package com.core.java;

public class Player extends Student {
	
	private String sport;
	
	public Player() {
		this.sport="NoName";
	}
	
	public Player(String sport) {
		this.sport=sport;
	}
	
	public Player(int sno,String name,String city, String sport) {
		super(sno,name,city);//use only in first line
		this.sport=sport;
	}
	public void show() {
		System.out.println("Sport : "+sport);
	}
	@Override //not mandatory
	public void display() {
		super.display();
		System.out.println("Sport : "+sport);
		System.out.println("-------------------------------------");
	}
	

}


//extending the properties of parent by child