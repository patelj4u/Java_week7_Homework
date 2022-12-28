/*WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
salary
HRA = basic salary 10%
DA = Basic salary 8%
TA = Basic salary 9%
PF= Basic salary 20%
Gross salary = basic salary + HRA + TA + DA –PF
Print in following format*/

  import java.util.Scanner;
  // Java program to implement
// the above approach
  import java.util.*;
  import java.lang.*;

public class Pro6_Employee {
    public static void main(String[] args) {
        Pro6_Employee.employee();
    }
    static void employee() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Employee id : ");
        int eid = scanner.nextInt();

        System.out.println("Enter Employee Name : ");
        String ename = scanner.next();

        System.out.println("Enter Basic Salary : ");
        int salary = scanner.nextInt();

        double hra = salary*10/100;
        double da = salary*8/100;
        double ta = salary*9/100;
        double pf = salary*20/100;

        double grosssalary = salary + hra + ta + da - pf;

        System.out.println("----------------------------------------------------");
        System.out.println("|                    Salary Slip                    |");
        System.out.println("|---------------------------------------------------|");
        System.out.println("| Employee Id         :                 " +  eid  + " |");
        System.out.println("| Employee Name       :                 " +  ename  + " |");
        System.out.println("|----------------------------------------------------|");
        System.out.println("| Basic Salary        :                 " + salary + " |");
        System.out.println("| HRA 10%        :                 " + hra + " |");
        System.out.println("| TA 8%        :                 " + ta + " |");
        System.out.println("| DA 9%        :                 " + da + " |");
        System.out.println("| PF - 20%        :                 " + pf + " |");
        System.out.println("|---------------------------------------------------|");
        System.out.println("| Gross Salary        :                 " + grosssalary + " |");
        System.out.println("|===================================================|");

    }
    }
