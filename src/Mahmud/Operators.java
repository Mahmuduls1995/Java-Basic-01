package Mahmud;

import java.util.Scanner;

public class Operators {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
       System.out.println("Enter 1st numbers: ");
       int num1 = input.nextInt();
       System.out.println("Enter 2nd numbers: ");
       int num2 = input.nextInt();

      System.out.println( "Sum of two numbers is: " + (num1 + num2));
      System.out.println( "Difference/Subtraction of two numbers is: " + (num1 - num2));
      System.out.println( "Product/Multiplication of two numbers is: " + (num1 * num2));
      System.out.println( "Quotient/Division of two numbers is: " + (num1 / num2));
      System.out.println( "Remainder/Module of two numbers is: " + (num1 % num2));
      System.out.println( "Increment of two numbers is: " + (++num1));
      System.out.println( "Decrement of two numbers is: " + (--num1));


   }
}
