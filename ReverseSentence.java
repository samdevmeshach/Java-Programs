import java.util.*;
public class ReverseSentence
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner (System.in); 
        int n,i;
        String s1;
        s1 = in.nextLine() 
        String[] words=s1.split("\\s");             //splits the string based on whitespace   
        for(i = words.length-1;i>=0;i--)           // Print the array in the reverse order
        {  
            System.out.print(words[i] + " ");  
        }  
    }
}