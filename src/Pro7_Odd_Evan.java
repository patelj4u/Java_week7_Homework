
//7. Write a java program to input any number and find out if it’s odd or even

   import java.util.Scanner;
public class Pro7_Odd_Evan {

    public static void main(String[] args) {

        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number you want to check:");
        n = s.nextInt();
        if(n % 2 == 0)
        {
            System.out.println("The given number "+n+" is Even ");
        }
        else
        {
            System.out.println("The given number "+n+" is Odd ");
        }



    }
}
