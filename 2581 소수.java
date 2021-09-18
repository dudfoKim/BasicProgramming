https://yoloaeee.tistory.com/104

========================================
  
  import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        // 최대값 10000으로 설정
        final int len = 10001;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        
        boolean[] arr = new boolean[len];        
        arr[0] = false;
        arr[1] = false;
        
        // 에라스토텔레스의 체 구현
        for(int i=2; i<len; i++)
        {
            arr[i] = true;
        }
        
        for(int i=2; i*i<len; i++)
        {
            if(arr[i])
            {
                for(int j=i*i; j<len; j+=i)
                {
                    arr[j] = false;
                }
            }        
        }
        
        // 입력받은 범위 m~n 중, 소수면 sum에 +해주고, min을 업데이트
        for(int i=m; i<=n; i++)
        {
            if(arr[i])
            {
                sum += i;
                min = Math.min(min, i);
            }
        }
        
        if(sum==0) // 예외처리 : 범위 내 소수가 없으면 합이 0이므로, -1 출력
        {
            System.out.println(-1);
        }
        else
        {
            System.out.println(sum + "\n" + min);
        }
    }
}
