import java.util.*;
public class minDifferencePair
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner (System.in); 
		int n,i,temp,j,min;
		int a[];   // creating interge array
		System.out.println("Enter The Length Of the String");
		n = in.nextInt();	//getting Array length
		a = new int[n];		//assigning array length
		for (i = 0; i < n; i++) 
        {
            a[i] = in.nextInt(); 		//Getting value for array
        }
        for (i = 0; i < n; i++)  		// Sorting Array in descending order
        {
            for (j = i + 1; j < n; j++) 
            {
                if (a[i] < a[j]) 
                {
                    temp = a[i];		//swapping process
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        min=a[0]-a[1];
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(min>a[i]-a[j])     // checking the min value
					min=a[i]-a[j];
			}
		}
		System.out.println(min);		//Min value Output
	}
}