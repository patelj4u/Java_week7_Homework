

/*Write if else condition and print your group name in console else
others group name*/


import java.util.Scanner;

public class Pro4_IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Group name : ");
        String group = sc.nextLine();

        if (group.equalsIgnoreCase ("Postman")) {
            System.out.println(" my group");
        } else if (group.equalsIgnoreCase("Selenium")) {
            System.out.println("Not My group");
        } else if (group.equalsIgnoreCase("Java")) {
            System.out.println("not my group");
        } else if (group.equalsIgnoreCase( "RestAssured")){
            System.out.println("not my group");
        }else{
            System.out.println("Invalid Entry");
        }


        }
}
