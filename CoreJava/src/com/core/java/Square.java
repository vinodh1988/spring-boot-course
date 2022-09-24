package com.core.java;

public class Square extends Shape{

	private int side;

	public Square(){}
	public Square(int side) {
		super("Square",4);
		this.side=side;
	}
	@Override
	public void area() {
		// TODO Auto-generated method stub
	  System.out.println("Area "+side*side);	
	}

	@Override
	public void perimeter() {
		// TODO Auto-generated method stub
		System.out.println("Area "+4*side);			
	}

	public void show() {
		super.show();
	   System.out.println("Side:"+side);
	}
}
