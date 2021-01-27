package salary_system;

public class CommissionEmployee extends Employee implements Displayable{
    private double GrossSales;
    private double CommissionRate;

    public CommissionEmployee() {
    }

    public CommissionEmployee(double GrossSales, double CommissionRate, String name, int number, String address) {
        super(name, number, address);
        this.GrossSales = GrossSales;
        this.CommissionRate = CommissionRate;
    }

    public void setGrossSales(double GrossSales) {
        this.GrossSales = GrossSales;
    }

    public void setCommissionRate(double CommissionRate) {
        this.CommissionRate = CommissionRate;
    }

    public double getGrossSales() {
        return GrossSales;
    }

    public double getCommissionRate() {
        return CommissionRate;
    }
    
    
    @Override
    public String toString() {
        return "CommissionEmployee{" + "GrossSales=" + GrossSales + ", CommissionRate=" + CommissionRate + '}';
    }
    
    @Override
    public double Earning(){
        return GrossSales * CommissionRate; 
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
