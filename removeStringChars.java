import java.util.*;
public class removeStringChars
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner (System.in); 
		int i,j,z;
        String c1 = new String();
        String c2 = new String();
		System.out.println("Enter String 1 : ");
		c1 = in.next();
        char s1[]= c1.toCharArray();            // Converting String to Char Array
        System.out.println("Enter String 2 : ");
        c2 = in.next();
        char s2[]= c2.toCharArray();            // Converting String to Char Array
		for (i = 0; i < s2.length; i++)           // Loop for second string
        {
            for (j = 0; j < s1.length; j++)         // Loop for the first String
            {
                if(s1[j]==s2[i])                //checking String s1 and s2
                {
                    for(z = j; z < s1.length-1; z++)
                    {
                        s1[z]=s1[z+1];          //Deleting The Particular element from the string
                    }
                    s1[z]='\0';             // Making Last Index as Null
                    j--;            //Decrementing the Second loop for checking adjacent character or consecutive character
                }           
            } 		
        }
        System.out.println(s1);		//Answer String
	}
}