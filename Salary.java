public class Salary extends Employee
{
    private double yearSal;
    private final int YEARWEEKS = 52;

    public Salary() {
        super();
        yearSal = 0.0;
    }

    public Salary(String name, String employeeNo, String department, double yearSalary){
        super(name, employeeNo, department, 'S');
        yearSal = yearSalary;
    }

    // Setters
    public void setYearSal(double yearlySal){
        yearSal = yearlySal;
    }

    //Getters
    public double getYearSal(){
        return yearSal;
    }

    //Helper Methods
    @Override public double calcWeeklySalary(){
        double weekSal = getYearSal() / YEARWEEKS;
        return weekSal;
    }

    @Override public String toString(){
        String line = "";
        String ySal = "Yearly Salary: " + getYearSal() + "\n";
        line = 	super.toString() + ySal;
        return line;
    }
    
    public String writeData(){
        String data = "";
        data = super.writeData() + " " + getYearSal() + "\n";
        return data;
    }
}
