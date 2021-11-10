https://yoloaeee.tistory.com/177

====================================

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = sc.nextInt();
        int cnt = 0;
        Integer[] coin = new Integer[n];
        
        // n개의 동전을 입력받아 배열값 설정
        for(int i=0; i<n; i++)
        {
            coin[i] = sc.nextInt();
        }
        
        // 동전 값을 기준으로 내림차순 정렬
        Arrays.sort(coin, Collections.reverseOrder());
        
        // Greedy 알고리즘 적용(정렬된 동전 값 기준으로 개수 세기)
        for(int i=0; i<n; i++)
        {
            if((sum/coin[i])>0)
            {
                int temp = sum/coin[i];
                sum -= (coin[i])*temp;
                cnt += temp;
            }
        }
        
        System.out.println(cnt);
        sc.close();
    }
}
