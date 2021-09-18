https://yoloaeee.tistory.com/103

=======================================================

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if(n<=1)
        {
            System.out.println(0);
            return;
        }
        
        // 최대값 1000으로 설정
        int cnt = 0;
        boolean[] arr = new boolean[1001];        
        arr[0] = false;
        arr[1] = false;
        
        // 에라스토텔레스의 체 구현
        for(int i=2; i<1001; i++)
        {
            arr[i] = true;
        }
        
        for(int i=2; i*i<1001; i++)
        {
            if(arr[i])
            {
                for(int j=i*i; j<1001; j+=i)
                {
                    arr[j] = false;
                }
            }        
        }
        
        // 입력받은 값들이 소수이면 +해서 결과 출력
        for(int i=0; i<n; i++)
        {
            if(arr[sc.nextInt()])
            {
                cnt++;
            }
        }
        
        System.out.println(cnt);
    }
}
