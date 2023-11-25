

///// JAVA Class 6 part 4: on May 7, 2023, Sunday with Instructor AP //////



package nb_cl6_OddEvenExercise_pkg;

public class nb_cl6notes_OddEven {

	
	
	// Differentiate between even and odd numbers.
			// even number is when a desiredNumber is perfectly divisible by 2, and leaves no remainder or decimals. For example: 4/2 = 2
			// odd number is when a desiredNumber is not equally divided by 2, and leaves a remainder or decimals. For example: 5/2 = 2.5
				
	
	// N/2  will give the result value, but not the remainder value
	
	// % or modulo/modulus operator will serve the purpose of doing N/2 plus gives the remainder value, and NOT the result value
				// '%' is read as 'modulo' and used to find the remainder value
	
	
	
	// IQA 1: Write me a method that takes an integer value, and it should return whether it is odd or even?
		// Scenario 1: if they had asked just a code then we could have done it inside the main method
		// Scenario 2: but since they want our own method, we have to come up with all this then connect them appropriately
	
	
	
	
	
	
	
	// ============================================================================================
	
	
	
	
// Example 2: 	
	
	public static void main(String[] args) {
		
		
		// invoking using other own created method from below:

		// Now for non-static method, we have to use object to connect.
		nb_cl6notes_OddEven oe = new nb_cl6notes_OddEven();
		
		System.out.println(13 + " is an " + oe.isEvenOrOdd1(13) + " number.");
		System.out.println(18 + " is an " + oe.isEvenOrOdd1(18) + " number.");
		
		
		System.out.println("==========================");
		
		// for static to static methods, you can just do: className.methodName(); OR JUST methodName(); since they are both inside same class
		System.out.println(13 + " is an " + nb_cl6notes_OddEven.isEvenOrOdd2(13) + " number.");
		System.out.println(18 + " is an " + isEvenOrOdd2(18) + " number.");
			// above 2 gives the same value
		System.out.println("==========================");
		
	}
	
	public String isEvenOrOdd1(int x) {
		 
		if(x%2 == 0 ) {
			return("even");
		}
		else {
			return("odd");	
		}	
	}	
	
	
	public static String isEvenOrOdd2(int x) {
				
		if(x%2 == 0 ) {
			return("even");
		}
		else {
			return("odd");	
		}
	}
}
	
	
	
	
	// INTERVIEW Question: Write me a method that takes an integer value, and it should return whether it is odd or even?
		// a separate method that is not main method
	
	/*
// Example 1: 
	
	public static void main(String[] args) {
		
		int N = 255;
		
		if(N%2 == 0 ) { // % will serve the purpose of doing N/2 plus gives the remainder value, and NOT the result value
			// '%' is read as 'modulus' and used to find the remainder value
			// N/2  will give the result value, but not the remainder value

			System.out.println(N + " is a Even number!");
		}
		else {
			System.out.println(N + " is a Odd number!");
		}		
		
		System.out.println("===========1================");
		
		// invoking using other own created method from below:
		nb_cl6notes_OddEven obj = new nb_cl6notes_OddEven();
		
		System.out.println(13 + " is an " + obj.isEvenOrOdd1(13) + " number.");   // static to non-static calling
		System.out.println("===========2================");
		System.out.println(18 + " is an " + nb_cl6notes_OddEven.isEvenOrOdd2(18) + " number.");   // static to static calling
	}
	
	public String isEvenOrOdd1(int x) {
	 
		if(x%2 == 0 ) {
			return("even");
		}
		else {
			return("odd");	
		}	
	}	
	
	
	public static String isEvenOrOdd2(int x) {
				
		if(x%2 == 0 ) {
			return("even");
		}
		else {
			return("odd");	
		}
	}

}
	*/


