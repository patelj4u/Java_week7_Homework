//Write a program that tells us input value is number or an alphabet or symbol.


import java.util.Scanner;

public class Pro14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Value : " );
        char val = sc.next().charAt(0);

        if(val >= '0' && val <= '9' ){
            System.out.println(val + " Is a Number ");
        } else if ((val >= 'a' && val <= 'z') || (val >= 'A' && val <= 'Z')){
            System.out.println(val + " Is an Alphabet ");
        } else {
            System.out.println(val + " Is a Symbol ");
        }
    }
}
