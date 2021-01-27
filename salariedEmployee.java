package salary_system;

public class salariedEmployee extends Employee implements Displayable{
    private double Salary;
    private double Bonus;
    private double Deductions;

    public salariedEmployee(double Salary, double Bonus, double Deductions, String name, int number, String address) {
        super(name, number, address);
        this.Salary = Salary;
        this.Bonus = Bonus;
        this.Deductions = Deductions;
    }

    public salariedEmployee() {
    }

    public double getSalary() {
        return Salary;
    }
    
    public void setSalary(double Salary){
        this.Salary = Salary;
    }
    
    public double getBonus() {
        return Bonus;
    }

    public void setBonus(double Bonus) {
        this.Bonus = Bonus;
    }

    public double getDeductions() {
        return Deductions;
    }

    public void setDeductions(double Deductions) {
        this.Deductions = Deductions;
    }
    
    
    @Override
    public double Earning(){
        return Salary + Bonus - Deductions;
    }

    @Override
    public String toString() {
        return "salariedEmployee{" + "Salary=" + Salary + ", Bonus=" + Bonus + ", Deductions=" + Deductions + '}';
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
