package nb_cl6_hw6_pkg;

import java.util.Scanner;

public class NB_ClassOne extends NB_ClassTwo {
	
//	Assignment:

//		1. Create two java classes (ClassOne.java, ClassTwo.java):
//			a. One with the main method (ClassOne.java)
//			b. One without the main method (ClassTwo.java)
//			c. Create a Constructor Chain inside the ClassTwo.java
//			d. Create object in ClassOne.java to invoke the constructor chain
//		2. What are the different Access Modifiers?
//			a. Write few sentences of each access modifier`
			
	
	public static void main(String[] args) {

		System.out.println("Please insert Nish's favorite # to get started?");
		Scanner hw6 = new Scanner(System.in);
		int a = hw6.nextInt();					// use .nextInt for integers (Primitive)
		
		if( a == 7) {
			System.out.println(" Correctttt! You are in!");
			
			System.out.println("=========================================");
			NB_ClassOne q1 = new NB_ClassOne();
			q1.nk1();
		
			System.out.println("=========================================");
			System.out.println(" Good job on finishing the HW6, Question 1 !!!");
		
			System.out.println("=========================================");

			System.out.println("HW 6, Question 2:");
			
			System.out.println("What are the different Access Modifiers? Explain each briefly.");
			Scanner q2 = new Scanner(System.in);
			String b = q2.nextLine();
		
			System.out.println("Access Modifiers are keywords that are used in OOP (object-oriented programming) in order to specify the accessibility of the methods, classes, constructors, and other members of the class.");
			System.out.println("There are 4 types of Access Modifiers which are described below:-");
			System.out.println("1. Public : accessible to every class and package of same or different class/package as long as we call them right. For static, it should be called from the main method using Anyclassname.methodName(); Vs Non-static must be called using an object.");
			System.out.println("2. Private : gives access to methods in the same class only of the same package. Calling anything outside the same class will give an exception");
			System.out.println("3. Default: it must be non return type including void, non- static. it only invokes/calls classes within the same package. If you are in different package then will throw an exception."); 
			System.out.println("4. Protected : almost like default, but if it is being inherited (using childClass extends parentClass) then it is fine even if different packages....if not inherited then it will error out since they are in different packages");
			
			System.out.println("================================================================================");
			System.out.println("Congratulations, you have successfully completed your Java Assignment #6!... GoodBye!!!");
			
		}	
		else {
			System.out.println("Wrongggg!!!!! Please try again, and run it !");
		}
			
	}
	
	public NB_ClassOne() {
		System.out.println("Welcome to Nish's JAVA HomeWork 6, Question 1!");
		System.out.println("=========================================");
		
	}
	
}
