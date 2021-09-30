
https://yoloaeee.tistory.com/124

====================================================================
  
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        // 예외처리 : 숫자 1개만 입력했을 경우
        if(n==1)
        {
            int print = sc.nextInt();
            
            for(int i=0; i<3; i++)
            {
                System.out.println(print);
            }
            
            // 범위는 무조건 0으로 출력
            System.out.println(0);
            return;
        }
        
        int[] arr = new int[n];
        int[] cnt = new int[4000*2+1];
        double sansul = 0.0;
        
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
            sansul += arr[i]; // 산술평균 구하기
            cnt[arr[i]+4000]++; // 최빈값 구하기
        }
        
        // 1. 산술평균
        System.out.println((int)Math.round((double)(sansul/n)));
        
        // 2. 중앙값
        Arrays.sort(arr);
        System.out.println(arr[n/2]);
        
        // 3. 최빈값
        int max = Integer.MIN_VALUE;
        ArrayList<Integer> index = new ArrayList<Integer>();
        
        for(int i=0; i<cnt.length; i++)
        {
            max = Math.max(max, cnt[i]);
        }
        
        for(int i=0; i<cnt.length; i++)
        {
            if(max==cnt[i])
            {
                index.add(i);
            }
        }
        
        if(index.size()==1) // 3-1. 최빈값이 하나만 있을 경우, 리스트에는 값 1개
        {
            System.out.println(index.get(0)-4000);
        }
        else // 3-2. 최빈값이 여러 개 있을 경우, 오름차순 정렬한 후 2번째 값 출력
        {
         Collections.sort(index);
            System.out.println(index.get(1)-4000);
        }
        
        // 4. 범위
        System.out.println(Math.abs(arr[arr.length-1]-arr[0]));
        sc.close();
    }
}
