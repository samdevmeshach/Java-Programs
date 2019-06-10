import java.util.*;
public class MinimumCoins
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner (System.in); 
        int n,c=0,temp;
        System.out.println("Enter Amount : ");
        n = in.nextInt();
        while (n != 0)              // If the Amount is greater than 25
        {
            if(n >= 25)
            {
                temp = n/25;
                c = c + temp;       // Increment with Quotient
                n = n - (25 * temp);
            }
            else if (n >= 10)       // If the Amount is greater than 10
            {
                temp = n/10;
                c = c + temp;       // Increment with Quotient
                n = n - (10 * temp);    
            }
            else if (n >= 5)        //If the Amount is greater than 5
            {
                temp = n/5;
                c = c + temp;               // Increment with Quotient
                n = n - (5 * temp);         
            }
            else if (n > 5)         // If the Amount is less than 5
            {
                c = c + n;        // Increment With Remaining Amount
            }
        }
        System.out.println("Total Coins : " + c);
    }
}