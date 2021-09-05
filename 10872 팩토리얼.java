https://yoloaeee.tistory.com/82

=========================================
  
import java.util.*;

public class Main 
{
    // 재귀를 이용한 팩토리얼 구하기
    public static int facto(int n)
    {
        if(n<=1)
        {
            return 1;
        }
        else
        {
            return n * facto(n-1);
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 1;
        
        // 반복문을 이용한 팩토리얼 구하기
        for(int i=2; i<=n; i++)
        {
            result *= i;
        }
        
        // dp를 이용한 팩토리얼 구하기
        int[] dp = new int[n+1];
        
        if(n<2)
        {
            System.out.println(1);
            return;
        }
        
        dp[0] = dp[1] = 1;
        
        for(int i=2; i<dp.length; i++)
        {
            dp[i] = dp[i-1] * i;
        }

        System.out.println(dp[n]);
        //System.out.println(result);
        //System.out.println(facto(n));
        
        sc.close();
    }
}
