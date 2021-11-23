https://yoloaeee.tistory.com/199

==================================

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.nextInt();
        
        for(int i=0; i<t; i++)
        {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long x = Math.max(a, b);
            long y = Math.min(a, b);
            
            while(y!=0)
            {
                long temp = x;
                x = y;
                y = temp%x;
            }
            
            sb.append((a*b)/x + "\n");
        }
        
        System.out.print(sb.toString());
        sc.close();
    }
}
