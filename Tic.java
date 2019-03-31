import java.util.Random;
import java.util.Scanner;
public class Tic
{
	public int getno(int m[][],int n[])  // Method to Verify WIN or LOSS
	{
		int q;
		Random r=new Random();
		int x=0,w;
		int a0,a1,a2,a3,a4,a5,a6,a7,a8;
		a0=m[0][0]+m[1][0]+m[2][0];   // Adding First Column
		a1=m[0][1]+m[1][1]+m[2][1];   // Adding Second Column
		a2=m[0][2]+m[1][2]+m[2][2];   // Adding Third Column
		a3=m[0][0]+m[0][1]+m[0][2];   // Adding First Row
		a4=m[1][0]+m[1][1]+m[1][2];   // Adding Second Row
		a5=m[2][0]+m[2][1]+m[2][2];   // Adding Third Row
		a6=m[0][0]+m[1][1]+m[2][2];   // Adding First Diagonal
		a7=m[0][2]+m[1][1]+m[2][0];   // Adding Second Diagonal
		

		if(m[1][1]==0)    // Condition to fill center if not filled by the user
			return 4;

			/*  1. First constriant : 
						Condition to Block the winning...
				2. Secont constraint :
						Condition to make Computer win the game... 
			*/
		else if(a6==-2)   //Diagonal 1
		{	
			if(n[0]==0)
				return 0;
			if(n[8]==0)
				return 8;
			if(n[4]==0)
				return 4;
		}
		else if(a7==-2)	  //Diagonal 2
		{	
			if(n[2]==0)
				return 2;
			if(n[6]==0)
				return 6;
			if(n[4]==0)
				return 4;
		}
		else if(a0==-2)   //First column
		{	
			if(n[0]==0)
				return 0;
			if(n[6]==0)
				return 6;
			if(n[3]==0)
				return 3;
		}
		else if(a1==-2)   //Second column
		{	
			if(n[1]==0)
				return 1;
			if(n[4]==0)
				return 4;
			if(n[7]==0)
				return 7;
		}
		else if(a2==-2)   //Third Column
		{	
			if(n[2]==0)
				return 2;
			if(n[8]==0)
				return 8;
			if(n[5]==0)
				return 5;
		}
		else if(a3==-2)	  //First Row
		{	
			if(n[0]==0)
				return 0;
			if(n[2]==0)
				return 2;
			if(n[1]==0)
				return 1;
		}
		else if(a4==-2)   //Second Row
		{	
			if(n[3]==0)
				return 3;
			if(n[4]==0)
				return 4;
			if(n[5]==0)
				return 5;
		}
		else if(a5==-2)   //Third Row
		{	
			if(n[6]==0)
				return 6;
			if(n[7]==0)
				return 7;
			if(n[8]==0)
				return 8;
		}
		else if(a6==2)
		{	
			if(n[0]==0)
				return 0;
			if(n[8]==0)
				return 8;
			if(n[4]==0)
				return 4;
		}
		else if(a7==2)
		{	
			if(n[2]==0)
				return 2;
			if(n[6]==0)
				return 6;
			if(n[4]==0)
				return 4;
		}
		else if(a0==2)
		{	
			if(n[0]==0)
				return 0;
			if(n[6]==0)
				return 6;
			if(n[3]==0)
				return 3;
		}
		else if(a1==2)
		{	
			if(n[1]==0)
				return 1;
			if(n[4]==0)
				return 4;
			if(n[7]==0)
				return 7;
		}
		else if(a2==2)
		{	
			if(n[2]==0)
				return 2;
			if(n[8]==0)
				return 8;
			if(n[5]==0)
				return 5;
		}
		else if(a3==2)
		{	
			if(n[0]==0)
				return 0;
			if(n[2]==0)
				return 2;
			if(n[1]==0)
				return 1;
		}
		else if(a4==2)
		{	
			if(n[3]==0)
				return 3;
			if(n[4]==0)
				return 4;
			if(n[5]==0)
				return 5;
		}
		else if(a5==2)
		{	
			if(n[6]==0)
				return 6;
			if(n[8]==0)
				return 8;
			if(n[7]==0)
				return 7;
		}
		else if(a6==1 || a6==-1)
		{	
			if(n[2]==0)
				return 2;
			else if(n[6]==0)
				return 6;
			else if(n[0]==0)
				return 0;
			else if(n[3]==0)
				return 3;
			else if(n[1]==0)
				return 1;

		}
		else if(a7==1 || a7==-1)
		{	
			if(n[0]==0)
				return 0;
			else if(n[8]==0)
				return 8;
			else if(n[2]==0)
				return 2;
			else if(n[5]==0)
				return 5;
			else if(n[1]==0)
				return 1;
		}
		else if(a0==1 || a0==0)
		{	
			if(n[0]==0)
				return 0;
			if(n[6]==0)
				return 6;
			if(n[3]==0)
				return 3;
		}
		else if(a1==1 || a1==0)
		{	
			if(n[1]==0)
				return 1;
			if(n[4]==0)
				return 4;
			if(n[7]==0)
				return 7;
		}
		else if(a2==1 ||a2==0)
		{	
			if(n[2]==0)
				return 2;
			if(n[8]==0)
				return 8;
			if(n[5]==0)
				return 5;
		}
		else if(a3==1|| a3==0)
		{	
			if(n[0]==0)
				return 0;
			if(n[2]==0)
				return 2;
			if(n[1]==0)
				return 1;
		}
		else if(a4==1 || a4==0)
		{	
			if(n[3]==0)
				return 3;
			if(n[4]==0)
				return 4;
			if(n[5]==0)
				return 5;
		}
		else if(a5==1 || a5==0)
		{	
			if(n[6]==0)
				return 6;
			if(n[8]==0)
				return 8;
			if(n[7]==0)
				return 7;
		}
		else if(m[1][1]==1 && n[0]==0)
		{
			w=0;
			while(w==0)
			{
				x=r.nextInt(9);
				if(x==0||x==2||x==6||x==8)
				{
					w=1;
					break;
				}
			}
			return x;
		}
		
		return -1;
	}
	public boolean isWin(int player,int t[][] )
	{
		return ((t[0][0] + t[0][1] + t[0][2] == player*3) ||
				(t[1][0] + t[1][1] + t[1][2] == player*3) ||
				(t[2][0] + t[2][1] + t[2][2] == player*3) ||
				(t[0][0] + t[1][0] + t[2][0] == player*3) ||
				(t[0][1] + t[1][1] + t[2][1] == player*3) ||
				(t[0][2] + t[1][2] + t[2][2] == player*3) ||
				(t[0][0] + t[1][1] + t[2][2] == player*3) ||
				(t[2][0] + t[1][1] + t[0][2] == player*3));
	}
	public void printx(char t[][])
	{
		int i,j,z=0;
		System.out.println();
		System.out.println();
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(z+" "+t[i][j]+"     ");
				z++;
			}
			System.out.println();
			System.out.println();
			System.out.println();
		}	
	}
	public static void main(String[] args)
	{
		
		Random rand=new Random();
		Tic c=new Tic();
		int i,j,n,flag=0,w;
		char ch1;
		int mat[][]=new int[3][3];
		char t[][]=new char[3][3];
		Scanner in=new Scanner(System.in);
		int x[] ={0,0,0,0,0,0,0,0,0};
		System.out.println("Welcome to Tic-Tac-Toe Game");
		for(i=0;i<9;i++)
		{
			c.printx(t);
			if(i>4)
			{
				if(c.isWin(1,mat))
				{
					c.printx(t);	
					System.out.println("x Wins");
					System.exit(0);
				}	
				else if(c.isWin(-1,mat))
				{
					c.printx(t);	
					System.out.println("o Wins");
					System.exit(0);
				}
			}
			System.out.println("Enter box no : ");
			if(i%2==0)
			{	
				n=in.nextInt();
				ch1='x';
			}
			else
			{
				n=c.getno(mat,x);
				System.out.println(n);
				ch1='o';
			}		
			if(x[n]==0)
			{
				switch(n)
				{
					case 0:
						t[0][0]=ch1;
						if(t[0][0]=='x')
							mat[0][0]=1;
						else
							mat[0][0]=-1;
						x[n]=1;
						break;
					case 1:
						t[0][1]=ch1;
						if(t[0][1]=='x')
							mat[0][1]=1;
						else
							mat[0][1]=-1;
						x[n]=1;
						break;
					case 2:
						t[0][2]=ch1;
						if(t[0][2]=='x')
							mat[0][2]=1;
						else
							mat[0][2]=-1;
						x[n]=1;
						break;
					case 3:				
						t[1][0]=ch1;
						if(t[1][0]=='x')
							mat[1][0]=1;
						else
							mat[1][0]=-1;
						x[n]=1;
						break;
					case 4:
						t[1][1]=ch1;
						if(t[1][1]=='x')
							mat[1][1]=1;
						else
							mat[1][1]=-1;
						x[n]=1;
						break;
					case 5:
						t[1][2]=ch1;
						if(t[1][2]=='x')
							mat[1][2]=1;
						else
							mat[1][2]=-1;
						x[n]=1;
						break;
					case 6:
						t[2][0]=ch1;
						if(t[2][0]=='x')
							mat[2][0]=1;
						else
							mat[2][0]=-1;
						x[n]=1;
						break;
					case 7:
						t[2][1]=ch1;
						if(t[2][1]=='x')
							mat[2][1]=1;
						else
							mat[2][1]=-1;
						x[n]=1;
						break;
	 				case 8:				
						t[2][2]=ch1;
						if(t[2][2]=='x')
							mat[2][2]=1;
						else
							mat[2][2]=-1;
						x[n]=1;
						break;
				}
			}
			
			else
			{	
				System.out.println("Invalid");
				i--;
				continue;
			}
			
		}
		if(flag==0)
		{
			System.out.println("Game Ties!!!");
		}	
		
	}
}			