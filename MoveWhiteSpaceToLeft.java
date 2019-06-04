import java.util.*;
public class MoveWhiteSpaceToLeft
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner (System.in); 
        int count = 0;
        String output;
        System.out.println("Enter String 1 : ");
        String s1 = in.nextLine();
        
        for (int i = 0; i < s1.length(); i++)           // Loop to find the Space count and make character alone in seperate Array
        {
            if(s1.charAt(i)==" ")
                    count++;
        }
        for(int i=0; i<count; i++){
                output+=" ";

        } 
        output +=  s1.replaceAll(" ","");        //Output String
}
}