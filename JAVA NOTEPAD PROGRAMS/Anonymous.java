package Akki;

abstract class Aakash {
    
    public void hello() {
    System.out.println("Hello Everyone");
     }
    abstract public void bye();
}

class Anonymous {
 public static void main (String[] args) {
   Aakash a = new Aakash() {
   public void bye() {
	  System.out.println("Bye Bye Everyone");
         }
	};
	a.hello();
	a.bye();
  }
}



--- OUTPUT ---
Hello Everyone
Bye Bye Everyone
