import java.util.*;
public class commonElements
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner (System.in); 
		int n1,n2,n3,i,j,z,cc = 0;
		int a[],b[],c[];
		System.out.println("Enter Array Size : ");
		n1 = in.nextInt();
		a = new int[n1];
        System.out.println("Enter Array Value : ");
		for (i = 0; i < n1; i++)   
        {
            a[i] = in.nextInt();			// Getting First Array Values
        }
        System.out.println("Enter Array Size : ");
        n2 = in.nextInt();
        b = new int[n2];
        System.out.println("Enter Array Value : ");
        for (i = 0; i < n2; i++)   
        {
            b[i] = in.nextInt();            // Getting Second Array Values
        }
        System.out.println("Enter Array Size : ");
        n3 = in.nextInt();
        c = new int[n3];
        System.out.println("Enter Array Value : ");
        for (i = 0; i < n3; i++)   
        {
            c[i] = in.nextInt();            // Getting Third Array Values
        }
        for(i = 0; i < n1 && cc != 1; i++)        // Loop to find First Common elements in all Three array
        {                      
            for (j = 0; j < n2; j++)
            {
                if(a[i] == b[j])                // If a[i] and b[j] are equal then Increment cc by 1 and break the loop
                    cc = cc + 1;
            }
            for (z = 0; z < n3; z++)
            {
                if(a[i] == c[z])                // If a[i] and c[j] are equal then Increment cc by 1 and break the loop
                    cc = cc + 1;
            }
            if(cc == 2)                     // If cc is 2 Then there is a Common Element
            {
                System.out.print(a[i] + "  ");
                cc = 0;
            }
        }
	}
}