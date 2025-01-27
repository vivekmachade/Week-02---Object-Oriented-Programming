class Employee{ // super class

  String name;
  String id ;
  int salary;
    // constructor
    public Employee(String name, String id,int salary) {
     this.name = name;
	 this.id = id;
	 this.salary = salary;

    }
    // method for display detail of employee
    void displayDetails(){
		System.out.println();
		System.out.println("Name of Employee is "+name);
		System.out.println("Id of Employee is "+id);
		System.out.println("Salary of Employee is "+salary);
	}

  
}
class Manager extends Employee{  // sub class of Employee

    int teamSize ;
	// constructor 
	Manager(String name,String id ,int salary, int teamSize){ 
	   super(name,id,salary); // super keyword invoke the parent class attribute
	   this.teamSize = teamSize; // intializing the teamsize for object
	}
     
	@Override
	void displayDetails(){
		super.displayDetails();// getting display detaits for super class
		System.out.println("Team size of Manager is "+ teamSize);
	}


}
class Developer extends Employee{// sub class of Employee

    String programmingLanguage ;
	// constructor
	Developer(String name,String id ,int salary, String programmingLanguage ){ 
	    super(name,id,salary); // super keyword invoke the parent class attribute
		this.programmingLanguage=programmingLanguage; // intializing the programming language 
	}

    @Override
	void displayDetails(){
		super.displayDetails();// getting display detaits for super class
		System.out.println("Developer programming language is "+programmingLanguage);
	}
	

}

class Intern extends Employee{  // sub class of Employee
     
	// constructor
	Intern(String name,String id ,int salary){ 
		super(name,id,salary);
	}
	@Override
	void displayDetails(){
		super.displayDetails();// getting display detaits for super class
	}

}


class EmployeeManagement {

	public static void main (String[] args){


		// making object of classess 
     Employee managerEmployee = new Manager("vivek", "343VD", 5033300,5);
	 Employee devEmployee = new Developer("ritik","135AF",3434333, "java");
	 Employee internEmployee = new Intern("Vishal", "009AC", 3439433);
     
	 // calling the displayDetails method
	managerEmployee.displayDetails();
	System.out.println();
     
	// calling the displayDetails method
	devEmployee.displayDetails();
	System.out.println();
    
	// calling the displayDetails method
	internEmployee.displayDetails();
	System.out.println();



	}
	
}
