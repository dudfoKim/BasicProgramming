package bronze5_20210319;

import java.util.Scanner;

public class b5_8393
{

    public static int sum(int n)
    {
        if(n==0)
        {
            return 0;
        }
        else
        {
            return n+sum(n-1);
        }
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int result = 0;
        
        System.out.println(sum(a));
    }
}