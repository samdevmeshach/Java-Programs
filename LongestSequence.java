import java.util.*; 

public class LongestSequence 
{ 
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in); 
        System.out.println("Enter Array Size : ");
        int N = scan.nextInt();
        System.out.println("Enter Array Elements : ");
        int maxSequenceLen = 0;  // longest sequence ever
        int curSequenceLen = 0;  // when starting new sequence, reset to 1 (count the reset #)
        int last = 0;

        for(int i = 0; i < N; i++) 
        {
            int cur = scan.nextInt();
            if ((last+1) == cur)
            {
                ++curSequenceLen;
            }
            else
            {
                curSequenceLen = 1;
            }
            if (curSequenceLen > maxSequenceLen)
            {
                maxSequenceLen = curSequenceLen;
            }
            last = cur;
        }
        System.out.println(maxSequenceLen);
    } 
}