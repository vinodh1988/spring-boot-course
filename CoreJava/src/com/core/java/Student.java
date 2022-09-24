package com.core.java;

public class Student {
	
	private int sno; //it is must practice to make your data members private
    private	String name;
    private String city;
    //constructor overloading is polymorphism
    
    public Student() {
    	sno=-1;
    	name="Noname";
    	city="Nocity";
    }
    
    public Student(int sno,String name,String city) {
    	//this refers to current object
    	this.sno=sno;
    	this.name=name;
    	this.city=city;
    }
   //method overloading is also polymorphism
    
    public void setStudent(String name) {
    	this.name=name;
    }
    
    public void setStudent(String name,String city) {
    	this.name=name;
    	this.city=city;
    }
    
    public void setStudent(int sno,String name,String city) {
    	this.sno=sno;
    	this.name=name;
    	this.city=city;
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
    * polymorphism- ability to take more than one form
                   one name many forms
       #overloading rules
                 -return type difference does not matter
                 difference should in
                         - number of parameters
                         - type of parameters
                         - order of parameters
                      note: in the above rules order and number
                      are with respect to datatype not variable name
                      , variable names are not considered as differences  
                       
     1. public - accessible everywhere
     2. private - accessible only within the class
     3. protected- -accessible everywhere within the package
                 and only subclasses of other packages
     4. default - within the package behaves like public
                   outside the package behaves like private
  */