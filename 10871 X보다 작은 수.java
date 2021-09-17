https://yoloaeee.tistory.com/102

================================================
  
import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i=0; i<n; i++)
        {
            int temp = sc.nextInt();
            
            if(temp<x)
            {
                System.out.print(temp + " ");
            }
        }
    }
}
