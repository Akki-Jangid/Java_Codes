class Mi{
	String a, b;
	public void mi_1(){ a = System.console().readLine("Enter Processor Name ---> "); }
	public void mi_2(){ b = System.console().readLine("Enter Processor Name ---> "); }

}
class Realme extends Mi{
	String a, b;
	public void realMe_1(){ a = System.console().readLine("Enter Processor Name ---> ");  
	System.out.println(a);	}
        public void realMe_2(){ b = System.console().readLine("Enter Processor Name ---> "); 
	System.out.println(b);	 }
}

class Demo{
	public static void main(String args[]){
	Mi obj1 = new Mi();
	Realme obj2 = new Realme();
	obj2.realMe_1();
	obj2.realMe_2();
	}
}
