import java.util.*;
public class Anagram
{
	public static void main(String[] args)	
	{
		Scanner in=new Scanner(System.in);
		char s1[]=in.next().toLowerCase().toCharArray();
		char s2[]=in.next().toLowerCase().toCharArray();
		if(s1.length!=s2.length)
			System.out.println("Not an Anagram");
		else
		{
			Arrays.sort(s1);
			Arrays.sort(s2);
			String s3=new String(s1);
			String s4=new String(s2);
			if(s3.equals(s4))
				System.out.println("Is an Anagram");
			else
				System.out.println("Is not Anagram");
		}
	}
}