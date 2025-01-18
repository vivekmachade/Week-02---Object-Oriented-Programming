import java.util.Scanner;

class Result {
    // Attributes
    private String name;
    private int roll;
    private double mark;
    private String grade;

    // Constructor
    Result(String name, int roll, double mark) {
        this.name = name;
        this.roll = roll;
        this.mark = mark;
        this.grade = calculateGrade();
    }
     // Method to calculate grade based on marks
     private String calculateGrade() {
      if (mark >= 90) {
          return "A";
      } else if (mark >= 80) {
          return "B";
      } else if (mark >= 70) {
          return "C";
      } else if (mark >= 60) {
          return "D";
      } else if (mark >= 50) {
          return "E";
      } else {
          return "F";
      }
  }

    // Method to display Student details
    public void displayDetails() {
        System.out.println("Name : " + name);
        System.out.println("Roll Number : " + roll);
        System.out.println("Mark :" + mark);
        System.out.println("Grade : "+grade);
    }
}

public class StudentResult {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
            System.out.println("Enter the Student name ");
            String name = input.nextLine();

            System.out.println("Enter the roll number ");
            int roll = input.nextInt();

            System.out.println("Enter the Student mark");
            double mark = input.nextDouble();
          

            Result  obj = new Result(name,roll,mark);
          obj.displayDetails();
        input.close();
    }
}
