https://yoloaeee.tistory.com/122

====================================================================

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Main
{
    // 배열의 값 중 3개를 골라더하는 모든 경우의 수 만들기
    public static void makeNum(int sum, int cnt, int len, int[] arr, boolean[] flag, ArrayList<Integer> list)
    {
        if(cnt==len)
        {
            list.add(sum);
            return;
        }
        
        for(int i=0; i<arr.length; i++)
        {
            if(!flag[i])
            {
                flag[i] = true;
                makeNum(sum+arr[i], cnt+1, 3, arr, flag, list);
                flag[i] = false;
            }
        }
    }
    public static void main(String[] args)
    {
        // 기본 입력값 설정
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        
        // 입력으로 받은 배열의 합 경우의 수를 구하기 위한 설정
        ArrayList<Integer> list = new ArrayList<Integer>();
        boolean[] flag = new boolean[n];
        Arrays.fill(flag, false);
        makeNum(0, 0, 3, arr, flag, list);
        
        // 목표값보다 작은 값들 중에서 가장 큰 값을 출력
        int result = Integer.MIN_VALUE;
        
        for(int d : list)
        {
            if(d<=m)
            {
                result = Math.max(result, d);
            }
        }
        
        System.out.println(result);
    }
}
