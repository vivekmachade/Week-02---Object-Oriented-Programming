// Base Class
class Course {
    // Attributes
    String courseName;
    int duration;

    // Constructor
    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    // Method to display course details
    void displayCourseDetails() {

        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " hours");
    }
}

// Subclass OnlineCourse
class OnlineCourse extends Course {
    // Additional attributes
    String platform;
    boolean isRecorded;

    // Constructor
    OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    void displayCourseDetails() {
        super.displayCourseDetails();
        System.out.println("Platform: " + platform);
        System.out.println("Is Recorded: " + (isRecorded));
    }
}

// Subclass PaidOnlineCourse
class PaidOnlineCourse extends OnlineCourse {
    // Additional attributes
    double fee;
    double discount; // as a percentage

    // Constructor
    PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    @Override
    void displayCourseDetails() {
        super.displayCourseDetails();
        System.out.println("Fee: " + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Discounted Price: " + calculateDiscountedPrice());
    }

    // Method to calculate discounted price
    double calculateDiscountedPrice() {
        return fee - (fee * (discount / 100));
    }
}

// Main Class
public class EducationalCourse {
    public static void main(String[] args) {
        // Creating objects
        Course basicCourse = new Course("Basic Programming", 40);
        OnlineCourse onlineCourse = new OnlineCourse("Advanced Programming", 50, "Udemy", true);
        PaidOnlineCourse paidCourse = new PaidOnlineCourse("Full-Stack Development", 100, "Coursera", true, 500.0, 20.0);

        // Displaying course details
        System.out.println("Basic Course:");
        basicCourse.displayCourseDetails();
        System.out.println();

        System.out.println("Online Course:");
        onlineCourse.displayCourseDetails();
        System.out.println();

        System.out.println("Paid Online Course:");
        paidCourse.displayCourseDetails();
    }
}
