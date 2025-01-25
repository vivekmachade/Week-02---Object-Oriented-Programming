import java.util.*;
class Bank{

  private String bankName;
  public ArrayList<Customer>customer = new ArrayList<>();

  // constructor
  Bank(String bankName){

   this.bankName = bankName;

  }
  // method for adding customer to bank
  public void addCustomer(Customer obj){

    this.customer.add(obj);

  }
// method for storing and diplay the result 
  public void getDisplay(){
    for(Customer e : customer){
      System.out.println(e.name+" is Account Holder who bank Name is "+bankName);

    }
  }


  }


class Customer{
 // customer Attributes
  public String name;
  private int accountNumber;
  private int balance;
  
  // constructor
  Customer(String name, int accountNumber,int balance){
   this.name=name;
   this.accountNumber=accountNumber;
   this.balance=balance;


  }
  // method for checking Balance
  public  void viewBalance(){
    System.out.println(accountNumber+" this Account balance is "+balance);

  }


}


class BankAndAccount {

  public static void main(String[] args) {
    
    // Attribute of class
  String name ;
  int accountNumber;
  String bankName;
  int balance;


 // creating bank object
  Bank Bankacc = new Bank("SBI");
  Bank Bankacc1 = new Bank("Bank of State");

   // creating customer object 

  Customer person1 =  new Customer("vivek Machade", 123456789 ,1000000);

  Customer person2 =  new Customer("Ritik", 12349876 ,100000);

  
  Customer person3 =  new Customer("Ram", 12348900 ,100000);


 Bankacc.addCustomer(person1);
 Bankacc1.addCustomer(person2);

 Bankacc.addCustomer(person3);

 person3.viewBalance();

 // method calling
 Bankacc.getDisplay();
 System.out.println();
 Bankacc1.getDisplay();

  
  }

}
