package management;

import java.util.ArrayList;

class library 
{
    private ArrayList<Book> books;

    public library() 
    {
        books = new ArrayList<>();
    }

    public void addBook(Book book) 
    {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    public void searchBookByTitle(String title) 
    {
        for (Book book : books) 
        {
            if (book.getTitle().equalsIgnoreCase(title)) 
            {
                System.out.println(book);
                return;
            }
        }
        System.out.println("Book with title '" + title + "' not found.");
    }

    public void searchBookByAuthor(String author) 
    {
        boolean found = false;
        for (Book book : books) 
        {
            if (book.getAuthor().equalsIgnoreCase(author)) 
            {
                System.out.println(book);
                found = true;
            }
        }
        if (!found) 
        {
            System.out.println("No books found by author '" + author + "'.");
        }
    }

    public void displayAllBooks() 
    {
        if (books.isEmpty()) 
        {
            System.out.println("No books available in the library.");
        } 
        else 
        {
            for (Book book : books) 
            {
                System.out.println(book);
            }
        }
    }

    public void borrowBook(String title) 
    {
        for (Book book : books) 
        {
            if (book.getTitle().equalsIgnoreCase(title)) 
            {
                book.borrowBook();
                return;
            }
        }
        System.out.println("Book with title '" + title + "' not found.");
    }

    public void returnBook(String title) 
    {
        for (Book book : books) 
        {
            if (book.getTitle().equalsIgnoreCase(title)) 
            {
                book.returnBook();
                return;
            }
        }
        System.out.println("Book with title '" + title + "' not found.");
    }
}