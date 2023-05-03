import java.util.*;

class Base{
    private int num;
    private String name;

    public Base(){
        System.out.println("I am Default Construtor of BASE CLASS");
    }
    public Base(int i){
        num = i;
    }
    public Base(String n){
        name = n;
    }
}

class Derived extends Base{
    private int number;
    public void Base(){
        System.out.println("BASE IN DERIVED.");
    }

    public Derived(){
        super();
        System.out.println("This is Default Constructor of DERIVED CLASS.");
    }
    public Derived(int i){
        super(i);
        // number = i;
        System.out.println("The Value of PRIVATE VARIABLE is : "+i);
    }
    public void print(){
        System.out.println("This is the Value of Private Variable : "+number);
    }
}

class Practices_1{
    public static void main(String[] args) {
        // Base a = new Base(20);
        Derived b = new Derived();
        b.Base();
    }
} 