https://yoloaeee.tistory.com/157

====================================
  
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
                
        // *를 포함한 윗 부분(별 개수 점점 감소)
        for(int i=n-1; i>=0; i--)
        {
            for(int j=n-1; j>i; j--)
            {
                 System.out.print(" ");
            }
            for(int j=0; j(i*2)+1; j++)
            {
                 System.out.print("*");
            }
            
            System.out.println();
        }                
        // *를 포함한 아랫 부분(별 개수 점점 증가)
        for(int i=1; i<n; i++)
        {
            for(int j=i+1; j<n; j++)
            {
                 System.out.print(" ");
            }
            for(int j=0; j(i*2)+1; j++)
            {
                 System.out.print("*");
            }
            
            System.out.println();
        }
        
        sc.close();
    }
}
