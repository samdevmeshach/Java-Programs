import java.util.*;
public class ReverseTheWordInSentence
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner (System.in); 
        int i,j,z=0,count = 1,n,t;
        char temp;
        String c1 = new String();
        System.out.println("Enter String 1 : ");
        c1 = in.nextLine();
        char s1[]= c1.toCharArray();            // Converting String to Char Array
        System.out.println("Enter The place of the word : ");
        n = in.nextInt();
        for (i = 0; i < s1.length && count <= n; i++)           // Loop for Reversing The Particular Word In The Sentence
        {
            if(count == n)                      // Condition To Check Count Value Equal To Input Value 
            {
              z = i;
                for(j = i; s1[j] != ' ' && j < s1.length-1; j++)            // Loop to Find The Reversing Word Length
                {
                    z = z + 1;
                }
                if(z != s1.length-1)            // If The Particular Word Selected is Last Word Make z-1
                  z--;
                t = z/2;
                for(j = i; t < z; j++)          // Loop To Reverse The Particular Word
                {
                    if(j != z)
                    {
                        temp = s1[j];
                        s1[j] = s1[z];          // Swapping The Elements To Reverse The Word
                        s1[z] = temp;
                        z--;
                    }
                    if(j == z)          // If j Equal To z Break The Loop
                      break;
                }
                break;
            }
            if(s1[i] == ' ')                // Condition To Find The Word Position Using The Word Count
            {
                count = count + 1;
                continue;
            }
        }
        System.out.println(s1);        //Answer String
    }
}