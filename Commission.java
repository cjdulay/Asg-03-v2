import java.util.*;

import java.io.*;

public class Commission extends Employee

{
    double weeksSinceEmp;
    double baseWeekSalary;
    int weekSales;
    int yearSales;
    double commissionRate;

    Commission()throws IOException{

    }

    Commission(String name, String employeeNo, String department, double weeksSinceEmp, double baseWeekSalary, int yearSales, double commissionRate){
        super(name, employeeNo, department, 'C');
        this.weeksSinceEmp = weeksSinceEmp;
        this.baseWeekSalary = baseWeekSalary;
        this.yearSales = yearSales;
        this.commissionRate = commissionRate;
    }

    public void setWeeksSinceEmp(double weeks){
        weeksSinceEmp = weeks;
    }

    public void setBaseWeekSalary(double baseSalary){
        baseWeekSalary = baseSalary;
    }

    public void setWeekSales(int numWkSales){
        weekSales = numWkSales;
    }

    public void setCommissionRate(double weeks){
        weeksSinceEmp = weeks;
    }

    public double getWeeksSinceEmp(){
        return weeksSinceEmp;
    }

    public double getBaseWeekSalary(){
        return baseWeekSalary;
    }

    public int getWeekSales(){
        return weekSales;
    }

    public double getCommissionRate(){
        return weeksSinceEmp;
    }

    public double calcWeeklySalary(){
        double commission = (double)(weekSales) * commissionRate;
        double wkSal = baseWeekSalary + commission;
        return wkSal;
    }

    public String toString(){
        String line = "";
        String weeks = "Number of weeks worked this year: " + getWeeksSinceEmp() + "\n";
        String baseSal = "Base weekly salary: " + getBaseWeekSalary() + "\n";
        String numWSales = "Sales this week: " + getWeekSales() + "\n";
        String numYSales = "Sales this year (minus this week): " + this.yearSales + "\n";
        String comRate = "Commission Rate: " + getCommissionRate() + "\n";
        String top = "";

        if(topSeller() == true){

            top = "Member of the Top Seller's Club\n";

        } else{

            top = "Not a member of the Top Seller's Club\n";

        }
        line = 	super.toString() + weeks + baseSal + numWSales + numYSales + comRate + top;
        return line;
    }

    public void writeData(){

    }
    
    public boolean topSeller(){
        boolean top;
        double sales = (double)(yearSales) / weeksSinceEmp;
        if(sales > 1500){
            top = true;
        } 
        else {
            top = false;
        }
        return top;
    }

}
