
/*15. Write a Java program which input any number between 1 to 7 and it print The Days
name MONDAY, TUESDAY.....SUNDAY of the week accordingly by using switch.
NOTE: if number is out of selection Print message “Week contains 1 to 7 days”*/


import java.util.Scanner;

public class Pro15_Days {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("input any number from between 1 to 7 : " );
        String days = sc.next();

        switch (days){
            case ("1"):
                System.out.println("monday");
                break;
            case "2":
                System.out.println("Tuesday");
                break;
            case "3":
                System.out.println("Wedneday");
                break;
            case "4":
                System.out.println("Thursday");
                break;
            case "5":
                System.out.println("Friday");
                break;
            case "6":
                System.out.println("Saterday");
                break;
            case "7":
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Week contains 1 to 7 days");
        }
    }

}
