package com.core.java;

public class Rectangle extends Shape{
    private int length;
    private int breadth;

	public Rectangle(){}
	public Rectangle(int length,int breadth) {
		super("length",4);
		this.length=length;
		this.breadth=breadth;
	}
	@Override
	public void area() {
		// TODO Auto-generated method stub
	  System.out.println("Area "+length*breadth);	
	}

	@Override
	public void perimeter() {
		// TODO Auto-generated method stub
		System.out.println("Area "+2*(length+breadth));			
	}
	@Override
	public void show() {
		// TODO Auto-generated method stub
		super.show();
		System.out.println("Length:"+length);
		System.out.println("Breadth:"+breadth);
	}

	
}

