// interface Demo{
//	public abstract void me();
//	public abstract void you();
//	public static final int name=200;
//	public void none() { System.out.println("Hiilo"); }
// }

interface Demo_3 {
	void me();
	void you();
}


class Demo_1 {
	public void play() {	System.out.println("This is Demo_1 Class ('--- I'm Playing ---')");	}
	public void me() { System.out.println("This is Me in Demo_1 "); }
	public void you() { System.out.println("This s You in Demo_1 "); }
} 


class Demo_2 extends Demo_1 implements  Demo_3 {
	public void play() {	System.out.println("This is Demo_1 Class ('--- I'm Playing ---') in  CHILD-CLASS");	}
	public void me() { System.out.println("This is Me in Demo_2 "); }
	public void you() { System.out.println("This s You in Demo_2 "); }

}

class Mine {
	public static void main(String[] args) {
	// Demo_2 obj1 = new Demo_2();
	Demo_3 obj1 = new Demo_2();
	obj1.me();
	obj1.you();
	
	Demo_1 obj2 = new Demo_2();
	obj2.play();
	// System.out.println("This is the Value of Name ---> "+obj1.name);	
     }
}