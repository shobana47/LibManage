package management;

class Book 
{
    private String title;
    private String author;
    private String ISBN;
    private boolean isAvailable;

    public Book(String title, String author, String ISBN) 
    {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.isAvailable = true;
    }

    public String getTitle() 
    {
        return title;
    }

    public String getAuthor() 
    {
        return author;
    }

    public String getISBN() 
    {
        return ISBN;
    }

    public boolean isAvailable() 
    {
        return isAvailable;
    }

    public void borrowBook() 
    {
        if (isAvailable) 
        {
            isAvailable = false;
            System.out.println("You have borrowed the book: " + title);
        } 
        else 
        {
            System.out.println("The book is currently unavailable.");
        }
    }

    public void returnBook() 
    {
        if (!isAvailable) 
        {
            isAvailable = true;
            System.out.println("You have returned the book: " + title);
        } 
        else 
        {
            System.out.println("The book was not borrowed.");
        }
    }

    @Override
    public String toString() 
    {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + ISBN + ", Available: " + (isAvailable ? "Yes" : "No");
    }
}