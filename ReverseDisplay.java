import java.util.Scanner;

public class ReverseDisplay {
   //display number in reverse method
   public static void reverseDisplay(int value) {
      //if the value is less than 10, the value will be printed out
      if (value < 10) {
         System.out.println(value);
         return;
      } 
      else {
         System.out.print(value % 10); //print out the remainder of the value  
         reverseDisplay(value / 10); // call the method with an updated value excluding the numbers after the decimal
      }
   }
   
   public static void main(String[] args) {
      //create scanner
      Scanner in = new Scanner(System.in);
      //variables
      int num;
      //ask the user for a number
      System.out.println("Enter a number and I will display it in reverse: ");
      num = in.nextInt();
      //call the method to display the number in reverse
      reverseDisplay(num);
      
   }

}