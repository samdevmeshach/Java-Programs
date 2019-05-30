import java.util.*;
public class greatOnRight
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner (System.in); 
		int n,i,j,max,count=0,temp;
        int a[],b[];
		System.out.println("Enter Array Size : ");
		n = in.nextInt();
        a = new int[n];
        b = new int[n];
        System.out.println("Enter Array Values : ");
		for (i = 0; i < n; i++) 
        {
            a[i] = in.nextInt();
        }
        for(i=0;i<n-1;i++)
        {
            max=a[i+1];                 // Assigning i+1 element as max
            for(j=i+1;j<n-1;j++)        // Loop to find greater element on right Side
            {
                if(max<a[j+1])          //Condition to check maximum element
                    max=a[j+1];
            }
            b[i]=max;
        }
        b[n-1]=-1;                      //Assigning last value as -1
        System.out.print("Answer : ");
        for (i = 0; i < n; i++)             // Loop to print the Output
        {
            System.out.print(b[i] + "\t");
        }
	}
}