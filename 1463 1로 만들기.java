https://yoloaeee.tistory.com/241

================================

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int[] arr = new int[x+1];
        arr[1] = 0;
        
        for(int i=2; i<arr.length; i++)
        {
            int result = Integer.MAX_VALUE;
            
            if(i%3==0)
            {
                result = Math.min(arr[i/3]+1, result);
            }
            if(i%2==0)
            {
                result = Math.min(arr[i/2]+1, result);
            }
            
            result = Math.min(arr[i-1]+1, result);
            arr[i] = result;
        }
        
        System.out.println(arr[x]);        
        sc.close();
    }
}
