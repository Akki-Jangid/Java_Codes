import java.util.Scanner;

class Reverse {
  public static void main (String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.println("---- Type the String Which You Want to Reverse ----\n");
  String a = input.nextLine();
   for (int i=a.length(); i>0; i--) {
      System.out.print(a.charAt(i-1));
    } 
  }
}