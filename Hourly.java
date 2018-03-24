public class Hourly extends Employee

{

    private double hourlyRate;

    private double hourWeek;

    //Constructors

    Hourly(){

    }

    Hourly(String name, String employeeNo, String department, double hourRate, double weekHours){

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

    public double calcWeeklySalary(){

        double wage = 0.0;

        double overtime = 0.0;

        double newRate = 0.0;

        double add = 0.0;

        final double FORTY = 40;

        final double OVERTIME = 1.5;

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

    public boolean equals(Employee e){

        boolean equals;

        if (super.getEmployeeNo() == e.getEmployeeNo()){
            equals = true;
        }
        else {
            equals = false;
        }
        return equals;
    }

    public String toString(){

        String line = "";

        String hourRate = "Hour rate is: " + getHourlyRate() + "\n";
        String hoursWorkedWk = "    Hours worked this week: " + getHourWeek() + "\n";
        String top = "";

        line = super.toString() + hourRate + hoursWorkedWk + top;

        return line;
    }

    public String writeData(){

        String data = "";

        data = super.writeData() + " " + getHourlyRate() + " " + getHourWeek() + "\n";

        return data;

    }

}
