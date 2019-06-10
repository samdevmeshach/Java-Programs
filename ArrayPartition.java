import java.util.*;
public class ArrayPartition
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner (System.in); 
        int n,i,j,temp,k,p,s=0,g=0,e=0,x;
        int a[],f[],l[];
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
        for (i = 0;i < n; i++)
        {
            if(a[i] == k)
                e++;
            else if(a[i] < k)
                s++;
            else if(a[i] > k)
                g++;
        }
        f = new int[s];
        l = new int[g];
        j = 0;
        p = 0;
        for (i = 0; i < n; i++)
        {
            if(a[i] < k)
            {
                f[j] = a[i];
                j++;
            }
            else if(a[i] > k && a[i] != k)
            {
                l[p] = a[i];
                p++;
            }
        }
        for(i = 0; i < s ; i++)        
        {                      
            for (j = i+1; j < s; j++)
            {
                if(f[i] < f[j])                
                {                       
                    temp = f[i];
                    f[i] = f[j];
                    f[j] = temp;
                }
            }
        }
        for(i = 0; i < g ; i++)        
        {                      
            for (j = i+1; j < g; j++)
            {
                if(l[i] < l[j])                
                {                       
                    temp = l[i];
                    l[i] = l[j];
                    l[j] = temp;
                }
            }
        }
        j = 0;
        p = 0;
        x = 0;
        for (i = 0; i < n; i++)   
        {
            if (j < s)
            {
                a[i] = f[j];
                j++;
                continue;
            }
            if (x < e)
            {
                a[i] = k;
                x++;
                continue;
            }
            if (p < g)
            {
                a[i] = l[p];
                p++;
            }

        }
        for (i = 0; i < n; i++)   
        {
            System.out.println(a[i]);
        }
    }
}