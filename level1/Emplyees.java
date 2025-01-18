import java.util.Scanner;

class EmpolyessDetails{

  private String name;
  private int id;
  private int salary;

  EmpolyessDetails(String name,int id, int salary){
    this.name = name;
    this.id = id;
    this.salary = salary;
  }
  //Deplay the Employees Details
  void getDetails(){
    System.out.println("Name of Employees is "+ name);
    System.out.println("Id number of Employees is "+ id);
    System.out.println("Salary of Employess is "+ salary);
  }

}

class Emplyees{
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Enter the Employees name :");
    String name = input.nextLine();

    System.out.print("Enter the Employees id :");
    int id = input.nextInt();

    System.out.print("Enter the Employees Salary :");
    int salary = input.nextInt();

    EmpolyessDetails obj = new EmpolyessDetails(name,id,salary);
    obj.getDetails();
   input.close();
  }

}