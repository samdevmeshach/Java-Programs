import java.util.*;
import java.util.Arrays;
public class valueInIndex
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner (System.in); 
		int n,i,j,count = 0,max,x=-1,c=0;
		int a[];
		System.out.println("Enter Array Size : ");
		n = in.nextInt();
		a = new int[n];
        System.out.println("Enter Array Value : ");
		for (i = 0; i < n; i++)   
        {
            a[i] = in.nextInt();			// Getting Array Values
        }
        max = a[0];
        for (i = 1; i < n; i++)         // loop to find max value in array
        {
            if(max < a[i])
                max = a[i];
        }
        for (i = 0; i <= max; i++)          // Loop run from 0 to max
        {
            for (j = 0; j < n; j++)
            {
                if(a[j] == i)           // Condition to check Element Present in Array
                {
                    c = 1;              // Change c as 1 if element Present
                    break;
                }
                else
                    c = 0;              // Make c as 0 if element Not Present
            }
            if(c == 1)
                System.out.println(a[j]); 
            else
                System.out.println(x);
        }
        
	}
}