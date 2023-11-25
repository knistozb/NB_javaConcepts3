
///// JAVA Class 6 part 1.a: on May 7, 2023, Sunday with Instructor AP //////


package nb_Class6_Oop_pkg;

import java.util.Scanner;

public class A {

	
	
	
	
	// Interview Question: What is the default value of a String in java? ---> ans is 0 or null
	// Interview Question: What is the default value of an integer? --> ans is null or 0 
	// Interview Question: What keyword do you use to make an object? --> new 


	// How to call a non-static method? --> by making an object and calling using it
			// className bridgeName = new ClassName(Argument);
			// bridgeName is professionally called an object in the actual work field. 'ui', that is to the left side of the keyword, is called object. 
			// Interview Question: What keyword do you use to make/create an object/bridgeName? --> new 
			// 'Scanner' here is the className
			// ui is the variable of this called bridgeName or object
			// new is what makes/creates the object
			// () is inside where the arguments go
			// // making an instance is another vocabulary for making an object
			// use this if you need to deal with non-original or copied documents
			// non-static uses options like nextInt, nextLine, nextBoolean, etc. which belongs to the class called Scanner 
			
	// using object to call the static method is possible, but not encouraged. 
	// Instead, call static to static using className.methodName
	// Call static to non-static using object/instance.
	
	
	
	
	
//==================================================================================================
	
	
	

//Exercise 7:
	
	public static void main(String[] args) {
	  // it has static after access modifier so it is static method
		
	 // how to call static method? --> className.methodName();
		B.b1(); 	// only static method can be called directly using the class
		a1();
		A.a1();		// since this is static, its better to link using class. 
		A.a3();		// linking static using object is NOT considered a proper way
		// use this if you need to deal with original documents
		// static uses dataType options like int, boolean, double, String, etc. 
		System.out.println("=======1=========");
	// // How to call a non-static method? --> by making an object and calling using it
		// className bridgeName = new ClassName(Argument);
		// bridgeName is professionally called an object in the actual work field. 'ui', that is to the left side of the keyword, is called object. 
		// Interview Question: What keyword do you use to make/create an object/bridgeName? --> new 
		// 'Scanner' here is the className
		// ui is the variable of this called bridgeName or object
		// new is what makes/creates the object
		// () is inside where the arguments go
		// // making an instance is another vocabulary for making an object
		// use this if you need to deal with non-original or copied documents
		// non-static uses options like nextInt, nextLine, nextBoolean, etc. which belongs to the class called Scanner 
		
		
		
		Scanner ui1 = new Scanner (System.in);   
		String aaa = ui1.nextLine();    	 // only the object like ui could call them different options like next, nextInt, etc. 
		
		
//		b.b2(); 		// non-static method has no superscript, amd must be done using object
		
//		Scanner ui2 = new Scanner (System.in);					
		B b = new B ();  // put the object name is lower case for standard rules
		b.b2(); 		// non-static method has no superscript
		b.b1();			// static method has 's' as a superscript... it is recommended to do it using the class name for static method
		// above b can call both b1 and b2 because that is an object and only object can call the non-static method plus the static methods
		
//		B.b2 ();		// this class B cannot call method b2 because it is non-static method. You have to make an object to connect those two. 
		B.b1(); 		// only static method can be called directly using the class

		A a = new A();
		A aa = new A();
//		A.a2();			// this wont work as a2 has non-static method
		// you can automatically make it change it into an object 
		a.a2();
		a.a4();
		aa.a2();	// you can make a new instance/object/bridgename and link it with needed methods repeatedly. 
		aa.a4();
		a.a1();     // using object to call the static method is possible, but not encouraged. 
				// Instead, call static to static using className.methodName
				// Call static to non-static using object/instance.
		
		// making an instance is another vocabulary for making an object so used interchangeably				
	}	
	
	public static void a1() {
		C c = new C();		// the object should be created separately in wherever methods you want to execute it 
		c.c2();
		System.out.println("A1");
	}
	public static void a3() {
		System.out.println("A3");
	}
	
	public void a2() {
		System.out.println("A2");
	}
	public void a4() {
		System.out.println("A4");
	}
	
}	
		
	
	/*
//========================================
//Exercise 6:	

	public static void main(String[] args) {		
		
		a4();
		System.out.println("=======1=========");
		a1();  
		System.out.println("=======2=========");
		System.out.println(a4());   // this will print all the syso along with returning value
		System.out.println("=======3=========");
	
		
		
		
	}		public static void a1() {
		System.out.println("testing");
		System.out.println("A1");
		
	}

	public static int a4() {
		System.out.println("god");
		return 5;
	}
}
	*/

	/*
// ========================================	
// Exercise 1-5	
	
	public static void main(String[] args) {
		// if you want to invoke or call the method, then you have to do it inside the main method. 
		// it is better not to have 2 main methods in 2 different classes. Just have 1 MAIN method in 1 class so it can control and navigate others. 
		// Interview Question: What is the default value of a String in java? ---> ans is 0 or null
		// Interview Question: What is the default value of an integer? --> ans is null or 0 
		// Interview Question: What keyword do you use to make an object? --> new 
		
		a2();
		a1();		
		String a = "nish";
		System.out.println(a);
			
		System.out.println("=======1=========");
		
		System.out.println(a2());
		System.out.println("=======2=========");
		a3(5,10);		// it wont return anything, but print the other body statements
		System.out.println("========3========");
		System.out.println(a3(5, 10));   // it will return the sum of 15 along with other prints that are inside of it.
		System.out.println("========4========");
		// the above and below will give the same result meaning print all the inside statements plus the return value
		
		int x = a3(5,10);	// it means execute a3 and print the return value only		
		System.out.println(x);			// it will also return the sum of 15 and print the others inside that body
		System.out.println("=======5=========");
		 	
		B.b2();		// it will go to the class B and go to  method b2 THEN  print everything inside that body. 
		System.out.println("========6========");
 		a1();		// A1
//		B.c1():   // CANNOT do this because they are in different classes
 		System.out.println("========7========");
 		C.c1();		// just hover and select it to right click to open declaration so you can go to that class directly
 		System.out.println("=========8=======");
 		B.b1();		// B1
 		System.out.println("========9========");
 		A.a1();  // A1....Both class and method has to be in the same class. 
	
		// Formula is: className.MethodName (Argument);
		
	}

	public static void a1() {	// 'return type' here is 'void', but it does not return anything. 
			// if you don't put void then you need to mention some other dataType i.e. return type like String, int at the end so it ends up with some result. 
		System.out.println("A1");
			// return means it has a value like printing apple, hello, etc, because that is associated with the printing variable. 
		// the job of a1 is to print out A1, but it does not have any value. 
	
	}
	
	public static int a2() {		
		System.out.println("A2");
		System.out.println("testing!");
		return 7;
		
	}
	
	public static int a3(int a, int b) {			
		System.out.println("A3");
		System.out.println("still testing!");
		return a+b;		
	}	
}
	*/



