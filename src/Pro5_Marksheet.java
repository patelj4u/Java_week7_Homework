import java.util.Scanner;

/* Write a java program to input student Name, roll No, and three subjects Math, Science and
English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
Input, Marks should between 0 to 100”) and find out total, percentage and result.
If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
%> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet */
public class Pro5_Marksheet {
    public static void main(String[] args) {

       // String name = "Jiten";
        //int rollno = 10;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Student Name : " );
        String name = scanner.next();

        System.out.println("Enter Roll number : ");
        int rollNO = scanner.nextInt();


        System.out.println("Enter Marks of Maths : ");
        int maths = scanner.nextInt();
        while (maths>100){
            System.out.println("Invalid Input, Marks should between 0 to 100 : ");
            System.out.println("Enter marks agian : ");
            maths = scanner.nextInt();
        }


        System.out.println("Enter Marks of Science : ");
        int sci = scanner.nextInt();
        while (sci>100){
            System.out.println("Invalid Input, Marks should between 0 to 100 : ");
            System.out.println("Enter marks agian : ");
            sci = scanner.nextInt();
        }


        System.out.println("Enter Marks of English : ");
        int eng = scanner.nextInt();
        while (eng>100){
            System.out.println("Invalid Input, Marks should between 0 to 100 : ");
            System.out.println("Enter marks agian : ");
            eng = scanner.nextInt();
        }

        int total = maths+sci+eng;
        float percentage =(total*100)/300;

         String result = "";
         String grade = "";

        if(percentage>=80){
            grade= "A+";
            result = "Pass";
        } else if (percentage>=60) {
            grade= "A";
            result = "Pass";
        } else if (percentage>=50) {
            grade = "B";
            result = "Pass";
        } else if (percentage>=35) {
            grade = "C";
            result = "Pass";
        } else {
            grade = "Fail";
            result = "Fail";
        }

        System.out.println("|-------------------------------------------------|");
        System.out.println("|               Marksheet                         |");
        System.out.println("|                                                 |");
        System.out.println("|    Name              : "         +name    +  "                      |");
        System.out.println("|    Roll No           : "         +rollNO  +  "                        |");
        System.out.println("|-------------------------------------------------|");
        System.out.println("|    Subjects          :            Marks         |");
        System.out.println("|-------------------------------------------------|");
        System.out.println("|    Maths             : "         +maths   +  "                       |");
        System.out.println("|    Science           : "         +sci     +  "                       |");
        System.out.println("|    English           : "         +eng     +  "                       |");
        System.out.println("|-------------------------------------------------|");
        System.out.println("|    Total             : "         +total   +  "                      |");
        System.out.println("|-------------------------------------------------|");
        System.out.println("|    Percentage        : "         +percentage  +  "                     |");
        System.out.println("|    Result            : "         +result   +   "                     |");
        System.out.println("|    Grade             : "         +grade    +   "                        |");
        System.out.println("|-------------------------------------------------|");
    }
}
