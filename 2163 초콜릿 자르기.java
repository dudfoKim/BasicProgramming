https://yoloaeee.tistory.com/196

====================================

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        // case 1 : 1x1 크기일 때
        if(n==1 && m==1)
        {
            System.out.println(0);
        }
        // case 2 : n, m 둘 중 하나가 1일 때
        else if(n==1 || m==1)
        {
            System.out.println((Math.max(n, m)-1));
        }
        // case 3 : n, m 모두 1이 아닌 일반적인 케이스일때
        else
        {
            System.out.println((n-1)+((m-1)*n));
        }
        
        sc.close();
    }
}
