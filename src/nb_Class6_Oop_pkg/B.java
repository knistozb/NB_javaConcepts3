
///// JAVA Class 6 part 1.b: on May 7, 2023, Sunday with Instructor AP //////


package nb_Class6_Oop_pkg;

public class B {

	// every method in java needs to have a return type like void. However void DOES NOT return anything meaning it still brings the value associated with it.  
	// if you don't have the void then you must have return instead. 
	// default value of any integer is 0 or null. 
	// Interview Question: What is the default value of a String in java? ---> ans is 0 or null
	// Interview Question: What is the default value of an integer? --> ans is null or 0 
	// Interview Question: What keyword do you use to make an object? --> new 


	

	
	
	
	
	
//========================================
	
	
//Exercise 2:		
	
	//static method
	public static void b1() {    // it has static after access modifier, public, so it is a static method
		// how to call static to static method? --> className.methodName();
		// how to call static to non-static method?  --> creating object, and invoking using object.methodName
		
		
		System.out.println("B1");
		
	}
	
	
	// non-static method
	public void b2() {	   	// remove the 'static' out so this is non-static method
		// How to call a non-static method? --> className bridgeName = new ClassName(Argument);
		// bridgeName is professionally called an object in the actual work field. 'ui', that is to the left side of the keyword, is called object. 
		// Interview Question: What keyword do you use to make/create an object/bridgeName? --> new 
		// 'Scanner' here is the className
		// ui is the bridgeName or object or instance
		// new is what makes the object
		// () is inside where the arguments go
		
		
//		Scanner ui = new Scanner (System.in);
		B objb = new B ();  // put the object name is lower case for standard rules
		
		System.out.println("B2");
		
	}	
}	
	
	
	/*
//========================================
//Exercise 1:
	
	public static void b1() {   // method name is b1...it always comes before parenthesis, but since there is nothing inside the small bracket, there are no arguments. 
						// the return type is void which has no value
						// body here is used to print B1 since it is inside the curly bracket. 
		System.out.println("B1");
	}
		
	public void b2() {
		b1();
		C.c1();
		
		System.out.println("B2");
		b1();
		C.c1();
	}
	
}
	*/


