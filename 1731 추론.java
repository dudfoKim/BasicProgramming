https://yoloaeee.tistory.com/290

====================================
  
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        
        int result = arr[arr.length-1];
        
        if(arr[2]-arr[1]==arr[1]-arr[0])
        {
            System.out.println(result+arr[arr.length-2]-arr[arr.length-3]);
            return;
        }
        else
        {
            System.out.println(result*(arr[arr.length-2]/arr[arr.length-3]));
            return;
        }
    }
}
