// super class
class Device{
    // Attribute of this class
    String status;
    int id;

    // constructor
    Device(String status,int id){
        this.id = id;
        this.status= status;
    }

    // method for display  Status information
    void displayStatus(){
        System.out.println();
        System.out.println("Id : "+id);
        System.out.println("Status  : "+status);
    }

}
// class Author is child class of book class
class Thermostate extends Device{

    // Attribute of this class
    int temperatureSetting;

    // constructure
    Thermostate(String status,int id,int temperatureSetting){
        super(status,id);
        this.temperatureSetting=temperatureSetting;
    }
    // displaystatus method is same to super class we use override to call this same method
    @Override
    void displayStatus(){
        super.displayStatus();
        System.out.println("Temperature Setting  : "+temperatureSetting);

        System.out.println();

    }
}




class SmartHome{
    public static void main (String[] args){

        // creating object for class
        Device deviceStatus = new Thermostate("cool",1234,23);
        Device deviceStatus2 = new Thermostate("good",124,32);

        deviceStatus2.displayStatus();
        deviceStatus.displayStatus();

    }
}
