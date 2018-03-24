import java.util.*;
import java.io.*;
public class Client
{

	public static void main(String args[]) throws IOException
    {
		Payroll pay = new Payroll();
		ArrayList <Employee> empList = pay.getEmpList();
		Client client = new Client();
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
            Employee valid;

            if (input.length() == 1){
                option = Character.toUpperCase(input.charAt(0));
                if(option == 'A'){
                    String empNo;
                    System.out.print("Enter employee number: ");
                    empNo = sc.next();
                    valid = pay.checkEmpNum(empNo);
                    //addEmployee(empNo, )
                } else if (option == 'I') {
					System.out.print("Enter employee number: ");
					String empNo;
					empNo = sc.next();
                    valid = pay.checkEmpNum(empNo);
                    client.printInfo(empNo, empList);
                } else if (option == 'D') {
					String empNo;
					System.out.print("Enter employee number: ");
					empNo = sc.next();
                    valid = pay.checkEmpNum(empNo);
                    client.removeEmp(empNo, empList);
                } else if (option == 'S') {
					String empNo;
					System.out.print("Enter employee number: ");
					empNo = sc.next();
                    valid = pay.checkEmpNum(empNo);
                    client.printWeeklyPay(empNo, empList);
                } else if (option == 'T') {
                    //printTopSellers();
                } else if (option == 'P') {
                    //printSalaryReport();
                } else if (option == 'W') {
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

	public void printInfo(String empNum, ArrayList<Employee> empList){

	}

	public void removeEmp(String empNum, ArrayList<Employee> empList){
		String name = " ";
		int i = 0;
		boolean found = false;
        while (i < empList.size() && !found){
            if (empList.get(i).getEmployeeNo().equals(empNum)){
                name = empList.get(i).getName();
				found = true;
            } else {
				i++;
			}
        }
		System.out.println("Name: " + name);
		System.out.println("Employee number: " + empNum);
		System.out.print("Would you still like to delete this employee? (Y/N): ");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		char response = ' ';
		if (input.length() == 1){
			response = Character.toUpperCase(input.charAt(0));
				if (response == 'Y'){
					int x = 0;
					boolean found2 = false;
			        while (x < empList.size() && !found){
			            if (empList.get(x).getEmployeeNo().equals(empNum)){
			                empList.remove(x);
							found2 = true;
			            } else {
							x++;
						}
			        }
				} else{
					return;
				}
		} else {
			return;
		}
	}

	public void printWeeklyPay(String empNum, ArrayList<Employee> empList){
		Double weeklySalary;
		int i = 0;
		boolean found = false;
        while (i < empList.size() && !found){
            if (empList.get(i).getEmployeeNo().equals(empNum)){
                weeklySalary = empList.get(i).calcWeeklySalary();
				found = true;
            } else {
				i++;
			}
        }
	}
}
