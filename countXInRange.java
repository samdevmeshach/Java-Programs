import java.util.*;
public class countXInRange
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner (System.in); 
		int x,a,b,i,count=0,temp,m;
		System.out.println("Enter X Value : ");
		x=in.nextInt();
		System.out.println("Enter Lower Bound Value : ");
		a=in.nextInt();
		System.out.println("Enter Upper Bound Value : ");
		b=in.nextInt();
		for (i=a+1;i<b;i++) //loop to run from lower bound to upper bound
		{
			temp=i;			//Taking a individual value
			while(temp>0) 		//loop run untill it becomes less than 0
			{
				m=temp%10;   // seperating each value
				if(m==x)		//comparing X value with seperated value
				{
					count=count+1;    // if X value matchs make a count
				}
				temp=temp/10;		// Remove the last digit	
			}
		}
		System.out.println(count);   // Output count
	}
}