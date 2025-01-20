class BookSystem {
  private String title;
  private String author;
  private int price;
  private int availability;

  // Default Constructor
  public BookSystem() {
      title = "One Piece";
      author = "Eiichiro Oda";
      price = 899;
      availability = 4;
  }

  // Method to borrow a book
  public void borrow(int rent) {
      if (rent <= availability) {
          availability -= rent;
          System.out.println("You have borrowed " + rent + " books.");
          System.out.println("Books remaining in stock: " + availability);
      } else {
          System.out.println("Sorry, only " + availability + " books are available.");
      }
  }

  // Method to display book details
  public void displayBookDetails() {
      System.out.println("Title: " + title);
      System.out.println("Author: " + author);
      System.out.println("Price: $" + price);
      System.out.println("Availability: " + availability);
  }
}
class LibraryBookSystem {
  public static void main(String[] args) {
      // Create a BookSystem object
      BookSystem book = new BookSystem();

      // Display book details
      System.out.println("Book Details:");
      book.displayBookDetails();

      // Borrow books
      System.out.println("\nAttempting to borrow 2 books:");
      book.borrow(2);

      // Attempting to borrow more than available
      System.out.println("\nAttempting to borrow 3 books:");
      book.borrow(3);
  }
}
