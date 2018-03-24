public class Commission extends Employee

{

    int weeksSinceEmp;
    double baseWeekSalary;
    double weekSales;
    double yearSales;
    double commissionRate;

    Commission() {
    }

    Commission(String name, String employeeNo, String department, int weeksSinceEmp, double baseWeekSalary, double yearSales, double commissionRate){

        super(name, employeeNo, department, 'C');

        this.weeksSinceEmp = weeksSinceEmp;

        this.baseWeekSalary = baseWeekSalary;

        this.yearSales = yearSales;

        this.commissionRate = commissionRate;

    }

    public void setWeeksSinceEmp(int weeks){
        weeksSinceEmp = weeks;
    }

    public void setBaseWeekSalary(double baseSalary){

        baseWeekSalary = baseSalary;

    }

    public void setWeekSales(double numWkSales){
        weekSales = numWkSales;
    }

    public void setCommissionRate(double rate){

        commissionRate = rate;

    }

    public int getWeeksSinceEmp(){
        return weeksSinceEmp;
    }

    public double getBaseWeekSalary(){

        return baseWeekSalary;

    }

    public double getWeekSales(){
        return weekSales;
    }

    public double getCommissionRate(){

        return commissionRate;

    }

    public double calcWeeklySalary(){
        double commission = weekSales * commissionRate;
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

    public String writeData(){
        String data = "";
        data = super.writeData() + " " + getWeeksSinceEmp() + " " + getBaseWeekSalary() + " " + getWeekSales() + " " + this.yearSales + " " + getCommissionRate() + "\n";
        return data;
    }

    public boolean topSeller(){

        boolean top;

        double sales = yearSales / (double)(weeksSinceEmp);

        if(sales > 1500.00){

            top = true;

        }

        else {

            top = false;

        }

        return top;

    }

}
