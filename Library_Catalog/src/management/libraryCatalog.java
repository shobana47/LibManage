package management;

import java.util.Scanner;

	public class libraryCatalog 
	{
	    public static void main(String[] args) 
	    {
	        library library = new library();
	        Scanner scanner = new Scanner(System.in);
	        int choice;

	        do 
	        {
	            System.out.println("\nLibrary Catalog System");
	            System.out.println("1. Add a book");
	            System.out.println("2. Search for a book by title");
	            System.out.println("3. Search for books by author");
	            System.out.println("4. Display all books");
	            System.out.println("5. Borrow a book");
	            System.out.println("6. Return a book");
	            System.out.println("7. Exit");
	            System.out.print("Enter your choice: ");
	            choice = scanner.nextInt();
	            scanner.nextLine();  // consume newline

	            switch (choice) 
	            {
	                case 1:
	                    System.out.print("Enter book title: ");
	                    String title = scanner.nextLine();
	                    System.out.print("Enter book author: ");
	                    String author = scanner.nextLine();
	                    System.out.print("Enter book ISBN: ");
	                    String ISBN = scanner.nextLine();
	                    Book newBook = new Book(title, author, ISBN);
	                    library.addBook(newBook);
	                    break;
	                case 2:
	                    System.out.print("Enter the title of the book: ");
	                    title = scanner.nextLine();
	                    library.searchBookByTitle(title);
	                    break;
	                case 3:
	                    System.out.print("Enter the author of the book: ");
	                    author = scanner.nextLine();
	                    library.searchBookByAuthor(author);
	                    break;
	                case 4:
	                    library.displayAllBooks();
	                    break;
	                case 5:
	                    System.out.print("Enter the title of the book to borrow: ");
	                    title = scanner.nextLine();
	                    library.borrowBook(title);
	                    break;
	                case 6:
	                    System.out.print("Enter the title of the book to return: ");
	                    title = scanner.nextLine();
	                    library.returnBook(title);
	                    break;
	                case 7:
	                    System.out.println("Exiting the system.");
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        } 
	        while (choice != 7);

	        scanner.close();
	    }
	}
