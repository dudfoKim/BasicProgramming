https://yoloaeee.tistory.com/170

====================================================

import java.util.Scanner;

public class Main
{
     public static void main(String[] args)
     {
         Scanner sc = new Scanner(System.in);

         int n = sc.nextInt();
         int k = sc.nextInt();
         int[] dp = new int[n+1];
         dp[0] = dp[1] = 1;

         // DP를 이용한 팩토리얼 구하기
         for(int i=2; i<=n; i++)
         {
             dp[i] = i * dp[i-1];
         }

         System.out.println(dp[n]/(dp[k]*dp[n-k]));
         sc.close();
     }
}
