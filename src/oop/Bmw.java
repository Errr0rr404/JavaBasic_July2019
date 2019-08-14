package oop;

public class Bmw extends Car{
	
	public int getHorsePower() {
		int newHp = horsepower;
		return newHp;
	}
	
	public void testMethodBmw() {
		testMethodCars();
		System.out.println(" from bmw");
	}
	
	//Method overriding
	@Override
	public void polymorphismTest() {
		System.out.println("Bmw Class");
	}
	
	public static void main(String[] args) {
		Bmw bmw = new Bmw();
		int  storingVariable = bmw.getHorsePower();
		
		System.out.println(storingVariable);
		System.out.println(storingVariable+100);
		
		System.out.println(bmw.getHorsePower());
		System.out.println(bmw.getHorsePower()+100);
		
		bmw.testMethodBmw();
		bmw.testMethodCars();
		
		bmw.polymorphismTest();
	}

}
