package com.core.executables;

import com.core.java.Student;

public class StaticCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Student s1= new Student(1,"Raj","Chennai");
       Student s2=new Student(1,"Ramesh","Chennai");
       Student s3=new Student(15,"Joe","Mumbai");
       s1.display();
       s2.display();
       s3.display();
       Student.getCount();
	}
	

}
