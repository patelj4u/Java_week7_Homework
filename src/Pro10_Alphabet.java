/*Input any alphabet from “A" to “F” and print their city name accordingly (use if else)
if any other alphabet should be invalid entry
 */

import java.util.Scanner;

public class Pro10_Alphabet {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Input any alphabet from A to F : " );
        String city = scanner.next();

        if(city.equalsIgnoreCase("A")){
            System.out.println("Ahmedabad");
        } else if (city.equalsIgnoreCase("B")) {
            System.out.println("Baroda");
        }else if (city.equalsIgnoreCase("C")) {
            System.out.println("Chandigadh");
        }else if (city.equalsIgnoreCase("D")) {
            System.out.println("Dholka");
        }else if (city.equalsIgnoreCase("E")) {
            System.out.println("Etawah");
        }else if (city.equalsIgnoreCase("F")) {
            System.out.println("Faridabad");
        }else {
            System.out.println("Invalid Entry");
        }
    }
    }










