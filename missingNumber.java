import java.util.*;
public class missingNumber
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner (System.in); 
        int n,i,j,temp,k = 1;
        int a[];
        System.out.println("Enter Array Size : ");
        n = in.nextInt();
        a = new int[n];
        System.out.println("Enter Array Value : ");
        for (i = 0; i < n; i++)   
        {
            a[i] = in.nextInt();            // Getting Array Values
        }
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
        for (i = 0; i < n; i++)
        {
            if(a[i] == k)           // Checking Number 1 to n 
            {
                k++;                // If the Number present already Increment K by 1
            }
            else
            {
                System.out.println(k);          // If the Element is Missing
                break;
            }
        }
        if(k == n + 1)
            System.out.println("-1");           // If all the element is present Print -1
    }
}