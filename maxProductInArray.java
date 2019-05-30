import java.util.*;
public class maxProductInArray
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner (System.in); 
		int n,m,i,j,temp,max;
		int a[];
		System.out.println("Enter Array Size : ");
		n = in.nextInt();
		a = new int[n];
        System.out.println("Enter Array Value : ");
		for (i = 0; i < n; i++)   
        {
            a[i] = in.nextInt();			// Getting Array Values
        }
        for (i = 0; i < n; i++)				// Sorting Array in the descending order
        {
        	for (j = i+1; j < n; j++)
        	{
        		if(a[i] < a[j])
        		{
        			temp = a[i];
        			a[i] = a[j];
        			a[j] = temp;  
        		}
        	}
        }
        max = a[0] * a[1];				// Multiply First Two elements to Get MaxProduct In Array
        System.out.println(max);
	}
}