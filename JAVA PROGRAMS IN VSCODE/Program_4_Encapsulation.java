interface You{
    String name="Akki";
    public void hobby();
    public void game();
}    

class Me implements You{
    public void hobby(){
        System.out.println("Gaming and Exercising ... ");
    }
    public void game(){
        System.out.println("My Favt. game is Assassins Creed Series ...");
    } 

    public int num(int a){
        System.out.println("Number : "+a);
        return a*a;
    }
}

class Us extends Me implements You{
    public void hobby(){
        System.out.println("Our Hobby is Travelling ...");
    }
    public void game(){
        System.out.println("Our Favt. game is BGMI ...");
    } 
    public int num(int a){
        System.out.println("Number : "+a);
        return a*a;
    }
}

public class Program_4_Encapsulation {
    public static void main(String args[]){
        // Me a1 = new Me();
        You a1 = new Us();
        Us a2 = new Us();
        a1.game();
        a1.hobby();
        System.out.println(a2.num(20));
        System.out.println("My name is "+ You.name);
    }
}
