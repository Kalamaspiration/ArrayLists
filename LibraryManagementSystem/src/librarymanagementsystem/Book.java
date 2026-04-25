
package librarymanagementsystem;


public class Book {
    
    int BookID;
    
    String BookTitle;
    
    String AuthorName;
    
   String status;

    public Book(int BookID, String BookTitle, String AuthorName, String status) {
        this.BookID = BookID;
        this.BookTitle = BookTitle;
        this.AuthorName = AuthorName;
        this.status = status;
    }
    
    
    
}
