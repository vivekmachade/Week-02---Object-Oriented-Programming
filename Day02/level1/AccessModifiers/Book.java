class BookDetails {
    public String ISBN;
    protected String title;
    private String author;

    // Constructor
    BookDetails(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Getter and Setter for author
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

class EBook extends BookDetails {
    EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    void displayDetails() {
        System.out.println("ISBN: " + ISBN + ", Title: " + title + ", Author: " + getAuthor());
    }
}

public class Book{
    public static void main(String[] args) {
        EBook ebook = new EBook("123-456-789", "Java Fundamentals", "James Gosling");
        ebook.displayDetails();
        ebook.setAuthor("Updated Author");
        ebook.displayDetails();
    }
}
