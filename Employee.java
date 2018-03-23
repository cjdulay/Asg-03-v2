import java.util.*;
import java.io.*;
public class Employee 
{
    protected String name;
    protected String employeeNo;
    protected String department;
    protected char type;

    //Constructors

    Employee() throws IOException {
    }

    Employee (String nm, String empNo, String dep, char tp){
        name = nm;
        employeeNo = empNo;
        department = dep;
        type = tp;
    }

    //Mutators

    public void setName(String nm){
        name = nm;
    }

    public void setEmpl(String empNo){
        employeeNo = empNo;
    }

    public void setDepartment(String dep){
        department = dep;
    }

    // Getters

    public String getName(){
        return name;
    }

    public String getEmployeeNo(){
        return employeeNo;
    }

    public String getDepartment(){
        return department;
    }

    // Helper Methods
    public boolean equals(Employee e){
        boolean equals;
        if (getEmployeeNo() == e.getEmployeeNo()){
            equals = true;
        }
        else {
            equals = false;

        }
        return equals;
    }

    public double calcWeeklySalary(){
        return 0;
    }

    public void writeData(){

    }

    public String toString(){
        String line = "";  

        String name = "Employee name: " + getName() + "\n";
        String empNum = "Employee number: " + getEmployeeNo() + "\n";
        String depart = "Department: " + getDepartment() + "\n";   
        String ty = "Type: " + 
                // Type is obtained with the input file

        return line;
    }

}
