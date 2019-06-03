import java.util.*;
public class arrayRevInPlace
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner (System.in); 
		int n,i,j,temp;
		int a[];
		System.out.println("Enter Array Size : ");
		n = in.nextInt();
		a = new int[n];
        System.out.println("Enter Array Value : ");
		for (i = 0; i < n; i++)   
        {
            a[i] = in.nextInt();			// Getting Array Values
        }
        j = n-1;                // Assigning Last Index to J
        /*
        Note : IF the Condition is < n the array remains Same.
        */
        for(i = 0; i < n/2; i++)        // Loop for reversing the Array Starting 0 Ending n/2
        {
            if(j != i && j != 0)
            {
                /*
                Swapping the elements 
                */
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
            j--;                // Decrement The last index For each iteration.
        }
        for (i = 0; i < n; i++)
        {
            System.out.print(a[i] + " ");         
        }
	}
}