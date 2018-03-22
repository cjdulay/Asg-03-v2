public class Employee
{
    protected String name;
    protected String employeeNo;
    protected String department;
    protected char type;

    Employee(){
    }

    Employee (String nm, String empNo, String dep, char tp){
        name = nm;
        employeeNo = empNo;
        department = dep;
        type = tp;
    }

    public void setName(String nm){
        name = nm;
    }

    public void setEmpl(String empNo){
        employeeNo = empNo;
    }

    public void setDepartment(String dep){
        department = dep;
    }

    public String getName(){
        return name;
    }

    public String getEmployeeNo(){
        return employeeNo;
    }
    
    public String getDepartment(){
        return department;
    }

    public double calcWeeklySalary(){
    
        
    
    }
    
}
