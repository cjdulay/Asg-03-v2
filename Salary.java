import java.util.*;
import java.io.*;
public class Salary extends Employee
{
    public double yearSal;

    Salary() throws IOException{
    }

    Salary(String name, String employeeNo, String department, double yearSalary){
        super(name, employeeNo, department, 'S');
        yearSal = yearSalary;
    }

    public void setYearSal(double yearlySal){
        yearSal = yearlySal;
    }

    public double getYearSal(){
        return yearSal;
    }

    public double calcWeeklySalary(){
        double weekSal = yearSal / 52;
        return weekSal;
    }

    public String toString(){
		String line = "";
		String ySal = "Yearly Salary: " + getYearSal() + "\n";
		line = 	super.toString() + ySal;
        return line;
    }

    public void writeData(){

    }
}
