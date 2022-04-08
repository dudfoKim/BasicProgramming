https://yoloaeee.tistory.com/236

=================================

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] fibo = new long[116];
        fibo[0] = fibo[1] = fibo[2] = 1;
        
        for(int i=3; i<n; i++)
        {
            fibo[i] = fibo[i-3] + fibo[i-1];
        }
        
        System.out.println(fibo[n-1]);        
        sc.close();
    }
}
