
package payrollmanagement;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author GK
 */
public class PayrollManagement {

    
    public static void main(String[] args) {
       
        ArrayList<Employee>Employees = new ArrayList<Employee>();
        
        boolean emp = true;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Employee Management System");
        
        System.out.println("1. ADD EMPLOYEE");
        
        System.out.println("2.VIEW ALL EMPLOYEES");
        
        System.out.println("3. SEARCH BY EMPLOYEE ID");
        
        System.out.println("4. Calculate Net Salary");
        
        System.out.println("5. Update basic salary");
        
        System.out.println("6. Delete Employee");
        
        System.out.println("7. Exit");
        
        System.out.println("Enter the Choice");
        
        int choice = sc.nextInt();
        
        do
        {
            
        
        
        switch(choice)
        {
            
            case 1 -> {
                
                System.out.println(" EMPLOYEE DETAILS ");
                
                System.out.println("Enter the Employee ID");
                
                int i = sc.nextInt();
                
                sc.nextLine();
                
                System.out.println("Enter the Employee Name");
                
                String n = sc.nextLine();
                
                System.out.println("Enter the Department");
                
                String d = sc.nextLine();
                
                System.out.println("Enter the basic Salary");
                
                double salary = sc.nextDouble();
                
                Employees.add(new Employee(i,n,d,salary));
                
                System.out.println("Employee Added SuccessFully");
                
                
            }
            
            case 2 -> {
                
                if(Employees.isEmpty())
                {
                    System.out.println("Employee Not found");
                }
                
                else
                {
                    
                    for(Employee y : Employees)
                    {
                       y.display();
                    }
                }
                
                
                
            }
            
            case 3 -> {
                
                System.out.println("Enter the Employee ID to Search");
                
                int s = sc.nextInt();
                
                boolean f = false;
                
                for(Employee x : Employees)
                {
                    if(x.Employeeid==s)
                    {
                        x.display();
                        
                        f = true;
                        
                        break;
                    }
                }
                
                if(!f)
                {
                    System.out.println("Employee Not found");
                    
                    
                }
                
                
            }
            
            case 4 -> {
                
                System.out.println("Calculate Net Salary");
                
                System.out.println("Enter the Employee ID");
                
                int netid = sc.nextInt();
                
                boolean found = false;
                
                for(Employee z : Employees)
                {
                    
                    if(z.Employeeid==netid)
                    {
                        
                    
                    System.out.println("Net Salary " + z.Employeename + " = " + z.calculatesalary());
                    
                    found = true;
                    
                    break;
                    
                    
                    
                    }
                    

                }
                
                if(!found)
                {
                    System.out.println("Employee Not found");
                    
                    
                    
                    
                }
                
                
                
                
            }
            
            
            case 5 -> {
                
                
                System.out.println("Update basic salary");
                
                System.out.println("Enter the Employee ID to Update ");
                
                int u = sc.nextInt();
                
                boolean update = false;
                
                for(Employee b:Employees)
                {
                    if(b.Employeeid==u)
                        
                    {
                        System.out.println("Enter the Basic salary");
                        
                        b.basicsalary=sc.nextInt();
                        
                        System.out.println("Salary updated SuccessFully");
                        
                        update = true;
                        
                        break;
                    }
                }
                
                if(!update)
                {
                    System.out.println("Employee Not Found");
                }
                

            }
            
            
            case 6 -> {
                
                System.out.println("Enter the Employee ID to Delete");
                
                int d = sc.nextInt();
                
                boolean delete = false;
                
                for(int i =0;i<Employees.size();i++)
                    
                {
                    
                    if(Employees.get(i).Employeeid==d)
                    {
                        
                        Employees.remove(i);
                        
                        System.out.println("Employees Removed SuccessFully");
                        
                        delete = true;
                        
                        
                        break;
                    }
                    
                }
                
                if(!delete)
                {
                    System.out.println("Employee Not Found");
                
                    
                }
                
                
            }
            
            case 7 -> {
                
                emp =false;
                
                System.out.println("Exit");
                
                
                
            }
            
            default ->             {
                
                System.out.println("Invalid Choice Try Again");
                
            }
            
        }
        
        }while(emp);
            
            
            
            
            
            
        }
    }

