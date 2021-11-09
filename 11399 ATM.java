https://yoloaeee.tistory.com/175

=====================================

import java.util.Scanner;
import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        // n개만큼 숫자를 배열에 저장
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        
        // 오름차순으로 정렬
        Arrays.sort(arr);
        
        // 정렬한 배열을 2번씩 돌려서 합구하기
        for(int j=0; j<2; j++)
        {
            for(int i=1; i<n; i++)
            {
                arr[i] = arr[i-1] + arr[i];
            }
        }
        
        System.out.println(arr[n-1]);
        sc.close();
    }
}
