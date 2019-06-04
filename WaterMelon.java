import java.util.*;
public class WaterMelon
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner (System.in); 
        int n,temp;
        System.out.println("Enter WaterMelon Size : ");
        n = in.nextInt();
        if(n >= 1 && n <= 100)              // Number Should be Between 1 and 100       
        {
            if(n % 2 == 0 && n != 2)            // Input Should Not be odd or Number 2 (Because It Can't Be Shared)
            {
                temp = n/2;
                    if (temp%2 != 0)            // If The Divided Size is Odd Add 1 With first Size and Sub 1 With Second Size
                    {
                        System.out.println(temp + 1);
                        System.out.println(temp - 1); 
                    }
                    else                    // If The Divided Size is even No Change
                    {
                        System.out.println(temp);
                        System.out.println(temp); 
                    }
            }
            else
            {
                System.out.println("Entered WaterMelon Size Is Unable To Share");    // Error Message When it is odd Number or 2
            }
        }
        else
        {
            System.out.println("Entered WaterMelon Size Between 1 - 100");      // Error Message for Exceding Limit
        }

    }
}