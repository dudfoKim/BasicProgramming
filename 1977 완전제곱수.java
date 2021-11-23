https://yoloaeee.tistory.com/198

==================================


import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int sum = 0;
        int min = Integer.MAX_VALUE;
        
        for(int i=n; i<=m; i++)
        {
            if(Math.ceil(Math.sqrt(i))==Math.floor(Math.sqrt(i)))
            {
                sum += i;
                min = Math.min(min, i);
            }
        }
        
        if(sum==0)
        {
            System.out.println(-1);
            return;
        }
        
        System.out.println(sum + "\n" + min);
        sc.close();
    }
}
