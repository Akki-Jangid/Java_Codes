import java.util.*;
// import java.lang.*;

class GTN{
    Scanner input = new Scanner(System.in);
    Random r = new Random();
    int comp = r.nextInt(100);
    public void code(){
        // System.out.println("Enter the Number Between 1-100 :" );
        int user = input.nextInt();
            if(this.comp>user){
                System.out.println("OOPSS... Number is Greater Than "+user);
                System.out.print("Choose Again : ");
                code();
            } 
            if(this.comp<user){
                System.out.println("OOPSS... Number is Lesser Than "+user);
                System.out.print("Choose Again : ");
                code();
            }   
        if(this.comp==user){
            System.out.println("CONGRATULATIONS! You Won...\nYou Have Choosen the Correct Number...");
        }
    }
}
    
public class GuessTheNumber {
        public static void main(String[] args){
            GTN Akki = new GTN();
            System.out.println("|| WELCOME TO NUMBER GUESSING GAME ||");
            System.out.print("CHOOSE THE NUMBER BETWEEN 1-100 :");
            Akki.code();
        }
}
