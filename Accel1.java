
public class Accel1
{
    // Method 1: While loops
    // Write a method that returns the summation of all ints <= n
    // For this exercise, you can only use a while loop
    // Consider what happens when n < 0
    // If n < 0, then return the negative summation. For example, if n = -3, then the answer is: -1 + -2 + -3 = -6
    static int summation(int n) 
    {
	int sum = 0;
	int count = 0;
	if (n >= 0) {
	    while (count <= n) { 
		sum += count; 
		count++;
	    }
	} else { // n < 0, so sum up negatives
	    // Count down from 0 to n, where n is a neg #
	    while (count >= n) {
		/*
		  sum := 0 + 0 
		  sum := 0 - 1 
		  sum := -1 - 2 
		  sum := -3 - 3
		*/
		sum += count;
		count--;
	    }
	}
	return sum;
    } 

    // Method 2: For loops 
    // Write a method that takes two int parameters: m and n
    // Return the summation of all numbers from m to n  
    // Only use a for loop
    // Return 0 if m > n
    // Sum up the negative numbers normally. For example if m = -2, and n = 2, then the answer is: -2 + -1 + 0 + 1 + 2 = 0
    static int summation(int m, int n) 
    {
        // for( ; ; ) {}
        
        return 0;   
    }

    // Method 3: Do While loops 
    // Your choice: Convert either method 1 or method 2 to a do while loop
    // If you are an Accelerated candidate, then you are required to convert both methods    
    static int doSummation(int n) 
    { 
        return 0;
    } 

    static int doSummation(int m, int n) 
    {
        return 0; 
    }

    
    public static void main(String[] args) 
    {

        // Test method 1
	System.out.println("Testing method 1");  
	System.out.println((summation(-1) == -1)? "Correct" : "Wrong");
	System.out.println((summation(10) == 55)? "Correct" : "Wrong");
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
	System.out.println((doSummation(-1) == -1)? "Correct" : "Wrong");
	System.out.println((doSummation(10) == 55)? "Correct" : "Wrong");
	System.out.println((doSummation(-3) == -6)? "Correct" : "Wrong");	
	System.out.println();

	// Test method 3: part 2
   	System.out.println("Testing method 3b"); 
	System.out.println((doSummation(-1, 2) == 2)? "Correct" : "Wrong");
	System.out.println((doSummation(3, 10) == 52)? "Correct" : "Wrong");
	System.out.println((doSummation(5, 0) == 0)? "Correct" : "Wrong");
	System.out.println();
		
    }

}
