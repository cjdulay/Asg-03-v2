public class Salary extends Employee
{
	public double yearSal;

	Salary(){
	}

	Salary(String name, String employeeNo, String department, double yearSalary){
		super(name, employeeNo, department, 'S');
		yearSal = yearSalary;
	}

	public void setYearSal(double yearlySal){
		yearSal = yearlySal
	}

	public double getYearSal(){
		return yearSal;
	}

	public double calcWeeklySalary(){

	}

	public boolean equals (Employee e){

	}

	public String toString(){

	}

	public void writeDate(){
		
	}
}
