

class Palindrome{
  public static void main (String[] args) {
   String b = "";
   String a = System.console().readLine("---- Write the String to Check that it is Palindrome or not ----");
   for (int i= a.length() - 1; i>=0; i--) {
      b = b + a.charAt(i);
      }		
   if(a.equalsIgnoreCase(b)) {
      System.out.println("--- "+a+ " is a Palindrome String ---"); 
      } else 
        System.out.println("---"+a+" is Not a Palindrome String ---");
   }
}