https://yoloaeee.tistory.com/134

============================================================================

import java.util.Scanner;

public class Main
{
     // n개의 숫자 중 m개를 뽑는 사전식 순열
     public static void permutation(String value, boolean[] visit, int n, int m, int cnt)
     {
         if(cnt==m)
          {
             System.out.println(value);
             return;
             }

         for(int i=1; i<=n ; i++)
         {
             if(!visit[i-1])
             {
                 visit[i-1] = true;

                // 첫 번째 값을 넣을 때와 그 외의 경우를 나눠서 value 설정
                 if(cnt==0)
                 {
                     permutation(i + "", visit, n, m, cnt+1);
                 }
                 else
                 {
                     permutation(value + " " + i, visit, n, m, cnt+1);
                 }

                 visit[i-1] = false;
             }
         }
     }
     public static void main(String[] args)
     {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int m = sc.nextInt();

         boolean[] visit = new boolean[n];

         permutation("", visit, n, m, 0);
         sc.close();
     }
}

 
