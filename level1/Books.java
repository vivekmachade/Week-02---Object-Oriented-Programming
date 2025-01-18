/*
* Program to Handle Book Details
Problem Statement: Write a program to create a Book class with attributes title,
*  author, and price. Add a method to display the book details.*/

import java.util.Scanner;

class HandleBooksDetails{

    private String name;
    private String title;
    private int price;

    // Constructor to initialize book detail
    HandleBooksDetails(String name,String title, int price){
        this.name = name;
        this.title = title;
        this.price = price;
    }
    // Method to display book details
    void getDetails(){
        System.out.println("Author name "+ name);
        System.out.println("Book title is  "+ title);
        System.out.println("Price of books "+ price);
    }

}

class Books{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Author name :");
        String name = input.nextLine();

        System.out.print("Enter the title of books :");
        String title = input.nextLine();

        System.out.print("Enter the price of books :");
        int price = input.nextInt();

        // Create a Book object and display details
       HandleBooksDetails Detail = new HandleBooksDetails(name, title, price);
        Detail.getDetails();
    }

}