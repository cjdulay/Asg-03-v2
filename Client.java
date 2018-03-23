import java.util.*;
public class Client
{
    public static void main(String args[])
    {
		//GET FILE NAMES
        // define necessary variables here
		char option = ' ';
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter input file name: ");
		String file = reader.next();
		while (option != 'Q'){
			showMenu();
			System.out.println("Enter option: ");
			String input = reader.next();
			if (input.length() == 1){
				option = Character.toUpperCase(input.charAt(0));
				if(option == 'A'){
					System.out.println("hi");
					//addEmp();
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
				} else {
					System.out.println("Invalid Option!");
				}
			} else {
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
/*
	public void addEmp(Employee emp){

	}
*/


}