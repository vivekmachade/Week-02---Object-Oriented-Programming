import java.util.Scanner;

class CarRental {
  private String customerName;
  private String carModel;
  private int rentalDays;
  private  double CPD = 50.0; 

  // Default Constructor
  public CarRental() {
      this.customerName = "Unknown";
      this.carModel = "Unknown";
      this.rentalDays = 0;
  }

  // Parameterized Constructor
  public CarRental(String customerName, String carModel, int rentalDays) {
      this.customerName = customerName;
      this.carModel = carModel;
      this.rentalDays = rentalDays;
  }

  // Method to calculate total rental cost
  public double calculateTotalCost() {
      return rentalDays * CPD;
  }

  // Method to display rental details
  public void displayRentalDetails() {
      System.out.println("Customer Name: " + customerName);
      System.out.println("Car Model: " + carModel);
      System.out.println("Rental Days: " + rentalDays);
      System.out.println("Total Cost: $" + calculateTotalCost());
  }
}

 class CarRentalSystem {
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      // Taking customer input for rental details
      System.out.print("Enter Customer Name: ");
      String customerName = input.nextLine();

      System.out.print("Enter Car Model: ");
      String carModel = input.nextLine();

      System.out.print("Enter Rental Days: ");
      int rentalDays = input.nextInt();

      // Creating a CarRental object with user input
      CarRental rental = new CarRental(customerName, carModel, rentalDays);

      // Display rental details
      rental.displayRentalDetails();

      input.close();
  }
}