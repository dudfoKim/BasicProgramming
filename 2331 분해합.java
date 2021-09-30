https://yoloaeee.tistory.com/123

====================================================================
  
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        for(int i=1; i<=n; i++)
        {
            sum = i;
            int index = i;
            
            // index + index의 각 자리수를 더한 후 비교
            while(index!=0)
            {
                sum += index%10;
                index /= 10;
            }
            
            // 값을 찾으면 바로 그 index를 출력하고 종료
            if(sum==n)
         {
                System.out.println(i);
         return;
         }
        }
        
        // 값을 못 찾았을때는 0을 출력
        System.out.println(0);
    }
}

