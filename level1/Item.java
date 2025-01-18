
import java.util.Scanner;

class TrackItem{

private String itemCode;
private String itemName;
private double price;
private  int quantity;

// Assigning the value
TrackItem(String itemCode,String itemName,double price,int quantity){

    this.itemCode = itemCode;
    this.itemName = itemName;
    this.price = price;
    this.quantity=quantity;
}
// display result and total price
   void getTotalprice(){
       System.out.println("item code is "+itemCode);
       System.out.println("item name is "+itemName);
       System.out.println("item price is "+price);
       System.out.println("item quantity is "+quantity);
       System.out.println("the total price of item"+ price*quantity);


   }

}

class Item
{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        // taking input for user
        System.out.println("Enter the itemCode ");
            String itemCode = input.nextLine();

        System.out.println("Enter the itemName ");
            String itemName = input.nextLine();

        System.out.println("Enter the item price ");
            double price = input.nextDouble();

        System.out.println("Enter the Quantity of item ");
            int quantity = input.nextInt();

            // making object and constraction
            TrackItem itemprice = new TrackItem(itemCode,itemName,price,quantity);
            itemprice.getTotalprice();
    }

}
