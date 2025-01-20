import java.util.Scanner;

 class BooksDetails {

    private String name;
    private String title;
    private int price;

    // Default Constructor
    public BooksDetails() {
        this.name = "Unknown";
        this.title = "Untitled";
        this.price = 0;
    }

    // Parameterized Constructor
    public BooksDetails(String name, String title, int price) {
        this.name = name;
        this.title = title;
        this.price = price;
    }

    // Method to display book details
    public void getDetails() {
        System.out.println("Author Name: " + name);
        System.out.println("Book Title: " + title);
        System.out.println("Price of Book: " + price);
    }
}

public class Books{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter the Author Name: ");
        String name = input.nextLine();

        System.out.print("Enter the Book Title: ");
        String title = input.nextLine();

        System.out.print("Enter the Price of the Book: ");
        int price = input.nextInt();

        // Create a Book object and display its details
        BooksDetails detail = new BooksDetails(name, title, price);
        detail.getDetails();
    }
}
