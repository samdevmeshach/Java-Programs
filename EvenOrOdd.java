import java.util.*;
public class EvenOrOdd
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner (System.in); 
		int number;
        System.out.println("Enter First Value : ");
        number = in.nextInt();
        if( (number&1) == 0)                // Bitwise Operator to Find odd or even
        {
            System.out.printf( number + " is even %n");
        }
        else
        {
            System.out.printf( number + " is odd %n");
        }   
	}
}