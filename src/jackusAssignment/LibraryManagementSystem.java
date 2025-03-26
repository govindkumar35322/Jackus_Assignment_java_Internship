package jackusAssignment;

import java.util.Scanner;

public class LibraryManagementSystem {

	public static void main(String[] args) {
		Library library=new Library();
		Scanner scanner = new Scanner(System.in);
        
		 while (true) {
	            System.out.println("\nLibrary Management System");
	            System.out.println("1. Add Book");
	            System.out.println("2. View All Books");
	            System.out.println("3. Search Book");
	            System.out.println("4. Update Book Details");
	            System.out.println("5. Delete Book");
	            System.out.println("6. Exit");
	            System.out.print("Choose an option: ");
	            
	            int choice = scanner.nextInt();
	            scanner.nextLine(); //Consume new Line
	            
	            
	            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter Genre: ");
                    String genre = scanner.nextLine();
                    System.out.print("Enter Availability (Available/Checked Out): ");
                    String status = scanner.nextLine();
                    library.addBook(new Book(id, title, author, genre, status));
                    break;
                case 2:
                    library.viewAllBooks();
                    break;
                case 3:
                    System.out.print("Enter Book ID or Title: ");
                    String searchKey = scanner.nextLine();
                    Book book = library.searchBook(searchKey);
                    System.out.println(book != null ? book : "Book not found.");
                    break;
                case 4:
                    System.out.print("Enter Book ID to update: ");
                    String updateId = scanner.nextLine();
                    System.out.print("Enter New Title: ");
                    String newTitle = scanner.nextLine();
                    System.out.print("Enter New Author: ");
                    String newAuthor = scanner.nextLine();
                    System.out.print("Enter New Availability (Available/Checked Out): ");
                    String newStatus = scanner.nextLine();
                    library.updateBook(updateId, newTitle, newAuthor, newStatus);
                    break;
                case 5:
                    System.out.print("Enter Book ID to delete: ");
                    String deleteId = scanner.nextLine();
                    library.deleteBook(deleteId);
                    break;
                case 6:
                    System.out.println("Exiting system.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }


	}


