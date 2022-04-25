https://yoloaeee.tistory.com/245

===========================================
  
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        final long div = 1000000009;
        long[] dp = new long[1000000+1];
     dp[1] = 1;
     dp[2] = 2;
     dp[3] = 4;
    
        // dp[4] = dp[3] + dp[2] + dp[1]
     for(int j=4; j<dp.length; j++)
     {
     dp[j] = (dp[j-3]%div) + (dp[j-2]%div) + (dp[j-1]%div);
     dp[j] %= div;
     }
    
        for(int i=0; i<t; i++)
        {
         int n = sc.nextInt();
         System.out.println(dp[n]);
        }
        
        sc.close();
    }
}
