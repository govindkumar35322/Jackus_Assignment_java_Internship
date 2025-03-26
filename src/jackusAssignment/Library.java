package jackusAssignment;

import java.util.HashMap;
import java.util.Map;


public class Library {
   private Map<String, Book> booksMap=new HashMap<>();
   
   public void addBook(Book book) {
	   if(booksMap.containsKey(book.getBookId())) {
		   System.out.println("Book with this ID already exists.");
           return;
	   }
	   booksMap.put( book.getBookId(),book);
	   System.out.println("Book added successfully.");
   }
   
   public void viewAllBooks() {
       if (booksMap.isEmpty()) {
           System.out.println("No books available.");
           return;
       }
       for (Book book : booksMap.values()) {
           System.out.println(book);
       }
     }
   public Book searchBook(String searchKey) {
       for (Book book : booksMap.values()) {
           if (book.getBookId().equals(searchKey) || book.getTitle().equalsIgnoreCase(searchKey)) {
               return book;
           }
       }
       return null;
   }
   
   public void updateBook(String bookId, String newTitle, String newAuthor, String newStatus) {
       Book book = booksMap.get(bookId);
       if (book != null) {
           book.setTitle(newTitle);
           book.setAuthor(newAuthor);
           book.setAvailabilityStatus(newStatus);
           System.out.println("Book updated successfully.");
       } else {
           System.out.println("Book not found.");
       }
   }
   
   
   public void deleteBook(String bookId) {
       if (booksMap.remove(bookId) != null) {
           System.out.println("Book deleted successfully.");
       } else {
           System.out.println("Book not found.");
       }
   }
   
   
}
   
   


