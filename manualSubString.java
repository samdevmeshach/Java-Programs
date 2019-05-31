import java.util.*;
public class manualSubString
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner (System.in); 
		int i,j=0,count=0,ans=-1;
        String c1 = new String();
        String c2 = new String();
		System.out.println("Enter String 1 : ");
		c1 = in.next();
        char s1[]= c1.toCharArray();            // Converting String to Char Array
        System.out.println("Enter String 2 : ");
        c2 = in.next();
        char s2[]= c2.toCharArray();            // Converting String to Char Array
		for (i = 0; i < s1.length-2 && j < s2.length; i++)           
        {
            if(s1[i]==s2[j] && count != s2.length)              // Checking The character if it is equal increment j and count
            {
                count=count+1;
                j++;
                continue;
            }	
            else                    // If Not Equal set j=0 and count=0 
            {       
                count=0;                
                j=0;
                continue;
            }
        }
        if(count==s2.length)            // IF The Word count match Print The Starting Index  
        {   
            ans=i-count;            //To Find Starting Index Value
        }
        System.out.println(ans);
	}
}