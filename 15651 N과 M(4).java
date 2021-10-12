https://yoloaeee.tistory.com/137

==============================================================

import java.util.Scanner;

public class Main
{
    static StringBuilder sb = new StringBuilder();
    
    // n개의 숫자 중 m개를 뽑는 사전식 순열
    public static void permutation(String value, int temp, boolean[] visit, int n, int m, int cnt)
    {
        if(cnt==m)
        {
            sb.append(value + "\n");
            return;
        }

        for(int i=1; i<=n ; i++)
        {
            if(i>=temp)
            {
                // 첫 번째 값을 넣을 때와 그 외의 경우를 나눠서 value 설정
                if(cnt==0)
                {
                     permutation(i + "", i, visit, n, m, cnt+1);
                }
                else
                {
                     permutation(value + " " + i, i, visit, n, m, cnt+1);
                }
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        boolean[] visit = new boolean[n];

        permutation("", 0, visit, n, m, 0);
        System.out.println(sb.toString());
        sc.close();
    }
}

 
