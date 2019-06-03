import java.util.*;
public class nonRepeatNum
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner (System.in); 
        int n,i,j,c,k,temp;
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
        for(i = 0; i < n ; i++)        // Loop to Find No Repeating Element
        {   
            c = 0;                   
            for (j = i+1; j < n; j++)
            {
                if(a[i] == a[j])                // If a[i] and a[j] are Equal Increment C value
                {                       
                    c = c + 1;
                }
            }
            i = i + c;                  // To Minimize the Repeated Iteration
            if(c == 0)
            {
                System.out.print(a[i]);
                System.exit(0);
            }
        }
    }
}