import java.util.Scanner;

class Course {
  // Instance Variables
  private String courseName;
  private int duration; 
  private double fee;

  
  public static String instituteName = "Tech Institute"; 

  // Constructor to initialize course details
  public Course(String courseName, int duration, double fee) {
      this.courseName = courseName;
      this.duration = duration;
      this.fee = fee;
  }

  // Instance Method: Display course details
  public void displayCourseDetails() {
      System.out.println("Course Name: " + courseName);
      System.out.println("Duration: " + duration + " months");
      System.out.println("Fee: " + fee);
      System.out.println("Institute Name: " + instituteName); 
  }

  // Class Method: Update the institute name for all courses
  public static void updateInstituteName(String newInstituteName) {
      instituteName = newInstituteName;
  }
}

class CourseManagement{
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      // Create some course instances
      Course course1 = new Course("Java Programming", 6, 500.0);
      Course course2 = new Course("Data Science", 8, 800.0);
      

      // Display initial course details
      System.out.println("\nCourse 1 Details:");
      course1.displayCourseDetails();
      System.out.println("\nCourse 2 Details:");
      course2.displayCourseDetails();
    

      // Update the institute name
      System.out.print("\nEnter new Institute Name: ");
      String newInstituteName = input.nextLine();
      Course.updateInstituteName(newInstituteName);

      // Display updated course details
      System.out.println("\nCourse 1 Details:");
      course1.displayCourseDetails();
      System.out.println("\nCourse 2 Details:");
      course2.displayCourseDetails();
     

      input.close();
  }
}
