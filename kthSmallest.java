import java.util.*;
public class kthSmallest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner (System.in); 
        int n,i,j,temp,k;
        int a[];
        System.out.println("Enter Array Size : ");
        n = in.nextInt();
        a = new int[n];
        System.out.println("Enter Array Value : ");
        for (i = 0; i < n; i++)   
        {
            a[i] = in.nextInt();            // Getting Array Values
        }
        System.out.println("Enter K Value : ");
        k = in.nextInt();                   // Getting Kth Value
        for(i = 0; i < n ; i++)        // Loop to Arrange the Array in Ascending Order
        {                      
            for (j = i+1; j < n; j++)
            {
                if(a[i] > a[j])                // If a[i] Greater Than a[j] Swap Them Using Temp
                {                       
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Kth Element is : " + a[k-1]);
    }
}