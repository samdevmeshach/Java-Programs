import java.util.*;
public class IsStringRotated
{
	public static void main(String[] args)	
	{
		Scanner in=new Scanner(System.in);      //To create Scanner obj
		int c=1,i,j,k,z;
		char temp;
		System.out.println("Enter String 1 : ");
		char s1[]=in.next().toCharArray();     //Getting first input
		System.out.println("Enter String 2 : "); 
		char s2[]=in.next().toCharArray();     //Getting Second input
		if(s1.length!=s2.length)		//If the length is not matched
			System.out.println("False");
		else				//If the length match
		{
			for (i = 0; i < s1.length; i++) 
			{
				c = 0;
				temp=s2[0];			//temp variable to store first value
        		for (j = 1; j < s2.length; j++)
        		{		
        			s2[j-1]=s2[j];				// Rotating The String
        		}
        		s2[s2.length-1]=temp;	
				for (z = 0;z < s1.length; z++)			// Loop for checking Each rotated string
				{
					if(s1[z] != s2[z])
					{
						c = 1;
					}
				}
				if(c == 0)			// If the answer found terminate using break
					break;
			}
			if(c != 1)
			{
				System.out.println("True");
				System.exit(0);
			}
			else
			{
				System.out.println("False");
			}
		}
	}
}