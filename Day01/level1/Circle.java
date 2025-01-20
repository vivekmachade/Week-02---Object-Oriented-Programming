import java.util.Scanner;

class CircleArea{
  // Taking  radius and pie is private 
  private double radius;
  final double pie = 3.14;

  // intializing the circlearea radius 
  CircleArea(double radius){
    this.radius = radius;
  }
  //Deplay the Employees Details
  void getArea(){
   double area = pie*radius*radius;

   System.out.println("Area of circle "+ area);
  }

}

class Circle{
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Enter the radius of Circle :");
    double radius = input.nextDouble();
   
    // object of class circleArea
    CircleArea Area = new CircleArea(radius);
    Area.getArea();
   
    input.close();

  }

}