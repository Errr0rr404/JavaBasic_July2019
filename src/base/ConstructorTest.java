package base;

public class ConstructorTest {
	//default Constructor 
	public ConstructorTest(){
		
	}
	
	//Customized Constructors
	public static int year;
	String name;
	
	public ConstructorTest(int year) {
		this.year=year;
	}
	
	public void method1() {
		System.out.println(year);
	}
	
	
	
	
	
}
