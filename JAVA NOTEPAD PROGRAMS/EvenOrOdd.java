class EvenOrOdd{
	public static void main(String[] args) {
	int fact = 1;
	System.out.println("----- Enter the Number to Check that it is Odd or Even -----");
	int a = Integer.parseInt(System.console().readLine());
	if(a % 2 == 0){
	System.out.println(a+ " is an Even Number.");
      } else {
	System.out.println(a+ " is an Odd Number.");
	}
   }
}


