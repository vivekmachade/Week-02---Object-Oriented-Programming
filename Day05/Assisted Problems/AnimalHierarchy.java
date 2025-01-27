class Animal{ // Superclass 

	String name ;
	int age;
   // constructor
	Animal(String name,int age){
		this.name = name;
		this.age = age;
	}
    // method
	void makeSound(){
		System.out.println("Animal is making sound ");
	}
   
	void getProfile(){
		System.out.println("Animal name is "+name);
		System.out.println("Animal age is "+age);
	}
}

class Dog extends Animal{ // subclass of Animal
    // Taking Attribute for super class 
	Dog(String name, int age){
		super(name,age);
	}

    
	@Override  // Calling same name method using overriding
	void makeSound(){
		super.getProfile();
		System.out.println(name+" is barking ");
	}
     

}
// Hierarchy inheritance 
class Cat extends Animal{  // Subclass of Animal
     // Taking Attribute for super class
	Cat(String name,int age){
		super(name,age);
	}
	

	@Override   // Calling same name method using overriding
	void makeSound(){
		super.getProfile();
		System.out.println(name+" is meowing ");
	}

}
// Hierarchy inheritance 
class Bird extends Animal{  //Subclass of Animal
    // Taking Attribute for super class
	Bird(String name ,int age){
		super(name,age);
	}
	

	@Override   // Calling same name method using overriding
	void makeSound(){
		super.getProfile();
		System.out.println(name+" is ku ku ... ");
	}

}


class AnimalHierarchy{
public static void main(String[] args){

	Animal myDog = new Dog("ray",3); // polymorphism...
	myDog.makeSound();
	System.out.println();

	Animal myCat = new Cat("poki",5);
	myCat.makeSound();
	System.out.println();

	Animal myBird = new Bird("kai",7);
	myBird.makeSound();
	System.out.println();
}
}