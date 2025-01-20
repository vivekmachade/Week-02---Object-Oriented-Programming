
import java.util.Scanner;

class Product {
  // Instance Variables
  private String productName;
  private double price;

 
  public static int total = 0;

  // Constructor to initialize product details
  public Product(String productName, double price) {
      this.productName = productName;
      this.price = price;
      total++; 
  }

  // Instance Method: Display product details
  public void displayProductDetails() {
      System.out.println("Product Name: " + productName);
      System.out.println("Price: $" + price);
  }

  // Class Method: Display total products created
  public static void displayTotalProducts() {
      System.out.println("Total Products in Inventory: " + total);
  }
}

public class ProductSystem{
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      // Creating product instances
      Product product1 = new Product("Laptop", 899.99);
    
      // Displaying product details
      System.out.println("Product 1 Details:");
      product1.displayProductDetails();
    
      // Display total products creates
      Product.displayTotalProducts();

      input.close();
  }
}