package com.core.executables;

import com.core.java.Activity;
import com.core.java.Implementations;

public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   //interface cannot have objects but references can be there
		//interface reference can hold object of class which
		//is implementing it
		Activity a=new Implementations.Coding();
		a.task();
		a=new Implementations.Documenting();
		a.task();
		a=new Implementations.Painting();
		a.task();
		
		a=new Activity() {

			@Override
			public void task() {
				// TODO Auto-generated method stub
				System.out.println("Spot activity");
			}
			
		};
		a.task();
		
		a=()->{
			System.out.println("Lambda Expression");
		};
		
		a.task();
	}

}
