import java.util.*;
public class subArrayZero
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner (System.in); 
		int n,i,j,sum = 0,c = 0;
		int a[];
		System.out.println("Enter Array Size : ");
		n = in.nextInt();
		a = new int[n];
        System.out.println("Enter Array Value : ");
		for (i = 0; i < n; i++)   
        {
            a[i] = in.nextInt();			// Getting Array Values
        }
        for(i = 0; i < n && c != 1; i++)        // Loop to find sum of sub array is 0 or not
        {
            sum = a[i];                     // Assign ith index as Sum 
            for (j = i+1; j < n; j++)
            {
                sum = sum + a[j];       // Add Next consecutive Elements
                if(sum == 0)                // If The Sum is 0 the make c as 1 and break the loop
                {                       
                    c = 1;
                    break;
                }
                else
                {
                    c = 0;          // Else make c as 0
                }
            }
        }
        if(c == 1)
            System.out.println("True");
        else
            System.out.println("False");
	}
}