package com.core.executables;

import com.core.java.Rectangle;
import com.core.java.Shape;
import com.core.java.Square;

public class AnonymousClass {
	 public static void main(String[] args) {
			Shape s=new Rectangle(12,5);//super reference can point to subclass object
			s.show();
			s.area();
			s.perimeter();
			
			s=new Square(34);
			s.show();
			s.area();
			s.perimeter();
			
			s=new Shape("Traingle",3) {
				
				int base=12;
				int height=10;
		

				@Override
				public void area() {
					// TODO Auto-generated method stub
                      System.out.println("Area is "+base*height);					
				}

				@Override
				public void perimeter() {
					// TODO Auto-generated method stub
					System.out.println("All sides are needed");
				}
				
				public void show() {
					super.show();
					System.out.println("base: "+base+"Height "+height);
				}
				};
				s.show();
                s.area();
                s.perimeter();
			}
}
