import java.util.*;
public class binaryStartAndEnd
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner (System.in); 
		int n,i,j,count=0;
		int a[];
		System.out.println("Enter Array Size : ");
		n = in.nextInt();
		a = new int[n];
        System.out.println("Enter Array Value : ");
		for (i = 0; i < n; i++)   
        {
            a[i] = in.nextInt();			// Getting Array Values
        }
        for (i = 0; i < n; i++)				
        {
            if(a[i]==1)                 // Condition to Find Starting 1
            {
        	   for (j = i+1; j < n; j++)
        	   {
                    if(a[j]==1)         // Condition to find next consecutive 1
                        count=count+1;          // If Condition Satisfy
        	   }
            }
        }
        System.out.println(count);          // Print The Sub String Count
	}
}