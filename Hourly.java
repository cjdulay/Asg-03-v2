public class Hourly extends Employee

{
    private double hourlyRate;
    private double hourWeek;
    private final double FORTY = 40;
    private final double OVERTIME = 1.5;

    //Constructors

    public Hourly(){
        super();
        hourlyRate = 0.0;
        hourWeek = 0.0;
    }

    public Hourly(String name, String employeeNo, String department, double hourRate, double weekHours){
        super(name, employeeNo, department, 'H');
        hourlyRate = hourRate;
        hourWeek = weekHours;
    }

    //Mutators

    public void setHourlyRate(double hr){
        hourlyRate = hr;
    }

    public void setHourWeek(double hw){
        hourWeek = hw;
    }

    //Getters

    public double getHourlyRate(){
        return hourlyRate;
    }

    public double getHourWeek(){
        return hourWeek;
    }

    //Helper Methods

    @Override public double calcWeeklySalary(){
        double wage;
        double overtime;
        double newRate;
        double add;
        
        if (hourWeek > FORTY){
            newRate = hourlyRate * OVERTIME;
            overtime = hourWeek - FORTY;
            add = newRate * overtime;
            wage = hourlyRate * FORTY;
            wage += add;
        }
        else {
            wage = hourlyRate * FORTY;
        }
        return wage;
    }

    @Override public boolean equals(Employee e){
        boolean equals;
        if (super.getEmployeeNo() == e.getEmployeeNo()){
            equals = true;
        }
        else {
            equals = false;
        }
        return equals;
    }

    @Override public String toString(){
        String line = "";
        String hourRate = "Hour rate is: " + getHourlyRate() + "\n";
        String hoursWorkedWk = "Hours worked this week: " + getHourWeek() + "\n";

        line = super.toString() + hourRate + hoursWorkedWk;

        return line;
    }

    public String writeData(){
        String data = "";
        data = super.writeData() + " " + getHourlyRate() + " " + getHourWeek() + "\n";
        return data;
    }

}
