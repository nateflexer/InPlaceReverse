import java.util.Scanner;
public class InPlaceReverse
{
   /**
    * @param s - the string to be reversed in place
    * PRECONDITION a char[] called s 
    * POSTCONDITION, s is in reverse order.
    */
   public static void reverseString(final char[] s)
   {
      String reverseString = "";
      for (int i = s.length - 1; i >= 0; i--) {
         reverseString += s[i];
      }
      return reverseString;
   }
   
  
   // DO NOT CHANGE CODE BELOW THIS LINE
   /** 
    * This reads in a string into a char[] 
    * and calls reverseString, and prints before and
    * after.
    */
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Enter a word to reverse: ");
      char[] word = keyboard.nextLine().toCharArray();
      System.out.println();
      printCharArray(word);
      reverseString(word);
      System.out.print(" reversed is ");
      printCharArray(word);
      System.out.println();
   }
   /** 
    * @param s - the char[] to print.
    */
   public static void printCharArray(final char[] s){
     //print out all of the elements
      for(int i = 0; i<s.length;i++) {
         System.out.print(s[i]);
      }
   }
}