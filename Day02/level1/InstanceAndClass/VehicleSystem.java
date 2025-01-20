import java.util.Scanner;
class Vehicle {
  // Instance Variables
  private String ownerName;
  private String vehicleType;

  // Class Variable (Shared among all vehicles)
  public static double registrationFee = 200.0; 

  // Constructor to initialize vehicle details
  public Vehicle(String ownerName, String vehicleType) {
      this.ownerName = ownerName;
      this.vehicleType = vehicleType;
  }

  // Instance Method: Display vehicle details
  public void displayVehicleDetails() {
      System.out.println("Owner Name: " + ownerName);
      System.out.println("Vehicle Type: " + vehicleType);
      System.out.println("Registration Fee: $" + registrationFee);
  }

  // Class Method: Update the registration fee for all vehicles
  public static void updateRegistrationFee(double newFee) {
      registrationFee = newFee;
  }
}
class VehicleSystem {
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      // Create some vehicle instances
      Vehicle vehicle1 = new Vehicle("John Doe", "Car");
    

      // Display initial vehicle details

      System.out.println("\nVehicle 1 Details:");
      vehicle1.displayVehicleDetails();
     

      // Update the registration fee
      System.out.print("\nEnter new Registration Fee: ");
      double newFee = input.nextDouble();
      Vehicle.updateRegistrationFee(newFee);

      // Display updated vehicle details
    
      System.out.println("\nVehicle 1 Details:");
      vehicle1.displayVehicleDetails();
      
      input.close();
  }
}