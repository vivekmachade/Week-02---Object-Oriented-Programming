import java.util.Scanner;

class CircleDetails {
    private double radius;
    private double pie;

    // Parameterized constructor
    public CircleDetails(double radius) {
        this.radius = radius;
        this.pie = 3.14; 
    }

    // Default constructor
    public CircleDetails() {
        this(1.0); // Default radius of 1.0
    }

    // Method to calculate area
    public double calculateArea() {
        return pie * radius * radius;
    }

    // Method to display information
    public void displayArea() {
        System.out.println("Circle with radius: " + radius);
        System.out.println("Area of the circle: " + calculateArea());
    }
}
class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter the radius of the Circle: ");
        double radius = input.nextDouble();

        // Create a Circle object with user-provided radius
        CircleDetails circle = new CircleDetails(radius);
        circle.displayArea();

        // Create a Circle object with default radius
        CircleDetails defaultCircle = new CircleDetails();
        System.out.println("\nDefault Circle:");
        defaultCircle.displayArea();

        input.close();
    }
}