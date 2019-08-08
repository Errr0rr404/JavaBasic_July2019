package object;

public class Execution {
	//Naming Convention :
	//- PackageName /  variableName - Starts with lowerCase
	//- Class - Starts with Upper Case
	
	
	public static void main(String[] args) {
		//Object Creation
		Laptop laptop = new Laptop();
		//desired_class_name  referrence_Variable = new(keyword)  constructor() { name of the class};
		Car car = new Car();
		System.out.println(laptop.brand);
		car.engine="v6";
		car.engine="v8";
		System.out.println("engine = "+car.engine);
		
		
		

		System.out.println(laptop.brand+laptop.model+laptop.production_year);
		
		//sysout + control + space  -- eclipse shortcut for print
		System.out.println(car.brand);
	}
}
