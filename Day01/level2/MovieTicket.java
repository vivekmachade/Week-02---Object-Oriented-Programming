import java.util.Scanner;
public class MovieTicket {
  private String movieName;
  private String seatNumber;
  private double price;

  // Constructor
  public MovieTicket(String movieName) {
      this.movieName = movieName;
      this.seatNumber = null; 
      this.price = 0.0;
  }

  // Method to book a ticket
  public void bookTicket(String seatNumber, double price) {
      if (this.seatNumber == null) {
          this.seatNumber = seatNumber;
          this.price = price;
          System.out.println("Ticket booked successfully for '" + movieName + "' at seat " + seatNumber + ".");
      } else {
          System.out.println("Seat " + this.seatNumber + " for '" + movieName + "' is already booked.");
      }
  }

  // Method to display ticket details
  public void displayTicketDetails() {
      if (seatNumber != null) {
          System.out.println("Movie: " + movieName);
          System.out.println("Seat Number: " + seatNumber);
          System.out.println("Price: " + price);
      } else {
          System.out.println("No ticket booked for '" + movieName + "'.");
      }
  }

  // Main method to demonstrate the functionality
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Enter movie name ");
    String movieName = input.nextLine();

    System.out.println("Enter the seat number ");
    String seatNumber = input.nextLine();

    System.out.println("Enter the price of movie");
    double price  = input.nextDouble();

      MovieTicket ticket = new MovieTicket(movieName);
      ticket.bookTicket(seatNumber,price); 
      ticket.displayTicketDetails(); 
     
  }
}
