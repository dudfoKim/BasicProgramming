https://yoloaeee.tistory.com/147

=======================================
  
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        
        int k = sc.nextInt();
        
        // 배열의 인덱스 설정을 위해 -1 한 후 배열값을 더해준다.
        for(int i=0; i<k; i++)
        {
            int sum = 0;
            int startX = sc.nextInt()-1;
            int startY = sc.nextInt()-1;
            int endX = sc.nextInt()-1;
            int endY = sc.nextInt()-1;
            
            for(int a=startX; a<=endX; a++)
            {
                for(int b=startY; b<=endY; b++)
                {
                    sum += arr[a][b];
                }
            }
            
            System.out.println(sum);
        }

        sc.close();
    }
}
