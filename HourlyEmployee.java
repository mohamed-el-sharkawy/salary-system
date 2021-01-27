package salary_system;
public class HourlyEmployee extends Employee implements Displayable{
    private double hour_rate;
    private int number_of_hours;

    public HourlyEmployee() {
    }

    public HourlyEmployee(double hour_rate, int number_of_hours, String name, int number, String address) {
        super(name, number, address);
        this.hour_rate = hour_rate;
        this.number_of_hours = number_of_hours;
    }

    public void setHour_rate(double hour_rate) {
        this.hour_rate = hour_rate;
    }

    public void setNumber_of_hours(int number_of_hours) {
        this.number_of_hours = number_of_hours;
    }

    public double getHour_rate() {
        return hour_rate;
    }

    public int getNumber_of_hours() {
        return number_of_hours;
    }
    
    
    @Override
    public double Earning(){
        return (hour_rate * number_of_hours);
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" + "hour_rate=" + hour_rate + ", number_of_hours=" + number_of_hours + '}';
    }
    
    @Override
    public void DispalyAllDetails(){
        System.out.print(super.toString()+" ");
        System.out.println(this.toString());
    }
    public void DisplayEarning(){
        System.out.println(Earning());
    }
}
