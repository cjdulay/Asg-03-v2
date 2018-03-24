import java.util.*;
import java.io.*;
public class Client

{

    public static void main(String args[]) throws IOException

    {
        Payroll pay = new Payroll();
        //GET FILE NAMES
        // define necessary variables here
        char option = ' ';
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter input file name: ");
        String file = sc.next();
        pay.readFile(file);

        while (option != 'Q'){
            showMenu();
            System.out.println("Enter option: ");
            String input = sc.next();
            Payroll valid;

            if (input.length() == 1){
                option = Character.toUpperCase(input.charAt(0));
                if(option == 'A'){
                    String empNo;
                    System.out.print("Enter employee number: ");
                    empNo = sc.next();
                    valid = pay.checkEmpNum(empNo);
                    addEmployee(empNo, );
                } else if (option == 'I') {
                    System.out.println("hi");
                    //printInfo();
                } else if (option == 'D') {
                    System.out.println("hi");
                    //removeEmp();
                } else if (option == 'S') {
                    System.out.println("hi");
                    //printWeeklyPay();
                } else if (option == 'T') {
                    System.out.println("hi");
                    //printTopSellers();
                } else if (option == 'P') {
                    System.out.println("hi");
                    //printSalaryReport();
                } else if (option == 'W') {
                    System.out.println("hi");
                    //weekProcessing();
                } else if(option == 'Q'){
                    option ='Q';
                } 
                else  {
                    System.out.println("Invalid Option!");
                }
            } 
            else {
                System.out.println("Invalid Option!");
            }
        }

        // place here the code for the processing requirements

        System.out.println ("Thank you for using the Payroll Processing System");

    }

    //   The Payroll processing menu
    public static void showMenu()
    {
        System.out.println("\nMENU:");
        System.out.println("A - Add a new employee");
        System.out.println("I - Print information of an individual employee");
        System.out.println("D - Remove an employee from payroll");
        System.out.println("S - calculate and print the weekly pay of an employee");
        System.out.println("T - This prints the list of Commission employees who are topSellers");
        System.out.println("P - prints salary report");
        System.out.println("W - End of week processing");
        System.out.println();
        System.out.println("Q - Quit the system");
    }
    
    public void addEmployee(String emp, Payroll data){
        String name;
        String employeeNo;
        String department;
        char type;
        double hourlyRate;
        double weeklyHours;
        double yearlySalary;
        int weeksSinceEmp;
        double baseWeekSalary;
        double weekSales;
        double yearSales;
        double commissionRate;

        Scanner sc = new Scanner (System.in);

        System.out.print("Enter employee name: ");
        name = sc.next();
        System.out.print("Enter employee no: ");
        employeeNo = sc.next();
        System.out.print("Enter department: ");
        department = sc.next();
        System.out.print("Enter type: ");
        type = sc.next().toUpperCase().charAt(0);
        if (type == 'H'){
            System.out.print("Enter hourly rate: ");
            hourlyRate = sc.nextDouble();
            System.out.print("Enter weekly hours: ");
            weeklyHours = sc.nextDouble();
        }
        else if(type == 'S'){
            System.out.print("Enter yearly salary: ");
            yearlySalary = sc.nextDouble();
        }
        else if (type == 'C'){
            System.out.print("Enter weeks since employment: ");
            weeksSinceEmp = sc.nextInt();
            System.out.print("Enter base week salary: ");
            baseWeekSalary = sc.nextDouble();
            System.out.print("Enter the weekly sales: ");
            weekSales = sc.nextDouble();
            System.out.print("Enter the yearly sales: ");
            yearSales = sc.nextDouble();
            System.out.print("Enter the commission rate: ");
            commissionRate = sc.nextDouble();

        }
    }
}
