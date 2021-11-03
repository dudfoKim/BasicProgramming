https://yoloaeee.tistory.com/163

====================================

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int now = 0;
        int cnt = 0;
        int[] milk = new int[n];
        
        // n개의 우유 가게에 대한 종류값을 설정
        for(int i=0; i<n; i++)
        {
            milk[i] = sc.nextInt();
        }
        
        // 0~2까지 순차적으로 체크해서 조건이 맞으면 cnt++
        for(int i=0; i<n; i++)
        {
            if(now==milk[i])
            {
                cnt++;
                now++;
                
                if(now==3)
                {
                    now = 0;
                }
            }
        }
        
        System.out.println(cnt);
        sc.close();
    }
}
