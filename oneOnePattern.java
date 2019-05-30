import java.util.*;
public class oneOnePattern
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner (System.in); 
		int n,m,i,j,s,c=1;
		System.out.println("Enter Array Size : ");
		n = in.nextInt();
        System.out.println("Enter Array Value : ");
		for(i=0; i<n+1; i++)
        {
            for(s=1; s <= n-i; s++)             // Loop For space
                System.out.print("  ");

            for(j=0; j <= i; j++)               // Loop to find the coefficient
            {
                if (j==0 || i==0)
                    c = 1;
                else
                    c = c*(i-j+1)/j;

                System.out.print("   " + c);        // Printing The Coefficient With Space 
            }
            System.out.println();           // To Generate New Line
        }
	}
}