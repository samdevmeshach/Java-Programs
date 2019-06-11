import java.util.*;
public class RevEachWordInString 
{  
	public static String reverseWord(String str)
	{  
    	String words[]=str.split("\\s");  			// Splitting the words
    	String reverseWord="";  
    	for(String w:words)
    	{  
        	StringBuilder sb=new StringBuilder(w);  // Assigning Single word 
        	sb.reverse();  
        	reverseWord+=sb.toString()+" ";  		// Reversing the word
    	}  
    	return reverseWord.trim();  			// To Remove Unwanted White Spaces
	}  
	public static void main(String[] args) 
	{  
		Scanner in = new Scanner(System.in);
		String s1;
		s1 = in.nextLine();
    	System.out.println(RevEachWordInString.reverseWord(s1));  		// Calling method
    }  
}  