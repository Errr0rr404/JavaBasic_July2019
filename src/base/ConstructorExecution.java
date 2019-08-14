package base;

public class ConstructorExecution {

	public static void main (String [] args) {
		ConstructorTest constructorTest = new ConstructorTest();
		constructorTest.method1();
		
		ConstructorTest constructorTest2 = new ConstructorTest(2019);
		constructorTest2.method1();
		

		
	}
}
