package ran;
import java.util.*;
public class Pack
	{
	public String gen()
	{
		StringBuffer str=new StringBuffer();
    		Random rnd= new Random();
 
		//To generate random number 
		
		int x=rnd.nextInt(10);
		String in1=Integer.toString(x); 
		str.append(in1);
		
		//To generate random LowerCase char 
		
		char ch = (char) (rnd.nextInt(26) + 'a');
		String in2=Character.toString(ch);
		str.append(in2);
		
		//To generate random LowerCase char 

		char ch1 = (char) (rnd.nextInt(26) + 'A');
		String in3=Character.toString(ch1);
		str.append(in3);
		
		//To generate random LowerCase char 

		int y=rnd.nextInt(10);
		String in4=Integer.toString(y); 
		str.append(in4);
		
		//To generate random LowerCase char 

		char ch11 = (char) (rnd.nextInt(26) + 'A');
		String in5=Character.toString(ch11);
		str.append(in5);
		
		//To generate random LowerCase char 

		char ch2 = (char) (rnd.nextInt(26) + 'a');
		String in6=Character.toString(ch2);
		str.append(in6);
		
		//To generate random number
		
		int z=rnd.nextInt(10);
		String in7=Integer.toString(x); 
		str.append(in7);
		
		//Converting StringBuffer to String and Return to the Main Program 

		return str.toString();
	}
}