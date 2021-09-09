https://yoloaeee.tistory.com/m/92

================================

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int sugar = sc.nextInt();
        
        if(sugar<5)
        {
            if(sugar==3 || sugar==5)
            {
                System.out.println(1);
                return;
            }
            else
            {
                System.out.println(-1);
                return;
            }
        }
        
        int[] dp = new int[sugar+1];
        dp[3] = 1;
        dp[5] = 1;
        
        for(int i=6; i<=sugar; i++)
        {
            if(i%5==0)
            {
                dp[i] = dp[i-5] + 1;
            }
            else if(i%3==0)
            {
                dp[i] = dp[i-3] + 1;
            }
            else
            {
                if(dp[i-3]!=0 && dp[i-5]!=0)
                {
                    dp[i] = Math.min(dp[i-5], dp[i-3]) + 1;
                }
            }
        }
        
        System.out.println(dp[sugar]==0?-1:dp[sugar]);
    }
}
