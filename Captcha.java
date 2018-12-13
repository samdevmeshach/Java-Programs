/*Generating Captcha
By Sam Dev Meshach on 10-12-2018
*/
import java.util.*;     //package for using Scanner
import ran.*;      //User Defined package for Random Captcha Generation
class Captcha 
{
	public static void main(String[] args) //Starting Ponit (or) Main Method
	{
		int flag=0;     //To run the loop until User Enter correct Captcha
		Pack p=new Pack();       //opject for the class in the package ran
		Scanner input=new Scanner(System.in);      //To create Scanner Obj
		System.out.println("Enter Captcha : ");      //Print stmt
		while(flag!=1)//condition 
		{
			String s2=p.gen();       //Accessing gen method in the class Pack
			System.out.println(s2);       //printing the captcha
			String s1=input.next();       //getting the input of captcha
			if(s1.equals(s2))       /*condition to check the user Entertred captcha match with Randomly generated captcha*/
			{
				System.out.println("True");
				flag=1;     //Incremented when condition is true 
			}
			else
			{
				System.out.println("Retype captcha : ");
			}
		}
	}
}