
/*12. Write a java program to input any two number and ask user to enter their symbol (+, -,
/, *) find addition, Subtraction, multiplication and division according to their symbol
(using if else)*/


import jdk.nashorn.internal.ir.Symbol;

import java.util.Scanner;

public class Pro12_Symbol {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number : " );
        int numA = scanner.nextInt();
        System.out.println("Enter Second Number : " );
        int numB = scanner.nextInt();
        System.out.println("Enter any Symbol from (+,-,/,*) : " );
        String symbol = scanner.next();

        if(symbol.equals("+")){
            System.out.println("Addition is : " +(numA+numB));
        } else if (symbol.equals("-")) {
            System.out.println("Subtraction is : " +(numA-numB));
        } else if (symbol.equals("/")) {
            System.out.println("Division is : " +(numA/numB));
        } else if (symbol.equals("*")) {
            System.out.println("Multiplication is : " +(numA*numB));
        } else {
            System.out.println("Invalid Symbol");
        }


    }
}
