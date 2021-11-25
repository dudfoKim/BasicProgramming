https://yoloaeee.tistory.com/205

====================================

import java.util.Scanner;

public class Main
{
    // 결과값 전역변수 선언
    static int max = Integer.MIN_VALUE;
    
    // 순열을 이용한 절대값 구하기용 배열(arr->abs) 만들기
    public static void makeAbs(int[]arr, int[] abs, boolean[] visit, int now, int n)
    {
        // 절대값 배열이 꽉차면 결과를 계산한 후 리턴
        if(now==n)
        {
            int result = 0;
            
            for(int i=1; i<n; i++)
            {
                result += Math.abs(abs[i]-abs[i-1]);
            }
            
            // max와 비교해서 큰 값을 저장
            max = Math.max(max, result);
            return;
        }
        
        for(int i=0; i<n; i++)
        {
            if(!visit[i])
            {
                visit[i] = true;
                abs[now] = arr[i];
                makeAbs(arr, abs, visit, now+1, n);
                visit[i] = false;
                abs[now] = 0;
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] abs = new int[n];
        boolean[] visit = new boolean[n];
        
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        
        makeAbs(arr, abs, visit, 0, n);
        System.out.println(max);
        sc.close();
    }
}
