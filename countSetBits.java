import java.util.*;
public class countSetBits
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner (System.in); 
		int n,i,j,count=0,temp;
		System.out.println("Enter Number : ");
		n = in.nextInt();
		for (i = 0; i <= n; i++) 
        {
            temp=i;				// Assigning Each Value in temp
            while(temp!=0)
            {
            	if(temp%2==1)		//checking the bits contains 1
            		count=count+1;
            	temp=temp/2;
            } 		
        }
        System.out.println(count);		//Total bits count
	}
}