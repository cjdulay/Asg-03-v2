import java.util.*;
import java.io.*;
public class Payroll
{
    private ArrayList <Employee> employee = new ArrayList <Employee>();
    public Payroll(String file) throws IOException{
        readFile(file);
    }

    //Reads the file
    public void readFile(String in) throws IOException{
        String name = "";
        String employeeNo = "";
        String department = "";
        char type;
        double hourWage;
        double hoursWorked;
        double salary;
        int weeksSinceEmp;
        double baseWeekSalary;
        double weekSales;   
        double yearSales;
        double commissionRate;

        Scanner inFile = new Scanner(new File(in));
        while(inFile.hasNext()){
            name = inFile.next();
            employeeNo = inFile.next();
            department = inFile.next();
            type = inFile.next().charAt(0);
            if (type == 'H'){ 
                hourWage = inFile.nextDouble();
                hoursWorked = inFile.nextDouble();                  
                Employee h = new Hourly(name, employeeNo, department, hourWage, hoursWorked);
                employee.add(h);
            }
            else if (type == 'S'){
                salary = inFile.nextDouble();
                Employee s = new Salary(name, employeeNo, department, salary);
                employee.add(s);
            }
            else if (type == 'C'){
                weeksSinceEmp = inFile.nextInt();
                baseWeekSalary = inFile.nextDouble();
                weekSales = inFile.nextDouble();
                yearSales = inFile.nextDouble();
                commissionRate = inFile.nextDouble();
                Employee c = new Commission(name, employeeNo, department, weeksSinceEmp, baseWeekSalary, yearSales, commissionRate);
                employee.add(c);
            }
        }
        inFile.close();
    }

    // Checks if the employee is in the array by comparing employee no
    public int checkEmpNum(String num){
        boolean found = false;
        int i = 0;
        int counter = -1;
        int numOfEmp = employee.size();
        while (!found && i < numOfEmp){
            if (num.equals(employee.get(i).getEmployeeNo())){
                counter = i;
                found = true;
            }
            i++;
        }
        return counter;
    }

    //Methods to add employees
    public void addHourly(String name, String employeeNo, String department, double hourWage, double hoursWorked){
        Hourly h = new Hourly(name, employeeNo, department, hourWage, hoursWorked);
        employee.add(h);
    }

    public void addSalary(String name, String employeeNo, String department, double salary){
        Salary s = new Salary(name, employeeNo, department, salary);
        employee.add(s);
    }

    public void addCommission(String name, String employeeNo, String department, int weeksSinceEmp, double baseWeekSalary, double yearSales, double commissionRate){
        Commission c = new Commission(name, employeeNo, department, weeksSinceEmp, baseWeekSalary, yearSales, commissionRate);
        employee.add(c);
    }

    //Prints employee info

    public void printEmployeeInfo(int counter){
        System.out.print(employee.get(counter).toString());
    }

    //Delete an employee

    public void removeEmployee(int counter){
        employee.remove(counter);
    }

    //Calculates weekly salary
    public double weeklySalary(int counter){
        double salary = employee.get(counter).calcWeeklySalary();
        return salary;
    }

    //Prints weekly salary report for everything in the array
    public void printSalaryReport(){
        System.out.print("\nWeekly Salary Report\n");
        int numberOfEmployees;
        String empType = "";
        numberOfEmployees = employee.size();

        for(int i = 0; i < numberOfEmployees; i++){
            char type = employee.get(i).getType();
            if (type == 'H'){
                empType = "Hourly";
            }
            else if (type == 'S'){
                empType = "Salary";
            }
            else if (type == 'C'){
                empType = "Commission";
            }
            System.out.print(employee.get(i).getName() + "\t" + employee.get(i).getEmployeeNo() + "\t" + employee.get(i).getDepartment() + "\t" + empType + "\t $" + weeklySalary(i) + "\n");
        }
    }

    public void topSellersList(){
        int employeeSize;
        char type;
        String name;

        System.out.print("\nTop Sellers\n");
        employeeSize = employee.size();

        for(int i = 0; i < employeeSize; i++){
            type = employee.get(i).getType();
            if (type == 'C'){
                if (employee.get(i).topSeller() == true){
                    name = employee.get(i).getName();
                    System.out.print(name);
                }
                else if(employee.get(i).topSeller() == false){
                    System.out.print("No top sellers");
                }
            }
        }
        System.out.print("\n");
    }

    public void printReport(String outFile) throws IOException{
        PrintWriter out = new PrintWriter(outFile);
        int employeeSize;

        employeeSize = employee.size();

        for (int i = 0; i < employeeSize; i++){
            out.println(employee.get(i).writeData());
        }
        out.close();
    }
}

