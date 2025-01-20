import java.util.Scanner;

class Mobile {
    // Attributes
    private String brand;
    private String model;
    private double price;

    // Constructor
    public Mobile(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display phone details
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + String.format("%.2f", price));
    }
}

public class MobilePhone {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of mobiles: ");
        int n = input.nextInt();
        input.nextLine(); 

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter the Brand Name of Mobile " + i + ": ");
            String brand = input.nextLine();

            System.out.println("Enter the Model Name of Mobile " + i + ": ");
            String model = input.nextLine();

            System.out.println("Enter the Price of Mobile " + i + ": ");
            double price = input.nextDouble();
            input.nextLine(); // Consume leftover newline

            Mobile phone = new Mobile(brand, model, price);

            // Display details of the phone
            System.out.println("Phone " + i + " Details:");
            phone.displayDetails();
            System.out.println();
        }

        input.close();
    }
}
