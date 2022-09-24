package com.core.executables;

import com.core.java.Player;

public class InheritanceRun {
  public static void main(String n[]) {
	  Player p=new Player();//if subclass constructor is called
	                      //super class default constructor is also called
	  p.display();//superclass method can be called in subclass
	  //p.show();
	  
	  Player p1=new Player("Cricket");
	  p1.display();
	  p1.setStudent("Rajan","Chennai");
	  p1.display();
	  //p1.show();
			 
	  Player p2=new Player(4,"Roshan","Chennai","Tennis");
	  p2.display();
	 // p2.show();
  }
}
