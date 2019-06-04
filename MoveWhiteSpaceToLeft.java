import java.util.*;
public class MoveWhiteSpaceToLeft
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner (System.in); 
        int i,j=0,z=0,count = 0,n,t;
        char temp;
        String c1 = new String();
        System.out.println("Enter String 1 : ");
        c1 = in.nextLine();
        char s1[]= c1.toCharArray();            // Converting String to Char Array
        char s2[] = new char[20];
        for (i = 0; i < s1.length; i++)           // Loop to find the Space count and make character alone in seperate Array
        {
            if(s1[i] == ' ')
            {
                count = count + 1;
                continue;
            }
            else
            {
                s2[z] = s1[i];          // Copying Character alone in tha Array
                z++;
            }
            s2[z]='\0';                 // Assign Last Character As Null Character
        }
        for (i = 0; i < s1.length; i++)             // Loop to Make the Space in Left and Character On the Right
        {
            if(count != 0)                          // Assign Space Untill Count Value Get Zero
            {
                s1[i]=' ';
                count--;
            }
            else
            {
                s1[i]=s2[j];                    // After Count Getting 0 Assign Character One By One In The Same Array
                j++;
            }
        }
        System.out.println(s1);        //Output String
    }
}