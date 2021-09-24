https://yoloaeee.tistory.com/114

=================================

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i=0; i<t; i++)
        {
            int start = sc.nextInt();
            int end = sc.nextInt();
            end -= start;
            start = 0;
            
            int max = (int)Math.round(Math.sqrt(end));
            
            if(end>Math.pow(max, 2))
            {
                System.out.println((int)max * 2);
            }
            else
            {
                System.out.println((int)max * 2 - 1);
            }
        }
    }
}
