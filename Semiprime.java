import java.util.*;
public class Semiprime
{
    public static void main(String[] args)    
    {
        Scanner in=new Scanner(System.in);      
        int num,x=0,i,j,m,z,flag=0,c=0;
        System.out.println("Enter a number : ");
        num = in.nextInt();
        for(z = 1;c<num; z++)			// Loop to run n Times
        {
            int a[] = new int[10];
            flag=0;
            for(i=2;i<z;i++)			// Loop to find factor of the given Number
            {
                if(z%i==0)
                {
                    a[x] = i;			// Store the factor in seperate array
                    x++;
                }
            }
            if(x==0)	
              continue;					// If there is no Factor continue
            for(j=0;j<x;j++)
            {
                for(m=2;m<=a[j]/2;m++)		// Loop to find Semiprime or Not
                {
                    if(a[j]%m==0)
                    {
                        flag = 1;
                        break;
                    }
                }
            }
            if(flag == 0)
            {
                System.out.println(z);
                c++;						// Make a count of Semiprime number
            }
            x=0;
        }
    }
}