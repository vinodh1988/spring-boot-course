package com.core.java;

abstract public class Shape {
   private String shape;
   private int nos;
   
   public Shape() {}
   public Shape(String shape,int nos) {
	   this.shape=shape;
	   this.nos=nos;
   }
   
   public void show() {
	   System.out.println("Shape: "+shape);
	   System.out.println("Number of sides:"+nos);
   }
   
   abstract public void area();
   abstract public void perimeter();
}

/**
 * Abstract Classes are classes which cannot have objects
 * Abstract classes can have references
 * There is no rule for abstract class to have an abstract method
 * It is a rule that a class with abstract methods need to be abstract
 * 
 * */
