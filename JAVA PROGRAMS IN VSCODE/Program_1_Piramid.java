
class Order {
    public void incr() {
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }

    public void reverse() {
        for (int i = 0; i <= 10; i++) {
            for (int j = 10; j > i; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }

}

public class Program_1_Piramid {
    public static void main(String args[]) {
        Order ord = new Order();
        ord.incr();
        ord.reverse();

    }
}
