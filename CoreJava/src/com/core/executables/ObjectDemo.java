package com.core.executables;

import com.core.java.Student;

public class ObjectDemo {
	public static void main(String[] args) {
		Student s=new  Student(1,"Ravi","Chennai");
		
		System.out.println(s); 
		System.out.println(Integer.toHexString(s.hashCode()));
	//	System.out.printf("\n %x \n",s.hashCode());
		System.out.println(s.toString());
	}
}
// In java, Object class is super class for allthe classes