https://yoloaeee.tistory.com/79

---------------------------------------------------------------

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String a = sc.next();
        long sum = 0;
        
        for(int i=0; i<n; i++)
        {
            sum += (long)Integer.parseInt(a.charAt(i)+"");
        }
        
        System.out.println(sum);
    }
}
