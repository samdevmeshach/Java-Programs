import java.util.*;
public class CheckIfEqual
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner (System.in); 
		int x,y;
        System.out.println("Enter First Value : ");
        x = in.nextInt();                                           // Getting First Number
        System.out.println("Enter Second Value : ");
        y = in.nextInt();                                           // Getting Second Number
        if((x ^ y) !=  0)                       // Using XOR Check the given value 
            System.out.println("Not Equal");
        else
            System.out.println("Equal");
	}
}