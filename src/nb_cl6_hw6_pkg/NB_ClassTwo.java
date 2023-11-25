package nb_cl6_hw6_pkg;

public class NB_ClassTwo {
	
	
//	Assignment:

//	1. Create two java classes (ClassOne.java, ClassTwo.java):
//		a. One with the main method (ClassOne.java)
//		b. One without the main method (ClassTwo.java)
//		c. Create a Constructor Chain inside the ClassTwo.java
//		d. Create object in ClassOne.java to invoke the constructor chain
//	2. What are the different Access Modifiers?
//		a. Write few sentences of each access modifier`

	

	
	public static void nk1 () {

		System.out.println("Hello, this is Method 1 from Class Two");
		NB_ClassTwo cl2 = new NB_ClassTwo();
		cl2.nk2();
		System.out.println("Adios, from Method 1 ");
	
		
	}
	
	public void nk2() {
		System.out.println("Hello, this is Method 2 from Class Two");
		System.out.println("========================================");
		System.out.println("Peace out, from Method 2 ");
	
	}
	
}
