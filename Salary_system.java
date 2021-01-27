package salary_system;
import java.util.*;
public class Salary_system {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Department dep;
        String name;
        int number;
        System.out.println("Please , Enter Department name");
        name = in.nextLine();
        System.out.println("Please , Enter Department number");
        number = in.nextInt();
        dep = new Department(name,number);
        
        int choose = 0;
        while(choose!=6){
            System.out.println("Choose the number of the operation you want to apply");
            System.out.println("1 : Add employee");
            System.out.println("2 : Remove employee");
            System.out.println("3 : Get number of employees");
            System.out.println("4 : Get all employees' data");
            System.out.println("5 : Get earning employee earning");
            System.out.println("6 : Exit");
            choose = in.nextInt();
            switch (choose){
                case 1 :
                    String ename;
                    String a;
                    System.out.println("Enter the epmployee name");                  
                    in.nextLine();
                    ename = in.nextLine();
                    System.out.println("Enter the employee address ");
                    a = in.nextLine();
                    System.out.println("Choose the Employee type");
                    System.out.println("1 : salaried employee ");
                    System.out.println("2 : hourly employee ");
                    System.out.println("3 : commission employee ");
                    int ch = in.nextInt();
                        switch (ch){
                            case 1:
                                salariedEmployee se;
                                double s;//salary
                                double b;//bonus
                                double d;//deductions
                                System.out.println("Enter employee salary");
                                s = in.nextDouble();
                                System.out.println("Enter employee bonus");
                                b = in.nextDouble();
                                System.out.println("Enter employee deductions");
                                d = in.nextDouble();
                                se = new salariedEmployee(s,b,d,ename,dep.GetEmployeesCount()+1,a);
                                dep.AddEmployee(se);
                                System.out.println("_________________________");
                                System.out.println("the employee number is "+dep.GetEmployeesCount());
                                System.out.println("_________________________");
                                break;  
                            case 2:
                                HourlyEmployee he;
                                double hr;//hour_rate
                                int nh;//number of hours
                                System.out.println("Enter employee hour_rate");
                                hr = in.nextDouble();
                                System.out.println("Enter number of hours worked by the employee");
                                nh = in.nextInt();
                                he = new HourlyEmployee(hr,nh,ename,dep.GetEmployeesCount()+1,a);
                                dep.AddEmployee(he);
                                System.out.println("_________________________");
                                System.out.println("the employee number is "+dep.GetEmployeesCount());
                                System.out.println("_________________________");
                                break;
                            case 3:
                                CommissionEmployee ce;
                                double gs;//gross sales
                                double cr;//commission rate
                                System.out.println("Enter employee gross sales");
                                gs = in.nextDouble();
                                System.out.println("Enter employee coomission rate");
                                cr = in.nextDouble();
                                ce = new CommissionEmployee(gs,cr,ename,dep.GetEmployeesCount()+1,a);
                                dep.AddEmployee(ce);
                                System.out.println("_________________________");
                                System.out.println("the employee number is "+dep.GetEmployeesCount());
                                System.out.println("_________________________");
                                break;
                            default:
                                System.out.println("invaild number , try again");
                        }
                        
                    break;
                case 2:
                    System.out.println("Enter employee number");
                    int nm = in.nextInt();
                    dep.RemoveEmployee(nm);
                    break;
                case 3:
                    System.out.println("the number of employees is "+dep.GetEmployeesCount());
                    break;
                case 4:
                    dep.printAllDate();
                    break;
                case 5:
                    System.out.println("Enter the employee number");
                    int enm = in.nextInt();
                    dep.DisplayEarning(enm);
                    break;
                case 6:
                    break;
                default:
                    System.out.println("invalid number , try again");
            }
        }
    }
}
