https://yoloaeee.tistory.com/229

========================================
  
  
import java.util.Scanner;

public class Main
{
     public static void main(String[] args)
     {
         Scanner sc = new Scanner(System.in);
         // 입력값 처리 및 변수 초기화
         int n = sc.nextInt();
         int m = sc.nextInt();
         int max = 100;
         int[][] picture = new int[100][100];
         int cnt = 0;

         for(int i=0; i< n; i++)
         {
              int startX = sc.nextInt();
              int startY = sc.nextInt();
              int endX = sc.nextInt();
              int endY = sc.nextInt();
            
              // 그림이 가려진 영역처리(인덱스 유의)
              for(int j=startY-1; j<endY; j++)
              {
                   for(int k=startX-1; k<endX; k++)
                   {
                        picture[j][k]++;
                   }
              }
         }

         for(int i=0; i<100; i++)
         {
              for(int j=0; j<100; j++)
              {
                   if(picture[i][j]>m)
                   {
                        cnt++;
                   }
              }
         }

         System.out.println(cnt);
         sc.close();
     }
}
