public class Hourly extends Employee
{
    private double hourlyRate;
    private double hourWeek;

    Hourly(){
        
    }
    
    Hourly(double hourRate, double weekHours){
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
