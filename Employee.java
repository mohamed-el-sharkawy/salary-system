package salary_system;
public abstract class Employee {
    private String name;
    private int number;
    private String address;

    public Employee() {
    }

    public Employee(String name, int number, String address) {
        this.name = name;
        this.number = number;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", number=" + number + ", address=" + address + '}';
    }
    
    public void DispalyAllDetails(){
        System.out.println(this.toString());
    }
    
    public abstract double Earning();
    
}
