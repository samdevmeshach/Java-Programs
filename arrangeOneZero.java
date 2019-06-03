import java.util.*;
public class arrangeOneZero
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner (System.in); 
		int n,i,j,count = 0;
		int a[];
		System.out.println("Enter Array Size : ");
		n = in.nextInt();
		a = new int[n];
        System.out.println("Enter Array Value : ");
		for (i = 0; i < n; i++)   
        {
            a[i] = in.nextInt();			// Getting Array Values
        }
        for (i = 0; i < n ; i++)				
        {
                if(a[i]==0)
                {
                    count = count + 1;          // Counting Number of 0s
                }
        }
        for (i = 0; i < n; i++)
        {
            if(count > i)                   // Untill The count value assign it with 0
                a[i] = 0;
            else                            // Assign with 1
                a[i] = 1;
        }
        for (i = 0; i < n; i++)
        {
            System.out.print(a[i] + " ");         
        }
	}
}