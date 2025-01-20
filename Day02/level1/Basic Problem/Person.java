import java.util.Scanner;


class PersonDetails {

    private String name;
    private int id;
    private int age;

    // Parameterized Constructor
    PersonDetails(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    // Copy Constructor
    PersonDetails(PersonDetails cc) {
        this.name = cc.name;
        this.id = cc.id;
        this.age = cc.age;
    }

    // Method to display person details
    void getDetails() {
        System.out.println("Name of Person: " + name);
        System.out.println("ID of Person: " + id);
        System.out.println("Age of Person: " + age);
    }
}

// Main class to execute the program
public class Person {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input from the user
        System.out.println("Enter the Person's Name:");
        String name = input.nextLine();

        System.out.println("Enter the Person's ID:");
        int id = input.nextInt();

        System.out.println("Enter the Person's Age:");
        int age = input.nextInt();

        // Using parameterized constructor
        System.out.println("\nThis is the original details:");
        PersonDetails detailPerson = new PersonDetails(name, id, age);
        detailPerson.getDetails();

        // Using copy constructor
        System.out.println("\nThis is the copied details:");
        PersonDetails detailPerson2 = new PersonDetails(detailPerson);
        detailPerson2.getDetails();
    }
}
