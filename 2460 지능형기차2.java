https://yoloaeee.tistory.com/257


==================================================

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int now = 0;
        int max = Integer.MIN_VALUE;
        
        while(sc.hasNextLine())
        {
            String[] temp = sc.nextLine().split(" ");
            now -= Integer.parseInt(temp[0]);
            now += Integer.parseInt(temp[1]);
            max = Math.max(max, now);
        }
        
        System.out.println(max);
        sc.close();
    }
}
