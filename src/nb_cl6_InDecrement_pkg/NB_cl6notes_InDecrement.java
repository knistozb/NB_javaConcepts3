

///// JAVA Class 6 part 2: on May 7, 2023, Sunday with Instructor AP //////



package nb_cl6_InDecrement_pkg;

public class NB_cl6notes_InDecrement {

	
	// Post Vs Pre Increment
	
		// ++i (Pre Increment) -- before but it still means i = i+1
		// --i (Pre Decrement)
			
		// i++ (Post Increment)-- after so it means i = i+1
		// i-- (Post Decrement)
			
		// Interview Question:	difference between pre-increment and post-increment?
			// Pre increment means the increment happens first or before
			// Post increment means the increment happens last or after
			// use examples of post increment in order to explain these terms during interview	
			// for example; we have 
			// int a = 5; int b = 10; 
				// now to calculate a = b++; 
				// to print a ---> first we do a = b = 10 to print value of a or new b
				// to print b ---> then use that new b to get final value of b = b +1 = 10+1 = 11 to print value of b
			// Pre:  will have same values for a and b 
			// Post: values will be either increased or decreased
	
	
	
	// IQA 1: WHY DO WE ONLY USE THE VALUE OF b and y. We haven't really used the value of a and x....WHY??? 
		
	// IQA 2: if we switch places or bring the print codes before the command/function, it prints the different value for it...why????
			
	
	
	
	
	
	
	// =======================================================================================
	
	
	
	public static void main(String[] args) {

	// Post Vs Pre Increment
		
	// ++i (Pre Increment) -- before but it still means i = i+1
	// --i (Pre Decrement)
		
	// i++ (Post Increment)-- after so it means i = i+1
	// i-- (Post Decrement)
		
	// Interview Question:	difference between pre-increment and post-increment?
		// Pre increment means the increment happens first or before
		// Post increment means the increment happens last or after
		// use examples of post increment in order to explain these terms during interview	
		// for example; we have 
		// int a = 5; int b = 10; 
			// now to calculate a = b++; 
			// to print a ---> first we do a = b = 10 to print value of a or new b
			// to print b ---> then use that new b to get final value of b = b +1 = 10+1 = 11 to print value of b
		
	int a = 7;
	int b = 11;
	int x = 50;
	int y = 100;
	
	// The regular/normal print should be this: 
	 System.out.println(a);   // 7
	 System.out.println(b);   // 11
		
	// IMPORTANT QUESTION 1: WHY DO WE ONLY USE THE VALUE OF b and y. We haven't really used the value of a and x....WHY??? 
	// Question 2: if we switch places or bring the print codes before the command/function, it prints the different value for it...why????
		 System.out.println(a);   // this shud print a = 7
		//  Versus :
		 a = ++b; 		
		 System.out.println(a);  // // this shud print a = 12
		// ---> because it goes by order meaning top to bottom. so if you put syso before the command, then it will print that first before going to next one
	
	
	
	 System.out.println("===========1===============");
	 
	 
	 // pre-increment/decrement: Pre means the increment/decrement will happen before or first thing first
	 	// do the right hand side first then left hand side
	 	// BOTH THE ANSWER SHOULD BE THE SAME!!!
	 
	 // Pre-increment example 1:
	a = ++b;     // b = b+1 .... so, a = b = b+1 
	 // for print b --> new b = b + 1 =  // since this is pre, then this should happen first or before the left hand side
	 	 // --> ans should be b = 11+1 = 12
	// for print a --> a = b       // ans should be  this left hand side should happen after b = b+1 for pre-increment case. 
		 	// --> this should be after getting the right hand side, b + 1, then it should be 12 as well since that new b = b+1 = 12
	
	 // another example 2:
	 x = ++y;   // x = y = y+1
	  // for print y ---> Since this is pre, do right side first, ans should be new y = 100+1 = 101
	 // for print x ----> then do x = new y = 101
	 
	 System.out.println("===========================2================================");
	 
	 // pre-decrement example 1:
		a = --b;  // this should be same as a = b = b-1
			// for print b ---> so do the right side first so new b should be 11 - 1 = 10
			// for print a ---> then do left side so a = new b = 10
		
	 // another example 2:
	 	x = --y;    // x = y = y-1
			// for print y ---> ans should be, right side first, so  new y = 100 -1 = 99
			// for print x ---> ans should be left hand side next so x = new y = 99
	 
// ======================================================================//	 

	 // post-increment/decrement: the increment/decrement will happen after
	 // do the left side first then right hand side
	// BOTH ANSWER SHOULD BE DIFFERENT
	 
	 // Post-increment example 1:
	 a = b++;  	// a = b = b++ since b++ means b = b+1 then a = b = b+1
	 	// for print a ---> since this is post, do left side first, so a = b = 11
	 	// for print b ---> then do right side, final b = 11+1 = 12
	 
	 // another example 2:
	 x = y++;   // x = y = y+1
	  	// for print x ---> first since it is post, do left side first so ans should be x = y = 100 
	 	// for print y ---> then do the right side which should be final y = y+1 = 100+1 = 101
	 
	 System.out.println("============================3===============================");

	 
	 // Post-decrement example 1:
	 a = b--;    // a = b = b-1
	 	// for print a ---> Since this is post, do left side first, so ans should be a = b = 11
	 	// for print b ---> then do right hand side, so ans should be final b = 11 -1 = 10
	
	 // another example 2:
	 x = y--;    // x = y = y-1
	 	// for print x ---> since this is post, do left side first so x = y = 100
	 	// for print y ---> then do right side next, so ans should be final y = 100 -1 = 99
	
	 System.out.println("==============================4======================================"); 
	 
 // pre/post - increment/decrement print codes:
	 System.out.println(a);   // 11 ... this will happen first so a = b = 11
 	 System.out.println(b);;  // 7... now substitute the new value of b = 11 in b = b+1 then b = 11+1 = 12
 	 
 	 // pre/post- increment/decrement another example print codes: 	
 	 System.out.println(x);   // 
 	 System.out.println(y);   //

	 
	}

}
