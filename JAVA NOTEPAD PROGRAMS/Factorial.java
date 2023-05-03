class Factorial{
	public static void main(String[] args) {
	int fact = 1;
	System.out.println("----- Enter the Number to Find Factorial -----");
	int a = Integer.parseInt(System.console().readLine());
	for(int i=a; i>0; i--) {
	      	fact = fact*i;
	   }
	System.out.println("Factorial of "+a+" is "+fact);
      }
}


