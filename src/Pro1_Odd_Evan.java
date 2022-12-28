
/*1. Write a java program that tells us that Input number is odd or even?
HINT: use ternary operator (? :)*/


import java.util.Scanner;

 public class Pro1_Odd_Evan { // Declare Class


     public static void main(String[] args) { //Main Method or pr
         Scanner scanner = new Scanner(System.in); //Declare Scanner Class
         System.out.println("Enter your Number");// Print Statement
         int num = scanner.nextInt();


         String result = (num % 2 == 0) ? "Even" : "Odd";//Declare ternary operator
         System.out.println("number is : "+result);// Print Statement2
     }


 }





