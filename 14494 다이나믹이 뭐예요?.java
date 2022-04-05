https://yoloaeee.tistory.com/233

============================================================
  
import java.util.Scanner;

public class Main
{
     public static void main(String[] args)
     {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int m = sc.nextInt();
         final int divide = 1000000007;
         long[][] way = new long[n][m];

         // way 초기화
         for(int i=0; i<n; i++)
         {
              way[i][0] = 1;
         }
         for(int i=0; i<m; i++)
         {
             way[0][i] = 1;
         }
         // dp 실행
         for(int i=1; i<n; i++)
         {
              for(int j=1; j<m; j++)
              {
                 way[i][j] = (way[i-1][j] + way[i][j-1] + way[i-1][j-1])%divide;
              }
         }

         System.out.println(way[n-1][m-1]%divide);
         sc.close();
     }
}
