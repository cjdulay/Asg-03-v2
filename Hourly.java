public class Hourly extends Employee
{
    private double hourlyRate;
    private double hourWeek;

    Hourly(){
        
    }
    
    Hourly(String name, String employeeNo, String department, double hourRate, double weekHours){
        super(name, employeeNo, department, 'H');
        hourlyRate = hourRate;
        hourWeek = weekHours;
    }
    
    public void setHourlyRate(double hr){
        hourlyRate = hr;
    }
    
    public void setHourWeek(double hw){
        hourWeek = hw;
    }
    
    public double getHourlyRate(){
        return hourlyRate;
    }
    
    
    public double getHourWeek(){
        return hourWeek;
    }
    
    
}
