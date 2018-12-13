import java.util.*;
public class Anagram
{
	public static void main(String[] args)	
	{
		Scanner in=new Scanner(System.in);      //To create Scanner obj
		char s1[]=in.next().toLowerCase().toCharArray();     //Getting first input and converting into lowercase
		char s2[]=in.next().toLowerCase().toCharArray();     //Getting first input and converting into lowercase
		if(s1.length!=s2.length)		//If the length is not matched
			System.out.println("Not an Anagram");
		else				//If the length match
		{
			Arrays.sort(s1);		//Method to Sort s1
			Arrays.sort(s2);		//Method to Sort s2
			String s3=new String(s1);	//Converting Char Array s1 to String s3
			String s4=new String(s2);	//Converting Char Array s1 to String s4
			if(s3.equals(s4))	//If Both the Strings are Equal
				System.out.println("Is an Anagram");
			else		//If Both the Strings are Not Equal
				System.out.println("Is not Anagram");
		}
	}
}