
public class Accel1
{

    // Method 1: While loops
    // Write a method that returns the summation of all ints <= n
    // For this exercise, you can only use a while loop
    // Consider what happens when n < 0 
    static int summation(int n) 
    {
        // while() {}
        
        return 0; 
    } 

    // Method 2: For loops 
    // Write a method that takes two int parameters: m and n
    // Return the summation of all numbers from m to n  
    // Only use a for loop
    // Consider what happens if m > n
    static int summation(int m, int n) 
    {
        // for( ; ; ) {}
        
        return 0;   
    }

    // Method 3: Do While loops 
    // Your choice: Convert either method 1 or method 2 to a do while loop
    // Accelerated candidates are required to convert both methods
    
    static int doSummation1(int n) 
    { 
        return 0;
    } 

    static int doSummation2(int m, int n) 
    {
        return 0; 
    }

    
    public static void main(String[] args) 
    {

        // Test method 1
	System.out.println("Testing method 1");  
	System.out.println((summation(-1) == -1)? "Correct" : "Wrong");
	System.out.println((summation(10) == 45)? "Correct" : "Wrong");
	System.out.println((summation(-3) == -6)? "Correct" : "Wrong");
	System.out.println();

	// Test method 2 
   	System.out.println("Testing method 2"); 
	System.out.println((summation(-1, 2) == 2)? "Correct" : "Wrong");
	System.out.println((summation(3, 10) == 52)? "Correct" : "Wrong");
	System.out.println((summation(5, 0) == 0)? "Correct" : "Wrong");
	System.out.println();

	// Test method 3: part 1 
	System.out.println("Testing method 3a");  
	System.out.println((summation(-1) == -1)? "Correct" : "Wrong");
	System.out.println((summation(10) == 45)? "Correct" : "Wrong");
	System.out.println((summation(-3) == -6)? "Correct" : "Wrong");	
	System.out.println();

	// Test method 3: part 2
   	System.out.println("Testing method 3b"); 
	System.out.println((summation(-1, 2) == 2)? "Correct" : "Wrong");
	System.out.println((summation(3, 10) == 52)? "Correct" : "Wrong");
	System.out.println((summation(5, 0) == 0)? "Correct" : "Wrong");
	System.out.println();
		
    }

}
