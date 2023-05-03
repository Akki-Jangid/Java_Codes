import java.util.*;

import javax.swing.plaf.synth.SynthScrollPaneUI;

class Cons{
    private int id;
    private String name;

    public Cons(){
        System.out.println("This is First Construtor.");
    }

    public Cons(int id){
        this.id = id;
    }

    public Cons(String name){
        this.name= name;
    }

    public Cons(int id, String name){
        this.id = id;
        this.name = name;
    }

    public Cons(Cons temp){
        id = temp.id;
        temp.name = temp.name;
        System.out.println("This is COPY CONSTRUCTOR.");
        System.out.println("Your ID : "+temp.id+"\nYour Name : "+temp.name);
    }

    public void set_Id(int id){
        if(id<0){
            System.out.println("ID Can't be Less Than 0.");
        } else {
            this.id = id;
        }
    }

    public void set_Name(String name){
        this.name = name;
    }

    public void get_Id(){
        System.out.println("Your ID is : "+this.id);
    }

    public void get_Name(){
        System.out.println("Your Name is : "+this.name);
    }
}

class Program_5_Constructors{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Cons a = new Cons(1, "AKKI");
        Cons b = new Cons(a);
        
    }
}