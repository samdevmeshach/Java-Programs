import java.util.*;
public class rotateArrayNTimes
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner (System.in); 
		int n,i,j,r,temp;
		int a[];   // creating interge array
		System.out.println("Enter Length Of Array");
		n = in.nextInt();	//getting Array length
		a = new int[n];		//assigning array length
		System.out.println("How many rotation to be done : ");
		r = in.nextInt();		//Getting Number of rotation
		System.out.println("Enter array values : ");
		for (i = 0; i < n; i++) 
        {
            a[i] = in.nextInt(); 		//Getting value for array
        }
        for(i=0;i<r;i++)		// Loop for rotation
        {
        	temp=a[0];			//temp variable to store first value
        	for(j=1;j<n;j++)
        	{
        		a[j-1]=a[j];
        	}
        	a[n-1]=temp;		//Assigning First value to the last
        }
        System.out.print("Output : ");
        for(i=0;i<n;i++)
        {
        	System.out.print(a[i] + "\t");			//Output array
        }
	}
}