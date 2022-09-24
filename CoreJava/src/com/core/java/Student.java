package com.core.java;

public class Student {
	
	private int sno; //it is must practice to make your data members private
    private	String name;
    private String city;
    
    public Student() {
    	sno=-1;
    	name="Noname";
    	city="Nocity";
    }
    
    public void display() {
    	System.out.println("Sno:"+sno);
    	System.out.println("Name:"+name);
    	System.out.println("City:"+city);
    }

}



//there are four kinds of access specifiers

   /**
    * Encapsulation - Wrapping of data and functionalities together
    * Abstraction - Allowing only essential features hinding background
       implementation
    
     1. public - accessible everywhere
     2. private - accessible only within the class
     3. protected- -accessible everywhere within the package
                 and only subclasses of other packages
     4. default - within the package behaves like public
                   outside the package behaves like private
  */