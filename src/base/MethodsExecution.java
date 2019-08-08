package base;

public class MethodsExecution {

	
	public static void main(String[] args) {
		Methods methods = new Methods();
		System.out.println(methods.name);
		System.out.println(Methods.Id);
		//NON STATIC
		//Methods methods = new Methods();
		methods.testMethodVoid();
		int newVariable = methods.testMethodReturn();
		System.out.println(newVariable);
		
		System.out.println("****************");
		
		//STATIC
		Methods.testStaticMethodVoid();
		int staticVariable = Methods.testStaticMethodReturn();
		System.out.println(staticVariable);
		
		methods.math(10, 20);
		
		//Parameterized 
		methods.calculator(10,100);
		methods.calculator2(2,5);
		methods.getNameOfStudent("Robin");
	}

}
