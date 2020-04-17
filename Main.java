import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		char c[] = in.next().toCharArray();
		String player[] ={"p1","p2","p3","p4","p5","p6","p7","p8","p9","p10","p11"};
		int run[] = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
		int strike=0,non_strike=1,change=2,extras=0,total=0,wickets=0,r_wickets=10;
		double ball = 0.0,over = 0.0;
		run[strike] = 0;
		run[non_strike] = 0;
		for(int i=0;i<c.length;i++)
		{
		    if(c[i] == '2')
		    {
		        run[strike] += 2;
		        ball += 0.1;
		    }
		    if(c[i] == '4')
		    {
		        run[strike] += 4;
		        ball += 0.1;
		    }
		    if(c[i] == '6')
		    {
		        run[strike] += 6;
		        ball += 0.1;
		    }
		    if(c[i] == '1')
		    {
		        run[strike] += 1;
		        ball += 0.1;
		        int temp = strike;
		        strike = non_strike;
		        non_strike = temp;
		    }
		    if(c[i] == '3')
		    {
		        run[strike] += 3;
		        ball += 0.1;
		        int temp = strike;
		        strike = non_strike;
		        non_strike = temp;
		    }
		    if(c[i] == '.')
		        ball += 0.1;
		    if(c[i]=='W')
		        extras++;
		    if(c[i]=='O')
		    {
		        strike = change;
		        run[strike] = 0;
		        change++;
		        wickets++;
		        r_wickets--;
		        ball += 0.1;
		    }
		    if(ball == 0.6)
		    {
		        int temp = strike;
		        strike = non_strike;
		        non_strike = temp;
		        ball = 0.0;
		        over += 1;
		    }
		}
		over += ball;
		for(int i=0;i<run.length;i++)
		{
		    if(run[i]==-1)
		        break;
		    else
		    {
		        System.out.println(player[i] + " = " + run[i]);
		        total += run[i];
		    }
		}
		System.out.println("Strike : " +player[strike]);
		System.out.println("Non_strike : "+player[non_strike]);
		System.out.println("Total : " + (total+extras));
		System.out.println("Over : " + over);
		System.out.println("Extras : " + extras);
		System.out.println("Wicket(s) : " + wickets);
		System.out.println("Remaining Wicket(s) : " + r_wickets);
	}
}