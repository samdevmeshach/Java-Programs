import java.util.*;
public class maxMoney
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner (System.in); 
		int n,i,money=0,m;
		int a[];   // creating interge array
		System.out.println("Enter No of Houses : ");
		n = in.nextInt();	//getting No of Houses
		System.out.println("Enter Money : ");
		m = in.nextInt();	
		a = new int[n];		//Getting Money
		for (i = 0; i < n; i++) 
        {
            a[i] = m; 		//Assigning Money to the array
        }
		for(i=0;i<n;i++)
		{
			if(i%2==0)		// Condition for checking Not an Adjacent
				money=money+m;
		}
		System.out.println("Total Money Stolen : " +money);		//Maxmimum Money Can be stolen by Thief
	}
}