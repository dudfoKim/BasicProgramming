https://yoloaeee.tistory.com/228

=======================================================
  
  
import java.util.Scanner;

public class Main
{
     public static void main(String[] args)
     {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int[] arr = new int[n];
         int[] sum = new int[n+1];

         // 입력값 처리 및 초기변수 설정
         for(int i=0; i<n; i++)
         {
              arr[i] = sc.nextInt();
         }

         sum[0] = 0;
         sum[1] = arr[0];

         // 합 배열 실행
         for(int i=2; i<n+1; i++)
         {
              sum[i] = sum[i-1] + arr[i-1]; 
         }

         int m = sc.nextInt();

         for(int i=0; i<m; i++)
         {
              int start = sc.nextInt();
              int end = sc.nextInt();

              System.out.println(sum[end]-sum[start-1]);
         }

         sc.close();
     }
}

