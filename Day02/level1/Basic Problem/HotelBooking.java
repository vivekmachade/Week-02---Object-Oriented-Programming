import java.util.Scanner;


class Hotel{

    private String guestName;
    private String roomType;
    private int night;

    // Default Constructor
    Hotel() {
        this.guestName = "Unnamed";
        this.roomType = "Unknown";
        this.night = 0;
    }

    // Parameterized Constructor
    Hotel(String guestName, String roomType, int night) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.night = night;
    }

    // Copy Constructor
    Hotel(Hotel cc) {
        this.guestName = cc.guestName;
        this.roomType = cc.roomType;
        this.night = cc.night;
    }

    // Method to display booking details
    void getBookingDetails() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Number of Nights: " + night);
    }
}


public class HotelBooking {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking input from the user
        System.out.println("Enter the Guest Name:");
        String guestName = input.nextLine();

        System.out.println("Enter the Room Type:");
        String roomType = input.nextLine();

        System.out.println("Enter How Many Nights to Stay:");
        int night = input.nextInt();

        // Calling parameterized constructor
        System.out.println("\nThis is the original booking details:");
        Hotel booked = new Hotel(guestName, roomType, night);
        booked.getBookingDetails();

        // Calling copy constructor
        System.out.println("\nThis is the copied booking details:");
        Hotel bookedCopy = new Hotel(booked);
        bookedCopy.getBookingDetails();
    }
}
