import java.util.*;
public class geeksCoffee
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner (System.in); 
		int n,m,i;
		System.out.println("Enter N Value : ");
		n = in.nextInt();
        System.out.println("Enter M Value : ");
        m = in.nextInt();
		for (i = 1; i < m; i++)       // Loop for calculating Mth unit coffee Consumed
        {
            n=n/2;
        }
        System.out.println(n);		// Total Number of units
	}
}