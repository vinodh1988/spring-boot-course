package com.core.executables;

import com.core.java.Student;

public class FirstRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Student s; //reference variable not object
      s=new Student();//new Student() is the object created using constructor
      s.display();
      //s.sno; error as it is private
	}

}
