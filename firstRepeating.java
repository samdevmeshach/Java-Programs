import java.util.*;
public class firstRepeating
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner (System.in); 
		int n,i,j,c = 0,ans = 0;
		int a[];
		System.out.println("Enter Array Size : ");
		n = in.nextInt();
		a = new int[n];
        System.out.println("Enter Array Value : ");
		for (i = 0; i < n; i++)   
        {
            a[i] = in.nextInt();			// Getting Array Values
        }
        for(i = 0; i < n && c != 1; i++)        // Loop to find First Repeating elements
        {                      
            for (j = i+1; j < n; j++)
            {
                if(a[i] == a[j])                // If a[i] and a[j] are equal then make c as 1 and break the loop
                {                       
                    c = 1;
                    ans = a[i];
                    break;
                }
                else
                {
                    c = 0;          // Else make c as 0
                }
            }
        }
        System.out.println(ans);
	}
}