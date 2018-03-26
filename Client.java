import java.util.*;
import java.io.*;
public class Client
{
    private static Scanner sc = new Scanner(System.in);
    public static void main(String args[]) throws IOException
    {
        char option = ' ';
        String empNo;
        System.out.println("Enter input file name: ");
        String file = sc.nextLine();
        Payroll pay = new Payroll(file);
        while (option != 'Q'){
            int check;
            showMenu();
            option = choice();
            if(option == 'A'){              
                empNo = checkSize();
                check = pay.checkEmpNum(empNo);
                if (check == -1){
                    addEmployee(empNo, pay);
                    System.out.print("Employee number " + empNo + " has been added");
                }
                else {
                    System.out.print("Invalid employee number");
                }
            } else if (option == 'I') {
                empNo = checkSize();
                check = pay.checkEmpNum(empNo);
                if (check != -1){
                    pay.printEmployeeInfo(check);
                }
                else if (check == -1) {
                    System.out.print("Invalid employee number");
                }
            } else if (option == 'D') {
                empNo = checkSize();
                check = pay.checkEmpNum(empNo);
                if (check != -1){
                    pay.removeEmployee(check);
                    System.out.print("Employee number " + empNo + " has been removed");
                }
                else if (check == -1) {
                    System.out.print("Invalid employee number");
                }
            } else if (option == 'S') {
                empNo = checkSize();
                check = pay.checkEmpNum(empNo);
                if (check != -1){
                    double sal;
                    sal = pay.weeklySalary(check);
                    System.out.print("The weekly salary of employee " + empNo + " is $" + sal);
                }
                else if (check == -1) {
                    System.out.print("Invalid employee number");
                } 
            } else if (option == 'T') {
                pay.topSellersList();
            } else if (option == 'P') { 
                pay.printSalaryReport();
            } else if (option == 'W') {
                System.out.print("Please enter output file name:");
                String out = sc.next();
                pay.printReport(out);
                System.out.print("End of day report printed");
            } else if(option == 'Q'){
                option ='Q';
            } 
            else  {
                System.out.println("Invalid Option!");
            }
        } 

        // place here the code for the processing requirements
        System.out.println ("Thank you for using the Payroll Processing System");
    }

    public static char choice(){
        char option;
        System.out.print("Enter menu option: ");
        option = sc.next().toUpperCase().charAt(0);
        return option;
    }

    public static String checkSize(){
        String empNum;
        int index;
        System.out.print("Enter employee number: ");
        empNum = sc.next();

        return empNum;
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

    public static void addEmployee(String emp, Payroll data){
        String name;
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
        System.out.print("Enter department: ");
        department = sc.next();
        System.out.print("Enter type: ");
        type = sc.next().toUpperCase().charAt(0);
        if (type == 'H'){
            System.out.print("Enter hourly rate: ");
            hourlyRate = sc.nextDouble();
            System.out.print("Enter weekly hours: ");
            weeklyHours = sc.nextDouble();
            data.addHourly(name, emp, department, hourlyRate, weeklyHours);
        }
        else if(type == 'S'){
            System.out.print("Enter yearly salary: ");
            yearlySalary = sc.nextDouble();
            data.addSalary(name, emp, department, yearlySalary);
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
            data.addCommission(name, emp, department, weeksSinceEmp, baseWeekSalary, yearSales, commissionRate);

        }
    }
}
