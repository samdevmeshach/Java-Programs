import java.util.*;
import java.lang.*;
public class stringKeyMapping
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner (System.in); 
        int i,j,z;
        String s2= new String();
        System.out.println("Enter String : ");
        s2 = in.next();
        char s1[]= s2.toCharArray();            //Converting String To Character Array
        /*

        Loop to check the condition and replace the correct number

        */
        for(i = 0; i < s2.length(); i++)
        {
            if(s1[i]=='a' || s1[i]=='b' || s1[i]=='c' || s1[i]=='A' || s1[i]=='B' || s1[i]=='C')
            {
                s1[i]='2';
            }
            if(s1[i]=='d' || s1[i]=='e' || s1[i]=='f' || s1[i]=='D' || s1[i]=='E' || s1[i]=='F')
            {
                s1[i]='3';
            }
            if(s1[i]=='g' || s1[i]=='G' || s1[i]=='h' || s1[i]=='H' || s1[i]=='i' || s1[i]=='I')
            {
                s1[i]='4';
            }
            if(s1[i]=='j' || s1[i]=='J' || s1[i]=='k' || s1[i]=='K' || s1[i]=='l' || s1[i]=='L')
            {
                s1[i]='5';
            }
            if(s1[i]=='m' || s1[i]=='M' || s1[i]=='n' || s1[i]=='N' || s1[i]=='o' || s1[i]=='O')
            {
                s1[i]='6';
            }
            if(s1[i]=='p' || s1[i]=='P' || s1[i]=='q' || s1[i]=='Q' || s1[i]=='r' || s1[i]=='R' || s1[i]=='s' || s1[i]=='S')
            {
                s1[i]='7';
            }
            if(s1[i]=='t' || s1[i]=='T' || s1[i]=='u' || s1[i]=='U' || s1[i]=='v' || s1[i]=='V')
            {
                s1[i]='8';
            }if(s1[i]=='w' || s1[i]=='W' || s1[i]=='x' || s1[i]=='X' || s1[i]=='y' || s1[i]=='Y' || s1[i]=='z' || s1[i]=='Z')
            {
                s1[i]='9';
            }
        }
        System.out.println(s1);       
    }
}