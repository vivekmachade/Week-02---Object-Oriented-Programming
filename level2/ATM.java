/*Program to Simulate an ATM
Problem Statement: Create a BankAccount class with attributes accountHolder, accountNumber, and balance. Add methods for:
Depositing money.
Withdrawing money (only if sufficient balance exists).
Displaying the current balance.
 */
import java.util.Scanner;


class Balance{
  // assinging value
  private String name ;
  private String accNum;
  static double balance;

    Balance(String name,String accNum,double balance){
      this.name = name;
      this.accNum=accNum;
      this.balance=balance;
    }
    // Method to withdreawing the amount
    void depositeAmount(double amount){
      if(amount >0){
        balance += amount;
        System.out.println("your deposite sucessful ");
      }
      else{
        System.out.println("Your deposite amount is invaild");
      }
    }
    // Method to withdreawing the amount
    void withdrawingAmount(double amount){
      if(amount > 0 && amount<balance){
        balance -= amount;
        System.out.println("Your withdrawing amount sucessful");

      }
      else{
        System.out.println("Your Withdrawing amount invaild ");
      }
    }
      // Method to display the current balance
     void balanceShow(){
      System.out.println("Your Balance is "+balance);
    }


  }


class ATM {
  public static void main (String[] args){

    Scanner input = new Scanner(System.in);
   
    // taking input for user
    System.out.println("Enter the Account holder Name : ");
    String name = input.nextLine();

    System.out.println("Enter the Account Number :");
    String accNum = input.nextLine();

    System.out.println("Enter the balance : ");
    double balance = input.nextDouble();

    Balance obj = new Balance(name,accNum,balance);


    // which operation use for bank or ATM
    while(true){
      
      System.out.println("Enter the number for operation");
      System.out.println("Enter 1 : Deposite");
      System.out.println("Enter 2 : Withdrawing ");
      System.out.println("Enter 3 : Check Balance ");
      System.out.println("Enter 4 : Exit ");
      System.out.println("Enter number which you want ");

      int i = input.nextInt();

      if(i == 1){
      System.out.println("Enter the amount for deposite : ");
      double amount = input.nextDouble();
      obj.depositeAmount(amount);
      }
      if(i == 2){
        System.out.println("Enter the amount for withdrawing ");
        double amount = input.nextDouble();
        obj.withdrawingAmount(amount);
      }
      if(i==3){
        obj.balanceShow();
      }
      if(i==4){
        break;
      }
    }


  }

 
}
  

