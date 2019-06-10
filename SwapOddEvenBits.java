import java.util.*;
import java.lang.Math;
public class SwapOddEvenBits
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner (System.in); 
        int n,i=0,j,temp,t,c=0,x=0;
        long sum=0;
        int a[];
        System.out.println("Enter Array Size : ");
        n = in.nextInt();
        System.out.println("Enter Array Value : ");
        temp = n;
        while (temp !=0)
        {
            temp = temp/2;
            c++;
        }
        a = new int[c];
        temp = n;
        while (temp != 0)               // Finding Binary Digits
        {
            x = temp%2;
            a[i] = x;
            temp = temp/2;
            i++;
        }
        for (i = 0,j=c-1; i < c/2; i++,j--)
        {
            if(i != j)                      // Reversing The Binary Values
            {
                t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
        }
        for (i = 0; i < c-1; i++)
        {
            temp = a[i];                    // Swapping Odd and Even
            a[i] = a[i+1];
            a[i+1] = temp;
            i++;
        }
        for (i = 0,j=c-1; i < c/2; i++,j--)
        {
            if(i != j)
            {
                t = a[i];           // Again Reversing The Binary Values
                a[i] = a[j];
                a[j] = t;
            }
        }
        for(i = 0; i < c; i++)
        {
            sum +=a[i] * (Math.pow(2, i));              // Calculate The Binary Eqivalent Value 
        }  
        System.out.print(sum);              // Print The value
    }
}