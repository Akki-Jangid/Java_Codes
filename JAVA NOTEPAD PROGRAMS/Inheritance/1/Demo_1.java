class Inherit{
	int a ;
	String b;
	Inherit(){ System.out.println("This is U");  }
	public void hello_1(){
	this.a = 10;
	this.b ="Aakash";
	System.out.println("--- This is Akki in Super Class --->> "+a+"  and  "+b);
	} 
}

class Me extends Inherit{
	Me (){ System.out.println("This is ME"); }
	public void hello_2(){
	this.a = 20;
	this.b = "Akki";
	System.out.println("--- This is Akki in Sub-Class --->> "+a+"  and  "+b);
	}	
}

class Demo_1{
	public static void main(String args[]){
	Me obj1 = new Me();
	// obj1.hello_2();	
	}
}