public class Commission extends Employee
{
	double weeksSinceEmp;
	double baseWeekSalary;
	int weekSales;
	int yearSales;
	double commissionRate;

	Commission(){
	}

	Commission(String name, String employeeNo, String department, double weeksSinceEmp, double baseWeekSalary, int weekSales, int yearSales, double commissionRate){
		super(name, employeeNo, department, 'C');
		this.weeksSinceEmp = weeksSinceEmp;
		this.baseWeekSalary = baseWeekSalary;
		this.weekSales = weekSales;
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
/*
	public double calcWeeklySalary(){

	}

	public boolean equals (Employee e){

	}

	public String toString(){

	}

	public void writeDate(){

	}

	public boolean topSeller(){

	}
*/
}
