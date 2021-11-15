https://yoloaeee.tistory.com/186

=======================≈=========

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        
        // 입력받은 n개의 값에 대해 DP 실행을 위한 복사
        int[] dp = arr.clone();
        
        for(int i=1; i<n; i++)
        {
            dp[i] = dp[i-1] + arr[i];
        }
        
        for(int i=0; i<m; i++)
        {
            int start = sc.nextInt()-1;
            int end = sc.nextInt()-1;
            
            // case 1 : 시작과 끝의 인덱스가 같으면 부분합이 필요없으므로 arr값을 참조
            if(start==end)
            {
                sb.append(arr[start] + "\n");
            }
            else
            {
                // case 2-1 : 시작과 끝이 같지 않고, 시작이 첫 번째 인덱스면 끝 인덱스에 대한 단순 부분합
                if(start==0)
                {
                    sb.append(dp[end] + "\n");
                }
                // case 2-2 : 시작과 끝이 같지 않고, 시작 인덱스도 0이 아니면 DP 배열을 이용한 합 구하기
                else
                {
                    sb.append((dp[end]-dp[start-1]) + "\n");
                }
            }
        }
        
        System.out.println(sb.toString());
        sc.close();
    }
}
