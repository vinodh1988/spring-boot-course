package com.core.executables;

import com.core.java.Rectangle;
import com.core.java.Shape;
import com.core.java.Square;

public class ShapeDemo {
  public static void main(String[] args) {
	Shape s=new Rectangle(12,5);//super reference can point to subclass object
	s.show();
	s.area();
	s.perimeter();
	
	s=new Square(34);
	s.show();
	s.area();
	s.perimeter();
	
  }
}
