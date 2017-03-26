
import java.util.Arrays; 

public class Accel2 
{
	// Input: an int array 
	// Output: sum of all elements of the input array
	static int summation(int[] a) 
	{
		int sum = 0;
		
		for(int counter = 0; counter<a.length; counter++){
			sum+=a[counter];
		}
		return sum; 	
	}

	// Find the number closest to zero 
	// You may the array elements are either all negative or all positive. 
	// You may also assume that the array will never be empty 
	static int closestToZero(int[] a) 
	{
        // closestToZero: stores the number closest to zero 
        int closestToZero = a[0];   
        for (int i = 1; i < a.length; ++i) { 
            // compare our current element with closestToZero 
            if (closestToZero > Math.abs(a[i])) { 
                closestToZero = a[i];
            }
        }

		return closestToZero; 
	}

	// (OPTIONAL)	
	// Append together the elements of two arrays in increasing order
	// You may assume the two input arrays are already sorted
	// Return that sorted, appended array
	static int[] appendIncOrder(int[] a, int[] b) 
	{
	// Total length of appended arrays is equal to length of first & second array
	//Assign int to first, second, and sorted array respectively
        int[] result = new int[a.length + b.length];
		int i = 0, j = 0, k = 0; 

	//Compare elements between arrays
	//After each set of numbers are compared, add to sorted array	
	while (i < a.length && j < b.length)
	{
		if(a[i] < b[j])
			{
			result[k] = a[i];
			i++;
			}
		else
			{
			result[k] = b[j];
			j++;
			}
			k++; 
			       
		return result;
	}	
	}
	public static void main(String[] args) 
	{
		// Datasets 
		int[] a = {1, 4, 6, 8, 9}; 
		int[] b = {2, 5, 7, 8, 10}; 
		int[] c = {-1, -2, -3, -4, -5}; 
		int[] d = {7, 2, 4, 0, 10}; 
		int[] e = {100, 99, 98, 97, 96}; 

		// Testing method1
		System.out.println("Testing method1"); 
		System.out.println((summation(a) == 0)? "Correct" : "Wrong");		
		System.out.println((summation(b) == 15)? "Correct" : "Wrong");		
		System.out.println((summation(c) == -15)? "Correct" : "Wrong");		
		System.out.println((summation(d) == 23)? "Correct" : "Wrong");		
		System.out.println((summation(e) == 490)? "Correct" : "Wrong");		
		System.out.println();
		// Testing method2 
		System.out.println("Testing method2");
		System.out.println((closestToZero(a) == 0)? "Correct" : "Wrong");		
        System.out.println((closestToZero(b) == 1)? "Correct" : "Wrong");		
		System.out.println((closestToZero(c) == -1)? "Correct" : "Wrong");		
		System.out.println((closestToZero(d) == 0)? "Correct" : "Wrong");		
		System.out.println((closestToZero(e) == 96)? "Correct" : "Wrong");		
		System.out.println();
		// Testing method3
		System.out.println("Testing method3");
		int[] result = {1,2,4,5,6,7,8,8,9,10}; 
		System.out.println( 
						Arrays.equals(appendIncOrder(a,b), result)? "Correct" : "Wrong");

	}


}
