package base;

public class Methods {


	
	String name = "pnt";
	static String Id = "9122";
	
	public void getName() {
		System.out.println(Id);
	}
	
	public static void getID() {
		System.out.println(Id);
	}
	
	//access_specifier methodType methodName(--params body ){ -- method body starts
	//
	// method body
	//
	//}-- method body finishes
	
	public String b = "Java Lessons";
	//non-static method
		//1. void - doesn't return anything
			public void testMethodVoid() {
				String a = "Hello";
				System.out.println(a);
			}
	
		//2. return type
			public int testMethodReturn() {
				int a = 100;
				System.out.println(a);
				return a;
			}
	
	//static
		//1. void  - doesn't return anything
			public static void testStaticMethodVoid() {
				String a = "Hello";
				System.out.println(a);
			}
			
		//2. return type
			public static int testStaticMethodReturn() {
				int a = 100;
				System.out.println(a);
				return a;
			}
	
			
			public void math(int a,int b) {
				int c = a+b;
				System.out.println("math method result "+c);
			}
		
			
			//Parameterized Methods
			public void calculator(int a, int b) {
				int c = a+b;
				System.out.println(c);
			}
			
			public void calculator2(int x , int z) {
				int y = x*z;
				System.out.println(y);
			}
			
			public void getNameOfStudent(String name) {
				System.out.println(name);
			}

}
