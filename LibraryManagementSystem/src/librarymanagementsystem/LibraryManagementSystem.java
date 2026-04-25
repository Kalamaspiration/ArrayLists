
package librarymanagementsystem;


import java.util.Scanner;

import java.util.ArrayList;

public class LibraryManagementSystem {
    
    

    
    public static void main(String[] args) {
        
        
        ArrayList<Book>Books = new ArrayList<Book>();
        
        boolean b = true;
        
        Scanner sc = new Scanner(System.in);
        
        do
        {
            
            System.out.println("1.ADD BOOK");
            
            System.out.println("2.VIEW ALL BOOKS");
            
            System.out.println("3.Search BookBy ID");
            
            System.out.println("4. ISSUE BOOK");
            
            System.out.println("5.Return Book");
            
            System.out.println("6.Delete Book");
            
            System.out.println("7.Exit");
            
            System.out.println("Enter the choice");
            
            int choice = sc.nextInt();
            
            switch(choice)
            {
                
                case 1 -> {
                    System.out.println("Enter the Book ID");
                    
                    int id = sc.nextInt();
                    
                    sc.nextLine();
                    
                    boolean d = false;
                    
                    for(Book k : Books)
                    {
                        if(k.BookID==id)
                            
                        {
                            
                            d = true;
                            
                            break;
                            
                        }
                    }
                    
                    if(d)
                    {
                        
                        System.out.println("Book ID Already Exists ! Try Another ID");
                        
                    }
                    
                    else
                    {
                        
                    
                    
                    System.out.println("Enter the Book Title");
                    
                    String title = sc.nextLine();
                    
                    System.out.println("Enter the Author name");
                    
                    String author = sc.nextLine();
                    
                    Books.add(new Book(id,title,author,"Available"));
   
                }
                    
   
            }
                
                case 2 -> {
                    
                    if(Books.isEmpty())
                        
                    {
                        System.out.println("No Books Found");
                        
                        
                    }
                    
                    else
                    {
                        
                        for(Book k : Books)
                        {
                            System.out.println("BOOK ID" + k.BookID);
                            
                            System.out.println("Book Title" + k.BookTitle);
                            
                            System.out.println("Book Author Name " + k.AuthorName);
                            
                            System.out.println("Status : " + k.status);
                            
                        }
                    }
                    
                }
                
                case 3 -> {
                    
                    System.out.println("Enter the Book ID Want to search");
                    
                    int i = sc.nextInt();
                    
                    boolean found = false;
                    
                    for(Book o :Books)
                    {
                        
                        if(o.BookID==i)
                        {
                            
                            System.out.println("Book ID" + o.BookID);
                            
                            System.out.println("Book Title"+ o.BookTitle);
                            
                            System.out.println("Book Author Name" + o.AuthorName);
                            
                            System.out.println("Status of Book " + o.status);
                            
                            found = true;
                            
                            break;
                            
                        }
                        
                        
                    }
                    
                    if(!found)
                    {
                        System.out.println("Book Not found");
                    }
                    
                    
                }
                
                case 4 -> {
                    
                    System.out.println("Enter the Book ID to Issue");
                    
                    int issue = sc.nextInt();
                    
                    boolean found = false;
                    
                    for(Book s :Books)
                        
                    {
                        
                        if(s.BookID==issue)
                        {
                            
                            found = true;
                        }
                        
                        if(s.status.equals("Issued"))
                        {
                            System.out.println("Book is Already Issued");
                        }
                        
                        else
                        {
                            
                            s.status="Issued";
                            
                            System.out.println("Book Issued SuccessFully");
                        }
                        
                        break;
                    }
                    
                    if(!found)
                    {
                        System.out.println("Book Not found");
                    }
                    
                    
                    
                    
                    
                }
                
                case 5 -> {
                    
                    System.out.println("Enter the Book Id to return");
                    
                    int r = sc.nextInt();
                    
                    boolean found = false;
                    
                    for(Book x : Books)
                        
                    {
                        
                        if(x.BookID==r)
                            
                        {
                            
                            found = true;
                            
                        }
                        
                        if(x.status.equals("Available"))
                            
                        {
                            System.out.println("Book is Available ");
                            
                            
                        }
                        
                        else
                        {
                            
                            x.status="Available";
                            System.out.println("Book Returned SuccessFully");
                        }
                        
                        break;
                        
                    }
                    
                    if(!found)
                    {
                        System.out.println("Book Not found");
                    }
                    
                    
                    
                    
                }
                
                case 6 -> {
                    
                    System.out.println("Delete book from array list");
                    
                    System.out.println("Enter the Book ID to Delete");
                    
                    int d = sc.nextInt();
                    
                    boolean found = false;
                    
                    for(Book z : Books)
                    {
                        if(z.BookID==d)
                        {
                            Books.remove(z);
                            
                            found = true;
                            
                            System.out.println("Book Deleted SuccessFully");
                            
                            break;
                            
                            
                        }
                        
                        
                    }
                    
                    if(!found)
                    {
                        System.out.println("Book Not found");
                    }
                    
                    
                    
                    
                    
                }
                
                
                
                case 7 -> {
                    
                    b = false;
                    
                    System.out.println("Exit");
                    
                    
                    
                }
                
                default -> {
                    
                    System.out.println("Invalid Choice Try Again");
                }
                    
                }
                
                
        }while(b);
        
        
    }
    
}
