https://yoloaeee.tistory.com/197

==================================

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long cnt = 0;
        int[] test = new int[n];
        
        for(int i=0; i<n; i++)
        {
            test[i] = sc.nextInt();
        }
        
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        for(int i=0; i<n; i++)
        {
            // 총감독관은 무조건 1명 필요
            test[i] -= b;
            cnt++;
            
            // b명을 빼고도 나머지 인원이 남아있을 때는 부감독관에 c명만큼 배정
            if(test[i]>=0)
            {
                long temp = test[i]/c;
                cnt += temp;
                test[i] -= c*temp;
            
                if(test[i]!=0)
                {
                    cnt++;
                }
            }
        }
        
        System.out.println(cnt);
        sc.close();
    }
}
