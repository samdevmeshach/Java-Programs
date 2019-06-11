import java.util.*;
public class CapitalEachFirstLetterOfWord
{
	public static void main(String[] args)	
	{
		Scanner in=new Scanner(System.in);      //To create Scanner obj
		int c=1,i,j,k,z;
		char temp;
		System.out.println("Enter String 1 : ");
		char s1[]=in.nextLine().toCharArray();     //Getting input and changing to char array					
		s1[0]=Character.toUpperCase(s1[0]);				// Change Starting Chatacter to upper case
		for(i = 1; i < s1.length-1; i++)
		{
			if(s1[i]==' ')				// Chnage 1 Character to upper case after the space 
				s1[i+1]=Character.toUpperCase(s1[i+1]);
		}
		System.out.println(s1);			// Output
	}
}