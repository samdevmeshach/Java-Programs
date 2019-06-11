import java.io.*; 
import java.util.*; 
  
public class NumSeries01 { 
    public static void PrintNumber(int N, int Original, int K, boolean flag) 
    { 
  
        // print the number 
        System.out.print(N + " "); 
  
        // change flag if number 
        // become negative 
        if (N <= 0) 
            flag = !flag; 
  
        // base condition for 
        // second_case (Adding K) 
        if (N == Original && !flag) 
  
            return; 
  
        // if flag is true 
        // we subtract value until 
        // number is greater then zero 
        if (flag == true) { 
            PrintNumber(N - K, Original, K, flag); 
            return; 
        } 
  
        // second case (Addition ) 
        if (!flag) { 
            PrintNumber(N + K, Original, K, flag); 
            return; 
        } 
    } 
  
    public static void main(String[] args) 
    { 
        Scanner in = new Scanner(System.in);
        int N, K = 5;
        N = in.nextInt();
        PrintNumber(N, N, K, true); 
    } 
} 