import java.util.*;
public class wordTwiceCounter
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner (System.in); 
		int n,i,j,count=0,twice=0;
		String a[];   // Creating String array
		System.out.println("Enter No of Words : ");
		n = in.nextInt();	// Getting No of Words	
		a = new String[n];		// Assigning Size
		for (i = 0; i < n; i++) 
        {
            a[i] = in.next(); 		// Getting Words From User
        }
        Arrays.sort(a);
		for(i=0;i<n;i++)
		{
			count=1;			//Make Starting count as 1 
			for (j=i+1;j<n;j++) 
			{
				if(a[i].equals(a[j]))		// Condition to check the words
				{		
					count=count+1;			// Increment Count value
					i++;					// If Exact word found Increment I value
				}
			}
			if(count==2)			// Condition to check Word count is 2 or not
				twice=twice+1;				
		}
		System.out.println(twice);    		// Print Twice Count
	}
}