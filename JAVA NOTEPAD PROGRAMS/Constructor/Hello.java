class Constructor{
	public Constructor() { System.out.println("---- This is Parent's class Con ( 0 Parameter ) ----"); }
	public Constructor(int a ) { System.out.println("---- This is Parent's class Con ( 1 Parameter 'Interger' ) ----" +a ); }
	public Constructor(int a, String b) { System.out.println("---- This is Parent's class Con ( 2 Parameters ('String and Int')) ----  " +a+ "  and  "+b ); }
}

class Constructor_1 extends Constructor{
	Constructor_1 () { System.out.println("---- This is Child's Class Con (0 Parameter) ----"); }
	Constructor_1 (int a) { System.out.println("---- This is Child's Class Con (1 Parameter) ----"+a); }
	Constructor_1 (String a, int b) {super(b,a); System.out.println("---- This is Child's Class Con (2 Parameter) ----  "+a+ "  and  "+b); }
}

class Hello{
	public static void main(String args[]){
	// Constructor a = new Constructor();
	// Constructor_1 b = new Constructor_1 ();
	// Constructor_1 a = new Constructor_1 (100);
	Constructor a = new Constructor_1 ();	
	}
}
