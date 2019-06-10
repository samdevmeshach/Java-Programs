import java.util.*;
public class RotateVowel
{
    public static void main(String[] args)  
    {
        Scanner in=new Scanner(System.in);      //To create Scanner obj
        char a[];
        int i,count=0,j=0;
        char s1[]=in.next().toLowerCase().toCharArray();     //Getting first input and converting into lowercase
        for (i = 0;i < s1.length; i++)
        {
            if(s1[i] =='a' || s1[i] =='e' || s1[i] =='i' || s1[i] =='o' || s1[i] =='u')
            {
                count++;            // Counting the number of vowels
            }
        }
        a = new char[count];        // creating char array with length of count
        for (i = 0;i < s1.length; i++)
        {
            if(s1[i] =='a' || s1[i] =='e' || s1[i] =='i' || s1[i] =='o' || s1[i] =='u')
            {
                a[j] = s1[i];                       // Assigning vowels to the char array
                j++;
            }
        }
        j=count-1;                                  // assign j as last
        for (i = 0;i < s1.length && j!=count; i++)
        {
            if(j == count-1)                        // if j equal to last index
            {
                if(s1[i] =='a' || s1[i] =='e' || s1[i] =='i' || s1[i] =='o' || s1[i] =='u')
                {
                    s1[i] = a[j];               // Change the last vowel to the first vowel
                    j=0;                            // Make j as starting index
                }       
            }
            else
            {
                if(s1[i] =='a' || s1[i] =='e' || s1[i] =='i' || s1[i] =='o' || s1[i] =='u')
                {
                    s1[i] = a[j];               // Change The consecutive vowel
                    j++;;
                }
            }
        }
        for (i=0;i<s1.length;i++)
        {
            System.out.print(s1[i]);            // Output
        }
    }
}