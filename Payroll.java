import java.util.*;
import java.io.*;
public class Payroll
{
    private ArrayList <Employee> a = new ArrayList <Employee>();
    public void run(){

    }

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
                a.add(h);
            }
            else if (type == 'S'){
                salary = inFile.nextDouble();
                Employee s = new Salary(name, employeeNo, department, salary);
                a.add(s);
            }
            else if (type == 'C'){
                weeksSinceEmp = inFile.nextInt();
                baseWeekSalary = inFile.nextDouble();
                weekSales = inFile.nextDouble();
                yearSales = inFile.nextDouble();
                commissionRate = inFile.nextDouble();
                Employee c = new Commission(name, employeeNo, department, weeksSinceEmp, baseWeekSalary, yearSales, commissionRate);
                a.add(c);
            }
        }
        inFile.close();
    }

    public Employee checkEmpNum(String num){
        Employee valid = null;
        boolean found = false;

        int i = 0;
        while (i < a.size() && !found){
            if (a.get(i).getEmployeeNo().equals(num)){
                valid = a.get(i);
                found = true;
            }
            i++;
        }
        return valid;
    }

    public void empQuery(String num)
    {
        Employee foundItem = null;

        foundItem = checkEmpNum(num);
        if (foundItem != null)
            System.out.println (foundItem.printDetails());
        else
            System.out.println ("This employee number " + num + " does not exist.");

    }

}
