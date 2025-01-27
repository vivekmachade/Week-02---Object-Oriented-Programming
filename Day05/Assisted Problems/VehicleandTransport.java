// super class
class Vehicles{
   // Attribute of Vehicles class
	int maxSpeed;
	String fuelType;

   // constructor
	Vehicles(String fuelType,int maxSpeed){
		this.maxSpeed = maxSpeed;
		this.fuelType = fuelType;

	}

   // method for display information
	void displayInfo(){
		System.out.println("The max speed of vehicles is "+maxSpeed);
		System.out.println("The fuel types of "+ fuelType);
	}

}
// subclass of vehicles class
class Car extends Vehicles {

	int seatCapacity;

	// constructor
   Car(String fuelType,int maxSpeed,int seatCapacity) {
	   super(fuelType, maxSpeed);
	   this.seatCapacity = seatCapacity;

   }
   @Override // calling the same name method using override
	void displayInfo(){
	   super.displayInfo();
	   System.out.println("the totol seat Capacity of this vehicle is "+seatCapacity);
   }

}
// subclass of vehicle class
class Truck extends Vehicles{
	int seatCapacity;

	// constructor
	Truck(String fuelType,int maxSpeed,int seatCapacity) {
		super(fuelType, maxSpeed);
		this.seatCapacity = seatCapacity;
	}
	@Override // calling the same name method using override
	void displayInfo(){
		super.displayInfo();
		System.out.println("the totol seat Capacity of this vehicle is "+seatCapacity);
	}

}
// subclass of vehicles class
class Motorcycle extends Vehicles{
	int seatCapacity;
	// constructor
	Motorcycle(String fuelType,int maxSpeed,int seatCapacity) {
		super(fuelType, maxSpeed);
		this.seatCapacity = seatCapacity;
	}
	@Override // calling the same name method using override
	void displayInfo(){
		super.displayInfo();
		System.out.println("the totol seat Capacity of this vehicle is "+seatCapacity);
	}


}

class VehicleandTransport {
	public static void main(String[] args){
        // creating object for calling class
		Vehicles myCar = new Car("petrol",120,4);
		Vehicles myTruck = new Truck("pertrol",130,10);
        Vehicles myMotorcycle  = new Motorcycle("Diesal",150,2);

		// storing the object in array
		Vehicles[] arr ={myCar,myTruck,myMotorcycle};

		// calling array object using for loop
		for(int i=0; i<arr.length ; i++){

			System.out.println();
			arr[i].displayInfo();

		}



//		System.out.println();
//		myCar.displayInfo();;
//		System.out.println();
//
//		myTruck.displayInfo();
//		System.out.println();
//
//		myMotorcycle.displayInfo();
//		System.out.println();

	}
}
