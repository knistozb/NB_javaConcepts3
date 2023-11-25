

///// JAVA Class 6 part 3: on May 7, 2023, Sunday with Instructor AP //////
// Video starting 2:01:00 on class recording for 05/07/2023-- JavaClass6

package nb_cl6_mainmethod_pkg;

public class NB_cl5_mainMeth_clnotes {

	
	
	
	// Legacy code: it allows the java to break this rule to make it optional to use its argument before using other method's 
			// Interview Question: what does the "String array args" argument in the main method mean?
				// --> It means that it can take a string array as a input parameter, but it does not have to be a must meaning is optional.
					// --> Why? --- because of the legacy code which back then it used to be a requirement, but now no longer require it.  
					// Why didn't they take it off? --> because all the programs they made back then using this code will crash right away if we remove this. 
					// so the main string array arg has been kept and made optional meaning I will take it if you give me, or I won't need it if you don't give me
				// This legacy language is the basis of many languages, such as C++, Java, JavaScript, and Python.
	
	
	

	// ===========================================================================================
	
	
	
	public static void main(String[] args) {
		// What is the return type? --> void
		// What does it return? --> It returns nothing, because it has no value
		// What is the method's name? --> main ...anything before the small bracket/parenthesis
		// Is the method static or non-static? --> static
		// Does it have a body? --> Yes, anything inside curly bracket, but atm it has nothing in it
		// How many arguments? --> 1.... anything inside the small bracket of the method separated by commas if multiple arguments
		// What is the argument's datatype? --> String
		// What is the argument's variable name? --> args

		// Legacy code: it allows the java to break this rule to make it optional to use its argument before using other method's 
		// Interview Question: what does the "String array args" argument in the main method mean?
			// --> It means that it can take a string array as a input parameter, but it does not have to be a must meaning is optional.
				// --> Why? --- because of the legacy code which back then it used to be a requirement, but now no longer require it.  
				// Why didn't they take it off? --> because all the programs they made back then using this code will crash right away if we remove this. 
				// so the main "string array args" has been kept and made optional meaning I will take it if you give me, or I won't need it if you don't give me
				// This legacy language is the basis of many languages, such as C++, Java, JavaScript, and Python.
				
		
		String[] x = {"tom", "steve","jane"};   // index number 0 = tom, #1 = steve, #2 = jane
		System.out.println("==========1=============");
		System.out.println(args[1]);   // String always uses index numbers...so it has to be designated with the index number like 0,1,2,...
		// this wont print anything unless you give values in the arguments section in the run configurations button. 
		// you can even run this code in terminal and text-edit route. 
		// javac filename after you go the file location then java classname to run it. 
		
		System.out.println(x[1]);   // steve from above String [] x
		
		System.out.println("=========2==============");
//		NB_cl5_mainMeth_clnotes.main(args);    // this one is weird....no idew where the main(args) is stored at
				// it tries printing james bond and then errors out eventually..... FIND OUT?LOL
		
		System.out.println("===========3============");
		System.out.println("Hello");
		System.out.println("============4===========");
		NB_cl5_mainMeth_clnotes.test(7);   // 7
		System.out.println("============5===========");
		test(7);      // 7
		
	}
	
	
	public static void test(int a) {
		
		System.out.println(a);
		
	}
}
