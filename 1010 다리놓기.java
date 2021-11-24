https://yoloaeee.tistory.com/202

===================================

import java.util.Scanner;
import java.math.BigInteger;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.nextInt();
        // overflow 방지를 위한 BigInteger 자료형 선언
        BigInteger[] dp = new BigInteger[31];
        dp[1] = new BigInteger("1");
        
        for(int i=2; i<dp.length; i++)
        {
            dp[i] = new BigInteger(i+"").multiply(dp[i-1]);
        }
        
        for(int i=0; i<t; i++)
        {
            int n = sc.nextInt();
            int m = sc.nextInt();
            
            // case 1 : n==m일 때는 무조건 1
            if(n==m)
            {
                sb.append(1 + "\n");
            }
            // case 2 : mCn : m! / (n! * m-n!)
            else
            {
                sb.append(dp[m].divide(dp[n].multiply(dp[m-n])) + "\n");
            }
        }
        
        System.out.print(sb.toString());
        sc.close();
    }
}
