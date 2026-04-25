
package payrollmanagement;


public class Employee {
    
    int Employeeid ;
    
    String Employeename;
    
    String Department;
    
    double basicsalary;

    public Employee(int Employeeid, String Employeename, String Department, double basicsalary) {
        this.Employeeid = Employeeid;
        this.Employeename = Employeename;
        this.Department = Department;
        this.basicsalary = basicsalary;
    }
    
    
    public double calculatesalary()
    {
        double HRA = 0.20 * basicsalary;
        
        double DA = 0.10 * basicsalary;
        
        double PF = 0.05* basicsalary;
        
        return basicsalary + HRA + DA+ PF;
        
        
    }
    
    void display()
    {
        
        System.out.println("Employee ID" + Employeeid);
        
        System.out.println("Employee Name " + Employeename);
        
        System.out.println("Department " + Department);
        
        System.out.println("BASIC SALARY " + basicsalary);
    }
    
    
}
