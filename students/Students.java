
package students;

import java.util.Scanner;

import java.util.ArrayList;


public class Students {
    
    
    int rollno;
    
    String name;
    
    int age;
    
    String course;
    
    int marks;
    
    Students(int rollno,String name,int age,String course,int marks)
            
    {
        
        this.rollno=rollno;
        
        this.name=name;
        
        this.age=age;
        
        this.course= course;
        
        this.marks=marks;
    }
    
    

    
    public static void main(String[] args) {
        
        System.out.println("=============================================================================");
        
        boolean st = true;
        
        System.out.println("Student Management System");
        
        ArrayList<Students>list = new ArrayList<>();
        
        Scanner sc = new Scanner(System.in);
        
        
        do
        {
            
            System.out.println("**********************************MENU DRIVEN*******************************************");
            
            System.out.println("1.ADD STUDENT");
            
            System.out.println("2.VIEW ALL STUDENTS");
            
            System.out.println("3.SEARCH");
            
            System.out.println("4.UPDATE");
            
            System.out.println("5.DELETE");
            
            System.out.println("6.EXIT");
            
            int choice = sc.nextInt();
            
            switch(choice)
                
            {
                
                case 1 -> {
                    
               System.out.println("Enter the roll no");

                int roll = sc.nextInt();
                
                sc.nextLine();

                System.out.println("Enter the Name");

                String Name = sc.nextLine();

                System.out.println("Enter the age");

                int a = sc.nextInt();
                
                sc.nextLine();

                System.out.println("Enter the Course");

                String c = sc.nextLine();

                System.out.println("Enter the marks");

                int m = sc.nextInt();
                
                sc.nextLine();

                Students s = new Students(roll,Name,a,c,m);

                list.add(s);
                
                System.out.println("Students Added Successfully");
                
                
                
                }
                
                case 2 -> {
                    
                    System.out.println("Students Details");
                    
                    for(Students stu : list)
                    {
                        
                        System.out.println("RollNo" + stu.rollno+ "Name"  + stu.name+ "age" + stu.age+ "course" + stu.course+ "marks"+ stu.marks);
                        
                        break;
                    }
                    
                        
                    }
                
                case 3 -> {
                    
                    System.out.println("Search");
                    
                    System.out.println("Enter the roll no to search");
                    
                    int r = sc.nextInt();
                    
                    boolean found = false;
                    
                    for(Students stu:list)
                        
                    {
                        
                            if(stu.rollno==r)

                            {
                                System.out.println("Student Found");

                                System.out.println(" ROLL NO  " + stu.rollno
                                        + "Name" + stu.name
                                        + "Age" + stu.age
                                        + "Course" + stu.course
                                        + "Marks" + stu.marks);
                                
                                found = true;
                    
                                   

                            }
                        
                   
                       
                     
                        
                    }
                    
                    if(!found)
                        
                    {
                        
                        System.out.println("Students Details not found");
                        
                        
                    }
                    
                    
                    
                }
                
                
                case 4 -> {
                    
                    System.out.println("Enter the roll no to update");
                    
                    int u = sc.nextInt();
                    
                    boolean Try = false;
                    
                    for(Students stu :list)
                    {
                        if(stu.rollno==u)
                            
                        {
                            
                            System.out.println("Enter the roll no");
                            
                            stu.rollno=sc.nextInt();
                            
                            System.out.println("Enter the Name");
                            
                            stu.name=sc.nextLine();
                            
                            System.out.println("Enter the age");
                            
                            stu.age=sc.nextInt();
                            
                            System.out.println("Enter the course");
                            
                            stu.course=sc.nextLine();
                            
                            System.out.println("Enter the marks");
                            
                            stu.marks=sc.nextInt();
                            
                            Try = true;
                            
                            break;
                        }
                    }
                    
                    if(!Try)
                    {
                        System.out.println("Student Not Found");
                    }
                    
                }
                
                
                case 5 -> {
                    
                    System.out.println("Enter the rollno want to delete");
                    
                    int d = sc.nextInt();
                    
                    for(Students stu :list)
                    {
                        
                        if(stu.rollno==d)
                            
                        {
                            list.remove(stu);
                            
                            System.out.println("Students Details Deleted SuccessFully");
                            
                            
                        }
                        
                        
                    }
                    
                    
                    
                    
                    
                }
                
                case 6 -> {
                    
                    st=false;
                    
                    System.out.println("Exiting");
                    
                    
                }
                
                default -> {
                    
                    System.out.println("Invalid Choice Try Again");
                    
                    break;
                }
                    
                    
                }
                    
   
        
    }while(st);
        
    }
    
    
}

    

