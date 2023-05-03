class Exception {
  public static void main (String[] args) {
   int a = Integer.parseInt(System.console().readLine("Enter the First Number ---> "));
   int b = Integer.parseInt(System.console().readLine("Enter the Second Number ---> "));
   int c = 1;
   try {   
       c  = a/b; 
       System.out.println("Division of "+a+" by "+b+" is ---> "+c); 
       }
   catch(ArithmeticException e) {
       System.out.println("--- Denominator Value Can't be Zero --- "+e);        
         } 
    //  finally {
    //       System.out.println("Division of "+a+" by "+b+" is ---> "+c);
    //       }
   }
}