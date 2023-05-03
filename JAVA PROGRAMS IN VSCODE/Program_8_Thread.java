class First extends Thread {
    public void run(){
        for(int i=0; i<=5; i++){
            System.out.print("First  "+i+"  ");
        }
        System.out.println("");
        for(int i=0; i<=10; i++){
            System.out.print("Second  "+i+"  ");
        }
        System.out.println("");
        for(int i=0; i<=10; i++){
            System.out.print("Third  "+i+"  ");
        }
    }
}
class Second extends Thread {
    public void run(){
        for(int i=0; i<=5; i++){
            System.out.print("First  "+i+"  ");
        }
        System.out.println("");
        for(int i=0; i<=10; i++){
            System.out.print("Second  "+i+"  ");
        }
        System.out.println("");
        for(int i=0; i<=10; i++){
            System.out.print("Third  "+i+"  ");
        }
    }
}
class Third extends Thread {
    public void run(){
        for(int i=0; i<=5; i++){
            System.out.print("First  "+i+"  ");
        }
        System.out.println("");
        for(int i=0; i<=10; i++){
            System.out.print("Second  "+i+"  ");
        }
        System.out.println("");
        for(int i=0; i<=10; i++){
            System.out.print("Third  "+i+"  ");
        }
    }
}

public class Program_8_Thread {
    public static void main(String [] args){
        Thread a = new Thread(new First());
        Thread b = new Thread(new Second());
        Thread c = new Thread(new Third());
        // First a = new First();       
        c.setPriority(Thread.MAX_PRIORITY); 
        b.setPriority(Thread.NORM_PRIORITY);
        a.setPriority(Thread.MIN_PRIORITY);
        a.start(); 
        b.start();
        c.start();
    }
}