

///// JAVA Class 6 part 5: on May 7, 2023, Sunday with Instructor AP //////


package nb_cl6_OddEvenExercise_pkg;

public class NB_cl6notes_OddEvenArray_ {

	
	
	
	// Finding odd or even for just integer/word string  --> use for loop
	// Finding odd or even for integer array    --> use for each loop
	
	
	
	// IQA 1: what if I give you an array of number, then I want you to take that and tell me whether they are odd or even?

	
	
	
	
	
	// ===================================================================================================
	
	
// Example 1:	
	public static void main(String[] args) {

		
		// Interview Question: what if I give you an array of number, then I want you to take that and tell me whether they are odd or even?
		
		int[]  x = {12, 5, 32, 12, 35, 76, 3, 55};
//	
	// formation of for each loop --> it has the datatype then desiredName : variableName
//		for ( int item : x ) {
//		System.out.println(item);
//		
//		}
		
		// calling another method from this main method:
		isArrayValuesOddEven(x);
		
	}
	
	public static void isArrayValuesOddEven(int[] values) {
		
		for(int item : values) {
			System.out.print(item + " : ");
			
			if(item%2 ==0 ) {
				System.out.println("even");
			}
			else {
				System.out.println("odd");	
			}
		}	
	}

}
