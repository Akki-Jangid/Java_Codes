class Fibonacci{
	public static void main(String[] args) {
	int a=0, b=1;
	System.out.println(" ----- Enter the Number to Print Fibonacci Series -----");
	int c = Integer.parseInt(System.console().readLine());
	System.out.print("----- Fibanacci Series ----- \n"+a+ " "+b);
	for(int i=0; i<c; i++){
	int d = a+b;
	a=b;
	b=d;
	System.out.print(" "+d);
	}
    }
}