import java.util.*;
public class genBinaryNos
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner (System.in); 
		int n,i,z,j=0,x,temp,count=0;
		System.out.println("Enter Number : ");
		n = in.nextInt();
		for (i = 1; i <= n; i++) 
        {
            int a[] = new int[10];
            temp=i;				// Assigning Each Value in temp
            while(temp!=0)
            {
            	x=temp%2;		
            	a[j]=x;        //Assigning Remainder value in the array
            	temp=temp/2;
                j++;            //Incrementing the array index
                count=count+1;      //count variable to identify the array size
            } 		
            j=0;            //For next cycle make array index as 0
            for(z=count-1;z>=0;z--)             //loop to print in reverse order
            {
                System.out.print(a[z]);
            }
            count = 0;         //For next Cycle make array size (count) as 0
            System.out.print("\t");
        }
	}
}