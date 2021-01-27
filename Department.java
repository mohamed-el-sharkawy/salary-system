package salary_system;
import java.util.*;
public class Department {
    private String departmentName;
    private int departmentNumber;
    private ArrayList<Employee> empList = new ArrayList<Employee>();
    public Department() {
    }

    public Department(String departmentName, int departmentNumber) {
        this.departmentName = departmentName;
        this.departmentNumber = departmentNumber;
    }
    
    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public void setDepartmentNumber(int departmentNumber) {
        this.departmentNumber = departmentNumber;
    }
    
    public void AddEmployee(Employee e){
        empList.add(e);
    }
    
    public void RemoveEmployee(int number){
        if(empList.isEmpty()){
            System.out.println("there is no employees yet !");
        }
        for(int i=0;i<empList.size();i++){
            if(empList.get(i).getNumber() == number){
                empList.remove(i);
                break;
            }
            if(i == empList.size()-1){
                System.out.println("invalid number");
            }
        }       
    }
    
    public void DisplayEarning(int n){
        if(empList.isEmpty()){
            System.out.println("there is no employees yet !");
        }
        for(int i=0;i<empList.size();i++){
            if(empList.get(i).getNumber() == n){
                if(empList.get(i) instanceof salariedEmployee){
                    ((salariedEmployee)empList.get(i)).DisplayEarning();
                }
                if(empList.get(i) instanceof HourlyEmployee){
                    ((HourlyEmployee)empList.get(i)).DisplayEarning();
                }
                if(empList.get(i) instanceof CommissionEmployee){
                    ((CommissionEmployee)empList.get(i)).DisplayEarning();
                }
                break;
            }
            if(i == empList.size()-1){
                System.out.println("invalid number");
            }
       
        }
        
    }
    
    public int GetEmployeesCount(){
        return empList.size();
    }
    
    public void printAllDate(){
        for(int i=0;i<empList.size();i++){
            if(empList.get(i) instanceof salariedEmployee){
                ((salariedEmployee)empList.get(i)).DispalyAllDetails();
            }
            if(empList.get(i) instanceof HourlyEmployee){
                ((HourlyEmployee)empList.get(i)).DispalyAllDetails();
            }
            if(empList.get(i) instanceof CommissionEmployee){
                ((CommissionEmployee)empList.get(i)).DispalyAllDetails();
            }
        }
    }
}