import java.util.ArrayList;

class Book {
     public String title;
    public String author;

    // Constructor to initialize Book object
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    public void getBookDetails() {
        System.out.println("Book [Title: " + title + ", Author: " + author + "]"); 
    }
}

class Library {
    public String name;
    public ArrayList<Book> books = new ArrayList<>();

    public Library(String name) {
        this.name = name;
       
    }

    // Method to add a Book to the Library
    public void addBook(Book book) {
        this.books.add(book);
    }

    // Method to display the books in the Library
    public void displayBooks() {
        System.out.println("Library: " + name);
        for (Book book : books) {
            System.out.println(book.title);
        }
    }
}


public class LibraryAndBooks {
    public static void main(String[] args) {
        // Creating Book objects
        Book book1 = new Book("Harry Potter", "harry potter");
        Book book2 = new Book("God of War", "Kartos");
        Book book3 = new Book("Monkey king", "Sun goku");

        // Creating Library objects
        Library centeral = new Library("Central Library");
        Library local = new Library("Local Library");

        // Adding books to libraries
        centeral.addBook(book1);
        centeral.addBook(book2);

         local.addBook(book3);


         book1.getBookDetails();
         book2.getBookDetails();
         book3.getBookDetails();


         // Displaying books in the libraries
         centeral.displayBooks();

         System.out.println();

         local.displayBooks();

  
    }
}
