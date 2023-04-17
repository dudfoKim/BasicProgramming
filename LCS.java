https://yoloaeee.tistory.com/329

=================================================

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        char[] a = sc.nextLine().toCharArray();
        char[] b = sc.nextLine().toCharArray();
        
        int[][] dp = new int[b.length+1][a.length+1];
        
        for(int i=1; i<=b.length; i++)
        {
         for(int j=1; j<=a.length; j++)
         {
         if(b[i-1]==a[j-1])
         {
         dp[i][j] = dp[i-1][j-1]+1;
         }
         else
         {
         dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
         }
         }
        }
        
        System.out.println(dp[b.length][a.length]);
        sc.close();
    }

}
