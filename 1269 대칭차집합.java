https://yoloaeee.tistory.com/215

=======================================

import java.util.Scanner;
import java.util.HashSet;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        HashSet<Integer> set = new HashSet<Integer>();
        
        for(int i=0; i<n+m; i++)
        {
            int input = sc.nextInt();
            
            if(set.contains(input))
            {
                set.remove(input);
            }
            else
            {
                set.add(input);
            }
        }
        
        System.out.println(set.size());
        sc.close();
    }
}

