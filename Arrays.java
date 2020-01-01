
import java.util.Arrays;

public class Arrays
{
    // Input: an int array
    // Output: sum of all elements of the input array
    static int summation(int[] a)
    {
        // TODO
        //

        return 0;
    }

    // Find the number closest to zero
    // You may the array elements are either all negative or all positive.
    // You may also assume that the array will never be empty 
    static int closestToZero(int[] a)
    {
        // TODO
        //

        return 0;
    }

    // (OPTIONAL)
    // Append together the elements of two arrays in increasing order
    // You may assume the two input arrays are already sorted
    // Return that sorted, appended array
    static int[] appendIncOrder(int[] a, int[] b)
    {
        // TODO
        //

        return null;
    }

    public static void main(String[] args)
    {
        // Datasets
        int[] a = {0, 0, 0, 0, 0};
        int[] b = {1, 2, 3, 4, 5};
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
        System.out.println((summation(a) == 0)? "Correct" : "Wrong");
        System.out.println((summation(a) == 1)? "Correct" : "Wrong");
        System.out.println((summation(a) == -1)? "Correct" : "Wrong");
        System.out.println((summation(a) == 0)? "Correct" : "Wrong");
        System.out.println((summation(a) == 96)? "Correct" : "Wrong");
        System.out.println();

        // Testing method3
        System.out.println("Testing method3");
        int[] result = {0,0,0,0,0,1,2,3,4,5};
        System.out.println(
                Arrays.equals(appendIncOrder(a,b), result)? "Correct" : "Wrong");

    }


}
