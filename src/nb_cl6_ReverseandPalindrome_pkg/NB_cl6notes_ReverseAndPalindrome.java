
///// JAVA Class 6 part 6.a: on May 7, 2023, Sunday with Instructor AP //////



package nb_cl6_ReverseandPalindrome_pkg;

import java.util.Arrays;
import java.util.Collections;

public class NB_cl6notes_ReverseAndPalindrome {

	
	
	// Most IMPORTANT Interview Question:
				// 1. I will give you a string. Tell me a reverse version of it.
				// 2. I will give you a string. Tell me whether it is a palindrome or not?
						// first you have to do the reverse of the string. 
			
			
		// MAKE SURE TO PRACTISE REVERSE AND PALINDROME ON INTEGER VALUES, character string, array of integers, array of words, etc. 
			
	

	
	
	
	
	
	// ===================================================================================================
	
	
	
// Example 5:  Java program to reverse a integer number:
	
	// Driver Function
    public static void main (String[] args) {
        int N = 1234;
         
        System.out.println("Original Number is: "+ N);
        System.out.println("Reversed Number is: "+ reverse(N));
    }

	// Function to reverse the number
    public static int reverse(int N){
       
      int revNum = 0;	 // reversed number
      int remNum;   	// remainder number
       
      while(N>0){
          
    	remNum = N%10;
        revNum = (revNum*10) + remNum;
        N = N/10;
      }
       
      return revNum;
      
      
      // to check whether the number is a palindrome or not:
//      	if()) {          // what code to put here to compare the values?????????
// 		System.out.println("Palindrome");
// 		}
//		else {
//  		System.out.println("Not a Palindrome!");
// 		}
  	     
    }	  
}	
	
	
	/*
// Example 4: Reversing an integer array using Java collections
	
	public static void main(String[] args) {
        Integer [] arr = {10, 20, 30, 40, 50};
        reverse(arr);
    }
	
	// function reverses the elements of the array
    static void reverse(Integer a[]) {
        Collections.reverse(Arrays.asList(a));   // you have to import collections util:
        	// import java.util.Collections;
        System.out.println(Arrays.asList(a));   // [50, 40, 30, 20, 10]
    }
} 
	*/
    

	/*
// Example 3: Java Program for Reversing an array using StringBuilder

	public static void main (String[] args) {
		
	      String[] arr = {"Hello", "World"};
	      StringBuilder reversed = new StringBuilder();
	  
	      for (int i = arr.length; i > 0; i--) {
	          reversed.append(arr[i - 1]).append(" ");
	      };
	        
	      String[] reversedArray = reversed.toString().split(" ");
	        
	      System.out.println(Arrays.toString(reversedArray));
	      	// you have to import this: import java.util.Arrays;
	   }
}
	*/
	
	/*
// Example 2: Using an integer value:
 	
	public static void main(String[] args) {
		
		String abc = "123456789";
		
		char[] myArray = abc.toCharArray();  // a p p l e
		
		String result = "";  // this is basically to concat so you can join the string with the other string
		
		// formation of for loop --> almost always convert into chararray and use int before starting end
		for(int i= myArray.length -1 ; i>=0 ; i--) {
			System.out.println(myArray[i]);  // this will print separately in a vertical line since it goes to next line
			
			result = result + (myArray[i]);
				// first right hand side will give the character 'e'... that when concatted with a string becomes string character, "e" then when you put in the value of result, then that will be the new updated value of result, "e", instead of ""
				// then next loop will go to take 'l' character which concatted with string e will be string el which then when will update the new value of result to string "el"
				// then the loop continues till it is all done
			
		}
		System.out.println("Original integer value is: " + abc);
		System.out.println("Reversed integer value is: " + result);
		System.out.println("==========================================");
			
		if(abc.equals(result)) {
			System.out.println("Since original is equal to reversed, the given value is a Palindrome");
		}
		else {
			System.out.println("Since original is not equal to reversed, the given value is not a Palindrome!");
		}
	}	
}		
	*/
		
		/*
// Example 1: using a String input		
	public static void main(String[] args) {

		String a = "mom";
		String aa = "apple";
		
		char[] myArray = a.toCharArray(); // m o m  .... we need to convert string into individual characters
		char[] myArray2 = aa.toCharArray(); // a p p l e

		String result = "";  // this is basically to concat so you can join the string with the other string
		
		// formation of for loop --> almost always convert into chararray and use int before starting end
		for(int i= myArray2.length -1 ; i>=0 ; i--) {   // i-- coz we are starting from the very last character and going down by 1 index number at once
			System.out.println(myArray2[i]);  // this will print separately in a vertical line since it goes to next line
//			System.out.print(myArray[i]);   // THIS will only print the result in a horizontal line, but they are all characters 
			
			result = result + (myArray2[i]);
				// first right hand side will give the character 'e'... that when concatenated with a string becomes string character, "e" then when you put in the value of result, then that will be the new updated value of result, "e", instead of initial value of ""       
				// then next loop will go to take 'l' character which concatenated with updated value of String result i.e. "e" will be string el which then when will update the new value of String result = "el"
				// then the loop continues till it is all done meaning till it finishes till index value of 0 for a 
				// eventually its gotta print 1 by 1 from the very last character to the very first i.e. elppa
			
		}
		
		System.out.println("Original String value is: " + aa);
		System.out.println("Reversed String value is: " + result);
		System.out.println("=========================================="); 
			// this will print the very lastly updated value of String after finishing from the very last to the first and storing it as it goes by
	// ABOVE SYSO is the end if all they ask is find me a reverse of whatever user input String!!!
			
	// VS
			
	// Do THIS ONLY IF THEY ASK YOU TO DETERMINE WHETHER A PALINDROME OR NOT QUESTION. OTHERWISE DON'T!!!
		if(aa.equals(result)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome!");
		}	
	}
}
	*/


