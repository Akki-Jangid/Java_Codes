package Akki;

import java.util.Scanner;

abstract class Name {
	abstract public void your();
	abstract public void game ();
}

class Mine extends Name {
    Scanner sc = new Scanner(System.in);
	public void your () {
		System.out.print("Enter Your Name --> ");
	  String a = sc.nextLine();	
//	  String a = System.console().readLine("Enter Your Name --> ");
	  	
	  System.out.println("Your Name is --> "+a);
  }	
	
	public void game() {
		System.out.print("Enter Your Favourite Game Name --> ");
		String a = sc.nextLine();
		//String b = System.console().readLine("Enter Your Favourite Game Name --> ");
		System.out.println("Your Favourite Game Name is ---> "+a);
	}
}

public class Abstract_Class {
    public static void main (String[] args) {
    	Mine m = new Mine();
    	m.your();
    	m.game();
    }
}





-- OUTPUT --
Enter Your Name --> Aakash
Your Name is --> Aakash
Enter Your Favourite Game Name --> PUBG
Your Favourite Game Name is ---> PUBG
